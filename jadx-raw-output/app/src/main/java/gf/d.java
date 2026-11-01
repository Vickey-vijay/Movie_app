package gf;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMInterstitialAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes7.dex */
public class d extends InternalGAMInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private AdManagerInterstitialAd f53408a;

    public static final class a extends AdManagerInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final d f53409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f53410b;

        public a(@NonNull d dVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f53409a = dVar;
            this.f53410b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.f53410b.onAdLoadFailed(this.f53409a, new BMError(BMError.NoFill, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull AdManagerInterstitialAd adManagerInterstitialAd) {
            this.f53409a.f53408a = adManagerInterstitialAd;
            this.f53409a.onAdLoaded();
            this.f53410b.onAdLoaded(this.f53409a);
        }
    }

    public d(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @UiThread
    public void destroyAd() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f53408a;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f53408a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), gf.a.a(getGamLoader(), getGamUnitData()), new a(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd
    @UiThread
    public void showAd(@NonNull Activity activity, @NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f53408a;
        if (adManagerInterstitialAd == null) {
            internalGAMFullscreenAdPresentListener.onAdShowFailed(BMError.internal("InternalGAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new b(internalGAMFullscreenAdPresentListener));
            this.f53408a.show(activity);
        }
    }
}
