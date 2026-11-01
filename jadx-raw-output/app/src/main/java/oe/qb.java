package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivTooltipModeNonModalTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeNonModalJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class qb implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65271a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeNonModalTemplate deserialize(ParsingContext parsingContext, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivTooltipModeNonModalTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "non_modal");
        return jSONObject;
    }

    public qb(JsonParserComponent jsonParserComponent) {
        this.f65271a = jsonParserComponent;
    }
}
