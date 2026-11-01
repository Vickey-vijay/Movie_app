package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionDownload;
import com.yandex.div2.DivActionDownloadTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements TemplateResolver<JSONObject, DivActionDownloadTemplate, DivActionDownload> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65208a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDownload resolve(ParsingContext parsingContext, DivActionDownloadTemplate divActionDownloadTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionDownload(JsonFieldResolver.resolveOptionalList(parsingContext, divActionDownloadTemplate.f46156a, jSONObject, "on_fail_actions", this.f65208a.w0(), this.f65208a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divActionDownloadTemplate.f46157b, jSONObject, "on_success_actions", this.f65208a.w0(), this.f65208a.u0()), JsonFieldResolver.resolveExpression(parsingContext, divActionDownloadTemplate.f46158c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    public h1(JsonParserComponent jsonParserComponent) {
        this.f65208a = jsonParserComponent;
    }
}
