package io.bidmachine.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.BaseRenderer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class CameraMotionRenderer extends BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private static final String TAG = "CameraMotionRenderer";
    private final DecoderInputBuffer buffer;
    private long lastTimestampUs;

    @Nullable
    private CameraMotionListener listener;
    private long offsetUs;
    private final ParsableByteArray scratch;

    public CameraMotionRenderer() {
        super(6);
        this.buffer = new DecoderInputBuffer(1);
        this.scratch = new ParsableByteArray();
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer, io.bidmachine.media3.exoplayer.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
        super.setPlaybackSpeed(f10, f11);
    }

    private void resetListener() {
        CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer, io.bidmachine.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.listener = (CameraMotionListener) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j10, boolean z10) {
        this.lastTimestampUs = Long.MIN_VALUE;
        resetListener();
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j10, long j11, MediaSource.MediaPeriodId mediaPeriodId) {
        this.offsetUs = j11;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        return "application/x-camera-motion".equals(format.sampleMimeType) ? RendererCapabilities.create(4) : RendererCapabilities.create(0);
    }

    @Nullable
    private float[] parseMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.scratch.reset(byteBuffer.array(), byteBuffer.limit());
        this.scratch.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.scratch.readLittleEndianInt());
        }
        return fArr;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        resetListener();
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public void render(long j10, long j11) {
        while (!hasReadStreamToEnd() && this.lastTimestampUs < 100000 + j10) {
            this.buffer.clear();
            boolean z10 = false;
            if (readSource(getFormatHolder(), this.buffer, 0) == -4 && !this.buffer.isEndOfStream()) {
                long j12 = this.buffer.timeUs;
                this.lastTimestampUs = j12;
                if (j12 < getLastResetPositionUs()) {
                    z10 = true;
                }
                if (this.listener != null && !z10) {
                    this.buffer.flip();
                    float[] metadata = parseMetadata((ByteBuffer) Util.castNonNull(this.buffer.data));
                    if (metadata != null) {
                        ((CameraMotionListener) Util.castNonNull(this.listener)).onCameraMotion(this.lastTimestampUs - this.offsetUs, metadata);
                    }
                }
            } else {
                return;
            }
        }
    }
}
