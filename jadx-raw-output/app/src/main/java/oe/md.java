package oe;

import android.net.Uri;
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
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.UrlVariableTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class md implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65242a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, UrlVariableTemplate urlVariableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", urlVariableTemplate.f50548a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", urlVariableTemplate.f50549b, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    public md(JsonParserComponent jsonParserComponent) {
        this.f65242a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UrlVariableTemplate deserialize(ParsingContext parsingContext, UrlVariableTemplate urlVariableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<Expression<Uri>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (urlVariableTemplate != null) {
            field = urlVariableTemplate.f50548a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
        if (urlVariableTemplate != null) {
            field2 = urlVariableTemplate.f50549b;
        } else {
            field2 = null;
        }
        return new UrlVariableTemplate(field3, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_URI));
    }
}
