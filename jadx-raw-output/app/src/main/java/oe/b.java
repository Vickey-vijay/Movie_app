package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.ArrayValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65175a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ArrayValueTemplate arrayValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", arrayValueTemplate.f45878a);
        return jSONObject;
    }

    public b(JsonParserComponent jsonParserComponent) {
        this.f65175a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayValueTemplate deserialize(ParsingContext parsingContext, ArrayValueTemplate arrayValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<JSONArray>> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<JSONArray> typeHelper = TypeHelpersKt.TYPE_HELPER_JSON_ARRAY;
        if (arrayValueTemplate != null) {
            field = arrayValueTemplate.f45878a;
        } else {
            field = null;
        }
        return new ArrayValueTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field));
    }
}
