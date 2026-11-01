package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivInfinityCountTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInfinityCountJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o5 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65254a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInfinityCountTemplate deserialize(ParsingContext parsingContext, DivInfinityCountTemplate divInfinityCountTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivInfinityCountTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInfinityCountTemplate divInfinityCountTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "infinity");
        return jSONObject;
    }

    public o5(JsonParserComponent jsonParserComponent) {
        this.f65254a = jsonParserComponent;
    }
}
