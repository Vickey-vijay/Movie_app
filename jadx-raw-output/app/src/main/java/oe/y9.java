package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivStrokeStyleDashed;
import com.yandex.div2.DivStrokeStyleDashedTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleDashedJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y9 implements TemplateResolver<JSONObject, DivStrokeStyleDashedTemplate, DivStrokeStyleDashed> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65329a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleDashed resolve(ParsingContext parsingContext, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivStrokeStyleDashed();
    }

    public y9(JsonParserComponent jsonParserComponent) {
        this.f65329a = jsonParserComponent;
    }
}
