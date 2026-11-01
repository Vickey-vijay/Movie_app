package io.bidmachine.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.BaseRenderer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.extractor.text.CueDecoder;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import io.bidmachine.media3.extractor.text.SubtitleDecoder;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import io.bidmachine.media3.extractor.text.SubtitleInputBuffer;
import io.bidmachine.media3.extractor.text.SubtitleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.Objects;
import sg.a;
import sg.e;
import sg.f;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 1;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "TextRenderer";
    private final CueDecoder cueDecoder;
    private final DecoderInputBuffer cueDecoderInputBuffer;
    private a cuesResolver;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;
    private boolean legacyDecodingEnabled;

    @Nullable
    private SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;

    @Nullable
    private SubtitleInputBuffer nextSubtitleInputBuffer;
    private final TextOutput output;

    @Nullable
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;

    @Nullable
    private Format streamFormat;

    @Nullable
    private SubtitleOutputBuffer subtitle;

    @Nullable
    private SubtitleDecoder subtitleDecoder;
    private final SubtitleDecoderFactory subtitleDecoderFactory;
    private boolean waitingForKeyFrame;

    public TextRenderer(TextOutput textOutput, @Nullable Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.DEFAULT);
    }

    private void initSubtitleDecoder() {
        this.waitingForKeyFrame = true;
        SubtitleDecoder subtitleDecoderCreateDecoder = this.subtitleDecoderFactory.createDecoder((Format) Assertions.checkNotNull(this.streamFormat));
        this.subtitleDecoder = subtitleDecoderCreateDecoder;
        subtitleDecoderCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    private void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.release();
            this.subtitle = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.nextSubtitle;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.release();
            this.nextSubtitle = null;
        }
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

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        clearOutput();
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
        if (this.subtitleDecoder != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
        super.setPlaybackSpeed(f10, f11);
    }

    public TextRenderer(TextOutput textOutput, @Nullable Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.output = (TextOutput) Assertions.checkNotNull(textOutput);
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.subtitleDecoderFactory = subtitleDecoderFactory;
        this.cueDecoder = new CueDecoder();
        this.cueDecoderInputBuffer = new DecoderInputBuffer(1);
        this.formatHolder = new FormatHolder();
        this.finalStreamEndPositionUs = -9223372036854775807L;
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
        this.legacyDecodingEnabled = false;
    }

    private void assertLegacyDecodingEnabledIfRequired() {
        Assertions.checkState(this.legacyDecodingEnabled || Objects.equals(this.streamFormat.sampleMimeType, "application/cea-608") || Objects.equals(this.streamFormat.sampleMimeType, "application/x-mp4-cea-608") || Objects.equals(this.streamFormat.sampleMimeType, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.streamFormat.sampleMimeType + " samples (expected application/x-media3-cues).");
    }

    private void clearOutput() {
        updateOutput(new CueGroup(ImmutableList.of(), getPresentationTimeUs(this.lastRendererPositionUs)));
    }

    private long getCurrentEventTimeUs(long j10) {
        int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
            return this.subtitle.timeUs;
        }
        if (nextEventTimeIndex != -1) {
            return this.subtitle.getEventTime(nextEventTimeIndex - 1);
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.subtitle;
        return subtitleOutputBuffer.getEventTime(subtitleOutputBuffer.getEventTimeCount() - 1);
    }

    private long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        Assertions.checkNotNull(this.subtitle);
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    private void handleDecoderError(SubtitleDecoderException subtitleDecoderException) {
        Log.e(TAG, "Subtitle decoding failed. streamFormat=" + this.streamFormat, subtitleDecoderException);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private void invokeUpdateOutputInternal(CueGroup cueGroup) {
        this.output.onCues(cueGroup.cues);
        this.output.onCues(cueGroup);
    }

    private static boolean isCuesWithTiming(Format format) {
        return Objects.equals(format.sampleMimeType, "application/x-media3-cues");
    }

    private boolean readAndDecodeCuesWithTiming(long j10) {
        if (this.inputStreamEnded || readSource(this.formatHolder, this.cueDecoderInputBuffer, 0) != -4) {
            return false;
        }
        if (this.cueDecoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return false;
        }
        this.cueDecoderInputBuffer.flip();
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.cueDecoderInputBuffer.data);
        CuesWithTiming cuesWithTimingDecode = this.cueDecoder.decode(this.cueDecoderInputBuffer.timeUs, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.cueDecoderInputBuffer.clear();
        return this.cuesResolver.addCues(cuesWithTimingDecode, j10);
    }

    private void renderFromSubtitles(long j10) throws DecoderException {
        boolean z10;
        this.lastRendererPositionUs = j10;
        if (this.nextSubtitle == null) {
            ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).setPositionUs(j10);
            try {
                this.nextSubtitle = (SubtitleOutputBuffer) ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                handleDecoderError(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z10 = false;
            while (nextEventTime <= j10) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.nextSubtitle;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.isEndOfStream()) {
                if (!z10 && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.decoderReplacementState == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.outputStreamEnded = true;
                    }
                }
            } else if (subtitleOutputBuffer.timeUs <= j10) {
                SubtitleOutputBuffer subtitleOutputBuffer2 = this.subtitle;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.release();
                }
                this.nextSubtitleEventIndex = subtitleOutputBuffer.getNextEventTimeIndex(j10);
                this.subtitle = subtitleOutputBuffer;
                this.nextSubtitle = null;
                z10 = true;
            }
        }
        if (z10) {
            Assertions.checkNotNull(this.subtitle);
            updateOutput(new CueGroup(this.subtitle.getCues(j10), getPresentationTimeUs(getCurrentEventTimeUs(j10))));
        }
        if (this.decoderReplacementState == 2) {
            return;
        }
        while (!this.inputStreamEnded) {
            try {
                SubtitleInputBuffer subtitleInputBuffer = this.nextSubtitleInputBuffer;
                if (subtitleInputBuffer == null) {
                    subtitleInputBuffer = (SubtitleInputBuffer) ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).dequeueInputBuffer();
                    if (subtitleInputBuffer == null) {
                        return;
                    } else {
                        this.nextSubtitleInputBuffer = subtitleInputBuffer;
                    }
                }
                if (this.decoderReplacementState == 1) {
                    subtitleInputBuffer.setFlags(4);
                    ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).queueInputBuffer(subtitleInputBuffer);
                    this.nextSubtitleInputBuffer = null;
                    this.decoderReplacementState = 2;
                    return;
                }
                int source = readSource(this.formatHolder, subtitleInputBuffer, 0);
                if (source == -4) {
                    if (subtitleInputBuffer.isEndOfStream()) {
                        this.inputStreamEnded = true;
                        this.waitingForKeyFrame = false;
                    } else {
                        Format format = this.formatHolder.format;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBuffer.subsampleOffsetUs = format.subsampleOffsetUs;
                        subtitleInputBuffer.flip();
                        this.waitingForKeyFrame &= !subtitleInputBuffer.isKeyFrame();
                    }
                    if (!this.waitingForKeyFrame) {
                        ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).queueInputBuffer(subtitleInputBuffer);
                        this.nextSubtitleInputBuffer = null;
                    }
                } else if (source == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                handleDecoderError(e11);
                return;
            }
        }
    }

    private void updateOutput(CueGroup cueGroup) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z10) {
        this.legacyDecodingEnabled = z10;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeUpdateOutputInternal((CueGroup) message.obj);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j10, boolean z10) {
        this.lastRendererPositionUs = j10;
        a aVar = this.cuesResolver;
        if (aVar != null) {
            aVar.clear();
        }
        clearOutput();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        Format format = this.streamFormat;
        if (format == null || isCuesWithTiming(format)) {
            return;
        }
        if (this.decoderReplacementState != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder = (SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder);
        subtitleDecoder.flush();
        subtitleDecoder.setOutputStartTimeUs(getLastResetPositionUs());
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j10, long j11, MediaSource.MediaPeriodId mediaPeriodId) {
        this.outputStreamOffsetUs = j11;
        Format format = formatArr[0];
        this.streamFormat = format;
        if (isCuesWithTiming(format)) {
            this.cuesResolver = this.streamFormat.cueReplacementBehavior == 1 ? new e() : new f();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        ((SubtitleDecoder) Assertions.checkNotNull(this.subtitleDecoder)).release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
    }

    private void renderFromCuesWithTiming(long j10) {
        boolean andDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j10);
        long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !andDecodeCuesWithTiming) {
            this.outputStreamEnded = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j10) {
            andDecodeCuesWithTiming = true;
        }
        if (andDecodeCuesWithTiming) {
            ImmutableList<Cue> cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j10);
            long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j10);
            updateOutput(new CueGroup(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.lastRendererPositionUs = j10;
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.Renderer
    public void render(long j10, long j11) throws DecoderException {
        if (isCurrentStreamFinal()) {
            long j12 = this.finalStreamEndPositionUs;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        if (isCuesWithTiming((Format) Assertions.checkNotNull(this.streamFormat))) {
            Assertions.checkNotNull(this.cuesResolver);
            renderFromCuesWithTiming(j10);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j10);
        }
    }

    public void setFinalStreamEndPositionUs(long j10) {
        Assertions.checkState(isCurrentStreamFinal());
        this.finalStreamEndPositionUs = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.BaseRenderer, io.bidmachine.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        int i10;
        if (!isCuesWithTiming(format) && !this.subtitleDecoderFactory.supportsFormat(format)) {
            if (MimeTypes.isText(format.sampleMimeType)) {
                return RendererCapabilities.create(1);
            }
            return RendererCapabilities.create(0);
        }
        if (format.cryptoType == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return RendererCapabilities.create(i10);
    }

    private long getPresentationTimeUs(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        if (this.outputStreamOffsetUs == -9223372036854775807L) {
            z11 = false;
        }
        Assertions.checkState(z11);
        return j10 - this.outputStreamOffsetUs;
    }
}
