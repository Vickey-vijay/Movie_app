package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div2.DivTemplate;
import java.util.concurrent.ConcurrentHashMap;
import jj.a;

/* JADX INFO: compiled from: TemplatesContainer.kt */
/* JADX INFO: loaded from: classes2.dex */
final class CommonTemplatesPool {
    private final ConcurrentHashMap<String, DivTemplate> commonTemplates = new ConcurrentHashMap<>();
    private final DivStorage divStorage;
    private final DivParsingEnvironment env;
    private final String histogramComponent;
    private final HistogramRecorder histogramRecorder;
    private final a<DivParsingHistogramProxy> parsingHistogramProxy;

    public CommonTemplatesPool(DivStorage divStorage, ParsingErrorLogger parsingErrorLogger, String str, HistogramRecorder histogramRecorder, a<DivParsingHistogramProxy> aVar) {
        this.divStorage = divStorage;
        this.histogramComponent = str;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.env = TemplatesContainerKt.createEmptyEnv(parsingErrorLogger);
    }
}
