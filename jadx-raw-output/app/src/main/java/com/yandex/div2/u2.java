package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class u2 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50875a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPatchTemplate.ChangeTemplate changeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", changeTemplate.f48367a);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "items", changeTemplate.f48368b, this.f50875a.N4());
        return jSONObject;
    }

    public u2(JsonParserComponent jsonParserComponent) {
        this.f50875a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPatchTemplate.ChangeTemplate deserialize(ParsingContext parsingContext, DivPatchTemplate.ChangeTemplate changeTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        Field<List<DivTemplate>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (changeTemplate != null) {
            field = changeTemplate.f48367a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, field);
        if (changeTemplate != null) {
            field2 = changeTemplate.f48368b;
        } else {
            field2 = null;
        }
        return new DivPatchTemplate.ChangeTemplate(field3, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field2, this.f50875a.N4()));
    }
}
