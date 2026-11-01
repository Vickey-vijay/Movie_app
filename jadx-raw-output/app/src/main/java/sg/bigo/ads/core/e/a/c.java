package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Map<String, String> f71283a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f71288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f71289g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f71298p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f71290h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f71291i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f71292j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f71293k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71284b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71285c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71286d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71287e = new CopyOnWriteArrayList<>();

    public c(q qVar) {
        this.f71288f = qVar;
        HashMap map = new HashMap();
        this.f71283a = map;
        this.f71289g = new f(this.f71288f, map);
    }

    private void a(Context context, final String str, final e eVar, final boolean z10) {
        String str2 = eVar.f71332b;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i10 = eVar.f71333c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i10, str, aVarD, str2, this.f71298p, this.f71283a, new sg.bigo.ads.core.e.b.a() { // from class: sg.bigo.ads.core.e.a.c.5
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                e eVar2 = eVar;
                if (eVar2.f71334d == 1) {
                    c.a(c.this, str, eVar2, true);
                }
                d.a().b(c.this.f71289g);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i11) {
                return c.this.f71288f.a(i11);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                c.a(c.this, str, eVar, z10);
                d.a().b(c.this.f71289g);
            }
        });
    }

    public static /* synthetic */ void a(c cVar, Context context, final String str, e eVar) {
        String strA = eVar.d().a();
        final String str2 = eVar.f71332b;
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            strA = strA.replaceAll("\\?", "%3f");
        }
        cVar.a(str, "start", new sg.bigo.ads.common.u.b.d(strA), str2);
        final sg.bigo.ads.core.h.e eVarA = sg.bigo.ads.core.h.e.a(context);
        if (eVarA != null) {
            eVarA.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.core.e.a.c.6
                @Override // sg.bigo.ads.core.h.d
                public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                    eVarA.destroy();
                }

                @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str3) {
                    super.onPageFinished(webView, str3);
                    c.this.a(str, "success", new sg.bigo.ads.common.u.b.d(str3), str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                    return false;
                }
            });
            try {
                int i10 = eVar.f71331a;
                if (i10 == 1) {
                    eVarA.loadUrl(strA);
                    return;
                }
                if (i10 == 2) {
                    eVarA.loadData(strA, "text/html", "UTF-8");
                }
            } catch (Exception e10) {
                sg.bigo.ads.core.d.b.a(3002, 10106, e10.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str, e eVar, boolean z10) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        CopyOnWriteArrayList<e> copyOnWriteArrayList2;
        CopyOnWriteArrayList<e> copyOnWriteArrayList3;
        CopyOnWriteArrayList<e> copyOnWriteArrayList4;
        if ("impl_track".equals(str)) {
            if (!z10 || (copyOnWriteArrayList4 = cVar.f71294l) == null) {
                return;
            }
            copyOnWriteArrayList4.remove(eVar);
            return;
        }
        if ("click_track".equals(str)) {
            if (!z10 || (copyOnWriteArrayList3 = cVar.f71295m) == null) {
                return;
            }
            copyOnWriteArrayList3.remove(eVar);
            return;
        }
        if ("nurl_track".equals(str)) {
            if (!z10 || (copyOnWriteArrayList2 = cVar.f71296n) == null) {
                return;
            }
            copyOnWriteArrayList2.remove(eVar);
            return;
        }
        if ("lurl_track".equals(str) && z10 && (copyOnWriteArrayList = cVar.f71297o) != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    public final void a(int i10) {
        this.f71298p = i10;
        f fVar = this.f71289g;
        if (fVar != null) {
            fVar.f71353r = i10;
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        h hVarA = h.a(this.f71283a, this.f71288f, this.f71298p, str, str2, str3);
        hVarA.a(context, hVarA.f71363a);
    }

    public final void a(final Context context, boolean z10) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f71288f.f69419a;
        Iterator<e> it = this.f71286d.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z11) {
            this.f71292j = jCurrentTimeMillis;
            this.f71296n = new CopyOnWriteArrayList<>();
            for (e eVar : this.f71286d) {
                if (!z10 || eVar.a()) {
                    if (eVar.c()) {
                        this.f71296n.add(eVar);
                    }
                }
            }
            if (this.f71296n.size() > 0) {
                f fVar = this.f71289g;
                fVar.f71356u = this.f71296n;
                fVar.f71349n = jCurrentTimeMillis;
                fVar.f71348m = 0;
                d.a().a(this.f71289g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdNUrl not need retry");
        }
        for (final e eVar2 : this.f71286d) {
            if (!z10 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "nurl_track", eVar2, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "nurl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void a(final Context context, boolean z10, int i10) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f71288f.f69419a;
        for (e eVar : this.f71284b) {
            if (i10 > 0) {
                eVar.a("ad_imp_indx", String.valueOf(i10));
            }
            eVar.e();
        }
        if (z11) {
            this.f71290h = jCurrentTimeMillis;
            this.f71294l = new CopyOnWriteArrayList<>();
            for (e eVar2 : this.f71284b) {
                if (!z10 || eVar2.a()) {
                    if (eVar2.c()) {
                        this.f71294l.add(eVar2);
                    }
                }
            }
            if (this.f71294l.size() > 0) {
                f fVar = this.f71289g;
                fVar.f71354s = this.f71294l;
                fVar.f71345j = jCurrentTimeMillis;
                fVar.f71344i = 0;
                d.a().a(this.f71289g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdImpression not need retry");
        }
        for (final e eVar3 : this.f71284b) {
            if (!z10 || eVar3.a()) {
                if (eVar3.c()) {
                    a(context, "impl_track", eVar3, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "impl_track", eVar3);
                        }
                    });
                }
            }
        }
    }

    public final void a(final Context context, boolean z10, int i10, int i11) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f71288f.f69419a;
        for (e eVar : this.f71285c) {
            if (i10 > 0) {
                eVar.a("ad_click_indx", String.valueOf(i10));
            }
            if (i11 > 0) {
                eVar.a("ad_imp_indx", String.valueOf(i11));
            }
            eVar.e();
        }
        if (z11) {
            this.f71291i = jCurrentTimeMillis;
            this.f71295m = new CopyOnWriteArrayList<>();
            for (e eVar2 : this.f71285c) {
                if (!z10 || eVar2.a()) {
                    if (eVar2.c()) {
                        this.f71295m.add(eVar2);
                    }
                }
            }
            if (this.f71295m.size() > 0) {
                f fVar = this.f71289g;
                fVar.f71355t = this.f71295m;
                fVar.f71347l = jCurrentTimeMillis;
                fVar.f71346k = 0;
                d.a().a(this.f71289g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdClick not need retry");
        }
        for (final e eVar3 : this.f71285c) {
            if (!z10 || eVar3.a()) {
                if (eVar3.c()) {
                    a(context, "click_track", eVar3, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "click_track", eVar3);
                        }
                    });
                }
            }
        }
    }

    public final void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f71283a.put(str, str2);
    }

    public final void a(String str, String str2, sg.bigo.ads.common.u.a aVar, String str3) {
        HashMap map = new HashMap(this.f71283a);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        map.put("action", str);
        map.put("track_url", aVar.a());
        map.put("domain_front", aVar.e() ? aVar.d() : "");
        map.put("track_name", str3);
        map.put("states", str2);
        map.put("retry", "0");
        map.put("out_ad", String.valueOf(this.f71298p));
        if ("impl_track".equals(str)) {
            sg.bigo.ads.core.d.b.a(map);
        } else if ("click_track".equals(str)) {
            sg.bigo.ads.core.d.b.b(map);
        }
    }

    public final void b(final Context context, boolean z10) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f71288f.f69419a;
        Iterator<e> it = this.f71287e.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z11) {
            this.f71293k = jCurrentTimeMillis;
            this.f71297o = new CopyOnWriteArrayList<>();
            for (e eVar : this.f71287e) {
                if (!z10 || eVar.a()) {
                    if (eVar.c()) {
                        this.f71297o.add(eVar);
                    }
                }
            }
            if (this.f71297o.size() > 0) {
                f fVar = this.f71289g;
                fVar.f71357v = this.f71297o;
                fVar.f71351p = jCurrentTimeMillis;
                fVar.f71350o = 0;
                d.a().a(this.f71289g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdLUrl not need retry");
        }
        for (final e eVar2 : this.f71287e) {
            if (!z10 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "lurl_track", eVar2, z11);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "lurl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void b(@NonNull String str, @NonNull String str2) {
        for (e eVar : this.f71284b) {
            if (eVar.c()) {
                eVar.a(str, str2);
            }
        }
        for (e eVar2 : this.f71285c) {
            if (eVar2.c()) {
                eVar2.a(str, str2);
            }
        }
        for (e eVar3 : this.f71286d) {
            if (eVar3.c()) {
                eVar3.a(str, str2);
            }
        }
        for (e eVar4 : this.f71287e) {
            if (eVar4.c()) {
                eVar4.a(str, str2);
            }
        }
    }
}
