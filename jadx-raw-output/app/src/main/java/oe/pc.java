package oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.yandex.div2.IntegerVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class pc implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65265a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, IntegerVariableTemplate integerVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", integerVariableTemplate.f50160a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_INT);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", integerVariableTemplate.f50161b);
        return jSONObject;
    }

    public pc(JsonParserComponent jsonParserComponent) {
        this.f65265a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IntegerVariableTemplate deserialize(ParsingContext parsingContext, IntegerVariableTemplate integerVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<Expression<Long>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (integerVariableTemplate != null) {
            field = integerVariableTemplate.f50160a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        if (integerVariableTemplate != null) {
            field2 = integerVariableTemplate.f50161b;
        } else {
            field2 = null;
        }
        return new IntegerVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT));
    }
}
