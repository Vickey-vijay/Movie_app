package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPhoneInputMask;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r7 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65278a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPhoneInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivPhoneInputMask((String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPhoneInputMask divPhoneInputMask) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", divPhoneInputMask.a());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "phone");
        return jSONObject;
    }

    public r7(JsonParserComponent jsonParserComponent) {
        this.f65278a = jsonParserComponent;
    }
}
