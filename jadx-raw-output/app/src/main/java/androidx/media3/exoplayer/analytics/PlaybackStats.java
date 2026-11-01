package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    public static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;

        @Nullable
        public final Format format;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndFormat.class != obj.getClass()) {
                return false;
            }
            EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
            if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                return false;
            }
            Format format = this.format;
            Format format2 = eventTimeAndFormat.format;
            if (format != null) {
                return format.equals(format2);
            }
            return format2 == null;
        }

        public int hashCode() {
            int iHashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return iHashCode + (format != null ? format.hashCode() : 0);
        }

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i10) {
            this.eventTime = eventTime;
            this.playbackState = i10;
        }
    }

    public PlaybackStats(int i10, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j10, int i11, int i12, int i13, int i14, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j13, long j14, long j15, long j16, long j17, long j18, int i21, int i22, int i23, long j19, int i24, long j20, long j21, long j22, long j23, long j24, int i25, int i26, int i27, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i10;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j10;
        this.foregroundPlaybackCount = i11;
        this.abandonedBeforeReadyCount = i12;
        this.endedCount = i13;
        this.backgroundJoiningCount = i14;
        this.totalValidJoinTimeMs = j11;
        this.validJoinTimeCount = i15;
        this.totalPauseCount = i16;
        this.totalPauseBufferCount = i17;
        this.totalSeekCount = i18;
        this.totalRebufferCount = i19;
        this.maxRebufferTimeMs = j12;
        this.adPlaybackCount = i20;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j13;
        this.totalVideoFormatHeightTimeProduct = j14;
        this.totalVideoFormatBitrateTimeMs = j15;
        this.totalVideoFormatBitrateTimeProduct = j16;
        this.totalAudioFormatTimeMs = j17;
        this.totalAudioFormatBitrateTimeProduct = j18;
        this.initialVideoFormatHeightCount = i21;
        this.initialVideoFormatBitrateCount = i22;
        this.totalInitialVideoFormatHeight = i23;
        this.totalInitialVideoFormatBitrate = j19;
        this.initialAudioFormatBitrateCount = i24;
        this.totalInitialAudioFormatBitrate = j20;
        this.totalBandwidthTimeMs = j21;
        this.totalBandwidthBytes = j22;
        this.totalDroppedFrames = j23;
        this.totalAudioUnderruns = j24;
        this.fatalErrorPlaybackCount = i25;
        this.fatalErrorCount = i26;
        this.nonFatalErrorCount = i27;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0111  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130 A[SYNTHETIC] */
    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        int i10;
        int i11;
        long j10;
        long j11;
        int i12 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr.length;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long jMax = -9223372036854775807L;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        long jMin = -9223372036854775807L;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j22 = -9223372036854775807L;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j23 = -1;
        int i27 = 0;
        long j24 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 0;
        while (i15 < length) {
            PlaybackStats playbackStats = playbackStatsArr[i15];
            int i32 = i13 + playbackStats.playbackCount;
            for (int i33 = 0; i33 < i12; i33++) {
                jArr[i33] = jArr[i33] + playbackStats.playbackStateDurationsMs[i33];
            }
            if (jMin == -9223372036854775807L) {
                jMin = playbackStats.firstReportedTimeMs;
                i10 = length;
            } else {
                i10 = length;
                long j25 = playbackStats.firstReportedTimeMs;
                if (j25 != -9223372036854775807L) {
                    jMin = Math.min(jMin, j25);
                }
            }
            i14 += playbackStats.foregroundPlaybackCount;
            i16 += playbackStats.abandonedBeforeReadyCount;
            i17 += playbackStats.endedCount;
            i18 += playbackStats.backgroundJoiningCount;
            if (j22 == -9223372036854775807L) {
                j22 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j26 = playbackStats.totalValidJoinTimeMs;
                if (j26 != -9223372036854775807L) {
                    j22 += j26;
                }
            }
            i19 += playbackStats.validJoinTimeCount;
            i20 += playbackStats.totalPauseCount;
            i21 += playbackStats.totalPauseBufferCount;
            i22 += playbackStats.totalSeekCount;
            i23 += playbackStats.totalRebufferCount;
            if (jMax == -9223372036854775807L) {
                jMax = playbackStats.maxRebufferTimeMs;
            } else {
                long j27 = playbackStats.maxRebufferTimeMs;
                if (j27 != -9223372036854775807L) {
                    jMax = Math.max(jMax, j27);
                }
            }
            i24 += playbackStats.adPlaybackCount;
            j12 += playbackStats.totalVideoFormatHeightTimeMs;
            j13 += playbackStats.totalVideoFormatHeightTimeProduct;
            j14 += playbackStats.totalVideoFormatBitrateTimeMs;
            j15 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j16 += playbackStats.totalAudioFormatTimeMs;
            j17 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i25 += playbackStats.initialVideoFormatHeightCount;
            i26 += playbackStats.initialVideoFormatBitrateCount;
            int i34 = i30;
            if (i34 == -1) {
                i34 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i35 = playbackStats.totalInitialVideoFormatHeight;
                if (i35 != -1) {
                    i30 = i34 + i35;
                }
                if (j23 == -1) {
                    i11 = i32;
                    j23 = playbackStats.totalInitialVideoFormatBitrate;
                } else {
                    i11 = i32;
                    j10 = playbackStats.totalInitialVideoFormatBitrate;
                    if (j10 != -1) {
                        j23 += j10;
                    }
                }
                i27 += playbackStats.initialAudioFormatBitrateCount;
                if (j24 == -1) {
                    j24 = playbackStats.totalInitialAudioFormatBitrate;
                } else {
                    j11 = playbackStats.totalInitialAudioFormatBitrate;
                    if (j11 != -1) {
                        j24 += j11;
                    }
                }
                j18 += playbackStats.totalBandwidthTimeMs;
                j19 += playbackStats.totalBandwidthBytes;
                j20 += playbackStats.totalDroppedFrames;
                j21 += playbackStats.totalAudioUnderruns;
                i28 += playbackStats.fatalErrorPlaybackCount;
                i29 += playbackStats.fatalErrorCount;
                i31 += playbackStats.nonFatalErrorCount;
                i15++;
                i13 = i11;
                length = i10;
                i12 = 16;
            }
            i30 = i34;
            if (j23 == -1) {
                i11 = i32;
                j23 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                i11 = i32;
                j10 = playbackStats.totalInitialVideoFormatBitrate;
                if (j10 != -1) {
                    j23 += j10;
                }
            }
            i27 += playbackStats.initialAudioFormatBitrateCount;
            if (j24 == -1) {
                j24 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                j11 = playbackStats.totalInitialAudioFormatBitrate;
                if (j11 != -1) {
                    j24 += j11;
                }
            }
            j18 += playbackStats.totalBandwidthTimeMs;
            j19 += playbackStats.totalBandwidthBytes;
            j20 += playbackStats.totalDroppedFrames;
            j21 += playbackStats.totalAudioUnderruns;
            i28 += playbackStats.fatalErrorPlaybackCount;
            i29 += playbackStats.fatalErrorCount;
            i31 += playbackStats.nonFatalErrorCount;
            i15++;
            i13 = i11;
            length = i10;
            i12 = 16;
        }
        return new PlaybackStats(i13, jArr, Collections.emptyList(), Collections.emptyList(), jMin, i14, i16, i17, i18, j22, i19, i20, i21, i22, i23, jMax, i24, Collections.emptyList(), Collections.emptyList(), j12, j13, j14, j15, j16, j17, i25, i26, i30, j23, i27, j24, j18, j19, j20, j21, i28, i29, i31, Collections.emptyList(), Collections.emptyList());
    }

    public float getAbandonedBeforeReadyRatio() {
        int i10 = this.abandonedBeforeReadyCount;
        int i11 = this.playbackCount;
        int i12 = this.foregroundPlaybackCount;
        int i13 = i10 - (i11 - i12);
        if (i12 == 0) {
            return 0.0f;
        }
        return i13 / i12;
    }

    public float getEndedRatio() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.endedCount / i10;
    }

    public float getFatalErrorRatio() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i10;
    }

    public int getMeanAudioFormatBitrate() {
        long j10 = this.totalAudioFormatTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j10);
    }

    public int getMeanBandwidth() {
        long j10 = this.totalBandwidthTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j10);
    }

    public long getMeanElapsedTimeMs() {
        if (this.playbackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalElapsedTimeMs() / ((long) this.playbackCount);
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i10 = this.initialAudioFormatBitrateCount;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / ((long) i10));
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i10 = this.initialVideoFormatBitrateCount;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / ((long) i10));
    }

    public int getMeanInitialVideoFormatHeight() {
        int i10 = this.initialVideoFormatHeightCount;
        if (i10 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i10;
    }

    public long getMeanJoinTimeMs() {
        int i10 = this.validJoinTimeCount;
        if (i10 == 0) {
            return -9223372036854775807L;
        }
        return this.totalValidJoinTimeMs / ((long) i10);
    }

    public float getMeanNonFatalErrorCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i10;
    }

    public float getMeanPauseBufferCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i10;
    }

    public float getMeanPauseCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i10;
    }

    public long getMeanPausedTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalPausedTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayAndWaitTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalPlayAndWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalPlayTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanRebufferCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i10;
    }

    public long getMeanRebufferTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalRebufferTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanSeekCount() {
        int i10 = this.foregroundPlaybackCount;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i10;
    }

    public long getMeanSeekTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalSeekTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanSingleRebufferTimeMs() {
        if (this.totalRebufferCount == 0) {
            return -9223372036854775807L;
        }
        return (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / ((long) this.totalRebufferCount);
    }

    public long getMeanSingleSeekTimeMs() {
        if (this.totalSeekCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalSeekTimeMs() / ((long) this.totalSeekCount);
    }

    public int getMeanVideoFormatBitrate() {
        long j10 = this.totalVideoFormatBitrateTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j10);
    }

    public int getMeanVideoFormatHeight() {
        long j10 = this.totalVideoFormatHeightTimeMs;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j10);
    }

    public long getMeanWaitTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMediaTimeMsAtRealtimeMs(long j10) {
        if (this.mediaTimeHistory.isEmpty()) {
            return -9223372036854775807L;
        }
        int i10 = 0;
        while (i10 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i10)[0] <= j10) {
            i10++;
        }
        if (i10 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i10 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i11 = i10 - 1;
        long j11 = this.mediaTimeHistory.get(i11)[0];
        long j12 = this.mediaTimeHistory.get(i11)[1];
        long j13 = this.mediaTimeHistory.get(i10)[0];
        long j14 = this.mediaTimeHistory.get(i10)[1];
        long j15 = j13 - j11;
        if (j15 == 0) {
            return j12;
        }
        return j12 + ((long) ((j14 - j12) * ((j10 - j11) / j15)));
    }

    public int getPlaybackStateAtTime(long j10) {
        int i10 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j10) {
                break;
            }
            i10 = eventTimeAndPlaybackState.playbackState;
        }
        return i10;
    }

    public long getPlaybackStateDurationMs(int i10) {
        return this.playbackStateDurationsMs[i10];
    }

    public long getTotalElapsedTimeMs() {
        long j10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            j10 += this.playbackStateDurationsMs[i10];
        }
        return j10;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
