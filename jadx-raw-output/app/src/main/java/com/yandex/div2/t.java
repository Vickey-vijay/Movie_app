package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements TemplateResolver<JSONObject, DivActionTypedTemplate, DivActionTyped> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50862a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTyped resolve(ParsingContext parsingContext, DivActionTypedTemplate divActionTypedTemplate, JSONObject jSONObject) throws ParsingException {
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.a) {
            return new DivActionTyped.a(this.f50862a.M().getValue().resolve(parsingContext, ((DivActionTypedTemplate.a) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.b) {
            return new DivActionTyped.b(this.f50862a.P().getValue().resolve(parsingContext, ((DivActionTypedTemplate.b) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.c) {
            return new DivActionTyped.c(this.f50862a.S().getValue().resolve(parsingContext, ((DivActionTypedTemplate.c) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.d) {
            return new DivActionTyped.d(this.f50862a.V().getValue().resolve(parsingContext, ((DivActionTypedTemplate.d) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.e) {
            return new DivActionTyped.e(this.f50862a.Y().getValue().resolve(parsingContext, ((DivActionTypedTemplate.e) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.f) {
            return new DivActionTyped.f(this.f50862a.b0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.f) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.h) {
            return new DivActionTyped.h(this.f50862a.h0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.h) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.i) {
            return new DivActionTyped.i(this.f50862a.k0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.i) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.j) {
            return new DivActionTyped.j(this.f50862a.n0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.j) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.k) {
            return new DivActionTyped.k(this.f50862a.q0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.k) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.l) {
            return new DivActionTyped.l(this.f50862a.t0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.l) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.m) {
            return new DivActionTyped.m(this.f50862a.C0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.m) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.n) {
            return new DivActionTyped.n(this.f50862a.I0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.n) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.o) {
            return new DivActionTyped.o(this.f50862a.L0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.o) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.p) {
            return new DivActionTyped.p(this.f50862a.O0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.p) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.q) {
            return new DivActionTyped.q(this.f50862a.R0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.q) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.r) {
            return new DivActionTyped.r(this.f50862a.U0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.r) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.s) {
            return new DivActionTyped.s(this.f50862a.X0().getValue().resolve(parsingContext, ((DivActionTypedTemplate.s) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.t) {
            return new DivActionTyped.t(this.f50862a.g1().getValue().resolve(parsingContext, ((DivActionTypedTemplate.t) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.u) {
            return new DivActionTyped.u(this.f50862a.m1().getValue().resolve(parsingContext, ((DivActionTypedTemplate.u) divActionTypedTemplate).b(), jSONObject));
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.v) {
            return new DivActionTyped.v(this.f50862a.p1().getValue().resolve(parsingContext, ((DivActionTypedTemplate.v) divActionTypedTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public t(JsonParserComponent jsonParserComponent) {
        this.f50862a = jsonParserComponent;
    }
}
