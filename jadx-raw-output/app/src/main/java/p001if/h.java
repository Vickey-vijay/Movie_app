package p001if;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* JADX INFO: compiled from: GAMBannerAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends UnifiedBannerAd {

    @NonNull
    private final o gamNetwork;

    @Nullable
    @VisibleForTesting
    public InternalBannerAd internalBannerAd;

    @Nullable
    @VisibleForTesting
    public d0 listener;

    /* JADX INFO: compiled from: GAMBannerAd.java */
    @VisibleForTesting
    public static final class a extends i<InternalBannerAd, UnifiedBannerAdCallback> implements d0 {

        @NonNull
        private final h gamBannerAd;

        @Override // p001if.i, p001if.c0
        public void onAdLoaded(@NonNull InternalBannerAd internalBannerAd) {
            this.gamBannerAd.internalBannerAd = internalBannerAd;
            if (internalBannerAd.getAdUnit().getOverrideCallbacks()) {
                getCallback().setVisibilitySource(VisibilitySource.BidMachine);
            }
            getCallback().onAdLoaded(internalBannerAd.getAdView());
        }

        public a(@NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull h hVar) {
            super(unifiedBannerAdCallback);
            this.gamBannerAd = hVar;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            internalBannerAd.destroy();
            this.internalBannerAd = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    @Nullable
    public Map<String, Object> getCustomParams() {
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            return internalBannerAd.getCustomParamsMap();
        }
        return null;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        a aVar = new a(unifiedBannerAdCallback, this);
        this.listener = aVar;
        this.gamNetwork.loadBanner(networkAdUnit, aVar);
    }

    public h(@NonNull o oVar) {
        this.gamNetwork = oVar;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            internalBannerAd.onAdShown();
        }
    }
}
