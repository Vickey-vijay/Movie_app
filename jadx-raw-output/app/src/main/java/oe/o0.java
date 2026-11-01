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
import com.yandex.div2.DivActionArrayInsertValueTemplate;
import com.yandex.div2.DivTypedValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65252a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArrayInsertValueTemplate.f46093a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionArrayInsertValueTemplate.f46094b, this.f65252a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArrayInsertValueTemplate.f46095c);
        return jSONObject;
    }

    public o0(JsonParserComponent jsonParserComponent) {
        this.f65252a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayInsertValueTemplate deserialize(ParsingContext parsingContext, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Long>> field;
        Field<DivTypedValueTemplate> field2;
        Field<Expression<String>> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        if (divActionArrayInsertValueTemplate != null) {
            field = divActionArrayInsertValueTemplate.f46093a;
        } else {
            field = null;
        }
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "index", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT);
        if (divActionArrayInsertValueTemplate != null) {
            field2 = divActionArrayInsertValueTemplate.f46094b;
        } else {
            field2 = null;
        }
        Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, field2, this.f65252a.i9());
        TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionArrayInsertValueTemplate != null) {
            field3 = divActionArrayInsertValueTemplate.f46095c;
        } else {
            field3 = null;
        }
        return new DivActionArrayInsertValueTemplate(optionalFieldWithExpression, field4, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper2, allowPropertyOverride, field3));
    }
}
