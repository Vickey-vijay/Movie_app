package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements TemplateResolver<JSONObject, DivActionTemplate.MenuItemTemplate, DivAction.MenuItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50632a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAction.MenuItem resolve(ParsingContext parsingContext, DivActionTemplate.MenuItemTemplate menuItemTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivAction.MenuItem((DivAction) JsonFieldResolver.resolveOptional(parsingContext, menuItemTemplate.f46336a, jSONObject, "action", this.f50632a.w0(), this.f50632a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, menuItemTemplate.f46337b, jSONObject, "actions", this.f50632a.w0(), this.f50632a.u0()), JsonFieldResolver.resolveExpression(parsingContext, menuItemTemplate.f46338c, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public g(JsonParserComponent jsonParserComponent) {
        this.f50632a = jsonParserComponent;
    }
}
