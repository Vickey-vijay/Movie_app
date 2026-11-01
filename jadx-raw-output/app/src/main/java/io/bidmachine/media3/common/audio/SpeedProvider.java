package io.bidmachine.media3.common.audio;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public interface SpeedProvider {
    long getNextSpeedChangeTimeUs(long j10);

    float getSpeed(long j10);
}
