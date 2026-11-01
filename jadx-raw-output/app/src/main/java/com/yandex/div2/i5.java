package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVariableJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i5 implements TemplateResolver<JSONObject, DivVariableTemplate, DivVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50695a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVariable resolve(ParsingContext parsingContext, DivVariableTemplate divVariableTemplate, JSONObject jSONObject) throws ParsingException {
        if (divVariableTemplate instanceof DivVariableTemplate.i) {
            return new DivVariable.i(this.f50695a.ia().getValue().resolve(parsingContext, ((DivVariableTemplate.i) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.g) {
            return new DivVariable.g(this.f50695a.T9().getValue().resolve(parsingContext, ((DivVariableTemplate.g) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.f) {
            return new DivVariable.f(this.f50695a.N9().getValue().resolve(parsingContext, ((DivVariableTemplate.f) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.b) {
            return new DivVariable.b(this.f50695a.l().getValue().resolve(parsingContext, ((DivVariableTemplate.b) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.c) {
            return new DivVariable.c(this.f50695a.r().getValue().resolve(parsingContext, ((DivVariableTemplate.c) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.j) {
            return new DivVariable.j(this.f50695a.oa().getValue().resolve(parsingContext, ((DivVariableTemplate.j) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.e) {
            return new DivVariable.e(this.f50695a.D().getValue().resolve(parsingContext, ((DivVariableTemplate.e) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.a) {
            return new DivVariable.a(this.f50695a.f().getValue().resolve(parsingContext, ((DivVariableTemplate.a) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.h) {
            return new DivVariable.h(this.f50695a.Z9().getValue().resolve(parsingContext, ((DivVariableTemplate.h) divVariableTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public i5(JsonParserComponent jsonParserComponent) {
        this.f50695a = jsonParserComponent;
    }
}
