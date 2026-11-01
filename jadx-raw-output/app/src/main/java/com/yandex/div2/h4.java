package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50671a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivText.Ellipsis deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivText.Ellipsis(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f50671a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.f50671a.m8()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f50671a.y8()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivText.Ellipsis ellipsis) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", ellipsis.f49507a, this.f50671a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "images", ellipsis.f49508b, this.f50671a.m8());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", ellipsis.f49509c, this.f50671a.y8());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", ellipsis.f49510d);
        return jSONObject;
    }

    public h4(JsonParserComponent jsonParserComponent) {
        this.f50671a = jsonParserComponent;
    }
}
