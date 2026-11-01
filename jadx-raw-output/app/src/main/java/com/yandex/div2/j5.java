package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class j5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50702a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVideoSource deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivVideoSource(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (DivVideoSource.Resolution) JsonPropertyParser.readOptional(parsingContext, jSONObject, "resolution", this.f50702a.t9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivVideoSource divVideoSource) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, VastAttributes.BITRATE, divVideoSource.f50035a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mime_type", divVideoSource.f50036b);
        JsonPropertyParser.write(parsingContext, jSONObject, "resolution", divVideoSource.f50037c, this.f50702a.t9());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divVideoSource.f50038d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    public j5(JsonParserComponent jsonParserComponent) {
        this.f50702a = jsonParserComponent;
    }
}
