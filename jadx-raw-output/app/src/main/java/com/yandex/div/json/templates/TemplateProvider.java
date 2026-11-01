package com.yandex.div.json.templates;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: TemplateProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface TemplateProvider<T extends EntityTemplate<?>> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TemplateProvider.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <T extends EntityTemplate<?>> TemplateProvider<T> empty() {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$empty$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                public EntityTemplate get(String str) {
                    return null;
                }
            };
        }

        public final <T extends EntityTemplate<?>> TemplateProvider<T> wrap(final Map<String, ? extends T> map) {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$wrap$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                public EntityTemplate get(String str) {
                    return (EntityTemplate) map.get(str);
                }
            };
        }
    }

    T get(String str);

    default T getOrThrow(String str, JSONObject jSONObject) throws ParsingException {
        T t10 = (T) get(str);
        if (t10 != null) {
            return t10;
        }
        throw ParsingExceptionKt.templateNotFound(jSONObject, str);
    }
}
