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

/* JADX INFO: compiled from: DivSliderTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSliderTemplate implements JSONSerializable, JsonTemplate<DivSlider> {
    public static final a V = new a(null);
    public static final Expression<Double> W;
    public static final DivSize.d X;
    public static final Expression<Boolean> Y;
    public static final Expression<Long> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Long> f48940a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<DivVisibility> f48941b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivSize.c f48942c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSliderTemplate> f48943d0;
    public final Field<TextStyleTemplate> A;
    public final Field<String> B;
    public final Field<DivDrawableTemplate> C;
    public final Field<TextStyleTemplate> D;
    public final Field<String> E;
    public final Field<DivDrawableTemplate> F;
    public final Field<DivDrawableTemplate> G;
    public final Field<List<DivTooltipTemplate>> H;
    public final Field<DivDrawableTemplate> I;
    public final Field<DivDrawableTemplate> J;
    public final Field<DivTransformTemplate> K;
    public final Field<DivChangeTransitionTemplate> L;
    public final Field<DivAppearanceTransitionTemplate> M;
    public final Field<DivAppearanceTransitionTemplate> N;
    public final Field<List<DivTransitionTrigger>> O;
    public final Field<List<DivTriggerTemplate>> P;
    public final Field<List<DivVariableTemplate>> Q;
    public final Field<Expression<DivVisibility>> R;
    public final Field<DivVisibilityActionTemplate> S;
    public final Field<List<DivVisibilityActionTemplate>> T;
    public final Field<DivSizeTemplate> U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f48944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f48945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f48946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f48947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f48948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f48949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f48950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f48951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f48952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f48953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivFocusTemplate> f48954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f48955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<DivSizeTemplate> f48956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<String> f48957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<Boolean>> f48958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f48959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<Expression<Long>> f48961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<Expression<Long>> f48962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<List<RangeTemplate>> f48964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<Expression<String>> f48965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<Expression<Long>> f48966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f48967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivDrawableTemplate> f48969z;

    /* JADX INFO: compiled from: DivSliderTemplate.kt */
    public static final class TextStyleTemplate implements JSONSerializable, JsonTemplate<DivSlider.TextStyle> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f48977j = new a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Expression<Long> f48978k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Expression<DivSizeUnit> f48979l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final Expression<Double> f48980m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Expression<Integer> f48981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, TextStyleTemplate> f48982o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<String>> f48983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<Long>> f48984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<DivSizeUnit>> f48985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<JSONObject>> f48986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<Expression<DivFontWeight>> f48987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Field<Expression<Long>> f48988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Field<Expression<Double>> f48989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Field<DivPointTemplate> f48990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Field<Expression<Integer>> f48991i;

        /* JADX INFO: compiled from: DivSliderTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public TextStyleTemplate(Field<Expression<String>> field, Field<Expression<Long>> field2, Field<Expression<DivSizeUnit>> field3, Field<Expression<JSONObject>> field4, Field<Expression<DivFontWeight>> field5, Field<Expression<Long>> field6, Field<Expression<Double>> field7, Field<DivPointTemplate> field8, Field<Expression<Integer>> field9) {
            this.f48983a = field;
            this.f48984b = field2;
            this.f48985c = field3;
            this.f48986d = field4;
            this.f48987e = field5;
            this.f48988f = field6;
            this.f48989g = field7;
            this.f48990h = field8;
            this.f48991i = field9;
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f48978k = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            f48979l = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            f48980m = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f48981n = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
            f48982o = new bk.p<ParsingEnvironment, JSONObject, TextStyleTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSliderTemplate.TextStyleTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivSliderTemplate.TextStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().o7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ TextStyleTemplate(ParsingEnvironment parsingEnvironment, TextStyleTemplate textStyleTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : textStyleTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TextStyleTemplate(ParsingEnvironment parsingEnvironment, TextStyleTemplate textStyleTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivSliderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSliderTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<List<DivDisappearActionTemplate>> field9, Field<List<DivExtensionTemplate>> field10, Field<DivFocusTemplate> field11, Field<List<DivFunctionTemplate>> field12, Field<DivSizeTemplate> field13, Field<String> field14, Field<Expression<Boolean>> field15, Field<DivLayoutProviderTemplate> field16, Field<DivEdgeInsetsTemplate> field17, Field<Expression<Long>> field18, Field<Expression<Long>> field19, Field<DivEdgeInsetsTemplate> field20, Field<List<RangeTemplate>> field21, Field<Expression<String>> field22, Field<Expression<Long>> field23, Field<DivAccessibilityTemplate> field24, Field<List<DivActionTemplate>> field25, Field<DivDrawableTemplate> field26, Field<TextStyleTemplate> field27, Field<String> field28, Field<DivDrawableTemplate> field29, Field<TextStyleTemplate> field30, Field<String> field31, Field<DivDrawableTemplate> field32, Field<DivDrawableTemplate> field33, Field<List<DivTooltipTemplate>> field34, Field<DivDrawableTemplate> field35, Field<DivDrawableTemplate> field36, Field<DivTransformTemplate> field37, Field<DivChangeTransitionTemplate> field38, Field<DivAppearanceTransitionTemplate> field39, Field<DivAppearanceTransitionTemplate> field40, Field<List<DivTransitionTrigger>> field41, Field<List<DivTriggerTemplate>> field42, Field<List<DivVariableTemplate>> field43, Field<Expression<DivVisibility>> field44, Field<DivVisibilityActionTemplate> field45, Field<List<DivVisibilityActionTemplate>> field46, Field<DivSizeTemplate> field47) {
        this.f48944a = field;
        this.f48945b = field2;
        this.f48946c = field3;
        this.f48947d = field4;
        this.f48948e = field5;
        this.f48949f = field6;
        this.f48950g = field7;
        this.f48951h = field8;
        this.f48952i = field9;
        this.f48953j = field10;
        this.f48954k = field11;
        this.f48955l = field12;
        this.f48956m = field13;
        this.f48957n = field14;
        this.f48958o = field15;
        this.f48959p = field16;
        this.f48960q = field17;
        this.f48961r = field18;
        this.f48962s = field19;
        this.f48963t = field20;
        this.f48964u = field21;
        this.f48965v = field22;
        this.f48966w = field23;
        this.f48967x = field24;
        this.f48968y = field25;
        this.f48969z = field26;
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
    }

    /* JADX INFO: compiled from: DivSliderTemplate.kt */
    public static final class RangeTemplate implements JSONSerializable, JsonTemplate<DivSlider.Range> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f48970f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, RangeTemplate> f48971g = new bk.p<ParsingEnvironment, JSONObject, RangeTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$RangeTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSliderTemplate.RangeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSliderTemplate.RangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Long>> f48972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<DivEdgeInsetsTemplate> f48973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<Long>> f48974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<DivDrawableTemplate> f48975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<DivDrawableTemplate> f48976e;

        /* JADX INFO: compiled from: DivSliderTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public RangeTemplate(Field<Expression<Long>> field, Field<DivEdgeInsetsTemplate> field2, Field<Expression<Long>> field3, Field<DivDrawableTemplate> field4, Field<DivDrawableTemplate> field5) {
            this.f48972a = field;
            this.f48973b = field2;
            this.f48974c = field3;
            this.f48975d = field4;
            this.f48976e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().l7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : rangeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Z = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f48940a0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48941b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f48942c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f48943d0 = new bk.p<ParsingEnvironment, JSONObject, DivSliderTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSliderTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSliderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSliderTemplate(ParsingEnvironment parsingEnvironment, DivSliderTemplate divSliderTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSliderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSliderTemplate(ParsingEnvironment parsingEnvironment, DivSliderTemplate divSliderTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
