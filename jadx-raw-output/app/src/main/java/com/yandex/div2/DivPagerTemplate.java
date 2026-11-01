package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivPagerTemplate implements JSONSerializable, JsonTemplate<DivPager> {
    public static final a R = new a(null);
    public static final Expression<Double> S;
    public static final Expression<DivPager.ItemAlignment> T;
    public static final Expression<Long> U;
    public static final DivSize.d V;
    public static final Expression<Boolean> W;
    public static final DivFixedSize X;
    public static final Expression<DivPager.Orientation> Y;
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<DivPager.ItemAlignment> f48306a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<DivVisibility> f48307b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivSize.c f48308c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPagerTemplate> f48309d0;
    public final Field<Expression<Boolean>> A;
    public final Field<Expression<String>> B;
    public final Field<Expression<Long>> C;
    public final Field<Expression<DivPager.ItemAlignment>> D;
    public final Field<List<DivActionTemplate>> E;
    public final Field<List<DivTooltipTemplate>> F;
    public final Field<DivTransformTemplate> G;
    public final Field<DivChangeTransitionTemplate> H;
    public final Field<DivAppearanceTransitionTemplate> I;
    public final Field<DivAppearanceTransitionTemplate> J;
    public final Field<List<DivTransitionTrigger>> K;
    public final Field<List<DivTriggerTemplate>> L;
    public final Field<List<DivVariableTemplate>> M;
    public final Field<Expression<DivVisibility>> N;
    public final Field<DivVisibilityActionTemplate> O;
    public final Field<List<DivVisibilityActionTemplate>> P;
    public final Field<DivSizeTemplate> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f48310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f48311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f48312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f48313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f48314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f48315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f48316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f48317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<DivPager.ItemAlignment>> f48318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<Long>> f48319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f48320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f48321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<DivFocusTemplate> f48322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f48323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<DivSizeTemplate> f48324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<String> f48325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<Expression<Boolean>> f48326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<DivCollectionItemBuilderTemplate> f48327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivFixedSizeTemplate> f48328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<List<DivTemplate>> f48329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<DivPagerLayoutModeTemplate> f48330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f48331v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<Expression<DivPager.Orientation>> f48333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48334y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivPageTransformationTemplate> f48335z;

    /* JADX INFO: compiled from: DivPagerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPagerTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<Expression<DivPager.ItemAlignment>> field9, Field<Expression<Long>> field10, Field<List<DivDisappearActionTemplate>> field11, Field<List<DivExtensionTemplate>> field12, Field<DivFocusTemplate> field13, Field<List<DivFunctionTemplate>> field14, Field<DivSizeTemplate> field15, Field<String> field16, Field<Expression<Boolean>> field17, Field<DivCollectionItemBuilderTemplate> field18, Field<DivFixedSizeTemplate> field19, Field<List<DivTemplate>> field20, Field<DivPagerLayoutModeTemplate> field21, Field<DivLayoutProviderTemplate> field22, Field<DivEdgeInsetsTemplate> field23, Field<Expression<DivPager.Orientation>> field24, Field<DivEdgeInsetsTemplate> field25, Field<DivPageTransformationTemplate> field26, Field<Expression<Boolean>> field27, Field<Expression<String>> field28, Field<Expression<Long>> field29, Field<Expression<DivPager.ItemAlignment>> field30, Field<List<DivActionTemplate>> field31, Field<List<DivTooltipTemplate>> field32, Field<DivTransformTemplate> field33, Field<DivChangeTransitionTemplate> field34, Field<DivAppearanceTransitionTemplate> field35, Field<DivAppearanceTransitionTemplate> field36, Field<List<DivTransitionTrigger>> field37, Field<List<DivTriggerTemplate>> field38, Field<List<DivVariableTemplate>> field39, Field<Expression<DivVisibility>> field40, Field<DivVisibilityActionTemplate> field41, Field<List<DivVisibilityActionTemplate>> field42, Field<DivSizeTemplate> field43) {
        this.f48310a = field;
        this.f48311b = field2;
        this.f48312c = field3;
        this.f48313d = field4;
        this.f48314e = field5;
        this.f48315f = field6;
        this.f48316g = field7;
        this.f48317h = field8;
        this.f48318i = field9;
        this.f48319j = field10;
        this.f48320k = field11;
        this.f48321l = field12;
        this.f48322m = field13;
        this.f48323n = field14;
        this.f48324o = field15;
        this.f48325p = field16;
        this.f48326q = field17;
        this.f48327r = field18;
        this.f48328s = field19;
        this.f48329t = field20;
        this.f48330u = field21;
        this.f48331v = field22;
        this.f48332w = field23;
        this.f48333x = field24;
        this.f48334y = field25;
        this.f48335z = field26;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        S = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        T = Expression.Companion.constant$default(companion, DivPager.ItemAlignment.START, null, 2, null);
        U = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        Y = Expression.Companion.constant$default(companion, DivPager.Orientation.HORIZONTAL, null, 2, null);
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f48306a0 = Expression.Companion.constant$default(companion, DivPager.ItemAlignment.CENTER, null, 2, null);
        f48307b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f48308c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f48309d0 = new bk.p<ParsingEnvironment, JSONObject, DivPagerTemplate>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPagerTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivPagerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPagerTemplate(ParsingEnvironment parsingEnvironment, DivPagerTemplate divPagerTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPagerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPagerTemplate(ParsingEnvironment parsingEnvironment, DivPagerTemplate divPagerTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
