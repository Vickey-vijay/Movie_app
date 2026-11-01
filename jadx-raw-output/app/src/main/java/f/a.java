package f;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import gl.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f52730c;

    public a(z zVar) {
        this.f52730c = zVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f52730c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f52730c.D.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        z zVar = this.f52730c;
        zVar.D.onAdShow(r0.b(zVar.G, zVar.f61585f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f52730c.F;
        if (bVar != null) {
            gl.h.a(bVar.f51752a);
            z zVar = this.f52730c;
            zVar.D.onAdLoaded(zVar.F.f51752a);
        }
    }
}
