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
import com.yandex.div2.DivActionShowTooltipTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionShowTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65306a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionShowTooltipTemplate divActionShowTooltipTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionShowTooltipTemplate.f46276a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "multiple", divActionShowTooltipTemplate.f46277b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    public v1(JsonParserComponent jsonParserComponent) {
        this.f65306a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionShowTooltipTemplate deserialize(ParsingContext parsingContext, DivActionShowTooltipTemplate divActionShowTooltipTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        Field<Expression<Boolean>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionShowTooltipTemplate != null) {
            field = divActionShowTooltipTemplate.f46276a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", typeHelper, allowPropertyOverride, field);
        TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        if (divActionShowTooltipTemplate != null) {
            field2 = divActionShowTooltipTemplate.f46277b;
        } else {
            field2 = null;
        }
        return new DivActionShowTooltipTemplate(fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "multiple", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
