package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface AdObject<AdObjectParamsType extends AdObjectParams, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, UnifiedAdCallbackType extends UnifiedAdCallback> {
    @NonNull
    UnifiedAdCallbackType createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback);

    @Nullable
    Map<String, Object> getCustomParams();

    AdObjectParamsType getParams();

    void hide();

    void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull NetworkAdUnit networkAdUnit) throws Throwable;

    void onClicked();

    void onClosed(boolean z10);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onImpression();

    void onShowFailed();

    void onShown();
}
