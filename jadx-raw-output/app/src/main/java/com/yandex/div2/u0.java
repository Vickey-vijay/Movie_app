package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCountJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class u0 implements TemplateResolver<JSONObject, DivCountTemplate, DivCount> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50873a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCount resolve(ParsingContext parsingContext, DivCountTemplate divCountTemplate, JSONObject jSONObject) throws ParsingException {
        if (divCountTemplate instanceof DivCountTemplate.c) {
            return new DivCount.c(this.f50873a.i4().getValue().resolve(parsingContext, ((DivCountTemplate.c) divCountTemplate).b(), jSONObject));
        }
        if (divCountTemplate instanceof DivCountTemplate.b) {
            return new DivCount.b(this.f50873a.p3().getValue().resolve(parsingContext, ((DivCountTemplate.b) divCountTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public u0(JsonParserComponent jsonParserComponent) {
        this.f50873a = jsonParserComponent;
    }
}
