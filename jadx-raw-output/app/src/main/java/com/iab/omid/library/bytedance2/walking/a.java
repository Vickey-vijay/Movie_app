package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21430a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0219a> f21431b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21432c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21433d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21434e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21435f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21436g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f21437h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21438i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0219a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21440b = new ArrayList<>();

        public C0219a(e eVar, String str) {
            this.f21439a = eVar;
            a(str);
        }

        public e a() {
            return this.f21439a;
        }

        public void a(String str) {
            this.f21440b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21440b;
        }
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f21433d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0219a c0219a = this.f21431b.get(view);
        if (c0219a != null) {
            c0219a.a(aVar.getAdSessionId());
        } else {
            this.f21431b.put(view, new C0219a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f21437h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21437h.containsKey(view)) {
            return this.f21437h.get(view);
        }
        Map<View, Boolean> map = this.f21437h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f21432c.get(str);
    }

    public void a() {
        this.f21430a.clear();
        this.f21431b.clear();
        this.f21432c.clear();
        this.f21433d.clear();
        this.f21434e.clear();
        this.f21435f.clear();
        this.f21436g.clear();
        this.f21438i = false;
    }

    public String b(String str) {
        return this.f21436g.get(str);
    }

    public HashSet<String> b() {
        return this.f21435f;
    }

    public C0219a c(View view) {
        C0219a c0219a = this.f21431b.get(view);
        if (c0219a != null) {
            this.f21431b.remove(view);
        }
        return c0219a;
    }

    public HashSet<String> c() {
        return this.f21434e;
    }

    public String d(View view) {
        if (this.f21430a.size() == 0) {
            return null;
        }
        String str = this.f21430a.get(view);
        if (str != null) {
            this.f21430a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f21438i = true;
    }

    public c e(View view) {
        if (this.f21433d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21438i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f21434e.add(adSessionId);
                            this.f21430a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21435f.add(adSessionId);
                            this.f21432c.put(adSessionId, viewC);
                            this.f21436g.put(adSessionId, strA);
                        }
                    } else {
                        this.f21435f.add(adSessionId);
                        this.f21436g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (!this.f21437h.containsKey(view)) {
            return true;
        }
        this.f21437h.put(view, Boolean.TRUE);
        return false;
    }
}
