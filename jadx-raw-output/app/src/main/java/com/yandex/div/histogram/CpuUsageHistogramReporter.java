package com.yandex.div.histogram;

import androidx.annotation.AnyThread;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;

/* JADX INFO: compiled from: CpuUsageHistogramReporter.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface CpuUsageHistogramReporter {

    /* JADX INFO: compiled from: CpuUsageHistogramReporter.kt */
    public static final class NoOp implements CpuUsageHistogramReporter {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void startReporting$lambda$0() {
        }

        @Override // com.yandex.div.histogram.CpuUsageHistogramReporter
        public Cancelable startReporting(String str, int i10) {
            return new Cancelable() { // from class: ee.a
                @Override // com.yandex.div.histogram.util.Cancelable
                public final void cancel() {
                    CpuUsageHistogramReporter.NoOp.startReporting$lambda$0();
                }
            };
        }
    }

    @AnyThread
    Cancelable startReporting(String str, int i10);
}
