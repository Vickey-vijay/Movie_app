package io.bidmachine.media3.exoplayer.video;

import android.view.Surface;
import io.bidmachine.media3.common.util.Size;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public interface VideoSinkProvider {
    void clearOutputSurfaceInfo();

    VideoSink getSink();

    VideoFrameReleaseControl getVideoFrameReleaseControl();

    void release();

    void setOutputSurfaceInfo(Surface surface, Size size);
}
