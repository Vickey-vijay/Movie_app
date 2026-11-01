package io.bidmachine.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Size;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class BasePlayer implements Player {
    public final Timeline.Window window = new Timeline.Window();

    private void ignoreSeek(int i10) {
        seekTo(-1, -9223372036854775807L, i10, false);
    }

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void addListener(Player.Listener listener);

    @Override // io.bidmachine.media3.common.Player
    public final void addMediaItem(int i10, MediaItem mediaItem) {
        addMediaItems(i10, ImmutableList.of(mediaItem));
    }

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void addMediaItems(int i10, List<MediaItem> list);

    @Override // io.bidmachine.media3.common.Player
    public final void addMediaItems(List<MediaItem> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // io.bidmachine.media3.common.Player
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void clearVideoSurface();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void clearVideoSurface(@Nullable Surface surface);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void clearVideoTextureView(@Nullable TextureView textureView);

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public abstract /* synthetic */ void decreaseDeviceVolume();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void decreaseDeviceVolume(int i10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ Looper getApplicationLooper();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ AudioAttributes getAudioAttributes();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ Player.Commands getAvailableCommands();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getBufferedPosition();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getContentBufferedPosition();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getContentPosition();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getCurrentAdGroupIndex();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ CueGroup getCurrentCues();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getCurrentMediaItemIndex();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getCurrentPeriodIndex();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getCurrentPosition();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ Timeline getCurrentTimeline();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ Tracks getCurrentTracks();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ DeviceInfo getDeviceInfo();

    @Override // io.bidmachine.media3.common.Player
    @IntRange(from = 0)
    public abstract /* synthetic */ int getDeviceVolume();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getDuration();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ MediaMetadata getMediaMetadata();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ boolean getPlayWhenReady();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ PlaybackParameters getPlaybackParameters();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getPlaybackState();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getPlaybackSuppressionReason();

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    public abstract /* synthetic */ PlaybackException getPlayerError();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ MediaMetadata getPlaylistMetadata();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ int getRepeatMode();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getSeekBackIncrement();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getSeekForwardIncrement();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ boolean getShuffleModeEnabled();

    @Override // io.bidmachine.media3.common.Player
    @UnstableApi
    public abstract /* synthetic */ Size getSurfaceSize();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ long getTotalBufferedDuration();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ TrackSelectionParameters getTrackSelectionParameters();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ VideoSize getVideoSize();

    @Override // io.bidmachine.media3.common.Player
    @FloatRange(from = 0.0d, to = 1.0d)
    public abstract /* synthetic */ float getVolume();

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public abstract /* synthetic */ void increaseDeviceVolume();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void increaseDeviceVolume(int i10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ boolean isDeviceMuted();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ boolean isLoading();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ boolean isPlayingAd();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // io.bidmachine.media3.common.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void prepare();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void release();

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void removeListener(Player.Listener listener);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void replaceMediaItems(int i10, int i11, List<MediaItem> list);

    @VisibleForTesting(otherwise = 4)
    public abstract void seekTo(int i10, long j10, int i11, boolean z10);

    @Override // io.bidmachine.media3.common.Player
    public final void seekTo(long j10) {
        seekToCurrentItem(j10, 5);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekToDefaultPosition() {
        seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 4);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekToPreviousMediaItem() {
        seekToPreviousMediaItemInternal(6);
    }

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setAudioAttributes(AudioAttributes audioAttributes, boolean z10);

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public abstract /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setDeviceMuted(boolean z10, int i10);

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public abstract /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i10, int i11);

    @Override // io.bidmachine.media3.common.Player
    public final void setMediaItem(MediaItem mediaItem) {
        setMediaItems(ImmutableList.of(mediaItem));
    }

    @Override // io.bidmachine.media3.common.Player
    public final void setMediaItems(List<MediaItem> list) {
        setMediaItems(list, true);
    }

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setMediaItems(List<MediaItem> list, int i10, long j10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setMediaItems(List<MediaItem> list, boolean z10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setPlaybackParameters(PlaybackParameters playbackParameters);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setPlaylistMetadata(MediaMetadata mediaMetadata);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setRepeatMode(int i10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setShuffleModeEnabled(boolean z10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setVideoSurface(@Nullable Surface surface);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setVideoTextureView(@Nullable TextureView textureView);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f10);

    @Override // io.bidmachine.media3.common.Player
    public abstract /* synthetic */ void stop();

    @Override // io.bidmachine.media3.common.Player
    public final void addMediaItem(MediaItem mediaItem) {
        addMediaItems(ImmutableList.of(mediaItem));
    }

    @Override // io.bidmachine.media3.common.Player
    public final void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            moveMediaItems(i10, i10 + 1, i11);
        }
    }

    @Override // io.bidmachine.media3.common.Player
    public final void removeMediaItem(int i10) {
        removeMediaItems(i10, i10 + 1);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void replaceMediaItem(int i10, MediaItem mediaItem) {
        replaceMediaItems(i10, i10 + 1, ImmutableList.of(mediaItem));
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekTo(int i10, long j10) {
        seekTo(i10, j10, 10, false);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekToNextMediaItem() {
        seekToNextMediaItemInternal(8);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void setMediaItem(MediaItem mediaItem, long j10) {
        setMediaItems(ImmutableList.of(mediaItem), 0, j10);
    }

    private int getRepeatModeForNavigation() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void repeatCurrentMediaItem(int i10) {
        seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, i10, true);
    }

    private void seekToCurrentItem(long j10, int i10) {
        seekTo(getCurrentMediaItemIndex(), j10, i10, false);
    }

    private void seekToNextMediaItemInternal(int i10) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            ignoreSeek(i10);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i10);
        } else {
            seekToDefaultPositionInternal(nextMediaItemIndex, i10);
        }
    }

    private void seekToOffset(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekToCurrentItem(Math.max(currentPosition, 0L), i10);
    }

    private void seekToPreviousMediaItemInternal(int i10) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            ignoreSeek(i10);
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i10);
        } else {
            seekToDefaultPositionInternal(previousMediaItemIndex, i10);
        }
    }

    @Override // io.bidmachine.media3.common.Player
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return Util.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // io.bidmachine.media3.common.Player
    public final long getContentDuration() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
    }

    @Override // io.bidmachine.media3.common.Player
    public final long getCurrentLiveOffset() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).windowStartTimeMs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - getContentPosition();
    }

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    public final Object getCurrentManifest() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).manifest;
    }

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    public final MediaItem getCurrentMediaItem() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem;
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public final MediaItem getMediaItemAt(int i10) {
        return getCurrentTimeline().getWindow(i10, this.window).mediaItem;
    }

    @Override // io.bidmachine.media3.common.Player
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // io.bidmachine.media3.common.Player
    public final int getNextMediaItemIndex() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getNextWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    public final int getPreviousMediaItemIndex() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean hasNextMediaItem() {
        if (getNextMediaItemIndex() != -1) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean hasPreviousMediaItem() {
        if (getPreviousMediaItemIndex() != -1) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().contains(i10);
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean isCurrentMediaItemDynamic() {
        Timeline currentTimeline = getCurrentTimeline();
        if (!currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean isCurrentMediaItemLive() {
        Timeline currentTimeline = getCurrentTimeline();
        if (!currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive()) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean isCurrentMediaItemSeekable() {
        Timeline currentTimeline = getCurrentTimeline();
        if (!currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isSeekable) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // io.bidmachine.media3.common.Player
    public final boolean isPlaying() {
        if (getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final void previous() {
        seekToPreviousMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekBack() {
        seekToOffset(-getSeekBackIncrement(), 11);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekForward() {
        seekToOffset(getSeekForwardIncrement(), 12);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekToDefaultPosition(int i10) {
        seekToDefaultPositionInternal(i10, 10);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekToNext() {
        if (!getCurrentTimeline().isEmpty() && !isPlayingAd()) {
            if (hasNextMediaItem()) {
                seekToNextMediaItemInternal(9);
                return;
            } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 9);
                return;
            } else {
                ignoreSeek(9);
                return;
            }
        }
        ignoreSeek(9);
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public final void seekToPrevious() {
        if (!getCurrentTimeline().isEmpty() && !isPlayingAd()) {
            boolean zHasPreviousMediaItem = hasPreviousMediaItem();
            if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
                if (zHasPreviousMediaItem) {
                    seekToPreviousMediaItemInternal(7);
                    return;
                } else {
                    ignoreSeek(7);
                    return;
                }
            }
            if (zHasPreviousMediaItem && getCurrentPosition() <= getMaxSeekToPreviousPosition()) {
                seekToPreviousMediaItemInternal(7);
                return;
            } else {
                seekToCurrentItem(0L, 7);
                return;
            }
        }
        ignoreSeek(7);
    }

    @Override // io.bidmachine.media3.common.Player
    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // io.bidmachine.media3.common.Player
    public final void setMediaItem(MediaItem mediaItem, boolean z10) {
        setMediaItems(ImmutableList.of(mediaItem), z10);
    }

    @Override // io.bidmachine.media3.common.Player
    public final void setPlaybackSpeed(float f10) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f10));
    }

    private void seekToDefaultPositionInternal(int i10, int i11) {
        seekTo(i10, -9223372036854775807L, i11, false);
    }
}
