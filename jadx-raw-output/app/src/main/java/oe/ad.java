package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StartDestinationTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: StartDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ad implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65174a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StartDestinationTemplate deserialize(ParsingContext parsingContext, StartDestinationTemplate startDestinationTemplate, JSONObject jSONObject) throws ParsingException {
        return new StartDestinationTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, StartDestinationTemplate startDestinationTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "start");
        return jSONObject;
    }

    public ad(JsonParserComponent jsonParserComponent) {
        this.f65174a = jsonParserComponent;
    }
}
