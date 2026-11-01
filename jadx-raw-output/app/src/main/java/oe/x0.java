package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionClearFocusTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionClearFocusJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65318a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionClearFocusTemplate deserialize(ParsingContext parsingContext, DivActionClearFocusTemplate divActionClearFocusTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionClearFocusTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionClearFocusTemplate divActionClearFocusTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "clear_focus");
        return jSONObject;
    }

    public x0(JsonParserComponent jsonParserComponent) {
        this.f65318a = jsonParserComponent;
    }
}
