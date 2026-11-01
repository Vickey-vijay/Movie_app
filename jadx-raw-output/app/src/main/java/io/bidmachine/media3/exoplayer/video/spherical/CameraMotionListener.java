package io.bidmachine.media3.exoplayer.video.spherical;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface CameraMotionListener {
    void onCameraMotion(long j10, float[] fArr);

    void onCameraMotionReset();
}
