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
import com.yandex.div2.DivSizeUnitValueTemplate;
import com.yandex.div2.DivWrapContentSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class fc implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65199a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivWrapContentSizeTemplate divWrapContentSizeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "constrained", divWrapContentSizeTemplate.f50131a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", divWrapContentSizeTemplate.f50132b, this.f65199a.c7());
        JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", divWrapContentSizeTemplate.f50133c, this.f65199a.c7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }

    public fc(JsonParserComponent jsonParserComponent) {
        this.f65199a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivWrapContentSizeTemplate deserialize(ParsingContext parsingContext, DivWrapContentSizeTemplate divWrapContentSizeTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Boolean>> field;
        Field<DivSizeUnitValueTemplate> field2;
        Field<DivSizeUnitValueTemplate> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        if (divWrapContentSizeTemplate != null) {
            field = divWrapContentSizeTemplate.f50131a;
        } else {
            field = null;
        }
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "constrained", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_BOOLEAN);
        if (divWrapContentSizeTemplate != null) {
            field2 = divWrapContentSizeTemplate.f50132b;
        } else {
            field2 = null;
        }
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, field2, this.f65199a.c7());
        if (divWrapContentSizeTemplate != null) {
            field3 = divWrapContentSizeTemplate.f50133c;
        } else {
            field3 = null;
        }
        return new DivWrapContentSizeTemplate(optionalFieldWithExpression, optionalField, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, field3, this.f65199a.c7()));
    }
}
