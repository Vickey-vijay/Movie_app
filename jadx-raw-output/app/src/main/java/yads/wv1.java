package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import yads.wv1;

/* JADX INFO: loaded from: classes9.dex */
public final class wv1 implements ka2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb2 f84332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv1 f84333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dw1 f84334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nl3 f84335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb3 f84336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cq0 f84337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nt2 f84338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jw1 f84339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f84340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fq0 f84341j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f84342k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hw1 f84343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public vu1 f84344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public uu1 f84345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ja2 f84346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wh3 f84347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public gl3 f84348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public bq0 f84349r;

    public /* synthetic */ wv1(gw1 gw1Var) {
        qv1 qv1Var = new qv1(gw1Var);
        dw1 dw1Var = new dw1();
        nl3 nl3Var = new nl3();
        bb3 bb3Var = new bb3();
        cq0 cq0Var = new cq0();
        Object obj = dw2.f76819j;
        this(gw1Var, qv1Var, dw1Var, nl3Var, bb3Var, cq0Var, cw2.a().a(gw1Var.f()));
    }

    public final void a(bw1 bw1Var, LinkedHashMap linkedHashMap) throws tv1 {
        if (this.f84343l == null) {
            throw new tv1("Invalid state to execute this command");
        }
        switch (bw1Var.ordinal()) {
            case 0:
                wh3 wh3Var = this.f84347p;
                if (wh3Var != null) {
                    ((lh3) wh3Var).a();
                    return;
                }
                return;
            case 1:
                uu1 uu1Var = this.f84345n;
                if (uu1Var != null) {
                    uu1Var.e();
                    return;
                }
                return;
            case 2:
                uu1 uu1Var2 = this.f84345n;
                if (uu1Var2 != null) {
                    uu1Var2.b();
                    return;
                }
                return;
            case 3:
                if (gl3.f77848c == this.f84348q) {
                    gl3 gl3Var = gl3.f77850e;
                    this.f84348q = gl3Var;
                    this.f84333b.a(gl3Var);
                    ja2 ja2Var = this.f84346o;
                    if (ja2Var != null) {
                        ja2Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a(linkedHashMap);
                return;
            case 5:
                vu1 vu1Var = this.f84344m;
                if (vu1Var != null) {
                    vu1Var.a();
                    return;
                }
                return;
            case 6:
                boolean z10 = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                ja2 ja2Var2 = this.f84346o;
                if (ja2Var2 != null) {
                    ja2Var2.a(z10);
                    return;
                }
                return;
            case 7:
            default:
                throw new tv1("Unspecified MRAID Javascript command");
            case 8:
                nt2 nt2Var = this.f84338g;
                if (nt2Var == null || !nt2Var.f80806z0) {
                    return;
                }
                this.f84332a.a();
                return;
        }
    }

    public final void b(String str) throws tv1 {
        this.f84336e.getClass();
        if (!bb3.a(str)) {
            boolean z10 = ad1.f75480a;
            this.f84333b.a(bw1.f75994d, "Mraid command sent an invalid URL");
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (!ck.p.e("mraid", scheme) && !ck.p.e("mobileads", scheme)) {
            a(nj.l0.g(mj.h.a("url", str)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : uri.getQueryParameterNames()) {
            linkedHashMap.put(str2, uri.getQueryParameter(str2));
        }
        bw1.f75993c.getClass();
        bw1 bw1VarA = aw1.a(host);
        try {
            a(bw1VarA, linkedHashMap);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.f84333b.a(bw1VarA, message);
        }
        this.f84333b.a(bw1VarA);
    }

    public final void c(xv1 xv1Var) {
        this.f84346o = xv1Var;
    }

    public wv1(gw1 gw1Var, qv1 qv1Var, dw1 dw1Var, nl3 nl3Var, bb3 bb3Var, cq0 cq0Var, nt2 nt2Var) {
        this.f84332a = gw1Var;
        this.f84333b = qv1Var;
        this.f84334c = dw1Var;
        this.f84335d = nl3Var;
        this.f84336e = bb3Var;
        this.f84337f = cq0Var;
        this.f84338g = nt2Var;
        jw1 jw1Var = new jw1(new vv1(this));
        this.f84339h = jw1Var;
        this.f84348q = gl3.f77849d;
        gw1Var.setWebViewClient(jw1Var);
        this.f84341j = new fq0(gw1Var, cq0Var, this);
        this.f84342k = tb.a(this);
    }

    public final void b(xv1 xv1Var) {
        this.f84344m = xv1Var;
    }

    public final void a(Map map) throws tv1 {
        o11 o11Var;
        if (this.f84343l != null) {
            nt2 nt2Var = this.f84338g;
            if (nt2Var == null || !nt2Var.B0 || this.f84340i) {
                String str = (String) map.get("url");
                if (str != null && str.length() > 0) {
                    hw1 hw1Var = this.f84343l;
                    if (hw1Var != null && (o11Var = (o11) hw1Var.f78402a.get()) != null) {
                        o11Var.a(str);
                    }
                    boolean z10 = ad1.f75480a;
                    return;
                }
                ck.w wVar = ck.w.f6066a;
                String str2 = String.format("Mraid open command sent an invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1));
                ck.p.i(str2, "format(...)");
                throw new tv1(str2);
            }
        }
    }

    public final void a(final String str) {
        Context context = this.f84332a.getContext();
        dw1 dw1Var = this.f84334c;
        String str2 = this.f84342k;
        cw1 cw1Var = new cw1() { // from class: cp.hc
            @Override // yads.cw1
            public final void a(String str3) {
                wv1.a(this.f51362a, str, str3);
            }
        };
        dw1Var.getClass();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        String str3 = nt2VarA != null ? nt2VarA.P : null;
        if (str3 != null && str3.length() > 0) {
            h43 h43VarA = dw1.a(str3, str2, cw1Var);
            Object obj2 = xo2.f84662a;
            synchronized (wo2.a()) {
                r82.a(context).a(h43VarA);
            }
            return;
        }
        cw1Var.a(dw1.f76818a);
        boolean z10 = ad1.f75480a;
    }

    public static final void a(wv1 wv1Var, String str, String str2) {
        wv1Var.f84339h.f79216c = str2;
        hb2 hb2Var = wv1Var.f84333b.f81983a;
        hb2Var.loadDataWithBaseURL("https://yandex.ru", hb2Var.a(str), "text/html", "UTF-8", null);
    }

    public final void a() {
        o11 o11Var;
        this.f84340i = true;
        hw1 hw1Var = this.f84343l;
        if (hw1Var == null || (o11Var = (o11) hw1Var.f78402a.get()) == null) {
            return;
        }
        o11Var.a();
    }

    public final void a(xv1 xv1Var) {
        this.f84345n = xv1Var;
    }

    public final void a(lh3 lh3Var) {
        this.f84347p = lh3Var;
    }
}
