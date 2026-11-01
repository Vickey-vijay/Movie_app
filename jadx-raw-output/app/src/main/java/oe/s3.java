package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivExtension;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65284a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivExtension deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivExtension((String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "params"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivExtension divExtension) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "id", divExtension.f47095a);
        JsonPropertyParser.write(parsingContext, jSONObject, "params", divExtension.f47096b);
        return jSONObject;
    }

    public s3(JsonParserComponent jsonParserComponent) {
        this.f65284a = jsonParserComponent;
    }
}
