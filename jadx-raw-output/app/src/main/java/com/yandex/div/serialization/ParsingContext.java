package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ParsingContext {
    default boolean getAllowPropertyOverride() {
        return true;
    }

    ParsingErrorLogger getLogger();

    TemplateProvider<EntityTemplate<?>> getTemplates();
}
