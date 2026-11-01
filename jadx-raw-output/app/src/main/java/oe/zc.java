package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StartDestination;
import org.json.JSONObject;

/* JADX INFO: compiled from: StartDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zc implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65343a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StartDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new StartDestination();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, StartDestination startDestination) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "start");
        return jSONObject;
    }

    public zc(JsonParserComponent jsonParserComponent) {
        this.f65343a = jsonParserComponent;
    }
}
