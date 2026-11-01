package com.yandex.div.json.templates;

import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import java.util.Map;

/* JADX INFO: compiled from: InMemoryTemplateProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class InMemoryTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {
    private final Map<String, T> templatesMap = CollectionsKt.arrayMap();

    @Override // com.yandex.div.json.templates.TemplateProvider
    public T get(String str) {
        return this.templatesMap.get(str);
    }

    public final void put$div_data_release(String str, T t10) {
        this.templatesMap.put(str, t10);
    }

    public final void takeSnapshot$div_data_release(Map<String, T> map) {
        map.putAll(this.templatesMap);
    }
}
