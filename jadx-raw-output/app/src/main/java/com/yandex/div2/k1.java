package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class k1 implements TemplateResolver<JSONObject, DivFocusTemplate, DivFocus> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50709a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus resolve(ParsingContext parsingContext, DivFocusTemplate divFocusTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivFocus(JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.f47220a, jSONObject, A2.f54950g, this.f50709a.H1(), this.f50709a.F1()), (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divFocusTemplate.f47221b, jSONObject, "border", this.f50709a.N1(), this.f50709a.L1()), (DivFocus.NextFocusIds) JsonFieldResolver.resolveOptional(parsingContext, divFocusTemplate.f47222c, jSONObject, "next_focus_ids", this.f50709a.E3(), this.f50709a.C3()), JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.f47223d, jSONObject, "on_blur", this.f50709a.w0(), this.f50709a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.f47224e, jSONObject, "on_focus", this.f50709a.w0(), this.f50709a.u0()));
    }

    public k1(JsonParserComponent jsonParserComponent) {
        this.f50709a = jsonParserComponent;
    }
}
