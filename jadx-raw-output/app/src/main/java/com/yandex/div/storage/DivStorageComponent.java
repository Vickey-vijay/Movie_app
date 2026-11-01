package com.yandex.div.storage;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import com.yandex.div.storage.util.LazyProvider;
import jj.a;

/* JADX INFO: compiled from: DivStorageComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface DivStorageComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivStorageComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatabaseOpenHelper createInternal$lambda$0(Context context, String str, int i10, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
            return new AndroidDatabaseOpenHelper(context, str, i10, createCallback, upgradeCallback);
        }

        public final InternalStorageComponent createInternal$div_storage_release(Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, a<? extends CardErrorTransformer> aVar, final a<DivParsingHistogramReporter> aVar2, String str) {
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new DatabaseOpenHelperProvider() { // from class: me.a
                @Override // com.yandex.div.storage.database.DatabaseOpenHelperProvider
                public final DatabaseOpenHelper provide(Context context2, String str2, int i10, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
                    return DivStorageComponent.Companion.createInternal$lambda$0(context2, str2, i10, createCallback, upgradeCallback);
                }
            }, str);
            LazyProvider lazyProvider = new LazyProvider(new bk.a<DivParsingHistogramProxy>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final DivParsingHistogramProxy invoke() {
                    final a<DivParsingHistogramReporter> aVar3 = aVar2;
                    return new DivParsingHistogramProxy(new bk.a<DivParsingHistogramReporter>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // bk.a
                        public final DivParsingHistogramReporter invoke() {
                            return aVar3.get();
                        }
                    });
                }
            });
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporterDelegate, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, parsingErrorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, templatesContainer, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(aVar, templatesContainer, parsingErrorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }

        public final DivStorageComponent create(Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, a<? extends CardErrorTransformer> aVar, a<DivParsingHistogramReporter> aVar2, String str) {
            return createInternal$div_storage_release(context, histogramReporterDelegate, histogramNameProvider, parsingErrorLogger, aVar, aVar2, str);
        }
    }

    RawJsonRepository getRawJsonRepository();
}
