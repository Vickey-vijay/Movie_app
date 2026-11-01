package dp;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements AdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f52277a;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    public t(i0 i0Var) {
        this.f52277a = i0Var;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f52277a.F.onAdClick();
        i0 i0Var = this.f52277a;
        if (i0Var.D) {
            i0Var.C();
            this.f52277a.F.onAdClose();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f52277a.F.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f52277a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        i0 i0Var = this.f52277a;
        i0Var.F.onAdShow(gl.r0.b(null, i0Var.f61585f));
    }
}
