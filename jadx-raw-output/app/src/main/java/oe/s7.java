package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivPhoneInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s7 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65287a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divPhoneInputMaskTemplate.f48382a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "phone");
        return jSONObject;
    }

    public s7(JsonParserComponent jsonParserComponent) {
        this.f65287a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPhoneInputMaskTemplate deserialize(ParsingContext parsingContext, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divPhoneInputMaskTemplate != null) {
            field = divPhoneInputMaskTemplate.f48382a;
        } else {
            field = null;
        }
        return new DivPhoneInputMaskTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, field));
    }
}
