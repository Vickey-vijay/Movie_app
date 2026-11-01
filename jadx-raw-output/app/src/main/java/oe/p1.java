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
import com.yandex.div2.DivActionSetStoredValueTemplate;
import com.yandex.div2.DivTypedValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65261a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "lifetime", divActionSetStoredValueTemplate.f46257a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", divActionSetStoredValueTemplate.f46258b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionSetStoredValueTemplate.f46259c, this.f65261a.i9());
        return jSONObject;
    }

    public p1(JsonParserComponent jsonParserComponent) {
        this.f65261a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetStoredValueTemplate deserialize(ParsingContext parsingContext, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Long>> field;
        Field<Expression<String>> field2;
        Field<DivTypedValueTemplate> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        if (divActionSetStoredValueTemplate != null) {
            field = divActionSetStoredValueTemplate.f46257a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "lifetime", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT);
        TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionSetStoredValueTemplate != null) {
            field2 = divActionSetStoredValueTemplate.f46258b;
        } else {
            field2 = null;
        }
        Field fieldWithExpression2 = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", typeHelper2, allowPropertyOverride, field2);
        if (divActionSetStoredValueTemplate != null) {
            field3 = divActionSetStoredValueTemplate.f46259c;
        } else {
            field3 = null;
        }
        return new DivActionSetStoredValueTemplate(fieldWithExpression, fieldWithExpression2, JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, field3, this.f65261a.i9()));
    }
}
