package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivLayoutProviderTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h6 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65210a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivLayoutProviderTemplate divLayoutProviderTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "height_variable_name", divLayoutProviderTemplate.f48032a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "width_variable_name", divLayoutProviderTemplate.f48033b);
        return jSONObject;
    }

    public h6(JsonParserComponent jsonParserComponent) {
        this.f65210a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivLayoutProviderTemplate deserialize(ParsingContext parsingContext, DivLayoutProviderTemplate divLayoutProviderTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<String> field2 = null;
        if (divLayoutProviderTemplate != null) {
            field = divLayoutProviderTemplate.f48032a;
        } else {
            field = null;
        }
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height_variable_name", allowPropertyOverride, field);
        if (divLayoutProviderTemplate != null) {
            field2 = divLayoutProviderTemplate.f48033b;
        }
        return new DivLayoutProviderTemplate(optionalField, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width_variable_name", allowPropertyOverride, field2));
    }
}
