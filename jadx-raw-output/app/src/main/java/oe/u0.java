package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionArraySetValueTemplate;
import com.yandex.div2.DivTypedValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArraySetValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65298a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionArraySetValueTemplate divActionArraySetValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArraySetValueTemplate.f46113a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionArraySetValueTemplate.f46114b, this.f65298a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArraySetValueTemplate.f46115c);
        return jSONObject;
    }

    public u0(JsonParserComponent jsonParserComponent) {
        this.f65298a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArraySetValueTemplate deserialize(ParsingContext parsingContext, DivActionArraySetValueTemplate divActionArraySetValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Long>> field;
        Field<DivTypedValueTemplate> field2;
        Field<Expression<String>> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        if (divActionArraySetValueTemplate != null) {
            field = divActionArraySetValueTemplate.f46113a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "index", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT);
        if (divActionArraySetValueTemplate != null) {
            field2 = divActionArraySetValueTemplate.f46114b;
        } else {
            field2 = null;
        }
        Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, field2, this.f65298a.i9());
        TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionArraySetValueTemplate != null) {
            field3 = divActionArraySetValueTemplate.f46115c;
        } else {
            field3 = null;
        }
        return new DivActionArraySetValueTemplate(fieldWithExpression, field4, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper2, allowPropertyOverride, field3));
    }
}
