package ef;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.InternalGAMInterstitialAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMInterstitial.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends UnifiedFullscreenAd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InternalGAMInterstitialAd gamInterstitialAd;

    @NonNull
    private final n gamNetwork;

    @Nullable
    private b listener;

    /* JADX INFO: compiled from: GAMInterstitial.java */
    public static final class b extends c<InternalGAMInterstitialAd> implements a0 {

        @NonNull
        private final d gamInterstitial;

        private b(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull d dVar) {
            super(unifiedFullscreenAdCallback);
            this.gamInterstitial = dVar;
        }

        @Override // ef.c
        public void onAdLoaded(@NonNull InternalGAMInterstitialAd internalGAMInterstitialAd) {
            this.gamInterstitial.gamInterstitialAd = internalGAMInterstitialAd;
            super.onAdLoaded(internalGAMInterstitialAd);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd != null) {
            internalGAMInterstitialAd.destroy();
            this.gamInterstitialAd = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new o(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            b bVar = new b(unifiedFullscreenAdCallback, this);
            this.listener = bVar;
            this.gamNetwork.loadInterstitial(networkAdUnit, bVar);
        }
    }

    public d(@NonNull n nVar) {
        this.gamNetwork = nVar;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd != null) {
            internalGAMInterstitialAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial object is null"));
            return;
        }
        if (internalGAMInterstitialAd.isExpired()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial object is expired"));
            return;
        }
        if (!this.gamInterstitialAd.isLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial object not loaded"));
            return;
        }
        b bVar = this.listener;
        if (bVar == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial listener is null"));
        } else {
            this.gamInterstitialAd.show(activity, bVar);
        }
    }
}
