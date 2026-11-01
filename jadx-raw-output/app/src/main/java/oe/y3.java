package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivFilterRtlMirror;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirrorJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65326a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilterRtlMirror deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivFilterRtlMirror();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFilterRtlMirror divFilterRtlMirror) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }

    public y3(JsonParserComponent jsonParserComponent) {
        this.f65326a = jsonParserComponent;
    }
}
