package com.yandex.div.serialization;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.JsonParserComponent;

/* JADX INFO: compiled from: BuiltInParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BuiltInParserKt {
    private static final ParsingContext builtInParsingContext = new ParsingContext() { // from class: com.yandex.div.serialization.BuiltInParserKt$builtInParsingContext$1
        private final TemplateProvider<JsonTemplate<?>> templates = TemplateProvider.Companion.empty();
        private final ParsingErrorLogger logger = ParsingErrorLogger.LOG;

        @Override // com.yandex.div.serialization.ParsingContext
        public ParsingErrorLogger getLogger() {
            return this.logger;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        public TemplateProvider<JsonTemplate<?>> getTemplates() {
            return this.templates;
        }
    };
    private static final JsonParserComponent builtInParserComponent = new JsonParserComponent();

    public static final JsonParserComponent getBuiltInParserComponent() {
        return builtInParserComponent;
    }

    public static final ParsingContext getBuiltInParsingContext() {
        return builtInParsingContext;
    }
}
