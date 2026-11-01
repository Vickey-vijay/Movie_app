package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.EndDestination;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class hc implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65211a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EndDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new EndDestination();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, EndDestination endDestination) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "end");
        return jSONObject;
    }

    public hc(JsonParserComponent jsonParserComponent) {
        this.f65211a = jsonParserComponent;
    }
}
