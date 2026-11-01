package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivDownloadCallbacksTemplate;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65228a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divDownloadCallbacksTemplate.f47038a, this.f65228a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divDownloadCallbacksTemplate.f47039b, this.f65228a.v0());
        return jSONObject;
    }

    public k3(JsonParserComponent jsonParserComponent) {
        this.f65228a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDownloadCallbacksTemplate deserialize(ParsingContext parsingContext, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, JSONObject jSONObject) throws ParsingException {
        Field<List<DivActionTemplate>> field;
        Field<List<DivActionTemplate>> field2;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divDownloadCallbacksTemplate != null) {
            field = divDownloadCallbacksTemplate.f47038a;
        } else {
            field = null;
        }
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field, this.f65228a.v0());
        if (divDownloadCallbacksTemplate != null) {
            field2 = divDownloadCallbacksTemplate.f47039b;
        } else {
            field2 = null;
        }
        return new DivDownloadCallbacksTemplate(optionalListField, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, field2, this.f65228a.v0()));
    }
}
