package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21976a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0236a> f21977b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21978c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21979d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21980e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21981f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21982g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21983h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21984i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21985j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0236a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21987b = new ArrayList<>();

        public C0236a(e eVar, String str) {
            this.f21986a = eVar;
            a(str);
        }

        public e a() {
            return this.f21986a;
        }

        public void a(String str) {
            this.f21987b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21987b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21984i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21984i.containsKey(view)) {
            return this.f21984i.get(view);
        }
        Map<View, Boolean> map = this.f21984i;
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
        this.f21979d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0236a c0236a = this.f21977b.get(view);
        if (c0236a != null) {
            c0236a.a(aVar.getAdSessionId());
        } else {
            this.f21977b.put(view, new C0236a(eVar, aVar.getAdSessionId()));
        }
    }

    public View a(String str) {
        return this.f21978c.get(str);
    }

    public void a() {
        this.f21976a.clear();
        this.f21977b.clear();
        this.f21978c.clear();
        this.f21979d.clear();
        this.f21980e.clear();
        this.f21981f.clear();
        this.f21982g.clear();
        this.f21985j = false;
        this.f21983h.clear();
    }

    public C0236a b(View view) {
        C0236a c0236a = this.f21977b.get(view);
        if (c0236a != null) {
            this.f21977b.remove(view);
        }
        return c0236a;
    }

    public String b(String str) {
        return this.f21982g.get(str);
    }

    public HashSet<String> b() {
        return this.f21981f;
    }

    public String c(View view) {
        if (this.f21976a.size() == 0) {
            return null;
        }
        String str = this.f21976a.get(view);
        if (str != null) {
            this.f21976a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f21980e;
    }

    @VisibleForTesting
    public boolean c(String str) {
        return this.f21983h.contains(str);
    }

    public c d(View view) {
        if (this.f21979d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21985j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21985j = true;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f21983h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f21980e.add(adSessionId);
                            this.f21976a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21981f.add(adSessionId);
                            this.f21978c.put(adSessionId, viewC);
                            this.f21982g.put(adSessionId, strA);
                        }
                    } else {
                        this.f21981f.add(adSessionId);
                        this.f21982g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f21984i.containsKey(view)) {
            return true;
        }
        this.f21984i.put(view, Boolean.TRUE);
        return false;
    }
}
