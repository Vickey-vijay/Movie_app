package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.DivDownloadCallbacksTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l3 implements TemplateResolver<JSONObject, DivDownloadCallbacksTemplate, DivDownloadCallbacks> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65233a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDownloadCallbacks resolve(ParsingContext parsingContext, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivDownloadCallbacks(JsonFieldResolver.resolveOptionalList(parsingContext, divDownloadCallbacksTemplate.f47038a, jSONObject, "on_fail_actions", this.f65233a.w0(), this.f65233a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divDownloadCallbacksTemplate.f47039b, jSONObject, "on_success_actions", this.f65233a.w0(), this.f65233a.u0()));
    }

    public l3(JsonParserComponent jsonParserComponent) {
        this.f65233a = jsonParserComponent;
    }
}
