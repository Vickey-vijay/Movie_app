package gl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f53537b;

    public m0(j jVar) {
        this.f53537b = jVar;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        n0 n0Var = this.f53537b.f53508b;
        n0Var.f53557o.onAdShow(r0.b(maxAd, n0Var.f53544b));
    }
}
