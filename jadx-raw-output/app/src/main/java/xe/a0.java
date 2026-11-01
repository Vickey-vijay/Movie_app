package xe;

import gl.r0;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements AdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f74433a;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    public a0(g gVar) {
        this.f74433a = gVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f74433a.C.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f74433a.C.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f74433a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        g gVar = this.f74433a;
        gVar.C.onAdShow(r0.b(null, gVar.f61585f));
    }
}
