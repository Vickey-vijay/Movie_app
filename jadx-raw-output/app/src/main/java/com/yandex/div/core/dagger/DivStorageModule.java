package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.util.LazyProvider;

/* JADX INFO: compiled from: DivStorageModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivStorageModule {
    public static final DivStorageModule INSTANCE = new DivStorageModule();

    private DivStorageModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingHistogramReporter provideDivStorageComponent$lambda$0(DivParsingHistogramReporter divParsingHistogramReporter) {
        return divParsingHistogramReporter;
    }

    public final DivStorageComponent provideDivStorageComponent(ExternalOptional<DivStorageComponent> externalOptional, Context context, HistogramReporterDelegate histogramReporterDelegate, final DivParsingHistogramReporter divParsingHistogramReporter) {
        if (externalOptional.getOptional().c()) {
            return externalOptional.getOptional().b();
        }
        return DivStorageComponent.Companion.create(context, (92 & 2) != 0 ? HistogramReporterDelegate.NoOp.INSTANCE : histogramReporterDelegate, (92 & 4) != 0 ? null : null, (92 & 8) != 0 ? ParsingErrorLogger.LOG : null, (92 & 16) == 0 ? null : null, (92 & 32) != 0 ? new LazyProvider(new bk.a<DivParsingHistogramReporter>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$create$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final DivParsingHistogramReporter invoke() {
                return DivParsingHistogramReporter.Companion.getDEFAULT();
            }
        }) : new jj.a() { // from class: com.yandex.div.core.dagger.c
            @Override // jj.a
            public final Object get() {
                return DivStorageModule.provideDivStorageComponent$lambda$0(divParsingHistogramReporter);
            }
        }, (92 & 64) != 0 ? "" : null);
    }
}
