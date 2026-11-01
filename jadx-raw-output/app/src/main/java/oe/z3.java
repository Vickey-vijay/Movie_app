package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivFilterRtlMirrorTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirrorJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65338a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilterRtlMirrorTemplate deserialize(ParsingContext parsingContext, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivFilterRtlMirrorTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }

    public z3(JsonParserComponent jsonParserComponent) {
        this.f65338a = jsonParserComponent;
    }
}
