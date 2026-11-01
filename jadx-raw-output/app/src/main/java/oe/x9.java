package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivStrokeStyleDashedTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleDashedJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x9 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65322a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleDashedTemplate deserialize(ParsingContext parsingContext, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivStrokeStyleDashedTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dashed");
        return jSONObject;
    }

    public x9(JsonParserComponent jsonParserComponent) {
        this.f65322a = jsonParserComponent;
    }
}
