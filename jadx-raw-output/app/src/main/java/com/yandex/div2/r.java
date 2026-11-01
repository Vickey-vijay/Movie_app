package com.yandex.div2;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50835a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTyped deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1623648839:
                if (string.equals("set_variable")) {
                    return new DivActionTyped.q(this.f50835a.P0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -1623635702:
                if (string.equals("animator_start")) {
                    return new DivActionTyped.a(this.f50835a.K().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -1254965146:
                if (string.equals("clear_focus")) {
                    return new DivActionTyped.f(this.f50835a.Z().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -1160753574:
                if (string.equals("animator_stop")) {
                    return new DivActionTyped.b(this.f50835a.N().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -891535336:
                if (string.equals("submit")) {
                    return new DivActionTyped.s(this.f50835a.V0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -796594542:
                if (string.equals("set_stored_value")) {
                    return new DivActionTyped.p(this.f50835a.M0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -404256420:
                if (string.equals("copy_to_clipboard")) {
                    return new DivActionTyped.h(this.f50835a.f0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -326583939:
                if (string.equals("update_structure")) {
                    return new DivActionTyped.u(this.f50835a.k1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 10055918:
                if (string.equals("array_set_value")) {
                    return new DivActionTyped.e(this.f50835a.W().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 110364485:
                if (string.equals("timer")) {
                    return new DivActionTyped.t(this.f50835a.e1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new DivActionTyped.v(this.f50835a.n1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 203934236:
                if (string.equals("array_remove_value")) {
                    return new DivActionTyped.d(this.f50835a.T().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 301532353:
                if (string.equals("show_tooltip")) {
                    return new DivActionTyped.r(this.f50835a.S0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 417790729:
                if (string.equals("scroll_by")) {
                    return new DivActionTyped.m(this.f50835a.A0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 417791277:
                if (string.equals("scroll_to")) {
                    return new DivActionTyped.n(this.f50835a.G0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 932090484:
                if (string.equals("set_state")) {
                    return new DivActionTyped.o(this.f50835a.J0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1427818632:
                if (string.equals(NativeAdPresenter.DOWNLOAD)) {
                    return new DivActionTyped.j(this.f50835a.l0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1550697109:
                if (string.equals("focus_element")) {
                    return new DivActionTyped.k(this.f50835a.o0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1587919371:
                if (string.equals("dict_set_value")) {
                    return new DivActionTyped.i(this.f50835a.i0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1715728902:
                if (string.equals("hide_tooltip")) {
                    return new DivActionTyped.l(this.f50835a.r0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1811437713:
                if (string.equals("array_insert_value")) {
                    return new DivActionTyped.c(this.f50835a.Q().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivActionTypedTemplate divActionTypedTemplate = orThrow instanceof DivActionTypedTemplate ? (DivActionTypedTemplate) orThrow : null;
        if (divActionTypedTemplate != null) {
            return this.f50835a.j1().getValue().resolve(parsingContext, divActionTypedTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionTyped divActionTyped) throws ParsingException {
        if (divActionTyped instanceof DivActionTyped.a) {
            return this.f50835a.K().getValue().serialize(parsingContext, ((DivActionTyped.a) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.b) {
            return this.f50835a.N().getValue().serialize(parsingContext, ((DivActionTyped.b) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.c) {
            return this.f50835a.Q().getValue().serialize(parsingContext, ((DivActionTyped.c) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.d) {
            return this.f50835a.T().getValue().serialize(parsingContext, ((DivActionTyped.d) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.e) {
            return this.f50835a.W().getValue().serialize(parsingContext, ((DivActionTyped.e) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.f) {
            return this.f50835a.Z().getValue().serialize(parsingContext, ((DivActionTyped.f) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.h) {
            return this.f50835a.f0().getValue().serialize(parsingContext, ((DivActionTyped.h) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.i) {
            return this.f50835a.i0().getValue().serialize(parsingContext, ((DivActionTyped.i) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.j) {
            return this.f50835a.l0().getValue().serialize(parsingContext, ((DivActionTyped.j) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.k) {
            return this.f50835a.o0().getValue().serialize(parsingContext, ((DivActionTyped.k) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.l) {
            return this.f50835a.r0().getValue().serialize(parsingContext, ((DivActionTyped.l) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.m) {
            return this.f50835a.A0().getValue().serialize(parsingContext, ((DivActionTyped.m) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.n) {
            return this.f50835a.G0().getValue().serialize(parsingContext, ((DivActionTyped.n) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.o) {
            return this.f50835a.J0().getValue().serialize(parsingContext, ((DivActionTyped.o) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.p) {
            return this.f50835a.M0().getValue().serialize(parsingContext, ((DivActionTyped.p) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.q) {
            return this.f50835a.P0().getValue().serialize(parsingContext, ((DivActionTyped.q) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.r) {
            return this.f50835a.S0().getValue().serialize(parsingContext, ((DivActionTyped.r) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.s) {
            return this.f50835a.V0().getValue().serialize(parsingContext, ((DivActionTyped.s) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.t) {
            return this.f50835a.e1().getValue().serialize(parsingContext, ((DivActionTyped.t) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.u) {
            return this.f50835a.k1().getValue().serialize(parsingContext, ((DivActionTyped.u) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.v) {
            return this.f50835a.n1().getValue().serialize(parsingContext, ((DivActionTyped.v) divActionTyped).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public r(JsonParserComponent jsonParserComponent) {
        this.f50835a = jsonParserComponent;
    }
}
