package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
import java.util.Map;

/* JADX INFO: compiled from: CachingTemplateProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {
    private final InMemoryTemplateProvider<T> cacheProvider;
    private TemplateProvider<? extends T> fallbackProvider;

    @Override // com.yandex.div.json.templates.TemplateProvider
    public T get(String str) {
        T t10 = (T) this.cacheProvider.get(str);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) this.fallbackProvider.get(str);
        if (t11 == null) {
            return null;
        }
        this.cacheProvider.put$div_data_release(str, t11);
        return t11;
    }

    public void takeSnapshot(Map<String, T> map) {
        this.cacheProvider.takeSnapshot$div_data_release(map);
    }

    public CachingTemplateProvider(InMemoryTemplateProvider<T> inMemoryTemplateProvider, TemplateProvider<? extends T> templateProvider) {
        this.cacheProvider = inMemoryTemplateProvider;
        this.fallbackProvider = templateProvider;
    }

    public void putAll(Map<String, ? extends T> map) {
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            this.cacheProvider.put$div_data_release(entry.getKey(), entry.getValue());
        }
    }
}
