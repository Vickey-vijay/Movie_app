package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class p2 implements TemplateResolver<JSONObject, DivPageTransformationTemplate, DivPageTransformation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50820a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageTransformation resolve(ParsingContext parsingContext, DivPageTransformationTemplate divPageTransformationTemplate, JSONObject jSONObject) throws ParsingException {
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.c) {
            return new DivPageTransformation.c(this.f50820a.y5().getValue().resolve(parsingContext, ((DivPageTransformationTemplate.c) divPageTransformationTemplate).b(), jSONObject));
        }
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.b) {
            return new DivPageTransformation.b(this.f50820a.v5().getValue().resolve(parsingContext, ((DivPageTransformationTemplate.b) divPageTransformationTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public p2(JsonParserComponent jsonParserComponent) {
        this.f50820a = jsonParserComponent;
    }
}
