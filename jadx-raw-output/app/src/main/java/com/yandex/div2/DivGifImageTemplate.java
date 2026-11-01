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

/* JADX INFO: compiled from: DivGifImageTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivGifImageTemplate implements JSONSerializable, JsonTemplate<DivGifImage> {
    public static final a Y = new a(null);
    public static final DivAnimation Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Double> f47413a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Boolean> f47414b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47415c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47416d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.d f47417e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Expression<Integer> f47418f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Expression<Boolean> f47419g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Expression<DivImageScale> f47420h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47421i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final DivSize.c f47422j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivGifImageTemplate> f47423k0;
    public final Field<List<DivActionTemplate>> A;
    public final Field<DivEdgeInsetsTemplate> B;
    public final Field<DivEdgeInsetsTemplate> C;
    public final Field<Expression<Integer>> D;
    public final Field<Expression<Boolean>> E;
    public final Field<List<DivActionTemplate>> F;
    public final Field<List<DivActionTemplate>> G;
    public final Field<Expression<String>> H;
    public final Field<Expression<String>> I;
    public final Field<Expression<Long>> J;
    public final Field<Expression<DivImageScale>> K;
    public final Field<List<DivActionTemplate>> L;
    public final Field<List<DivTooltipTemplate>> M;
    public final Field<DivTransformTemplate> N;
    public final Field<DivChangeTransitionTemplate> O;
    public final Field<DivAppearanceTransitionTemplate> P;
    public final Field<DivAppearanceTransitionTemplate> Q;
    public final Field<List<DivTransitionTrigger>> R;
    public final Field<List<DivTriggerTemplate>> S;
    public final Field<List<DivVariableTemplate>> T;
    public final Field<Expression<DivVisibility>> U;
    public final Field<DivVisibilityActionTemplate> V;
    public final Field<List<DivVisibilityActionTemplate>> W;
    public final Field<DivSizeTemplate> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f47424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f47425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f47426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f47430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f47431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<DivAspectTemplate> f47432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Long>> f47436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f47439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f47441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivFocusTemplate> f47442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f47443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<Uri>> f47444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<String> f47448y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f47449z;

    /* JADX INFO: compiled from: DivGifImageTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivGifImageTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<DivAspectTemplate> field9, Field<List<DivBackgroundTemplate>> field10, Field<DivBorderTemplate> field11, Field<Expression<Boolean>> field12, Field<Expression<Long>> field13, Field<Expression<DivAlignmentHorizontal>> field14, Field<Expression<DivAlignmentVertical>> field15, Field<List<DivDisappearActionTemplate>> field16, Field<List<DivActionTemplate>> field17, Field<List<DivExtensionTemplate>> field18, Field<DivFocusTemplate> field19, Field<List<DivFunctionTemplate>> field20, Field<Expression<Uri>> field21, Field<DivSizeTemplate> field22, Field<List<DivActionTemplate>> field23, Field<List<DivActionTemplate>> field24, Field<String> field25, Field<DivLayoutProviderTemplate> field26, Field<List<DivActionTemplate>> field27, Field<DivEdgeInsetsTemplate> field28, Field<DivEdgeInsetsTemplate> field29, Field<Expression<Integer>> field30, Field<Expression<Boolean>> field31, Field<List<DivActionTemplate>> field32, Field<List<DivActionTemplate>> field33, Field<Expression<String>> field34, Field<Expression<String>> field35, Field<Expression<Long>> field36, Field<Expression<DivImageScale>> field37, Field<List<DivActionTemplate>> field38, Field<List<DivTooltipTemplate>> field39, Field<DivTransformTemplate> field40, Field<DivChangeTransitionTemplate> field41, Field<DivAppearanceTransitionTemplate> field42, Field<DivAppearanceTransitionTemplate> field43, Field<List<DivTransitionTrigger>> field44, Field<List<DivTriggerTemplate>> field45, Field<List<DivVariableTemplate>> field46, Field<Expression<DivVisibility>> field47, Field<DivVisibilityActionTemplate> field48, Field<List<DivVisibilityActionTemplate>> field49, Field<DivSizeTemplate> field50) {
        this.f47424a = field;
        this.f47425b = field2;
        this.f47426c = field3;
        this.f47427d = field4;
        this.f47428e = field5;
        this.f47429f = field6;
        this.f47430g = field7;
        this.f47431h = field8;
        this.f47432i = field9;
        this.f47433j = field10;
        this.f47434k = field11;
        this.f47435l = field12;
        this.f47436m = field13;
        this.f47437n = field14;
        this.f47438o = field15;
        this.f47439p = field16;
        this.f47440q = field17;
        this.f47441r = field18;
        this.f47442s = field19;
        this.f47443t = field20;
        this.f47444u = field21;
        this.f47445v = field22;
        this.f47446w = field23;
        this.f47447x = field24;
        this.f47448y = field25;
        this.f47449z = field26;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        Z = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47413a0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47414b0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47415c0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f47416d0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47417e0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f47418f0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f47419g0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47420h0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f47421i0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47422j0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f47423k0 = new bk.p<ParsingEnvironment, JSONObject, DivGifImageTemplate>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGifImageTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivGifImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivGifImageTemplate(ParsingEnvironment parsingEnvironment, DivGifImageTemplate divGifImageTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divGifImageTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGifImageTemplate(ParsingEnvironment parsingEnvironment, DivGifImageTemplate divGifImageTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
