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
import com.yandex.div2.BoolVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65225a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, BoolVariableTemplate boolVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", boolVariableTemplate.f45902a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_BOOLEAN);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", boolVariableTemplate.f45903b);
        return jSONObject;
    }

    public k(JsonParserComponent jsonParserComponent) {
        this.f65225a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BoolVariableTemplate deserialize(ParsingContext parsingContext, BoolVariableTemplate boolVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<Expression<Boolean>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (boolVariableTemplate != null) {
            field = boolVariableTemplate.f45902a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        if (boolVariableTemplate != null) {
            field2 = boolVariableTemplate.f45903b;
        } else {
            field2 = null;
        }
        return new BoolVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
