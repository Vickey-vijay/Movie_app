package oe;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivVideoSourceTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class yb implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65330a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVideoSourceTemplate deserialize(ParsingContext parsingContext, DivVideoSourceTemplate divVideoSourceTemplate, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivVideoSourceTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f50047a : null, ParsingConvertersKt.NUMBER_TO_INT), (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f50048b : null), (Field<DivVideoSourceTemplate.ResolutionTemplate>) JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "resolution", allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f50049c : null, this.f65330a.u9()), (Field<Expression<Uri>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f50050d : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivVideoSourceTemplate divVideoSourceTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, VastAttributes.BITRATE, divVideoSourceTemplate.f50047a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mime_type", divVideoSourceTemplate.f50048b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "resolution", divVideoSourceTemplate.f50049c, this.f65330a.u9());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divVideoSourceTemplate.f50050d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    public yb(JsonParserComponent jsonParserComponent) {
        this.f65330a = jsonParserComponent;
    }
}
