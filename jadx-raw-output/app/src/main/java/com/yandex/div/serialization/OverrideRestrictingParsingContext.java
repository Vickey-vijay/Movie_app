package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes2.dex */
final class OverrideRestrictingParsingContext implements ParsingContext, ParsingContextWrapper {
    private final ParsingContext baseContext;

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return false;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public ParsingErrorLogger getLogger() {
        return this.baseContext.getLogger();
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    public OverrideRestrictingParsingContext(ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }
}
