package l;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f63333b;

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }

    public g0(z zVar) {
        this.f63333b = zVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f63333b.C.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f63333b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f63333b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        z zVar = this.f63333b;
        zVar.C.onAdShow(r0.b(null, zVar.f61585f));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        int i10;
        int i11;
        if (baseAd == null || !baseAd.canPlayAd().booleanValue()) {
            this.f63333b.v("");
            return;
        }
        try {
            z zVar = this.f63333b;
            i.e eVar = zVar.f61590k;
            if (eVar == null || (i10 = eVar.f54039d) == 0) {
                i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
            }
            int i12 = i10;
            if (eVar == null || (i11 = eVar.f54040e) == 0) {
                i11 = 465;
            }
            d.i iVar = new d.i(zVar.B, (NativeAd) baseAd, i12, i11, zVar.D, zVar.E);
            gl.h.a(iVar.f51766a);
            this.f63333b.C.onAdLoaded(iVar.f51766a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f63333b.q(e10);
        }
    }
}
