package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50906a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStateTemplate.StateTemplate deserialize(ParsingContext parsingContext, DivStateTemplate.StateTemplate stateTemplate, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivStateTemplate.StateTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, stateTemplate != null ? stateTemplate.f49108a : null, this.f50906a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, stateTemplate != null ? stateTemplate.f49109b : null, this.f50906a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, stateTemplate != null ? stateTemplate.f49110c : null, this.f50906a.N4()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, stateTemplate != null ? stateTemplate.f49111d : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "swipe_out_actions", allowPropertyOverride, stateTemplate != null ? stateTemplate.f49112e : null, this.f50906a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivStateTemplate.StateTemplate stateTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", stateTemplate.f49108a, this.f50906a.r1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", stateTemplate.f49109b, this.f50906a.r1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", stateTemplate.f49110c, this.f50906a.N4());
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", stateTemplate.f49111d);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "swipe_out_actions", stateTemplate.f49112e, this.f50906a.v0());
        return jSONObject;
    }

    public x3(JsonParserComponent jsonParserComponent) {
        this.f50906a = jsonParserComponent;
    }
}
