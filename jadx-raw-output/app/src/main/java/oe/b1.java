package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionCopyToClipboard;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.DivActionCopyToClipboardTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements TemplateResolver<JSONObject, DivActionCopyToClipboardTemplate, DivActionCopyToClipboard> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65177a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboard resolve(ParsingContext parsingContext, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionCopyToClipboard((DivActionCopyToClipboardContent) JsonFieldResolver.resolve(parsingContext, divActionCopyToClipboardTemplate.f46136a, jSONObject, "content", this.f65177a.e0(), this.f65177a.c0()));
    }

    public b1(JsonParserComponent jsonParserComponent) {
        this.f65177a = jsonParserComponent;
    }
}
