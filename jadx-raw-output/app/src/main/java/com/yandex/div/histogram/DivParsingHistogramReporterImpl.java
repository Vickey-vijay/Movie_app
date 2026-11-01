package com.yandex.div.histogram;

import bk.a;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DivParsingHistogramReporter.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {
    private final a<Executor> calculateSizeExecutor;
    private final a<HistogramReporter> histogramReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(a<? extends HistogramReporter> aVar, a<? extends Executor> aVar2) {
        this.histogramReporter = aVar;
        this.calculateSizeExecutor = aVar2;
    }
}
