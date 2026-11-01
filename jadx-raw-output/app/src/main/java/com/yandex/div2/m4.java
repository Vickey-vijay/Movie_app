package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradientJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class m4 implements TemplateResolver<JSONObject, DivTextGradientTemplate, DivTextGradient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50762a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextGradient resolve(ParsingContext parsingContext, DivTextGradientTemplate divTextGradientTemplate, JSONObject jSONObject) throws ParsingException {
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.b) {
            return new DivTextGradient.b(this.f50762a.X4().getValue().resolve(parsingContext, ((DivTextGradientTemplate.b) divTextGradientTemplate).b(), jSONObject));
        }
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.c) {
            return new DivTextGradient.c(this.f50762a.n6().getValue().resolve(parsingContext, ((DivTextGradientTemplate.c) divTextGradientTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public m4(JsonParserComponent jsonParserComponent) {
        this.f50762a = jsonParserComponent;
    }
}
