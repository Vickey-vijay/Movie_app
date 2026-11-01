package io.bidmachine.media3.ui;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
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
import io.bidmachine.media3.common.util.NotificationUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "io.bidmachine.media3.ui.notification.dismiss";
    public static final String ACTION_FAST_FORWARD = "io.bidmachine.media3.ui.notification.ffwd";
    public static final String ACTION_NEXT = "io.bidmachine.media3.ui.notification.next";
    public static final String ACTION_PAUSE = "io.bidmachine.media3.ui.notification.pause";
    public static final String ACTION_PLAY = "io.bidmachine.media3.ui.notification.play";
    public static final String ACTION_PREVIOUS = "io.bidmachine.media3.ui.notification.prev";
    public static final String ACTION_REWIND = "io.bidmachine.media3.ui.notification.rewind";
    public static final String ACTION_STOP = "io.bidmachine.media3.ui.notification.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;

    @Nullable
    private NotificationCompat.Builder builder;

    @Nullable
    private List<NotificationCompat.Action> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;

    @Nullable
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;

    @Nullable
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;

    @Nullable
    private MediaSession.Token mediaSessionToken;
    private final c notificationBroadcastReceiver;
    private final int notificationId;

    @Nullable
    private final NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private final Map<String, NotificationCompat.Action> playbackActions;

    @Nullable
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;

    @DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i10) {
            this.notificationTag = i10;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    public static class Builder {
        public int channelDescriptionResourceId;
        public final String channelId;
        public int channelImportance;
        public int channelNameResourceId;
        public final Context context;

        @Nullable
        public CustomActionReceiver customActionReceiver;
        public int fastForwardActionIconResourceId;

        @Nullable
        public String groupKey;
        public MediaDescriptionAdapter mediaDescriptionAdapter;
        public int nextActionIconResourceId;
        public final int notificationId;

        @Nullable
        public NotificationListener notificationListener;
        public int pauseActionIconResourceId;
        public int playActionIconResourceId;
        public int previousActionIconResourceId;
        public int rewindActionIconResourceId;
        public int smallIconResourceId;
        public int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i10, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i10, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i10 = this.channelNameResourceId;
            if (i10 != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i10, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i10) {
            this.channelDescriptionResourceId = i10;
            return this;
        }

        public Builder setChannelImportance(int i10) {
            this.channelImportance = i10;
            return this;
        }

        public Builder setChannelNameResourceId(int i10) {
            this.channelNameResourceId = i10;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i10) {
            this.fastForwardActionIconResourceId = i10;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i10) {
            this.nextActionIconResourceId = i10;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i10) {
            this.pauseActionIconResourceId = i10;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i10) {
            this.playActionIconResourceId = i10;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i10) {
            this.previousActionIconResourceId = i10;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i10) {
            this.rewindActionIconResourceId = i10;
            return this;
        }

        public Builder setSmallIconResourceId(int i10) {
            this.smallIconResourceId = i10;
            return this;
        }

        public Builder setStopActionIconResourceId(int i10) {
            this.stopActionIconResourceId = i10;
            return this;
        }

        public Builder(Context context, @IntRange(from = 1) int i10, String str) {
            Assertions.checkArgument(i10 > 0);
            this.context = context;
            this.notificationId = i10;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }
    }

    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int i10);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @Nullable
        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i10, boolean z10) {
        }

        default void onNotificationPosted(int i10, Notification notification, boolean z10) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    @RequiresApi(21)
    public static final class b extends NotificationCompat.Style {
        private final int[] actionsToShowInCompact;

        @Nullable
        private final MediaSession.Token token;

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(mediaStyle);
        }

        public b(@Nullable MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }
    }

    public class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public class d implements Player.Listener {
        private d() {
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

        @Override // io.bidmachine.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    public PlayerNotificationManager(Context context, String str, int i10, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i10;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i11;
        this.groupKey = str2;
        int i19 = instanceIdCounter;
        instanceIdCounter = i19 + 1;
        this.instanceId = i19;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: io.bidmachine.media3.ui.c0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f59907b.handleMessage(message);
            }
        });
        this.notificationManager = NotificationManagerCompat.from(applicationContext);
        this.playerListener = new d();
        this.notificationBroadcastReceiver = new c();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, NotificationCompat.Action> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i19, i12, i13, i14, i15, i16, i17, i18);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, NotificationCompat.Action> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.emptyMap();
        this.customActions = mapCreateCustomActions;
        Iterator<String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    public List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    @Deprecated
    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.SDK_INT >= 21) {
            setMediaSessionToken((MediaSession.Token) token.getToken());
        }
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i10);
        return PendingIntent.getBroadcast(context, i10, intent, Util.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new NotificationCompat.Action(i11, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i10)));
        map.put(ACTION_PAUSE, new NotificationCompat.Action(i12, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i10)));
        map.put(ACTION_STOP, new NotificationCompat.Action(i13, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i10)));
        map.put(ACTION_REWIND, new NotificationCompat.Action(i14, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i10)));
        map.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(i15, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i10)));
        map.put(ACTION_PREVIOUS, new NotificationCompat.Action(i16, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i10)));
        map.put(ACTION_NEXT, new NotificationCompat.Action(i17, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i10)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i10) {
        this.mainHandler.obtainMessage(2, i10, -1, bitmap).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z10) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            this.notificationManager.cancel(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i10;
        int iIndexOf3 = list.indexOf(ACTION_PAUSE);
        int iIndexOf4 = list.indexOf(ACTION_PLAY);
        if (this.usePreviousActionInCompactView) {
            iIndexOf = list.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        }
        if (this.useNextActionInCompactView) {
            iIndexOf2 = list.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i11 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i11 = 1;
        }
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf3 == -1 || zShouldShowPlayButton) {
            if (iIndexOf4 != -1 && zShouldShowPlayButton) {
                i10 = i11 + 1;
                iArr[i11] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i11] = iIndexOf2;
                i11++;
            }
            return Arrays.copyOf(iArr, i11);
        }
        i10 = i11 + 1;
        iArr[i11] = iIndexOf3;
        i11 = i10;
        if (iIndexOf2 != -1) {
            iArr[i11] = iIndexOf2;
            i11++;
        }
        return Arrays.copyOf(iArr, i11);
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i10) {
        if (this.badgeIconType == i10) {
            return;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i10;
        invalidate();
    }

    public final void setColor(int i10) {
        if (this.color != i10) {
            this.color = i10;
            invalidate();
        }
    }

    public final void setColorized(boolean z10) {
        if (this.colorized != z10) {
            this.colorized = z10;
            invalidate();
        }
    }

    public final void setDefaults(int i10) {
        if (this.defaults != i10) {
            this.defaults = i10;
            invalidate();
        }
    }

    public final void setPriority(int i10) {
        if (this.priority == i10) {
            return;
        }
        if (i10 != -2 && i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i10;
        invalidate();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        if (this.showPlayButtonIfSuppressed != z10) {
            this.showPlayButtonIfSuppressed = z10;
            invalidate();
        }
    }

    public final void setSmallIcon(@DrawableRes int i10) {
        if (this.smallIconResourceId != i10) {
            this.smallIconResourceId = i10;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z10) {
        if (this.useChronometer != z10) {
            this.useChronometer = z10;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z10) {
        if (this.useFastForwardAction != z10) {
            this.useFastForwardAction = z10;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z10) {
        if (this.useFastForwardActionInCompactView != z10) {
            this.useFastForwardActionInCompactView = z10;
            if (z10) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z10) {
        if (this.useNextAction != z10) {
            this.useNextAction = z10;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z10) {
        if (this.useNextActionInCompactView != z10) {
            this.useNextActionInCompactView = z10;
            if (z10) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z10) {
        if (this.usePlayPauseActions != z10) {
            this.usePlayPauseActions = z10;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z10) {
        if (this.usePreviousAction != z10) {
            this.usePreviousAction = z10;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z10) {
        if (this.usePreviousActionInCompactView != z10) {
            this.usePreviousActionInCompactView = z10;
            if (z10) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z10) {
        if (this.useRewindAction != z10) {
            this.useRewindAction = z10;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z10) {
        if (this.useRewindActionInCompactView != z10) {
            this.useRewindActionInCompactView = z10;
            if (z10) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z10) {
        if (this.useStopAction == z10) {
            return;
        }
        this.useStopAction = z10;
        invalidate();
    }

    public final void setVisibility(int i10) {
        if (this.visibility == i10) {
            return;
        }
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i10;
        invalidate();
    }

    private static void setLargeIcon(NotificationCompat.Builder builder, @Nullable Bitmap bitmap) {
        builder.setLargeIcon(bitmap);
    }

    @SuppressLint({"MissingPermission"})
    private void startOrUpdateNotification(Player player, @Nullable Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        NotificationCompat.Builder builderCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = builderCreateNotification;
        boolean z10 = false;
        if (builderCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationBuild = builderCreateNotification.build();
        this.notificationManager.notify(this.notificationId, notificationBuild);
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            int i10 = this.notificationId;
            if (ongoing || !this.isNotificationStarted) {
                z10 = true;
            }
            notificationListener.onNotificationPosted(i10, notificationBuild, z10);
        }
        this.isNotificationStarted = true;
    }

    @Nullable
    public NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean z10, @Nullable Bitmap bitmap) {
        NotificationCompat.Action action;
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i10 = 0; i10 < actions.size(); i10++) {
            String str = actions.get(i10);
            if (this.playbackActions.containsKey(str)) {
                action = this.playbackActions.get(str);
            } else {
                action = this.customActions.get(str);
            }
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.builderActions)) {
            builder = new NotificationCompat.Builder(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                builder.addAction((NotificationCompat.Action) arrayList.get(i11));
            }
        }
        int[] actionIndicesForCompactView = getActionIndicesForCompactView(actions, player);
        int i12 = Util.SDK_INT;
        if (i12 >= 21) {
            builder.setStyle(new b(this.mediaSessionToken, actionIndicesForCompactView));
        } else {
            androidx.media.app.NotificationCompat.MediaStyle mediaStyle = new androidx.media.app.NotificationCompat.MediaStyle();
            mediaStyle.setShowActionsInCompactView(actionIndicesForCompactView);
            mediaStyle.setShowCancelButton(!z10);
            mediaStyle.setCancelButtonIntent(this.dismissPendingIntent);
            builder.setStyle(mediaStyle);
        }
        builder.setDeleteIntent(this.dismissPendingIntent);
        builder.setBadgeIconType(this.badgeIconType).setOngoing(z10).setColor(this.color).setColorized(this.colorized).setSmallIcon(this.smallIconResourceId).setVisibility(this.visibility).setPriority(this.priority).setDefaults(this.defaults);
        if (i12 >= 21 && this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        } else {
            builder.setShowWhen(false).setUsesChronometer(false);
        }
        builder.setContentTitle(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.setContentText(this.mediaDescriptionAdapter.getCurrentContentText(player));
        builder.setSubText(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i13 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i13;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i13));
        }
        setLargeIcon(builder, bitmap);
        builder.setContentIntent(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        String str2 = this.groupKey;
        if (str2 != null) {
            builder.setGroup(str2);
        }
        builder.setOnlyAlertOnce(true);
        return builder;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        if ((playbackState == 2 || playbackState == 3) && player.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    public final void setMediaSessionToken(MediaSession.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z10;
        boolean z11 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }
}
