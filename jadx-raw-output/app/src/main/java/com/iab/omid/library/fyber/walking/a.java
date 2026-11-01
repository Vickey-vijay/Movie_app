package com.iab.omid.library.fyber.walking;

import android.view.View;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21565a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0223a> f21566b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21567c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21568d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21569e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21570f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21571g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21572h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21573i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21574j;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.a$a, reason: collision with other inner class name */
    public static class C0223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21576b = new ArrayList<>();

        public C0223a(e eVar, String str) {
            this.f21575a = eVar;
            a(str);
        }

        public e a() {
            return this.f21575a;
        }

        public void a(String str) {
            this.f21576b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21576b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21573i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21573i.containsKey(view)) {
            return this.f21573i.get(view);
        }
        Map<View, Boolean> map = this.f21573i;
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
        this.f21568d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.fyber.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0223a c0223a = this.f21566b.get(view);
        if (c0223a != null) {
            c0223a.a(aVar.c());
        } else {
            this.f21566b.put(view, new C0223a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f21567c.get(str);
    }

    public void a() {
        this.f21565a.clear();
        this.f21566b.clear();
        this.f21567c.clear();
        this.f21568d.clear();
        this.f21569e.clear();
        this.f21570f.clear();
        this.f21571g.clear();
        this.f21574j = false;
        this.f21572h.clear();
    }

    public C0223a b(View view) {
        C0223a c0223a = this.f21566b.get(view);
        if (c0223a != null) {
            this.f21566b.remove(view);
        }
        return c0223a;
    }

    public String b(String str) {
        return this.f21571g.get(str);
    }

    public HashSet<String> b() {
        return this.f21570f;
    }

    public String c(View view) {
        if (this.f21565a.size() == 0) {
            return null;
        }
        String str = this.f21565a.get(view);
        if (str != null) {
            this.f21565a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f21569e;
    }

    public boolean c(String str) {
        return this.f21572h.contains(str);
    }

    public c d(View view) {
        if (this.f21568d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21574j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21574j = true;
    }

    public void e() {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f21572h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f21569e.add(strC);
                            this.f21565a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21570f.add(strC);
                            this.f21567c.put(strC, viewE);
                            this.f21571g.put(strC, strA);
                        }
                    } else {
                        this.f21570f.add(strC);
                        this.f21571g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f21573i.containsKey(view)) {
            return true;
        }
        this.f21573i.put(view, Boolean.TRUE);
        return false;
    }
}
