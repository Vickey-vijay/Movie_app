package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f1 implements TemplateResolver<JSONObject, DivFilterTemplate, DivFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50627a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilter resolve(ParsingContext parsingContext, DivFilterTemplate divFilterTemplate, JSONObject jSONObject) throws ParsingException {
        if (divFilterTemplate instanceof DivFilterTemplate.a) {
            return new DivFilter.a(this.f50627a.K1().getValue().resolve(parsingContext, ((DivFilterTemplate.a) divFilterTemplate).b(), jSONObject));
        }
        if (divFilterTemplate instanceof DivFilterTemplate.c) {
            return new DivFilter.c(this.f50627a.m3().getValue().resolve(parsingContext, ((DivFilterTemplate.c) divFilterTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public f1(JsonParserComponent jsonParserComponent) {
        this.f50627a = jsonParserComponent;
    }
}
