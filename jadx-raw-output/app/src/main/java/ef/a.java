package ef;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.InternalGAMBannerAd;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: compiled from: GAMBanner.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends UnifiedBannerAd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InternalGAMBannerAd gamBannerAd;

    @NonNull
    private final n gamNetwork;

    @Nullable
    private y listener;

    /* JADX INFO: compiled from: GAMBanner.java */
    public static final class b extends ef.b<InternalGAMBannerAd, UnifiedBannerAdCallback> implements y {

        @NonNull
        private final a gamBanner;

        private b(@NonNull a aVar, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback) {
            super(unifiedBannerAdCallback);
            this.gamBanner = aVar;
        }

        @Override // ef.b, ef.x, ef.y
        public void onAdLoaded(@NonNull InternalGAMBannerAd internalGAMBannerAd) {
            this.gamBanner.gamBannerAd = internalGAMBannerAd;
            getCallback().onAdLoaded(internalGAMBannerAd.getAdView());
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalGAMBannerAd internalGAMBannerAd = this.gamBannerAd;
        if (internalGAMBannerAd != null) {
            internalGAMBannerAd.destroy();
            this.gamBannerAd = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new o(unifiedMediationParams).isValid(unifiedBannerAdCallback)) {
            if (!this.gamNetwork.isOverrideCallbacks()) {
                unifiedBannerAdCallback.setVisibilitySource(VisibilitySource.BidMachine);
            }
            b bVar = new b(unifiedBannerAdCallback);
            this.listener = bVar;
            this.gamNetwork.loadBanner(networkAdUnit, bVar);
        }
    }

    public a(@NonNull n nVar) {
        this.gamNetwork = nVar;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalGAMBannerAd internalGAMBannerAd = this.gamBannerAd;
        if (internalGAMBannerAd != null) {
            internalGAMBannerAd.onAdShown();
        }
    }
}
