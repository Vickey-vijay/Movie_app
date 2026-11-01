package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public interface MediaClock {
    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    default boolean hasSkippedSilenceSinceLastCall() {
        return false;
    }

    void setPlaybackParameters(PlaybackParameters playbackParameters);
}
