package h;

import android.view.View;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.ironsource.Z7;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements MaxAdViewAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f53659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f53660c;

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
        this.f53660c = cVar;
        this.f53659b = view;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd maxAd) {
        MainMRECCallBack mainMRECCallBack = this.f53660c.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f53660c.v(maxError.getCode() + Z7.f27998r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd maxAd) {
        c cVar = this.f53660c;
        cVar.H = maxAd;
        MainMRECCallBack mainMRECCallBack = cVar.F;
        if (mainMRECCallBack == null || !cVar.D) {
            return;
        }
        mainMRECCallBack.onAdShow(r0.b(maxAd, cVar.f61585f));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String str, MaxError maxError) {
        AdLog.d(this.f53660c.E, "thirdBanner, applovin load failed, msg = " + maxError.getCode() + Z7.f27998r + maxError.getMessage());
        this.f53660c.v(maxError.getCode() + Z7.f27998r + maxError.getMessage());
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd maxAd) {
        c cVar = this.f53660c;
        if (cVar.J || cVar.I) {
            return;
        }
        cVar.I = true;
        cVar.f(maxAd.getRevenue());
        MainMRECCallBack mainMRECCallBack = this.f53660c.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdLoaded(this.f53659b);
        }
    }
}
