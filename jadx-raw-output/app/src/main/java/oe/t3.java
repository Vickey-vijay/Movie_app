package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivExtensionTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65292a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivExtensionTemplate divExtensionTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", divExtensionTemplate.f47100a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "params", divExtensionTemplate.f47101b);
        return jSONObject;
    }

    public t3(JsonParserComponent jsonParserComponent) {
        this.f65292a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivExtensionTemplate deserialize(ParsingContext parsingContext, DivExtensionTemplate divExtensionTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<JSONObject> field2 = null;
        if (divExtensionTemplate != null) {
            field = divExtensionTemplate.f47100a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, field);
        if (divExtensionTemplate != null) {
            field2 = divExtensionTemplate.f47101b;
        }
        return new DivExtensionTemplate(field3, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "params", allowPropertyOverride, field2));
    }
}
