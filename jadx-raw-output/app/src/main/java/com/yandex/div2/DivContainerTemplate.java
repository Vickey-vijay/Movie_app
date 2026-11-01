package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivContainerTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivContainerTemplate implements JSONSerializable, JsonTemplate<DivContainer> {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final a f46779c0 = new a(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final DivAnimation f46780d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Expression<Double> f46781e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Expression<Boolean> f46782f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Expression<Boolean> f46783g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Expression<DivContentAlignmentHorizontal> f46784h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<DivContentAlignmentVertical> f46785i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final DivSize.d f46786j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Expression<Long> f46787k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Expression<DivContainer.LayoutMode> f46788l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Expression<Long> f46789m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Expression<DivContainer.Orientation> f46790n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Expression<DivVisibility> f46791o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final DivSize.c f46792p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivContainerTemplate> f46793q0;
    public final Field<Expression<Long>> A;
    public final Field<List<DivTemplate>> B;
    public final Field<Expression<DivContainer.LayoutMode>> C;
    public final Field<DivLayoutProviderTemplate> D;
    public final Field<SeparatorTemplate> E;
    public final Field<Expression<Long>> F;
    public final Field<List<DivActionTemplate>> G;
    public final Field<DivEdgeInsetsTemplate> H;
    public final Field<Expression<DivContainer.Orientation>> I;
    public final Field<DivEdgeInsetsTemplate> J;
    public final Field<List<DivActionTemplate>> K;
    public final Field<List<DivActionTemplate>> L;
    public final Field<Expression<String>> M;
    public final Field<Expression<Long>> N;
    public final Field<List<DivActionTemplate>> O;
    public final Field<SeparatorTemplate> P;
    public final Field<List<DivTooltipTemplate>> Q;
    public final Field<DivTransformTemplate> R;
    public final Field<DivChangeTransitionTemplate> S;
    public final Field<DivAppearanceTransitionTemplate> T;
    public final Field<DivAppearanceTransitionTemplate> U;
    public final Field<List<DivTransitionTrigger>> V;
    public final Field<List<DivTriggerTemplate>> W;
    public final Field<List<DivVariableTemplate>> X;
    public final Field<Expression<DivVisibility>> Y;
    public final Field<DivVisibilityActionTemplate> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f46794a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Field<List<DivVisibilityActionTemplate>> f46795a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f46796b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Field<DivSizeTemplate> f46797b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f46798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f46800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f46801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f46802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f46803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<DivAspectTemplate> f46804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f46805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivBorderTemplate> f46806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<Long>> f46809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<DivContentAlignmentHorizontal>> f46810o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<Expression<DivContentAlignmentVertical>> f46811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f46812q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f46814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<DivFocusTemplate> f46815t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f46816u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<DivSizeTemplate> f46817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<String> f46820y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivCollectionItemBuilderTemplate> f46821z;

    /* JADX INFO: compiled from: DivContainerTemplate.kt */
    public static final class SeparatorTemplate implements JSONSerializable, JsonTemplate<DivContainer.Separator> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f46822f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Expression<Boolean> f46823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Expression<Boolean> f46824h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Expression<Boolean> f46825i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, SeparatorTemplate> f46826j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivEdgeInsetsTemplate> f46827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<Boolean>> f46828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<Boolean>> f46829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<Boolean>> f46830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<DivDrawableTemplate> f46831e;

        /* JADX INFO: compiled from: DivContainerTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public SeparatorTemplate(Field<DivEdgeInsetsTemplate> field, Field<Expression<Boolean>> field2, Field<Expression<Boolean>> field3, Field<Expression<Boolean>> field4, Field<DivDrawableTemplate> field5) {
            this.f46827a = field;
            this.f46828b = field2;
            this.f46829c = field3;
            this.f46830d = field4;
            this.f46831e = field5;
        }

        static {
            Expression.Companion companion = Expression.Companion;
            Boolean bool = Boolean.FALSE;
            f46823g = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f46824h = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f46825i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            f46826j = new bk.p<ParsingEnvironment, JSONObject, SeparatorTemplate>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivContainerTemplate.SeparatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivContainerTemplate.SeparatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().q2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ SeparatorTemplate(ParsingEnvironment parsingEnvironment, SeparatorTemplate separatorTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : separatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SeparatorTemplate(ParsingEnvironment parsingEnvironment, SeparatorTemplate separatorTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivContainerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivContainerTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<DivAspectTemplate> field9, Field<List<DivBackgroundTemplate>> field10, Field<DivBorderTemplate> field11, Field<Expression<Boolean>> field12, Field<Expression<Boolean>> field13, Field<Expression<Long>> field14, Field<Expression<DivContentAlignmentHorizontal>> field15, Field<Expression<DivContentAlignmentVertical>> field16, Field<List<DivDisappearActionTemplate>> field17, Field<List<DivActionTemplate>> field18, Field<List<DivExtensionTemplate>> field19, Field<DivFocusTemplate> field20, Field<List<DivFunctionTemplate>> field21, Field<DivSizeTemplate> field22, Field<List<DivActionTemplate>> field23, Field<List<DivActionTemplate>> field24, Field<String> field25, Field<DivCollectionItemBuilderTemplate> field26, Field<Expression<Long>> field27, Field<List<DivTemplate>> field28, Field<Expression<DivContainer.LayoutMode>> field29, Field<DivLayoutProviderTemplate> field30, Field<SeparatorTemplate> field31, Field<Expression<Long>> field32, Field<List<DivActionTemplate>> field33, Field<DivEdgeInsetsTemplate> field34, Field<Expression<DivContainer.Orientation>> field35, Field<DivEdgeInsetsTemplate> field36, Field<List<DivActionTemplate>> field37, Field<List<DivActionTemplate>> field38, Field<Expression<String>> field39, Field<Expression<Long>> field40, Field<List<DivActionTemplate>> field41, Field<SeparatorTemplate> field42, Field<List<DivTooltipTemplate>> field43, Field<DivTransformTemplate> field44, Field<DivChangeTransitionTemplate> field45, Field<DivAppearanceTransitionTemplate> field46, Field<DivAppearanceTransitionTemplate> field47, Field<List<DivTransitionTrigger>> field48, Field<List<DivTriggerTemplate>> field49, Field<List<DivVariableTemplate>> field50, Field<Expression<DivVisibility>> field51, Field<DivVisibilityActionTemplate> field52, Field<List<DivVisibilityActionTemplate>> field53, Field<DivSizeTemplate> field54) {
        this.f46794a = field;
        this.f46796b = field2;
        this.f46798c = field3;
        this.f46799d = field4;
        this.f46800e = field5;
        this.f46801f = field6;
        this.f46802g = field7;
        this.f46803h = field8;
        this.f46804i = field9;
        this.f46805j = field10;
        this.f46806k = field11;
        this.f46807l = field12;
        this.f46808m = field13;
        this.f46809n = field14;
        this.f46810o = field15;
        this.f46811p = field16;
        this.f46812q = field17;
        this.f46813r = field18;
        this.f46814s = field19;
        this.f46815t = field20;
        this.f46816u = field21;
        this.f46817v = field22;
        this.f46818w = field23;
        this.f46819x = field24;
        this.f46820y = field25;
        this.f46821z = field26;
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
        this.f46795a0 = field53;
        this.f46797b0 = field54;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f46780d0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f46781e0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f46782f0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f46783g0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f46784h0 = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        f46785i0 = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        f46786j0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f46787k0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46788l0 = Expression.Companion.constant$default(companion, DivContainer.LayoutMode.NO_WRAP, null, 2, null);
        f46789m0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46790n0 = Expression.Companion.constant$default(companion, DivContainer.Orientation.VERTICAL, null, 2, null);
        f46791o0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f46792p0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        f46793q0 = new bk.p<ParsingEnvironment, JSONObject, DivContainerTemplate>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivContainerTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivContainerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivContainerTemplate(ParsingEnvironment parsingEnvironment, DivContainerTemplate divContainerTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divContainerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivContainerTemplate(ParsingEnvironment parsingEnvironment, DivContainerTemplate divContainerTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
