package gf;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMRewardedAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes7.dex */
public class e extends InternalGAMRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private RewardedAd f53411a;

    public static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final e f53412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f53413b;

        public b(@NonNull e eVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f53412a = eVar;
            this.f53413b = internalLoadListener;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.f53413b.onAdLoadFailed(this.f53412a, new BMError(BMError.NoFill, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            this.f53412a.f53411a = rewardedAd;
            this.f53412a.onAdLoaded();
            this.f53413b.onAdLoaded(this.f53412a);
        }
    }

    public static final class c implements OnUserEarnedRewardListener {
        private c() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
        }
    }

    public e(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @UiThread
    public void destroyAd() {
        RewardedAd rewardedAd = this.f53411a;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f53411a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        RewardedAd.load(context, getAdUnitId(), gf.a.a(getGamLoader(), getGamUnitData()), (RewardedAdLoadCallback) new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd
    @UiThread
    public void showAd(@NonNull Activity activity, @NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        RewardedAd rewardedAd = this.f53411a;
        if (rewardedAd == null) {
            internalGAMFullscreenAdPresentListener.onAdShowFailed(BMError.internal("InternalGAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new gf.b(internalGAMFullscreenAdPresentListener));
            this.f53411a.show(activity, new c());
        }
    }
}
