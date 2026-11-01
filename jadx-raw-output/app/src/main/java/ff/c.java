package ff;

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

/* JADX INFO: loaded from: classes6.dex */
public class c extends InternalGAMBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AdSize f52946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private AdManagerAdView f52947b;

    public static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final InternalGAMAd f52948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f52949b;

        private b(@NonNull InternalGAMAd internalGAMAd, @NonNull InternalLoadListener internalLoadListener) {
            this.f52948a = internalGAMAd;
            this.f52949b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalGAMAdPresentListener adPresentListener = this.f52948a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.f52949b.onAdLoadFailed(this.f52948a, new BMError(BMError.NoFill, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalGAMAdPresentListener adPresentListener = this.f52948a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f52948a.onAdLoaded();
            this.f52949b.onAdLoaded(this.f52948a);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }

    public c(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData, @NonNull AdSize adSize) {
        super(gAMLoader, adsFormat, gAMUnitData);
        this.f52946a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @UiThread
    public void destroyAd() {
        AdManagerAdView adManagerAdView = this.f52947b;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f52947b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMBannerAd
    @Nullable
    public View getAdView() {
        return this.f52947b;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @SuppressLint({"MissingPermission"})
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f52947b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f52947b.setAdUnitId(getAdUnitId());
        this.f52947b.setAdListener(new b(this, internalLoadListener));
        this.f52947b.setAdSize(this.f52946a);
        this.f52947b.loadAd(ff.a.a(getGamLoader(), getGamUnitData()));
    }
}
