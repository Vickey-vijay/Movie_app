package dp;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f52248c;

    public f(a0 a0Var) {
        this.f52248c = a0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f52248c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f52248c.F.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        a0 a0Var = this.f52248c;
        a0Var.F.onAdShow(gl.r0.b(a0Var.H, a0Var.f61585f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f52248c.I;
        if (bVar != null) {
            gl.h.a(bVar.f51752a);
            a0 a0Var = this.f52248c;
            a0Var.F.onAdLoaded(a0Var.I.f51752a);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        a0 a0Var = this.f52248c;
        if (a0Var.D) {
            a0Var.C();
            this.f52248c.F.onAdClose();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        super.onAdSwipeGestureClicked();
    }
}
