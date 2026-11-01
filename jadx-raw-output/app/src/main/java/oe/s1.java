package oe;

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
import com.yandex.div2.DivActionSetVariableTemplate;
import com.yandex.div2.DivTypedValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65283a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetVariableTemplate divActionSetVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionSetVariableTemplate.f46267a, this.f65283a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionSetVariableTemplate.f46268b);
        return jSONObject;
    }

    public s1(JsonParserComponent jsonParserComponent) {
        this.f65283a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetVariableTemplate deserialize(ParsingContext parsingContext, DivActionSetVariableTemplate divActionSetVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivTypedValueTemplate> field;
        Field<Expression<String>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divActionSetVariableTemplate != null) {
            field = divActionSetVariableTemplate.f46267a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, field, this.f65283a.i9());
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionSetVariableTemplate != null) {
            field2 = divActionSetVariableTemplate.f46268b;
        } else {
            field2 = null;
        }
        return new DivActionSetVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, field2));
    }
}
