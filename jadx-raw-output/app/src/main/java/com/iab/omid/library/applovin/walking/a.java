package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21044a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0208a> f21045b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21046c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21047d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21048e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21049f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21050g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21051h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21052i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21053j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0208a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21055b = new ArrayList<>();

        public C0208a(e eVar, String str) {
            this.f21054a = eVar;
            a(str);
        }

        public e a() {
            return this.f21054a;
        }

        public void a(String str) {
            this.f21055b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21055b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21052i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21052i.containsKey(view)) {
            return this.f21052i.get(view);
        }
        Map<View, Boolean> map = this.f21052i;
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
        this.f21047d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0208a c0208a = this.f21045b.get(view);
        if (c0208a != null) {
            c0208a.a(aVar.c());
        } else {
            this.f21045b.put(view, new C0208a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f21046c.get(str);
    }

    public void a() {
        this.f21044a.clear();
        this.f21045b.clear();
        this.f21046c.clear();
        this.f21047d.clear();
        this.f21048e.clear();
        this.f21049f.clear();
        this.f21050g.clear();
        this.f21053j = false;
        this.f21051h.clear();
    }

    public C0208a b(View view) {
        C0208a c0208a = this.f21045b.get(view);
        if (c0208a != null) {
            this.f21045b.remove(view);
        }
        return c0208a;
    }

    public String b(String str) {
        return this.f21050g.get(str);
    }

    public HashSet<String> b() {
        return this.f21049f;
    }

    public String c(View view) {
        if (this.f21044a.size() == 0) {
            return null;
        }
        String str = this.f21044a.get(view);
        if (str != null) {
            this.f21044a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f21048e;
    }

    public boolean c(String str) {
        return this.f21051h.contains(str);
    }

    public c d(View view) {
        if (this.f21047d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21053j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21053j = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f21051h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f21048e.add(strC);
                            this.f21044a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21049f.add(strC);
                            this.f21046c.put(strC, viewE);
                            this.f21050g.put(strC, strA);
                        }
                    } else {
                        this.f21049f.add(strC);
                        this.f21050g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f21052i.containsKey(view)) {
            return true;
        }
        this.f21052i.put(view, Boolean.TRUE);
        return false;
    }
}
