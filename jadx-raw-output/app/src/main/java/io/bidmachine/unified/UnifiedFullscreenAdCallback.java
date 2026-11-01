package io.bidmachine.unified;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface UnifiedFullscreenAdCallback extends UnifiedAdCallback {
    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdClicked();

    void onAdClosed();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdExpired();

    void onAdFinished();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdShown();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onBrokenCreativeEvent(@Nullable Map<String, Object> map);

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
