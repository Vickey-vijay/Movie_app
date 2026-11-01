package io.bidmachine.media3.exoplayer.analytics;

import android.os.SystemClock;
import android.util.Pair;
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
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DecoderCounters;
import io.bidmachine.media3.exoplayer.DecoderReuseEvaluation;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    @Nullable
    private Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;

    @Nullable
    private final Callback callback;
    private long discontinuityFromPositionMs;

    @Nullable
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;

    @Nullable
    private Exception nonFatalException;
    private final Timeline.Period period;
    private final Map<String, a> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;

    @Nullable
    private Format videoFormat;
    private VideoSize videoSize;

    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    public static final class a {
        private long audioFormatBitrateTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;

        @Nullable
        private Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;

        @Nullable
        private Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        private static boolean isInvalidJoinTransition(int i10, int i11) {
            return ((i10 != 1 && i10 != 2 && i10 != 14) || i11 == 1 || i11 == 2 || i11 == 14 || i11 == 3 || i11 == 4 || i11 == 9 || i11 == 11) ? false : true;
        }

        private static boolean isPausedState(int i10) {
            return i10 == 4 || i10 == 7;
        }

        private static boolean isReadyState(int i10) {
            return i10 == 3 || i10 == 4 || i10 == 9;
        }

        private static boolean isRebufferingState(int i10) {
            return i10 == 6 || i10 == 7 || i10 == 10;
        }

        public void onEvents(Player player, AnalyticsListener.EventTime eventTime, boolean z10, long j10, boolean z11, int i10, boolean z12, boolean z13, @Nullable PlaybackException playbackException, @Nullable Exception exc, long j11, long j12, @Nullable Format format, @Nullable Format format2, @Nullable VideoSize videoSize) {
            if (j10 != -9223372036854775807L) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j10);
                this.isSeeking = true;
            }
            if (player.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z11) {
                this.isInterruptedByAd = false;
            }
            if (playbackException != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, playbackException));
                }
            } else if (player.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                Tracks currentTracks = player.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (format != null) {
                maybeUpdateVideoFormat(eventTime, format);
            }
            if (format2 != null) {
                maybeUpdateAudioFormat(eventTime, format2);
            }
            Format format3 = this.currentVideoFormat;
            if (format3 != null && format3.height == -1 && videoSize != null) {
                maybeUpdateVideoFormat(eventTime, format3.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build());
            }
            if (z13) {
                this.startedLoading = true;
            }
            if (z12) {
                this.audioUnderruns++;
            }
            this.droppedFrames += (long) i10;
            this.bandwidthTimeMs += j11;
            this.bandwidthBytes += j12;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(player);
            float f10 = player.getPlaybackParameters().speed;
            if (this.currentPlaybackState != iResolveNewPlaybackState || this.currentPlaybackSpeed != f10) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, z10 ? eventTime.eventPlaybackPositionMs : -9223372036854775807L);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f10;
            if (this.currentPlaybackState != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, eventTime);
            }
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j10) {
            List<long[]> list = this.mediaTimeHistory;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{j10, jArr[1] + ((long) ((j10 - jArr[0]) * this.currentPlaybackSpeed))};
        }

        private void maybeRecordAudioFormatTime(long j10) {
            Format format;
            int i10;
            if (this.currentPlaybackState == 3 && (format = this.currentAudioFormat) != null && (i10 = format.bitrate) != -1) {
                long j11 = (long) ((j10 - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j11;
                this.audioFormatBitrateTimeProduct += j11 * ((long) i10);
            }
            this.lastAudioFormatStartTimeMs = j10;
        }

        private void maybeRecordVideoFormatTime(long j10) {
            Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentVideoFormat) != null) {
                long j11 = (long) ((j10 - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed);
                int i10 = format.height;
                if (i10 != -1) {
                    this.videoFormatHeightTimeMs += j11;
                    this.videoFormatHeightTimeProduct += ((long) i10) * j11;
                }
                int i11 = format.bitrate;
                if (i11 != -1) {
                    this.videoFormatBitrateTimeMs += j11;
                    this.videoFormatBitrateTimeProduct += j11 * ((long) i11);
                }
            }
            this.lastVideoFormatStartTimeMs = j10;
        }

        private void maybeUpdateAudioFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            int i10;
            if (Util.areEqual(this.currentAudioFormat, format)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (format != null && this.initialAudioFormatBitrate == -1 && (i10 = format.bitrate) != -1) {
                this.initialAudioFormatBitrate = i10;
            }
            this.currentAudioFormat = format;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j10) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j11 = j10 - this.lastRebufferStartTimeMs;
                long j12 = this.maxRebufferTimeMs;
                if (j12 == -9223372036854775807L || j11 > j12) {
                    this.maxRebufferTimeMs = j11;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j10, long j11) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j11 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        List<long[]> list = this.mediaTimeHistory;
                        long j12 = list.get(list.size() - 1)[1];
                        if (j12 != j11) {
                            this.mediaTimeHistory.add(new long[]{j10, j12});
                        }
                    }
                }
                if (j11 != -9223372036854775807L) {
                    this.mediaTimeHistory.add(new long[]{j10, j11});
                } else {
                    if (this.mediaTimeHistory.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j10));
                }
            }
        }

        private void maybeUpdateVideoFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            int i10;
            int i11;
            if (Util.areEqual(this.currentVideoFormat, format)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (format != null) {
                if (this.initialVideoFormatHeight == -1 && (i11 = format.height) != -1) {
                    this.initialVideoFormatHeight = i11;
                }
                if (this.initialVideoFormatBitrate == -1 && (i10 = format.bitrate) != -1) {
                    this.initialVideoFormatBitrate = i10;
                }
            }
            this.currentVideoFormat = format;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private void updatePlaybackState(int i10, AnalyticsListener.EventTime eventTime) {
            Assertions.checkArgument(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j10 = eventTime.realtimeMs;
            long j11 = j10 - this.currentPlaybackStateStartTimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i11 = this.currentPlaybackState;
            jArr[i11] = jArr[i11] + j11;
            if (this.firstReportedTimeMs == -9223372036854775807L) {
                this.firstReportedTimeMs = j10;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i11, i10);
            this.hasBeenReady |= isReadyState(i10);
            this.hasEnded |= i10 == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i10)) {
                this.pauseCount++;
            }
            if (i10 == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i10)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = eventTime.realtimeMs;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i10 == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(eventTime.realtimeMs);
            this.currentPlaybackState = i10;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i10));
            }
        }

        public PlaybackStats build(boolean z10) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.playbackStateDurationsMs;
            List<long[]> list2 = this.mediaTimeHistory;
            if (z10) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i10 = this.currentPlaybackState;
                jArrCopyOf[i10] = jArrCopyOf[i10] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i11 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j10 = i11 != 0 ? -9223372036854775807L : jArr[2];
            int i12 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z10 ? this.videoFormatHistory : new ArrayList(this.videoFormatHistory);
            List arrayList3 = z10 ? this.audioFormatHistory : new ArrayList(this.audioFormatHistory);
            List arrayList4 = z10 ? this.playbackStateHistory : new ArrayList(this.playbackStateHistory);
            long j11 = this.firstReportedTimeMs;
            boolean z11 = this.isForeground;
            int i13 = !this.hasBeenReady ? 1 : 0;
            boolean z12 = this.hasEnded;
            int i14 = i11 ^ 1;
            int i15 = this.pauseCount;
            int i16 = this.pauseBufferCount;
            int i17 = this.seekCount;
            int i18 = this.rebufferCount;
            long j12 = this.maxRebufferTimeMs;
            boolean z13 = this.isAd;
            long[] jArr3 = jArr;
            long j13 = this.videoFormatHeightTimeMs;
            long j14 = this.videoFormatHeightTimeProduct;
            long j15 = this.videoFormatBitrateTimeMs;
            long j16 = this.videoFormatBitrateTimeProduct;
            long j17 = this.audioFormatTimeMs;
            long j18 = this.audioFormatBitrateTimeProduct;
            int i19 = this.initialVideoFormatHeight;
            int i20 = i19 == -1 ? 0 : 1;
            long j19 = this.initialVideoFormatBitrate;
            int i21 = j19 == -1 ? 0 : 1;
            long j20 = this.initialAudioFormatBitrate;
            int i22 = j20 == -1 ? 0 : 1;
            long j21 = this.bandwidthTimeMs;
            long j22 = this.bandwidthBytes;
            long j23 = this.droppedFrames;
            long j24 = this.audioUnderruns;
            int i23 = this.fatalErrorCount;
            return new PlaybackStats(1, jArr3, arrayList4, list, j11, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j10, i14, i15, i16, i17, i18, j12, z13 ? 1 : 0, arrayList2, arrayList3, j13, j14, j15, j16, j17, j18, i20, i21, i19, j19, i22, j20, j21, j22, j23, j24, i23 > 0 ? 1 : 0, i23, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onFinished(AnalyticsListener.EventTime eventTime, boolean z10, long j10) {
            int i10 = 11;
            if (this.currentPlaybackState != 11 && !z10) {
                i10 = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j10);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i10, eventTime);
        }

        public a(boolean z10, AnalyticsListener.EventTime eventTime) {
            List<PlaybackStats.EventTimeAndPlaybackState> listEmptyList;
            List<long[]> listEmptyList2;
            List<PlaybackStats.EventTimeAndFormat> listEmptyList3;
            List<PlaybackStats.EventTimeAndFormat> listEmptyList4;
            List<PlaybackStats.EventTimeAndException> listEmptyList5;
            List<PlaybackStats.EventTimeAndException> listEmptyList6;
            this.keepHistory = z10;
            if (z10) {
                listEmptyList = new ArrayList<>();
            } else {
                listEmptyList = Collections.emptyList();
            }
            this.playbackStateHistory = listEmptyList;
            if (z10) {
                listEmptyList2 = new ArrayList<>();
            } else {
                listEmptyList2 = Collections.emptyList();
            }
            this.mediaTimeHistory = listEmptyList2;
            if (z10) {
                listEmptyList3 = new ArrayList<>();
            } else {
                listEmptyList3 = Collections.emptyList();
            }
            this.videoFormatHistory = listEmptyList3;
            if (z10) {
                listEmptyList4 = new ArrayList<>();
            } else {
                listEmptyList4 = Collections.emptyList();
            }
            this.audioFormatHistory = listEmptyList4;
            if (z10) {
                listEmptyList5 = new ArrayList<>();
            } else {
                listEmptyList5 = Collections.emptyList();
            }
            this.fatalErrorHistory = listEmptyList5;
            if (z10) {
                listEmptyList6 = new ArrayList<>();
            } else {
                listEmptyList6 = Collections.emptyList();
            }
            this.nonFatalErrorHistory = listEmptyList6;
            boolean z11 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = -9223372036854775807L;
            this.maxRebufferTimeMs = -9223372036854775807L;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z11 = true;
            }
            this.isAd = z11;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private int resolveNewPlaybackState(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState == 2) {
                int i10 = this.currentPlaybackState;
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 14) {
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
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
        this.bandwidthTimeMs = i10;
        this.bandwidthBytes = j10;
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
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        super.onDrmSessionReleased(eventTime);
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
    public /* bridge */ /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        super.onPlayerError(eventTime, playbackException);
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
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = positionInfo.positionMs;
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
    public /* bridge */ /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        super.onVideoDisabled(eventTime, decoderCounters);
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
        this.videoSize = videoSize;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public /* bridge */ /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f10) {
        super.onVolumeChanged(eventTime, f10);
    }

    private Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime(AnalyticsListener.Events events, String str) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = null;
        boolean zBelongsToSession = false;
        for (int i10 = 0; i10 < events.size(); i10++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i10));
            boolean zBelongsToSession2 = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        Assertions.checkNotNull(eventTime);
        if (!zBelongsToSession && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.period.durationUs;
            }
            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
            long j10 = eventTime.realtimeMs;
            Timeline timeline = eventTime.timeline;
            int i11 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j10, timeline, i11, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), Util.usToMs(positionInWindowUs), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            zBelongsToSession = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(zBelongsToSession));
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i10 = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        Iterator<a> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i10] = it.next().build(false);
            i10++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    @Nullable
    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.sessionManager.getActiveSessionId();
        a aVar = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (aVar == null) {
            return null;
        }
        return aVar.build(false);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        ((a) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onInterruptedByAd();
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i10 = mediaLoadData.trackType;
        if (i10 == 2 || i10 == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i10 == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i10, long j10) {
        this.droppedFrames = i10;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        for (String str : this.playbackStatsTrackers.keySet()) {
            Pair<AnalyticsListener.EventTime, Boolean> pairFindBestEventTime = findBestEventTime(events, str);
            a aVar = this.playbackStatsTrackers.get(str);
            boolean zHasEvent = hasEvent(events, str, 11);
            boolean zHasEvent2 = hasEvent(events, str, 1018);
            boolean zHasEvent3 = hasEvent(events, str, 1011);
            boolean zHasEvent4 = hasEvent(events, str, 1000);
            boolean zHasEvent5 = hasEvent(events, str, 10);
            boolean z10 = hasEvent(events, str, 1003) || hasEvent(events, str, 1024);
            boolean zHasEvent6 = hasEvent(events, str, 1006);
            boolean zHasEvent7 = hasEvent(events, str, 1004);
            aVar.onEvents(player, (AnalyticsListener.EventTime) pairFindBestEventTime.first, ((Boolean) pairFindBestEventTime.second).booleanValue(), str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L, zHasEvent, zHasEvent2 ? this.droppedFrames : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? player.getPlayerError() : null, z10 ? this.nonFatalException : null, zHasEvent6 ? this.bandwidthTimeMs : 0L, zHasEvent6 ? this.bandwidthBytes : 0L, zHasEvent7 ? this.videoFormat : null, zHasEvent7 ? this.audioFormat : null, hasEvent(events, str, 25) ? this.videoSize : null);
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        this.nonFatalException = iOException;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        ((a) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onForeground();
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new a(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z10) {
        a aVar = (a) Assertions.checkNotNull(this.playbackStatsTrackers.remove(str));
        AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) Assertions.checkNotNull(this.sessionStartEventTimes.remove(str));
        aVar.onFinished(eventTime, z10, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : -9223372036854775807L);
        PlaybackStats playbackStatsBuild = aVar.build(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, playbackStatsBuild);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, playbackStatsBuild);
        }
    }

    public PlaybackStatsListener(boolean z10, @Nullable Callback callback) {
        this.callback = callback;
        this.keepHistory = z10;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new Timeline.Period();
        this.videoSize = VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i10) {
        if (events.contains(i10) && this.sessionManager.belongsToSession(events.getEventTime(i10), str)) {
            return true;
        }
        return false;
    }
}
