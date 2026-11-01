package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenterJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c3 implements TemplateResolver<JSONObject, DivRadialGradientCenterTemplate, DivRadialGradientCenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50591a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenter resolve(ParsingContext parsingContext, DivRadialGradientCenterTemplate divRadialGradientCenterTemplate, JSONObject jSONObject) throws ParsingException {
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.b) {
            return new DivRadialGradientCenter.b(this.f50591a.k6().getValue().resolve(parsingContext, ((DivRadialGradientCenterTemplate.b) divRadialGradientCenterTemplate).b(), jSONObject));
        }
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.c) {
            return new DivRadialGradientCenter.c(this.f50591a.t6().getValue().resolve(parsingContext, ((DivRadialGradientCenterTemplate.c) divRadialGradientCenterTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public c3(JsonParserComponent jsonParserComponent) {
        this.f50591a = jsonParserComponent;
    }
}
