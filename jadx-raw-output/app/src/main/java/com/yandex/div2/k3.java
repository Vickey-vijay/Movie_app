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

/* JADX INFO: compiled from: DivSelectJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class k3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50715a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivSelectTemplate.OptionTemplate optionTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", optionTemplate.f48670a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", optionTemplate.f48671b);
        return jSONObject;
    }

    public k3(JsonParserComponent jsonParserComponent) {
        this.f50715a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSelectTemplate.OptionTemplate deserialize(ParsingContext parsingContext, DivSelectTemplate.OptionTemplate optionTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        Field<Expression<String>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (optionTemplate != null) {
            field = optionTemplate.f48670a;
        } else {
            field = null;
        }
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper, allowPropertyOverride, field);
        if (optionTemplate != null) {
            field2 = optionTemplate.f48671b;
        } else {
            field2 = null;
        }
        return new DivSelectTemplate.OptionTemplate(optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2));
    }
}
