package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements TemplateResolver<JSONObject, DivBackgroundTemplate, DivBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50626a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivBackground resolve(ParsingContext parsingContext, DivBackgroundTemplate divBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.c) {
            return new DivBackground.c(this.f50626a.X4().getValue().resolve(parsingContext, ((DivBackgroundTemplate.c) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.e) {
            return new DivBackground.e(this.f50626a.n6().getValue().resolve(parsingContext, ((DivBackgroundTemplate.e) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.b) {
            return new DivBackground.b(this.f50626a.W3().getValue().resolve(parsingContext, ((DivBackgroundTemplate.b) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.f) {
            return new DivBackground.f(this.f50626a.s7().getValue().resolve(parsingContext, ((DivBackgroundTemplate.f) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.d) {
            return new DivBackground.d(this.f50626a.g5().getValue().resolve(parsingContext, ((DivBackgroundTemplate.d) divBackgroundTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public f0(JsonParserComponent jsonParserComponent) {
        this.f50626a = jsonParserComponent;
    }
}
