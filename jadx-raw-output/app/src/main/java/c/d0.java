package c;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements RewardedVideoAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5566b;

    public d0(w wVar) {
        this.f5566b = wVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f5566b.B.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f5566b.B.onAdVideoCache();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f5566b.v(adError.getErrorCode() + ",  " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        w wVar = this.f5566b;
        wVar.B.onAdShow(r0.b(ad2, wVar.f61585f));
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.f5566b.B.onAdClose();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f5566b.B.onReward("");
        this.f5566b.B.onAdVideoComplete();
    }
}
