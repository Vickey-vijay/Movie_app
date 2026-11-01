package io.bidmachine.media3.exoplayer;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.SampleStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private Clock clock;

    @Nullable
    private RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private PlayerId playerId;

    @Nullable
    @GuardedBy("lock")
    private RendererCapabilities.Listener rendererCapabilitiesListener;
    private int state;

    @Nullable
    private SampleStream stream;

    @Nullable
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final Object lock = new Object();
    private final FormatHolder formatHolder = new FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;
    private Timeline timeline = Timeline.EMPTY;

    public final ExoPlaybackException createRendererException(Throwable th2, @Nullable Format format, int i10) {
        return createRendererException(th2, format, false, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j10, boolean z10, boolean z11, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z10, z11);
        replaceStream(formatArr, sampleStream, j11, j12, mediaPeriodId);
        resetPosition(j11, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer, io.bidmachine.media3.exoplayer.RendererCapabilities
    public abstract /* synthetic */ String getName();

    @Override // io.bidmachine.media3.exoplayer.Renderer, io.bidmachine.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public abstract /* synthetic */ boolean isEnded();

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public abstract /* synthetic */ boolean isReady();

    public void onDisabled() {
    }

    public void onEnabled(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    public void onInit() {
    }

    public void onPositionReset(long j10, boolean z10) throws ExoPlaybackException {
    }

    public void onRelease() {
    }

    public void onReset() {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() {
    }

    public void onStreamChanged(Format[] formatArr, long j10, long j11, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
    }

    public void onTimelineChanged(Timeline timeline) {
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public abstract /* synthetic */ void render(long j10, long j11) throws ExoPlaybackException;

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void resetPosition(long j10) throws ExoPlaybackException {
        resetPosition(j10, false);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilities
    public abstract /* synthetic */ int supportsFormat(Format format) throws ExoPlaybackException;

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    private void resetPosition(long j10, boolean z10) throws ExoPlaybackException {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j10;
        this.readingPositionUs = j10;
        onPositionReset(j10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    public final ExoPlaybackException createRendererException(Throwable th2, @Nullable Format format, boolean z10, int i10) {
        int formatSupport;
        if (format == null || this.throwRendererExceptionIsExecuting) {
            formatSupport = 4;
        } else {
            this.throwRendererExceptionIsExecuting = true;
            try {
                formatSupport = RendererCapabilities.getFormatSupport(supportsFormat(format));
                this.throwRendererExceptionIsExecuting = false;
            } catch (ExoPlaybackException unused) {
                this.throwRendererExceptionIsExecuting = false;
                formatSupport = 4;
            } catch (Throwable th3) {
                this.throwRendererExceptionIsExecuting = false;
                throw th3;
            }
        }
        return ExoPlaybackException.createForRenderer(th2, getName(), getIndex(), format, formatSupport, z10, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.checkState(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    public final Clock getClock() {
        return (Clock) Assertions.checkNotNull(this.clock);
    }

    public final RendererConfiguration getConfiguration() {
        return (RendererConfiguration) Assertions.checkNotNull(this.configuration);
    }

    public final FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    public final PlayerId getPlayerId() {
        return (PlayerId) Assertions.checkNotNull(this.playerId);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.stream;
    }

    public final Format[] getStreamFormats() {
        return (Format[]) Assertions.checkNotNull(this.streamFormats);
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer, io.bidmachine.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void init(int i10, PlayerId playerId, Clock clock) {
        this.index = i10;
        this.playerId = playerId;
        this.clock = clock;
        onInit();
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() throws IOException {
        ((SampleStream) Assertions.checkNotNull(this.stream)).maybeThrowError();
    }

    public final void onRendererCapabilitiesChanged() {
        RendererCapabilities.Listener listener;
        synchronized (this.lock) {
            listener = this.rendererCapabilitiesListener;
        }
        if (listener != null) {
            listener.onRendererCapabilitiesChanged(this);
        }
    }

    public final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
        int data = ((SampleStream) Assertions.checkNotNull(this.stream)).readData(formatHolder, decoderInputBuffer, i10);
        if (data == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            long j10 = decoderInputBuffer.timeUs + this.streamOffsetUs;
            decoderInputBuffer.timeUs = j10;
            this.readingPositionUs = Math.max(this.readingPositionUs, j10);
        } else if (data == -5) {
            Format format = (Format) Assertions.checkNotNull(formatHolder.format);
            if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs).build();
            }
        }
        return data;
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void release() {
        Assertions.checkState(this.state == 0);
        onRelease();
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j10, long j11, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j10;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j11;
        onStreamChanged(formatArr, j10, j11, mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.checkState(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // io.bidmachine.media3.exoplayer.RendererCapabilities
    public final void setListener(RendererCapabilities.Listener listener) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = listener;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void setTimeline(Timeline timeline) {
        if (Util.areEqual(this.timeline, timeline)) {
            return;
        }
        this.timeline = timeline;
        onTimelineChanged(timeline);
    }

    public int skipSource(long j10) {
        return ((SampleStream) Assertions.checkNotNull(this.stream)).skipData(j10 - this.streamOffsetUs);
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // io.bidmachine.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    public BaseRenderer(int i10) {
        this.trackType = i10;
    }

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        return ((SampleStream) Assertions.checkNotNull(this.stream)).isReady();
    }
}
