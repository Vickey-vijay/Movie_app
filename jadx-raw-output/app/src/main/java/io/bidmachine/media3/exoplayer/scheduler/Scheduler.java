package io.bidmachine.media3.exoplayer.scheduler;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public interface Scheduler {
    boolean cancel();

    Requirements getSupportedRequirements(Requirements requirements);

    boolean schedule(Requirements requirements, String str, String str2);
}
