package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivIndicatorTemplate implements JSONSerializable, JsonTemplate<DivIndicator> {
    public static final a S = new a(null);
    public static final Expression<Integer> T;
    public static final Expression<Double> U;
    public static final Expression<Double> V;
    public static final Expression<DivIndicator.Animation> W;
    public static final DivSize.d X;
    public static final Expression<Integer> Y;
    public static final Expression<Double> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final DivShape.c f47761a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final DivFixedSize f47762b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47763c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final DivSize.c f47764d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivIndicatorTemplate> f47765e0;
    public final Field<String> A;
    public final Field<Expression<String>> B;
    public final Field<Expression<Long>> C;
    public final Field<List<DivActionTemplate>> D;
    public final Field<DivShapeTemplate> E;
    public final Field<DivFixedSizeTemplate> F;
    public final Field<List<DivTooltipTemplate>> G;
    public final Field<DivTransformTemplate> H;
    public final Field<DivChangeTransitionTemplate> I;
    public final Field<DivAppearanceTransitionTemplate> J;
    public final Field<DivAppearanceTransitionTemplate> K;
    public final Field<List<DivTransitionTrigger>> L;
    public final Field<List<DivTriggerTemplate>> M;
    public final Field<List<DivVariableTemplate>> N;
    public final Field<Expression<DivVisibility>> O;
    public final Field<DivVisibilityActionTemplate> P;
    public final Field<List<DivVisibilityActionTemplate>> Q;
    public final Field<DivSizeTemplate> R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f47766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Integer>> f47767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Double>> f47768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<DivRoundedRectangleShapeTemplate> f47769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f47772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<DivIndicator.Animation>> f47773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f47774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Long>> f47777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f47778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f47779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<DivFocusTemplate> f47780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f47781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<String> f47783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<Expression<Integer>> f47784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<DivRoundedRectangleShapeTemplate> f47785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<DivRoundedRectangleShapeTemplate> f47786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<DivIndicatorItemPlacementTemplate> f47787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f47788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f47789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<Expression<Double>> f47790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f47791z;

    /* JADX INFO: compiled from: DivIndicatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivIndicatorTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<Integer>> field2, Field<Expression<Double>> field3, Field<DivRoundedRectangleShapeTemplate> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<Expression<DivIndicator.Animation>> field8, Field<List<DivAnimatorTemplate>> field9, Field<List<DivBackgroundTemplate>> field10, Field<DivBorderTemplate> field11, Field<Expression<Long>> field12, Field<List<DivDisappearActionTemplate>> field13, Field<List<DivExtensionTemplate>> field14, Field<DivFocusTemplate> field15, Field<List<DivFunctionTemplate>> field16, Field<DivSizeTemplate> field17, Field<String> field18, Field<Expression<Integer>> field19, Field<DivRoundedRectangleShapeTemplate> field20, Field<DivRoundedRectangleShapeTemplate> field21, Field<DivIndicatorItemPlacementTemplate> field22, Field<DivLayoutProviderTemplate> field23, Field<DivEdgeInsetsTemplate> field24, Field<Expression<Double>> field25, Field<DivEdgeInsetsTemplate> field26, Field<String> field27, Field<Expression<String>> field28, Field<Expression<Long>> field29, Field<List<DivActionTemplate>> field30, Field<DivShapeTemplate> field31, Field<DivFixedSizeTemplate> field32, Field<List<DivTooltipTemplate>> field33, Field<DivTransformTemplate> field34, Field<DivChangeTransitionTemplate> field35, Field<DivAppearanceTransitionTemplate> field36, Field<DivAppearanceTransitionTemplate> field37, Field<List<DivTransitionTrigger>> field38, Field<List<DivTriggerTemplate>> field39, Field<List<DivVariableTemplate>> field40, Field<Expression<DivVisibility>> field41, Field<DivVisibilityActionTemplate> field42, Field<List<DivVisibilityActionTemplate>> field43, Field<DivSizeTemplate> field44) {
        this.f47766a = field;
        this.f47767b = field2;
        this.f47768c = field3;
        this.f47769d = field4;
        this.f47770e = field5;
        this.f47771f = field6;
        this.f47772g = field7;
        this.f47773h = field8;
        this.f47774i = field9;
        this.f47775j = field10;
        this.f47776k = field11;
        this.f47777l = field12;
        this.f47778m = field13;
        this.f47779n = field14;
        this.f47780o = field15;
        this.f47781p = field16;
        this.f47782q = field17;
        this.f47783r = field18;
        this.f47784s = field19;
        this.f47785t = field20;
        this.f47786u = field21;
        this.f47787v = field22;
        this.f47788w = field23;
        this.f47789x = field24;
        this.f47790y = field25;
        this.f47791z = field26;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        T = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, DivIndicator.Animation.SCALE, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        f47761a0 = new DivShape.c(new DivRoundedRectangleShape(null, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null));
        f47762b0 = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null == true ? 1 : 0);
        f47763c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47764d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f47765e0 = new bk.p<ParsingEnvironment, JSONObject, DivIndicatorTemplate>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivIndicatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivIndicatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivIndicatorTemplate(ParsingEnvironment parsingEnvironment, DivIndicatorTemplate divIndicatorTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divIndicatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivIndicatorTemplate(ParsingEnvironment parsingEnvironment, DivIndicatorTemplate divIndicatorTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
