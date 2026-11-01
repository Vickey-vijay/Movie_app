package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.impl.A2;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65203a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocusTemplate deserialize(ParsingContext parsingContext, DivFocusTemplate divFocusTemplate, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivFocusTemplate(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f47220a : null, this.f65203a.G1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f47221b : null, this.f65203a.M1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "next_focus_ids", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f47222c : null, this.f65203a.D3()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_blur", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f47223d : null, this.f65203a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_focus", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f47224e : null, this.f65203a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFocusTemplate divFocusTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divFocusTemplate.f47220a, this.f65203a.G1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "border", divFocusTemplate.f47221b, this.f65203a.M1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "next_focus_ids", divFocusTemplate.f47222c, this.f65203a.D3());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_blur", divFocusTemplate.f47223d, this.f65203a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_focus", divFocusTemplate.f47224e, this.f65203a.v0());
        return jSONObject;
    }

    public g4(JsonParserComponent jsonParserComponent) {
        this.f65203a = jsonParserComponent;
    }
}
