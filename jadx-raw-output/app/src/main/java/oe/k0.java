package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionAnimatorStop;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStopJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65226a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionAnimatorStop deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionAnimatorStop((String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStop divActionAnimatorStop) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", divActionAnimatorStop.f46080a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    public k0(JsonParserComponent jsonParserComponent) {
        this.f65226a = jsonParserComponent;
    }
}
