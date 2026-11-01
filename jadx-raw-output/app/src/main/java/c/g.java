package c;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends FullScreenContentCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f5571b;

    public g(i0 i0Var) {
        this.f5571b = i0Var;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        this.f5571b.C.onAdClick();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        this.f5571b.C.onAdClose();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        this.f5571b.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        super.onAdImpression();
        i0 i0Var = this.f5571b;
        i0Var.C.onAdShow(r0.b(i0Var.E, i0Var.f61585f));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
    }
}
