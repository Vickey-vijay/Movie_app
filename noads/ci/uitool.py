#!/usr/bin/env python3
"""Tiny uiautomator driver for the emulator walk. usage:
   uitool.py texts                 print visible text (reading order)
   uitool.py tap <text> [exact]    tap the first node whose text contains <text>
   uitool.py rowy <text>           print the y-centre of the first node containing <text>
   uitool.py swipe-row <y>         swipe left along that row (scrolls a horizontal tab strip)
   uitool.py tap-card <below-y>    tap the first big clickable card below <below-y>
   uitool.py nodes [limit]         print structure: y,x  class  clickable  resource-id  text
   uitool.py tap-edit              tap the first EditText (search box)
   uitool.py tap-result <below-y>  tap the first plausible result title below <below-y>
"""
import re, subprocess, sys, xml.etree.ElementTree as ET

def adb(*a, capture=True):
    return subprocess.run(["adb", *a], capture_output=capture, text=True).stdout

def dump():
    adb("shell", "uiautomator", "dump", "/sdcard/ui.xml")
    return ET.fromstring(adb("exec-out", "cat", "/sdcard/ui.xml"))

def bounds(n):
    m = re.match(r"\[(\d+),(\d+)\]\[(\d+),(\d+)\]", n.get("bounds", ""))
    return tuple(map(int, m.groups())) if m else None

def nodes():
    out = []
    for n in dump().iter("node"):
        b = bounds(n)
        if b: out.append((n, b))
    return out

def screen():
    ns = nodes()
    return max(b[2] for _, b in ns), max(b[3] for _, b in ns)

def label(n): return (n.get("text") or n.get("content-desc") or "").strip()

cmd = sys.argv[1]
if cmd == "texts":
    seen = []
    for n, b in sorted(nodes(), key=lambda t: (t[1][1] // 40, t[1][0])):
        t = label(n)
        if t and t not in seen: seen.append(t)
    print(" | ".join(seen[:60]) if seen else "(no text)")
elif cmd in ("tap", "rowy"):
    want = sys.argv[2]; exact = len(sys.argv) > 3
    for n, b in nodes():
        t = label(n)
        if t and ((t == want) if exact else (want.lower() in t.lower())):
            x, y = (b[0] + b[2]) // 2, (b[1] + b[3]) // 2
            if cmd == "rowy": print(y)
            else: adb("shell", "input", "tap", str(x), str(y)); print(f"tapped '{t}' at {x},{y}")
            break
    else:
        print(f"(not found: {want})"); sys.exit(1)
elif cmd == "swipe-row":
    y = sys.argv[2]; w, _ = screen()
    adb("shell", "input", "swipe", str(int(w * 0.85)), y, str(int(w * 0.10)), y, "350")
elif cmd == "tap-card":
    below = int(sys.argv[2]); w, h = screen(); best = None
    for n, b in nodes():
        bw, bh = b[2] - b[0], b[3] - b[1]
        if n.get("clickable") == "true" and b[1] > below and 0.15 * w < bw < 0.7 * w and bh > 0.5 * bw:
            if best is None or (b[1], b[0]) < (best[1], best[0]): best = b
    if best is None: best = (w // 3, int(h * 0.35), w // 3 + 10, int(h * 0.35) + 10)
    x, y = (best[0] + best[2]) // 2, (best[1] + best[3]) // 2
    adb("shell", "input", "tap", str(x), str(y)); print(f"tapped card at {x},{y}")

elif cmd == "nodes":
    limit = int(sys.argv[2]) if len(sys.argv) > 2 else 60; k = 0
    for n, b in sorted(nodes(), key=lambda t: (t[1][1], t[1][0])):
        t = label(n); rid = (n.get("resource-id") or "").split("/")[-1]
        if not (t or n.get("clickable") == "true"): continue
        print(f"{b[1]:>5},{b[0]:<4} {n.get('class','').split('.')[-1]:<14} {'CLICK' if n.get('clickable')=='true' else '     '} {rid:<22} {t[:46]}")
        k += 1
        if k >= limit: break
elif cmd == "tap-edit":
    for n, b in nodes():
        if n.get("class", "").endswith("EditText"):
            x, y = (b[0] + b[2]) // 2, (b[1] + b[3]) // 2
            adb("shell", "input", "tap", str(x), str(y)); print(f"tapped EditText at {x},{y}"); break
    else:
        print("(no EditText)"); sys.exit(1)
elif cmd == "tap-result":
    below = int(sys.argv[2]); skip = re.compile(r"^(search|cancel|clear|history|hot|all|movies?|tv shows|anime|home|streaming|categories|promotion|me|ok)$", re.I)
    for n, b in sorted(nodes(), key=lambda t: (t[1][1], t[1][0])):
        t = label(n)
        if b[1] > below and len(t) >= 4 and not skip.match(t) and n.get("class", "").endswith("TextView"):
            x, y = (b[0] + b[2]) // 2, (b[1] + b[3]) // 2
            adb("shell", "input", "tap", str(x), str(y)); print(f"tapped result '{t}' at {x},{y}"); break
    else:
        print("(no result found)"); sys.exit(1)
