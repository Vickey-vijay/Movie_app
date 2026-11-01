package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h3 implements TemplateResolver<JSONObject, DivRadialGradientRadiusTemplate, DivRadialGradientRadius> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50670a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRadius resolve(ParsingContext parsingContext, DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate, JSONObject jSONObject) throws ParsingException {
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.b) {
            return new DivRadialGradientRadius.b(this.f50670a.y3().getValue().resolve(parsingContext, ((DivRadialGradientRadiusTemplate.b) divRadialGradientRadiusTemplate).b(), jSONObject));
        }
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.c) {
            return new DivRadialGradientRadius.c(this.f50670a.w6().getValue().resolve(parsingContext, ((DivRadialGradientRadiusTemplate.c) divRadialGradientRadiusTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public h3(JsonParserComponent jsonParserComponent) {
        this.f50670a = jsonParserComponent;
    }
}
