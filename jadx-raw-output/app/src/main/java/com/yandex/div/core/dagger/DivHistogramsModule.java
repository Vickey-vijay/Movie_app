package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;

/* JADX INFO: compiled from: DivHistogramsModule.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivHistogramsModule {
    public static final DivHistogramsModule INSTANCE = new DivHistogramsModule();

    private DivHistogramsModule() {
    }

    public final HistogramReporter provideHistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        return DivHistogramsModuleKt.createHistogramReporter(histogramReporterDelegate);
    }
}
