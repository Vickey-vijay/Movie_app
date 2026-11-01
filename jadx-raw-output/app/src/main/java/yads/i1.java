package yads;

import android.content.Context;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f78434m = {wb.a(i1.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f78435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f78436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dr0 f78437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n9 f78438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io2 f78439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kr0 f78440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hr0 f78441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm2 f78443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h1 f78444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i22 f78445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78446l;

    public /* synthetic */ i1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, g1 g1Var, dr0 dr0Var) {
        n9 n9Var = new n9();
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        at1 at1VarA = cf.a(context, iu3Var.b());
        kr0 kr0Var = dr0Var != null ? new kr0(context, d4Var, lu2Var, dr0Var) : null;
        hr0 hr0VarA = gr0.a(context);
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        this(d4Var, v9Var, g1Var, dr0Var, n9Var, at1VarA, kr0Var, hr0VarA, nt2VarA != null && nt2VarA.i());
    }

    public final eo2 a(h1 h1Var, String str) {
        fo2 fo2VarA = this.f78438d.a(this.f78435a.f76563e);
        fo2VarA.b(h1Var.f78011b, "type");
        fo2VarA.b(this.f78435a.f76559a.f76868b, "ad_type");
        fo2VarA.b(this.f78435a.f76561c.f78158a, "ad_unit_id");
        fo2VarA.b(str, "interval");
        i22 i22Var = this.f78445k;
        if (i22Var != null) {
            fo2VarA = go2.a(fo2VarA, i22Var.a());
        }
        co2 co2Var = co2.f76352c;
        Map map = fo2VarA.f77471a;
        v9 v9Var = this.f78436b;
        return new eo2("returned_to_app", kotlin.collections.a.B(map), v9Var != null ? v9Var.f83817i : null);
    }

    public final void b(h1 h1Var) {
        Objects.toString(h1Var);
        boolean z10 = ad1.f75480a;
        this.f78446l = System.currentTimeMillis();
        this.f78444j = h1Var;
        if (h1Var == h1.f78007c && this.f78442h) {
            c cVarA = null;
            Map mapB = a(h1Var, null).b();
            v9 v9Var = this.f78436b;
            if (v9Var != null) {
                cVarA = v9Var.a();
            }
            this.f78441g.a(new er0(this.f78435a.a(), this.f78446l, h1Var, this.f78437c, mapB, cVarA));
        }
    }

    public i1(d4 d4Var, v9 v9Var, g1 g1Var, dr0 dr0Var, n9 n9Var, io2 io2Var, kr0 kr0Var, hr0 hr0Var, boolean z10) {
        this.f78435a = d4Var;
        this.f78436b = v9Var;
        this.f78437c = dr0Var;
        this.f78438d = n9Var;
        this.f78439e = io2Var;
        this.f78440f = kr0Var;
        this.f78441g = hr0Var;
        this.f78442h = z10;
        this.f78443i = mm2.a(g1Var);
    }

    public final void a(h1 h1Var) {
        Objects.toString(h1Var);
        boolean z10 = ad1.f75480a;
        if (this.f78446l == 0 || this.f78444j != h1Var) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f78446l;
        this.f78439e.a(a(h1Var, rd1.a(jCurrentTimeMillis)));
        lm2 lm2Var = this.f78443i;
        jk.k kVar = f78434m[0];
        g1 g1Var = (g1) lm2Var.f79854a.get();
        if (g1Var != null) {
            g1Var.onReturnedToApplication();
        }
        kr0 kr0Var = this.f78440f;
        if (kr0Var != null) {
            kr0Var.a(jCurrentTimeMillis);
            if (this.f78442h) {
                this.f78441g.a(this.f78446l);
            }
        }
        this.f78446l = 0L;
        this.f78444j = null;
    }
}
