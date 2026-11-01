package com.yandex.div2;

import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivInputTemplate implements JSONSerializable, JsonTemplate<DivInput> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final a f47919h0 = new a(null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<Double> f47920i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Expression<DivInput.Autocapitalization> f47921j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Expression<DivInput.EnterKeyType> f47922k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Expression<Long> f47923l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f47924m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final DivSize.d f47925n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Expression<Integer> f47926o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Expression<Boolean> f47927p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Expression<DivInput.KeyboardType> f47928q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Expression<Double> f47929r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Expression<Boolean> f47930s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47931t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47932u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Expression<Integer> f47933v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47934w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final DivSize.c f47935x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputTemplate> f47936y0;
    public final Field<String> A;
    public final Field<Expression<Boolean>> B;
    public final Field<Expression<DivInput.KeyboardType>> C;
    public final Field<DivLayoutProviderTemplate> D;
    public final Field<Expression<Double>> E;
    public final Field<Expression<Long>> F;
    public final Field<DivEdgeInsetsTemplate> G;
    public final Field<DivInputMaskTemplate> H;
    public final Field<Expression<Long>> I;
    public final Field<Expression<Long>> J;
    public final Field<NativeInterfaceTemplate> K;
    public final Field<DivEdgeInsetsTemplate> L;
    public final Field<Expression<String>> M;
    public final Field<Expression<Long>> N;
    public final Field<Expression<Boolean>> O;
    public final Field<List<DivActionTemplate>> P;
    public final Field<Expression<DivAlignmentHorizontal>> Q;
    public final Field<Expression<DivAlignmentVertical>> R;
    public final Field<Expression<Integer>> S;
    public final Field<String> T;
    public final Field<List<DivTooltipTemplate>> U;
    public final Field<DivTransformTemplate> V;
    public final Field<DivChangeTransitionTemplate> W;
    public final Field<DivAppearanceTransitionTemplate> X;
    public final Field<DivAppearanceTransitionTemplate> Y;
    public final Field<List<DivTransitionTrigger>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f47937a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Field<List<DivInputValidatorTemplate>> f47938a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47939b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Field<List<DivTriggerTemplate>> f47940b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47941c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Field<List<DivVariableTemplate>> f47942c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f47943d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Field<Expression<DivVisibility>> f47944d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f47945e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Field<DivVisibilityActionTemplate> f47946e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivInput.Autocapitalization>> f47947f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Field<List<DivVisibilityActionTemplate>> f47948f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47949g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47950g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<Long>> f47952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f47953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<DivInput.EnterKeyType>> f47955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f47956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivInputFilterTemplate>> f47957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<DivFocusTemplate> f47958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<Expression<String>> f47959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<Expression<Long>> f47960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f47961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<Expression<JSONObject>> f47962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<Expression<DivFontWeight>> f47963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<Long>> f47964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f47965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<Expression<Integer>> f47967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<Expression<Integer>> f47968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<Expression<String>> f47969z;

    /* JADX INFO: compiled from: DivInputTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivInputTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<Expression<DivInput.Autocapitalization>> field6, Field<List<DivBackgroundTemplate>> field7, Field<DivBorderTemplate> field8, Field<Expression<Long>> field9, Field<List<DivDisappearActionTemplate>> field10, Field<List<DivActionTemplate>> field11, Field<Expression<DivInput.EnterKeyType>> field12, Field<List<DivExtensionTemplate>> field13, Field<List<DivInputFilterTemplate>> field14, Field<DivFocusTemplate> field15, Field<Expression<String>> field16, Field<Expression<Long>> field17, Field<Expression<DivSizeUnit>> field18, Field<Expression<JSONObject>> field19, Field<Expression<DivFontWeight>> field20, Field<Expression<Long>> field21, Field<List<DivFunctionTemplate>> field22, Field<DivSizeTemplate> field23, Field<Expression<Integer>> field24, Field<Expression<Integer>> field25, Field<Expression<String>> field26, Field<String> field27, Field<Expression<Boolean>> field28, Field<Expression<DivInput.KeyboardType>> field29, Field<DivLayoutProviderTemplate> field30, Field<Expression<Double>> field31, Field<Expression<Long>> field32, Field<DivEdgeInsetsTemplate> field33, Field<DivInputMaskTemplate> field34, Field<Expression<Long>> field35, Field<Expression<Long>> field36, Field<NativeInterfaceTemplate> field37, Field<DivEdgeInsetsTemplate> field38, Field<Expression<String>> field39, Field<Expression<Long>> field40, Field<Expression<Boolean>> field41, Field<List<DivActionTemplate>> field42, Field<Expression<DivAlignmentHorizontal>> field43, Field<Expression<DivAlignmentVertical>> field44, Field<Expression<Integer>> field45, Field<String> field46, Field<List<DivTooltipTemplate>> field47, Field<DivTransformTemplate> field48, Field<DivChangeTransitionTemplate> field49, Field<DivAppearanceTransitionTemplate> field50, Field<DivAppearanceTransitionTemplate> field51, Field<List<DivTransitionTrigger>> field52, Field<List<DivInputValidatorTemplate>> field53, Field<List<DivTriggerTemplate>> field54, Field<List<DivVariableTemplate>> field55, Field<Expression<DivVisibility>> field56, Field<DivVisibilityActionTemplate> field57, Field<List<DivVisibilityActionTemplate>> field58, Field<DivSizeTemplate> field59) {
        this.f47937a = field;
        this.f47939b = field2;
        this.f47941c = field3;
        this.f47943d = field4;
        this.f47945e = field5;
        this.f47947f = field6;
        this.f47949g = field7;
        this.f47951h = field8;
        this.f47952i = field9;
        this.f47953j = field10;
        this.f47954k = field11;
        this.f47955l = field12;
        this.f47956m = field13;
        this.f47957n = field14;
        this.f47958o = field15;
        this.f47959p = field16;
        this.f47960q = field17;
        this.f47961r = field18;
        this.f47962s = field19;
        this.f47963t = field20;
        this.f47964u = field21;
        this.f47965v = field22;
        this.f47966w = field23;
        this.f47967x = field24;
        this.f47968y = field25;
        this.f47969z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
        this.V = field48;
        this.W = field49;
        this.X = field50;
        this.Y = field51;
        this.Z = field52;
        this.f47938a0 = field53;
        this.f47940b0 = field54;
        this.f47942c0 = field55;
        this.f47944d0 = field56;
        this.f47946e0 = field57;
        this.f47948f0 = field58;
        this.f47950g0 = field59;
    }

    /* JADX INFO: compiled from: DivInputTemplate.kt */
    public static final class NativeInterfaceTemplate implements JSONSerializable, JsonTemplate<DivInput.NativeInterface> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47970b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, NativeInterfaceTemplate> f47971c = new bk.p<ParsingEnvironment, JSONObject, NativeInterfaceTemplate>() { // from class: com.yandex.div2.DivInputTemplate$NativeInterfaceTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInputTemplate.NativeInterfaceTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivInputTemplate.NativeInterfaceTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Integer>> f47972a;

        /* JADX INFO: compiled from: DivInputTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public NativeInterfaceTemplate(Field<Expression<Integer>> field) {
            this.f47972a = field;
        }

        public /* synthetic */ NativeInterfaceTemplate(ParsingEnvironment parsingEnvironment, NativeInterfaceTemplate nativeInterfaceTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : nativeInterfaceTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().z4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public NativeInterfaceTemplate(ParsingEnvironment parsingEnvironment, NativeInterfaceTemplate nativeInterfaceTemplate, boolean z10, JSONObject jSONObject) {
            this(Field.Companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f47920i0 = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f47921j0 = Expression.Companion.constant$default(companion, DivInput.Autocapitalization.AUTO, null, 2, null);
        f47922k0 = Expression.Companion.constant$default(companion, DivInput.EnterKeyType.DEFAULT, null, 2, null);
        f47923l0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f47924m0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f47925n0 = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f47926o0 = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f47927p0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47928q0 = Expression.Companion.constant$default(companion, DivInput.KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        f47929r0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f47930s0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47931t0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        f47932u0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47933v0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f47934w0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47935x0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f47936y0 = new bk.p<ParsingEnvironment, JSONObject, DivInputTemplate>() { // from class: com.yandex.div2.DivInputTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInputTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivInputTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivInputTemplate(ParsingEnvironment parsingEnvironment, DivInputTemplate divInputTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivInputTemplate(ParsingEnvironment parsingEnvironment, DivInputTemplate divInputTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
