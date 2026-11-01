package com.iab.omid.library.appodeal.walking;

import android.view.View;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21179a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0212a> f21180b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21181c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21182d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21183e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21184f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21185g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21186h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21187i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21188j;

    /* JADX INFO: renamed from: com.iab.omid.library.appodeal.walking.a$a, reason: collision with other inner class name */
    public static class C0212a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21190b = new ArrayList<>();

        public C0212a(e eVar, String str) {
            this.f21189a = eVar;
            a(str);
        }

        public e a() {
            return this.f21189a;
        }

        public void a(String str) {
            this.f21190b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21190b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21187i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21187i.containsKey(view)) {
            return this.f21187i.get(view);
        }
        Map<View, Boolean> map = this.f21187i;
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
        this.f21182d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.appodeal.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0212a c0212a = this.f21180b.get(view);
        if (c0212a != null) {
            c0212a.a(aVar.c());
        } else {
            this.f21180b.put(view, new C0212a(eVar, aVar.c()));
        }
    }

    public View a(String str) {
        return this.f21181c.get(str);
    }

    public void a() {
        this.f21179a.clear();
        this.f21180b.clear();
        this.f21181c.clear();
        this.f21182d.clear();
        this.f21183e.clear();
        this.f21184f.clear();
        this.f21185g.clear();
        this.f21188j = false;
        this.f21186h.clear();
    }

    public C0212a b(View view) {
        C0212a c0212a = this.f21180b.get(view);
        if (c0212a != null) {
            this.f21180b.remove(view);
        }
        return c0212a;
    }

    public String b(String str) {
        return this.f21185g.get(str);
    }

    public HashSet<String> b() {
        return this.f21184f;
    }

    public String c(View view) {
        if (this.f21179a.size() == 0) {
            return null;
        }
        String str = this.f21179a.get(view);
        if (str != null) {
            this.f21179a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f21183e;
    }

    public boolean c(String str) {
        return this.f21186h.contains(str);
    }

    public c d(View view) {
        if (this.f21182d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21188j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21188j = true;
    }

    public void e() {
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.appodeal.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f21186h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f21183e.add(strC);
                            this.f21179a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21184f.add(strC);
                            this.f21181c.put(strC, viewE);
                            this.f21185g.put(strC, strA);
                        }
                    } else {
                        this.f21184f.add(strC);
                        this.f21185g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f21187i.containsKey(view)) {
            return true;
        }
        this.f21187i.put(view, Boolean.TRUE);
        return false;
    }
}
