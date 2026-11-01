package com.yandex.div.storage.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: HistogramRecorder.kt */
/* JADX INFO: loaded from: classes7.dex */
public class HistogramRecorder {
    private final HistogramNameProvider histogramNameProvider;
    private final HistogramReporter histogramReporter;
    private final CopyOnWriteArraySet<String> recordedHistograms = new CopyOnWriteArraySet<>();

    public HistogramRecorder(HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider) {
        this.histogramNameProvider = histogramNameProvider;
        this.histogramReporter = new HistogramReporter(histogramReporterDelegate);
    }
}
