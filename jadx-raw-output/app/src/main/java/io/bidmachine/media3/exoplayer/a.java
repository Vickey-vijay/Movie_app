package io.bidmachine.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import cg.f2;
import cg.g2;
import cg.i2;
import cg.j2;
import cg.r1;
import com.google.common.collect.ImmutableList;
import com.ironsource.C3426d4;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.AuxEffectInfo;
import io.bidmachine.media3.common.BasePlayer;
import io.bidmachine.media3.common.DeviceInfo;
import io.bidmachine.media3.common.Effect;
import io.bidmachine.media3.common.FlagSet;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.IllegalSeekPositionException;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaLibraryInfo;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackSelectionParameters;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.VideoFrameProcessor;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.c0;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.ConditionVariable;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.common.util.ListenerSet;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Size;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.ExoPlayerImplInternal;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsCollector;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsListener;
import io.bidmachine.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import io.bidmachine.media3.exoplayer.analytics.MediaMetricsListener;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.metadata.MetadataOutput;
import io.bidmachine.media3.exoplayer.source.MaskingMediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.ShuffleOrder;
import io.bidmachine.media3.exoplayer.source.TimelineWithUpdatedMediaItem;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.text.TextOutput;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectionArray;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectorResult;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import io.bidmachine.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import io.bidmachine.media3.exoplayer.video.VideoFrameMetadataListener;
import io.bidmachine.media3.exoplayer.video.VideoRendererEventListener;
import io.bidmachine.media3.exoplayer.video.spherical.CameraMotionListener;
import io.bidmachine.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private final Looper applicationLooper;
    private AudioAttributes audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;

    @Nullable
    private DecoderCounters audioDecoderCounters;
    private final AudioFocusManager audioFocusManager;

    @Nullable
    private Format audioFormat;

    @Nullable
    private AudioManager audioManager;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private Player.Commands availableCommands;
    private final BandwidthMeter bandwidthMeter;

    @Nullable
    private CameraMotionListener cameraMotionListener;
    private final Clock clock;
    private final d componentListener;
    private final ConditionVariable constructorFinished;
    private CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private DeviceInfo deviceInfo;
    public final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final e frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;

    @Nullable
    private AudioTrack keepSessionIdAudioTrack;
    private final ListenerSet<Player.Listener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private final long maxSeekToPreviousPositionMs;
    private MediaMetadata mediaMetadata;
    private final MediaSource.Factory mediaSourceFactory;
    private final List<f> mediaSourceHolderSnapshots;

    @Nullable
    private Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private final Timeline.Period period;
    public final Player.Commands permanentAvailableCommands;
    private f2 playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private MediaMetadata playlistMetadata;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private int priority;

    @Nullable
    private PriorityTaskManager priorityTaskManager;
    private final Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;

    @Nullable
    private SphericalGLSurfaceView sphericalGLSurfaceView;
    private MediaMetadata staticAndDynamicMediaMetadata;

    @Nullable
    private final StreamVolumeManager streamVolumeManager;
    private final boolean suppressPlaybackOnUnsuitableOutput;

    @Nullable
    private SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private Size surfaceSize;

    @Nullable
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;

    @Nullable
    private DecoderCounters videoDecoderCounters;

    @Nullable
    private Format videoFormat;

    @Nullable
    private VideoFrameMetadataListener videoFrameMetadataListener;

    @Nullable
    private Object videoOutput;
    private int videoScalingMode;
    private VideoSize videoSize;
    private float volume;
    private final i2 wakeLockManager;
    private final j2 wifiLockManager;
    private final Player wrappingPlayer;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public final class d implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        private d() {
        }

        @Override // io.bidmachine.media3.exoplayer.text.TextOutput
        public void onCues(final List<Cue> list) {
            a.this.listeners.sendEvent(27, new ListenerSet.Event() { // from class: cg.g1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onCues((List<Cue>) list);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public /* bridge */ /* synthetic */ void onOffloadedPlayback(boolean z10) {
            super.onOffloadedPlayback(z10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMetadata$4(Player.Listener listener) {
            listener.onMediaMetadataChanged(a.this.mediaMetadata);
        }

        @Override // io.bidmachine.media3.exoplayer.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i10) {
            a.this.updatePlayWhenReady(a.this.getPlayWhenReady(), i10, a.getPlayWhenReadyChangeReason(i10));
        }

        @Override // io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            a.this.updatePlayWhenReady(false, -1, 3);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception exc) {
            a.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            a.this.analyticsCollector.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String str) {
            a.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters decoderCounters) {
            a.this.analyticsCollector.onAudioDisabled(decoderCounters);
            a.this.audioFormat = null;
            a.this.audioDecoderCounters = null;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters decoderCounters) {
            a.this.audioDecoderCounters = decoderCounters;
            a.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            a.this.audioFormat = format;
            a.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j10) {
            a.this.analyticsCollector.onAudioPositionAdvancing(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception exc) {
            a.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            a.this.analyticsCollector.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            a.this.analyticsCollector.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i10, long j10, long j11) {
            a.this.analyticsCollector.onAudioUnderrun(i10, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.text.TextOutput
        public void onCues(final CueGroup cueGroup) {
            a.this.currentCueGroup = cueGroup;
            a.this.listeners.sendEvent(27, new ListenerSet.Event() { // from class: cg.e1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onCues(cueGroup);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onDroppedFrames(int i10, long j10) {
            a.this.analyticsCollector.onDroppedFrames(i10, j10);
        }

        @Override // io.bidmachine.media3.exoplayer.metadata.MetadataOutput
        public void onMetadata(final Metadata metadata) {
            a aVar = a.this;
            aVar.staticAndDynamicMediaMetadata = aVar.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(metadata).build();
            MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = a.this.buildUpdatedMediaMetadata();
            if (!mediaMetadataBuildUpdatedMediaMetadata.equals(a.this.mediaMetadata)) {
                a.this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
                a.this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: cg.j1
                    @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        this.f5859a.lambda$onMetadata$4((Player.Listener) obj);
                    }
                });
            }
            a.this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: cg.k1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(metadata);
                }
            });
            a.this.listeners.flushEvents();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object obj, long j10) {
            a.this.analyticsCollector.onRenderedFirstFrame(obj, j10);
            if (a.this.videoOutput == obj) {
                a.this.listeners.sendEvent(26, new c0());
            }
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (a.this.skipSilenceEnabled == z10) {
                return;
            }
            a.this.skipSilenceEnabled = z10;
            a.this.listeners.sendEvent(23, new ListenerSet.Event() { // from class: cg.d1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public void onSleepingForOffloadChanged(boolean z10) {
            a.this.updateWakeAndWifiLock();
        }

        @Override // io.bidmachine.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i10) {
            final DeviceInfo deviceInfoCreateDeviceInfo = a.createDeviceInfo(a.this.streamVolumeManager);
            if (deviceInfoCreateDeviceInfo.equals(a.this.deviceInfo)) {
                return;
            }
            a.this.deviceInfo = deviceInfoCreateDeviceInfo;
            a.this.listeners.sendEvent(29, new ListenerSet.Event() { // from class: cg.i1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(deviceInfoCreateDeviceInfo);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i10, final boolean z10) {
            a.this.listeners.sendEvent(30, new ListenerSet.Event() { // from class: cg.h1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            a.this.setSurfaceTextureInternal(surfaceTexture);
            a.this.maybeNotifySurfaceSizeChanged(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a.this.setVideoOutputInternal(null);
            a.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            a.this.maybeNotifySurfaceSizeChanged(i10, i11);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecError(Exception exc) {
            a.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            a.this.analyticsCollector.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String str) {
            a.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters decoderCounters) {
            a.this.analyticsCollector.onVideoDisabled(decoderCounters);
            a.this.videoFormat = null;
            a.this.videoDecoderCounters = null;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters decoderCounters) {
            a.this.videoDecoderCounters = decoderCounters;
            a.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j10, int i10) {
            a.this.analyticsCollector.onVideoFrameProcessingOffset(j10, i10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            a.this.videoFormat = format;
            a.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoSizeChanged(final VideoSize videoSize) {
            a.this.videoSize = videoSize;
            a.this.listeners.sendEvent(25, new ListenerSet.Event() { // from class: cg.f1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(videoSize);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
            a.this.setVideoOutputInternal(surface);
        }

        @Override // io.bidmachine.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
            a.this.setVideoOutputInternal(null);
        }

        @Override // io.bidmachine.media3.exoplayer.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f10) {
            a.this.sendVolumeToRenderers();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            a.this.maybeNotifySurfaceSizeChanged(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (a.this.surfaceHolderSurfaceIsVideoOutput) {
                a.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (a.this.surfaceHolderSurfaceIsVideoOutput) {
                a.this.setVideoOutputInternal(null);
            }
            a.this.maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class e implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;

        @Nullable
        private CameraMotionListener cameraMotionListener;

        @Nullable
        private CameraMotionListener internalCameraMotionListener;

        @Nullable
        private VideoFrameMetadataListener internalVideoFrameMetadataListener;

        @Nullable
        private VideoFrameMetadataListener videoFrameMetadataListener;

        private e() {
        }

        @Override // io.bidmachine.media3.exoplayer.PlayerMessage.Target
        public void handleMessage(int i10, @Nullable Object obj) {
            if (i10 == 7) {
                this.videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i10 == 8) {
                this.cameraMotionListener = (CameraMotionListener) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotion(long j10, float[] fArr) {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j10, fArr);
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j10, fArr);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j10, long j11, Format format, @Nullable MediaFormat mediaFormat) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j10, j11, format, mediaFormat);
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j10, j11, format, mediaFormat);
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class f implements r1 {
        private final MediaSource mediaSource;
        private Timeline timeline;
        private final Object uid;

        @Override // cg.r1
        public Timeline getTimeline() {
            return this.timeline;
        }

        @Override // cg.r1
        public Object getUid() {
            return this.uid;
        }

        public void updateTimeline(Timeline timeline) {
            this.timeline = timeline;
        }

        public f(Object obj, MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.mediaSource = maskingMediaSource;
            this.timeline = maskingMediaSource.getTimeline();
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    @RequiresApi(23)
    public final class g extends AudioDeviceCallback {
        private g() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (a.this.hasSupportedAudioOutput() && a.this.playbackInfo.playbackSuppressionReason == 3) {
                a aVar = a.this;
                aVar.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(aVar.playbackInfo.playWhenReady, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (a.this.hasSupportedAudioOutput()) {
                return;
            }
            a aVar = a.this;
            aVar.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(aVar.playbackInfo.playWhenReady, 1, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"HandlerLeak"})
    public a(ExoPlayer.Builder builder, @Nullable Player player) {
        StreamVolumeManager streamVolumeManager;
        ConditionVariable conditionVariable = new ConditionVariable();
        this.constructorFinished = conditionVariable;
        try {
            Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + Util.DEVICE_DEBUG_INFO + C3426d4.j.f28588e);
            Context applicationContext = builder.context.getApplicationContext();
            this.applicationContext = applicationContext;
            AnalyticsCollector analyticsCollectorApply = builder.analyticsCollectorFunction.apply(builder.clock);
            this.analyticsCollector = analyticsCollectorApply;
            this.priority = builder.priority;
            this.priorityTaskManager = builder.priorityTaskManager;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            d dVar = new d();
            this.componentListener = dVar;
            e eVar = new e();
            this.frameMetadataListener = eVar;
            Handler handler = new Handler(builder.looper);
            Renderer[] rendererArrCreateRenderers = builder.renderersFactorySupplier.get().createRenderers(handler, dVar, dVar, dVar, dVar);
            this.renderers = rendererArrCreateRenderers;
            Assertions.checkState(rendererArrCreateRenderers.length > 0);
            TrackSelector trackSelector = builder.trackSelectorSupplier.get();
            this.trackSelector = trackSelector;
            this.mediaSourceFactory = builder.mediaSourceFactorySupplier.get();
            BandwidthMeter bandwidthMeter = builder.bandwidthMeterSupplier.get();
            this.bandwidthMeter = bandwidthMeter;
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            Looper looper = builder.looper;
            this.applicationLooper = looper;
            Clock clock = builder.clock;
            this.clock = clock;
            Player player2 = player == null ? this : player;
            this.wrappingPlayer = player2;
            boolean z10 = builder.suppressPlaybackOnUnsuitableOutput;
            this.suppressPlaybackOnUnsuitableOutput = z10;
            this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: cg.h0
                @Override // io.bidmachine.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(Object obj, FlagSet flagSet) {
                    this.f5850a.lambda$new$0((Player.Listener) obj, flagSet);
                }
            });
            this.audioOffloadListeners = new CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new ArrayList();
            this.shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
            this.preloadConfiguration = ExoPlayer.PreloadConfiguration.DEFAULT;
            TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArrCreateRenderers.length], new ExoTrackSelection[rendererArrCreateRenderers.length], Tracks.EMPTY, null);
            this.emptyTrackSelectorResult = trackSelectorResult;
            this.period = new Timeline.Period();
            Player.Commands commandsBuild = new Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).addIf(29, trackSelector.isSetParametersSupported()).addIf(23, builder.deviceVolumeControlEnabled).addIf(25, builder.deviceVolumeControlEnabled).addIf(33, builder.deviceVolumeControlEnabled).addIf(26, builder.deviceVolumeControlEnabled).addIf(34, builder.deviceVolumeControlEnabled).build();
            this.permanentAvailableCommands = commandsBuild;
            this.availableCommands = new Player.Commands.Builder().addAll(commandsBuild).add(4).add(10).build();
            this.playbackInfoUpdateHandler = clock.createHandler(looper, null);
            ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener = new ExoPlayerImplInternal.PlaybackInfoUpdateListener() { // from class: cg.i0
                @Override // io.bidmachine.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
                public final void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
                    this.f5855a.lambda$new$2(playbackInfoUpdate);
                }
            };
            this.playbackInfoUpdateListener = playbackInfoUpdateListener;
            this.playbackInfo = f2.createDummy(trackSelectorResult);
            analyticsCollectorApply.setPlayer(player2, looper);
            int i10 = Util.SDK_INT;
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(rendererArrCreateRenderers, trackSelector, trackSelectorResult, builder.loadControlSupplier.get(), bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, analyticsCollectorApply, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, builder.dynamicSchedulingEnabled, looper, clock, playbackInfoUpdateListener, i10 < 31 ? new PlayerId(builder.playerName) : c.registerMediaMetricsListener(applicationContext, this, builder.usePlatformDiagnostics, builder.playerName), builder.playbackLooper, this.preloadConfiguration);
            this.internalPlayer = exoPlayerImplInternal;
            this.volume = 1.0f;
            this.repeatMode = 0;
            MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
            this.mediaMetadata = mediaMetadata;
            this.playlistMetadata = mediaMetadata;
            this.staticAndDynamicMediaMetadata = mediaMetadata;
            this.maskingWindowIndex = -1;
            if (i10 < 21) {
                this.audioSessionId = initializeKeepSessionIdAudioTrack(0);
            } else {
                this.audioSessionId = Util.generateAudioSessionIdV21(applicationContext);
            }
            this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
            this.throwsWhenUsingWrongThread = true;
            addListener(analyticsCollectorApply);
            bandwidthMeter.addEventListener(new Handler(looper), analyticsCollectorApply);
            addAudioOffloadListener(dVar);
            long j10 = builder.foregroundModeTimeoutMs;
            if (j10 > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(j10);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.context, handler, dVar);
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            AudioFocusManager audioFocusManager = new AudioFocusManager(builder.context, handler, dVar);
            this.audioFocusManager = audioFocusManager;
            audioFocusManager.setAudioAttributes(builder.handleAudioFocus ? this.audioAttributes : null);
            if (!z10 || i10 < 23) {
                streamVolumeManager = null;
            } else {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.audioManager = audioManager;
                streamVolumeManager = null;
                b.registerAudioDeviceCallback(audioManager, new g(), new Handler(looper));
            }
            if (builder.deviceVolumeControlEnabled) {
                StreamVolumeManager streamVolumeManager2 = new StreamVolumeManager(builder.context, handler, dVar);
                this.streamVolumeManager = streamVolumeManager2;
                streamVolumeManager2.setStreamType(Util.getStreamTypeForAudioUsage(this.audioAttributes.usage));
            } else {
                this.streamVolumeManager = streamVolumeManager;
            }
            i2 i2Var = new i2(builder.context);
            this.wakeLockManager = i2Var;
            i2Var.setEnabled(builder.wakeMode != 0);
            j2 j2Var = new j2(builder.context);
            this.wifiLockManager = j2Var;
            j2Var.setEnabled(builder.wakeMode == 2);
            this.deviceInfo = createDeviceInfo(this.streamVolumeManager);
            this.videoSize = VideoSize.UNKNOWN;
            this.surfaceSize = Size.UNKNOWN;
            trackSelector.setAudioAttributes(this.audioAttributes);
            sendRendererMessage(1, 10, Integer.valueOf(this.audioSessionId));
            sendRendererMessage(2, 10, Integer.valueOf(this.audioSessionId));
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(2, 7, eVar);
            sendRendererMessage(6, 8, eVar);
            sendRendererMessage(16, Integer.valueOf(this.priority));
            conditionVariable.open();
        } catch (Throwable th2) {
            this.constructorFinished.open();
            throw th2;
        }
    }

    @Nullable
    private Pair<Object, Long> getPeriodPositionUsAfterTimelineChanged(Timeline timeline, Timeline timeline2, int i10, long j10) {
        if (timeline.isEmpty() || timeline2.isEmpty()) {
            boolean z10 = !timeline.isEmpty() && timeline2.isEmpty();
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i10, Util.msToUs(j10));
        Object obj = ((Pair) Util.castNonNull(periodPositionUs)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iResolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        return iResolveSubsequentPeriod != -1 ? maskWindowPositionMsOrGetPeriodPositionUs(timeline2, iResolveSubsequentPeriod, timeline2.getWindow(iResolveSubsequentPeriod, this.window).getDefaultPositionMs()) : maskWindowPositionMsOrGetPeriodPositionUs(timeline2, -1, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    private void sendRendererMessage(int i10, @Nullable Object obj) {
        sendRendererMessage(-1, i10, obj);
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = this.surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        f2 f2Var = this.playbackInfo;
        if (f2Var.playbackState != 1) {
            return;
        }
        f2 f2VarCopyWithPlaybackError = f2Var.copyWithPlaybackError(null);
        f2 f2VarCopyWithPlaybackState = f2VarCopyWithPlaybackError.copyWithPlaybackState(f2VarCopyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(f2VarCopyWithPlaybackState, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z10) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z10, 1);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i10) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i10, 1);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z10) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    @RequiresApi(23)
    public static final class b {
        private b() {
        }

        @DoNotInline
        public static boolean isSuitableAudioOutputPresentInAudioDeviceInfoList(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!Util.isWear(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = Util.SDK_INT;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @DoNotInline
        public static void registerAudioDeviceCallback(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    @RequiresApi(31)
    public static final class c {
        private c() {
        }

        @DoNotInline
        public static PlayerId registerMediaMetricsListener(Context context, a aVar, boolean z10, String str) {
            MediaMetricsListener mediaMetricsListenerCreate = MediaMetricsListener.create(context);
            if (mediaMetricsListenerCreate == null) {
                Log.w(a.TAG, "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z10) {
                aVar.addAnalyticsListener(mediaMetricsListenerCreate);
            }
            return new PlayerId(mediaMetricsListenerCreate.getLogSessionId(), str);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    private List<MediaSourceList.c> addMediaSourceHolders(int i10, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            MediaSourceList.c cVar = new MediaSourceList.c(list.get(i11), this.useLazyPreparation);
            arrayList.add(cVar);
            this.mediaSourceHolderSnapshots.add(i11 + i10, new f(cVar.uid, cVar.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    private f2 addMediaSourcesInternal(f2 f2Var, int i10, List<MediaSource> list) {
        Timeline timeline = f2Var.timeline;
        this.pendingOperationAcks++;
        List<MediaSourceList.c> listAddMediaSourceHolders = addMediaSourceHolders(i10, list);
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        f2 f2VarMaskTimelineAndPosition = maskTimelineAndPosition(f2Var, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(f2Var), getContentPositionInternal(f2Var)));
        this.internalPlayer.addMediaSources(i10, listAddMediaSourceHolders, this.shuffleOrder);
        return f2VarMaskTimelineAndPosition;
    }

    private boolean canUpdateMediaSourcesWithMediaItems(int i10, int i11, List<MediaItem> list) {
        if (i11 - i10 != list.size()) {
            return false;
        }
        for (int i12 = i10; i12 < i11; i12++) {
            if (!this.mediaSourceHolderSnapshots.get(i12).mediaSource.canUpdateMediaItem(list.get(i12 - i10))) {
                return false;
            }
        }
        return true;
    }

    private int computePlaybackSuppressionReason(boolean z10, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (!this.suppressPlaybackOnUnsuitableOutput) {
            return 0;
        }
        if (!z10 || hasSupportedAudioOutput()) {
            return (z10 || this.playbackInfo.playbackSuppressionReason != 3) ? 0 : 3;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceInfo createDeviceInfo(@Nullable StreamVolumeManager streamVolumeManager) {
        return new DeviceInfo.Builder(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
    }

    private Timeline createMaskingTimeline() {
        return new g2(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private List<MediaSource> createMediaSources(List<MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i10)));
        }
        return arrayList;
    }

    private PlayerMessage createMessageInternal(PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        Timeline timeline = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, currentWindowIndexInternal, this.clock, exoPlayerImplInternal.getPlaybackLooper());
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(f2 f2Var, f2 f2Var2, boolean z10, int i10, boolean z11, boolean z12) {
        Timeline timeline = f2Var2.timeline;
        Timeline timeline2 = f2Var.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(f2Var2.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(f2Var.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            if (z10 && i10 == 0 && f2Var2.periodId.windowSequenceNumber < f2Var.periodId.windowSequenceNumber) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private long getContentPositionInternal(f2 f2Var) {
        if (!f2Var.periodId.isAd()) {
            return Util.usToMs(getCurrentPositionUsInternal(f2Var));
        }
        f2Var.timeline.getPeriodByUid(f2Var.periodId.periodUid, this.period);
        return f2Var.requestedContentPositionUs == -9223372036854775807L ? f2Var.timeline.getWindow(getCurrentWindowIndexInternal(f2Var), this.window).getDefaultPositionMs() : this.period.getPositionInWindowMs() + Util.usToMs(f2Var.requestedContentPositionUs);
    }

    private long getCurrentPositionUsInternal(f2 f2Var) {
        if (f2Var.timeline.isEmpty()) {
            return Util.msToUs(this.maskingWindowPositionMs);
        }
        long estimatedPositionUs = f2Var.sleepingForOffload ? f2Var.getEstimatedPositionUs() : f2Var.positionUs;
        return f2Var.periodId.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(f2Var.timeline, f2Var.periodId, estimatedPositionUs);
    }

    private int getCurrentWindowIndexInternal(f2 f2Var) {
        return f2Var.timeline.isEmpty() ? this.maskingWindowIndex : f2Var.timeline.getPeriodByUid(f2Var.periodId.periodUid, this.period).windowIndex;
    }

    private Player.PositionInfo getPreviousPositionInfo(int i10, f2 f2Var, int i11) {
        int i12;
        int indexOfPeriod;
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        long requestedContentPositionUs;
        long requestedContentPositionUs2;
        Timeline.Period period = new Timeline.Period();
        if (f2Var.timeline.isEmpty()) {
            i12 = i11;
            indexOfPeriod = -1;
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            Object obj3 = f2Var.periodId.periodUid;
            f2Var.timeline.getPeriodByUid(obj3, period);
            int i13 = period.windowIndex;
            i12 = i13;
            obj2 = obj3;
            indexOfPeriod = f2Var.timeline.getIndexOfPeriod(obj3);
            obj = f2Var.timeline.getWindow(i13, this.window).uid;
            mediaItem = this.window.mediaItem;
        }
        if (i10 == 0) {
            if (f2Var.periodId.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId = f2Var.periodId;
                requestedContentPositionUs = period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                requestedContentPositionUs2 = getRequestedContentPositionUs(f2Var);
            } else {
                requestedContentPositionUs = f2Var.periodId.nextAdGroupIndex != -1 ? getRequestedContentPositionUs(this.playbackInfo) : period.positionInWindowUs + period.durationUs;
                requestedContentPositionUs2 = requestedContentPositionUs;
            }
        } else if (f2Var.periodId.isAd()) {
            requestedContentPositionUs = f2Var.positionUs;
            requestedContentPositionUs2 = getRequestedContentPositionUs(f2Var);
        } else {
            requestedContentPositionUs = period.positionInWindowUs + f2Var.positionUs;
            requestedContentPositionUs2 = requestedContentPositionUs;
        }
        long jUsToMs = Util.usToMs(requestedContentPositionUs);
        long jUsToMs2 = Util.usToMs(requestedContentPositionUs2);
        MediaSource.MediaPeriodId mediaPeriodId2 = f2Var.periodId;
        return new Player.PositionInfo(obj, i12, mediaItem, obj2, indexOfPeriod, jUsToMs, jUsToMs2, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(f2 f2Var) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        f2Var.timeline.getPeriodByUid(f2Var.periodId.periodUid, period);
        return f2Var.requestedContentPositionUs == -9223372036854775807L ? f2Var.timeline.getWindow(period.windowIndex, window).getDefaultPositionUs() : period.getPositionInWindowUs() + f2Var.requestedContentPositionUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        long jPeriodPositionUsToWindowPositionUs;
        int i10 = this.pendingOperationAcks - playbackInfoUpdate.operationAcks;
        this.pendingOperationAcks = i10;
        boolean z10 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (i10 == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
                this.maskingPeriodIndex = 0;
            }
            if (!timeline.isEmpty()) {
                List<Timeline> childTimelines = ((g2) timeline).getChildTimelines();
                Assertions.checkState(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i11 = 0; i11 < childTimelines.size(); i11++) {
                    this.mediaSourceHolderSnapshots.get(i11).updateTimeline(childTimelines.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.pendingDiscontinuity) {
                if (playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId) && playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs) {
                    z10 = false;
                }
                if (z10) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        jPeriodPositionUsToWindowPositionUs = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        f2 f2Var = playbackInfoUpdate.playbackInfo;
                        jPeriodPositionUsToWindowPositionUs = periodPositionUsToWindowPositionUs(timeline, f2Var.periodId, f2Var.discontinuityStartPositionUs);
                    }
                    j10 = jPeriodPositionUsToWindowPositionUs;
                }
            } else {
                z10 = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, z10, this.pendingDiscontinuityReason, j10, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSupportedAudioOutput() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null || Util.SDK_INT < 23) {
            return true;
        }
        return b.isSuitableAudioOutputPresentInAudioDeviceInfoList(this.applicationContext, audioManager.getDevices(2));
    }

    private int initializeKeepSessionIdAudioTrack(int i10) {
        AudioTrack audioTrack = this.keepSessionIdAudioTrack;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.keepSessionIdAudioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        if (this.keepSessionIdAudioTrack == null) {
            this.keepSessionIdAudioTrack = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.keepSessionIdAudioTrack.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this.wrappingPlayer, new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(final ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new Runnable() { // from class: cg.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5878b.lambda$new$1(playbackInfoUpdate);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$5(Player.Listener listener) {
        listener.onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$7(Player.Listener listener) {
        listener.onPlaylistMetadataChanged(this.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAvailableCommands$26(Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$12(f2 f2Var, int i10, Player.Listener listener) {
        listener.onTimelineChanged(f2Var.timeline, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$15(f2 f2Var, Player.Listener listener) {
        listener.onPlayerErrorChanged(f2Var.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$16(f2 f2Var, Player.Listener listener) {
        listener.onPlayerError(f2Var.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$17(f2 f2Var, Player.Listener listener) {
        listener.onTracksChanged(f2Var.trackSelectorResult.tracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$19(f2 f2Var, Player.Listener listener) {
        listener.onLoadingChanged(f2Var.isLoading);
        listener.onIsLoadingChanged(f2Var.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$20(f2 f2Var, Player.Listener listener) {
        listener.onPlayerStateChanged(f2Var.playWhenReady, f2Var.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$21(f2 f2Var, Player.Listener listener) {
        listener.onPlaybackStateChanged(f2Var.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$22(f2 f2Var, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(f2Var.playWhenReady, f2Var.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$23(f2 f2Var, Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(f2Var.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$25(f2 f2Var, Player.Listener listener) {
        listener.onPlaybackParametersChanged(f2Var.playbackParameters);
    }

    private f2 maskTimelineAndPosition(f2 f2Var, Timeline timeline, @Nullable Pair<Object, Long> pair) {
        Assertions.checkArgument(timeline.isEmpty() || pair != null);
        Timeline timeline2 = f2Var.timeline;
        long contentPositionInternal = getContentPositionInternal(f2Var);
        f2 f2VarCopyWithTimeline = f2Var.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = f2.getDummyPeriodForEmptyTimeline();
            long jMsToUs = Util.msToUs(this.maskingWindowPositionMs);
            f2 f2VarCopyWithLoadingMediaPeriodId = f2VarCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, ImmutableList.of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            f2VarCopyWithLoadingMediaPeriodId.bufferedPositionUs = f2VarCopyWithLoadingMediaPeriodId.positionUs;
            return f2VarCopyWithLoadingMediaPeriodId;
        }
        Object obj = f2VarCopyWithTimeline.periodId.periodUid;
        boolean z10 = !obj.equals(((Pair) Util.castNonNull(pair)).first);
        MediaSource.MediaPeriodId mediaPeriodId = z10 ? new MediaSource.MediaPeriodId(pair.first) : f2VarCopyWithTimeline.periodId;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = Util.msToUs(contentPositionInternal);
        if (!timeline2.isEmpty()) {
            jMsToUs2 -= timeline2.getPeriodByUid(obj, this.period).getPositionInWindowUs();
        }
        if (z10 || jLongValue < jMsToUs2) {
            Assertions.checkState(!mediaPeriodId.isAd());
            f2 f2VarCopyWithLoadingMediaPeriodId2 = f2VarCopyWithTimeline.copyWithNewPosition(mediaPeriodId, jLongValue, jLongValue, jLongValue, 0L, z10 ? TrackGroupArray.EMPTY : f2VarCopyWithTimeline.trackGroups, z10 ? this.emptyTrackSelectorResult : f2VarCopyWithTimeline.trackSelectorResult, z10 ? ImmutableList.of() : f2VarCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
            f2VarCopyWithLoadingMediaPeriodId2.bufferedPositionUs = jLongValue;
            return f2VarCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue == jMsToUs2) {
            int indexOfPeriod = timeline.getIndexOfPeriod(f2VarCopyWithTimeline.loadingMediaPeriodId.periodUid);
            if (indexOfPeriod == -1 || timeline.getPeriod(indexOfPeriod, this.period).windowIndex != timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
                timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
                long adDurationUs = mediaPeriodId.isAd() ? this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : this.period.durationUs;
                f2VarCopyWithTimeline = f2VarCopyWithTimeline.copyWithNewPosition(mediaPeriodId, f2VarCopyWithTimeline.positionUs, f2VarCopyWithTimeline.positionUs, f2VarCopyWithTimeline.discontinuityStartPositionUs, adDurationUs - f2VarCopyWithTimeline.positionUs, f2VarCopyWithTimeline.trackGroups, f2VarCopyWithTimeline.trackSelectorResult, f2VarCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
                f2VarCopyWithTimeline.bufferedPositionUs = adDurationUs;
            }
        } else {
            Assertions.checkState(!mediaPeriodId.isAd());
            long jMax = Math.max(0L, f2VarCopyWithTimeline.totalBufferedDurationUs - (jLongValue - jMsToUs2));
            long j10 = f2VarCopyWithTimeline.bufferedPositionUs;
            if (f2VarCopyWithTimeline.loadingMediaPeriodId.equals(f2VarCopyWithTimeline.periodId)) {
                j10 = jLongValue + jMax;
            }
            f2VarCopyWithTimeline = f2VarCopyWithTimeline.copyWithNewPosition(mediaPeriodId, jLongValue, jLongValue, jLongValue, jMax, f2VarCopyWithTimeline.trackGroups, f2VarCopyWithTimeline.trackSelectorResult, f2VarCopyWithTimeline.staticMetadata);
            f2VarCopyWithTimeline.bufferedPositionUs = j10;
        }
        return f2VarCopyWithTimeline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i10, final int i11) {
        if (i10 == this.surfaceSize.getWidth() && i11 == this.surfaceSize.getHeight()) {
            return;
        }
        this.surfaceSize = new Size(i10, i11);
        this.listeners.sendEvent(24, new ListenerSet.Event() { // from class: cg.g0
            @Override // io.bidmachine.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        sendRendererMessage(2, 14, new Size(i10, i11));
    }

    private long periodPositionUsToWindowPositionUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j10) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return j10 + this.period.getPositionInWindowUs();
    }

    private void removeMediaSourceHolders(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.mediaSourceHolderSnapshots.remove(i12);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i10, i11);
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                Log.w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    private void sendRendererMessage(int i10, int i11, @Nullable Object obj) {
        for (Renderer renderer : this.renderers) {
            if (i10 == -1 || renderer.getTrackType() == i10) {
                createMessageInternal(renderer).setType(i11).setPayload(obj).send();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, Float.valueOf(this.volume * this.audioFocusManager.getVolumeMultiplier()));
    }

    private void setMediaSourcesInternal(List<MediaSource> list, int i10, long j10, boolean z10) {
        int firstWindowIndex;
        long j11;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        List<MediaSourceList.c> listAddMediaSourceHolders = addMediaSourceHolders(0, list);
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        if (!timelineCreateMaskingTimeline.isEmpty() && i10 >= timelineCreateMaskingTimeline.getWindowCount()) {
            throw new IllegalSeekPositionException(timelineCreateMaskingTimeline, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            firstWindowIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
        } else if (i10 == -1) {
            firstWindowIndex = currentWindowIndexInternal;
            j11 = currentPosition;
        } else {
            firstWindowIndex = i10;
            j11 = j10;
        }
        f2 f2VarMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, firstWindowIndex, j11));
        int i11 = f2VarMaskTimelineAndPosition.playbackState;
        if (firstWindowIndex != -1 && i11 != 1) {
            i11 = (timelineCreateMaskingTimeline.isEmpty() || firstWindowIndex >= timelineCreateMaskingTimeline.getWindowCount()) ? 4 : 2;
        }
        f2 f2VarCopyWithPlaybackState = f2VarMaskTimelineAndPosition.copyWithPlaybackState(i11);
        this.internalPlayer.setMediaSources(listAddMediaSourceHolders, firstWindowIndex, Util.msToUs(j11), this.shuffleOrder);
        updatePlaybackInfo(f2VarCopyWithPlaybackState, 0, (this.playbackInfo.periodId.periodUid.equals(f2VarCopyWithPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(f2VarCopyWithPlaybackState), -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                arrayList.add(createMessageInternal(renderer).setType(1).setPayload(obj).send());
            }
        }
        Object obj2 = this.videoOutput;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).blockUntilDelivered(this.detachSurfaceTimeoutMs);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.videoOutput;
            Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (z10) {
            stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    private void stopInternal(@Nullable ExoPlaybackException exoPlaybackException) {
        f2 f2Var = this.playbackInfo;
        f2 f2VarCopyWithLoadingMediaPeriodId = f2Var.copyWithLoadingMediaPeriodId(f2Var.periodId);
        f2VarCopyWithLoadingMediaPeriodId.bufferedPositionUs = f2VarCopyWithLoadingMediaPeriodId.positionUs;
        f2VarCopyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        f2 f2VarCopyWithPlaybackState = f2VarCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            f2VarCopyWithPlaybackState = f2VarCopyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(f2VarCopyWithPlaybackState, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void updateAvailableCommands() {
        Player.Commands commands = this.availableCommands;
        Player.Commands availableCommands = Util.getAvailableCommands(this.wrappingPlayer, this.permanentAvailableCommands);
        this.availableCommands = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: cg.p0
            @Override // io.bidmachine.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.f5875a.lambda$updateAvailableCommands$26((Player.Listener) obj);
            }
        });
    }

    private void updateMediaSourcesWithMediaItems(int i10, int i11, List<MediaItem> list) {
        this.pendingOperationAcks++;
        this.internalPlayer.updateMediaSourcesWithMediaItems(i10, i11, list);
        for (int i12 = i10; i12 < i11; i12++) {
            f fVar = this.mediaSourceHolderSnapshots.get(i12);
            fVar.updateTimeline(new TimelineWithUpdatedMediaItem(fVar.getTimeline(), list.get(i12 - i10)));
        }
        updatePlaybackInfo(this.playbackInfo.copyWithTimeline(createMaskingTimeline()), 0, false, 4, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int iComputePlaybackSuppressionReason = computePlaybackSuppressionReason(z11, i10);
        f2 f2Var = this.playbackInfo;
        if (f2Var.playWhenReady == z11 && f2Var.playbackSuppressionReason == iComputePlaybackSuppressionReason && f2Var.playWhenReadyChangeReason == i11) {
            return;
        }
        updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(z11, i11, iComputePlaybackSuppressionReason);
    }

    private void updatePlaybackInfo(final f2 f2Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        f2 f2Var2 = this.playbackInfo;
        this.playbackInfo = f2Var;
        boolean z12 = !f2Var2.timeline.equals(f2Var.timeline);
        Pair<Boolean, Integer> pairEvaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(f2Var, f2Var2, z10, i11, z12, z11);
        boolean zBooleanValue = ((Boolean) pairEvaluateMediaItemTransitionReason.first).booleanValue();
        final int iIntValue = ((Integer) pairEvaluateMediaItemTransitionReason.second).intValue();
        final MediaItem mediaItem = null;
        if (zBooleanValue) {
            if (!f2Var.timeline.isEmpty()) {
                mediaItem = f2Var.timeline.getWindow(f2Var.timeline.getPeriodByUid(f2Var.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            }
            this.staticAndDynamicMediaMetadata = MediaMetadata.EMPTY;
        }
        if (zBooleanValue || !f2Var2.staticMetadata.equals(f2Var.staticMetadata)) {
            this.staticAndDynamicMediaMetadata = this.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(f2Var.staticMetadata).build();
        }
        MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean z13 = !mediaMetadataBuildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
        boolean z14 = f2Var2.playWhenReady != f2Var.playWhenReady;
        boolean z15 = f2Var2.playbackState != f2Var.playbackState;
        if (z15 || z14) {
            updateWakeAndWifiLock();
        }
        boolean z16 = f2Var2.isLoading;
        boolean z17 = f2Var.isLoading;
        boolean z18 = z16 != z17;
        if (z18) {
            updatePriorityTaskManagerForIsLoadingChange(z17);
        }
        if (z12) {
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: cg.b0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$12(f2Var, i10, (Player.Listener) obj);
                }
            });
        }
        if (z10) {
            final Player.PositionInfo previousPositionInfo = getPreviousPositionInfo(i11, f2Var2, i12);
            final Player.PositionInfo positionInfo = getPositionInfo(j10);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: cg.y0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$13(i11, previousPositionInfo, positionInfo, (Player.Listener) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: cg.z0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, iIntValue);
                }
            });
        }
        if (f2Var2.playbackError != f2Var.playbackError) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: cg.a1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$15(f2Var, (Player.Listener) obj);
                }
            });
            if (f2Var.playbackError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: cg.b1
                    @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$16(f2Var, (Player.Listener) obj);
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = f2Var2.trackSelectorResult;
        TrackSelectorResult trackSelectorResult2 = f2Var.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            this.trackSelector.onSelectionActivated(trackSelectorResult2.info);
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: cg.c1
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$17(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (z13) {
            final MediaMetadata mediaMetadata = this.mediaMetadata;
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: cg.c0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(mediaMetadata);
                }
            });
        }
        if (z18) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: cg.d0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$19(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (z15 || z14) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: cg.e0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$20(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (z15) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: cg.f0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$21(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (z14 || f2Var2.playWhenReadyChangeReason != f2Var.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: cg.m0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$22(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (f2Var2.playbackSuppressionReason != f2Var.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: cg.v0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$23(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (f2Var2.isPlaying() != f2Var.isPlaying()) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: cg.w0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$24(f2Var, (Player.Listener) obj);
                }
            });
        }
        if (!f2Var2.playbackParameters.equals(f2Var.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: cg.x0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$updatePlaybackInfo$25(f2Var, (Player.Listener) obj);
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (f2Var2.sleepingForOffload != f2Var.sleepingForOffload) {
            Iterator<ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSleepingForOffloadChanged(f2Var.sleepingForOffload);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(boolean z10, int i10, int i11) {
        this.pendingOperationAcks++;
        f2 f2VarCopyWithEstimatedPosition = this.playbackInfo;
        if (f2VarCopyWithEstimatedPosition.sleepingForOffload) {
            f2VarCopyWithEstimatedPosition = f2VarCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        f2 f2VarCopyWithPlayWhenReady = f2VarCopyWithEstimatedPosition.copyWithPlayWhenReady(z10, i10, i11);
        this.internalPlayer.setPlayWhenReady(z10, i10, i11);
        updatePlaybackInfo(f2VarCopyWithPlayWhenReady, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z10) {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (z10 && !this.isPriorityTaskManagerRegistered) {
                priorityTaskManager.add(this.priority);
                this.isPriorityTaskManagerRegistered = true;
            } else {
                if (z10 || !this.isPriorityTaskManagerRegistered) {
                    return;
                }
                priorityTaskManager.remove(this.priority);
                this.isPriorityTaskManagerRegistered = false;
            }
        }
    }

    private void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.throwsWhenUsingWrongThread) {
                throw new IllegalStateException(invariant);
            }
            Log.w(TAG, invariant, this.hasNotifiedFullWrongThreadWarning ? null : new IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.addListener((AnalyticsListener) Assertions.checkNotNull(analyticsListener));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public Clock getClock() {
        return this.clock;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        return this.preloadConfiguration;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void release() {
        AudioTrack audioTrack;
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + Util.DEVICE_DEBUG_INFO + "] [" + MediaLibraryInfo.registeredModules() + C3426d4.j.f28588e);
        verifyApplicationThread();
        if (Util.SDK_INT < 21 && (audioTrack = this.keepSessionIdAudioTrack) != null) {
            audioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        this.audioBecomingNoisyManager.setEnabled(false);
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        this.audioFocusManager.release();
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(10, new ListenerSet.Event() { // from class: cg.n0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    io.bidmachine.media3.exoplayer.a.lambda$release$5((Player.Listener) obj);
                }
            });
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        f2 f2Var = this.playbackInfo;
        if (f2Var.sleepingForOffload) {
            this.playbackInfo = f2Var.copyWithEstimatedPosition();
        }
        f2 f2VarCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = f2VarCopyWithPlaybackState;
        f2 f2VarCopyWithLoadingMediaPeriodId = f2VarCopyWithPlaybackState.copyWithLoadingMediaPeriodId(f2VarCopyWithPlaybackState.periodId);
        this.playbackInfo = f2VarCopyWithLoadingMediaPeriodId;
        f2VarCopyWithLoadingMediaPeriodId.bufferedPositionUs = f2VarCopyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        this.trackSelector.release();
        removeSurfaceCallbacks();
        Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager)).remove(this.priority);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
    }

    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.throwsWhenUsingWrongThread = z10;
        this.listeners.setThrowsWhenUsingWrongThread(z10);
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        if (analyticsCollector instanceof DefaultAnalyticsCollector) {
            ((DefaultAnalyticsCollector) analyticsCollector).setThrowsWhenUsingWrongThread(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaMetadata buildUpdatedMediaMetadata() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        return this.staticAndDynamicMediaMetadata.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    private Player.PositionInfo getPositionInfo(long j10) {
        int i10;
        MediaItem mediaItem;
        Object obj;
        long jUsToMs;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        Object obj2 = null;
        if (!this.playbackInfo.timeline.isEmpty()) {
            f2 f2Var = this.playbackInfo;
            Object obj3 = f2Var.periodId.periodUid;
            f2Var.timeline.getPeriodByUid(obj3, this.period);
            int indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            i10 = indexOfPeriod;
            obj = obj3;
            obj2 = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
        } else {
            i10 = -1;
            mediaItem = null;
            obj = null;
        }
        long jUsToMs2 = Util.usToMs(j10);
        if (this.playbackInfo.periodId.isAd()) {
            jUsToMs = Util.usToMs(getRequestedContentPositionUs(this.playbackInfo));
        } else {
            jUsToMs = jUsToMs2;
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        return new Player.PositionInfo(obj2, currentMediaItemIndex, mediaItem, obj, i10, jUsToMs2, jUsToMs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$13(int i10, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i10);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$24(f2 f2Var, Player.Listener listener) {
        listener.onIsPlayingChanged(f2Var.isPlaying());
    }

    @Nullable
    private Pair<Object, Long> maskWindowPositionMsOrGetPeriodPositionUs(Timeline timeline, int i10, long j10) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.maskingWindowPositionMs = j10;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i10 == -1 || i10 >= timeline.getWindowCount()) {
            i10 = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j10 = timeline.getWindow(i10, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i10, Util.msToUs(j10));
    }

    private f2 removeMediaItemsInternal(f2 f2Var, int i10, int i11) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(f2Var);
        long contentPositionInternal = getContentPositionInternal(f2Var);
        Timeline timeline = f2Var.timeline;
        int size = this.mediaSourceHolderSnapshots.size();
        boolean z10 = true;
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i10, i11);
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        f2 f2VarMaskTimelineAndPosition = maskTimelineAndPosition(f2Var, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        int i12 = f2VarMaskTimelineAndPosition.playbackState;
        if (i12 == 1 || i12 == 4 || i10 >= i11 || i11 != size || currentWindowIndexInternal < f2VarMaskTimelineAndPosition.timeline.getWindowCount()) {
            z10 = false;
        }
        if (z10) {
            f2VarMaskTimelineAndPosition = f2VarMaskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i10, i11, this.shuffleOrder);
        return f2VarMaskTimelineAndPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        boolean z10 = true;
        if (playbackState != 1) {
            if (playbackState != 2 && playbackState != 3) {
                if (playbackState != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean zIsSleepingForOffload = isSleepingForOffload();
                i2 i2Var = this.wakeLockManager;
                if (!getPlayWhenReady() || zIsSleepingForOffload) {
                    z10 = false;
                }
                i2Var.setStayAwake(z10);
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void addMediaItems(int i10, List<MediaItem> list) {
        verifyApplicationThread();
        addMediaSources(i10, createMediaSources(list));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i10, MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i10, Collections.singletonList(mediaSource));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i10, List<MediaSource> list) {
        verifyApplicationThread();
        Assertions.checkArgument(i10 >= 0);
        int iMin = Math.min(i10, this.mediaSourceHolderSnapshots.size());
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            setMediaSources(list, this.maskingWindowIndex == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.playbackInfo, iMin, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new AuxEffectInfo(0, 0.0f));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder != null && surfaceHolder == this.surfaceHolder) {
            clearVideoSurface();
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        SurfaceHolder holder;
        verifyApplicationThread();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        clearVideoSurfaceHolder(holder);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        verifyApplicationThread();
        if (textureView != null && textureView == this.textureView) {
            clearVideoSurface();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.AudioComponent getAudioComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Nullable
    public Format getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionId;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            f2 f2Var = this.playbackInfo;
            if (f2Var.loadingMediaPeriodId.equals(f2Var.periodId)) {
                return Util.usToMs(this.playbackInfo.bufferedPositionUs);
            }
            return getDuration();
        }
        return getContentBufferedPosition();
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        f2 f2Var = this.playbackInfo;
        if (f2Var.loadingMediaPeriodId.windowSequenceNumber != f2Var.periodId.windowSequenceNumber) {
            return f2Var.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j10 = f2Var.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            f2 f2Var2 = this.playbackInfo;
            Timeline.Period periodByUid = f2Var2.timeline.getPeriodByUid(f2Var2.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                j10 = periodByUid.durationUs;
            } else {
                j10 = adGroupTimeUs;
            }
        }
        f2 f2Var3 = this.playbackInfo;
        return Util.usToMs(periodPositionUsToWindowPositionUs(f2Var3.timeline, f2Var3.loadingMediaPeriodId, j10));
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.playbackInfo);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public CueGroup getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        f2 f2Var = this.playbackInfo;
        return f2Var.timeline.getIndexOfPeriod(f2Var.periodId.periodUid);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.DeviceComponent getDeviceComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            f2 f2Var = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = f2Var.periodId;
            f2Var.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
            return Util.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return this.maxSeekToPreviousPositionMs;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public Renderer getRenderer(int i10) {
        verifyApplicationThread();
        return this.renderers[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public int getRendererType(int i10) {
        verifyApplicationThread();
        return this.renderers[i10].getTrackType();
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public Size getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.TextComponent getTextComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return Util.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return this.trackSelector.getParameters();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.VideoComponent getVideoComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Nullable
    public Format getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public VideoSize getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        verifyApplicationThread();
        return this.playerReleased;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void moveMediaItems(int i10, int i11, int i12) {
        boolean z10;
        verifyApplicationThread();
        if (i10 >= 0 && i10 <= i11 && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 < size && i10 != iMin && i10 != iMin2) {
            Timeline currentTimeline = getCurrentTimeline();
            this.pendingOperationAcks++;
            Util.moveItems(this.mediaSourceHolderSnapshots, i10, iMin, iMin2);
            Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
            f2 f2Var = this.playbackInfo;
            f2 f2VarMaskTimelineAndPosition = maskTimelineAndPosition(f2Var, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(f2Var), getContentPositionInternal(this.playbackInfo)));
            this.internalPlayer.moveMediaSources(i10, iMin, iMin2, this.shuffleOrder);
            updatePlaybackInfo(f2VarMaskTimelineAndPosition, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        verifyApplicationThread();
        this.analyticsCollector.removeListener((AnalyticsListener) Assertions.checkNotNull(analyticsListener));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        verifyApplicationThread();
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        this.listeners.remove((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void removeMediaItems(int i10, int i11) {
        boolean z10;
        verifyApplicationThread();
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = Math.min(i11, size);
        if (i10 < size && i10 != iMin) {
            f2 f2VarRemoveMediaItemsInternal = removeMediaItemsInternal(this.playbackInfo, i10, iMin);
            updatePlaybackInfo(f2VarRemoveMediaItemsInternal, 0, !f2VarRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(f2VarRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void replaceMediaItems(int i10, int i11, List<MediaItem> list) {
        boolean z10;
        verifyApplicationThread();
        boolean z11 = false;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        int size = this.mediaSourceHolderSnapshots.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        if (canUpdateMediaSourcesWithMediaItems(i10, iMin, list)) {
            updateMediaSourcesWithMediaItems(i10, iMin, list);
            return;
        }
        List<MediaSource> listCreateMediaSources = createMediaSources(list);
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            if (this.maskingWindowIndex == -1) {
                z11 = true;
            }
            setMediaSources(listCreateMediaSources, z11);
        } else {
            f2 f2VarRemoveMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.playbackInfo, iMin, listCreateMediaSources), i10, iMin);
            updatePlaybackInfo(f2VarRemoveMediaItemsInternal, 0, !f2VarRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(f2VarRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer
    public void seekTo(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        verifyApplicationThread();
        if (i10 == -1) {
            return;
        }
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        Timeline timeline = this.playbackInfo.timeline;
        if (!timeline.isEmpty() && i10 >= timeline.getWindowCount()) {
            return;
        }
        this.analyticsCollector.notifySeekStarted();
        this.pendingOperationAcks++;
        if (isPlayingAd()) {
            Log.w(TAG, "seekTo ignored because an ad is playing");
            ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
            playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
            return;
        }
        f2 f2VarCopyWithPlaybackState = this.playbackInfo;
        int i12 = f2VarCopyWithPlaybackState.playbackState;
        if (i12 == 3 || (i12 == 4 && !timeline.isEmpty())) {
            f2VarCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(2);
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        f2 f2VarMaskTimelineAndPosition = maskTimelineAndPosition(f2VarCopyWithPlaybackState, timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i10, j10));
        this.internalPlayer.seekTo(timeline, i10, Util.msToUs(j10));
        updatePlaybackInfo(f2VarMaskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(f2VarMaskTimelineAndPosition), currentMediaItemIndex, z10);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setAudioAttributes(final AudioAttributes audioAttributes, boolean z10) {
        AudioAttributes audioAttributes2;
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        if (!Util.areEqual(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            sendRendererMessage(1, 3, audioAttributes);
            StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(Util.getStreamTypeForAudioUsage(audioAttributes.usage));
            }
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: cg.u0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(audioAttributes);
                }
            });
        }
        AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (z10) {
            audioAttributes2 = audioAttributes;
        } else {
            audioAttributes2 = null;
        }
        audioFocusManager.setAudioAttributes(audioAttributes2);
        this.trackSelector.setAudioAttributes(audioAttributes);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, getPlaybackState());
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        this.listeners.flushEvents();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAudioSessionId(final int i10) {
        verifyApplicationThread();
        if (this.audioSessionId == i10) {
            return;
        }
        if (i10 == 0) {
            if (Util.SDK_INT < 21) {
                i10 = initializeKeepSessionIdAudioTrack(0);
            } else {
                i10 = Util.generateAudioSessionIdV21(this.applicationContext);
            }
        } else if (Util.SDK_INT < 21) {
            initializeKeepSessionIdAudioTrack(i10);
        }
        this.audioSessionId = i10;
        sendRendererMessage(1, 10, Integer.valueOf(i10));
        sendRendererMessage(2, 10, Integer.valueOf(i10));
        this.listeners.sendEvent(21, new ListenerSet.Event() { // from class: cg.r0
            @Override // io.bidmachine.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onAudioSessionIdChanged(i10);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, auxEffectInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z10) {
        verifyApplicationThread();
        if (this.foregroundMode != z10) {
            this.foregroundMode = z10;
            if (!this.internalPlayer.setForegroundMode(z10)) {
                stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z10) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setImageOutput(@Nullable ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i10, long j10) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i10, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j10) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), 0, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, boolean z10) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, -9223372036854775807L, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z10) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z10) {
            return;
        }
        this.pauseAtEndOfMediaItems = z10;
        this.internalPlayer.setPauseAtEndOfWindow(z10);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setPlayWhenReady(boolean z10) {
        verifyApplicationThread();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(z10, getPlaybackState());
        updatePlayWhenReady(z10, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            return;
        }
        f2 f2VarCopyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        updatePlaybackInfo(f2VarCopyWithPlaybackParameters, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        Assertions.checkNotNull(mediaMetadata);
        if (mediaMetadata.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = mediaMetadata;
        this.listeners.sendEvent(15, new ListenerSet.Event() { // from class: cg.l0
            @Override // io.bidmachine.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.f5864a.lambda$setPlaylistMetadata$7((Player.Listener) obj);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @RequiresApi(23)
    public void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        verifyApplicationThread();
        if (this.preloadConfiguration.equals(preloadConfiguration)) {
            return;
        }
        this.preloadConfiguration = preloadConfiguration;
        this.internalPlayer.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPriority(int i10) {
        verifyApplicationThread();
        if (this.priority == i10) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            PriorityTaskManager priorityTaskManager = (PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager);
            priorityTaskManager.add(i10);
            priorityTaskManager.remove(this.priority);
        }
        this.priority = i10;
        sendRendererMessage(16, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        verifyApplicationThread();
        if (Util.areEqual(this.priorityTaskManager, priorityTaskManager)) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager)).remove(this.priority);
        }
        if (priorityTaskManager != null && isLoading()) {
            priorityTaskManager.add(this.priority);
            this.isPriorityTaskManagerRegistered = true;
        } else {
            this.isPriorityTaskManagerRegistered = false;
        }
        this.priorityTaskManager = priorityTaskManager;
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setRepeatMode(final int i10) {
        verifyApplicationThread();
        if (this.repeatMode != i10) {
            this.repeatMode = i10;
            this.internalPlayer.setRepeatMode(i10);
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: cg.j0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(i10);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (!this.seekParameters.equals(seekParameters)) {
            this.seekParameters = seekParameters;
            this.internalPlayer.setSeekParameters(seekParameters);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setShuffleModeEnabled(final boolean z10) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z10) {
            this.shuffleModeEnabled = z10;
            this.internalPlayer.setShuffleModeEnabled(z10);
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: cg.t0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(z10);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        boolean z10;
        verifyApplicationThread();
        if (shuffleOrder.getLength() == this.mediaSourceHolderSnapshots.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.shuffleOrder = shuffleOrder;
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        f2 f2VarMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(f2VarMaskTimelineAndPosition, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(final boolean z10) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z10) {
            return;
        }
        this.skipSilenceEnabled = z10;
        sendRendererMessage(1, 9, Boolean.valueOf(z10));
        this.listeners.sendEvent(23, new ListenerSet.Event() { // from class: cg.s0
            @Override // io.bidmachine.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(z10);
            }
        });
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (this.trackSelector.isSetParametersSupported() && !trackSelectionParameters.equals(this.trackSelector.getParameters())) {
            this.trackSelector.setParameters(trackSelectionParameters);
            this.listeners.sendEvent(19, new ListenerSet.Event() { // from class: cg.o0
                @Override // io.bidmachine.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(trackSelectionParameters);
                }
            });
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i10) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i10) {
            return;
        }
        this.videoChangeFrameRateStrategy = i10;
        sendRendererMessage(2, 5, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Effect> list) {
        verifyApplicationThread();
        try {
            Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class);
            sendRendererMessage(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", e10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer, io.bidmachine.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i10) {
        verifyApplicationThread();
        this.videoScalingMode = i10;
        sendRendererMessage(2, 4, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setVideoSurface(@Nullable Surface surface) {
        int i10;
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        maybeNotifySurfaceSizeChanged(i10, i10);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            setVideoOutputInternal(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        } else {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        SurfaceHolder holder;
        verifyApplicationThread();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof SphericalGLSurfaceView) {
                removeSurfaceCallbacks();
                this.sphericalGLSurfaceView = (SphericalGLSurfaceView) surfaceView;
                createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
                this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
                setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
                setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
                return;
            }
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            setVideoSurfaceHolder(holder);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        SurfaceTexture surfaceTexture;
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setVolume(float f10) {
        verifyApplicationThread();
        final float fConstrainValue = Util.constrainValue(f10, 0.0f, 1.0f);
        if (this.volume == fConstrainValue) {
            return;
        }
        this.volume = fConstrainValue;
        sendVolumeToRenderers();
        this.listeners.sendEvent(22, new ListenerSet.Event() { // from class: cg.k0
            @Override // io.bidmachine.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onVolumeChanged(fConstrainValue);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i10) {
        verifyApplicationThread();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.wakeLockManager.setEnabled(true);
                    this.wifiLockManager.setEnabled(true);
                    return;
                }
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
            return;
        }
        this.wakeLockManager.setEnabled(false);
        this.wifiLockManager.setEnabled(false);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        this.audioFocusManager.updateAudioFocus(getPlayWhenReady(), 1);
        stopInternal(null);
        this.currentCueGroup = new CueGroup(ImmutableList.of(), this.playbackInfo.positionUs);
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void decreaseDeviceVolume(int i10) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i10);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void increaseDeviceVolume(int i10) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i10);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setDeviceMuted(boolean z10, int i10) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z10, i10);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void setDeviceVolume(int i10, int i11) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i10, i11);
        }
    }

    @Override // io.bidmachine.media3.common.BasePlayer, io.bidmachine.media3.common.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, int i10, long j10) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i10, j10, false);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z10) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), z10);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z10, boolean z11) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z10);
        prepare();
    }
}
