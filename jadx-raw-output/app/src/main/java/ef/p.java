package ef;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.InternalGAMRewardedAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMRewarded.java */
/* JADX INFO: loaded from: classes6.dex */
public class p extends UnifiedFullscreenAd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @NonNull
    private final n gamNetwork;

    @Nullable
    private InternalGAMRewardedAd gamRewardedAd;

    @Nullable
    private b listener;

    /* JADX INFO: compiled from: GAMRewarded.java */
    public static final class b extends c<InternalGAMRewardedAd> implements b0 {

        @NonNull
        private final p gamRewarded;

        private b(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull p pVar) {
            super(unifiedFullscreenAdCallback);
            this.gamRewarded = pVar;
        }

        @Override // ef.c
        public void onAdLoaded(@NonNull InternalGAMRewardedAd internalGAMRewardedAd) {
            this.gamRewarded.gamRewardedAd = internalGAMRewardedAd;
            super.onAdLoaded(internalGAMRewardedAd);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd != null) {
            internalGAMRewardedAd.destroy();
            this.gamRewardedAd = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new o(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            b bVar = new b(unifiedFullscreenAdCallback, this);
            this.listener = bVar;
            this.gamNetwork.loadRewarded(networkAdUnit, bVar);
        }
    }

    public p(@NonNull n nVar) {
        this.gamNetwork = nVar;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd != null) {
            internalGAMRewardedAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded object is null"));
            return;
        }
        if (internalGAMRewardedAd.isExpired()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded object is expired"));
            return;
        }
        if (!this.gamRewardedAd.isLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded object not loaded"));
            return;
        }
        b bVar = this.listener;
        if (bVar == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded listener is null"));
        } else {
            this.gamRewardedAd.show(activity, bVar);
        }
    }
}
