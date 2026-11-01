package oe;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionDictSetValueTemplate;
import com.yandex.div2.DivTypedValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65188a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionDictSetValueTemplate divActionDictSetValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.i.W, divActionDictSetValueTemplate.f46145a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionDictSetValueTemplate.f46146b, this.f65188a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionDictSetValueTemplate.f46147c);
        return jSONObject;
    }

    public d1(JsonParserComponent jsonParserComponent) {
        this.f65188a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDictSetValueTemplate deserialize(ParsingContext parsingContext, DivActionDictSetValueTemplate divActionDictSetValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        Field<DivTypedValueTemplate> field2;
        Field<Expression<String>> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionDictSetValueTemplate != null) {
            field = divActionDictSetValueTemplate.f46145a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.i.W, typeHelper, allowPropertyOverride, field);
        if (divActionDictSetValueTemplate != null) {
            field2 = divActionDictSetValueTemplate.f46146b;
        } else {
            field2 = null;
        }
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, field2, this.f65188a.i9());
        if (divActionDictSetValueTemplate != null) {
            field3 = divActionDictSetValueTemplate.f46147c;
        } else {
            field3 = null;
        }
        return new DivActionDictSetValueTemplate(fieldWithExpression, optionalField, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, field3));
    }
}
