package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f2 implements TemplateResolver<JSONObject, DivInputValidatorTemplate, DivInputValidator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50628a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputValidator resolve(ParsingContext parsingContext, DivInputValidatorTemplate divInputValidatorTemplate, JSONObject jSONObject) throws ParsingException {
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.c) {
            return new DivInputValidator.c(this.f50628a.L4().getValue().resolve(parsingContext, ((DivInputValidatorTemplate.c) divInputValidatorTemplate).b(), jSONObject));
        }
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.b) {
            return new DivInputValidator.b(this.f50628a.F4().getValue().resolve(parsingContext, ((DivInputValidatorTemplate.b) divInputValidatorTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public f2(JsonParserComponent jsonParserComponent) {
        this.f50628a = jsonParserComponent;
    }
}
