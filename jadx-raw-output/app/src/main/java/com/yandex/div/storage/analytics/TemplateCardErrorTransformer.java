package com.yandex.div.storage.analytics;

import ck.i;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;

/* JADX INFO: compiled from: TemplateCardErrorTransformer.kt */
/* JADX INFO: loaded from: classes4.dex */
public class TemplateCardErrorTransformer implements CardErrorTransformer {
    public static final Companion Companion = new Companion(null);
    private final ParsingErrorLogger internalLogger;
    private final TemplatesContainer templateContainer;

    /* JADX INFO: compiled from: TemplateCardErrorTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public TemplateCardErrorTransformer(TemplatesContainer templatesContainer, ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.internalLogger = parsingErrorLogger;
    }
}
