package io.bidmachine.media3.common;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public interface Effect {
    default long getDurationAfterEffectApplied(long j10) {
        return j10;
    }
}
