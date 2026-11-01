package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivShapeDrawableTemplate;
import com.yandex.div2.DivShapeTemplate;
import com.yandex.div2.DivStrokeTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a9 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65172a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivShapeDrawableTemplate divShapeDrawableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divShapeDrawableTemplate.f48794a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "shape", divShapeDrawableTemplate.f48795b, this.f65172a.W6());
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divShapeDrawableTemplate.f48796c, this.f65172a.D7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }

    public a9(JsonParserComponent jsonParserComponent) {
        this.f65172a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShapeDrawableTemplate deserialize(ParsingContext parsingContext, DivShapeDrawableTemplate divShapeDrawableTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Integer>> field;
        Field<DivShapeTemplate> field2;
        Field<DivStrokeTemplate> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        if (divShapeDrawableTemplate != null) {
            field = divShapeDrawableTemplate.f48794a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT);
        if (divShapeDrawableTemplate != null) {
            field2 = divShapeDrawableTemplate.f48795b;
        } else {
            field2 = null;
        }
        Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, field2, this.f65172a.W6());
        if (divShapeDrawableTemplate != null) {
            field3 = divShapeDrawableTemplate.f48796c;
        } else {
            field3 = null;
        }
        return new DivShapeDrawableTemplate(fieldWithExpression, field4, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, field3, this.f65172a.D7()));
    }
}
