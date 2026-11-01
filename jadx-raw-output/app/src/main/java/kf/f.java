package kf;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalInterstitialAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes10.dex */
public class f extends InternalInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private AdManagerInterstitialAd f62791a;

    public static final class b extends AdManagerInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final f f62792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f62793b;

        public b(@NonNull f fVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f62792a = fVar;
            this.f62793b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f62793b.onAdLoadFailed(this.f62792a, n.a(BMError.NoFill, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.f62792a.onBackground(new Runnable() { // from class: kf.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62797b.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull final AdManagerInterstitialAd adManagerInterstitialAd) {
            adManagerInterstitialAd.setOnPaidEventListener(new c());
            this.f62792a.f62791a = adManagerInterstitialAd;
            this.f62792a.onBackground(new Runnable() { // from class: kf.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62795b.a(adManagerInterstitialAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdManagerInterstitialAd adManagerInterstitialAd) {
            InternalAdLoadData internalAdLoadDataA = n.a(adManagerInterstitialAd);
            this.f62792a.onAdLoaded(internalAdLoadDataA);
            this.f62793b.onAdLoaded(this.f62792a, internalAdLoadDataA);
        }
    }

    public static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final f f62794a;

        private c(@NonNull f fVar) {
            this.f62794a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f62794a.onPaidEvent(n.a(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(@NonNull final AdValue adValue) {
            this.f62794a.onBackground(new Runnable() { // from class: kf.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62799b.a(adValue);
                }
            });
        }
    }

    public f(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @UiThread
    public void destroyAd() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f62791a;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f62791a.setOnPaidEventListener(null);
            this.f62791a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), n.a(getAdUnit()), new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    @UiThread
    public void showAd(@NonNull Activity activity, @NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f62791a;
        if (adManagerInterstitialAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Internal GAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new e(internalFullscreenAdPresentListener));
            this.f62791a.show(activity);
        }
    }
}
