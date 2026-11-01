package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunctionArgumentTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65215a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFunctionArgumentTemplate divFunctionArgumentTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", divFunctionArgumentTemplate.f47247a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "type", divFunctionArgumentTemplate.f47248b, DivEvaluableType.TO_STRING);
        return jSONObject;
    }

    public i4(JsonParserComponent jsonParserComponent) {
        this.f65215a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFunctionArgumentTemplate deserialize(ParsingContext parsingContext, DivFunctionArgumentTemplate divFunctionArgumentTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<DivEvaluableType> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divFunctionArgumentTemplate != null) {
            field = divFunctionArgumentTemplate.f47247a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field);
        if (divFunctionArgumentTemplate != null) {
            field2 = divFunctionArgumentTemplate.f47248b;
        } else {
            field2 = null;
        }
        return new DivFunctionArgumentTemplate(field3, JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, field2, DivEvaluableType.FROM_STRING));
    }
}
