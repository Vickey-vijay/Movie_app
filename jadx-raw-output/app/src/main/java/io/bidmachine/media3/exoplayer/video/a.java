package io.bidmachine.media3.exoplayer.video;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.LongArrayQueue;
import io.bidmachine.media3.common.util.TimedValueQueue;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: VideoFrameRenderControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final InterfaceC0508a frameRenderer;
    private long outputStreamOffsetUs;

    @Nullable
    private VideoSize pendingOutputVideoSize;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final TimedValueQueue<VideoSize> videoSizeChanges = new TimedValueQueue<>();
    private final TimedValueQueue<Long> streamOffsets = new TimedValueQueue<>();
    private final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    private VideoSize reportedVideoSize = VideoSize.UNKNOWN;
    private long lastPresentationTimeUs = -9223372036854775807L;

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.video.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoFrameRenderControl.java */
    public interface InterfaceC0508a {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j10, long j11, long j12, boolean z10);
    }

    public void render(long j10, long j11) throws ExoPlaybackException {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long jElement = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStreamOffset(jElement)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(jElement, j10, j11, this.outputStreamOffsetUs, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.lastPresentationTimeUs = jElement;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction != 2 && frameReleaseAction != 3 && frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new IllegalStateException(String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                this.lastPresentationTimeUs = jElement;
                dropFrame();
            }
        }
    }

    public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        Assertions.checkArgument(f10 > 0.0f);
        this.videoFrameReleaseControl.setPlaybackSpeed(f10);
    }

    private void dropFrame() {
        Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()));
        this.frameRenderer.dropFrame();
    }

    private boolean maybeUpdateOutputStreamOffset(long j10) {
        Long lPollFloor = this.streamOffsets.pollFloor(j10);
        if (lPollFloor == null || lPollFloor.longValue() == this.outputStreamOffsetUs) {
            return false;
        }
        this.outputStreamOffsetUs = lPollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateVideoSize(long j10) {
        VideoSize videoSizePollFloor = this.videoSizeChanges.pollFloor(j10);
        if (videoSizePollFloor == null || videoSizePollFloor.equals(VideoSize.UNKNOWN) || videoSizePollFloor.equals(this.reportedVideoSize)) {
            return false;
        }
        this.reportedVideoSize = videoSizePollFloor;
        return true;
    }

    private void renderFrame(boolean z10) {
        long jLongValue = ((Long) Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()))).longValue();
        if (maybeUpdateVideoSize(jLongValue)) {
            this.frameRenderer.onVideoSizeChanged(this.reportedVideoSize);
        }
        this.frameRenderer.renderFrame(z10 ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), jLongValue, this.outputStreamOffsetUs, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.lastPresentationTimeUs = -9223372036854775807L;
        if (this.streamOffsets.size() > 0) {
            this.streamOffsets.add(0L, Long.valueOf(((Long) getLastAndClear(this.streamOffsets)).longValue()));
        }
        if (this.pendingOutputVideoSize != null) {
            this.videoSizeChanges.clear();
        } else if (this.videoSizeChanges.size() > 0) {
            this.pendingOutputVideoSize = (VideoSize) getLastAndClear(this.videoSizeChanges);
        }
    }

    public boolean hasReleasedFrame(long j10) {
        long j11 = this.lastPresentationTimeUs;
        return j11 != -9223372036854775807L && j11 >= j10;
    }

    public boolean isReady() {
        return this.videoFrameReleaseControl.isReady(true);
    }

    public void onOutputFrameAvailableForRendering(long j10) {
        VideoSize videoSize = this.pendingOutputVideoSize;
        if (videoSize != null) {
            this.videoSizeChanges.add(j10, videoSize);
            this.pendingOutputVideoSize = null;
        }
        this.presentationTimestampsUs.add(j10);
    }

    public void onOutputSizeChanged(int i10, int i11) {
        VideoSize videoSize = new VideoSize(i10, i11);
        if (Util.areEqual(this.pendingOutputVideoSize, videoSize)) {
            return;
        }
        this.pendingOutputVideoSize = videoSize;
    }

    public void onStreamOffsetChange(long j10, long j11) {
        this.streamOffsets.add(j10, Long.valueOf(j11));
    }

    public a(InterfaceC0508a interfaceC0508a, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = interfaceC0508a;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
    }

    private static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        boolean z10;
        if (timedValueQueue.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        return (T) Assertions.checkNotNull(timedValueQueue.pollFirst());
    }
}
