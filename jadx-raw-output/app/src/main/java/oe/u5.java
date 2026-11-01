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
import com.yandex.div2.DivInputFilterRegexTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterRegexJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u5 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65301a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterRegexTemplate divInputFilterRegexTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divInputFilterRegexTemplate.f47874a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
        return jSONObject;
    }

    public u5(JsonParserComponent jsonParserComponent) {
        this.f65301a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterRegexTemplate deserialize(ParsingContext parsingContext, DivInputFilterRegexTemplate divInputFilterRegexTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divInputFilterRegexTemplate != null) {
            field = divInputFilterRegexTemplate.f47874a;
        } else {
            field = null;
        }
        return new DivInputFilterRegexTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", typeHelper, allowPropertyOverride, field));
    }
}
