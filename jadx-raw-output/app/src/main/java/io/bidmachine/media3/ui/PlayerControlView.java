package io.bidmachine.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.DeviceInfo;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaLibraryInfo;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.TrackSelectionOverride;
import io.bidmachine.media3.common.TrackSelectionParameters;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.RepeatModeUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;

    @Nullable
    private final View audioTrackButton;
    private final b audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final c componentListener;
    private final b0 controlViewLayoutManager;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;

    @Nullable
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;

    @Nullable
    private final ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;

    @Nullable
    private final ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;

    @Nullable
    private final ImageView nextButton;

    @Nullable
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Drawable pauseButtonDrawable;
    private final Timeline.Period period;
    private final Drawable playButtonDrawable;

    @Nullable
    private final ImageView playPauseButton;
    private final d playbackSpeedAdapter;

    @Nullable
    private final View playbackSpeedButton;
    private boolean[] playedAdGroups;

    @Nullable
    private Player player;

    @Nullable
    private final TextView positionView;

    @Nullable
    private final ImageView previousButton;

    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;

    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final Resources resources;

    @Nullable
    private final View rewindButton;

    @Nullable
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final f settingsAdapter;

    @Nullable
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final h textTrackSelectionAdapter;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final ImageView vrButton;
    private final Timeline.Window window;

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z10);
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j10, long j11);
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i10);
    }

    public final class b extends j {
        private b() {
            super();
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i10 = 0; i10 < this.tracks.size(); i10++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i10).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((Player) Util.castNonNull(PlayerControlView.this.player)).setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j
        public void init(List<i> list) {
            this.tracks = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                i iVar = list.get(i10);
                if (iVar.isSelected()) {
                    PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, iVar.trackName);
                    return;
                }
            }
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j
        public void onBindViewHolderAtZeroPosition(g gVar) {
            gVar.textView.setText(R.string.exo_track_selection_auto);
            gVar.checkView.setVisibility(hasSelectionOverride(((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            gVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f59920b.lambda$onBindViewHolderAtZeroPosition$0(view);
                }
            });
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j
        public void onTrackSelection(String str) {
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    public final class c implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
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
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                PlayerControlView.this.updateTrackLists();
            }
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (PlayerControlView.this.nextButton == view) {
                if (player.isCommandAvailable(9)) {
                    player.seekToNext();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.previousButton == view) {
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                    return;
                }
                player.seekForward();
                return;
            }
            if (PlayerControlView.this.rewindButton == view) {
                if (player.isCommandAvailable(11)) {
                    player.seekBack();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.playPauseButton == view) {
                Util.handlePlayPauseButtonAction(player, PlayerControlView.this.showPlayButtonIfSuppressed);
                return;
            }
            if (PlayerControlView.this.repeatToggleButton == view) {
                if (player.isCommandAvailable(15)) {
                    player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.shuffleButton == view) {
                if (player.isCommandAvailable(14)) {
                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.settingsButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, PlayerControlView.this.settingsButton);
                return;
            }
            if (PlayerControlView.this.playbackSpeedButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, PlayerControlView.this.playbackSpeedButton);
            } else if (PlayerControlView.this.audioTrackButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, PlayerControlView.this.audioTrackButton);
            } else if (PlayerControlView.this.subtitleButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, PlayerControlView.this.subtitleButton);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.needToHideBars) {
                PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // io.bidmachine.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j10) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j10));
            }
        }

        @Override // io.bidmachine.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j10) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j10));
            }
            PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        @Override // io.bidmachine.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j10, boolean z10) {
            PlayerControlView.this.scrubbing = false;
            if (!z10 && PlayerControlView.this.player != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.seekToTimeBarPosition(playerControlView.player, j10);
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public final class d extends RecyclerView.Adapter<g> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public void updateSelectedIndex(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i10 >= fArr.length) {
                    this.selectedIndex = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }

        public d(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(int i10, View view) {
            if (i10 != this.selectedIndex) {
                PlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i10]);
            }
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(g gVar, final int i10) {
            String[] strArr = this.playbackSpeedTexts;
            if (i10 < strArr.length) {
                gVar.textView.setText(strArr[i10]);
            }
            if (i10 == this.selectedIndex) {
                gVar.itemView.setSelected(true);
                gVar.checkView.setVisibility(0);
            } else {
                gVar.itemView.setSelected(false);
                gVar.checkView.setVisibility(4);
            }
            gVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f59921b.lambda$onBindViewHolder$0(i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.bm_exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public final class e extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public e(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f59923b.lambda$new$0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            PlayerControlView.this.onSettingViewClicked(getBindingAdapterPosition());
        }
    }

    public class f extends RecyclerView.Adapter<e> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        public f(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        private boolean shouldShowSetting(int i10) {
            if (PlayerControlView.this.player == null) {
                return false;
            }
            if (i10 == 0) {
                return PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i10 != 1) {
                return true;
            }
            return PlayerControlView.this.player.isCommandAvailable(30) && PlayerControlView.this.player.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(e eVar, int i10) {
            if (shouldShowSetting(i10)) {
                eVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                eVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            eVar.mainTextView.setText(this.mainTexts[i10]);
            if (this.subTexts[i10] == null) {
                eVar.subTextView.setVisibility(8);
            } else {
                eVar.subTextView.setText(this.subTexts[i10]);
            }
            if (this.iconIds[i10] == null) {
                eVar.iconView.setVisibility(8);
            } else {
                eVar.iconView.setImageDrawable(this.iconIds[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public e onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return PlayerControlView.this.new e(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.bm_exo_styled_settings_list_item, viewGroup, false));
        }

        public void setSubTextAtPosition(int i10, String str) {
            this.subTexts[i10] = str;
        }
    }

    public final class h extends j {
        private h() {
            super();
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j
        public void init(List<i> list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).isSelected()) {
                    z10 = true;
                    break;
                }
            }
            if (PlayerControlView.this.subtitleButton != null) {
                ImageView imageView = PlayerControlView.this.subtitleButton;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z10 ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                PlayerControlView.this.subtitleButton.setContentDescription(z10 ? PlayerControlView.this.subtitleOnContentDescription : PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j
        public void onTrackSelection(String str) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            PlayerControlView.this.player.setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(g gVar, int i10) {
            super.onBindViewHolder(gVar, i10);
            if (i10 > 0) {
                gVar.checkView.setVisibility(this.tracks.get(i10 + (-1)).isSelected() ? 0 : 4);
            }
        }

        @Override // io.bidmachine.media3.ui.PlayerControlView.j
        public void onBindViewHolderAtZeroPosition(g gVar) {
            boolean z10;
            gVar.textView.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            while (true) {
                if (i10 >= this.tracks.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.tracks.get(i10).isSelected()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            gVar.checkView.setVisibility(z10 ? 0 : 4);
            gVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f59924b.lambda$onBindViewHolderAtZeroPosition$0(view);
                }
            });
        }
    }

    public static final class i {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }

        public i(Tracks tracks, int i10, int i11, String str) {
            this.trackGroup = tracks.getGroups().get(i10);
            this.trackIndex = i11;
            this.trackName = str;
        }
    }

    public abstract class j extends RecyclerView.Adapter<g> {
        public List<i> tracks = new ArrayList();

        public abstract void init(List<i> list);

        public abstract void onBindViewHolderAtZeroPosition(g gVar);

        public abstract void onTrackSelection(String str);

        public j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(Player player, TrackGroup trackGroup, i iVar, View view) {
            if (player.isCommandAvailable(29)) {
                player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, ImmutableList.of(Integer.valueOf(iVar.trackIndex)))).setTrackTypeDisabled(iVar.trackGroup.getType(), false).build());
                onTrackSelection(iVar.trackName);
                PlayerControlView.this.settingsWindow.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(g gVar, int i10) {
            final Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i10 == 0) {
                onBindViewHolderAtZeroPosition(gVar);
                return;
            }
            final i iVar = this.tracks.get(i10 - 1);
            final TrackGroup mediaTrackGroup = iVar.trackGroup.getMediaTrackGroup();
            boolean z10 = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && iVar.isSelected();
            gVar.textView.setText(iVar.trackName);
            gVar.checkView.setVisibility(z10 ? 0 : 4);
            gVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f59925b.lambda$onBindViewHolder$0(player, mediaTrackGroup, iVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.bm_exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public void clear() {
            this.tracks = Collections.emptyList();
        }
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public static class g extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public g(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(R.id.exo_text);
            this.checkView = view.findViewById(R.id.exo_check);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i10 = 0; i10 < windowCount; i10++) {
            if (currentTimeline.getWindow(i10, window).durationUs == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter<?> adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private ImmutableList<i> gatherSupportedTrackInfosOfType(Tracks tracks, int i10) {
        ImmutableList.a aVar = new ImmutableList.a();
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i11 = 0; i11 < groups.size(); i11++) {
            Tracks.Group group = groups.get(i11);
            if (group.getType() == i10) {
                for (int i12 = 0; i12 < group.length; i12++) {
                    if (group.isTrackSupported(i12)) {
                        Format trackFormat = group.getTrackFormat(i12);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            aVar.a(new i(tracks, i11, i12, this.trackNameProvider.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return aVar.m();
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, i10);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(ImmutableList.of());
            }
        }
    }

    private static void initializeFullScreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullScreenButtonClicked(View view) {
        if (this.onFullScreenModeChangedListener == null) {
            return;
        }
        boolean z10 = !this.isFullScreen;
        this.isFullScreen = z10;
        updateFullScreenButtonForState(this.fullScreenButton, z10);
        updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.isFullScreen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i10) {
        if (i10 == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else if (i10 == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j10) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                Timeline currentTimeline = player.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i10 = 0;
                while (true) {
                    long durationMs = currentTimeline.getWindow(i10, this.window).getDurationMs();
                    if (j10 < durationMs) {
                        break;
                    }
                    if (i10 == windowCount - 1) {
                        j10 = durationMs;
                        break;
                    } else {
                        j10 -= durationMs;
                        i10++;
                    }
                }
                player.seekTo(i10, j10);
            }
        } else if (player.isCommandAvailable(5)) {
            player.seekTo(j10);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f10));
    }

    private boolean shouldEnablePlayPauseButton() {
        Player player = this.player;
        return (player == null || !player.isCommandAvailable(1) || (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().isEmpty())) ? false : true;
    }

    private void updateButton(boolean z10, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullScreenButtonForState(@Nullable ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.fullScreenExitDrawable);
            imageView.setContentDescription(this.fullScreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    private static void updateFullScreenButtonVisibility(@Nullable View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    private void updateRewindButton() {
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd A[SYNTHETIC] */
    public void updateTimeline() {
        long jMsToUs;
        int i10;
        Timeline.Window window;
        long positionInWindowUs;
        long[] jArr;
        int length;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z10 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.isCommandAvailable(17) ? player.getCurrentTimeline() : Timeline.EMPTY;
        if (currentTimeline.isEmpty()) {
            if (player.isCommandAvailable(16)) {
                long contentDuration = player.getContentDuration();
                if (contentDuration != -9223372036854775807L) {
                    jMsToUs = Util.msToUs(contentDuration);
                } else {
                    jMsToUs = 0;
                }
            } else {
                jMsToUs = 0;
            }
            i10 = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z11 = this.multiWindowTimeBar;
            int i11 = z11 ? 0 : currentMediaItemIndex;
            int windowCount = z11 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j10 = 0;
            i10 = 0;
            while (i11 <= windowCount) {
                if (i11 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j10);
                }
                currentTimeline.getWindow(i11, this.window);
                Timeline.Window window2 = this.window;
                if (window2.durationUs == -9223372036854775807L) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z10);
                    break;
                }
                int i12 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i12 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i12, this.period);
                        int adGroupCount = this.period.getAdGroupCount();
                        for (int removedAdGroupCount = this.period.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j11 = this.period.durationUs;
                                if (j11 != -9223372036854775807L) {
                                    adGroupTimeUs = j11;
                                    positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                                    if (positionInWindowUs >= 0) {
                                        jArr = this.adGroupTimesMs;
                                        if (i10 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                            this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                        }
                                        this.adGroupTimesMs[i10] = Util.usToMs(j10 + positionInWindowUs);
                                        this.playedAdGroups[i10] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                        i10++;
                                    }
                                }
                            } else {
                                positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                                if (positionInWindowUs >= 0) {
                                    jArr = this.adGroupTimesMs;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                    }
                                    this.adGroupTimesMs[i10] = Util.usToMs(j10 + positionInWindowUs);
                                    this.playedAdGroups[i10] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                    i10++;
                                }
                            }
                        }
                        i12++;
                    }
                }
                j10 += window.durationUs;
                i11++;
                z10 = true;
            }
            jMsToUs = j10;
        }
        long jUsToMs = Util.usToMs(jMsToUs);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i13 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i13);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i13);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i10, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i10, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i13);
        }
        updateProgress();
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void requestPlayPauseFocus() {
        ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.controlViewLayoutManager.setAnimationEnabled(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullScreenButtonVisibility(this.fullScreenButton, onFullScreenModeChangedListener != null);
        updateFullScreenButtonVisibility(this.minimalFullScreenButton, onFullScreenModeChangedListener != null);
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i10) {
        this.repeatToggleModes = i10;
        Player player = this.player;
        if (player != null && player.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i10 != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z10);
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.showMultiWindowTimeBar = z10;
        updateTimeline();
    }

    public void setShowNextButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z10);
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.showPlayButtonIfSuppressed = z10;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z10);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z10);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z10);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.showTimeoutMs = i10;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean z10;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            boolean z11 = false;
            if (player != null) {
                if (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) {
                    zIsCommandAvailable4 = player.isCommandAvailable(10);
                } else {
                    zIsCommandAvailable4 = player.isCommandAvailable(5);
                }
                zIsCommandAvailable2 = player.isCommandAvailable(7);
                boolean zIsCommandAvailable5 = player.isCommandAvailable(11);
                zIsCommandAvailable3 = player.isCommandAvailable(12);
                zIsCommandAvailable = player.isCommandAvailable(9);
                z10 = zIsCommandAvailable4;
                z11 = zIsCommandAvailable5;
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                z10 = false;
                zIsCommandAvailable3 = false;
            }
            if (z11) {
                updateRewindButton();
            }
            if (zIsCommandAvailable3) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable2, this.previousButton);
            updateButton(z11, this.rewindButton);
            updateButton(zIsCommandAvailable3, this.fastForwardButton);
            updateButton(zIsCommandAvailable, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        Drawable drawable;
        int i10;
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            if (zShouldShowPlayButton) {
                drawable = this.playButtonDrawable;
            } else {
                drawable = this.pauseButtonDrawable;
            }
            if (zShouldShowPlayButton) {
                i10 = R.string.exo_controls_play_description;
            } else {
                i10 = R.string.exo_controls_pause_description;
            }
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i10));
            updateButton(shouldEnablePlayPauseButton(), this.playPauseButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentBufferedPosition;
        int playbackState;
        long preferredUpdateDelay;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            long contentPosition = 0;
            if (player != null && player.isCommandAvailable(16)) {
                contentPosition = this.currentWindowOffset + player.getContentPosition();
                contentBufferedPosition = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                contentBufferedPosition = 0;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            if (player == null) {
                playbackState = 1;
            } else {
                playbackState = player.getPlaybackState();
            }
            long j10 = 1000;
            if (player != null && player.isPlaying()) {
                TimeBar timeBar2 = this.timeBar;
                if (timeBar2 != null) {
                    preferredUpdateDelay = timeBar2.getPreferredUpdateDelay();
                } else {
                    preferredUpdateDelay = 1000;
                }
                long jMin = Math.min(preferredUpdateDelay, 1000 - (contentPosition % 1000));
                float f10 = player.getPlaybackParameters().speed;
                if (f10 > 0.0f) {
                    j10 = (long) (jMin / f10);
                }
                postDelayed(this.updateProgressAction, Util.constrainValue(j10, this.timeBarMinUpdateIntervalMs, 1000L));
                return;
            }
            if (playbackState != 4 && playbackState != 1) {
                postDelayed(this.updateProgressAction, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
            if (player != null && player.isCommandAvailable(15)) {
                updateButton(true, this.repeatToggleButton);
                int repeatMode = player.getRepeatMode();
                if (repeatMode != 0) {
                    if (repeatMode != 1) {
                        if (repeatMode == 2) {
                            this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                            this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
                            return;
                        }
                        return;
                    }
                    this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                    this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(false, this.repeatToggleButton);
            this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
            this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player != null && player.isCommandAvailable(14)) {
                updateButton(true, this.shuffleButton);
                ImageView imageView2 = this.shuffleButton;
                if (player.getShuffleModeEnabled()) {
                    drawable = this.shuffleOnButtonDrawable;
                } else {
                    drawable = this.shuffleOffButtonDrawable;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.shuffleButton;
                if (player.getShuffleModeEnabled()) {
                    str = this.shuffleOnContentDescription;
                } else {
                    str = this.shuffleOffContentDescription;
                }
                imageView3.setContentDescription(str);
                return;
            }
            updateButton(false, this.shuffleButton);
            this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
            this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        boolean z10;
        initTrackSelectionAdapter();
        if (this.textTrackSelectionAdapter.getItemCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        updateButton(z10, this.subtitleButton);
        updateSettingsButton();
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!dispatchMediaKeyEvent(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player != null && isHandledMediaKey(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (player.getPlaybackState() != 4 && player.isCommandAvailable(12)) {
                        player.seekForward();
                        return true;
                    }
                    return true;
                }
                if (keyCode == 89 && player.isCommandAvailable(11)) {
                    player.seekBack();
                    return true;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        Util.handlePauseButtonAction(player);
                                        return true;
                                    }
                                    return true;
                                }
                                Util.handlePlayButtonAction(player);
                                return true;
                            }
                            if (player.isCommandAvailable(7)) {
                                player.seekToPrevious();
                                return true;
                            }
                            return true;
                        }
                        if (player.isCommandAvailable(9)) {
                            player.seekToNext();
                            return true;
                        }
                        return true;
                    }
                    Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.controlViewLayoutManager.onLayout(z10, i10, i11, i12, i13);
    }

    public void setPlayer(@Nullable Player player) {
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
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2) throws Throwable {
        int i11;
        final PlayerControlView playerControlView;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        final PlayerControlView playerControlView2;
        boolean z18;
        super(context, attributeSet, i10);
        int i28 = R.layout.bm_exo_player_control_view;
        int i29 = R.drawable.exo_styled_controls_play;
        int i30 = R.drawable.exo_styled_controls_pause;
        int i31 = R.drawable.exo_styled_controls_next;
        int i32 = R.drawable.exo_styled_controls_simple_fastforward;
        int i33 = R.drawable.exo_styled_controls_previous;
        int i34 = R.drawable.exo_styled_controls_simple_rewind;
        int i35 = R.drawable.exo_styled_controls_fullscreen_exit;
        int i36 = R.drawable.exo_styled_controls_fullscreen_enter;
        int i37 = R.drawable.exo_styled_controls_repeat_off;
        int i38 = R.drawable.exo_styled_controls_repeat_one;
        int i39 = R.drawable.exo_styled_controls_repeat_all;
        int i40 = R.drawable.exo_styled_controls_shuffle_on;
        int i41 = R.drawable.exo_styled_controls_shuffle_off;
        int i42 = R.drawable.exo_styled_controls_subtitle_on;
        int i43 = R.drawable.exo_styled_controls_subtitle_off;
        int i44 = R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.PlayerControlView, i10, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_controller_layout_id, i28);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_play_icon, i29);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_pause_icon, i30);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_next_icon, i31);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fastforward_icon, i32);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_previous_icon, i33);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_rewind_icon, i34);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fullscreen_exit_icon, i35);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fullscreen_enter_icon, i36);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_off_icon, i37);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_one_icon, i38);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_all_icon, i39);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_shuffle_on_icon, i40);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_shuffle_off_icon, i41);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_subtitle_on_icon, i42);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_subtitle_off_icon, i43);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_vr_icon, i44);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_fastforward_button, true);
                    boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_next_button, true);
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z24 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i27 = resourceId14;
                    i26 = resourceId;
                    z17 = z26;
                    i12 = resourceId6;
                    i13 = resourceId7;
                    i14 = resourceId8;
                    i15 = resourceId9;
                    i16 = resourceId10;
                    i17 = resourceId11;
                    i18 = resourceId12;
                    i19 = resourceId13;
                    i20 = resourceId15;
                    i21 = resourceId16;
                    i11 = resourceId17;
                    z10 = z19;
                    z11 = z20;
                    z12 = z21;
                    z13 = z22;
                    z14 = z23;
                    z15 = z24;
                    z16 = z25;
                    i22 = resourceId2;
                    i23 = resourceId3;
                    i24 = resourceId5;
                    i25 = resourceId4;
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            i11 = i44;
            playerControlView = this;
            i12 = i33;
            i13 = i34;
            i14 = i35;
            i15 = i36;
            i16 = i37;
            i17 = i38;
            i18 = i39;
            i19 = i40;
            i20 = i42;
            i21 = i43;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = true;
            i22 = i29;
            i23 = i30;
            i24 = i32;
            i25 = i31;
            i26 = i28;
            i27 = i41;
        }
        LayoutInflater.from(context).inflate(i26, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        c cVar = new c();
        playerControlView.componentListener = cVar;
        playerControlView.visibilityListeners = new CopyOnWriteArrayList<>();
        playerControlView.period = new Timeline.Period();
        playerControlView.window = new Timeline.Window();
        StringBuilder sb2 = new StringBuilder();
        playerControlView.formatBuilder = sb2;
        int i45 = i24;
        playerControlView.formatter = new Formatter(sb2, Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new Runnable() { // from class: io.bidmachine.media3.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f59913b.updateProgress();
            }
        };
        playerControlView.durationView = (TextView) playerControlView.findViewById(R.id.exo_duration);
        playerControlView.positionView = (TextView) playerControlView.findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) playerControlView.findViewById(R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) playerControlView.findViewById(R.id.exo_fullscreen);
        playerControlView.fullScreenButton = imageView2;
        initializeFullScreenButton(imageView2, new View.OnClickListener() { // from class: io.bidmachine.media3.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f59915b.onFullScreenButtonClicked(view);
            }
        });
        ImageView imageView3 = (ImageView) playerControlView.findViewById(R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new View.OnClickListener() { // from class: io.bidmachine.media3.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f59915b.onFullScreenButtonClicked(view);
            }
        });
        View viewFindViewById = playerControlView.findViewById(R.id.exo_settings);
        playerControlView.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_audio_track);
        playerControlView.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        int i46 = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) playerControlView.findViewById(i46);
        View viewFindViewById4 = playerControlView.findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            playerControlView.timeBar = timeBar;
            playerControlView2 = playerControlView;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i46);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2 = this;
            playerControlView2.timeBar = defaultTimeBar;
        } else {
            playerControlView2 = playerControlView;
            playerControlView2.timeBar = null;
        }
        TimeBar timeBar2 = playerControlView2.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(cVar);
        }
        Resources resources = context.getResources();
        playerControlView2.resources = resources;
        ImageView imageView4 = (ImageView) playerControlView2.findViewById(R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(R.id.exo_prev);
        playerControlView2.previousButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(Util.getDrawable(context, resources, i12));
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(R.id.exo_next);
        playerControlView2.nextButton = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(Util.getDrawable(context, resources, i25));
            imageView6.setOnClickListener(cVar);
        }
        Typeface font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(R.id.exo_rew);
        TextView textView = (TextView) playerControlView2.findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(Util.getDrawable(context, resources, i13));
            playerControlView2.rewindButton = imageView7;
            playerControlView2.rewindButtonTextView = null;
        } else if (textView != null) {
            textView.setTypeface(font);
            playerControlView2.rewindButtonTextView = textView;
            playerControlView2.rewindButton = textView;
        } else {
            playerControlView2.rewindButtonTextView = null;
            playerControlView2.rewindButton = null;
        }
        View view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(playerControlView2.componentListener);
        }
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) playerControlView2.findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(Util.getDrawable(context, resources, i45));
            playerControlView2.fastForwardButton = imageView8;
            playerControlView2.fastForwardButtonTextView = null;
        } else if (textView2 != null) {
            textView2.setTypeface(font);
            playerControlView2.fastForwardButtonTextView = textView2;
            playerControlView2.fastForwardButton = textView2;
        } else {
            playerControlView2.fastForwardButtonTextView = null;
            playerControlView2.fastForwardButton = null;
        }
        View view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(playerControlView2.componentListener);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(playerControlView2.componentListener);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(playerControlView2.componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(R.id.exo_vr);
        playerControlView2.vrButton = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(Util.getDrawable(context, resources, i11));
            playerControlView2.updateButton(false, imageView11);
        }
        b0 b0Var = new b0(playerControlView2);
        playerControlView2.controlViewLayoutManager = b0Var;
        b0Var.setAnimationEnabled(z17);
        f fVar = playerControlView2.new f(new String[]{resources.getString(R.string.exo_controls_playback_speed), playerControlView2.resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, playerControlView2.resources, R.drawable.exo_styled_controls_speed), Util.getDrawable(context, playerControlView2.resources, R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = fVar;
        playerControlView2.settingsWindowMargin = playerControlView2.resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.bm_exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.settingsView = recyclerView;
        recyclerView.setAdapter(fVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow;
        if (Util.SDK_INT < 23) {
            z18 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z18 = false;
        }
        popupWindow.setOnDismissListener(playerControlView2.componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
        playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i20);
        playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i21);
        playerControlView2.subtitleOnContentDescription = playerControlView2.resources.getString(R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = playerControlView2.resources.getString(R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new h();
        playerControlView2.audioTrackSelectionAdapter = new b();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new d(playerControlView2.resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i22);
        playerControlView2.pauseButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i23);
        playerControlView2.fullScreenExitDrawable = Util.getDrawable(context, playerControlView2.resources, i14);
        playerControlView2.fullScreenEnterDrawable = Util.getDrawable(context, playerControlView2.resources, i15);
        playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i16);
        playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i17);
        playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i18);
        playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i19);
        playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, playerControlView2.resources, i27);
        playerControlView2.fullScreenExitContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullScreenEnterContentDescription = playerControlView2.resources.getString(R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = playerControlView2.resources.getString(R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = playerControlView2.resources.getString(R.string.exo_controls_shuffle_off_description);
        playerControlView2.controlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(R.id.exo_bottom_bar), true);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z11);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z10);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.previousButton, z12);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.nextButton, z13);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.shuffleButton, z14);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.subtitleButton, z15);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.vrButton, z16);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.repeatToggleButton, playerControlView2.repeatToggleModes == 0 ? z18 : true);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.bidmachine.media3.ui.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54) {
                this.f59916b.onLayoutChange(view3, i47, i48, i49, i50, i51, i52, i53, i54);
            }
        });
    }
}
