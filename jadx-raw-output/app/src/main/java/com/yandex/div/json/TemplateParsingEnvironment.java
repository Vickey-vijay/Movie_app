package com.yandex.div.json;

import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: TemplateParsingEnvironment.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {
    private final ParsingErrorLogger logger;
    private final CachingTemplateProvider<T> mainTemplateProvider;
    private final TemplateProvider<T> templates;

    /* JADX INFO: compiled from: TemplateParsingEnvironment.kt */
    public interface TemplateFactory<T> {
        T create(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws JSONException;
    }

    /* JADX INFO: compiled from: TemplateParsingEnvironment.kt */
    public static final class TemplateParsingResult<T> {
        private final Map<String, T> parsedTemplates;
        private final Map<String, Set<String>> templateDependencies;

        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(Map<String, ? extends T> map, Map<String, ? extends Set<String>> map2) {
            this.parsedTemplates = map;
            this.templateDependencies = map2;
        }
    }

    public abstract TemplateFactory<T> getTemplateFactory();

    @Override // com.yandex.div.serialization.ParsingContext
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    public TemplateParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider<T> cachingTemplateProvider) {
        this.logger = parsingErrorLogger;
        this.mainTemplateProvider = cachingTemplateProvider;
        this.templates = cachingTemplateProvider;
    }

    public final void parseTemplates(JSONObject jSONObject) {
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(jSONObject));
    }

    public final Map<String, T> parseTemplatesWithResult(JSONObject jSONObject) {
        return parseTemplatesWithResultAndDependencies(jSONObject).getParsedTemplates();
    }

    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(JSONObject jSONObject) {
        Map<String, T> mapArrayMap = CollectionsKt.arrayMap();
        Map mapArrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> mapSort = JsonTopologicalSorting.INSTANCE.sort(this, jSONObject);
            this.mainTemplateProvider.takeSnapshot(mapArrayMap);
            TemplateProvider templateProviderWrap = TemplateProvider.Companion.wrap(mapArrayMap);
            for (Map.Entry<String, Set<String>> entry : mapSort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    mapArrayMap.put(key, getTemplateFactory().create(new ParsingEnvironmentImpl(templateProviderWrap, new TemplateParsingErrorLogger(getLogger(), key)), true, jSONObject.getJSONObject(key)));
                    if (!value.isEmpty()) {
                        mapArrayMap2.put(key, value);
                    }
                } catch (ParsingException e10) {
                    getLogger().logTemplateError(e10, key);
                }
            }
        } catch (Exception e11) {
            getLogger().logError(e11);
        }
        return new TemplateParsingResult<>(mapArrayMap, mapArrayMap2);
    }
}
