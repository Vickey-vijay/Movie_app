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

/* JADX INFO: compiled from: DivSelectTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSelectTemplate implements JSONSerializable, JsonTemplate<DivSelect> {
    public static final a T = new a(null);
    public static final Expression<Double> U;
    public static final Expression<Long> V;
    public static final Expression<DivSizeUnit> W;
    public static final DivSize.d X;
    public static final Expression<Integer> Y;
    public static final Expression<Double> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Integer> f48638a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<DivVisibility> f48639b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivSize.c f48640c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSelectTemplate> f48641d0;
    public final Field<List<OptionTemplate>> A;
    public final Field<DivEdgeInsetsTemplate> B;
    public final Field<Expression<String>> C;
    public final Field<Expression<Long>> D;
    public final Field<List<DivActionTemplate>> E;
    public final Field<Expression<Integer>> F;
    public final Field<List<DivTooltipTemplate>> G;
    public final Field<DivTransformTemplate> H;
    public final Field<DivChangeTransitionTemplate> I;
    public final Field<DivAppearanceTransitionTemplate> J;
    public final Field<DivAppearanceTransitionTemplate> K;
    public final Field<List<DivTransitionTrigger>> L;
    public final Field<String> M;
    public final Field<List<DivTriggerTemplate>> N;
    public final Field<List<DivVariableTemplate>> O;
    public final Field<Expression<DivVisibility>> P;
    public final Field<DivVisibilityActionTemplate> Q;
    public final Field<List<DivVisibilityActionTemplate>> R;
    public final Field<DivSizeTemplate> S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f48642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f48643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f48644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f48645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f48646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f48647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f48648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f48649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f48650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f48651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivFocusTemplate> f48652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<String>> f48653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Long>> f48654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f48655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<JSONObject>> f48656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<Expression<DivFontWeight>> f48657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<Expression<Long>> f48658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f48659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivSizeTemplate> f48660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<Expression<Integer>> f48661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<String>> f48662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<String> f48663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f48664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<Expression<Double>> f48665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<Expression<Long>> f48666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f48667z;

    /* JADX INFO: compiled from: DivSelectTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSelectTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<List<DivDisappearActionTemplate>> field9, Field<List<DivExtensionTemplate>> field10, Field<DivFocusTemplate> field11, Field<Expression<String>> field12, Field<Expression<Long>> field13, Field<Expression<DivSizeUnit>> field14, Field<Expression<JSONObject>> field15, Field<Expression<DivFontWeight>> field16, Field<Expression<Long>> field17, Field<List<DivFunctionTemplate>> field18, Field<DivSizeTemplate> field19, Field<Expression<Integer>> field20, Field<Expression<String>> field21, Field<String> field22, Field<DivLayoutProviderTemplate> field23, Field<Expression<Double>> field24, Field<Expression<Long>> field25, Field<DivEdgeInsetsTemplate> field26, Field<List<OptionTemplate>> field27, Field<DivEdgeInsetsTemplate> field28, Field<Expression<String>> field29, Field<Expression<Long>> field30, Field<List<DivActionTemplate>> field31, Field<Expression<Integer>> field32, Field<List<DivTooltipTemplate>> field33, Field<DivTransformTemplate> field34, Field<DivChangeTransitionTemplate> field35, Field<DivAppearanceTransitionTemplate> field36, Field<DivAppearanceTransitionTemplate> field37, Field<List<DivTransitionTrigger>> field38, Field<String> field39, Field<List<DivTriggerTemplate>> field40, Field<List<DivVariableTemplate>> field41, Field<Expression<DivVisibility>> field42, Field<DivVisibilityActionTemplate> field43, Field<List<DivVisibilityActionTemplate>> field44, Field<DivSizeTemplate> field45) {
        this.f48642a = field;
        this.f48643b = field2;
        this.f48644c = field3;
        this.f48645d = field4;
        this.f48646e = field5;
        this.f48647f = field6;
        this.f48648g = field7;
        this.f48649h = field8;
        this.f48650i = field9;
        this.f48651j = field10;
        this.f48652k = field11;
        this.f48653l = field12;
        this.f48654m = field13;
        this.f48655n = field14;
        this.f48656o = field15;
        this.f48657p = field16;
        this.f48658q = field17;
        this.f48659r = field18;
        this.f48660s = field19;
        this.f48661t = field20;
        this.f48662u = field21;
        this.f48663v = field22;
        this.f48664w = field23;
        this.f48665x = field24;
        this.f48666y = field25;
        this.f48667z = field26;
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
    }

    /* JADX INFO: compiled from: DivSelectTemplate.kt */
    public static final class OptionTemplate implements JSONSerializable, JsonTemplate<DivSelect.Option> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48668c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, OptionTemplate> f48669d = new bk.p<ParsingEnvironment, JSONObject, OptionTemplate>() { // from class: com.yandex.div2.DivSelectTemplate$OptionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelectTemplate.OptionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSelectTemplate.OptionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<String>> f48670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<String>> f48671b;

        /* JADX INFO: compiled from: DivSelectTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public OptionTemplate(Field<Expression<String>> field, Field<Expression<String>> field2) {
            this.f48670a = field;
            this.f48671b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().H6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ OptionTemplate(ParsingEnvironment parsingEnvironment, OptionTemplate optionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : optionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OptionTemplate(ParsingEnvironment parsingEnvironment, OptionTemplate optionTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        W = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48638a0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f48639b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f48640c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f48641d0 = new bk.p<ParsingEnvironment, JSONObject, DivSelectTemplate>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelectTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSelectTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSelectTemplate(ParsingEnvironment parsingEnvironment, DivSelectTemplate divSelectTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSelectTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSelectTemplate(ParsingEnvironment parsingEnvironment, DivSelectTemplate divSelectTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
