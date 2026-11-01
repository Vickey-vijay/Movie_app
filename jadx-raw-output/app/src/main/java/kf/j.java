package kf;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalRewardedAd;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public class j extends InternalRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private RewardedAd f62801a;

    public static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final j f62802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f62803b;

        public b(@NonNull j jVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f62802a = jVar;
            this.f62803b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f62803b.onAdLoadFailed(this.f62802a, n.a(BMError.NoFill, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.f62802a.onBackground(new Runnable() { // from class: kf.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62807b.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull final RewardedAd rewardedAd) {
            rewardedAd.setOnPaidEventListener(new c());
            this.f62802a.f62801a = rewardedAd;
            this.f62802a.onBackground(new Runnable() { // from class: kf.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62805b.a(rewardedAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(RewardedAd rewardedAd) {
            InternalAdLoadData internalAdLoadDataA = n.a(rewardedAd);
            this.f62802a.onAdLoaded(internalAdLoadDataA);
            this.f62803b.onAdLoaded(this.f62802a, internalAdLoadDataA);
        }
    }

    public static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final j f62804a;

        private c(@NonNull j jVar) {
            this.f62804a = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f62804a.onPaidEvent(n.a(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(@NonNull final AdValue adValue) {
            this.f62804a.onBackground(new Runnable() { // from class: kf.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62809b.a(adValue);
                }
            });
        }
    }

    public static final class d implements OnUserEarnedRewardListener {
        private d() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
        }
    }

    public j(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @UiThread
    public void destroyAd() {
        RewardedAd rewardedAd = this.f62801a;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f62801a.setOnPaidEventListener(null);
            this.f62801a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        RewardedAd.load(context, getAdUnitId(), n.a(getAdUnit()), (RewardedAdLoadCallback) new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    @UiThread
    public void showAd(@NonNull Activity activity, @NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        RewardedAd rewardedAd = this.f62801a;
        if (rewardedAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Internal GAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new e(internalFullscreenAdPresentListener));
            this.f62801a.show(activity, new d());
        }
    }
}
