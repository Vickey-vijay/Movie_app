package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFilterRtlMirror;
import com.yandex.div2.DivFilterRtlMirrorTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirrorJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a4 implements TemplateResolver<JSONObject, DivFilterRtlMirrorTemplate, DivFilterRtlMirror> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65170a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilterRtlMirror resolve(ParsingContext parsingContext, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivFilterRtlMirror();
    }

    public a4(JsonParserComponent jsonParserComponent) {
        this.f65170a = jsonParserComponent;
    }
}
