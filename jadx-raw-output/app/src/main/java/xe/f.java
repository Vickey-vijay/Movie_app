package xe;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f74443c;

    public f(j jVar) {
        this.f74443c = jVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        super.onAdLoaded(interstitialAd2);
        j jVar = this.f74443c;
        jVar.E = interstitialAd2;
        jVar.E();
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f74443c.x(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }
}
