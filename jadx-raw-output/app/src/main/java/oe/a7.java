package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivPageSizeTemplate;
import com.yandex.div2.DivPercentageSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a7 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65171a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPageSizeTemplate divPageSizeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "page_width", divPageSizeTemplate.f48142a, this.f65171a.L5());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
        return jSONObject;
    }

    public a7(JsonParserComponent jsonParserComponent) {
        this.f65171a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageSizeTemplate deserialize(ParsingContext parsingContext, DivPageSizeTemplate divPageSizeTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivPercentageSizeTemplate> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divPageSizeTemplate != null) {
            field = divPageSizeTemplate.f48142a;
        } else {
            field = null;
        }
        return new DivPageSizeTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "page_width", allowPropertyOverride, field, this.f65171a.L5()));
    }
}
