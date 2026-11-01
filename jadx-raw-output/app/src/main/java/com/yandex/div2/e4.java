package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50623a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate.ItemTemplate itemTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", itemTemplate.f49398a, this.f50623a.N4());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "title", itemTemplate.f49399b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "title_click_action", itemTemplate.f49400c, this.f50623a.v0());
        return jSONObject;
    }

    public e4(JsonParserComponent jsonParserComponent) {
        this.f50623a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTabsTemplate.ItemTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate.ItemTemplate itemTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivTemplate> field;
        Field<Expression<String>> field2;
        Field<DivActionTemplate> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (itemTemplate != null) {
            field = itemTemplate.f49398a;
        } else {
            field = null;
        }
        Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, field, this.f50623a.N4());
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (itemTemplate != null) {
            field2 = itemTemplate.f49399b;
        } else {
            field2 = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "title", typeHelper, allowPropertyOverride, field2);
        if (itemTemplate != null) {
            field3 = itemTemplate.f49400c;
        } else {
            field3 = null;
        }
        return new DivTabsTemplate.ItemTemplate(field4, fieldWithExpression, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_click_action", allowPropertyOverride, field3, this.f50623a.v0()));
    }
}
