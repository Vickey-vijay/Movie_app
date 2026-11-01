package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65204a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivLayoutProvider deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivLayoutProvider((String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height_variable_name"), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width_variable_name"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivLayoutProvider divLayoutProvider) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "height_variable_name", divLayoutProvider.f48027a);
        JsonPropertyParser.write(parsingContext, jSONObject, "width_variable_name", divLayoutProvider.f48028b);
        return jSONObject;
    }

    public g6(JsonParserComponent jsonParserComponent) {
        this.f65204a = jsonParserComponent;
    }
}
