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
import com.yandex.div2.DivActionArrayRemoveValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65274a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArrayRemoveValueTemplate.f46103a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArrayRemoveValueTemplate.f46104b);
        return jSONObject;
    }

    public r0(JsonParserComponent jsonParserComponent) {
        this.f65274a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayRemoveValueTemplate deserialize(ParsingContext parsingContext, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Long>> field;
        Field<Expression<String>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        if (divActionArrayRemoveValueTemplate != null) {
            field = divActionArrayRemoveValueTemplate.f46103a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "index", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT);
        TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionArrayRemoveValueTemplate != null) {
            field2 = divActionArrayRemoveValueTemplate.f46104b;
        } else {
            field2 = null;
        }
        return new DivActionArrayRemoveValueTemplate(fieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper2, allowPropertyOverride, field2));
    }
}
