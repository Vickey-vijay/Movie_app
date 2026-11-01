package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65221a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDownloadCallbacks deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivDownloadCallbacks(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f65221a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f65221a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivDownloadCallbacks divDownloadCallbacks) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divDownloadCallbacks.f47033a, this.f65221a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divDownloadCallbacks.f47034b, this.f65221a.u0());
        return jSONObject;
    }

    public j3(JsonParserComponent jsonParserComponent) {
        this.f65221a = jsonParserComponent;
    }
}
