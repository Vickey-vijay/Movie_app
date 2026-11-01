package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValueJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f5 implements TemplateResolver<JSONObject, DivTypedValueTemplate, DivTypedValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50631a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTypedValue resolve(ParsingContext parsingContext, DivTypedValueTemplate divTypedValueTemplate, JSONObject jSONObject) throws ParsingException {
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.h) {
            return new DivTypedValue.h(this.f50631a.fa().getValue().resolve(parsingContext, ((DivTypedValueTemplate.h) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.f) {
            return new DivTypedValue.f(this.f50631a.K9().getValue().resolve(parsingContext, ((DivTypedValueTemplate.f) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.g) {
            return new DivTypedValue.g(this.f50631a.Q9().getValue().resolve(parsingContext, ((DivTypedValueTemplate.g) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.c) {
            return new DivTypedValue.c(this.f50631a.o().getValue().resolve(parsingContext, ((DivTypedValueTemplate.c) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.b) {
            return new DivTypedValue.b(this.f50631a.i().getValue().resolve(parsingContext, ((DivTypedValueTemplate.b) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.i) {
            return new DivTypedValue.i(this.f50631a.la().getValue().resolve(parsingContext, ((DivTypedValueTemplate.i) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.e) {
            return new DivTypedValue.e(this.f50631a.A().getValue().resolve(parsingContext, ((DivTypedValueTemplate.e) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.a) {
            return new DivTypedValue.a(this.f50631a.c().getValue().resolve(parsingContext, ((DivTypedValueTemplate.a) divTypedValueTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public f5(JsonParserComponent jsonParserComponent) {
        this.f50631a = jsonParserComponent;
    }
}
