package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;

/* JADX INFO: compiled from: TemplateDeserializer.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface TemplateDeserializer<D, T extends EntityTemplate<?>> extends Deserializer<D, T> {
    T deserialize(ParsingContext parsingContext, T t10, D d10);

    @Override // com.yandex.div.serialization.Deserializer
    default T deserialize(ParsingContext parsingContext, D d10) {
        return (T) deserialize(parsingContext, null, d10);
    }
}
