package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import io.appmetrica.analytics.impl.A2;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class j1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50698a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivFocus(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f50698a.F1()), (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f50698a.L1()), (DivFocus.NextFocusIds) JsonPropertyParser.readOptional(parsingContext, jSONObject, "next_focus_ids", this.f50698a.C3()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_blur", this.f50698a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_focus", this.f50698a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFocus divFocus) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divFocus.f47204a, this.f50698a.F1());
        JsonPropertyParser.write(parsingContext, jSONObject, "border", divFocus.f47205b, this.f50698a.L1());
        JsonPropertyParser.write(parsingContext, jSONObject, "next_focus_ids", divFocus.f47206c, this.f50698a.C3());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_blur", divFocus.f47207d, this.f50698a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_focus", divFocus.f47208e, this.f50698a.u0());
        return jSONObject;
    }

    public j1(JsonParserComponent jsonParserComponent) {
        this.f50698a = jsonParserComponent;
    }
}
