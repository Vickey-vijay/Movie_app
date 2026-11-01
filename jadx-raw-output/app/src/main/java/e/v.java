package e;

import gl.r0;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements AdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f52308a;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    public v(h hVar) {
        this.f52308a = hVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f52308a.L.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f52308a.L.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f52308a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        h hVar = this.f52308a;
        hVar.L.onAdShow(r0.b(null, hVar.f61585f));
    }
}
