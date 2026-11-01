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
import com.yandex.div2.DivRadialGradientRelativeCenterTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e8 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65193a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientRelativeCenterTemplate.f48482a);
        return jSONObject;
    }

    public e8(JsonParserComponent jsonParserComponent) {
        this.f65193a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRelativeCenterTemplate deserialize(ParsingContext parsingContext, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Double>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        if (divRadialGradientRelativeCenterTemplate != null) {
            field = divRadialGradientRelativeCenterTemplate.f48482a;
        } else {
            field = null;
        }
        return new DivRadialGradientRelativeCenterTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
