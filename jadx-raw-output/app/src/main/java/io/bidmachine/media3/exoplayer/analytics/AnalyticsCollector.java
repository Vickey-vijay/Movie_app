package io.bidmachine.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.DeviceInfo;
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
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.DecoderCounters;
import io.bidmachine.media3.exoplayer.DecoderReuseEvaluation;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public interface AnalyticsCollector extends Player.Listener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    void addListener(AnalyticsListener analyticsListener);

    void notifySeekStarted();

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        super.onAudioAttributesChanged(audioAttributes);
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j10);

    @Override // io.bidmachine.media3.common.Player.Listener
    @UnstableApi
    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i10, long j10, long j11);

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(Player.Commands commands) {
        super.onAvailableCommandsChanged(commands);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.BandwidthMeter.EventListener
    /* synthetic */ void onBandwidthSample(int i10, long j10, long j11);

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onCues(CueGroup cueGroup) {
        super.onCues(cueGroup);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    @UnstableApi
    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(List list) {
        super.onCues((List<Cue>) list);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        super.onDeviceInfoChanged(deviceInfo);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
    /* bridge */ /* synthetic */ default void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        super.onDownstreamFormatChanged(i10, mediaPeriodId, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    /* bridge */ /* synthetic */ default void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        super.onDrmKeysLoaded(i10, mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    /* bridge */ /* synthetic */ default void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        super.onDrmKeysRemoved(i10, mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    /* bridge */ /* synthetic */ default void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        super.onDrmKeysRestored(i10, mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    @Deprecated
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        super.onDrmSessionAcquired(i10, mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i11) {
        super.onDrmSessionAcquired(i10, mediaPeriodId, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    /* bridge */ /* synthetic */ default void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        super.onDrmSessionManagerError(i10, mediaPeriodId, exc);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener
    /* bridge */ /* synthetic */ default void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        super.onDrmSessionReleased(i10, mediaPeriodId);
    }

    void onDroppedFrames(int i10, long j10);

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onEvents(Player player, Player.Events events) {
        super.onEvents(player, events);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
    /* bridge */ /* synthetic */ default void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        super.onLoadCanceled(i10, mediaPeriodId, loadEventInfo, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
    /* bridge */ /* synthetic */ default void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        super.onLoadCompleted(i10, mediaPeriodId, loadEventInfo, mediaLoadData);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
    /* bridge */ /* synthetic */ default void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        super.onLoadError(i10, mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
    /* bridge */ /* synthetic */ default void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        super.onLoadStarted(i10, mediaPeriodId, loadEventInfo, mediaLoadData);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    @UnstableApi
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onMediaItemTransition(@Nullable MediaItem mediaItem, int i10) {
        super.onMediaItemTransition(mediaItem, i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        super.onMediaMetadataChanged(mediaMetadata);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    @UnstableApi
    /* bridge */ /* synthetic */ default void onMetadata(Metadata metadata) {
        super.onMetadata(metadata);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        super.onPlaybackParametersChanged(playbackParameters);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlayerError(PlaybackException playbackException) {
        super.onPlayerError(playbackException);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
        super.onPlayerErrorChanged(playbackException);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    @UnstableApi
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        super.onPlaylistMetadataChanged(mediaMetadata);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    @UnstableApi
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        super.onPositionDiscontinuity(positionInfo, positionInfo2, i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    void onRenderedFirstFrame(Object obj, long j10);

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onTimelineChanged(Timeline timeline, int i10) {
        super.onTimelineChanged(timeline, i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        super.onTrackSelectionParametersChanged(trackSelectionParameters);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onTracksChanged(Tracks tracks) {
        super.onTracksChanged(tracks);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSourceEventListener
    /* bridge */ /* synthetic */ default void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        super.onUpstreamDiscarded(i10, mediaPeriodId, mediaLoadData);
    }

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j10, int i10);

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(VideoSize videoSize) {
        super.onVideoSizeChanged(videoSize);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    /* bridge */ /* synthetic */ default void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    void release();

    void removeListener(AnalyticsListener analyticsListener);

    void setPlayer(Player player, Looper looper);

    void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId);
}
