package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class v0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50879a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivData.State deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivData.State((Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f50879a.M4()), ((Number) JsonPropertyParser.read(parsingContext, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivData.State state) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", state.f46946a, this.f50879a.M4());
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", Long.valueOf(state.f46947b));
        return jSONObject;
    }

    public v0(JsonParserComponent jsonParserComponent) {
        this.f50879a = jsonParserComponent;
    }
}
