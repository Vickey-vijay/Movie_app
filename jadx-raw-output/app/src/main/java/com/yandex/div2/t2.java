package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class t2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50865a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPatch.Change deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivPatch.Change((String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f50865a.M4()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPatch.Change change) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "id", change.f48346a);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "items", change.f48347b, this.f50865a.M4());
        return jSONObject;
    }

    public t2(JsonParserComponent jsonParserComponent) {
        this.f50865a = jsonParserComponent;
    }
}
