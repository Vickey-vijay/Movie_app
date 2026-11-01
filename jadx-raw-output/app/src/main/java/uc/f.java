package uc;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: compiled from: ScarInterstitialAdListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends uc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f72815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oc.g f72816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f72817d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f72818e = new b();

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f72816c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f72818e);
            f.this.f72815b.c(interstitialAd);
            qc.b bVar = f.this.f72806a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f72816c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f72816c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f72816c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f72816c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f72816c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f72816c.onAdOpened();
        }
    }

    public InterstitialAdLoadCallback e() {
        return this.f72817d;
    }

    public f(oc.g gVar, e eVar) {
        this.f72816c = gVar;
        this.f72815b = eVar;
    }
}
