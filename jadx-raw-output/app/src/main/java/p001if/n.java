package p001if;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalInterstitialAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: compiled from: GAMInterstitialAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends l {

    @Nullable
    @VisibleForTesting
    public f0 listener;

    @Override // p001if.l, io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        super.onDestroy();
    }

    /* JADX INFO: compiled from: GAMInterstitialAd.java */
    @VisibleForTesting
    public static final class a extends m<InternalInterstitialAd> implements f0 {
        public a(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull l lVar) {
            super(unifiedFullscreenAdCallback, lVar);
        }
    }

    @Override // p001if.l
    @Nullable
    public InternalFullscreenAdPresentListener getPresentListener() {
        return this.listener;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        a aVar = new a(unifiedFullscreenAdCallback, this);
        this.listener = aVar;
        this.gamNetwork.loadInterstitial(networkAdUnit, aVar);
    }

    public n(@NonNull o oVar) {
        super(oVar);
    }
}
