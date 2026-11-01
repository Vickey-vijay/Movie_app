package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f4 implements TemplateResolver<JSONObject, DivTabsTemplate.ItemTemplate, DivTabs.Item> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50630a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTabs.Item resolve(ParsingContext parsingContext, DivTabsTemplate.ItemTemplate itemTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivTabs.Item((Div) JsonFieldResolver.resolve(parsingContext, itemTemplate.f49398a, jSONObject, "div", this.f50630a.O4(), this.f50630a.M4()), JsonFieldResolver.resolveExpression(parsingContext, itemTemplate.f49399b, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonFieldResolver.resolveOptional(parsingContext, itemTemplate.f49400c, jSONObject, "title_click_action", this.f50630a.w0(), this.f50630a.u0()));
    }

    public f4(JsonParserComponent jsonParserComponent) {
        this.f50630a = jsonParserComponent;
    }
}
