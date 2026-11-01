package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPageSize;
import com.yandex.div2.DivPercentageSize;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65339a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivPageSize((DivPercentageSize) JsonPropertyParser.read(parsingContext, jSONObject, "page_width", this.f65339a.K5()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPageSize divPageSize) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "page_width", divPageSize.f48138a, this.f65339a.K5());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
        return jSONObject;
    }

    public z6(JsonParserComponent jsonParserComponent) {
        this.f65339a = jsonParserComponent;
    }
}
