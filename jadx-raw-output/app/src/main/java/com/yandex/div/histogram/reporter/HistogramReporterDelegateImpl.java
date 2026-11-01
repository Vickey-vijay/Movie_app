package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.histogram.util.HistogramUtils;
import ik.k;
import java.util.concurrent.TimeUnit;
import jj.a;
import mj.r;

/* JADX INFO: compiled from: HistogramReporterDelegateImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {
    private final HistogramCallTypeProvider histogramCallTypeProvider;
    private final HistogramRecordConfiguration histogramRecordConfig;
    private final a<HistogramRecorder> histogramRecorder;
    private final a<TaskExecutor> taskExecutor;

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportDuration(final String str, final long j10, String str2) {
        final String histogramCallType = str2 == null ? this.histogramCallTypeProvider.getHistogramCallType(str) : str2;
        if (HistogramUtils.INSTANCE.shouldRecordHistogram(histogramCallType, this.histogramRecordConfig)) {
            this.taskExecutor.get().post(new bk.a<r>() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl.reportDuration.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((HistogramRecorder) HistogramReporterDelegateImpl.this.histogramRecorder.get()).recordShortTimeHistogram(str + '.' + histogramCallType, k.e(j10, 1L), TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    public HistogramReporterDelegateImpl(a<HistogramRecorder> aVar, HistogramCallTypeProvider histogramCallTypeProvider, HistogramRecordConfiguration histogramRecordConfiguration, a<TaskExecutor> aVar2) {
        this.histogramRecorder = aVar;
        this.histogramCallTypeProvider = histogramCallTypeProvider;
        this.histogramRecordConfig = histogramRecordConfiguration;
        this.taskExecutor = aVar2;
    }
}
