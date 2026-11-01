package e;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f52288c;

    public d(b0 b0Var) {
        this.f52288c = b0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f52288c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f52288c.L.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        b0 b0Var = this.f52288c;
        b0Var.L.onAdShow(r0.b(b0Var.P, b0Var.f61585f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f52288c.N;
        if (bVar != null) {
            gl.h.a(bVar.f51752a);
            b0 b0Var = this.f52288c;
            b0Var.L.onAdLoaded(b0Var.N.f51752a);
        }
    }
}
