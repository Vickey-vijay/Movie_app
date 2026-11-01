package fl;

import android.view.View;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.ironsource.Z7;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f52977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f52978c;

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdCollapsed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdExpanded(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd maxAd) {
    }

    public o(c cVar, View view) {
        this.f52978c = cVar;
        this.f52977b = view;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f52978c.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f52978c.v(maxError.getCode() + Z7.f27998r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        c cVar = this.f52978c;
        cVar.H = maxAd;
        MainThirdBannerCallBack mainThirdBannerCallBack = cVar.F;
        if (mainThirdBannerCallBack == null || !cVar.D) {
            return;
        }
        mainThirdBannerCallBack.onAdShow(r0.b(maxAd, cVar.f61585f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        AdLog.d(this.f52978c.E, "thirdBanner, applovin load failed, msg = " + maxError.getCode() + Z7.f27998r + maxError.getMessage());
        this.f52978c.v(maxError.getCode() + Z7.f27998r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        c cVar = this.f52978c;
        if (cVar.J || cVar.I) {
            return;
        }
        cVar.I = true;
        cVar.f(maxAd.getRevenue());
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f52978c.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdLoaded(this.f52977b);
        }
    }
}
