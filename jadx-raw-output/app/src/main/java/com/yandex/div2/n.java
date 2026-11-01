package com.yandex.div2;

import com.vungle.ads.internal.ui.AdActivity;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements TemplateResolver<JSONObject, DivActionSubmitTemplate, DivActionSubmit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50774a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmit resolve(ParsingContext parsingContext, DivActionSubmitTemplate divActionSubmitTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionSubmit(JsonFieldResolver.resolveExpression(parsingContext, divActionSubmitTemplate.f46306a, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, divActionSubmitTemplate.f46307b, jSONObject, "on_fail_actions", this.f50774a.w0(), this.f50774a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divActionSubmitTemplate.f46308c, jSONObject, "on_success_actions", this.f50774a.w0(), this.f50774a.u0()), (DivActionSubmit.Request) JsonFieldResolver.resolve(parsingContext, divActionSubmitTemplate.f46309d, jSONObject, AdActivity.REQUEST_KEY_EXTRA, this.f50774a.d1(), this.f50774a.b1()));
    }

    public n(JsonParserComponent jsonParserComponent) {
        this.f50774a = jsonParserComponent;
    }
}
