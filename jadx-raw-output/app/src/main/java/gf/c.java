package gf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMBannerAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes7.dex */
public class c extends InternalGAMBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AdSize f53404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private AdManagerAdView f53405b;

    public static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final InternalGAMAd f53406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f53407b;

        private b(@NonNull InternalGAMAd internalGAMAd, @NonNull InternalLoadListener internalLoadListener) {
            this.f53406a = internalGAMAd;
            this.f53407b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalGAMAdPresentListener adPresentListener = this.f53406a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.f53407b.onAdLoadFailed(this.f53406a, new BMError(BMError.NoFill, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalGAMAdPresentListener adPresentListener = this.f53406a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f53406a.onAdLoaded();
            this.f53407b.onAdLoaded(this.f53406a);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }

    public c(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData, @NonNull AdSize adSize) {
        super(gAMLoader, adsFormat, gAMUnitData);
        this.f53404a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @UiThread
    public void destroyAd() {
        AdManagerAdView adManagerAdView = this.f53405b;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f53405b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMBannerAd
    @Nullable
    public View getAdView() {
        return this.f53405b;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @SuppressLint({"MissingPermission"})
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f53405b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f53405b.setAdUnitId(getAdUnitId());
        this.f53405b.setAdListener(new b(this, internalLoadListener));
        this.f53405b.setAdSize(this.f53404a);
        this.f53405b.loadAd(gf.a.a(getGamLoader(), getGamUnitData()));
    }
}
