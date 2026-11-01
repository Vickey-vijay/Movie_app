package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f22245a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0245a> f22246b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f22247c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f22248d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f22249e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f22250f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f22251g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f22252h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f22253i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22254j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0245a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f22255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f22256b = new ArrayList<>();

        public C0245a(e eVar, String str) {
            this.f22255a = eVar;
            a(str);
        }

        public e a() {
            return this.f22255a;
        }

        public void a(String str) {
            this.f22256b.add(str);
        }

        public ArrayList<String> b() {
            return this.f22256b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f22253i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f22253i.containsKey(view)) {
            return this.f22253i.get(view);
        }
        Map<View, Boolean> map = this.f22253i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
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
        this.f22248d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0245a c0245a = this.f22246b.get(view);
        if (c0245a != null) {
            c0245a.a(aVar.c());
        } else {
            this.f22246b.put(view, new C0245a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f22247c.get(str);
    }

    public void a() {
        this.f22245a.clear();
        this.f22246b.clear();
        this.f22247c.clear();
        this.f22248d.clear();
        this.f22249e.clear();
        this.f22250f.clear();
        this.f22251g.clear();
        this.f22254j = false;
        this.f22252h.clear();
    }

    public C0245a b(View view) {
        C0245a c0245a = this.f22246b.get(view);
        if (c0245a != null) {
            this.f22246b.remove(view);
        }
        return c0245a;
    }

    public String b(String str) {
        return this.f22251g.get(str);
    }

    public HashSet<String> b() {
        return this.f22250f;
    }

    public String c(View view) {
        if (this.f22245a.size() == 0) {
            return null;
        }
        String str = this.f22245a.get(view);
        if (str != null) {
            this.f22245a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f22249e;
    }

    public boolean c(String str) {
        return this.f22252h.contains(str);
    }

    public c d(View view) {
        if (this.f22248d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f22254j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f22254j = true;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f22252h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f22249e.add(strC);
                            this.f22245a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f22250f.add(strC);
                            this.f22247c.put(strC, viewE);
                            this.f22251g.put(strC, strA);
                        }
                    } else {
                        this.f22250f.add(strC);
                        this.f22251g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f22253i.containsKey(view)) {
            return true;
        }
        this.f22253i.put(view, Boolean.TRUE);
        return false;
    }
}
