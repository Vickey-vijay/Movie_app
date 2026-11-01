package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class j2 implements TemplateResolver<JSONObject, DivTemplate, Div> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50699a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Div resolve(ParsingContext parsingContext, DivTemplate divTemplate, JSONObject jSONObject) throws ParsingException {
        if (divTemplate instanceof DivTemplate.g) {
            return new Div.g(this.f50699a.Z3().getValue().resolve(parsingContext, ((DivTemplate.g) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.e) {
            return new Div.e(this.f50699a.Q3().getValue().resolve(parsingContext, ((DivTemplate.e) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.q) {
            return new Div.q(this.f50699a.r8().getValue().resolve(parsingContext, ((DivTemplate.q) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.l) {
            return new Div.l(this.f50699a.O6().getValue().resolve(parsingContext, ((DivTemplate.l) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.b) {
            return new Div.b(this.f50699a.o2().getValue().resolve(parsingContext, ((DivTemplate.b) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.f) {
            return new Div.f(this.f50699a.T3().getValue().resolve(parsingContext, ((DivTemplate.f) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.d) {
            return new Div.d(this.f50699a.N3().getValue().resolve(parsingContext, ((DivTemplate.d) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.j) {
            return new Div.j(this.f50699a.B5().getValue().resolve(parsingContext, ((DivTemplate.j) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.p) {
            return new Div.p(this.f50699a.W7().getValue().resolve(parsingContext, ((DivTemplate.p) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.n) {
            return new Div.n(this.f50699a.v7().getValue().resolve(parsingContext, ((DivTemplate.n) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.c) {
            return new Div.c(this.f50699a.D2().getValue().resolve(parsingContext, ((DivTemplate.c) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.h) {
            return new Div.h(this.f50699a.f4().getValue().resolve(parsingContext, ((DivTemplate.h) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.m) {
            return new Div.m(this.f50699a.j7().getValue().resolve(parsingContext, ((DivTemplate.m) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.o) {
            return new Div.o(this.f50699a.Q7().getValue().resolve(parsingContext, ((DivTemplate.o) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.i) {
            return new Div.i(this.f50699a.u4().getValue().resolve(parsingContext, ((DivTemplate.i) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.k) {
            return new Div.k(this.f50699a.F6().getValue().resolve(parsingContext, ((DivTemplate.k) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.r) {
            return new Div.r(this.f50699a.p9().getValue().resolve(parsingContext, ((DivTemplate.r) divTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public j2(JsonParserComponent jsonParserComponent) {
        this.f50699a = jsonParserComponent;
    }
}
