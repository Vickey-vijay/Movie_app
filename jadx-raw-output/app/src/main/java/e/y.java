package e;

import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f52312b;

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }

    public y(u uVar) {
        this.f52312b = uVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f52312b.M.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f52312b.v(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f52312b.v(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        u uVar = this.f52312b;
        uVar.M.onAdShow(r0.b(null, uVar.f61585f));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        if (baseAd == null || !baseAd.canPlayAd().booleanValue()) {
            this.f52312b.v("");
            return;
        }
        try {
            int dimensionPixelOffset = this.f52312b.L.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f52312b.L, "dp_135"));
            d.i iVar = new d.i(this.f52312b.L, (NativeAd) baseAd, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
            gl.h.a(iVar.f51766a);
            this.f52312b.M.onAdLoaded(iVar.f51766a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f52312b.v("");
        }
    }
}
