package com.yandex.div.histogram.reporter;

import androidx.annotation.AnyThread;
import com.yandex.div.histogram.HistogramFilter;

/* JADX INFO: compiled from: HistogramReporter.kt */
/* JADX INFO: loaded from: classes10.dex */
@AnyThread
public class HistogramReporter {
    private final HistogramReporterDelegate histogramReporterDelegate;

    public void reportDuration(String str, long j10, String str2, String str3, HistogramFilter histogramFilter) {
        if (histogramFilter.report(null)) {
            this.histogramReporterDelegate.reportDuration(str, j10, str3);
        }
        if (str2 != null) {
            String str4 = str2 + '.' + str;
            if (histogramFilter.report(str2)) {
                this.histogramReporterDelegate.reportDuration(str4, j10, str3);
            }
        }
    }

    public static /* synthetic */ void reportDuration$default(HistogramReporter histogramReporter, String str, long j10, String str2, String str3, HistogramFilter histogramFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        histogramReporter.reportDuration(str, j10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? HistogramFilter.Companion.getON() : histogramFilter);
    }

    public HistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        this.histogramReporterDelegate = histogramReporterDelegate;
    }
}
