package xe;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.yk.e.util.AdLog;
import gl.m1;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements MaxAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f74452b;

    public k(t tVar) {
        this.f74452b = tVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        this.f74452b.C.onAdClick();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f74452b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        t tVar = this.f74452b;
        tVar.C.onAdShow(r0.b(maxAd, tVar.f61585f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
        AdLog.d("interstitialAd load next ad");
        this.f74452b.D.loadAd();
        t tVar = this.f74452b;
        tVar.G = true;
        tVar.C.onAdClose();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        this.f74452b.v(maxError.getCode() + ", " + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        t tVar = this.f74452b;
        if (tVar.F) {
            return;
        }
        tVar.E = true;
        tVar.f(maxAd.getRevenue());
        this.f74452b.f61605z = "applovin_" + maxAd.getNetworkName();
        this.f74452b.r(maxAd);
        t tVar2 = this.f74452b;
        if (!tVar2.G) {
            tVar2.C.onAdLoaded();
            return;
        }
        m1 m1Var = new m1();
        m1Var.f53538a = tVar2.D;
        m1Var.f53539b = maxAd;
        gl.x xVarA = gl.x.a();
        String str = this.f74452b.H;
        xVarA.getClass();
        try {
            xVarA.f53609a.putIfAbsent(str, m1Var);
            AdLog.d(xVarA.f53610b, "putCache, cacheAdMap " + xVarA.f53609a.toString());
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        this.f74452b.G = false;
    }
}
