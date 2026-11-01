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
import com.yandex.div2.ColorValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65243a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ColorValueTemplate colorValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", colorValueTemplate.f45910a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }

    public n(JsonParserComponent jsonParserComponent) {
        this.f65243a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorValueTemplate deserialize(ParsingContext parsingContext, ColorValueTemplate colorValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Integer>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        if (colorValueTemplate != null) {
            field = colorValueTemplate.f45910a;
        } else {
            field = null;
        }
        return new ColorValueTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
