package l;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import gl.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f63321c;

    public d(k kVar) {
        this.f63321c = kVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f63321c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f63321c.B.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        k kVar = this.f63321c;
        kVar.B.onAdShow(r0.b(kVar.E, kVar.f61585f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f63321c.D;
        if (bVar != null) {
            gl.h.a(bVar.f51752a);
            k kVar = this.f63321c;
            kVar.B.onAdLoaded(kVar.D.f51752a);
        }
    }
}
