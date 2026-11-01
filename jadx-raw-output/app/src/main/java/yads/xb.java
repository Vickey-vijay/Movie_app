package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class xb implements yb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f84518b = {wb.a(xb.class, "adViewReference", "getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f84519a;

    @Override // yads.yb
    public final boolean a() {
        lm2 lm2Var = this.f84519a;
        jk.k kVar = f84518b[0];
        tc1 tc1Var = (tc1) lm2Var.f79854a.get();
        return tc1Var != null && kl3.f79470a.a(tc1Var).f84628a >= 1;
    }

    public xb(tc1 tc1Var) {
        this.f84519a = mm2.a(tc1Var);
    }
}
