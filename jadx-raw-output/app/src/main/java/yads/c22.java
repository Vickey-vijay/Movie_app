package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class c22 implements MediatedNativeAdapterListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f76088p = {wb.a(c22.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f76089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f76090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do1 f76091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo1 f76092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hp1 f76093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w51 f76094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f76095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lm2 f76096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f76097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f76098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c41 f76099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gp1 f76100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final po1 f76101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qp1 f76102n;

    public /* synthetic */ c22(v9 v9Var, lu2 lu2Var, m02 m02Var, do1 do1Var) {
        this(v9Var, lu2Var, m02Var, do1Var, new jo1(), new hp1(), new w51(do1Var));
    }

    public c22(v9 v9Var, lu2 lu2Var, m02 m02Var, do1 do1Var, jo1 jo1Var, hp1 hp1Var, w51 w51Var) {
        this.f76089a = v9Var;
        this.f76090b = lu2Var;
        this.f76091c = do1Var;
        this.f76092d = jo1Var;
        this.f76093e = hp1Var;
        this.f76094f = w51Var;
        Context applicationContext = m02Var.g().getApplicationContext();
        this.f76095g = applicationContext;
        this.f76096h = mm2.a(m02Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f76097i = linkedHashMap;
        this.f76098j = new LinkedHashMap();
        c41 c41Var = new c41(m02Var.g());
        this.f76099k = c41Var;
        gp1 gp1Var = new gp1(m02Var.g());
        this.f76100l = gp1Var;
        this.f76101m = new po1(m02Var.g(), c41Var, gp1Var);
        this.f76102n = new qp1(applicationContext, do1Var, linkedHashMap);
    }
}
