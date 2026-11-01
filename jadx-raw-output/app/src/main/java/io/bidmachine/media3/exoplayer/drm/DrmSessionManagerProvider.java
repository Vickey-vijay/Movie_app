package io.bidmachine.media3.exoplayer.drm;

import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public interface DrmSessionManagerProvider {
    DrmSessionManager get(MediaItem mediaItem);
}
