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
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.NumberVariableTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class vc implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65309a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, NumberVariableTemplate numberVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", numberVariableTemplate.f50481a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", numberVariableTemplate.f50482b);
        return jSONObject;
    }

    public vc(JsonParserComponent jsonParserComponent) {
        this.f65309a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberVariableTemplate deserialize(ParsingContext parsingContext, NumberVariableTemplate numberVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<Expression<Double>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (numberVariableTemplate != null) {
            field = numberVariableTemplate.f50481a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        if (numberVariableTemplate != null) {
            field2 = numberVariableTemplate.f50482b;
        } else {
            field2 = null;
        }
        return new NumberVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
