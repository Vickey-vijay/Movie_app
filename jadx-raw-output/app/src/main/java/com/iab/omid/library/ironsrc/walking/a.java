package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21841a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0232a> f21842b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21843c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21844d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21845e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21846f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21847g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f21848h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f21849i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21850j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0232a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f21851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f21852b = new ArrayList<>();

        public C0232a(e eVar, String str) {
            this.f21851a = eVar;
            a(str);
        }

        public e a() {
            return this.f21851a;
        }

        public void a(String str) {
            this.f21852b.add(str);
        }

        public ArrayList<String> b() {
            return this.f21852b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f21849i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f21849i.containsKey(view)) {
            return this.f21849i.get(view);
        }
        Map<View, Boolean> map = this.f21849i;
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
        this.f21844d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0232a c0232a = this.f21842b.get(view);
        if (c0232a != null) {
            c0232a.a(aVar.getAdSessionId());
        } else {
            this.f21842b.put(view, new C0232a(eVar, aVar.getAdSessionId()));
        }
    }

    public View a(String str) {
        return this.f21843c.get(str);
    }

    public void a() {
        this.f21841a.clear();
        this.f21842b.clear();
        this.f21843c.clear();
        this.f21844d.clear();
        this.f21845e.clear();
        this.f21846f.clear();
        this.f21847g.clear();
        this.f21850j = false;
        this.f21848h.clear();
    }

    public C0232a b(View view) {
        C0232a c0232a = this.f21842b.get(view);
        if (c0232a != null) {
            this.f21842b.remove(view);
        }
        return c0232a;
    }

    public String b(String str) {
        return this.f21847g.get(str);
    }

    public HashSet<String> b() {
        return this.f21846f;
    }

    public String c(View view) {
        if (this.f21841a.size() == 0) {
            return null;
        }
        String str = this.f21841a.get(view);
        if (str != null) {
            this.f21841a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f21845e;
    }

    public boolean c(String str) {
        return this.f21848h.contains(str);
    }

    public c d(View view) {
        if (this.f21844d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f21850j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f21850j = true;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f21848h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f21845e.add(adSessionId);
                            this.f21841a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f21846f.add(adSessionId);
                            this.f21843c.put(adSessionId, viewC);
                            this.f21847g.put(adSessionId, strA);
                        }
                    } else {
                        this.f21846f.add(adSessionId);
                        this.f21847g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (!this.f21849i.containsKey(view)) {
            return true;
        }
        this.f21849i.put(view, Boolean.TRUE);
        return false;
    }
}
