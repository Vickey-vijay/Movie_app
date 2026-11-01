package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivStrokeStyleSolid;
import com.yandex.div2.DivStrokeStyleSolidTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleSolidJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ba implements TemplateResolver<JSONObject, DivStrokeStyleSolidTemplate, DivStrokeStyleSolid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65180a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleSolid resolve(ParsingContext parsingContext, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivStrokeStyleSolid();
    }

    public ba(JsonParserComponent jsonParserComponent) {
        this.f65180a = jsonParserComponent;
    }
}
