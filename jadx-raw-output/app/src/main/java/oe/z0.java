package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionCopyToClipboard;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65336a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboard deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionCopyToClipboard((DivActionCopyToClipboardContent) JsonPropertyParser.read(parsingContext, jSONObject, "content", this.f65336a.c0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboard divActionCopyToClipboard) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "content", divActionCopyToClipboard.f46123a, this.f65336a.c0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }

    public z0(JsonParserComponent jsonParserComponent) {
        this.f65336a = jsonParserComponent;
    }
}
