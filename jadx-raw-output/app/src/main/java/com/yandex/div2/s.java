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
public final class s implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50852a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTypedTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivActionTypedTemplate divActionTypedTemplate = entityTemplate instanceof DivActionTypedTemplate ? (DivActionTypedTemplate) entityTemplate : null;
        if (divActionTypedTemplate != null && (type = divActionTypedTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1623648839:
                if (string.equals("set_variable")) {
                    return new DivActionTypedTemplate.q(this.f50852a.Q0().getValue().deserialize(parsingContext, (DivActionSetVariableTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -1623635702:
                if (string.equals("animator_start")) {
                    return new DivActionTypedTemplate.a(this.f50852a.L().getValue().deserialize(parsingContext, (DivActionAnimatorStartTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -1254965146:
                if (string.equals("clear_focus")) {
                    return new DivActionTypedTemplate.f(this.f50852a.a0().getValue().deserialize(parsingContext, (DivActionClearFocusTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -1160753574:
                if (string.equals("animator_stop")) {
                    return new DivActionTypedTemplate.b(this.f50852a.O().getValue().deserialize(parsingContext, (DivActionAnimatorStopTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -891535336:
                if (string.equals("submit")) {
                    return new DivActionTypedTemplate.s(this.f50852a.W0().getValue().deserialize(parsingContext, (DivActionSubmitTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -796594542:
                if (string.equals("set_stored_value")) {
                    return new DivActionTypedTemplate.p(this.f50852a.N0().getValue().deserialize(parsingContext, (DivActionSetStoredValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -404256420:
                if (string.equals("copy_to_clipboard")) {
                    return new DivActionTypedTemplate.h(this.f50852a.g0().getValue().deserialize(parsingContext, (DivActionCopyToClipboardTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -326583939:
                if (string.equals("update_structure")) {
                    return new DivActionTypedTemplate.u(this.f50852a.l1().getValue().deserialize(parsingContext, (DivActionUpdateStructureTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 10055918:
                if (string.equals("array_set_value")) {
                    return new DivActionTypedTemplate.e(this.f50852a.X().getValue().deserialize(parsingContext, (DivActionArraySetValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 110364485:
                if (string.equals("timer")) {
                    return new DivActionTypedTemplate.t(this.f50852a.f1().getValue().deserialize(parsingContext, (DivActionTimerTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new DivActionTypedTemplate.v(this.f50852a.o1().getValue().deserialize(parsingContext, (DivActionVideoTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 203934236:
                if (string.equals("array_remove_value")) {
                    return new DivActionTypedTemplate.d(this.f50852a.U().getValue().deserialize(parsingContext, (DivActionArrayRemoveValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 301532353:
                if (string.equals("show_tooltip")) {
                    return new DivActionTypedTemplate.r(this.f50852a.T0().getValue().deserialize(parsingContext, (DivActionShowTooltipTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 417790729:
                if (string.equals("scroll_by")) {
                    return new DivActionTypedTemplate.m(this.f50852a.B0().getValue().deserialize(parsingContext, (DivActionScrollByTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 417791277:
                if (string.equals("scroll_to")) {
                    return new DivActionTypedTemplate.n(this.f50852a.H0().getValue().deserialize(parsingContext, (DivActionScrollToTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 932090484:
                if (string.equals("set_state")) {
                    return new DivActionTypedTemplate.o(this.f50852a.K0().getValue().deserialize(parsingContext, (DivActionSetStateTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1427818632:
                if (string.equals(NativeAdPresenter.DOWNLOAD)) {
                    return new DivActionTypedTemplate.j(this.f50852a.m0().getValue().deserialize(parsingContext, (DivActionDownloadTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1550697109:
                if (string.equals("focus_element")) {
                    return new DivActionTypedTemplate.k(this.f50852a.p0().getValue().deserialize(parsingContext, (DivActionFocusElementTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1587919371:
                if (string.equals("dict_set_value")) {
                    return new DivActionTypedTemplate.i(this.f50852a.j0().getValue().deserialize(parsingContext, (DivActionDictSetValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1715728902:
                if (string.equals("hide_tooltip")) {
                    return new DivActionTypedTemplate.l(this.f50852a.s0().getValue().deserialize(parsingContext, (DivActionHideTooltipTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1811437713:
                if (string.equals("array_insert_value")) {
                    return new DivActionTypedTemplate.c(this.f50852a.R().getValue().deserialize(parsingContext, (DivActionArrayInsertValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionTypedTemplate divActionTypedTemplate) throws ParsingException {
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.a) {
            return this.f50852a.L().getValue().serialize(parsingContext, ((DivActionTypedTemplate.a) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.b) {
            return this.f50852a.O().getValue().serialize(parsingContext, ((DivActionTypedTemplate.b) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.c) {
            return this.f50852a.R().getValue().serialize(parsingContext, ((DivActionTypedTemplate.c) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.d) {
            return this.f50852a.U().getValue().serialize(parsingContext, ((DivActionTypedTemplate.d) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.e) {
            return this.f50852a.X().getValue().serialize(parsingContext, ((DivActionTypedTemplate.e) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.f) {
            return this.f50852a.a0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.f) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.h) {
            return this.f50852a.g0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.h) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.i) {
            return this.f50852a.j0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.i) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.j) {
            return this.f50852a.m0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.j) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.k) {
            return this.f50852a.p0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.k) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.l) {
            return this.f50852a.s0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.l) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.m) {
            return this.f50852a.B0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.m) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.n) {
            return this.f50852a.H0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.n) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.o) {
            return this.f50852a.K0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.o) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.p) {
            return this.f50852a.N0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.p) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.q) {
            return this.f50852a.Q0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.q) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.r) {
            return this.f50852a.T0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.r) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.s) {
            return this.f50852a.W0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.s) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.t) {
            return this.f50852a.f1().getValue().serialize(parsingContext, ((DivActionTypedTemplate.t) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.u) {
            return this.f50852a.l1().getValue().serialize(parsingContext, ((DivActionTypedTemplate.u) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.v) {
            return this.f50852a.o1().getValue().serialize(parsingContext, ((DivActionTypedTemplate.v) divActionTypedTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public s(JsonParserComponent jsonParserComponent) {
        this.f50852a = jsonParserComponent;
    }
}
