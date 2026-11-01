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
import com.yandex.div2.StrValueTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class dd implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65190a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, StrValueTemplate strValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_STRING);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", strValueTemplate.f50524a);
        return jSONObject;
    }

    public dd(JsonParserComponent jsonParserComponent) {
        this.f65190a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrValueTemplate deserialize(ParsingContext parsingContext, StrValueTemplate strValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (strValueTemplate != null) {
            field = strValueTemplate.f50524a;
        } else {
            field = null;
        }
        return new StrValueTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field));
    }
}
