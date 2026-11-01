package io.bidmachine.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Size;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class ForwardingPlayer implements Player {
    private final Player player;

    public static final class a implements Player.Listener {
        private final ForwardingPlayer forwardingPlayer;
        private final Player.Listener listener;

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onCues(List<Cue> list) {
            this.listener.onCues(list);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPositionDiscontinuity(int i10) {
            this.listener.onPositionDiscontinuity(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.forwardingPlayer.equals(aVar.forwardingPlayer)) {
                return this.listener.equals(aVar.listener);
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardingPlayer.hashCode() * 31) + this.listener.hashCode();
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            this.listener.onAudioAttributesChanged(audioAttributes);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onAudioSessionIdChanged(int i10) {
            this.listener.onAudioSessionIdChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands commands) {
            this.listener.onAvailableCommandsChanged(commands);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onCues(CueGroup cueGroup) {
            this.listener.onCues(cueGroup);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            this.listener.onDeviceInfoChanged(deviceInfo);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onDeviceVolumeChanged(int i10, boolean z10) {
            this.listener.onDeviceVolumeChanged(i10, z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            this.listener.onEvents(this.forwardingPlayer, events);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onIsLoadingChanged(boolean z10) {
            this.listener.onIsLoadingChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z10) {
            this.listener.onIsPlayingChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onLoadingChanged(boolean z10) {
            this.listener.onIsLoadingChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j10) {
            this.listener.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onMediaItemTransition(@Nullable MediaItem mediaItem, int i10) {
            this.listener.onMediaItemTransition(mediaItem, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            this.listener.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onMetadata(Metadata metadata) {
            this.listener.onMetadata(metadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            this.listener.onPlayWhenReadyChanged(z10, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            this.listener.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            this.listener.onPlaybackStateChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int i10) {
            this.listener.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            this.listener.onPlayerError(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            this.listener.onPlayerErrorChanged(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayerStateChanged(boolean z10, int i10) {
            this.listener.onPlayerStateChanged(z10, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            this.listener.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            this.listener.onPositionDiscontinuity(positionInfo, positionInfo2, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            this.listener.onRenderedFirstFrame();
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onRepeatModeChanged(int i10) {
            this.listener.onRepeatModeChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onSeekBackIncrementChanged(long j10) {
            this.listener.onSeekBackIncrementChanged(j10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onSeekForwardIncrementChanged(long j10) {
            this.listener.onSeekForwardIncrementChanged(j10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onShuffleModeEnabledChanged(boolean z10) {
            this.listener.onShuffleModeEnabledChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean z10) {
            this.listener.onSkipSilenceEnabledChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onSurfaceSizeChanged(int i10, int i11) {
            this.listener.onSurfaceSizeChanged(i10, i11);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onTimelineChanged(Timeline timeline, int i10) {
            this.listener.onTimelineChanged(timeline, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            this.listener.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            this.listener.onTracksChanged(tracks);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.listener.onVideoSizeChanged(videoSize);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onVolumeChanged(float f10) {
            this.listener.onVolumeChanged(f10);
        }

        public a(ForwardingPlayer forwardingPlayer, Player.Listener listener) {
            this.forwardingPlayer = forwardingPlayer;
            this.listener = listener;
        }
    }

    @Override // io.bidmachine.media3.common.Player
    public void addMediaItem(MediaItem mediaItem) {
        this.player.addMediaItem(mediaItem);
    }

    @Override // io.bidmachine.media3.common.Player
    public void addMediaItems(List<MediaItem> list) {
        this.player.addMediaItems(list);
    }

    @Override // io.bidmachine.media3.common.Player
    public void clearVideoSurface() {
        this.player.clearVideoSurface();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        this.player.decreaseDeviceVolume();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        this.player.increaseDeviceVolume();
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekTo(long j10) {
        this.player.seekTo(j10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekToDefaultPosition() {
        this.player.seekToDefaultPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z10) {
        this.player.setDeviceMuted(z10);
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i10) {
        this.player.setDeviceVolume(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setMediaItem(MediaItem mediaItem) {
        this.player.setMediaItem(mediaItem);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setMediaItems(List<MediaItem> list) {
        this.player.setMediaItems(list);
    }

    @Override // io.bidmachine.media3.common.Player
    public void addListener(Player.Listener listener) {
        this.player.addListener(new a(this, listener));
    }

    @Override // io.bidmachine.media3.common.Player
    public void addMediaItem(int i10, MediaItem mediaItem) {
        this.player.addMediaItem(i10, mediaItem);
    }

    @Override // io.bidmachine.media3.common.Player
    public void addMediaItems(int i10, List<MediaItem> list) {
        this.player.addMediaItems(i10, list);
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean canAdvertiseSession() {
        return this.player.canAdvertiseSession();
    }

    @Override // io.bidmachine.media3.common.Player
    public void clearMediaItems() {
        this.player.clearMediaItems();
    }

    @Override // io.bidmachine.media3.common.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        this.player.clearVideoSurface(surface);
    }

    @Override // io.bidmachine.media3.common.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // io.bidmachine.media3.common.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override // io.bidmachine.media3.common.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        this.player.clearVideoTextureView(textureView);
    }

    @Override // io.bidmachine.media3.common.Player
    public void decreaseDeviceVolume(int i10) {
        this.player.decreaseDeviceVolume(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    @Override // io.bidmachine.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        return this.player.getAudioAttributes();
    }

    @Override // io.bidmachine.media3.common.Player
    public Player.Commands getAvailableCommands() {
        return this.player.getAvailableCommands();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getContentBufferedPosition() {
        return this.player.getContentBufferedPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getContentDuration() {
        return this.player.getContentDuration();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // io.bidmachine.media3.common.Player
    public CueGroup getCurrentCues() {
        return this.player.getCurrentCues();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getCurrentLiveOffset() {
        return this.player.getCurrentLiveOffset();
    }

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    public Object getCurrentManifest() {
        return this.player.getCurrentManifest();
    }

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    public MediaItem getCurrentMediaItem() {
        return this.player.getCurrentMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getCurrentMediaItemIndex() {
        return this.player.getCurrentMediaItemIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getCurrentPeriodIndex() {
        return this.player.getCurrentPeriodIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    public Timeline getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    @Override // io.bidmachine.media3.common.Player
    public Tracks getCurrentTracks() {
        return this.player.getCurrentTracks();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        return this.player.getDeviceInfo();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getDeviceVolume() {
        return this.player.getDeviceVolume();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getDuration() {
        return this.player.getDuration();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    public MediaItem getMediaItemAt(int i10) {
        return this.player.getMediaItemAt(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public int getMediaItemCount() {
        return this.player.getMediaItemCount();
    }

    @Override // io.bidmachine.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        return this.player.getMediaMetadata();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getNextMediaItemIndex() {
        return this.player.getNextMediaItemIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    @Override // io.bidmachine.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getPlaybackSuppressionReason() {
        return this.player.getPlaybackSuppressionReason();
    }

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    public PlaybackException getPlayerError() {
        return this.player.getPlayerError();
    }

    @Override // io.bidmachine.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        return this.player.getPlaylistMetadata();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getPreviousMediaItemIndex() {
        return this.player.getPreviousMediaItemIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getSeekBackIncrement() {
        return this.player.getSeekBackIncrement();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getSeekForwardIncrement() {
        return this.player.getSeekForwardIncrement();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    @Override // io.bidmachine.media3.common.Player
    public Size getSurfaceSize() {
        return this.player.getSurfaceSize();
    }

    @Override // io.bidmachine.media3.common.Player
    public long getTotalBufferedDuration() {
        return this.player.getTotalBufferedDuration();
    }

    @Override // io.bidmachine.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        return this.player.getTrackSelectionParameters();
    }

    @Override // io.bidmachine.media3.common.Player
    public VideoSize getVideoSize() {
        return this.player.getVideoSize();
    }

    @Override // io.bidmachine.media3.common.Player
    public float getVolume() {
        return this.player.getVolume();
    }

    public Player getWrappedPlayer() {
        return this.player;
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean hasNext() {
        return this.player.hasNext();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean hasNextMediaItem() {
        return this.player.hasNextMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean hasNextWindow() {
        return this.player.hasNextWindow();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean hasPrevious() {
        return this.player.hasPrevious();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean hasPreviousMediaItem() {
        return this.player.hasPreviousMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean hasPreviousWindow() {
        return this.player.hasPreviousWindow();
    }

    @Override // io.bidmachine.media3.common.Player
    public void increaseDeviceVolume(int i10) {
        this.player.increaseDeviceVolume(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isCommandAvailable(int i10) {
        return this.player.isCommandAvailable(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        return this.player.isCurrentMediaItemDynamic();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        return this.player.isCurrentMediaItemLive();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        return this.player.isCurrentMediaItemSeekable();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean isCurrentWindowLive() {
        return this.player.isCurrentWindowLive();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isDeviceMuted() {
        return this.player.isDeviceMuted();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isLoading() {
        return this.player.isLoading();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // io.bidmachine.media3.common.Player
    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    @Override // io.bidmachine.media3.common.Player
    public void moveMediaItem(int i10, int i11) {
        this.player.moveMediaItem(i10, i11);
    }

    @Override // io.bidmachine.media3.common.Player
    public void moveMediaItems(int i10, int i11, int i12) {
        this.player.moveMediaItems(i10, i11, i12);
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void next() {
        this.player.next();
    }

    @Override // io.bidmachine.media3.common.Player
    public void pause() {
        this.player.pause();
    }

    @Override // io.bidmachine.media3.common.Player
    public void play() {
        this.player.play();
    }

    @Override // io.bidmachine.media3.common.Player
    public void prepare() {
        this.player.prepare();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void previous() {
        this.player.previous();
    }

    @Override // io.bidmachine.media3.common.Player
    public void release() {
        this.player.release();
    }

    @Override // io.bidmachine.media3.common.Player
    public void removeListener(Player.Listener listener) {
        this.player.removeListener(new a(this, listener));
    }

    @Override // io.bidmachine.media3.common.Player
    public void removeMediaItem(int i10) {
        this.player.removeMediaItem(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void removeMediaItems(int i10, int i11) {
        this.player.removeMediaItems(i10, i11);
    }

    @Override // io.bidmachine.media3.common.Player
    public void replaceMediaItem(int i10, MediaItem mediaItem) {
        this.player.replaceMediaItem(i10, mediaItem);
    }

    @Override // io.bidmachine.media3.common.Player
    public void replaceMediaItems(int i10, int i11, List<MediaItem> list) {
        this.player.replaceMediaItems(i10, i11, list);
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekBack() {
        this.player.seekBack();
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekForward() {
        this.player.seekForward();
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekTo(int i10, long j10) {
        this.player.seekTo(i10, j10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekToDefaultPosition(int i10) {
        this.player.seekToDefaultPosition(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekToNext() {
        this.player.seekToNext();
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekToNextMediaItem() {
        this.player.seekToNextMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void seekToNextWindow() {
        this.player.seekToNextWindow();
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekToPrevious() {
        this.player.seekToPrevious();
    }

    @Override // io.bidmachine.media3.common.Player
    public void seekToPreviousMediaItem() {
        this.player.seekToPreviousMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public void seekToPreviousWindow() {
        this.player.seekToPreviousWindow();
    }

    @Override // io.bidmachine.media3.common.Player
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z10) {
        this.player.setAudioAttributes(audioAttributes, z10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setDeviceMuted(boolean z10, int i10) {
        this.player.setDeviceMuted(z10, i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setDeviceVolume(int i10, int i11) {
        this.player.setDeviceVolume(i10, i11);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setMediaItem(MediaItem mediaItem, long j10) {
        this.player.setMediaItem(mediaItem, j10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z10) {
        this.player.setMediaItems(list, z10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setPlayWhenReady(boolean z10) {
        this.player.setPlayWhenReady(z10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setPlaybackSpeed(float f10) {
        this.player.setPlaybackSpeed(f10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setRepeatMode(int i10) {
        this.player.setRepeatMode(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setShuffleModeEnabled(boolean z10) {
        this.player.setShuffleModeEnabled(z10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setVideoSurface(@Nullable Surface surface) {
        this.player.setVideoSurface(surface);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        this.player.setVideoTextureView(textureView);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setVolume(float f10) {
        this.player.setVolume(f10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void stop() {
        this.player.stop();
    }

    public ForwardingPlayer(Player player) {
        this.player = player;
    }

    @Override // io.bidmachine.media3.common.Player
    public void setMediaItem(MediaItem mediaItem, boolean z10) {
        this.player.setMediaItem(mediaItem, z10);
    }

    @Override // io.bidmachine.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i10, long j10) {
        this.player.setMediaItems(list, i10, j10);
    }
}
