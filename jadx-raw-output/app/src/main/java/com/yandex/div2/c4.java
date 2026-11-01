package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c4 implements TemplateResolver<JSONObject, DivStrokeStyleTemplate, DivStrokeStyle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50592a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyle resolve(ParsingContext parsingContext, DivStrokeStyleTemplate divStrokeStyleTemplate, JSONObject jSONObject) throws ParsingException {
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.c) {
            return new DivStrokeStyle.c(this.f50592a.N7().getValue().resolve(parsingContext, ((DivStrokeStyleTemplate.c) divStrokeStyleTemplate).b(), jSONObject));
        }
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.b) {
            return new DivStrokeStyle.b(this.f50592a.H7().getValue().resolve(parsingContext, ((DivStrokeStyleTemplate.b) divStrokeStyleTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public c4(JsonParserComponent jsonParserComponent) {
        this.f50592a = jsonParserComponent;
    }
}
