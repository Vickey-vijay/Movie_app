package dp;

import android.widget.ImageView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f52264b;

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
    }

    public m(e eVar) {
        this.f52264b = eVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        e eVar = this.f52264b;
        if (eVar.D) {
            eVar.C();
            this.f52264b.G.onAdClose();
        }
        this.f52264b.G.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f52264b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f52264b.x(vungleError.getMessage() + ", " + vungleError.getErrorMessage() + ", " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        e eVar = this.f52264b;
        eVar.G.onAdShow(gl.r0.b(null, eVar.f61585f));
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        int i10;
        int i11;
        if (!baseAd.canPlayAd().booleanValue()) {
            this.f52264b.v("");
            return;
        }
        try {
            e eVar = this.f52264b;
            i.e eVar2 = eVar.f61590k;
            if (eVar2 == null || (i10 = eVar2.f54039d) == 0) {
                i10 = 1000;
            }
            int i12 = i10;
            if (eVar2 == null || (i11 = eVar2.f54040e) == 0) {
                i11 = 570;
            }
            eVar.H = new d.i(eVar.F, (NativeAd) baseAd, i12, i11, eVar.B, eVar.C);
            ImageView imageView = this.f52264b.H.f51769d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            e eVar3 = this.f52264b;
            d.i iVar = eVar3.H;
            s sVar = eVar3.L;
            ImageView imageView2 = iVar.f51769d;
            if (imageView2 != null) {
                imageView2.setOnClickListener(sVar);
            }
            gl.h.a(this.f52264b.H.f51766a);
            e eVar4 = this.f52264b;
            eVar4.G.onAdLoaded(eVar4.H.f51766a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.f52264b.v("");
        }
    }
}
