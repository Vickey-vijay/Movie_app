package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivFixedSizeTemplate;
import com.yandex.div2.DivNeighbourPageSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p6 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65263a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "neighbour_page_width", divNeighbourPageSizeTemplate.f48074a, this.f65263a.x3());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
        return jSONObject;
    }

    public p6(JsonParserComponent jsonParserComponent) {
        this.f65263a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNeighbourPageSizeTemplate deserialize(ParsingContext parsingContext, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivFixedSizeTemplate> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divNeighbourPageSizeTemplate != null) {
            field = divNeighbourPageSizeTemplate.f48074a;
        } else {
            field = null;
        }
        return new DivNeighbourPageSizeTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "neighbour_page_width", allowPropertyOverride, field, this.f65263a.x3()));
    }
}
