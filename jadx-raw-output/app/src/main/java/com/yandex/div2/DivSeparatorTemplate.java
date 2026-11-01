package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSeparatorTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSeparatorTemplate implements JSONSerializable, JsonTemplate<DivSeparator> {
    public static final a R = new a(null);
    public static final DivAnimation S;
    public static final Expression<Double> T;
    public static final Expression<Boolean> U;
    public static final DivSize.d V;
    public static final Expression<DivVisibility> W;
    public static final DivSize.c X;
    public static final bk.p<ParsingEnvironment, JSONObject, DivSeparatorTemplate> Y;
    public final Field<List<DivActionTemplate>> A;
    public final Field<List<DivActionTemplate>> B;
    public final Field<Expression<String>> C;
    public final Field<Expression<Long>> D;
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
    public final Field<DivAccessibilityTemplate> f48730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f48731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f48732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f48734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f48735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f48736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f48737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f48738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<DivBorderTemplate> f48739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Boolean>> f48740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Long>> f48741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<DelimiterStyleTemplate> f48742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f48743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f48745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<DivFocusTemplate> f48746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f48747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivSizeTemplate> f48748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<String> f48751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f48752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48755z;

    /* JADX INFO: compiled from: DivSeparatorTemplate.kt */
    public static final class DelimiterStyleTemplate implements JSONSerializable, JsonTemplate<DivSeparator.DelimiterStyle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48756c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Expression<Integer> f48757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Expression<DivSeparator.DelimiterStyle.Orientation> f48758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, DelimiterStyleTemplate> f48759f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Integer>> f48760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<DivSeparator.DelimiterStyle.Orientation>> f48761b;

        /* JADX INFO: compiled from: DivSeparatorTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public DelimiterStyleTemplate(Field<Expression<Integer>> field, Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2) {
            this.f48760a = field;
            this.f48761b = field2;
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f48757d = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            f48758e = Expression.Companion.constant$default(companion, DivSeparator.DelimiterStyle.Orientation.HORIZONTAL, null, 2, null);
            f48759f = new bk.p<ParsingEnvironment, JSONObject, DelimiterStyleTemplate>() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSeparatorTemplate.DelimiterStyleTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivSeparatorTemplate.DelimiterStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().K6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ DelimiterStyleTemplate(ParsingEnvironment parsingEnvironment, DelimiterStyleTemplate delimiterStyleTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : delimiterStyleTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DelimiterStyleTemplate(ParsingEnvironment parsingEnvironment, DelimiterStyleTemplate delimiterStyleTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivSeparatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSeparatorTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<List<DivBackgroundTemplate>> field9, Field<DivBorderTemplate> field10, Field<Expression<Boolean>> field11, Field<Expression<Long>> field12, Field<DelimiterStyleTemplate> field13, Field<List<DivDisappearActionTemplate>> field14, Field<List<DivActionTemplate>> field15, Field<List<DivExtensionTemplate>> field16, Field<DivFocusTemplate> field17, Field<List<DivFunctionTemplate>> field18, Field<DivSizeTemplate> field19, Field<List<DivActionTemplate>> field20, Field<List<DivActionTemplate>> field21, Field<String> field22, Field<DivLayoutProviderTemplate> field23, Field<List<DivActionTemplate>> field24, Field<DivEdgeInsetsTemplate> field25, Field<DivEdgeInsetsTemplate> field26, Field<List<DivActionTemplate>> field27, Field<List<DivActionTemplate>> field28, Field<Expression<String>> field29, Field<Expression<Long>> field30, Field<List<DivActionTemplate>> field31, Field<List<DivTooltipTemplate>> field32, Field<DivTransformTemplate> field33, Field<DivChangeTransitionTemplate> field34, Field<DivAppearanceTransitionTemplate> field35, Field<DivAppearanceTransitionTemplate> field36, Field<List<DivTransitionTrigger>> field37, Field<List<DivTriggerTemplate>> field38, Field<List<DivVariableTemplate>> field39, Field<Expression<DivVisibility>> field40, Field<DivVisibilityActionTemplate> field41, Field<List<DivVisibilityActionTemplate>> field42, Field<DivSizeTemplate> field43) {
        this.f48730a = field;
        this.f48731b = field2;
        this.f48732c = field3;
        this.f48733d = field4;
        this.f48734e = field5;
        this.f48735f = field6;
        this.f48736g = field7;
        this.f48737h = field8;
        this.f48738i = field9;
        this.f48739j = field10;
        this.f48740k = field11;
        this.f48741l = field12;
        this.f48742m = field13;
        this.f48743n = field14;
        this.f48744o = field15;
        this.f48745p = field16;
        this.f48746q = field17;
        this.f48747r = field18;
        this.f48748s = field19;
        this.f48749t = field20;
        this.f48750u = field21;
        this.f48751v = field22;
        this.f48752w = field23;
        this.f48753x = field24;
        this.f48754y = field25;
        this.f48755z = field26;
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
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        S = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        T = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        U = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        W = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        X = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        Y = new bk.p<ParsingEnvironment, JSONObject, DivSeparatorTemplate>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSeparatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSeparatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSeparatorTemplate(ParsingEnvironment parsingEnvironment, DivSeparatorTemplate divSeparatorTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSeparatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSeparatorTemplate(ParsingEnvironment parsingEnvironment, DivSeparatorTemplate divSeparatorTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
