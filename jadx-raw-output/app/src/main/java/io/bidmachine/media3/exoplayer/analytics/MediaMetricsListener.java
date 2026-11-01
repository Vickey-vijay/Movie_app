package io.bidmachine.media3.exoplayer.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.r2;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.common.DeviceInfo;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaLibraryInfo;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackSelectionParameters;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.NetworkTypeObserver;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.FileDataSource;
import io.bidmachine.media3.datasource.HttpDataSource;
import io.bidmachine.media3.datasource.UdpDataSource;
import io.bidmachine.media3.exoplayer.DecoderCounters;
import io.bidmachine.media3.exoplayer.DecoderReuseEvaluation;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.drm.DefaultDrmSessionManager;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.drm.UnsupportedDrmException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(31)
@UnstableApi
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    @Nullable
    private String activeSessionId;
    private int audioUnderruns;
    private final Context context;

    @Nullable
    private Format currentAudioFormat;

    @Nullable
    private Format currentTextFormat;

    @Nullable
    private Format currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;

    @Nullable
    private PlaybackMetrics.Builder metricsBuilder;

    @Nullable
    private b pendingAudioFormat;

    @Nullable
    private PlaybackException pendingPlayerError;

    @Nullable
    private b pendingTextFormat;

    @Nullable
    private b pendingVideoFormat;
    private final PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final PlaybackSessionManager sessionManager;
    private final Timeline.Window window = new Timeline.Window();
    private final Timeline.Period period = new Timeline.Period();
    private final HashMap<String, Long> bandwidthBytes = new HashMap<>();
    private final HashMap<String, Long> bandwidthTimeMs = new HashMap<>();
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    private static int getDrmType(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.schemeDataCount; i10++) {
            UUID uuid = drmInitData.get(i10).uuid;
            if (uuid.equals(C.WIDEVINE_UUID)) {
                return 3;
            }
            if (uuid.equals(C.PLAYREADY_UUID)) {
                return 2;
            }
            if (uuid.equals(C.CLEARKEY_UUID)) {
                return 6;
            }
        }
        return 1;
    }

    private static int getTrackChangeReason(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i10 = 0; i10 < events.size(); i10++) {
            int i11 = events.get(i10);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i11);
            if (i11 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i11 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    private void maybeReportTrackChanges(Player player, AnalyticsListener.Events events, long j10) {
        if (events.contains(2)) {
            Tracks currentTracks = player.getCurrentTracks();
            boolean zIsTypeSelected = currentTracks.isTypeSelected(2);
            boolean zIsTypeSelected2 = currentTracks.isTypeSelected(1);
            boolean zIsTypeSelected3 = currentTracks.isTypeSelected(3);
            if (zIsTypeSelected || zIsTypeSelected2 || zIsTypeSelected3) {
                if (!zIsTypeSelected) {
                    maybeUpdateVideoFormat(j10, null, 0);
                }
                if (!zIsTypeSelected2) {
                    maybeUpdateAudioFormat(j10, null, 0);
                }
                if (!zIsTypeSelected3) {
                    maybeUpdateTextFormat(j10, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat)) {
            b bVar = this.pendingVideoFormat;
            Format format = bVar.format;
            if (format.height != -1) {
                maybeUpdateVideoFormat(j10, format, bVar.selectionReason);
                this.pendingVideoFormat = null;
            }
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            b bVar2 = this.pendingAudioFormat;
            maybeUpdateAudioFormat(j10, bVar2.format, bVar2.selectionReason);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            b bVar3 = this.pendingTextFormat;
            maybeUpdateTextFormat(j10, bVar3.format, bVar3.selectionReason);
            this.pendingTextFormat = null;
        }
    }

    private void maybeUpdateMetricsBuilderValues(Player player, AnalyticsListener.Events events) {
        DrmInitData drmInitData;
        if (events.contains(0)) {
            AnalyticsListener.EventTime eventTime = events.getEventTime(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
            }
        }
        if (events.contains(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(player.getCurrentTracks().getGroups())) != null) {
            ((PlaybackMetrics.Builder) Util.castNonNull(this.metricsBuilder)).setDrmType(getDrmType(drmInitData));
        }
        if (events.contains(1011)) {
            this.audioUnderruns++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        super.onAudioAttributesChanged(eventTime, audioAttributes);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        super.onAudioCodecError(eventTime, exc);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j10) {
        super.onAudioDecoderInitialized(eventTime, str, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j10, long j11) {
        super.onAudioDecoderInitialized(eventTime, str, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        super.onAudioDecoderReleased(eventTime, str);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        super.onAudioDisabled(eventTime, decoderCounters);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        super.onAudioEnabled(eventTime, decoderCounters);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        super.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j10) {
        super.onAudioPositionAdvancing(eventTime, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i10) {
        super.onAudioSessionIdChanged(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        super.onAudioSinkError(eventTime, exc);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        super.onAudioTrackInitialized(eventTime, audioTrackConfig);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        super.onAudioTrackReleased(eventTime, audioTrackConfig);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
        super.onAudioUnderrun(eventTime, i10, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        super.onAvailableCommandsChanged(eventTime, commands);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
        super.onCues(eventTime, cueGroup);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, List list) {
        super.onCues(eventTime, (List<Cue>) list);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
        super.onDeviceInfoChanged(eventTime, deviceInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i10, boolean z10) {
        super.onDeviceVolumeChanged(eventTime, i10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        super.onDrmKeysLoaded(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        super.onDrmKeysRemoved(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        super.onDrmKeysRestored(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        super.onDrmSessionAcquired(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i10) {
        super.onDrmSessionAcquired(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        super.onDrmSessionManagerError(eventTime, exc);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        super.onDrmSessionReleased(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i10, long j10) {
        super.onDroppedVideoFrames(eventTime, i10, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        super.onIsLoadingChanged(eventTime, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        super.onIsPlayingChanged(eventTime, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        super.onLoadCanceled(eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        super.onLoadCompleted(eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        super.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        super.onLoadingChanged(eventTime, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j10) {
        super.onMaxSeekToPreviousPositionChanged(eventTime, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, @Nullable MediaItem mediaItem, int i10) {
        super.onMediaItemTransition(eventTime, mediaItem, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        super.onMediaMetadataChanged(eventTime, mediaMetadata);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        super.onMetadata(eventTime, metadata);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
        super.onPlayWhenReadyChanged(eventTime, z10, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        super.onPlaybackParametersChanged(eventTime, playbackParameters);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i10) {
        super.onPlaybackStateChanged(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i10) {
        super.onPlaybackSuppressionReasonChanged(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, @Nullable PlaybackException playbackException) {
        super.onPlayerErrorChanged(eventTime, playbackException);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        super.onPlayerReleased(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
        super.onPlayerStateChanged(eventTime, z10, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        super.onPlaylistMetadataChanged(eventTime, mediaMetadata);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i10) {
        super.onPositionDiscontinuity(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        if (i10 == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i10;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j10) {
        super.onRenderedFirstFrame(eventTime, obj, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i10) {
        super.onRepeatModeChanged(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j10) {
        super.onSeekBackIncrementChanged(eventTime, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j10) {
        super.onSeekForwardIncrementChanged(eventTime, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        super.onSeekStarted(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        super.onShuffleModeChanged(eventTime, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z10) {
        super.onSkipSilenceEnabledChanged(eventTime, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i10, int i11) {
        super.onSurfaceSizeChanged(eventTime, i10, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i10) {
        super.onTimelineChanged(eventTime, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
        super.onTrackSelectionParametersChanged(eventTime, trackSelectionParameters);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        super.onTracksChanged(eventTime, tracks);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        super.onUpstreamDiscarded(eventTime, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        super.onVideoCodecError(eventTime, exc);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j10) {
        super.onVideoDecoderInitialized(eventTime, str, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j10, long j11) {
        super.onVideoDecoderInitialized(eventTime, str, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        super.onVideoDecoderReleased(eventTime, str);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        super.onVideoEnabled(eventTime, decoderCounters);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j10, int i10) {
        super.onVideoFrameProcessingOffset(eventTime, j10, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        super.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i10, int i11, int i12, float f10) {
        super.onVideoSizeChanged(eventTime, i10, i11, i12, f10);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        b bVar = this.pendingVideoFormat;
        if (bVar != null) {
            Format format = bVar.format;
            if (format.height == -1) {
                this.pendingVideoFormat = new b(format.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build(), bVar.selectionReason, bVar.sessionId);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f10) {
        super.onVolumeChanged(eventTime, f10);
    }

    public static final class a {
        public final int errorCode;
        public final int subErrorCode;

        public a(int i10, int i11) {
            this.errorCode = i10;
            this.subErrorCode = i11;
        }
    }

    public static final class b {
        public final Format format;
        public final int selectionReason;
        public final String sessionId;

        public b(Format format, int i10, String str) {
            this.format = format;
            this.selectionReason = i10;
            this.sessionId = str;
        }
    }

    private boolean canReportPendingFormatUpdate(@Nullable b bVar) {
        return bVar != null && bVar.sessionId.equals(this.sessionManager.getActiveSessionId());
    }

    @Nullable
    public static MediaMetricsListener create(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new MediaMetricsListener(context, mediaMetricsManager.createPlaybackSession());
    }

    private void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            Long l10 = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.metricsBuilder.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.playbackSession.reportPlaybackMetrics(this.metricsBuilder.build());
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    private static a getErrorInfo(PlaybackException playbackException, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (playbackException.errorCode == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.type == 1;
            i10 = exoPlaybackException.rendererFormatSupport;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) Assertions.checkNotNull(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaCodecRenderer.DecoderInitializationException) th2).diagnosticInfo));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, ((MediaCodecDecoderException) th2).errorCode);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).audioTrackState);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).errorCode);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(getDrmErrorCode(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource.InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource.InvalidResponseCodeException) th2).responseCode);
        }
        if ((th2 instanceof HttpDataSource.InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        if ((th2 instanceof HttpDataSource.HttpDataSourceException) || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (NetworkTypeObserver.getInstance(context).getNetworkType() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return ((th2 instanceof HttpDataSource.HttpDataSourceException) && ((HttpDataSource.HttpDataSourceException) th2).type == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) Assertions.checkNotNull(th2.getCause())).getCause();
            return (Util.SDK_INT >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) Assertions.checkNotNull(th2.getCause());
        int i11 = Util.SDK_INT;
        if (i11 >= 21 && (th3 instanceof MediaDrm.MediaDrmStateException)) {
            int errorCodeFromPlatformDiagnosticsInfo = Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
        }
        if (i11 >= 23 && (th3 instanceof MediaDrmResetException)) {
            return new a(27, 0);
        }
        if (th3 instanceof NotProvisionedException) {
            return new a(24, 0);
        }
        if (th3 instanceof DeniedByServerException) {
            return new a(29, 0);
        }
        if (th3 instanceof UnsupportedDrmException) {
            return new a(23, 0);
        }
        return th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        String[] strArrSplit = Util.split(str, "-");
        return Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
    }

    private static int getStreamType(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return 0;
        }
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (iInferContentTypeForUriAndMimeType == 0) {
            return 3;
        }
        if (iInferContentTypeForUriAndMimeType != 1) {
            return iInferContentTypeForUriAndMimeType != 2 ? 1 : 4;
        }
        return 5;
    }

    private void maybeReportNetworkChange(long j10) {
        int networkType = getNetworkType(this.context);
        if (networkType != this.currentNetworkType) {
            this.currentNetworkType = networkType;
            this.playbackSession.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(networkType).setTimeSinceCreatedMillis(j10 - this.startTimeMs).build());
        }
    }

    private void maybeReportPlaybackError(long j10) {
        PlaybackException playbackException = this.pendingPlayerError;
        if (playbackException == null) {
            return;
        }
        a errorInfo = getErrorInfo(playbackException, this.context, this.ioErrorType == 4);
        this.playbackSession.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.startTimeMs).setErrorCode(errorInfo.errorCode).setSubErrorCode(errorInfo.subErrorCode).setException(playbackException).build());
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeUpdateAudioFormat(long j10, @Nullable Format format, int i10) {
        if (Util.areEqual(this.currentAudioFormat, format)) {
            return;
        }
        if (this.currentAudioFormat == null && i10 == 0) {
            i10 = 1;
        }
        this.currentAudioFormat = format;
        reportTrackChangeEvent(0, j10, format, i10);
    }

    private void maybeUpdateTextFormat(long j10, @Nullable Format format, int i10) {
        if (Util.areEqual(this.currentTextFormat, format)) {
            return;
        }
        if (this.currentTextFormat == null && i10 == 0) {
            i10 = 1;
        }
        this.currentTextFormat = format;
        reportTrackChangeEvent(2, j10, format, i10);
    }

    private void maybeUpdateTimelineMetadata(Timeline timeline, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaPeriodId == null || (indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            return;
        }
        timeline.getPeriod(indexOfPeriod, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        builder.setStreamType(getStreamType(this.window.mediaItem));
        Timeline.Window window = this.window;
        if (window.durationUs != -9223372036854775807L && !window.isPlaceholder && !window.isDynamic && !window.isLive()) {
            builder.setMediaDurationMillis(this.window.getDurationMs());
        }
        builder.setPlaybackType(this.window.isLive() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void maybeUpdateVideoFormat(long j10, @Nullable Format format, int i10) {
        if (Util.areEqual(this.currentVideoFormat, format)) {
            return;
        }
        if (this.currentVideoFormat == null && i10 == 0) {
            i10 = 1;
        }
        this.currentVideoFormat = format;
        reportTrackChangeEvent(1, j10, format, i10);
    }

    private void reportTrackChangeEvent(int i10, long j10, @Nullable Format format, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.startTimeMs);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i11));
            String str = format.containerMimeType;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.sampleMimeType;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.codecs;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = format.bitrate;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = format.width;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = format.height;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = format.channelCount;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = format.sampleRate;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = format.language;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = format.frameRate;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.playbackSession.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            String sessionForMediaPeriodId = this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId));
            Long l10 = this.bandwidthBytes.get(sessionForMediaPeriodId);
            Long l11 = this.bandwidthTimeMs.get(sessionForMediaPeriodId);
            this.bandwidthBytes.put(sessionForMediaPeriodId, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.bandwidthTimeMs.put(sessionForMediaPeriodId, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        if (eventTime.mediaPeriodId == null) {
            return;
        }
        b bVar = new b((Format) Assertions.checkNotNull(mediaLoadData.trackFormat), mediaLoadData.trackSelectionReason, this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (MediaSource.MediaPeriodId) Assertions.checkNotNull(eventTime.mediaPeriodId)));
        int i10 = mediaLoadData.trackType;
        if (i10 != 0) {
            if (i10 == 1) {
                this.pendingAudioFormat = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.pendingTextFormat = bVar;
                return;
            }
        }
        this.pendingVideoFormat = bVar;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        this.ioErrorType = mediaLoadData.dataType;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.pendingPlayerError = playbackException;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = new PlaybackMetrics.Builder().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion("1.4.1");
            maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z10) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if ((mediaPeriodId == null || !mediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    private MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.setListener(this);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int getDrmErrorCode(int i10) {
        switch (Util.getErrorCodeForMediaDrmErrorCode(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    private static DrmInitData getDrmInitData(ImmutableList<Tracks.Group> immutableList) {
        DrmInitData drmInitData;
        r2<Tracks.Group> it = immutableList.iterator();
        while (it.hasNext()) {
            Tracks.Group next = it.next();
            for (int i10 = 0; i10 < next.length; i10++) {
                if (next.isTrackSelected(i10) && (drmInitData = next.getTrackFormat(i10).drmInitData) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getNetworkType(Context context) {
        switch (NetworkTypeObserver.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private void maybeReportPlaybackStateChange(Player player, AnalyticsListener.Events events, long j10) {
        if (player.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (player.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (events.contains(10)) {
            this.hasFatalError = true;
        }
        int iResolveNewPlaybackState = resolveNewPlaybackState(player);
        if (this.currentPlaybackState != iResolveNewPlaybackState) {
            this.currentPlaybackState = iResolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            this.playbackSession.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(j10 - this.startTimeMs).build());
        }
    }

    private int resolveNewPlaybackState(Player player) {
        int playbackState = player.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i10 = this.currentPlaybackState;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (!player.getPlayWhenReady()) {
                return 7;
            }
            if (player.getPlaybackSuppressionReason() != 0) {
                return 10;
            }
            return 6;
        }
        if (playbackState == 3) {
            if (!player.getPlayWhenReady()) {
                return 4;
            }
            if (player.getPlaybackSuppressionReason() == 0) {
                return 3;
            }
            return 9;
        }
        if (playbackState == 1 && this.currentPlaybackState != 0) {
            return 12;
        }
        return this.currentPlaybackState;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(player, events);
        maybeReportPlaybackError(jElapsedRealtime);
        maybeReportTrackChanges(player, events, jElapsedRealtime);
        maybeReportNetworkChange(jElapsedRealtime);
        maybeReportPlaybackStateChange(player, events, jElapsedRealtime);
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }
}
