package com.yandex.div.core.dagger;

import ck.p;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.util.DoubleCheckProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: DivKitHistogramsModule.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivKitHistogramsModule {
    public static final DivKitHistogramsModule INSTANCE = new DivKitHistogramsModule();

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$1, reason: invalid class name */
    /* JADX INFO: compiled from: DivKitHistogramsModule.kt */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements bk.a<HistogramReporter> {
        public AnonymousClass1(Object obj) {
            super(0, obj, jj.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final HistogramReporter invoke() {
            return (HistogramReporter) ((jj.a) this.receiver).get();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$2, reason: invalid class name */
    /* JADX INFO: compiled from: DivKitHistogramsModule.kt */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements bk.a<Executor> {
        public AnonymousClass2(Object obj) {
            super(0, obj, jj.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // bk.a
        public final Executor invoke() {
            return (Executor) ((jj.a) this.receiver).get();
        }
    }

    private DivKitHistogramsModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideCalculateSizeExecutor$lambda$1() {
        return new Executor() { // from class: com.yandex.div.core.dagger.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1$lambda$0(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideCalculateSizeExecutor$lambda$1$lambda$0(Runnable runnable) {
    }

    private final jj.a<HistogramReporter> provideHistogramReporter(final HistogramReporterDelegate histogramReporterDelegate) {
        return new DoubleCheckProvider(new bk.a<HistogramReporter>() { // from class: com.yandex.div.core.dagger.DivKitHistogramsModule.provideHistogramReporter.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final HistogramReporter invoke() {
                return DivHistogramsModuleKt.createHistogramReporter(histogramReporterDelegate);
            }
        });
    }

    private final jj.a<Executor> provideCalculateSizeExecutor(HistogramConfiguration histogramConfiguration, jj.a<ExecutorService> aVar) {
        if (histogramConfiguration.isSizeRecordingEnabled()) {
            p.h(aVar, "null cannot be cast to non-null type javax.inject.Provider<java.util.concurrent.Executor>");
            return aVar;
        }
        return new jj.a() { // from class: com.yandex.div.core.dagger.a
            @Override // jj.a
            public final Object get() {
                return DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1();
            }
        };
    }

    public final DivParsingHistogramReporter provideDivParsingHistogramReporter(HistogramConfiguration histogramConfiguration, jj.a<HistogramReporterDelegate> aVar, jj.a<ExecutorService> aVar2) {
        if (histogramConfiguration.isReportingEnabled()) {
            return new DivParsingHistogramReporterImpl(new AnonymousClass1(provideHistogramReporter(aVar.get())), new AnonymousClass2(provideCalculateSizeExecutor(histogramConfiguration, aVar2)));
        }
        return DivParsingHistogramReporter.Companion.getDEFAULT();
    }

    public final HistogramReporterDelegate provideHistogramReporterDelegate(HistogramConfiguration histogramConfiguration, jj.a<HistogramRecorder> aVar, jj.a<HistogramColdTypeChecker> aVar2) {
        if (histogramConfiguration.isReportingEnabled()) {
            return DivHistogramsModuleKt.createHistogramReporterDelegate(histogramConfiguration, aVar, aVar2);
        }
        return HistogramReporterDelegate.NoOp.INSTANCE;
    }
}
