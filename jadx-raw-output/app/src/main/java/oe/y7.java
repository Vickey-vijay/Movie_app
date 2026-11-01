package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivDimensionTemplate;
import com.yandex.div2.DivPointTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y7 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65328a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPointTemplate divPointTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, divPointTemplate.f48423a, this.f65328a.N2());
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, divPointTemplate.f48424b, this.f65328a.N2());
        return jSONObject;
    }

    public y7(JsonParserComponent jsonParserComponent) {
        this.f65328a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPointTemplate deserialize(ParsingContext parsingContext, DivPointTemplate divPointTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivDimensionTemplate> field;
        Field<DivDimensionTemplate> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divPointTemplate != null) {
            field = divPointTemplate.f48423a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.HORIZONTAL_POSITION, allowPropertyOverride, field, this.f65328a.N2());
        if (divPointTemplate != null) {
            field2 = divPointTemplate.f48424b;
        } else {
            field2 = null;
        }
        return new DivPointTemplate(field3, JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.VERTICAL_POSITION, allowPropertyOverride, field2, this.f65328a.N2()));
    }
}
