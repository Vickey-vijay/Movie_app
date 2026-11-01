package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes2.dex */
final class ErrorCollectingParsingContext implements ParsingContext, ParsingContextWrapper {
    private final ParsingContext baseContext;
    private final List<Exception> errors = new ArrayList();
    private final ParsingErrorLogger logger = new ParsingErrorLogger() { // from class: com.yandex.div.serialization.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ErrorCollectingParsingContext.logger$lambda$0(this.f45865a, exc);
        }
    };

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return this.baseContext.getAllowPropertyOverride();
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logger$lambda$0(ErrorCollectingParsingContext errorCollectingParsingContext, Exception exc) {
        errorCollectingParsingContext.errors.add(exc);
        errorCollectingParsingContext.getBaseContext().getLogger().logError(exc);
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    public final List<Exception> getErrors() {
        return this.errors;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    public ErrorCollectingParsingContext(ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }
}
