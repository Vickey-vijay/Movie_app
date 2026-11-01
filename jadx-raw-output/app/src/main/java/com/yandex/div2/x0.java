package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements TemplateResolver<JSONObject, DivDataTemplate.StateTemplate, DivData.State> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50903a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivData.State resolve(ParsingContext parsingContext, DivDataTemplate.StateTemplate stateTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivData.State((Div) JsonFieldResolver.resolve(parsingContext, stateTemplate.f46968a, jSONObject, "div", this.f50903a.O4(), this.f50903a.M4()), ((Number) JsonFieldResolver.resolve(parsingContext, stateTemplate.f46969b, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }

    public x0(JsonParserComponent jsonParserComponent) {
        this.f50903a = jsonParserComponent;
    }
}
