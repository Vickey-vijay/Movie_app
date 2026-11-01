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
import com.yandex.div2.UrlValueTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class jd implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65224a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, UrlValueTemplate urlValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", urlValueTemplate.f50540a, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    public jd(JsonParserComponent jsonParserComponent) {
        this.f65224a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UrlValueTemplate deserialize(ParsingContext parsingContext, UrlValueTemplate urlValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Uri>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
        if (urlValueTemplate != null) {
            field = urlValueTemplate.f50540a;
        } else {
            field = null;
        }
        return new UrlValueTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_URI));
    }
}
