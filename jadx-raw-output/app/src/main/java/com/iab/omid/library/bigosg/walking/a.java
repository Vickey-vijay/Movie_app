package com.iab.omid.library.bigosg.walking;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21302a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0215a> f21303b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21304c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21305d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21306e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21307f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21308g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21309h;

    /* JADX INFO: renamed from: com.iab.omid.library.bigosg.walking.a$a, reason: collision with other inner class name */
    public static class C0215a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bigosg.b.c f21310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21311b = new ArrayList<>();

        public C0215a(com.iab.omid.library.bigosg.b.c cVar, String str) {
            this.f21310a = cVar;
            a(str);
        }

        public com.iab.omid.library.bigosg.b.c a() {
            return this.f21310a;
        }

        public void a(String str) {
            this.f21311b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21311b;
        }
    }

    private void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        Iterator<com.iab.omid.library.bigosg.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bigosg.b.c cVar, com.iab.omid.library.bigosg.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0215a c0215a = this.f21303b.get(view);
        if (c0215a != null) {
            c0215a.a(aVar.getAdSessionId());
        } else {
            this.f21303b.put(view, new C0215a(cVar, aVar.getAdSessionId()));
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f21305d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f21302a.size() == 0) {
            return null;
        }
        String str = this.f21302a.get(view);
        if (str != null) {
            this.f21302a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f21308g.get(str);
    }

    public HashSet<String> a() {
        return this.f21306e;
    }

    public View b(String str) {
        return this.f21304c.get(str);
    }

    public C0215a b(View view) {
        C0215a c0215a = this.f21303b.get(view);
        if (c0215a != null) {
            this.f21303b.remove(view);
        }
        return c0215a;
    }

    public HashSet<String> b() {
        return this.f21307f;
    }

    public c c(View view) {
        if (this.f21305d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21309h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f21306e.add(adSessionId);
                            this.f21302a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f21307f.add(adSessionId);
                            this.f21304c.put(adSessionId, viewD);
                            this.f21308g.put(adSessionId, strD);
                        }
                    } else {
                        this.f21307f.add(adSessionId);
                        this.f21308g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f21302a.clear();
        this.f21303b.clear();
        this.f21304c.clear();
        this.f21305d.clear();
        this.f21306e.clear();
        this.f21307f.clear();
        this.f21308g.clear();
        this.f21309h = false;
    }

    public void e() {
        this.f21309h = true;
    }
}
