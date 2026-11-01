package f;

import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f52757b;

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }

    public u(i iVar) {
        this.f52757b = iVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f52757b.E.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f52757b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f52757b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        i iVar = this.f52757b;
        iVar.E.onAdShow(r0.b(null, iVar.f61585f));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        int i10;
        int i11;
        if (!baseAd.canPlayAd().booleanValue()) {
            this.f52757b.v("");
            return;
        }
        try {
            i iVar = this.f52757b;
            i.e eVar = iVar.f61590k;
            if (eVar == null || (i10 = eVar.f54039d) == 0) {
                i10 = 1000;
            }
            int i12 = i10;
            if (eVar == null || (i11 = eVar.f54040e) == 0) {
                i11 = 570;
            }
            d.i iVar2 = new d.i(iVar.D, (NativeAd) baseAd, i12, i11, iVar.B, iVar.C);
            gl.h.a(iVar2.f51766a);
            this.f52757b.E.onAdLoaded(iVar2.f51766a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f52757b.v("");
        }
    }
}
