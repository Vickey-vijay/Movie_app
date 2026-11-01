package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;

/* JADX INFO: compiled from: TemplateResolver.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface TemplateResolver<D, T extends EntityTemplate<V>, V> {
    V resolve(ParsingContext parsingContext, T t10, D d10);
}
