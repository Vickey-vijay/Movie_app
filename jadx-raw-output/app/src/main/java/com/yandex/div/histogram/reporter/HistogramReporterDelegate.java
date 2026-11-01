package com.yandex.div.histogram.reporter;

/* JADX INFO: compiled from: HistogramReporterDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface HistogramReporterDelegate {

    /* JADX INFO: compiled from: HistogramReporterDelegate.kt */
    public static final class NoOp implements HistogramReporterDelegate {
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(String str, long j10, String str2) {
        }
    }

    void reportDuration(String str, long j10, String str2);
}
