package com.yandex.div.storage.templates;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import jj.a;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: TemplatesContainer.kt */
/* JADX INFO: loaded from: classes9.dex */
public class TemplatesContainer {
    private final DivStorage divStorage;
    private final ParsingErrorLogger errorLogger;
    private final Map<String, Object> groupTemplateReferences;
    private final String histogramComponentName;
    private final HistogramNameProvider histogramNameProvider;
    private final HistogramRecorder histogramRecorder;
    private final g messageDigest$delegate;
    private final a<DivParsingHistogramProxy> parsingHistogramProxy;
    private final Map<String, DivParsingEnvironment> templateEnvironments;
    private final CommonTemplatesPool templatesPool;

    public TemplatesContainer(DivStorage divStorage, ParsingErrorLogger parsingErrorLogger, HistogramRecorder histogramRecorder, a<DivParsingHistogramProxy> aVar, HistogramNameProvider histogramNameProvider) {
        String componentName;
        this.divStorage = divStorage;
        this.errorLogger = parsingErrorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.histogramNameProvider = histogramNameProvider;
        if (histogramNameProvider != null) {
            componentName = histogramNameProvider.getComponentName();
        } else {
            componentName = null;
        }
        String str = componentName;
        this.histogramComponentName = str;
        this.templatesPool = new CommonTemplatesPool(divStorage, parsingErrorLogger, str, histogramRecorder, aVar);
        this.groupTemplateReferences = new LinkedHashMap();
        this.templateEnvironments = new LinkedHashMap();
        this.messageDigest$delegate = b.a(new bk.a<MessageDigest>() { // from class: com.yandex.div.storage.templates.TemplatesContainer$messageDigest$2
            {
                super(0);
            }

            @Override // bk.a
            public final MessageDigest invoke() {
                try {
                    return MessageDigest.getInstance(SameMD5.TAG);
                } catch (NoSuchAlgorithmException e10) {
                    this.this$0.errorLogger.logError(new IllegalStateException("Storage cannot work with templates!", e10));
                    return null;
                }
            }
        });
    }
}
