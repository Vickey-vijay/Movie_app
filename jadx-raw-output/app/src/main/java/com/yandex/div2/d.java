package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements TemplateResolver<JSONObject, DivActionCopyToClipboardContentTemplate, DivActionCopyToClipboardContent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50599a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardContent resolve(ParsingContext parsingContext, DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate, JSONObject jSONObject) throws ParsingException {
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.b) {
            return new DivActionCopyToClipboardContent.b(this.f50599a.u().getValue().resolve(parsingContext, ((DivActionCopyToClipboardContentTemplate.b) divActionCopyToClipboardContentTemplate).b(), jSONObject));
        }
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.c) {
            return new DivActionCopyToClipboardContent.c(this.f50599a.x().getValue().resolve(parsingContext, ((DivActionCopyToClipboardContentTemplate.c) divActionCopyToClipboardContentTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public d(JsonParserComponent jsonParserComponent) {
        this.f50599a = jsonParserComponent;
    }
}
