package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y3 implements TemplateResolver<JSONObject, DivStateTemplate.StateTemplate, DivState.State> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50924a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivState.State resolve(ParsingContext parsingContext, DivStateTemplate.StateTemplate stateTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivState.State((DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.f49108a, jSONObject, "animation_in", this.f50924a.s1(), this.f50924a.q1()), (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.f49109b, jSONObject, "animation_out", this.f50924a.s1(), this.f50924a.q1()), (Div) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.f49110c, jSONObject, "div", this.f50924a.O4(), this.f50924a.M4()), (String) JsonFieldResolver.resolve(parsingContext, stateTemplate.f49111d, jSONObject, "state_id"), JsonFieldResolver.resolveOptionalList(parsingContext, stateTemplate.f49112e, jSONObject, "swipe_out_actions", this.f50924a.w0(), this.f50924a.u0()));
    }

    public y3(JsonParserComponent jsonParserComponent) {
        this.f50924a = jsonParserComponent;
    }
}
