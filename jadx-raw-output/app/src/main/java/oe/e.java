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
import com.yandex.div2.ArrayVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65191a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ArrayVariableTemplate arrayVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", arrayVariableTemplate.f45886a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", arrayVariableTemplate.f45887b);
        return jSONObject;
    }

    public e(JsonParserComponent jsonParserComponent) {
        this.f65191a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayVariableTemplate deserialize(ParsingContext parsingContext, ArrayVariableTemplate arrayVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<Expression<JSONArray>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (arrayVariableTemplate != null) {
            field = arrayVariableTemplate.f45886a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        TypeHelper<JSONArray> typeHelper = TypeHelpersKt.TYPE_HELPER_JSON_ARRAY;
        if (arrayVariableTemplate != null) {
            field2 = arrayVariableTemplate.f45887b;
        } else {
            field2 = null;
        }
        return new ArrayVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2));
    }
}
