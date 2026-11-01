package oe;

import android.net.Uri;
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
import com.yandex.div2.DivAbsoluteEdgeInsetsTemplate;
import com.yandex.div2.DivNinePatchBackgroundTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s6 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65286a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divNinePatchBackgroundTemplate.f48082a, ParsingConvertersKt.URI_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "insets", divNinePatchBackgroundTemplate.f48083b, this.f65286a.F());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }

    public s6(JsonParserComponent jsonParserComponent) {
        this.f65286a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNinePatchBackgroundTemplate deserialize(ParsingContext parsingContext, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Uri>> field;
        Field<DivAbsoluteEdgeInsetsTemplate> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
        if (divNinePatchBackgroundTemplate != null) {
            field = divNinePatchBackgroundTemplate.f48082a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_URI);
        if (divNinePatchBackgroundTemplate != null) {
            field2 = divNinePatchBackgroundTemplate.f48083b;
        } else {
            field2 = null;
        }
        return new DivNinePatchBackgroundTemplate(fieldWithExpression, JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "insets", allowPropertyOverride, field2, this.f65286a.F()));
    }
}
