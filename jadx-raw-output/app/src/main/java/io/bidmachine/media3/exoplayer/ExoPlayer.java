package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.AuxEffectInfo;
import io.bidmachine.media3.common.DeviceInfo;
import io.bidmachine.media3.common.Effect;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackSelectionParameters;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.Size;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DefaultLoadControl;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsCollector;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsListener;
import io.bidmachine.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.source.DefaultMediaSourceFactory;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.ShuffleOrder;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.trackselection.DefaultTrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectionArray;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import io.bidmachine.media3.exoplayer.upstream.DefaultBandwidthMeter;
import io.bidmachine.media3.exoplayer.video.VideoFrameMetadataListener;
import io.bidmachine.media3.exoplayer.video.spherical.CameraMotionListener;
import io.bidmachine.media3.extractor.DefaultExtractorsFactory;
import java.util.List;
import m5.e;
import m5.p;

/* JADX INFO: loaded from: classes6.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @UnstableApi
    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z10);

        @Deprecated
        void setAudioSessionId(int i10);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z10);

        @Deprecated
        void setVolume(float f10);
    }

    @UnstableApi
    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z10) {
        }

        default void onSleepingForOffloadChanged(boolean z10) {
        }
    }

    public static final class Builder {
        public e<Clock, AnalyticsCollector> analyticsCollectorFunction;
        public AudioAttributes audioAttributes;
        public p<BandwidthMeter> bandwidthMeterSupplier;
        public boolean buildCalled;
        public Clock clock;
        public final Context context;
        public long detachSurfaceTimeoutMs;
        public boolean deviceVolumeControlEnabled;
        public boolean dynamicSchedulingEnabled;
        public long foregroundModeTimeoutMs;
        public boolean handleAudioBecomingNoisy;
        public boolean handleAudioFocus;
        public LivePlaybackSpeedControl livePlaybackSpeedControl;
        public p<LoadControl> loadControlSupplier;
        public Looper looper;
        public long maxSeekToPreviousPositionMs;
        public p<MediaSource.Factory> mediaSourceFactorySupplier;
        public boolean pauseAtEndOfMediaItems;

        @Nullable
        public Looper playbackLooper;
        public String playerName;
        public int priority;

        @Nullable
        public PriorityTaskManager priorityTaskManager;
        public long releaseTimeoutMs;
        public p<RenderersFactory> renderersFactorySupplier;
        public long seekBackIncrementMs;
        public long seekForwardIncrementMs;
        public SeekParameters seekParameters;
        public boolean skipSilenceEnabled;
        public boolean suppressPlaybackOnUnsuitableOutput;
        public p<TrackSelector> trackSelectorSupplier;
        public boolean useLazyPreparation;
        public boolean usePlatformDiagnostics;
        public int videoChangeFrameRateStrategy;
        public int videoScalingMode;
        public int wakeMode;

        public Builder(final Context context) {
            this(context, (p<RenderersFactory>) new p() { // from class: cg.r
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$0(context);
                }
            }, (p<MediaSource.Factory>) new p() { // from class: cg.s
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$1(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        @UnstableApi
        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (p<RenderersFactory>) new p() { // from class: cg.l
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$2(renderersFactory);
                }
            }, (p<MediaSource.Factory>) new p() { // from class: cg.m
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$3(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new a(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        @UnstableApi
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z10;
            return this;
        }

        @UnstableApi
        public Builder experimentalSetForegroundModeTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j10;
            return this;
        }

        @UnstableApi
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new e() { // from class: cg.i
                @Override // m5.e
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(analyticsCollector, (Clock) obj);
                }
            };
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z10;
            return this;
        }

        @UnstableApi
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new p() { // from class: cg.w
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
                }
            };
            return this;
        }

        @VisibleForTesting
        @UnstableApi
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @UnstableApi
        public Builder setDetachSurfaceTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j10;
            return this;
        }

        @UnstableApi
        public Builder setDeviceVolumeControlEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z10;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z10;
            return this;
        }

        @UnstableApi
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @UnstableApi
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new p() { // from class: cg.h
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @UnstableApi
        public Builder setMaxSeekToPreviousPositionMs(@IntRange(from = 0) long j10) {
            Assertions.checkArgument(j10 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j10;
            return this;
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new p() { // from class: cg.x
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        @UnstableApi
        public Builder setPauseAtEndOfMediaItems(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z10;
            return this;
        }

        @UnstableApi
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooper = looper;
            return this;
        }

        @UnstableApi
        public Builder setPriority(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i10;
            return this;
        }

        @UnstableApi
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @UnstableApi
        public Builder setReleaseTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j10;
            return this;
        }

        @UnstableApi
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new p() { // from class: cg.q
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setRenderersFactory$16(renderersFactory);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j10) {
            Assertions.checkArgument(j10 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j10;
            return this;
        }

        @UnstableApi
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j10) {
            Assertions.checkArgument(j10 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j10;
            return this;
        }

        @UnstableApi
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @UnstableApi
        public Builder setSkipSilenceEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z10;
            return this;
        }

        @UnstableApi
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z10;
            return this;
        }

        @UnstableApi
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new p() { // from class: cg.d
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setTrackSelector$18(trackSelector);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setUseLazyPreparation(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z10;
            return this;
        }

        @UnstableApi
        public Builder setUsePlatformDiagnostics(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z10;
            return this;
        }

        @UnstableApi
        public Builder setVideoChangeFrameRateStrategy(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i10;
            return this;
        }

        @UnstableApi
        public Builder setVideoScalingMode(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i10;
            return this;
        }

        public Builder setWakeMode(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i10;
            return this;
        }

        @UnstableApi
        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (p<RenderersFactory>) new p() { // from class: cg.j
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$4(context);
                }
            }, (p<MediaSource.Factory>) new p() { // from class: cg.k
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$5(factory);
                }
            });
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (p<RenderersFactory>) new p() { // from class: cg.n
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$6(renderersFactory);
                }
            }, (p<MediaSource.Factory>) new p() { // from class: cg.p
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$7(factory);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (p<RenderersFactory>) new p() { // from class: cg.y
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$8(renderersFactory);
                }
            }, (p<MediaSource.Factory>) new p() { // from class: cg.z
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$9(factory);
                }
            }, (p<TrackSelector>) new p() { // from class: cg.a0
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$10(trackSelector);
                }
            }, (p<LoadControl>) new p() { // from class: cg.e
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$11(loadControl);
                }
            }, (p<BandwidthMeter>) new p() { // from class: cg.f
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
                }
            }, (e<Clock, AnalyticsCollector>) new e() { // from class: cg.g
                @Override // m5.e
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.lambda$new$13(analyticsCollector, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, p<RenderersFactory> pVar, p<MediaSource.Factory> pVar2) {
            this(context, pVar, pVar2, (p<TrackSelector>) new p() { // from class: cg.o
                @Override // m5.p
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$14(context);
                }
            }, (p<LoadControl>) new p() { // from class: cg.t
                @Override // m5.p
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, (p<BandwidthMeter>) new p() { // from class: cg.u
                @Override // m5.p
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (e<Clock, AnalyticsCollector>) new e() { // from class: cg.v
                @Override // m5.e
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, p<RenderersFactory> pVar, p<MediaSource.Factory> pVar2, p<TrackSelector> pVar3, p<LoadControl> pVar4, p<BandwidthMeter> pVar5, e<Clock, AnalyticsCollector> eVar) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = pVar;
            this.mediaSourceFactorySupplier = pVar2;
            this.trackSelectorSupplier = pVar3;
            this.loadControlSupplier = pVar4;
            this.bandwidthMeterSupplier = pVar5;
            this.analyticsCollectorFunction = eVar;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
        }
    }

    @UnstableApi
    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z10);

        @Deprecated
        void setDeviceVolume(int i10);
    }

    @UnstableApi
    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @UnstableApi
    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(@Nullable Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(@Nullable TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i10);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i10);

        @Deprecated
        void setVideoSurface(@Nullable Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void addListener(Player.Listener listener);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void addMediaItem(int i10, MediaItem mediaItem);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void addMediaItem(MediaItem mediaItem);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void addMediaItems(int i10, List<MediaItem> list);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void addMediaItems(List<MediaItem> list);

    @UnstableApi
    void addMediaSource(int i10, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i10, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean canAdvertiseSession();

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void clearMediaItems();

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void clearVideoSurface();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void clearVideoSurface(@Nullable Surface surface);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void clearVideoTextureView(@Nullable TextureView textureView);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    /* synthetic */ void decreaseDeviceVolume();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void decreaseDeviceVolume(int i10);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ Looper getApplicationLooper();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ AudioAttributes getAudioAttributes();

    @Nullable
    @UnstableApi
    @Deprecated
    AudioComponent getAudioComponent();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ Player.Commands getAvailableCommands();

    @Override // io.bidmachine.media3.common.Player
    @IntRange(from = 0, to = 100)
    /* synthetic */ int getBufferedPercentage();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getBufferedPosition();

    @UnstableApi
    Clock getClock();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getContentBufferedPosition();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getContentDuration();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getContentPosition();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ CueGroup getCurrentCues();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getCurrentLiveOffset();

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    @UnstableApi
    /* synthetic */ Object getCurrentManifest();

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    /* synthetic */ MediaItem getCurrentMediaItem();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getCurrentPosition();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ Timeline getCurrentTimeline();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ Tracks getCurrentTracks();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Nullable
    @UnstableApi
    @Deprecated
    DeviceComponent getDeviceComponent();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ DeviceInfo getDeviceInfo();

    @Override // io.bidmachine.media3.common.Player
    @IntRange(from = 0)
    /* synthetic */ int getDeviceVolume();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getDuration();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ MediaItem getMediaItemAt(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getMediaItemCount();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ MediaMetadata getMediaMetadata();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getNextMediaItemIndex();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean getPlayWhenReady();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ PlaybackParameters getPlaybackParameters();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getPlaybackState();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ MediaMetadata getPlaylistMetadata();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getPreviousMediaItemIndex();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    @UnstableApi
    Renderer getRenderer(int i10);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ int getRepeatMode();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getSeekBackIncrement();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getSeekForwardIncrement();

    @UnstableApi
    SeekParameters getSeekParameters();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean getShuffleModeEnabled();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    /* synthetic */ Size getSurfaceSize();

    @Nullable
    @UnstableApi
    @Deprecated
    TextComponent getTextComponent();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ long getTotalBufferedDuration();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ TrackSelectionParameters getTrackSelectionParameters();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    @Deprecated
    VideoComponent getVideoComponent();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ VideoSize getVideoSize();

    @Override // io.bidmachine.media3.common.Player
    @FloatRange(from = 0.0d, to = 1.0d)
    /* synthetic */ float getVolume();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean hasNextMediaItem();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean hasPrevious();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean hasPreviousMediaItem();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    /* synthetic */ void increaseDeviceVolume();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void increaseDeviceVolume(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isCommandAvailable(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isDeviceMuted();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isLoading();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isPlaying();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ boolean isPlayingAd();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void moveMediaItem(int i10, int i11);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ void next();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void pause();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void play();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void prepare();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z10, boolean z11);

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ void previous();

    @Override // io.bidmachine.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void removeListener(Player.Listener listener);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void removeMediaItem(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // io.bidmachine.media3.common.Player
    void replaceMediaItem(int i10, MediaItem mediaItem);

    @Override // io.bidmachine.media3.common.Player
    void replaceMediaItems(int i10, int i11, List<MediaItem> list);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekBack();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekForward();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekTo(int i10, long j10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekTo(long j10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekToDefaultPosition();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekToDefaultPosition(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekToNext();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekToNextMediaItem();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekToPrevious();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void seekToPreviousMediaItem();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setAudioAttributes(AudioAttributes audioAttributes, boolean z10);

    @UnstableApi
    void setAudioSessionId(int i10);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setDeviceMuted(boolean z10, int i10);

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i10, int i11);

    @UnstableApi
    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setMediaItem(MediaItem mediaItem);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setMediaItem(MediaItem mediaItem, long j10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setMediaItem(MediaItem mediaItem, boolean z10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setMediaItems(List<MediaItem> list);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setMediaItems(List<MediaItem> list, int i10, long j10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setMediaItems(List<MediaItem> list, boolean z10);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j10);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z10);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i10, long j10);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z10);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setPlaybackParameters(PlaybackParameters playbackParameters);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setPlaylistMetadata(MediaMetadata mediaMetadata);

    @RequiresApi(23)
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i10);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setRepeatMode(int i10);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setShuffleModeEnabled(boolean z10);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i10);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setVideoSurface(@Nullable Surface surface);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setVideoTextureView(@Nullable TextureView textureView);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f10);

    void setWakeMode(int i10);

    @Override // io.bidmachine.media3.common.Player
    /* synthetic */ void stop();

    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(-9223372036854775807L);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j10) {
            this.targetPreloadDurationUs = j10;
        }
    }
}
