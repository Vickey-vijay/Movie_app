package io.bidmachine.unified;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class UnifiedAd<UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    @Nullable
    public Map<String, Object> getCustomParams() {
        return null;
    }

    public abstract void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdCallbackType unifiedadcallbacktype, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable;

    public void onClicked() {
    }

    public void onDestroy() {
    }

    public void onExpired() {
    }

    public void onImpression() {
    }

    public void onShowFailed() {
    }

    public void onShown() {
    }
}
