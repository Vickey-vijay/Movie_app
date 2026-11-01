package io.bidmachine.media3.exoplayer.analytics;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.DeviceInfo;
import io.bidmachine.media3.common.FlagSet;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
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
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.DecoderCounters;
import io.bidmachine.media3.exoplayer.DecoderReuseEvaluation;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import m5.i;

/* JADX INFO: loaded from: classes6.dex */
public interface AnalyticsListener {

    @UnstableApi
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;

    @UnstableApi
    public static final int EVENT_AUDIO_CODEC_ERROR = 1029;

    @UnstableApi
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1008;

    @UnstableApi
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1012;

    @UnstableApi
    public static final int EVENT_AUDIO_DISABLED = 1013;

    @UnstableApi
    public static final int EVENT_AUDIO_ENABLED = 1007;

    @UnstableApi
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1009;

    @UnstableApi
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1010;

    @UnstableApi
    public static final int EVENT_AUDIO_SESSION_ID = 21;

    @UnstableApi
    public static final int EVENT_AUDIO_SINK_ERROR = 1014;

    @UnstableApi
    public static final int EVENT_AUDIO_TRACK_INITIALIZED = 1031;

    @UnstableApi
    public static final int EVENT_AUDIO_TRACK_RELEASED = 1032;

    @UnstableApi
    public static final int EVENT_AUDIO_UNDERRUN = 1011;

    @UnstableApi
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;

    @UnstableApi
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;

    @UnstableApi
    public static final int EVENT_CUES = 27;

    @UnstableApi
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;

    @UnstableApi
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;

    @UnstableApi
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;

    @UnstableApi
    public static final int EVENT_DRM_KEYS_LOADED = 1023;

    @UnstableApi
    public static final int EVENT_DRM_KEYS_REMOVED = 1026;

    @UnstableApi
    public static final int EVENT_DRM_KEYS_RESTORED = 1025;

    @UnstableApi
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1022;

    @UnstableApi
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1024;

    @UnstableApi
    public static final int EVENT_DRM_SESSION_RELEASED = 1027;

    @UnstableApi
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1018;

    @UnstableApi
    public static final int EVENT_IS_LOADING_CHANGED = 3;

    @UnstableApi
    public static final int EVENT_IS_PLAYING_CHANGED = 7;

    @UnstableApi
    public static final int EVENT_LOAD_CANCELED = 1002;

    @UnstableApi
    public static final int EVENT_LOAD_COMPLETED = 1001;

    @UnstableApi
    public static final int EVENT_LOAD_ERROR = 1003;

    @UnstableApi
    public static final int EVENT_LOAD_STARTED = 1000;

    @UnstableApi
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;

    @UnstableApi
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;

    @UnstableApi
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;

    @UnstableApi
    public static final int EVENT_METADATA = 28;

    @UnstableApi
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;

    @UnstableApi
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;

    @UnstableApi
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;

    @UnstableApi
    public static final int EVENT_PLAYER_ERROR = 10;

    @UnstableApi
    public static final int EVENT_PLAYER_RELEASED = 1028;

    @UnstableApi
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;

    @UnstableApi
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;

    @UnstableApi
    public static final int EVENT_POSITION_DISCONTINUITY = 11;

    @UnstableApi
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;

    @UnstableApi
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;

    @UnstableApi
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;

    @UnstableApi
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;

    @UnstableApi
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;

    @UnstableApi
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;

    @UnstableApi
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;

    @UnstableApi
    public static final int EVENT_TIMELINE_CHANGED = 0;

    @UnstableApi
    public static final int EVENT_TRACKS_CHANGED = 2;

    @UnstableApi
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;

    @UnstableApi
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;

    @UnstableApi
    public static final int EVENT_VIDEO_CODEC_ERROR = 1030;

    @UnstableApi
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1016;

    @UnstableApi
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1019;

    @UnstableApi
    public static final int EVENT_VIDEO_DISABLED = 1020;

    @UnstableApi
    public static final int EVENT_VIDEO_ENABLED = 1015;

    @UnstableApi
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1021;

    @UnstableApi
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1017;

    @UnstableApi
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;

    @UnstableApi
    public static final int EVENT_VOLUME_CHANGED = 22;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    @UnstableApi
    public static final class EventTime {

        @Nullable
        public final MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTime.class != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            return this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && i.a(this.timeline, eventTime.timeline) && i.a(this.mediaPeriodId, eventTime.mediaPeriodId) && i.a(this.currentTimeline, eventTime.currentTimeline) && i.a(this.currentMediaPeriodId, eventTime.currentMediaPeriodId);
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.realtimeMs), this.timeline, Integer.valueOf(this.windowIndex), this.mediaPeriodId, Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, Long.valueOf(this.currentPlaybackPositionMs), Long.valueOf(this.totalBufferedDurationMs));
        }

        public EventTime(long j10, Timeline timeline, int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j11, Timeline timeline2, int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId2, long j12, long j13) {
            this.realtimeMs = j10;
            this.timeline = timeline;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j11;
            this.currentTimeline = timeline2;
            this.currentWindowIndex = i11;
            this.currentMediaPeriodId = mediaPeriodId2;
            this.currentPlaybackPositionMs = j12;
            this.totalBufferedDurationMs = j13;
        }
    }

    @UnstableApi
    public static final class Events {
        private final SparseArray<EventTime> eventTimes;
        private final FlagSet flags;

        public boolean contains(int i10) {
            return this.flags.contains(i10);
        }

        public boolean containsAny(int... iArr) {
            return this.flags.containsAny(iArr);
        }

        public int get(int i10) {
            return this.flags.get(i10);
        }

        public EventTime getEventTime(int i10) {
            return (EventTime) Assertions.checkNotNull(this.eventTimes.get(i10));
        }

        public int size() {
            return this.flags.size();
        }

        public Events(FlagSet flagSet, SparseArray<EventTime> sparseArray) {
            this.flags = flagSet;
            SparseArray<EventTime> sparseArray2 = new SparseArray<>(flagSet.size());
            for (int i10 = 0; i10 < flagSet.size(); i10++) {
                int i11 = flagSet.get(i10);
                sparseArray2.append(i11, (EventTime) Assertions.checkNotNull(sparseArray.get(i11)));
            }
            this.eventTimes = sparseArray2;
        }
    }

    @UnstableApi
    default void onAudioAttributesChanged(EventTime eventTime, AudioAttributes audioAttributes) {
    }

    @UnstableApi
    default void onAudioCodecError(EventTime eventTime, Exception exc) {
    }

    @UnstableApi
    @Deprecated
    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j10) {
    }

    @UnstableApi
    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j10, long j11) {
    }

    @UnstableApi
    default void onAudioDecoderReleased(EventTime eventTime, String str) {
    }

    @UnstableApi
    default void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @UnstableApi
    default void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @UnstableApi
    default void onAudioInputFormatChanged(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @UnstableApi
    default void onAudioPositionAdvancing(EventTime eventTime, long j10) {
    }

    @UnstableApi
    default void onAudioSessionIdChanged(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onAudioSinkError(EventTime eventTime, Exception exc) {
    }

    @UnstableApi
    default void onAudioTrackInitialized(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @UnstableApi
    default void onAudioTrackReleased(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @UnstableApi
    default void onAudioUnderrun(EventTime eventTime, int i10, long j10, long j11) {
    }

    @UnstableApi
    default void onAvailableCommandsChanged(EventTime eventTime, Player.Commands commands) {
    }

    @UnstableApi
    default void onBandwidthEstimate(EventTime eventTime, int i10, long j10, long j11) {
    }

    @UnstableApi
    default void onCues(EventTime eventTime, CueGroup cueGroup) {
    }

    @UnstableApi
    @Deprecated
    default void onCues(EventTime eventTime, List<Cue> list) {
    }

    @UnstableApi
    default void onDeviceInfoChanged(EventTime eventTime, DeviceInfo deviceInfo) {
    }

    @UnstableApi
    default void onDeviceVolumeChanged(EventTime eventTime, int i10, boolean z10) {
    }

    @UnstableApi
    default void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @UnstableApi
    default void onDrmKeysLoaded(EventTime eventTime) {
    }

    @UnstableApi
    default void onDrmKeysRemoved(EventTime eventTime) {
    }

    @UnstableApi
    default void onDrmKeysRestored(EventTime eventTime) {
    }

    @UnstableApi
    @Deprecated
    default void onDrmSessionAcquired(EventTime eventTime) {
    }

    @UnstableApi
    default void onDrmSessionAcquired(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onDrmSessionManagerError(EventTime eventTime, Exception exc) {
    }

    @UnstableApi
    default void onDrmSessionReleased(EventTime eventTime) {
    }

    @UnstableApi
    default void onDroppedVideoFrames(EventTime eventTime, int i10, long j10) {
    }

    @UnstableApi
    default void onEvents(Player player, Events events) {
    }

    @UnstableApi
    default void onIsLoadingChanged(EventTime eventTime, boolean z10) {
    }

    @UnstableApi
    default void onIsPlayingChanged(EventTime eventTime, boolean z10) {
    }

    @UnstableApi
    default void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @UnstableApi
    default void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @UnstableApi
    default void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
    }

    @UnstableApi
    default void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @UnstableApi
    @Deprecated
    default void onLoadingChanged(EventTime eventTime, boolean z10) {
    }

    @UnstableApi
    default void onMaxSeekToPreviousPositionChanged(EventTime eventTime, long j10) {
    }

    @UnstableApi
    default void onMediaItemTransition(EventTime eventTime, @Nullable MediaItem mediaItem, int i10) {
    }

    @UnstableApi
    default void onMediaMetadataChanged(EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @UnstableApi
    default void onMetadata(EventTime eventTime, Metadata metadata) {
    }

    @UnstableApi
    default void onPlayWhenReadyChanged(EventTime eventTime, boolean z10, int i10) {
    }

    @UnstableApi
    default void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    @UnstableApi
    default void onPlaybackStateChanged(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onPlaybackSuppressionReasonChanged(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onPlayerError(EventTime eventTime, PlaybackException playbackException) {
    }

    @UnstableApi
    default void onPlayerErrorChanged(EventTime eventTime, @Nullable PlaybackException playbackException) {
    }

    @UnstableApi
    default void onPlayerReleased(EventTime eventTime) {
    }

    @UnstableApi
    @Deprecated
    default void onPlayerStateChanged(EventTime eventTime, boolean z10, int i10) {
    }

    @UnstableApi
    default void onPlaylistMetadataChanged(EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @UnstableApi
    @Deprecated
    default void onPositionDiscontinuity(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onPositionDiscontinuity(EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
    }

    @UnstableApi
    default void onRenderedFirstFrame(EventTime eventTime, Object obj, long j10) {
    }

    @UnstableApi
    default void onRepeatModeChanged(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onSeekBackIncrementChanged(EventTime eventTime, long j10) {
    }

    @UnstableApi
    default void onSeekForwardIncrementChanged(EventTime eventTime, long j10) {
    }

    @UnstableApi
    @Deprecated
    default void onSeekStarted(EventTime eventTime) {
    }

    @UnstableApi
    default void onShuffleModeChanged(EventTime eventTime, boolean z10) {
    }

    @UnstableApi
    default void onSkipSilenceEnabledChanged(EventTime eventTime, boolean z10) {
    }

    @UnstableApi
    default void onSurfaceSizeChanged(EventTime eventTime, int i10, int i11) {
    }

    @UnstableApi
    default void onTimelineChanged(EventTime eventTime, int i10) {
    }

    @UnstableApi
    default void onTrackSelectionParametersChanged(EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    @UnstableApi
    default void onTracksChanged(EventTime eventTime, Tracks tracks) {
    }

    @UnstableApi
    default void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @UnstableApi
    default void onVideoCodecError(EventTime eventTime, Exception exc) {
    }

    @UnstableApi
    @Deprecated
    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j10) {
    }

    @UnstableApi
    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j10, long j11) {
    }

    @UnstableApi
    default void onVideoDecoderReleased(EventTime eventTime, String str) {
    }

    @UnstableApi
    default void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @UnstableApi
    default void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @UnstableApi
    default void onVideoFrameProcessingOffset(EventTime eventTime, long j10, int i10) {
    }

    @UnstableApi
    default void onVideoInputFormatChanged(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @UnstableApi
    @Deprecated
    default void onVideoSizeChanged(EventTime eventTime, int i10, int i11, int i12, float f10) {
    }

    @UnstableApi
    default void onVideoSizeChanged(EventTime eventTime, VideoSize videoSize) {
    }

    @UnstableApi
    default void onVolumeChanged(EventTime eventTime, float f10) {
    }
}
