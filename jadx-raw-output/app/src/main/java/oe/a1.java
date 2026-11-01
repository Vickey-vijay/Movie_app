package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionCopyToClipboardContentTemplate;
import com.yandex.div2.DivActionCopyToClipboardTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65168a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "content", divActionCopyToClipboardTemplate.f46136a, this.f65168a.d0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }

    public a1(JsonParserComponent jsonParserComponent) {
        this.f65168a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardTemplate deserialize(ParsingContext parsingContext, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivActionCopyToClipboardContentTemplate> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divActionCopyToClipboardTemplate != null) {
            field = divActionCopyToClipboardTemplate.f46136a;
        } else {
            field = null;
        }
        return new DivActionCopyToClipboardTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "content", allowPropertyOverride, field, this.f65168a.d0()));
    }
}
