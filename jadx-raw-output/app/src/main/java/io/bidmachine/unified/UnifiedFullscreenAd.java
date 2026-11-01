package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.ContextProvider;

/* JADX INFO: loaded from: classes10.dex */
public abstract class UnifiedFullscreenAd extends UnifiedAd<UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    public void onClosed(boolean z10) {
    }

    public void onFinished() {
    }

    public abstract void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable;
}
