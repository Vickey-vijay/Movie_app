package k;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements SplashAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f62014a;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdFinished() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    public j0(k kVar) {
        this.f62014a = kVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f62014a.D.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f62014a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        k kVar = this.f62014a;
        kVar.D.onAdShow(gl.r0.b(null, kVar.f61585f));
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdSkipped() {
        this.f62014a.D.onAdClose();
    }
}
