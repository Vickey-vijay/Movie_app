package io.bidmachine.media3.exoplayer.analytics;

import android.util.Base64;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import m5.p;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final p<String> DEFAULT_SESSION_ID_GENERATOR = new p() { // from class: dg.t1
        @Override // m5.p
        public final Object get() {
            return DefaultPlaybackSessionManager.generateDefaultSessionId();
        }
    };
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;

    @Nullable
    private String currentSessionId;
    private Timeline currentTimeline;
    private long lastRemovedCurrentWindowSequenceNumber;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final p<String> sessionIdGenerator;
    private final HashMap<String, a> sessions;
    private final Timeline.Window window;

    public final class a {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public boolean belongsToSession(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i10 == this.windowIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
            if (mediaPeriodId2 == null) {
                return !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber;
            }
            return mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
        }

        public a(String str, @Nullable int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i10;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            long j10 = this.windowSequenceNumber;
            if (j10 == -1) {
                return false;
            }
            if (mediaPeriodId.windowSequenceNumber > j10) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!mediaPeriodId2.isAd()) {
                int i10 = eventTime.mediaPeriodId.nextAdGroupIndex;
                return i10 == -1 || i10 > this.adMediaPeriodId.adGroupIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            int i11 = mediaPeriodId3.adGroupIndex;
            int i12 = mediaPeriodId3.adIndexInAdGroup;
            MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
            int i13 = mediaPeriodId4.adGroupIndex;
            if (i11 <= i13) {
                return i11 == i13 && i12 > mediaPeriodId4.adIndexInAdGroup;
            }
            return true;
        }

        public void maybeSetWindowSequenceNumber(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber != -1 || i10 != this.windowIndex || mediaPeriodId == null || mediaPeriodId.windowSequenceNumber < DefaultPlaybackSessionManager.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i10) {
            if (i10 >= timeline.getWindowCount()) {
                if (i10 >= timeline2.getWindowCount()) {
                    return -1;
                }
                return i10;
            }
            timeline.getWindow(i10, DefaultPlaybackSessionManager.this.window);
            for (int i11 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i11 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i11++) {
                int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i11));
                if (indexOfPeriod != -1) {
                    return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                }
            }
            return -1;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        a aVar = this.sessions.get(str);
        if (aVar == null) {
            return false;
        }
        aVar.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return aVar.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        String str = this.currentSessionId;
        if (str != null) {
            clearCurrentSession((a) Assertions.checkNotNull(this.sessions.get(str)));
        }
        Iterator<a> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    @Nullable
    public synchronized String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i10) {
        Assertions.checkNotNull(this.listener);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    boolean zEquals = next.sessionId.equals(this.currentSessionId);
                    boolean z11 = z10 && zEquals && next.isActive;
                    if (zEquals) {
                        clearCurrentSession(next);
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, z11);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        Assertions.checkNotNull(this.listener);
        Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        Iterator<a> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline) || next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    if (next.sessionId.equals(this.currentSessionId)) {
                        clearCurrentSession(next);
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    public DefaultPlaybackSessionManager(p<String> pVar) {
        this.sessionIdGenerator = pVar;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
        this.lastRemovedCurrentWindowSequenceNumber = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        a aVar = this.sessions.get(this.currentSessionId);
        return (aVar == null || aVar.windowSequenceNumber == -1) ? this.lastRemovedCurrentWindowSequenceNumber + 1 : aVar.windowSequenceNumber;
    }

    private a getOrAddSession(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.sessions.values()) {
            aVar2.maybeSetWindowSequenceNumber(i10, mediaPeriodId);
            if (aVar2.belongsToSession(i10, mediaPeriodId)) {
                long j11 = aVar2.windowSequenceNumber;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) Util.castNonNull(aVar)).adMediaPeriodId != null && aVar2.adMediaPeriodId != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.sessionIdGenerator.get();
        a aVar3 = new a(str, i10, mediaPeriodId);
        this.sessions.put(str, aVar3);
        return aVar3;
    }

    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            String str = this.currentSessionId;
            if (str != null) {
                clearCurrentSession((a) Assertions.checkNotNull(this.sessions.get(str)));
                return;
            }
            return;
        }
        a aVar = this.sessions.get(this.currentSessionId);
        a orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (aVar != null && aVar.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && aVar.adMediaPeriodId != null && aVar.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && aVar.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    @Override // io.bidmachine.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.EventTime eventTime2;
        a aVar;
        Assertions.checkNotNull(this.listener);
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            if (mediaPeriodId.windowSequenceNumber < getMinWindowSequenceNumber()) {
                return;
            }
            a aVar2 = this.sessions.get(this.currentSessionId);
            if (aVar2 != null && aVar2.windowSequenceNumber == -1 && aVar2.windowIndex != eventTime.windowIndex) {
                return;
            }
        }
        a orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.currentSessionId == null) {
            this.currentSessionId = orAddSession.sessionId;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        if (mediaPeriodId2 != null && mediaPeriodId2.isAd()) {
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            MediaSource.MediaPeriodId mediaPeriodId4 = new MediaSource.MediaPeriodId(mediaPeriodId3.periodUid, mediaPeriodId3.windowSequenceNumber, mediaPeriodId3.adGroupIndex);
            a orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId4);
            if (!orAddSession2.isCreated) {
                orAddSession2.isCreated = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                this.listener.onSessionCreated(new AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId4, Math.max(0L, Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.sessionId);
            }
        }
        if (orAddSession.isCreated) {
            eventTime2 = eventTime;
            aVar = orAddSession;
        } else {
            aVar = orAddSession;
            aVar.isCreated = true;
            eventTime2 = eventTime;
            this.listener.onSessionCreated(eventTime2, aVar.sessionId);
        }
        if (aVar.sessionId.equals(this.currentSessionId) && !aVar.isActive) {
            aVar.isActive = true;
            this.listener.onSessionActive(eventTime2, aVar.sessionId);
        }
    }

    private void clearCurrentSession(a aVar) {
        if (aVar.windowSequenceNumber != -1) {
            this.lastRemovedCurrentWindowSequenceNumber = aVar.windowSequenceNumber;
        }
        this.currentSessionId = null;
    }
}
