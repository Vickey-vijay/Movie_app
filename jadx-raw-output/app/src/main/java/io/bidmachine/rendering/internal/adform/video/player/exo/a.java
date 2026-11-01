package io.bidmachine.rendering.internal.adform.video.player.exo;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.DeviceInfo;
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
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.ui.PlayerView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class a extends io.bidmachine.rendering.internal.adform.video.player.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExoPlayer f60053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PlayerView f60054m;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.video.player.exo.a$a, reason: collision with other inner class name */
    public class C0519a implements Player.Listener {
        public C0519a() {
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            super.onAudioAttributesChanged(audioAttributes);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
            super.onAudioSessionIdChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            super.onAvailableCommandsChanged(commands);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
            super.onCues(cueGroup);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues((List<Cue>) list);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            super.onDeviceInfoChanged(deviceInfo);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            super.onDeviceVolumeChanged(i10, z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
            super.onEvents(player, events);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
            super.onIsLoadingChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z10) {
            if (z10) {
                a.this.u();
            } else {
                a.this.t();
            }
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
            super.onLoadingChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            super.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaItemTransition(@Nullable MediaItem mediaItem, int i10) {
            super.onMediaItemTransition(mediaItem, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            super.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
            super.onMetadata(metadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            super.onPlayWhenReadyChanged(z10, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            super.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            if (i10 == 3) {
                a.this.v();
            } else if (i10 == 4) {
                a.this.L();
            }
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            super.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            a.this.a(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            super.onPlayerErrorChanged(playbackException);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            super.onPlayerStateChanged(z10, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            super.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
            super.onPositionDiscontinuity(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            a.this.b(Long.valueOf(positionInfo2.positionMs));
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
            super.onRepeatModeChanged(i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            super.onSeekBackIncrementChanged(j10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            super.onSeekForwardIncrementChanged(j10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            super.onShuffleModeEnabledChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            super.onSkipSilenceEnabledChanged(z10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            super.onSurfaceSizeChanged(i10, i11);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
            super.onTimelineChanged(timeline, i10);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            super.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
            super.onTracksChanged(tracks);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            super.onVideoSizeChanged(videoSize);
        }

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onVolumeChanged(float f10) {
            a.this.b(f10);
        }
    }

    public a(Context context) {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        this.f60053l = exoPlayerBuild;
        exoPlayerBuild.addListener(new C0519a());
        PlayerView playerView = new PlayerView(context);
        this.f60054m = playerView;
        playerView.setPlayer(exoPlayerBuild);
        playerView.setUseController(false);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public boolean f() {
        return this.f60053l.isPlaying();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public boolean h() {
        return false;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void j() {
        this.f60053l.pause();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void k() {
        this.f60053l.play();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void n() {
        this.f60053l.prepare();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void o() {
        this.f60053l.stop();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a, io.bidmachine.rendering.internal.adform.video.player.b
    public View p() {
        return this.f60054m;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public long b() {
        return this.f60053l.getCurrentPosition();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public long c() {
        return this.f60053l.getDuration();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public float d() {
        return this.f60053l.getVolume();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void b(Uri uri) {
        this.f60053l.setMediaItem(new MediaItem.Builder().setUri(uri).build());
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void a(long j10) {
        this.f60053l.seekTo(j10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void a(float f10) {
        this.f60053l.setVolume(f10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a, io.bidmachine.rendering.internal.adform.video.player.b
    public void a() {
        super.a();
        this.f60053l.release();
        this.f60054m.setPlayer(null);
    }
}
