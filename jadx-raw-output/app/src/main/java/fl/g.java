package fl;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f52971c;

    public g(n nVar) {
        this.f52971c = nVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f52971c.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f52971c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        n nVar = this.f52971c;
        MainThirdBannerCallBack mainThirdBannerCallBack = nVar.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdShow(nVar.I);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        n nVar = this.f52971c;
        if (nVar.J) {
            return;
        }
        nVar.J = true;
        nVar.G.setOnPaidEventListener(new a(this));
        n nVar2 = this.f52971c;
        MainThirdBannerCallBack mainThirdBannerCallBack = nVar2.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdLoaded(nVar2.H);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        super.onAdSwipeGestureClicked();
        AdLog.d(this.f52971c.E, "onAdSwipeGestureClicked");
    }
}
