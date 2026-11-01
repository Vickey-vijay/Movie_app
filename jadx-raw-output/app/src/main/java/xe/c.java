package xe;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import gl.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends FullScreenContentCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f74437b;

    public c(j jVar) {
        this.f74437b = jVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        super.onAdClicked();
        this.f74437b.D.onAdClick();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        this.f74437b.D.onAdClose();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        this.f74437b.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        super.onAdImpression();
        j jVar = this.f74437b;
        jVar.D.onAdShow(r0.b(jVar.F, jVar.f61585f));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
    }
}
