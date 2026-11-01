package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGridTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivGridTemplate implements JSONSerializable, JsonTemplate<DivGrid> {
    public static final a U = new a(null);
    public static final DivAnimation V;
    public static final Expression<Double> W;
    public static final Expression<Boolean> X;
    public static final Expression<DivAlignmentHorizontal> Y;
    public static final Expression<DivAlignmentVertical> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final DivSize.d f47504a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47505b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivSize.c f47506c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivGridTemplate> f47507d0;
    public final Field<List<DivActionTemplate>> A;
    public final Field<DivEdgeInsetsTemplate> B;
    public final Field<DivEdgeInsetsTemplate> C;
    public final Field<List<DivActionTemplate>> D;
    public final Field<List<DivActionTemplate>> E;
    public final Field<Expression<String>> F;
    public final Field<Expression<Long>> G;
    public final Field<List<DivActionTemplate>> H;
    public final Field<List<DivTooltipTemplate>> I;
    public final Field<DivTransformTemplate> J;
    public final Field<DivChangeTransitionTemplate> K;
    public final Field<DivAppearanceTransitionTemplate> L;
    public final Field<DivAppearanceTransitionTemplate> M;
    public final Field<List<DivTransitionTrigger>> N;
    public final Field<List<DivTriggerTemplate>> O;
    public final Field<List<DivVariableTemplate>> P;
    public final Field<Expression<DivVisibility>> Q;
    public final Field<DivVisibilityActionTemplate> R;
    public final Field<List<DivVisibilityActionTemplate>> S;
    public final Field<DivSizeTemplate> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f47508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f47509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f47510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f47514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f47515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Long>> f47519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Long>> f47520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f47523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f47525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivFocusTemplate> f47526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f47527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<String> f47531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<List<DivTemplate>> f47532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f47533z;

    /* JADX INFO: compiled from: DivGridTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivGridTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<List<DivBackgroundTemplate>> field9, Field<DivBorderTemplate> field10, Field<Expression<Boolean>> field11, Field<Expression<Long>> field12, Field<Expression<Long>> field13, Field<Expression<DivAlignmentHorizontal>> field14, Field<Expression<DivAlignmentVertical>> field15, Field<List<DivDisappearActionTemplate>> field16, Field<List<DivActionTemplate>> field17, Field<List<DivExtensionTemplate>> field18, Field<DivFocusTemplate> field19, Field<List<DivFunctionTemplate>> field20, Field<DivSizeTemplate> field21, Field<List<DivActionTemplate>> field22, Field<List<DivActionTemplate>> field23, Field<String> field24, Field<List<DivTemplate>> field25, Field<DivLayoutProviderTemplate> field26, Field<List<DivActionTemplate>> field27, Field<DivEdgeInsetsTemplate> field28, Field<DivEdgeInsetsTemplate> field29, Field<List<DivActionTemplate>> field30, Field<List<DivActionTemplate>> field31, Field<Expression<String>> field32, Field<Expression<Long>> field33, Field<List<DivActionTemplate>> field34, Field<List<DivTooltipTemplate>> field35, Field<DivTransformTemplate> field36, Field<DivChangeTransitionTemplate> field37, Field<DivAppearanceTransitionTemplate> field38, Field<DivAppearanceTransitionTemplate> field39, Field<List<DivTransitionTrigger>> field40, Field<List<DivTriggerTemplate>> field41, Field<List<DivVariableTemplate>> field42, Field<Expression<DivVisibility>> field43, Field<DivVisibilityActionTemplate> field44, Field<List<DivVisibilityActionTemplate>> field45, Field<DivSizeTemplate> field46) {
        this.f47508a = field;
        this.f47509b = field2;
        this.f47510c = field3;
        this.f47511d = field4;
        this.f47512e = field5;
        this.f47513f = field6;
        this.f47514g = field7;
        this.f47515h = field8;
        this.f47516i = field9;
        this.f47517j = field10;
        this.f47518k = field11;
        this.f47519l = field12;
        this.f47520m = field13;
        this.f47521n = field14;
        this.f47522o = field15;
        this.f47523p = field16;
        this.f47524q = field17;
        this.f47525r = field18;
        this.f47526s = field19;
        this.f47527t = field20;
        this.f47528u = field21;
        this.f47529v = field22;
        this.f47530w = field23;
        this.f47531x = field24;
        this.f47532y = field25;
        this.f47533z = field26;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        V = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        W = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        X = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Y = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Z = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        f47504a0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f47505b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47506c0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f47507d0 = new bk.p<ParsingEnvironment, JSONObject, DivGridTemplate>() { // from class: com.yandex.div2.DivGridTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGridTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivGridTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivGridTemplate(ParsingEnvironment parsingEnvironment, DivGridTemplate divGridTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divGridTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridTemplate(ParsingEnvironment parsingEnvironment, DivGridTemplate divGridTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
