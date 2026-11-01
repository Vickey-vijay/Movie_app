package com.yandex.div2;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DivActionTypedTemplate implements JSONSerializable, JsonTemplate<DivActionTyped> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f46378a = new g(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionTypedTemplate> f46379b = new bk.p<ParsingEnvironment, JSONObject, DivActionTypedTemplate>() { // from class: com.yandex.div2.DivActionTypedTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTypedTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionTypedTemplate.g.b(DivActionTypedTemplate.f46378a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class a extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionAnimatorStartTemplate f46380c;

        public a(DivActionAnimatorStartTemplate divActionAnimatorStartTemplate) {
            super(null);
            this.f46380c = divActionAnimatorStartTemplate;
        }

        public final DivActionAnimatorStartTemplate b() {
            return this.f46380c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class b extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionAnimatorStopTemplate f46381c;

        public b(DivActionAnimatorStopTemplate divActionAnimatorStopTemplate) {
            super(null);
            this.f46381c = divActionAnimatorStopTemplate;
        }

        public final DivActionAnimatorStopTemplate b() {
            return this.f46381c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class c extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionArrayInsertValueTemplate f46382c;

        public c(DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate) {
            super(null);
            this.f46382c = divActionArrayInsertValueTemplate;
        }

        public final DivActionArrayInsertValueTemplate b() {
            return this.f46382c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class d extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionArrayRemoveValueTemplate f46383c;

        public d(DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate) {
            super(null);
            this.f46383c = divActionArrayRemoveValueTemplate;
        }

        public final DivActionArrayRemoveValueTemplate b() {
            return this.f46383c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class e extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionArraySetValueTemplate f46384c;

        public e(DivActionArraySetValueTemplate divActionArraySetValueTemplate) {
            super(null);
            this.f46384c = divActionArraySetValueTemplate;
        }

        public final DivActionArraySetValueTemplate b() {
            return this.f46384c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class f extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionClearFocusTemplate f46385c;

        public f(DivActionClearFocusTemplate divActionClearFocusTemplate) {
            super(null);
            this.f46385c = divActionClearFocusTemplate;
        }

        public final DivActionClearFocusTemplate b() {
            return this.f46385c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class g {
        public g() {
        }

        public /* synthetic */ g(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivActionTypedTemplate b(g gVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return gVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivActionTypedTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().i1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class h extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionCopyToClipboardTemplate f46386c;

        public h(DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate) {
            super(null);
            this.f46386c = divActionCopyToClipboardTemplate;
        }

        public final DivActionCopyToClipboardTemplate b() {
            return this.f46386c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class i extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionDictSetValueTemplate f46387c;

        public i(DivActionDictSetValueTemplate divActionDictSetValueTemplate) {
            super(null);
            this.f46387c = divActionDictSetValueTemplate;
        }

        public final DivActionDictSetValueTemplate b() {
            return this.f46387c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class j extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionDownloadTemplate f46388c;

        public j(DivActionDownloadTemplate divActionDownloadTemplate) {
            super(null);
            this.f46388c = divActionDownloadTemplate;
        }

        public final DivActionDownloadTemplate b() {
            return this.f46388c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class k extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionFocusElementTemplate f46389c;

        public k(DivActionFocusElementTemplate divActionFocusElementTemplate) {
            super(null);
            this.f46389c = divActionFocusElementTemplate;
        }

        public final DivActionFocusElementTemplate b() {
            return this.f46389c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class l extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionHideTooltipTemplate f46390c;

        public l(DivActionHideTooltipTemplate divActionHideTooltipTemplate) {
            super(null);
            this.f46390c = divActionHideTooltipTemplate;
        }

        public final DivActionHideTooltipTemplate b() {
            return this.f46390c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class m extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionScrollByTemplate f46391c;

        public m(DivActionScrollByTemplate divActionScrollByTemplate) {
            super(null);
            this.f46391c = divActionScrollByTemplate;
        }

        public final DivActionScrollByTemplate b() {
            return this.f46391c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class n extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionScrollToTemplate f46392c;

        public n(DivActionScrollToTemplate divActionScrollToTemplate) {
            super(null);
            this.f46392c = divActionScrollToTemplate;
        }

        public final DivActionScrollToTemplate b() {
            return this.f46392c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class o extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionSetStateTemplate f46393c;

        public o(DivActionSetStateTemplate divActionSetStateTemplate) {
            super(null);
            this.f46393c = divActionSetStateTemplate;
        }

        public final DivActionSetStateTemplate b() {
            return this.f46393c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class p extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionSetStoredValueTemplate f46394c;

        public p(DivActionSetStoredValueTemplate divActionSetStoredValueTemplate) {
            super(null);
            this.f46394c = divActionSetStoredValueTemplate;
        }

        public final DivActionSetStoredValueTemplate b() {
            return this.f46394c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class q extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionSetVariableTemplate f46395c;

        public q(DivActionSetVariableTemplate divActionSetVariableTemplate) {
            super(null);
            this.f46395c = divActionSetVariableTemplate;
        }

        public final DivActionSetVariableTemplate b() {
            return this.f46395c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class r extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionShowTooltipTemplate f46396c;

        public r(DivActionShowTooltipTemplate divActionShowTooltipTemplate) {
            super(null);
            this.f46396c = divActionShowTooltipTemplate;
        }

        public final DivActionShowTooltipTemplate b() {
            return this.f46396c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class s extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionSubmitTemplate f46397c;

        public s(DivActionSubmitTemplate divActionSubmitTemplate) {
            super(null);
            this.f46397c = divActionSubmitTemplate;
        }

        public final DivActionSubmitTemplate b() {
            return this.f46397c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class t extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionTimerTemplate f46398c;

        public t(DivActionTimerTemplate divActionTimerTemplate) {
            super(null);
            this.f46398c = divActionTimerTemplate;
        }

        public final DivActionTimerTemplate b() {
            return this.f46398c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class u extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionUpdateStructureTemplate f46399c;

        public u(DivActionUpdateStructureTemplate divActionUpdateStructureTemplate) {
            super(null);
            this.f46399c = divActionUpdateStructureTemplate;
        }

        public final DivActionUpdateStructureTemplate b() {
            return this.f46399c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class v extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivActionVideoTemplate f46400c;

        public v(DivActionVideoTemplate divActionVideoTemplate) {
            super(null);
            this.f46400c = divActionVideoTemplate;
        }

        public final DivActionVideoTemplate b() {
            return this.f46400c;
        }
    }

    public DivActionTypedTemplate() {
    }

    public /* synthetic */ DivActionTypedTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof h) {
            return ((h) this).b();
        }
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof j) {
            return ((j) this).b();
        }
        if (this instanceof k) {
            return ((k) this).b();
        }
        if (this instanceof l) {
            return ((l) this).b();
        }
        if (this instanceof m) {
            return ((m) this).b();
        }
        if (this instanceof n) {
            return ((n) this).b();
        }
        if (this instanceof o) {
            return ((o) this).b();
        }
        if (this instanceof p) {
            return ((p) this).b();
        }
        if (this instanceof q) {
            return ((q) this).b();
        }
        if (this instanceof r) {
            return ((r) this).b();
        }
        if (this instanceof s) {
            return ((s) this).b();
        }
        if (this instanceof t) {
            return ((t) this).b();
        }
        if (this instanceof u) {
            return ((u) this).b();
        }
        if (this instanceof v) {
            return ((v) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof a) {
            return "animator_start";
        }
        if (this instanceof b) {
            return "animator_stop";
        }
        if (this instanceof c) {
            return "array_insert_value";
        }
        if (this instanceof d) {
            return "array_remove_value";
        }
        if (this instanceof e) {
            return "array_set_value";
        }
        if (this instanceof f) {
            return "clear_focus";
        }
        if (this instanceof h) {
            return "copy_to_clipboard";
        }
        if (this instanceof i) {
            return "dict_set_value";
        }
        if (this instanceof j) {
            return NativeAdPresenter.DOWNLOAD;
        }
        if (this instanceof k) {
            return "focus_element";
        }
        if (this instanceof l) {
            return "hide_tooltip";
        }
        if (this instanceof m) {
            return "scroll_by";
        }
        if (this instanceof n) {
            return "scroll_to";
        }
        if (this instanceof o) {
            return "set_state";
        }
        if (this instanceof p) {
            return "set_stored_value";
        }
        if (this instanceof q) {
            return "set_variable";
        }
        if (this instanceof r) {
            return "show_tooltip";
        }
        if (this instanceof s) {
            return "submit";
        }
        if (this instanceof t) {
            return "timer";
        }
        if (this instanceof u) {
            return "update_structure";
        }
        if (this instanceof v) {
            return "video";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
