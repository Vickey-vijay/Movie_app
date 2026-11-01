package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivStateTemplate implements JSONSerializable, JsonTemplate<DivState> {
    public static final a W = new a(null);
    public static final DivAnimation X;
    public static final Expression<Double> Y;
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Boolean> f49074a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final DivSize.d f49075b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivTransitionSelector> f49076c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVisibility> f49077d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.c f49078e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStateTemplate> f49079f0;
    public final Field<DivEdgeInsetsTemplate> A;
    public final Field<DivEdgeInsetsTemplate> B;
    public final Field<List<DivActionTemplate>> C;
    public final Field<List<DivActionTemplate>> D;
    public final Field<Expression<String>> E;
    public final Field<Expression<Long>> F;
    public final Field<List<DivActionTemplate>> G;
    public final Field<String> H;
    public final Field<List<StateTemplate>> I;
    public final Field<List<DivTooltipTemplate>> J;
    public final Field<DivTransformTemplate> K;
    public final Field<Expression<DivTransitionSelector>> L;
    public final Field<DivChangeTransitionTemplate> M;
    public final Field<DivAppearanceTransitionTemplate> N;
    public final Field<DivAppearanceTransitionTemplate> O;
    public final Field<List<DivTransitionTrigger>> P;
    public final Field<List<DivTriggerTemplate>> Q;
    public final Field<List<DivVariableTemplate>> R;
    public final Field<Expression<DivVisibility>> S;
    public final Field<DivVisibilityActionTemplate> T;
    public final Field<List<DivVisibilityActionTemplate>> U;
    public final Field<DivSizeTemplate> V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f49080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f49081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f49082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f49084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f49085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f49086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f49087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f49088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<DivBorderTemplate> f49089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Long>> f49092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<String>> f49093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f49094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<String> f49095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f49097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivFocusTemplate> f49098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f49099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<DivSizeTemplate> f49100u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49101v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<String> f49103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f49104y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49105z;

    /* JADX INFO: compiled from: DivStateTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivStateTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<List<DivBackgroundTemplate>> field9, Field<DivBorderTemplate> field10, Field<Expression<Boolean>> field11, Field<Expression<Boolean>> field12, Field<Expression<Long>> field13, Field<Expression<String>> field14, Field<List<DivDisappearActionTemplate>> field15, Field<String> field16, Field<List<DivActionTemplate>> field17, Field<List<DivExtensionTemplate>> field18, Field<DivFocusTemplate> field19, Field<List<DivFunctionTemplate>> field20, Field<DivSizeTemplate> field21, Field<List<DivActionTemplate>> field22, Field<List<DivActionTemplate>> field23, Field<String> field24, Field<DivLayoutProviderTemplate> field25, Field<List<DivActionTemplate>> field26, Field<DivEdgeInsetsTemplate> field27, Field<DivEdgeInsetsTemplate> field28, Field<List<DivActionTemplate>> field29, Field<List<DivActionTemplate>> field30, Field<Expression<String>> field31, Field<Expression<Long>> field32, Field<List<DivActionTemplate>> field33, Field<String> field34, Field<List<StateTemplate>> field35, Field<List<DivTooltipTemplate>> field36, Field<DivTransformTemplate> field37, Field<Expression<DivTransitionSelector>> field38, Field<DivChangeTransitionTemplate> field39, Field<DivAppearanceTransitionTemplate> field40, Field<DivAppearanceTransitionTemplate> field41, Field<List<DivTransitionTrigger>> field42, Field<List<DivTriggerTemplate>> field43, Field<List<DivVariableTemplate>> field44, Field<Expression<DivVisibility>> field45, Field<DivVisibilityActionTemplate> field46, Field<List<DivVisibilityActionTemplate>> field47, Field<DivSizeTemplate> field48) {
        this.f49080a = field;
        this.f49081b = field2;
        this.f49082c = field3;
        this.f49083d = field4;
        this.f49084e = field5;
        this.f49085f = field6;
        this.f49086g = field7;
        this.f49087h = field8;
        this.f49088i = field9;
        this.f49089j = field10;
        this.f49090k = field11;
        this.f49091l = field12;
        this.f49092m = field13;
        this.f49093n = field14;
        this.f49094o = field15;
        this.f49095p = field16;
        this.f49096q = field17;
        this.f49097r = field18;
        this.f49098s = field19;
        this.f49099t = field20;
        this.f49100u = field21;
        this.f49101v = field22;
        this.f49102w = field23;
        this.f49103x = field24;
        this.f49104y = field25;
        this.f49105z = field26;
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
    }

    /* JADX INFO: compiled from: DivStateTemplate.kt */
    public static final class StateTemplate implements JSONSerializable, JsonTemplate<DivState.State> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f49106f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, StateTemplate> f49107g = new bk.p<ParsingEnvironment, JSONObject, StateTemplate>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStateTemplate.StateTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivStateTemplate.StateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivAnimationTemplate> f49108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<DivAnimationTemplate> f49109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<DivTemplate> f49110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<String> f49111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<List<DivActionTemplate>> f49112e;

        /* JADX INFO: compiled from: DivStateTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public StateTemplate(Field<DivAnimationTemplate> field, Field<DivAnimationTemplate> field2, Field<DivTemplate> field3, Field<String> field4, Field<List<DivActionTemplate>> field5) {
            this.f49108a = field;
            this.f49109b = field2;
            this.f49110c = field3;
            this.f49111d = field4;
            this.f49112e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().x7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : stateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        X = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        Y = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49074a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49075b0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f49076c0 = Expression.Companion.constant$default(companion, DivTransitionSelector.STATE_CHANGE, null, 2, null);
        f49077d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f49078e0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f49079f0 = new bk.p<ParsingEnvironment, JSONObject, DivStateTemplate>() { // from class: com.yandex.div2.DivStateTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStateTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivStateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivStateTemplate(ParsingEnvironment parsingEnvironment, DivStateTemplate divStateTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivStateTemplate(ParsingEnvironment parsingEnvironment, DivStateTemplate divStateTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
