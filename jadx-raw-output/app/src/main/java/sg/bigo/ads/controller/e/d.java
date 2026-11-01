package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.Z3;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements sg.bigo.ads.common.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public AdConfig f70804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Context f70805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.controller.b.d f70806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f70807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f70808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f70810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f70811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f70812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f70813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f70814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f70815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f70816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f70817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f70818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f70819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f70820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f70821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f70822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f70823t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f70825v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f70826w = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f70824u = 0;

    public d(@NonNull Context context, @NonNull AdConfig adConfig, @NonNull sg.bigo.ads.controller.b.d dVar) {
        this.f70805b = context;
        this.f70804a = adConfig;
        this.f70806c = dVar;
    }

    @Override // sg.bigo.ads.common.g
    public final String A() {
        sg.bigo.ads.common.a aVarL = this.f70806c.L();
        return aVarL != null ? aVarL.f69455b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String B() {
        return sg.bigo.ads.common.b.a.a(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final String C() {
        return this.f70806c.F();
    }

    @Override // sg.bigo.ads.common.g
    public final int D() {
        return (int) (r.b() / 1000);
    }

    @Override // sg.bigo.ads.common.g
    public final String E() {
        return this.f70806c.j();
    }

    @Override // sg.bigo.ads.common.g
    public final boolean F() {
        sg.bigo.ads.common.a aVarK = this.f70806c.K();
        if (aVarK != null) {
            return aVarK.f69456c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String G() {
        sg.bigo.ads.common.a aVarK = this.f70806c.K();
        return aVarK != null ? aVarK.f69455b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String H() {
        return this.f70817n;
    }

    @Override // sg.bigo.ads.common.g
    public final String I() {
        return this.f70818o;
    }

    @Override // sg.bigo.ads.common.g
    public final int J() {
        return this.f70819p;
    }

    @Override // sg.bigo.ads.common.g
    public final long K() {
        return this.f70820q;
    }

    @Override // sg.bigo.ads.common.g
    public final long L() {
        return this.f70821r;
    }

    @Override // sg.bigo.ads.common.g
    public final long M() {
        return p.a(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final long N() {
        return p.c();
    }

    @Override // sg.bigo.ads.common.g
    public final long O() {
        return p.a();
    }

    @Override // sg.bigo.ads.common.g
    public final String P() {
        return this.f70806c.l();
    }

    @Override // sg.bigo.ads.common.g
    public final String Q() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String R() {
        return q.d(sg.bigo.ads.common.aa.b.e(this.f70805b));
    }

    @Override // sg.bigo.ads.common.g
    public final String S() {
        return q.d(sg.bigo.ads.common.aa.b.c(this.f70805b));
    }

    @Override // sg.bigo.ads.common.g
    public final String T() {
        return this.f70823t;
    }

    @Override // sg.bigo.ads.common.g
    public final String U() {
        sg.bigo.ads.controller.b.d dVar = this.f70806c;
        return dVar != null ? dVar.G() : "";
    }

    @Override // sg.bigo.ads.common.g
    public final long V() {
        return h.a().f70874e.f70879a;
    }

    @Override // sg.bigo.ads.common.g
    public final long W() {
        return h.a().f70874e.f70880b;
    }

    @Override // sg.bigo.ads.common.g
    public final String X() {
        return sg.bigo.ads.common.x.a.r();
    }

    @Override // sg.bigo.ads.common.g
    public final long Y() {
        if (this.f70825v == 0) {
            try {
                Context context = this.f70805b;
                this.f70825v = sg.bigo.ads.common.utils.c.c(context, context.getPackageName());
            } catch (Exception unused) {
                this.f70825v = -1L;
            }
        }
        return this.f70825v;
    }

    @Override // sg.bigo.ads.common.g
    public final long Z() {
        if (this.f70826w == 0) {
            try {
                Context context = this.f70805b;
                this.f70826w = sg.bigo.ads.common.utils.c.d(context, context.getPackageName());
            } catch (Exception unused) {
                this.f70826w = -1L;
            }
        }
        return this.f70826w;
    }

    @Override // sg.bigo.ads.common.g
    @NonNull
    public final String a() {
        return this.f70804a.getAppKey();
    }

    @Override // sg.bigo.ads.common.g
    public final String aa() {
        return "official";
    }

    @Override // sg.bigo.ads.common.g
    public final int ab() {
        return this.f70822s;
    }

    @Override // sg.bigo.ads.common.g
    public final sg.bigo.ads.common.b ac() {
        if (this.f70806c.n().a(15)) {
            return sg.bigo.ads.common.aa.b.h(this.f70805b);
        }
        sg.bigo.ads.common.aa.b.j(this.f70805b);
        return null;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ad() {
        sg.bigo.ads.common.a aVarM = this.f70806c.M();
        if (aVarM != null) {
            return aVarM.f69456c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String ae() {
        sg.bigo.ads.common.a aVarM = this.f70806c.M();
        return aVarM != null ? aVarM.f69455b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final Context af() {
        return this.f70805b;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ag() {
        return sg.bigo.ads.common.aa.b.k(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ah() {
        return sg.bigo.ads.common.aa.b.l(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ai() {
        return sg.bigo.ads.common.aa.b.c();
    }

    @Override // sg.bigo.ads.common.g
    public final float aj() {
        return sg.bigo.ads.common.aa.b.m(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ak() {
        return sg.bigo.ads.common.aa.b.o(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final float al() {
        return sg.bigo.ads.common.aa.b.p(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final int am() {
        return sg.bigo.ads.common.aa.b.q(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final int an() {
        return sg.bigo.ads.common.aa.b.r(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ao() {
        return sg.bigo.ads.common.aa.b.u(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ap() {
        return sg.bigo.ads.common.aa.b.s(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final int aq() {
        return sg.bigo.ads.common.aa.b.t(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final long ar() {
        return sg.bigo.ads.common.aa.b.v(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean as() {
        return sg.bigo.ads.common.aa.b.w(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean at() {
        return sg.bigo.ads.common.aa.b.n(this.f70805b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean au() {
        return sg.bigo.ads.common.aa.b.d();
    }

    @Override // sg.bigo.ads.common.g
    public final int av() {
        return this.f70806c.n().a(25) ? 2 : 0;
    }

    @Override // sg.bigo.ads.common.g
    public final int aw() {
        return this.f70824u;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ax() {
        return this.f70806c.n().a(27);
    }

    @Override // sg.bigo.ads.common.g
    public final String b() {
        return this.f70807d;
    }

    @Override // sg.bigo.ads.common.g
    public final String c() {
        return this.f70808e;
    }

    @Override // sg.bigo.ads.common.g
    public final int d() {
        return this.f70809f;
    }

    @Override // sg.bigo.ads.common.g
    public final String e() {
        return this.f70804a.getChannel();
    }

    @Override // sg.bigo.ads.common.g
    public final int f() {
        return this.f70804a.getAge();
    }

    @Override // sg.bigo.ads.common.g
    public final int g() {
        return this.f70804a.getGender();
    }

    @Override // sg.bigo.ads.common.g
    public final long h() {
        return this.f70804a.getActivatedTime();
    }

    @Override // sg.bigo.ads.common.g
    public final String i() {
        return "android";
    }

    @Override // sg.bigo.ads.common.g
    public final String j() {
        return Build.VERSION.RELEASE;
    }

    @Override // sg.bigo.ads.common.g
    public final String k() {
        return this.f70810g;
    }

    @Override // sg.bigo.ads.common.g
    public final String l() {
        return this.f70811h;
    }

    @Override // sg.bigo.ads.common.g
    public final String m() {
        return this.f70812i;
    }

    @Override // sg.bigo.ads.common.g
    public final String n() {
        return this.f70813j;
    }

    @Override // sg.bigo.ads.common.g
    public final String o() {
        return this.f70814k;
    }

    @Override // sg.bigo.ads.common.g
    public final int p() {
        return this.f70815l;
    }

    @Override // sg.bigo.ads.common.g
    public final String q() {
        return this.f70816m;
    }

    @Override // sg.bigo.ads.common.g
    public final String r() {
        int iA = sg.bigo.ads.common.aa.c.a(this.f70805b);
        if (iA == 1) {
            return "2g";
        }
        if (iA == 2) {
            return Z3.f27966a;
        }
        if (iA == 3) {
            return "wifi";
        }
        if (iA != 4) {
            return iA != 5 ? "unknown" : "5g";
        }
        return "4g";
    }

    @Override // sg.bigo.ads.common.g
    public final String s() {
        return q.d(sg.bigo.ads.common.utils.c.a());
    }

    @Override // sg.bigo.ads.common.g
    public final String t() {
        String strK = this.f70806c.k();
        return !TextUtils.isEmpty(strK) ? strK : v();
    }

    @Override // sg.bigo.ads.common.g
    public final String u() {
        return this.f70806c.k();
    }

    @Override // sg.bigo.ads.common.g
    public final String v() {
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String strR = R();
        return !TextUtils.isEmpty(strR) ? strR : S();
    }

    @Override // sg.bigo.ads.common.g
    public final String w() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String x() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String y() {
        return "5.6.2";
    }

    @Override // sg.bigo.ads.common.g
    public final boolean z() {
        sg.bigo.ads.common.a aVarL = this.f70806c.L();
        if (aVarL != null) {
            return aVarL.f69456c;
        }
        return true;
    }
}
