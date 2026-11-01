package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x1 implements TemplateResolver<JSONObject, DivInputMaskTemplate, DivInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50904a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputMask resolve(ParsingContext parsingContext, DivInputMaskTemplate divInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.c) {
            return new DivInputMask.c(this.f50904a.s3().getValue().resolve(parsingContext, ((DivInputMaskTemplate.c) divInputMaskTemplate).b(), jSONObject));
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.b) {
            return new DivInputMask.b(this.f50904a.A2().getValue().resolve(parsingContext, ((DivInputMaskTemplate.b) divInputMaskTemplate).b(), jSONObject));
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.d) {
            return new DivInputMask.d(this.f50904a.P5().getValue().resolve(parsingContext, ((DivInputMaskTemplate.d) divInputMaskTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public x1(JsonParserComponent jsonParserComponent) {
        this.f50904a = jsonParserComponent;
    }
}
