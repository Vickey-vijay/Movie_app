package io.bidmachine.unified;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface UnifiedAdCallback {
    void onAdClicked();

    void onAdExpired();

    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdShowFailed(@NonNull BMError bMError);

    void onAdShown();

    void onBrokenCreativeEvent(@Nullable Map<String, Object> map);

    void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
