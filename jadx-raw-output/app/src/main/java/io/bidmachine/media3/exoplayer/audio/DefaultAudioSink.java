package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.r2;
import eg.o;
import eg.u;
import eg.v;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.AuxEffectInfo;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.audio.AudioProcessingPipeline;
import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.common.audio.ToInt16PcmAudioProcessor;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.ConditionVariable;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.audio.AudioCapabilities;
import io.bidmachine.media3.exoplayer.audio.DefaultAudioSink;
import io.bidmachine.media3.extractor.Ac3Util;
import io.bidmachine.media3.extractor.Ac4Util;
import io.bidmachine.media3.extractor.DtsUtil;
import io.bidmachine.media3.extractor.MpegAudioUtil;
import io.bidmachine.media3.extractor.OpusUtil;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;

    @GuardedBy("releaseExecutorLock")
    private static int pendingReleaseCount;

    @Nullable
    @GuardedBy("releaseExecutorLock")
    private static ExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private long accumulatedSkippedSilenceDurationUs;

    @Nullable
    private e afterDrainParameters;
    private AudioAttributes audioAttributes;
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;

    @Nullable
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final AudioOffloadSupportProvider audioOffloadSupportProvider;
    private AudioProcessingPipeline audioProcessingPipeline;
    private final io.bidmachine.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;

    @Nullable
    private AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;

    @Nullable
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final o channelMappingAudioProcessor;
    private d configuration;

    @Nullable
    private final Context context;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final g<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;

    @Nullable
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private long lastTunnelingAvSyncPresentationTimeUs;

    @Nullable
    private AudioSink.Listener listener;
    private e mediaPositionParameters;
    private final ArrayDeque<e> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private i offloadStreamEventCallbackV29;

    @Nullable
    private f onRoutingChangedListener;

    @Nullable
    private ByteBuffer outputBuffer;

    @Nullable
    private d pendingConfiguration;

    @Nullable
    private Looper playbackLooper;
    private PlaybackParameters playbackParameters;

    @Nullable
    private PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private final boolean preferAudioTrackPlaybackParams;

    @Nullable
    private eg.a preferredDevice;
    private final ConditionVariable releasingConditionVariable;
    private Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final ImmutableList<AudioProcessor> toFloatPcmAvailableAudioProcessors;
    private final ImmutableList<AudioProcessor> toIntPcmAvailableAudioProcessors;
    private final v trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final g<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes);
    }

    @Deprecated
    public interface AudioProcessorChain extends io.bidmachine.media3.common.audio.AudioProcessorChain {
        @Override // io.bidmachine.media3.common.audio.AudioProcessorChain
        /* synthetic */ PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        @Override // io.bidmachine.media3.common.audio.AudioProcessorChain
        /* synthetic */ boolean applySkipSilenceEnabled(boolean z10);

        @Override // io.bidmachine.media3.common.audio.AudioProcessorChain
        /* synthetic */ AudioProcessor[] getAudioProcessors();

        @Override // io.bidmachine.media3.common.audio.AudioProcessorChain
        /* synthetic */ long getMediaDuration(long j10);

        @Override // io.bidmachine.media3.common.audio.AudioProcessorChain
        /* synthetic */ long getSkippedOutputFrameCount();
    }

    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public static final class Builder {
        private AudioCapabilities audioCapabilities;

        @Nullable
        private ExoPlayer.AudioOffloadListener audioOffloadListener;
        private AudioOffloadSupportProvider audioOffloadSupportProvider;

        @Nullable
        private io.bidmachine.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private boolean buildCalled;

        @Nullable
        private final Context context;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;

        @Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
        }

        public DefaultAudioSink build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new DefaultAudioSink(this);
        }

        public Builder setAudioOffloadSupportProvider(AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setEnableAudioTrackPlaybackParams(boolean z10) {
            this.enableAudioTrackPlaybackParams = z10;
            return this;
        }

        public Builder setEnableFloatOutput(boolean z10) {
            this.enableFloatOutput = z10;
            return this;
        }

        public Builder setExperimentalAudioOffloadListener(@Nullable ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        @Deprecated
        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public Builder setAudioProcessorChain(io.bidmachine.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }

        public Builder(Context context) {
            this.context = context;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final io.bidmachine.media3.common.audio.SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new io.bidmachine.media3.common.audio.SonicAudioProcessor());
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, io.bidmachine.media3.common.audio.SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, io.bidmachine.media3.common.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, io.bidmachine.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z10) {
            this.silenceSkippingAudioProcessor.setEnabled(z10);
            return z10;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, io.bidmachine.media3.common.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, io.bidmachine.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j10) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j10) : j10;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, io.bidmachine.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    @RequiresApi(23)
    public static final class b {
        private b() {
        }

        @DoNotInline
        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, @Nullable eg.a aVar) {
            audioTrack.setPreferredDevice(aVar == null ? null : aVar.audioDeviceInfo);
        }
    }

    public static final class d {
        public final AudioProcessingPipeline audioProcessingPipeline;
        public final int bufferSize;
        public final boolean enableAudioTrackPlaybackParams;
        public final boolean enableOffloadGapless;
        public final Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;
        public final boolean tunneling;

        private AudioTrack createAudioTrack(AudioAttributes audioAttributes, int i10) {
            int i11 = Util.SDK_INT;
            if (i11 >= 29) {
                return createAudioTrackV29(audioAttributes, i10);
            }
            return i11 >= 21 ? createAudioTrackV21(audioAttributes, i10) : createAudioTrackV9(audioAttributes, i10);
        }

        @RequiresApi(21)
        private AudioTrack createAudioTrackV21(AudioAttributes audioAttributes, int i10) {
            return new AudioTrack(getAudioTrackAttributesV21(audioAttributes, this.tunneling), Util.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding), this.bufferSize, 1, i10);
        }

        @RequiresApi(29)
        private AudioTrack createAudioTrackV29(AudioAttributes audioAttributes, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, this.tunneling)).setAudioFormat(Util.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding)).setTransferMode(1).setBufferSizeInBytes(this.bufferSize).setSessionId(i10).setOffloadedPlayback(this.outputMode == 1).build();
        }

        private AudioTrack createAudioTrackV9(AudioAttributes audioAttributes, int i10) {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            return i10 == 0 ? new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1) : new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, i10);
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean z10) {
            return z10 ? getAudioTrackTunnelingAttributesV21() : audioAttributes.getAudioAttributesV21().audioAttributes;
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            return new AudioSink.AudioTrackConfig(this.outputEncoding, this.outputSampleRate, this.outputChannelConfig, this.tunneling, this.outputMode == 1, this.bufferSize);
        }

        public boolean canReuseAudioTrack(d dVar) {
            return dVar.outputMode == this.outputMode && dVar.outputEncoding == this.outputEncoding && dVar.outputSampleRate == this.outputSampleRate && dVar.outputChannelConfig == this.outputChannelConfig && dVar.outputPcmFrameSize == this.outputPcmFrameSize && dVar.enableAudioTrackPlaybackParams == this.enableAudioTrackPlaybackParams && dVar.enableOffloadGapless == this.enableOffloadGapless;
        }

        public d copyWithBufferSize(int i10) {
            return new d(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i10, this.audioProcessingPipeline, this.enableAudioTrackPlaybackParams, this.enableOffloadGapless, this.tunneling);
        }

        public long framesToDurationUs(long j10) {
            return Util.sampleCountToDurationUs(j10, this.outputSampleRate);
        }

        public long inputFramesToDurationUs(long j10) {
            return Util.sampleCountToDurationUs(j10, this.inputFormat.sampleRate);
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }

        public d(Format format, int i10, int i11, int i12, int i13, int i14, int i15, int i16, AudioProcessingPipeline audioProcessingPipeline, boolean z10, boolean z11, boolean z12) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i10;
            this.outputMode = i11;
            this.outputPcmFrameSize = i12;
            this.outputSampleRate = i13;
            this.outputChannelConfig = i14;
            this.outputEncoding = i15;
            this.bufferSize = i16;
            this.audioProcessingPipeline = audioProcessingPipeline;
            this.enableAudioTrackPlaybackParams = z10;
            this.enableOffloadGapless = z11;
            this.tunneling = z12;
        }

        public AudioTrack buildAudioTrack(AudioAttributes audioAttributes, int i10) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackCreateAudioTrack = createAudioTrack(audioAttributes, i10);
                int state = audioTrackCreateAudioTrack.getState();
                if (state == 1) {
                    return audioTrackCreateAudioTrack;
                }
                try {
                    audioTrackCreateAudioTrack.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), e10);
            }
        }
    }

    public static final class e {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;

        private e(PlaybackParameters playbackParameters, long j10, long j11) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j10;
            this.audioTrackPositionUs = j11;
        }
    }

    @RequiresApi(24)
    public static final class f {
        private final AudioTrack audioTrack;
        private final AudioCapabilitiesReceiver capabilitiesReceiver;

        @Nullable
        private AudioRouting.OnRoutingChangedListener listener = new AudioRouting.OnRoutingChangedListener() { // from class: eg.t
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f52632a.onRoutingChanged(audioRouting);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public void onRoutingChanged(AudioRouting audioRouting) {
            if (this.listener == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.capabilitiesReceiver.setRoutedDevice(audioRouting.getRoutedDevice());
        }

        @DoNotInline
        public void release() {
            this.audioTrack.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) Assertions.checkNotNull(this.listener));
            this.listener = null;
        }

        public f(AudioTrack audioTrack, AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            this.audioTrack = audioTrack;
            this.capabilitiesReceiver = audioCapabilitiesReceiver;
            audioTrack.addOnRoutingChangedListener(this.listener, new Handler(Looper.myLooper()));
        }
    }

    public final class h implements AudioTrackPositionTracker.Listener {
        private h() {
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j10) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j10) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j10);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w(DefaultAudioSink.TAG, str);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w(DefaultAudioSink.TAG, str);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    @RequiresApi(29)
    public final class i {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler = new Handler(Looper.myLooper());

        public class a extends AudioTrack$StreamEventCallback {
            public final /* synthetic */ DefaultAudioSink val$this$0;

            public a(DefaultAudioSink defaultAudioSink) {
                this.val$this$0 = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                    DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.audioTrack)) {
                    DefaultAudioSink.this.handledOffloadOnPresentationEnded = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                    DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                }
            }
        }

        public i() {
            this.callback = new a(DefaultAudioSink.this);
        }

        @DoNotInline
        public void register(AudioTrack audioTrack) {
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.b(handler), this.callback);
        }

        @DoNotInline
        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, final AudioSink.Listener listener, Handler handler, final AudioSink.AudioTrackConfig audioTrackConfig, ConditionVariable conditionVariable) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: eg.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        listener.onAudioTrackReleased(audioTrackConfig);
                    }
                });
            }
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i10 = pendingReleaseCount - 1;
                pendingReleaseCount = i10;
                if (i10 == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
            }
        } catch (Throwable th2) {
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: eg.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        listener.onAudioTrackReleased(audioTrackConfig);
                    }
                });
            }
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i11 = pendingReleaseCount - 1;
                pendingReleaseCount = i11;
                if (i11 == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
                throw th2;
            }
        }
    }

    @RequiresApi(21)
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized()) {
            if (this.audioTrackPositionTracker.pause() || isOffloadedPlayback(this.audioTrack)) {
                this.audioTrack.pause();
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public /* bridge */ /* synthetic */ void setOutputStreamOffsetUs(long j10) {
        super.setOutputStreamOffsetUs(j10);
    }

    @RequiresApi(31)
    public static final class c {
        private c() {
        }

        @DoNotInline
        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(logSessionId);
            }
        }
    }

    public static final class g<T extends Exception> {

        @Nullable
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public void clear() {
            this.pendingException = null;
        }

        public g(long j10) {
            this.throwDelayMs = j10;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t10;
                this.throwDeadlineMs = this.throwDelayMs + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.throwDeadlineMs) {
                T t11 = this.pendingException;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.pendingException;
                clear();
                throw t12;
            }
        }
    }

    private DefaultAudioSink(Builder builder) {
        Context context = builder.context;
        this.context = context;
        AudioAttributes audioAttributes = AudioAttributes.DEFAULT;
        this.audioAttributes = audioAttributes;
        this.audioCapabilities = context != null ? AudioCapabilities.getCapabilities(context, audioAttributes, null) : builder.audioCapabilities;
        this.audioProcessorChain = builder.audioProcessorChain;
        int i10 = Util.SDK_INT;
        this.enableFloatOutput = i10 >= 21 && builder.enableFloatOutput;
        this.preferAudioTrackPlaybackParams = i10 >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        this.audioOffloadSupportProvider = (AudioOffloadSupportProvider) Assertions.checkNotNull(builder.audioOffloadSupportProvider);
        ConditionVariable conditionVariable = new ConditionVariable(Clock.DEFAULT);
        this.releasingConditionVariable = conditionVariable;
        conditionVariable.open();
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new h());
        o oVar = new o();
        this.channelMappingAudioProcessor = oVar;
        v vVar = new v();
        this.trimmingAudioProcessor = vVar;
        this.toIntPcmAvailableAudioProcessors = ImmutableList.of((v) new ToInt16PcmAudioProcessor(), (v) oVar, vVar);
        this.toFloatPcmAvailableAudioProcessors = ImmutableList.of(new u());
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new e(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new g<>(100L);
        this.writeExceptionPendingExceptionHolder = new g<>(100L);
        this.audioOffloadListener = builder.audioOffloadListener;
    }

    private long applyMediaPositionParameters(long j10) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j10 >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        long j11 = j10 - this.mediaPositionParameters.audioTrackPositionUs;
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.mediaTimeUs + this.audioProcessorChain.getMediaDuration(j11);
        }
        e first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.mediaTimeUs - Util.getMediaDurationForPlayoutDuration(first.audioTrackPositionUs - j10, this.mediaPositionParameters.playbackParameters.speed);
    }

    private long applySkipping(long j10) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j10 + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j11 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j11) {
            long jFramesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j11);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private AudioTrack buildAudioTrack(d dVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackBuildAudioTrack = dVar.buildAudioTrack(this.audioAttributes, this.audioSessionId);
            ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener != null) {
                audioOffloadListener.onOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            }
            return audioTrackBuildAudioTrack;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioTrack((d) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e10) {
            d dVar = this.configuration;
            if (dVar.bufferSize > 1000000) {
                d dVarCopyWithBufferSize = dVar.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(dVarCopyWithBufferSize);
                    this.configuration = dVarCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    maybeDisableOffload();
                    throw e10;
                }
            }
            maybeDisableOffload();
            throw e10;
        }
    }

    private boolean drainToEndOfStream() throws Exception {
        if (!this.audioProcessingPipeline.isOperational()) {
            ByteBuffer byteBuffer = this.outputBuffer;
            if (byteBuffer == null) {
                return true;
            }
            writeBuffer(byteBuffer, Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        this.audioProcessingPipeline.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        if (!this.audioProcessingPipeline.isEnded()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.outputBuffer;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private static int getFramesPerEncodedSample(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                    if (mpegAudioFrameSampleCount != -1) {
                        return mpegAudioFrameSampleCount;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                            if (iFindTrueHdSyncframeOffset == -1) {
                                return 0;
                            }
                            return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
        }
        return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        d dVar = this.configuration;
        return dVar.outputMode == 0 ? this.submittedPcmBytes / ((long) dVar.inputPcmFrameSize) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        d dVar = this.configuration;
        return dVar.outputMode == 0 ? Util.ceilDivide(this.writtenPcmBytes, dVar.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void handleSkippedSilence(long j10) {
        this.accumulatedSkippedSilenceDurationUs += j10;
        if (this.reportSkippedSilenceHandler == null) {
            this.reportSkippedSilenceHandler = new Handler(Looper.myLooper());
        }
        this.reportSkippedSilenceHandler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new Runnable() { // from class: eg.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f52630b.maybeReportSkippedSilence();
            }
        }, 100L);
    }

    private boolean initializeAudioTrack() throws AudioSink.InitializationException {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver;
        PlayerId playerId;
        if (!this.releasingConditionVariable.isOpen()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            d dVar = this.configuration;
            if (dVar.enableOffloadGapless) {
                AudioTrack audioTrack = this.audioTrack;
                Format format = dVar.inputFormat;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        int i10 = Util.SDK_INT;
        if (i10 >= 31 && (playerId = this.playerId) != null) {
            c.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        d dVar2 = this.configuration;
        audioTrackPositionTracker.setAudioTrack(audioTrack2, dVar2.outputMode == 2, dVar2.outputEncoding, dVar2.outputPcmFrameSize, dVar2.bufferSize);
        setVolumeInternal();
        int i11 = this.auxEffectInfo.effectId;
        if (i11 != 0) {
            this.audioTrack.attachAuxEffect(i11);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        eg.a aVar = this.preferredDevice;
        if (aVar != null && i10 >= 23) {
            b.setPreferredDeviceOnAudioTrack(this.audioTrack, aVar);
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = this.audioCapabilitiesReceiver;
            if (audioCapabilitiesReceiver2 != null) {
                audioCapabilitiesReceiver2.setRoutedDevice(this.preferredDevice.audioDeviceInfo);
            }
        }
        if (i10 >= 24 && (audioCapabilitiesReceiver = this.audioCapabilitiesReceiver) != null) {
            this.onRoutingChangedListener = new f(this.audioTrack, audioCapabilitiesReceiver);
        }
        this.startMediaTimeUsNeedsInit = true;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
        }
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i10) {
        return (Util.SDK_INT >= 24 && i10 == -6) || i10 == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    private void maybeStartAudioCapabilitiesReceiver() {
        if (this.audioCapabilitiesReceiver != null || this.context == null) {
            return;
        }
        this.playbackLooper = Looper.myLooper();
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(this.context, new AudioCapabilitiesReceiver.Listener() { // from class: eg.s
            @Override // io.bidmachine.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
            public final void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
                this.f52631a.onAudioCapabilitiesChanged(audioCapabilities);
            }
        }, this.audioAttributes, this.preferredDevice);
        this.audioCapabilitiesReceiver = audioCapabilitiesReceiver;
        this.audioCapabilities = audioCapabilitiesReceiver.register();
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        if (isOffloadedPlayback(this.audioTrack)) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private void processBuffers(long j10) throws Exception {
        ByteBuffer output;
        if (!this.audioProcessingPipeline.isOperational()) {
            ByteBuffer byteBuffer = this.inputBuffer;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.EMPTY_BUFFER;
            }
            writeBuffer(byteBuffer, j10);
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                output = this.audioProcessingPipeline.getOutput();
                if (output.hasRemaining()) {
                    writeBuffer(output, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.inputBuffer;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.audioProcessingPipeline.queueInput(this.inputBuffer);
                    }
                }
            } while (!output.hasRemaining());
            return;
        }
    }

    @RequiresApi(29)
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new i();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new e(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioProcessorPlaybackParameters(PlaybackParameters playbackParameters) {
        e eVar = new e(playbackParameters, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = eVar;
        } else {
            this.mediaPositionParameters = eVar;
        }
    }

    private void setupAudioProcessors() {
        AudioProcessingPipeline audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        this.audioProcessingPipeline = audioProcessingPipeline;
        audioProcessingPipeline.flush();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        if (!this.tunneling) {
            d dVar = this.configuration;
            if (dVar.outputMode == 0 && !shouldUseFloatOutput(dVar.inputFormat.pcmEncoding)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldUseFloatOutput(int i10) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i10);
    }

    private boolean useAudioTrackPlaybackParams() {
        d dVar = this.configuration;
        return dVar != null && dVar.enableAudioTrackPlaybackParams && Util.SDK_INT >= 23;
    }

    @RequiresApi(21)
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i10);
            this.avSyncHeader.putLong(8, j10 * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i10;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i10);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void configure(Format format, int i10, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessingPipeline audioProcessingPipeline;
        int pcmFrameSize;
        int pcmFrameSize2;
        boolean z10;
        int i11;
        int i12;
        int iIntValue;
        int i13;
        boolean z11;
        int bufferSizeInBytes;
        int[] iArr2;
        maybeStartAudioCapabilitiesReceiver();
        if ("audio/raw".equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            ImmutableList.a aVar = new ImmutableList.a();
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                aVar.k(this.toFloatPcmAvailableAudioProcessors);
            } else {
                aVar.k(this.toIntPcmAvailableAudioProcessors);
                aVar.j(this.audioProcessorChain.getAudioProcessors());
            }
            AudioProcessingPipeline audioProcessingPipeline2 = new AudioProcessingPipeline(aVar.m());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            if (Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.setChannelMap(iArr2);
            try {
                AudioProcessor.AudioFormat audioFormatConfigure = audioProcessingPipeline2.configure(new AudioProcessor.AudioFormat(format));
                int i15 = audioFormatConfigure.encoding;
                int i16 = audioFormatConfigure.sampleRate;
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(audioFormatConfigure.channelCount);
                i12 = 0;
                z10 = false;
                pcmFrameSize2 = Util.getPcmFrameSize(i15, audioFormatConfigure.channelCount);
                audioProcessingPipeline = audioProcessingPipeline2;
                i11 = i16;
                iIntValue = audioTrackChannelConfig;
                z11 = this.preferAudioTrackPlaybackParams;
                i13 = i15;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink.ConfigurationException(e10, format);
            }
        } else {
            AudioProcessingPipeline audioProcessingPipeline3 = new AudioProcessingPipeline(ImmutableList.of());
            int i17 = format.sampleRate;
            AudioOffloadSupport formatOffloadSupport = this.offloadMode != 0 ? getFormatOffloadSupport(format) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (this.offloadMode == 0 || !formatOffloadSupport.isFormatSupported) {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format, this.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                audioProcessingPipeline = audioProcessingPipeline3;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                z10 = false;
                i11 = i17;
                i12 = 2;
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i13 = iIntValue2;
                z11 = this.preferAudioTrackPlaybackParams;
            } else {
                int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                int audioTrackChannelConfig2 = Util.getAudioTrackChannelConfig(format.channelCount);
                audioProcessingPipeline = audioProcessingPipeline3;
                i12 = 1;
                z11 = true;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i11 = i17;
                z10 = formatOffloadSupport.isGaplessSupported;
                i13 = encoding;
                iIntValue = audioTrackChannelConfig2;
            }
        }
        if (i13 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + format, format);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + format, format);
        }
        int i18 = format.bitrate;
        if ("audio/vnd.dts.hd;profile=lbr".equals(format.sampleMimeType) && i18 == -1) {
            i18 = 768000;
        }
        int i19 = i18;
        if (i10 != 0) {
            bufferSizeInBytes = i10;
        } else {
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i11, iIntValue, i13), i13, i12, pcmFrameSize2 != -1 ? pcmFrameSize2 : 1, i11, i19, z11 ? 8.0d : 1.0d);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        d dVar = new d(format, pcmFrameSize, i12, pcmFrameSize2, i11, iIntValue, i13, bufferSizeInBytes, audioProcessingPipeline, z11, z10, this.tunneling);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = dVar;
        } else {
            this.configuration = dVar;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return this.offloadDisabledUntilNextConfiguration ? AudioOffloadSupport.DEFAULT_UNSUPPORTED : this.audioOffloadSupportProvider.getAudioOffloadSupport(format, this.audioAttributes);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null && isOffloadedPlayback(audioTrack) && this.configuration.enableOffloadGapless) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                        this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
                    }
                    AudioTrack audioTrack2 = this.audioTrack;
                    Format format = this.configuration.inputFormat;
                    audioTrack2.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.isRecoverable) {
                    throw e10;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e10);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j10);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            Assertions.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            d dVar = this.configuration;
            if (dVar.outputMode != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(dVar.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && Math.abs(jInputFramesToDurationUs - j10) > 200000) {
                AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j10, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j11 = j10 - jInputFramesToDurationUs;
                this.startMediaTimeUs += j11;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
                AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j11 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += ((long) this.framesPerEncodedSample) * ((long) i10);
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i10;
        }
        processBuffers(j10);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        }
        Log.w(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setAudioAttributes(audioAttributes);
        }
        flush();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i10) {
        if (this.audioSessionId != i10) {
            this.audioSessionId = i10;
            this.externalAudioSessionIdProvided = i10 != 0;
            flush();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i10 = auxEffectInfo.effectId;
        float f10 = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.audioTrack.setAuxEffectSendLevel(f10);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setClock(Clock clock) {
        this.audioTrackPositionTracker.setClock(clock);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void setOffloadDelayPadding(int i10, int i11) {
        d dVar;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || !isOffloadedPlayback(audioTrack) || (dVar = this.configuration) == null || !dVar.enableOffloadGapless) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i10, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void setOffloadMode(int i10) {
        Assertions.checkState(Util.SDK_INT >= 29);
        this.offloadMode = i10;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.playbackParameters = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(playbackParameters);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo == null ? null : new eg.a(audioDeviceInfo);
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            b.setPreferredDeviceOnAudioTrack(audioTrack, this.preferredDevice);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z10) {
        this.skipSilenceEnabled = z10;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setVolume(float f10) {
        if (this.volume != f10) {
            this.volume = f10;
            setVolumeInternal();
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j10) {
        PlaybackParameters playbackParametersApplyPlaybackParameters;
        boolean zApplySkipSilenceEnabled;
        if (!useAudioTrackPlaybackParams()) {
            if (shouldApplyAudioProcessorPlaybackParameters()) {
                playbackParametersApplyPlaybackParameters = this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters);
            } else {
                playbackParametersApplyPlaybackParameters = PlaybackParameters.DEFAULT;
            }
            this.playbackParameters = playbackParametersApplyPlaybackParameters;
        } else {
            playbackParametersApplyPlaybackParameters = PlaybackParameters.DEFAULT;
        }
        PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        if (shouldApplyAudioProcessorPlaybackParameters()) {
            zApplySkipSilenceEnabled = this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled);
        } else {
            zApplySkipSilenceEnabled = false;
        }
        this.skipSilenceEnabled = zApplySkipSilenceEnabled;
        this.mediaPositionParametersCheckpoints.add(new e(playbackParameters, Math.max(0L, j10), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private static int getAudioTrackMinBufferSize(int i10, int i11, int i12) {
        boolean z10;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        if (minBufferSize != -2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        return minBufferSize;
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, final ConditionVariable conditionVariable, @Nullable final AudioSink.Listener listener, final AudioSink.AudioTrackConfig audioTrackConfig) {
        conditionVariable.close();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (releaseExecutorLock) {
            if (releaseExecutor == null) {
                releaseExecutor = Util.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
            }
            pendingReleaseCount++;
            releaseExecutor.execute(new Runnable() { // from class: eg.p
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAudioSink.lambda$releaseAudioTrackAsync$1(audioTrack, listener, handler, audioTrackConfig, conditionVariable);
                }
            });
        }
    }

    @RequiresApi(23)
    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.playbackParameters.speed).setPitch(this.playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                Log.w(TAG, "Failed to set playback params", e10);
            }
            PlaybackParameters playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.playbackParameters = playbackParameters;
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            if (Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    @RequiresApi(21)
    private static void setVolumeInternalV21(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    private void writeBuffer(ByteBuffer byteBuffer, long j10) throws Exception {
        int iWriteNonBlockingV21;
        boolean z10;
        AudioSink.Listener listener;
        boolean z11;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.outputBuffer;
        boolean z12 = true;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkArgument(z11);
        } else {
            this.outputBuffer = byteBuffer;
            if (Util.SDK_INT < 21) {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = this.preV21OutputBuffer;
                if (bArr == null || bArr.length < iRemaining) {
                    this.preV21OutputBuffer = new byte[iRemaining];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                byteBuffer.position(iPosition);
                this.preV21OutputBufferOffset = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        if (Util.SDK_INT < 21) {
            int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
            if (availableBufferSize > 0) {
                iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(iRemaining2, availableBufferSize));
                if (iWriteNonBlockingV21 > 0) {
                    this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                    byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                }
            } else {
                iWriteNonBlockingV21 = 0;
            }
        } else if (this.tunneling) {
            if (j10 != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkState(z10);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j10;
            }
            iWriteNonBlockingV21 = writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer, iRemaining2, j10);
        } else {
            iWriteNonBlockingV21 = writeNonBlockingV21(this.audioTrack, byteBuffer, iRemaining2);
        }
        this.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
        if (iWriteNonBlockingV21 < 0) {
            if (isAudioTrackDeadObject(iWriteNonBlockingV21)) {
                if (getWrittenFrames() <= 0) {
                    if (isOffloadedPlayback(this.audioTrack)) {
                        maybeDisableOffload();
                    } else {
                        z12 = false;
                    }
                }
            } else {
                z12 = false;
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlockingV21, this.configuration.inputFormat, z12);
            AudioSink.Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onAudioSinkError(writeException);
            }
            if (!writeException.isRecoverable) {
                this.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
                return;
            } else {
                this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
                throw writeException;
            }
        }
        this.writeExceptionPendingExceptionHolder.clear();
        if (isOffloadedPlayback(this.audioTrack)) {
            if (this.writtenEncodedFrames > 0) {
                this.isWaitingForOffloadEndOfStreamHandled = false;
            }
            if (this.playing && (listener = this.listener) != null && iWriteNonBlockingV21 < iRemaining2 && !this.isWaitingForOffloadEndOfStreamHandled) {
                listener.onOffloadBufferFull();
            }
        }
        int i10 = this.configuration.outputMode;
        if (i10 == 0) {
            this.writtenPcmBytes += (long) iWriteNonBlockingV21;
        }
        if (iWriteNonBlockingV21 == iRemaining2) {
            if (i10 != 0) {
                if (byteBuffer != this.inputBuffer) {
                    z12 = false;
                }
                Assertions.checkState(z12);
                this.writtenEncodedFrames += ((long) this.framesPerEncodedSample) * ((long) this.inputBufferAccessUnitCount);
            }
            this.outputBuffer = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void flush() {
        f fVar;
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((i) Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            int i10 = Util.SDK_INT;
            if (i10 < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            AudioSink.AudioTrackConfig audioTrackConfigBuildAudioTrackConfig = this.configuration.buildAudioTrackConfig();
            d dVar = this.pendingConfiguration;
            if (dVar != null) {
                this.configuration = dVar;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            if (i10 >= 24 && (fVar = this.onRoutingChangedListener) != null) {
                fVar.release();
                this.onRoutingChangedListener = null;
            }
            releaseAudioTrackAsync(this.audioTrack, this.releasingConditionVariable, this.listener, audioTrackConfigBuildAudioTrackConfig);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            ((Handler) Assertions.checkNotNull(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (isAudioTrackInitialized() && !this.startMediaTimeUsNeedsInit) {
            return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z10), this.configuration.framesToDurationUs(getWrittenFrames()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        maybeStartAudioCapabilitiesReceiver();
        if ("audio/raw".equals(format.sampleMimeType)) {
            if (!Util.isEncodingLinearPcm(format.pcmEncoding)) {
                Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
                return 0;
            }
            int i10 = format.pcmEncoding;
            if (i10 == 2 || (this.enableFloatOutput && i10 == 4)) {
                return 2;
            }
            return 1;
        }
        if (!this.audioCapabilities.isPassthroughPlaybackSupported(format, this.audioAttributes)) {
            return 0;
        }
        return 2;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioTrackInitialized() && ((Util.SDK_INT < 29 || !this.audioTrack.isOffloadedPlayback() || !this.handledOffloadOnPresentationEnded) && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames()))) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (isAudioTrackInitialized() && (!this.handledEndOfStream || hasPendingData())) {
            return false;
        }
        return true;
    }

    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.playbackLooper;
        if (looper != looperMyLooper) {
            String name2 = "null";
            if (looper == null) {
                name = "null";
            } else {
                name = looper.getThread().getName();
            }
            if (looperMyLooper != null) {
                name2 = looperMyLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + name2 + ") is not the playback looper (" + name + ")");
        }
        if (!audioCapabilities.equals(this.audioCapabilities)) {
            this.audioCapabilities = audioCapabilities;
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioCapabilitiesChanged();
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        r2<AudioProcessor> it = this.toIntPcmAvailableAudioProcessors.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        r2<AudioProcessor> it2 = this.toFloatPcmAvailableAudioProcessors.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        if (getFormatSupport(format) != 0) {
            return true;
        }
        return false;
    }
}
