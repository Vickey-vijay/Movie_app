package com.yandex.div.core;

import android.os.SystemClock;
import ck.i;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: DivCreationTracker.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCreationTracker {
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;
    private final AtomicBoolean isFirstViewCreate;

    public final void sendHistograms(long j10, long j11, HistogramReporter histogramReporter, String str) {
        if (j11 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.View.Create", j11 - j10, null, str, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }

    /* JADX INFO: compiled from: DivCreationTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j10 = this.contextCreatedTime;
        if (j10 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Context.Create", j10 - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    public final String getViewCreateCallType() {
        if (this.isFirstViewCreate.compareAndSet(true, false)) {
            return isColdViewCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        }
        return "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = Companion.getCurrentUptimeMillis();
    }

    public DivCreationTracker(long j10) {
        String str;
        this.contextCreationStarted = j10;
        if (isColdContextCreate.compareAndSet(true, false)) {
            str = "Cold";
        } else {
            str = "Cool";
        }
        this.contextCreateCallType = str;
        this.isFirstViewCreate = new AtomicBoolean(true);
    }
}
