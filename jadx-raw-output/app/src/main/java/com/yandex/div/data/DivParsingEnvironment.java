package com.yandex.div.data;

import ck.i;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.DivTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivParsingEnvironment.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<DivTemplate> {
    private final TemplateParsingEnvironment.TemplateFactory<DivTemplate> templateFactory;
    private final CachingTemplateProvider<DivTemplate> templates;

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i10, i iVar) {
        this(parsingErrorLogger, (i10 & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.Companion.empty()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTemplate templateFactory$lambda$0(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
        return DivTemplate.f49434a.a(parsingEnvironment, z10, jSONObject);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    public TemplateParsingEnvironment.TemplateFactory<DivTemplate> getTemplateFactory() {
        return this.templateFactory;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public CachingTemplateProvider<DivTemplate> getTemplates() {
        return this.templates;
    }

    public DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider<DivTemplate> cachingTemplateProvider) {
        super(parsingErrorLogger, cachingTemplateProvider);
        this.templates = cachingTemplateProvider;
        this.templateFactory = new TemplateParsingEnvironment.TemplateFactory() { // from class: de.a
            @Override // com.yandex.div.json.TemplateParsingEnvironment.TemplateFactory
            public final Object create(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
                return DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironment, z10, jSONObject);
            }
        };
    }
}
