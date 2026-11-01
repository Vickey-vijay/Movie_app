package p001if;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalRewardedAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: compiled from: GAMRewardedAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class t extends l {

    @Nullable
    @VisibleForTesting
    public g0 listener;

    @Override // p001if.l, io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        super.onDestroy();
    }

    /* JADX INFO: compiled from: GAMRewardedAd.java */
    @VisibleForTesting
    public static final class a extends m<InternalRewardedAd> implements g0 {
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
        this.gamNetwork.loadRewarded(networkAdUnit, aVar);
    }

    public t(@NonNull o oVar) {
        super(oVar);
    }
}
