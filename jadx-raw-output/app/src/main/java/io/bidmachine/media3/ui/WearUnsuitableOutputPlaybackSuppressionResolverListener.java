package io.bidmachine.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
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
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Player.Listener {
    public static final long DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS = TimeUnit.MINUTES.toMillis(5);
    private static final String EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT = "EXTRA_CLOSE_ON_CONNECT";
    private static final String EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY = "EXTRA_CONNECTION_ONLY";
    private static final String EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    private static final String EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME = "com.android.settings.panel.extra.PACKAGE_NAME";
    private static final int FILTER_TYPE_AUDIO = 1;
    private static final String OUTPUT_SWITCHER_INTENT_ACTION_NAME = "com.android.settings.panel.action.MEDIA_OUTPUT";
    private final Context applicationContext;
    private final long autoResumeTimeoutAfterUnsuitableOutputSuppressionMs;
    private final Clock clock;
    private long unsuitableOutputPlaybackSuppressionStartRealtimeMs;

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context) {
        this(context, DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
        p10.startActivity(p11);
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
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
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
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        super.onPlayerError(playbackException);
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
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        super.onPositionDiscontinuity(positionInfo, positionInfo2, i10);
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
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, @IntRange(from = 0) long j10) {
        this(context, j10, Clock.DEFAULT);
    }

    private static void launchSystemMediaOutputSwitcherUi(Context context) {
        Intent intentPutExtra = new Intent(OUTPUT_SWITCHER_INTENT_ACTION_NAME).addFlags(268435456).putExtra(EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME, context.getPackageName());
        ComponentName systemOrSystemUpdatedAppComponent = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra);
        if (systemOrSystemUpdatedAppComponent != null) {
            intentPutExtra.setComponent(systemOrSystemUpdatedAppComponent);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentPutExtra);
            return;
        }
        Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE, 1);
        ComponentName systemOrSystemUpdatedAppComponent2 = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra2);
        if (systemOrSystemUpdatedAppComponent2 != null) {
            intentPutExtra2.setComponent(systemOrSystemUpdatedAppComponent2);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentPutExtra2);
        }
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        if (Util.isWear(this.applicationContext)) {
            if ((events.contains(6) || events.contains(5)) && player.getPlayWhenReady() && player.getPlaybackSuppressionReason() == 3) {
                player.pause();
                this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = this.clock.elapsedRealtime();
                if (events.contains(5)) {
                    launchSystemMediaOutputSwitcherUi(this.applicationContext);
                    return;
                }
                return;
            }
            if (!events.contains(6) || player.getPlaybackSuppressionReason() != 0 || this.unsuitableOutputPlaybackSuppressionStartRealtimeMs == -9223372036854775807L || this.clock.elapsedRealtime() - this.unsuitableOutputPlaybackSuppressionStartRealtimeMs >= this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs) {
                return;
            }
            this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = -9223372036854775807L;
            player.play();
        }
    }

    @VisibleForTesting
    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, @IntRange(from = 0) long j10, Clock clock) {
        Assertions.checkArgument(j10 >= 0);
        this.applicationContext = context.getApplicationContext();
        this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs = j10;
        this.clock = clock;
        this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = -9223372036854775807L;
    }

    @Nullable
    private static ComponentName getSystemOrSystemUpdatedAppComponent(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }
}
