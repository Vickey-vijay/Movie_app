package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivImageTemplate implements JSONSerializable, JsonTemplate<DivImage> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final a f47650d0 = new a(null);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivAnimation f47651e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Expression<Double> f47652f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Expression<Boolean> f47653g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47654h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47655i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final DivSize.d f47656j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Expression<Boolean> f47657k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Expression<Integer> f47658l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Expression<Boolean> f47659m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Expression<DivImageScale> f47660n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Expression<DivBlendMode> f47661o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47662p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final DivSize.c f47663q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivImageTemplate> f47664r0;
    public final Field<String> A;
    public final Field<Expression<Uri>> B;
    public final Field<DivLayoutProviderTemplate> C;
    public final Field<List<DivActionTemplate>> D;
    public final Field<DivEdgeInsetsTemplate> E;
    public final Field<DivEdgeInsetsTemplate> F;
    public final Field<Expression<Integer>> G;
    public final Field<Expression<Boolean>> H;
    public final Field<List<DivActionTemplate>> I;
    public final Field<List<DivActionTemplate>> J;
    public final Field<Expression<String>> K;
    public final Field<Expression<String>> L;
    public final Field<Expression<Long>> M;
    public final Field<Expression<DivImageScale>> N;
    public final Field<List<DivActionTemplate>> O;
    public final Field<Expression<Integer>> P;
    public final Field<Expression<DivBlendMode>> Q;
    public final Field<List<DivTooltipTemplate>> R;
    public final Field<DivTransformTemplate> S;
    public final Field<DivChangeTransitionTemplate> T;
    public final Field<DivAppearanceTransitionTemplate> U;
    public final Field<DivAppearanceTransitionTemplate> V;
    public final Field<List<DivTransitionTrigger>> W;
    public final Field<List<DivTriggerTemplate>> X;
    public final Field<List<DivVariableTemplate>> Y;
    public final Field<Expression<DivVisibility>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f47665a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Field<DivVisibilityActionTemplate> f47666a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f47667b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Field<List<DivVisibilityActionTemplate>> f47668b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f47669c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47670c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f47674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f47675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<DivFadeTransitionTemplate> f47676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<DivAspectTemplate> f47677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<Long>> f47681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f47684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f47686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<List<DivFilterTemplate>> f47687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<DivFocusTemplate> f47688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f47689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47693z;

    /* JADX INFO: compiled from: DivImageTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivImageTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<DivFadeTransitionTemplate> field9, Field<DivAspectTemplate> field10, Field<List<DivBackgroundTemplate>> field11, Field<DivBorderTemplate> field12, Field<Expression<Boolean>> field13, Field<Expression<Long>> field14, Field<Expression<DivAlignmentHorizontal>> field15, Field<Expression<DivAlignmentVertical>> field16, Field<List<DivDisappearActionTemplate>> field17, Field<List<DivActionTemplate>> field18, Field<List<DivExtensionTemplate>> field19, Field<List<DivFilterTemplate>> field20, Field<DivFocusTemplate> field21, Field<List<DivFunctionTemplate>> field22, Field<DivSizeTemplate> field23, Field<Expression<Boolean>> field24, Field<List<DivActionTemplate>> field25, Field<List<DivActionTemplate>> field26, Field<String> field27, Field<Expression<Uri>> field28, Field<DivLayoutProviderTemplate> field29, Field<List<DivActionTemplate>> field30, Field<DivEdgeInsetsTemplate> field31, Field<DivEdgeInsetsTemplate> field32, Field<Expression<Integer>> field33, Field<Expression<Boolean>> field34, Field<List<DivActionTemplate>> field35, Field<List<DivActionTemplate>> field36, Field<Expression<String>> field37, Field<Expression<String>> field38, Field<Expression<Long>> field39, Field<Expression<DivImageScale>> field40, Field<List<DivActionTemplate>> field41, Field<Expression<Integer>> field42, Field<Expression<DivBlendMode>> field43, Field<List<DivTooltipTemplate>> field44, Field<DivTransformTemplate> field45, Field<DivChangeTransitionTemplate> field46, Field<DivAppearanceTransitionTemplate> field47, Field<DivAppearanceTransitionTemplate> field48, Field<List<DivTransitionTrigger>> field49, Field<List<DivTriggerTemplate>> field50, Field<List<DivVariableTemplate>> field51, Field<Expression<DivVisibility>> field52, Field<DivVisibilityActionTemplate> field53, Field<List<DivVisibilityActionTemplate>> field54, Field<DivSizeTemplate> field55) {
        this.f47665a = field;
        this.f47667b = field2;
        this.f47669c = field3;
        this.f47671d = field4;
        this.f47672e = field5;
        this.f47673f = field6;
        this.f47674g = field7;
        this.f47675h = field8;
        this.f47676i = field9;
        this.f47677j = field10;
        this.f47678k = field11;
        this.f47679l = field12;
        this.f47680m = field13;
        this.f47681n = field14;
        this.f47682o = field15;
        this.f47683p = field16;
        this.f47684q = field17;
        this.f47685r = field18;
        this.f47686s = field19;
        this.f47687t = field20;
        this.f47688u = field21;
        this.f47689v = field22;
        this.f47690w = field23;
        this.f47691x = field24;
        this.f47692y = field25;
        this.f47693z = field26;
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
        this.f47666a0 = field53;
        this.f47668b0 = field54;
        this.f47670c0 = field55;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f47651e0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47652f0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47653g0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47654h0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f47655i0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47656j0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        Boolean bool = Boolean.FALSE;
        f47657k0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f47658l0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f47659m0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f47660n0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f47661o0 = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        f47662p0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47663q0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f47664r0 = new bk.p<ParsingEnvironment, JSONObject, DivImageTemplate>() { // from class: com.yandex.div2.DivImageTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImageTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivImageTemplate(ParsingEnvironment parsingEnvironment, DivImageTemplate divImageTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divImageTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivImageTemplate(ParsingEnvironment parsingEnvironment, DivImageTemplate divImageTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
