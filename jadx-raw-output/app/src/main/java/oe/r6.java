package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivNinePatchBackground;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65277a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNinePatchBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivNinePatchBackground(JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (DivAbsoluteEdgeInsets) JsonPropertyParser.read(parsingContext, jSONObject, "insets", this.f65277a.E()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivNinePatchBackground divNinePatchBackground) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divNinePatchBackground.f48077a, ParsingConvertersKt.URI_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "insets", divNinePatchBackground.f48078b, this.f65277a.E());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }

    public r6(JsonParserComponent jsonParserComponent) {
        this.f65277a = jsonParserComponent;
    }
}
