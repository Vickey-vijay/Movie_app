package yc;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: compiled from: ScarInterstitialAdListener.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends yc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f85690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oc.g f85691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f85692d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f85693e = new b();

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f85691c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f85693e);
            f.this.f85690b.c(interstitialAd);
            qc.b bVar = f.this.f85681a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f85691c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f85691c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f85691c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f85691c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f85691c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f85691c.onAdOpened();
        }
    }

    public InterstitialAdLoadCallback e() {
        return this.f85692d;
    }

    public f(oc.g gVar, e eVar) {
        this.f85691c = gVar;
        this.f85690b = eVar;
    }
}
