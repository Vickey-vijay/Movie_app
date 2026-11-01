package io.bidmachine.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecInfo;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable Surface surface) {
        boolean z10;
        super(th2, mediaCodecInfo);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.isSurfaceValid = z10;
    }
}
