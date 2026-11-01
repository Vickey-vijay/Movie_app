package com.yandex.div.internal.parser;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;

/* JADX INFO: compiled from: ParsingEnvironmentImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ParsingEnvironmentImpl implements ParsingEnvironment {
    private final ParsingErrorLogger logger;
    private final TemplateProvider<JsonTemplate<?>> templates;

    @Override // com.yandex.div.serialization.ParsingContext
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public TemplateProvider<JsonTemplate<?>> getTemplates() {
        return this.templates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParsingEnvironmentImpl(TemplateProvider<? extends JsonTemplate<?>> templateProvider, ParsingErrorLogger parsingErrorLogger) {
        this.templates = templateProvider;
        this.logger = parsingErrorLogger;
    }
}
