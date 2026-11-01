package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x7 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65321a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPoint deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivPoint((DivDimension) JsonPropertyParser.read(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, this.f65321a.M2()), (DivDimension) JsonPropertyParser.read(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, this.f65321a.M2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPoint divPoint) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, divPoint.f48418a, this.f65321a.M2());
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, divPoint.f48419b, this.f65321a.M2());
        return jSONObject;
    }

    public x7(JsonParserComponent jsonParserComponent) {
        this.f65321a = jsonParserComponent;
    }
}
