package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivTooltipModeModalTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeModalJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class nb implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65248a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeModalTemplate deserialize(ParsingContext parsingContext, DivTooltipModeModalTemplate divTooltipModeModalTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivTooltipModeModalTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeModalTemplate divTooltipModeModalTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "modal");
        return jSONObject;
    }

    public nb(JsonParserComponent jsonParserComponent) {
        this.f65248a = jsonParserComponent;
    }
}
