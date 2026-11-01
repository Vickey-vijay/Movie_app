package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivVideoTemplate implements JSONSerializable, JsonTemplate<DivVideo> {
    public static final a V = new a(null);
    public static final Expression<Double> W;
    public static final Expression<Boolean> X;
    public static final DivSize.d Y;
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Boolean> f50055a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Boolean> f50056b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivVideoScale> f50057c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVisibility> f50058d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.c f50059e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVideoTemplate> f50060f0;
    public final Field<Expression<Boolean>> A;
    public final Field<Expression<String>> B;
    public final Field<Expression<Boolean>> C;
    public final Field<List<DivActionTemplate>> D;
    public final Field<Expression<String>> E;
    public final Field<Expression<Long>> F;
    public final Field<Expression<DivVideoScale>> G;
    public final Field<List<DivActionTemplate>> H;
    public final Field<List<DivTooltipTemplate>> I;
    public final Field<DivTransformTemplate> J;
    public final Field<DivChangeTransitionTemplate> K;
    public final Field<DivAppearanceTransitionTemplate> L;
    public final Field<DivAppearanceTransitionTemplate> M;
    public final Field<List<DivTransitionTrigger>> N;
    public final Field<List<DivTriggerTemplate>> O;
    public final Field<List<DivVariableTemplate>> P;
    public final Field<List<DivVideoSourceTemplate>> Q;
    public final Field<Expression<DivVisibility>> R;
    public final Field<DivVisibilityActionTemplate> S;
    public final Field<List<DivVisibilityActionTemplate>> T;
    public final Field<DivSizeTemplate> U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f50061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f50062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f50063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f50064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f50065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<DivAspectTemplate> f50066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Boolean>> f50067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f50068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<DivBorderTemplate> f50069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f50070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Long>> f50071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f50072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<String> f50073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f50074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f50075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f50076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<DivFocusTemplate> f50077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f50078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivSizeTemplate> f50079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<String> f50080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f50081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f50082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<Expression<Boolean>> f50083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f50084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f50085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<JSONObject> f50086z;

    /* JADX INFO: compiled from: DivVideoTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivVideoTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<DivAspectTemplate> field6, Field<Expression<Boolean>> field7, Field<List<DivBackgroundTemplate>> field8, Field<DivBorderTemplate> field9, Field<List<DivActionTemplate>> field10, Field<Expression<Long>> field11, Field<List<DivDisappearActionTemplate>> field12, Field<String> field13, Field<List<DivActionTemplate>> field14, Field<List<DivExtensionTemplate>> field15, Field<List<DivActionTemplate>> field16, Field<DivFocusTemplate> field17, Field<List<DivFunctionTemplate>> field18, Field<DivSizeTemplate> field19, Field<String> field20, Field<DivLayoutProviderTemplate> field21, Field<DivEdgeInsetsTemplate> field22, Field<Expression<Boolean>> field23, Field<DivEdgeInsetsTemplate> field24, Field<List<DivActionTemplate>> field25, Field<JSONObject> field26, Field<Expression<Boolean>> field27, Field<Expression<String>> field28, Field<Expression<Boolean>> field29, Field<List<DivActionTemplate>> field30, Field<Expression<String>> field31, Field<Expression<Long>> field32, Field<Expression<DivVideoScale>> field33, Field<List<DivActionTemplate>> field34, Field<List<DivTooltipTemplate>> field35, Field<DivTransformTemplate> field36, Field<DivChangeTransitionTemplate> field37, Field<DivAppearanceTransitionTemplate> field38, Field<DivAppearanceTransitionTemplate> field39, Field<List<DivTransitionTrigger>> field40, Field<List<DivTriggerTemplate>> field41, Field<List<DivVariableTemplate>> field42, Field<List<DivVideoSourceTemplate>> field43, Field<Expression<DivVisibility>> field44, Field<DivVisibilityActionTemplate> field45, Field<List<DivVisibilityActionTemplate>> field46, Field<DivSizeTemplate> field47) {
        this.f50061a = field;
        this.f50062b = field2;
        this.f50063c = field3;
        this.f50064d = field4;
        this.f50065e = field5;
        this.f50066f = field6;
        this.f50067g = field7;
        this.f50068h = field8;
        this.f50069i = field9;
        this.f50070j = field10;
        this.f50071k = field11;
        this.f50072l = field12;
        this.f50073m = field13;
        this.f50074n = field14;
        this.f50075o = field15;
        this.f50076p = field16;
        this.f50077q = field17;
        this.f50078r = field18;
        this.f50079s = field19;
        this.f50080t = field20;
        this.f50081u = field21;
        this.f50082v = field22;
        this.f50083w = field23;
        this.f50084x = field24;
        this.f50085y = field25;
        this.f50086z = field26;
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        X = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50055a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50056b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50057c0 = Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        f50058d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f50059e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        f50060f0 = new bk.p<ParsingEnvironment, JSONObject, DivVideoTemplate>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideoTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivVideoTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivVideoTemplate(ParsingEnvironment parsingEnvironment, DivVideoTemplate divVideoTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divVideoTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivVideoTemplate(ParsingEnvironment parsingEnvironment, DivVideoTemplate divVideoTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
