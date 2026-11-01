package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTyped.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivActionTyped implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f46354b = new g(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionTyped> f46355c = new bk.p<ParsingEnvironment, JSONObject, DivActionTyped>() { // from class: com.yandex.div2.DivActionTyped$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTyped mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionTyped.f46354b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46356a;

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class a extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionAnimatorStart f46357d;

        public a(DivActionAnimatorStart divActionAnimatorStart) {
            super(null);
            this.f46357d = divActionAnimatorStart;
        }

        public final DivActionAnimatorStart c() {
            return this.f46357d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class b extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionAnimatorStop f46358d;

        public b(DivActionAnimatorStop divActionAnimatorStop) {
            super(null);
            this.f46358d = divActionAnimatorStop;
        }

        public final DivActionAnimatorStop c() {
            return this.f46358d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class c extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionArrayInsertValue f46359d;

        public c(DivActionArrayInsertValue divActionArrayInsertValue) {
            super(null);
            this.f46359d = divActionArrayInsertValue;
        }

        public final DivActionArrayInsertValue c() {
            return this.f46359d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class d extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionArrayRemoveValue f46360d;

        public d(DivActionArrayRemoveValue divActionArrayRemoveValue) {
            super(null);
            this.f46360d = divActionArrayRemoveValue;
        }

        public final DivActionArrayRemoveValue c() {
            return this.f46360d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class e extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionArraySetValue f46361d;

        public e(DivActionArraySetValue divActionArraySetValue) {
            super(null);
            this.f46361d = divActionArraySetValue;
        }

        public final DivActionArraySetValue c() {
            return this.f46361d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class f extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionClearFocus f46362d;

        public f(DivActionClearFocus divActionClearFocus) {
            super(null);
            this.f46362d = divActionClearFocus;
        }

        public final DivActionClearFocus c() {
            return this.f46362d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class h extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionCopyToClipboard f46363d;

        public h(DivActionCopyToClipboard divActionCopyToClipboard) {
            super(null);
            this.f46363d = divActionCopyToClipboard;
        }

        public final DivActionCopyToClipboard c() {
            return this.f46363d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class i extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionDictSetValue f46364d;

        public i(DivActionDictSetValue divActionDictSetValue) {
            super(null);
            this.f46364d = divActionDictSetValue;
        }

        public final DivActionDictSetValue c() {
            return this.f46364d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class j extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionDownload f46365d;

        public j(DivActionDownload divActionDownload) {
            super(null);
            this.f46365d = divActionDownload;
        }

        public final DivActionDownload c() {
            return this.f46365d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class k extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionFocusElement f46366d;

        public k(DivActionFocusElement divActionFocusElement) {
            super(null);
            this.f46366d = divActionFocusElement;
        }

        public final DivActionFocusElement c() {
            return this.f46366d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class l extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionHideTooltip f46367d;

        public l(DivActionHideTooltip divActionHideTooltip) {
            super(null);
            this.f46367d = divActionHideTooltip;
        }

        public final DivActionHideTooltip c() {
            return this.f46367d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class m extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionScrollBy f46368d;

        public m(DivActionScrollBy divActionScrollBy) {
            super(null);
            this.f46368d = divActionScrollBy;
        }

        public final DivActionScrollBy c() {
            return this.f46368d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class n extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionScrollTo f46369d;

        public n(DivActionScrollTo divActionScrollTo) {
            super(null);
            this.f46369d = divActionScrollTo;
        }

        public final DivActionScrollTo c() {
            return this.f46369d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class o extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionSetState f46370d;

        public o(DivActionSetState divActionSetState) {
            super(null);
            this.f46370d = divActionSetState;
        }

        public final DivActionSetState c() {
            return this.f46370d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class p extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionSetStoredValue f46371d;

        public p(DivActionSetStoredValue divActionSetStoredValue) {
            super(null);
            this.f46371d = divActionSetStoredValue;
        }

        public final DivActionSetStoredValue c() {
            return this.f46371d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class q extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionSetVariable f46372d;

        public q(DivActionSetVariable divActionSetVariable) {
            super(null);
            this.f46372d = divActionSetVariable;
        }

        public final DivActionSetVariable c() {
            return this.f46372d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class r extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionShowTooltip f46373d;

        public r(DivActionShowTooltip divActionShowTooltip) {
            super(null);
            this.f46373d = divActionShowTooltip;
        }

        public final DivActionShowTooltip c() {
            return this.f46373d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class s extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionSubmit f46374d;

        public s(DivActionSubmit divActionSubmit) {
            super(null);
            this.f46374d = divActionSubmit;
        }

        public final DivActionSubmit c() {
            return this.f46374d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class t extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionTimer f46375d;

        public t(DivActionTimer divActionTimer) {
            super(null);
            this.f46375d = divActionTimer;
        }

        public final DivActionTimer c() {
            return this.f46375d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class u extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionUpdateStructure f46376d;

        public u(DivActionUpdateStructure divActionUpdateStructure) {
            super(null);
            this.f46376d = divActionUpdateStructure;
        }

        public final DivActionUpdateStructure c() {
            return this.f46376d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class v extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivActionVideo f46377d;

        public v(DivActionVideo divActionVideo) {
            super(null);
            this.f46377d = divActionVideo;
        }

        public final DivActionVideo c() {
            return this.f46377d;
        }
    }

    public DivActionTyped() {
    }

    public /* synthetic */ DivActionTyped(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class g {
        public g() {
        }

        public /* synthetic */ g(ck.i iVar) {
            this();
        }

        public final DivActionTyped a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionTyped divActionTyped, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionTyped == null) {
            return false;
        }
        if (this instanceof a) {
            DivActionAnimatorStart divActionAnimatorStartC = ((a) this).c();
            Object objB = divActionTyped.b();
            return divActionAnimatorStartC.a(objB instanceof DivActionAnimatorStart ? (DivActionAnimatorStart) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivActionAnimatorStop divActionAnimatorStopC = ((b) this).c();
            Object objB2 = divActionTyped.b();
            return divActionAnimatorStopC.a(objB2 instanceof DivActionAnimatorStop ? (DivActionAnimatorStop) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivActionArrayInsertValue divActionArrayInsertValueC = ((c) this).c();
            Object objB3 = divActionTyped.b();
            return divActionArrayInsertValueC.a(objB3 instanceof DivActionArrayInsertValue ? (DivActionArrayInsertValue) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            DivActionArrayRemoveValue divActionArrayRemoveValueC = ((d) this).c();
            Object objB4 = divActionTyped.b();
            return divActionArrayRemoveValueC.a(objB4 instanceof DivActionArrayRemoveValue ? (DivActionArrayRemoveValue) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DivActionArraySetValue divActionArraySetValueC = ((e) this).c();
            Object objB5 = divActionTyped.b();
            return divActionArraySetValueC.a(objB5 instanceof DivActionArraySetValue ? (DivActionArraySetValue) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            DivActionClearFocus divActionClearFocusC = ((f) this).c();
            Object objB6 = divActionTyped.b();
            return divActionClearFocusC.a(objB6 instanceof DivActionClearFocus ? (DivActionClearFocus) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof h) {
            DivActionCopyToClipboard divActionCopyToClipboardC = ((h) this).c();
            Object objB7 = divActionTyped.b();
            return divActionCopyToClipboardC.a(objB7 instanceof DivActionCopyToClipboard ? (DivActionCopyToClipboard) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            DivActionDictSetValue divActionDictSetValueC = ((i) this).c();
            Object objB8 = divActionTyped.b();
            return divActionDictSetValueC.a(objB8 instanceof DivActionDictSetValue ? (DivActionDictSetValue) objB8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            DivActionDownload divActionDownloadC = ((j) this).c();
            Object objB9 = divActionTyped.b();
            return divActionDownloadC.a(objB9 instanceof DivActionDownload ? (DivActionDownload) objB9 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            DivActionFocusElement divActionFocusElementC = ((k) this).c();
            Object objB10 = divActionTyped.b();
            return divActionFocusElementC.a(objB10 instanceof DivActionFocusElement ? (DivActionFocusElement) objB10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof l) {
            DivActionHideTooltip divActionHideTooltipC = ((l) this).c();
            Object objB11 = divActionTyped.b();
            return divActionHideTooltipC.a(objB11 instanceof DivActionHideTooltip ? (DivActionHideTooltip) objB11 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof m) {
            DivActionScrollBy divActionScrollByC = ((m) this).c();
            Object objB12 = divActionTyped.b();
            return divActionScrollByC.a(objB12 instanceof DivActionScrollBy ? (DivActionScrollBy) objB12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof n) {
            DivActionScrollTo divActionScrollToC = ((n) this).c();
            Object objB13 = divActionTyped.b();
            return divActionScrollToC.a(objB13 instanceof DivActionScrollTo ? (DivActionScrollTo) objB13 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof o) {
            DivActionSetState divActionSetStateC = ((o) this).c();
            Object objB14 = divActionTyped.b();
            return divActionSetStateC.a(objB14 instanceof DivActionSetState ? (DivActionSetState) objB14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof p) {
            DivActionSetStoredValue divActionSetStoredValueC = ((p) this).c();
            Object objB15 = divActionTyped.b();
            return divActionSetStoredValueC.a(objB15 instanceof DivActionSetStoredValue ? (DivActionSetStoredValue) objB15 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof q) {
            DivActionSetVariable divActionSetVariableC = ((q) this).c();
            Object objB16 = divActionTyped.b();
            return divActionSetVariableC.a(objB16 instanceof DivActionSetVariable ? (DivActionSetVariable) objB16 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof r) {
            DivActionShowTooltip divActionShowTooltipC = ((r) this).c();
            Object objB17 = divActionTyped.b();
            return divActionShowTooltipC.a(objB17 instanceof DivActionShowTooltip ? (DivActionShowTooltip) objB17 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof s) {
            DivActionSubmit divActionSubmitC = ((s) this).c();
            Object objB18 = divActionTyped.b();
            return divActionSubmitC.a(objB18 instanceof DivActionSubmit ? (DivActionSubmit) objB18 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof t) {
            DivActionTimer divActionTimerC = ((t) this).c();
            Object objB19 = divActionTyped.b();
            return divActionTimerC.a(objB19 instanceof DivActionTimer ? (DivActionTimer) objB19 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof u) {
            DivActionUpdateStructure divActionUpdateStructureC = ((u) this).c();
            Object objB20 = divActionTyped.b();
            return divActionUpdateStructureC.a(objB20 instanceof DivActionUpdateStructure ? (DivActionUpdateStructure) objB20 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        DivActionVideo divActionVideoC = ((v) this).c();
        Object objB21 = divActionTyped.b();
        return divActionVideoC.a(objB21 instanceof DivActionVideo ? (DivActionVideo) objB21 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        if (this instanceof t) {
            return ((t) this).c();
        }
        if (this instanceof u) {
            return ((u) this).c();
        }
        if (this instanceof v) {
            return ((v) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46356a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).c().hash();
        } else if (this instanceof l) {
            iHash = ((l) this).c().hash();
        } else if (this instanceof m) {
            iHash = ((m) this).c().hash();
        } else if (this instanceof n) {
            iHash = ((n) this).c().hash();
        } else if (this instanceof o) {
            iHash = ((o) this).c().hash();
        } else if (this instanceof p) {
            iHash = ((p) this).c().hash();
        } else if (this instanceof q) {
            iHash = ((q) this).c().hash();
        } else if (this instanceof r) {
            iHash = ((r) this).c().hash();
        } else if (this instanceof s) {
            iHash = ((s) this).c().hash();
        } else if (this instanceof t) {
            iHash = ((t) this).c().hash();
        } else if (this instanceof u) {
            iHash = ((u) this).c().hash();
        } else {
            if (!(this instanceof v)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((v) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f46356a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
