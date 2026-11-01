package com.yandex.div.storage;

import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jj.a;

/* JADX INFO: compiled from: DivDataRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivDataRepositoryImpl implements DivDataRepository {
    private final CardErrorLoggerFactory cardErrorFactory;
    private final a<DivParsingHistogramProxy> divParsingHistogramProxy;
    private final DivStorage divStorage;
    private final HistogramNameProvider histogramNameProvider;
    private final HistogramRecorder histogramRecorder;
    private final TemplatesContainer templateContainer;
    private final Map<String, Object> inMemoryData = new LinkedHashMap();
    private Map<String, ? extends List<Object>> cardsWithErrors = kotlin.collections.a.j();

    public DivDataRepositoryImpl(DivStorage divStorage, TemplatesContainer templatesContainer, HistogramRecorder histogramRecorder, HistogramNameProvider histogramNameProvider, a<DivParsingHistogramProxy> aVar, CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = divStorage;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = histogramRecorder;
        this.histogramNameProvider = histogramNameProvider;
        this.divParsingHistogramProxy = aVar;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }
}
