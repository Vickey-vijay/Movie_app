package io.bidmachine.unified;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedParams {

    @NonNull
    private final UnifiedMediationParams mediationParams;

    public abstract boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback);

    @NonNull
    public UnifiedMediationParams getMediationParams() {
        return this.mediationParams;
    }

    public UnifiedParams(@NonNull UnifiedMediationParams unifiedMediationParams) {
        this.mediationParams = unifiedMediationParams;
    }
}
