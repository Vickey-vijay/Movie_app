package yads;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class tv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f83204a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f83205b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f83206c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f83207d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f83208e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f83209f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f83210g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f83211h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakHashMap f83212i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83213j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        nw3 nw3Var = nw3.f80846c;
        if (nw3Var != null) {
            for (wv3 wv3Var : Collections.unmodifiableCollection(nw3Var.f80848b)) {
                View view = (View) wv3Var.f84354d.get();
                if (wv3Var.f84356f && !wv3Var.f84357g) {
                    String str = wv3Var.f84358h;
                    if (view != null) {
                        boolean zC = hx3.c(view);
                        if (zC) {
                            this.f83211h.add(str);
                        }
                        String str2 = null;
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.f83212i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.f83212i.containsKey(view)) {
                                bool = (Boolean) this.f83212i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.f83212i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zC) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.f83207d.addAll(hashSet);
                                        break;
                                    }
                                    String strA = hx3.a(view2);
                                    if (strA != null) {
                                        str2 = strA;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str2 = "noWindowFocus";
                            }
                        } else {
                            str2 = "notAttached";
                        }
                        if (str2 == null) {
                            this.f83208e.add(str);
                            this.f83204a.put(view, str);
                            for (xw3 xw3Var : wv3Var.f84353c.f76841a) {
                                View view3 = (View) xw3Var.f84729a.get();
                                if (view3 != null) {
                                    mv3 mv3Var = (mv3) this.f83205b.get(view3);
                                    if (mv3Var != null) {
                                        mv3Var.f80404b.add(wv3Var.f84358h);
                                    } else {
                                        this.f83205b.put(view3, new mv3(xw3Var, wv3Var.f84358h));
                                    }
                                }
                            }
                        } else if (str2 != "noWindowFocus") {
                            this.f83209f.add(str);
                            this.f83206c.put(str, view);
                            this.f83210g.put(str, str2);
                        }
                    } else {
                        this.f83209f.add(str);
                        this.f83210g.put(str, "noAdView");
                    }
                }
            }
        }
    }
}
