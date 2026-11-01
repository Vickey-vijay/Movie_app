package oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StrVariableTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class gd implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65206a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, StrVariableTemplate strVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", strVariableTemplate.f50532a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_STRING);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", strVariableTemplate.f50533b);
        return jSONObject;
    }

    public gd(JsonParserComponent jsonParserComponent) {
        this.f65206a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrVariableTemplate deserialize(ParsingContext parsingContext, StrVariableTemplate strVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<Expression<String>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (strVariableTemplate != null) {
            field = strVariableTemplate.f50532a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (strVariableTemplate != null) {
            field2 = strVariableTemplate.f50533b;
        } else {
            field2 = null;
        }
        return new StrVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2));
    }
}
