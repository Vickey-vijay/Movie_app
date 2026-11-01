package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;

/* JADX INFO: compiled from: DivHistogramsModule.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivHistogramsModuleKt {
    public static final HistogramReporter createHistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        return new HistogramReporter(histogramReporterDelegate);
    }

    public static final HistogramReporterDelegate createHistogramReporterDelegate(HistogramConfiguration histogramConfiguration, jj.a<HistogramRecorder> aVar, jj.a<HistogramColdTypeChecker> aVar2) {
        if (!histogramConfiguration.isReportingEnabled()) {
            return HistogramReporterDelegate.NoOp.INSTANCE;
        }
        return new HistogramReporterDelegateImpl(aVar, new HistogramCallTypeProvider(new DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(aVar2)), histogramConfiguration, histogramConfiguration.getTaskExecutorProvider());
    }
}
