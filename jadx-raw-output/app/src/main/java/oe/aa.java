package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivStrokeStyleSolidTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleSolidJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class aa implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65173a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleSolidTemplate deserialize(ParsingContext parsingContext, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivStrokeStyleSolidTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }

    public aa(JsonParserComponent jsonParserComponent) {
        this.f65173a = jsonParserComponent;
    }
}
