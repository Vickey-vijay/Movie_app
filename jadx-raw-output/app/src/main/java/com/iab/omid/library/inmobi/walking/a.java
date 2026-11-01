package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21706a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0228a> f21707b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21708c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21709d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21710e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21711f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21712g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21713h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21714i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21715j;

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0228a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21717b = new ArrayList<>();

        public C0228a(e eVar, String str) {
            this.f21716a = eVar;
            a(str);
        }

        public e a() {
            return this.f21716a;
        }

        public void a(String str) {
            this.f21717b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21717b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21714i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21714i.containsKey(view)) {
            return this.f21714i.get(view);
        }
        Map<View, Boolean> map = this.f21714i;
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
        this.f21709d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0228a c0228a = this.f21707b.get(view);
        if (c0228a != null) {
            c0228a.a(aVar.c());
        } else {
            this.f21707b.put(view, new C0228a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f21708c.get(str);
    }

    public void a() {
        this.f21706a.clear();
        this.f21707b.clear();
        this.f21708c.clear();
        this.f21709d.clear();
        this.f21710e.clear();
        this.f21711f.clear();
        this.f21712g.clear();
        this.f21715j = false;
        this.f21713h.clear();
    }

    public C0228a b(View view) {
        C0228a c0228a = this.f21707b.get(view);
        if (c0228a != null) {
            this.f21707b.remove(view);
        }
        return c0228a;
    }

    public String b(String str) {
        return this.f21712g.get(str);
    }

    public HashSet<String> b() {
        return this.f21711f;
    }

    public String c(View view) {
        if (this.f21706a.size() == 0) {
            return null;
        }
        String str = this.f21706a.get(view);
        if (str != null) {
            this.f21706a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f21710e;
    }

    public boolean c(String str) {
        return this.f21713h.contains(str);
    }

    public c d(View view) {
        if (this.f21709d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21715j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21715j = true;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f21713h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f21710e.add(strC);
                            this.f21706a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21711f.add(strC);
                            this.f21708c.put(strC, viewE);
                            this.f21712g.put(strC, strA);
                        }
                    } else {
                        this.f21711f.add(strC);
                        this.f21712g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f21714i.containsKey(view)) {
            return true;
        }
        this.f21714i.put(view, Boolean.TRUE);
        return false;
    }
}
