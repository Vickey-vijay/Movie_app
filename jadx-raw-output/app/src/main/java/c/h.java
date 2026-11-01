package c;

import gl.r0;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.RewardAdInteractionListener;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements RewardAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5573a;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    public h(p pVar) {
        this.f5573a = pVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f5573a.B.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f5573a.B.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f5573a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        p pVar = this.f5573a;
        pVar.B.onAdShow(r0.b(null, pVar.f61585f));
    }

    @Override // sg.bigo.ads.api.RewardAdInteractionListener
    public final void onAdRewarded() {
        this.f5573a.B.onReward("");
    }
}
