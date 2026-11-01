package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50885a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivDataTemplate.StateTemplate stateTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", stateTemplate.f46968a, this.f50885a.N4());
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", stateTemplate.f46969b);
        return jSONObject;
    }

    public w0(JsonParserComponent jsonParserComponent) {
        this.f50885a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDataTemplate.StateTemplate deserialize(ParsingContext parsingContext, DivDataTemplate.StateTemplate stateTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivTemplate> field;
        Field<Long> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (stateTemplate != null) {
            field = stateTemplate.f46968a;
        } else {
            field = null;
        }
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, field, this.f50885a.N4());
        if (stateTemplate != null) {
            field2 = stateTemplate.f46969b;
        } else {
            field2 = null;
        }
        return new DivDataTemplate.StateTemplate(field3, JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT));
    }
}
