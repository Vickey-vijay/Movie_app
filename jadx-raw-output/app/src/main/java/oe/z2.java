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
import com.yandex.div2.DivCurrencyInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z2 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65337a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CommonUrlParts.LOCALE, divCurrencyInputMaskTemplate.f46863a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divCurrencyInputMaskTemplate.f46864b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "currency");
        return jSONObject;
    }

    public z2(JsonParserComponent jsonParserComponent) {
        this.f65337a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCurrencyInputMaskTemplate deserialize(ParsingContext parsingContext, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Field<String> field2 = null;
        if (divCurrencyInputMaskTemplate != null) {
            field = divCurrencyInputMaskTemplate.f46863a;
        } else {
            field = null;
        }
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CommonUrlParts.LOCALE, typeHelper, allowPropertyOverride, field);
        if (divCurrencyInputMaskTemplate != null) {
            field2 = divCurrencyInputMaskTemplate.f46864b;
        }
        return new DivCurrencyInputMaskTemplate(optionalFieldWithExpression, JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, field2));
    }
}
