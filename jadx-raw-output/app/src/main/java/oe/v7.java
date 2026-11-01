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
import com.yandex.div2.DivPivotPercentageTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotPercentageJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v7 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65308a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPivotPercentageTemplate divPivotPercentageTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-percentage");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPivotPercentageTemplate.f48411a);
        return jSONObject;
    }

    public v7(JsonParserComponent jsonParserComponent) {
        this.f65308a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivotPercentageTemplate deserialize(ParsingContext parsingContext, DivPivotPercentageTemplate divPivotPercentageTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Double>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        if (divPivotPercentageTemplate != null) {
            field = divPivotPercentageTemplate.f48411a;
        } else {
            field = null;
        }
        return new DivPivotPercentageTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
