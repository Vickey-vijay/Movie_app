package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50892a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivState.State deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivState.State((DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.f50892a.q1()), (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.f50892a.q1()), (Div) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div", this.f50892a.M4()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "state_id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "swipe_out_actions", this.f50892a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivState.State state) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", state.f49047a, this.f50892a.q1());
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", state.f49048b, this.f50892a.q1());
        JsonPropertyParser.write(parsingContext, jSONObject, "div", state.f49049c, this.f50892a.M4());
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", state.f49050d);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "swipe_out_actions", state.f49051e, this.f50892a.u0());
        return jSONObject;
    }

    public w3(JsonParserComponent jsonParserComponent) {
        this.f50892a = jsonParserComponent;
    }
}
