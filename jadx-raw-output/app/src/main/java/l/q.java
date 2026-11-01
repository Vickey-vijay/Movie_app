package l;

import gl.r0;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements AdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f63347a;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    public q(w wVar) {
        this.f63347a = wVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f63347a.B.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f63347a.B.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f63347a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        w wVar = this.f63347a;
        wVar.B.onAdShow(r0.b(null, wVar.f61585f));
    }
}
