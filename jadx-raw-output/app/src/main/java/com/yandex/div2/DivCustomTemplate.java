package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCustomTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivCustomTemplate implements JSONSerializable, JsonTemplate<DivCustom> {
    public static final a J = new a(null);
    public static final Expression<Double> K;
    public static final DivSize.d L;
    public static final Expression<DivVisibility> M;
    public static final DivSize.c N;
    public static final bk.p<ParsingEnvironment, JSONObject, DivCustomTemplate> O;
    public final Field<DivAppearanceTransitionTemplate> A;
    public final Field<DivAppearanceTransitionTemplate> B;
    public final Field<List<DivTransitionTrigger>> C;
    public final Field<List<DivTriggerTemplate>> D;
    public final Field<List<DivVariableTemplate>> E;
    public final Field<Expression<DivVisibility>> F;
    public final Field<DivVisibilityActionTemplate> G;
    public final Field<List<DivVisibilityActionTemplate>> H;
    public final Field<DivSizeTemplate> I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f46906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f46907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f46908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f46909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f46910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f46911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f46912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f46913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<JSONObject> f46914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<String> f46915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f46916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f46917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<DivFocusTemplate> f46918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f46919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<DivSizeTemplate> f46920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<String> f46921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivTemplate>> f46922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f46923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f46924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f46925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<String>> f46926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<Expression<Long>> f46927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<List<DivTooltipTemplate>> f46929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<DivTransformTemplate> f46930y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivChangeTransitionTemplate> f46931z;

    /* JADX INFO: compiled from: DivCustomTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivCustomTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<JSONObject> field9, Field<String> field10, Field<List<DivDisappearActionTemplate>> field11, Field<List<DivExtensionTemplate>> field12, Field<DivFocusTemplate> field13, Field<List<DivFunctionTemplate>> field14, Field<DivSizeTemplate> field15, Field<String> field16, Field<List<DivTemplate>> field17, Field<DivLayoutProviderTemplate> field18, Field<DivEdgeInsetsTemplate> field19, Field<DivEdgeInsetsTemplate> field20, Field<Expression<String>> field21, Field<Expression<Long>> field22, Field<List<DivActionTemplate>> field23, Field<List<DivTooltipTemplate>> field24, Field<DivTransformTemplate> field25, Field<DivChangeTransitionTemplate> field26, Field<DivAppearanceTransitionTemplate> field27, Field<DivAppearanceTransitionTemplate> field28, Field<List<DivTransitionTrigger>> field29, Field<List<DivTriggerTemplate>> field30, Field<List<DivVariableTemplate>> field31, Field<Expression<DivVisibility>> field32, Field<DivVisibilityActionTemplate> field33, Field<List<DivVisibilityActionTemplate>> field34, Field<DivSizeTemplate> field35) {
        this.f46906a = field;
        this.f46907b = field2;
        this.f46908c = field3;
        this.f46909d = field4;
        this.f46910e = field5;
        this.f46911f = field6;
        this.f46912g = field7;
        this.f46913h = field8;
        this.f46914i = field9;
        this.f46915j = field10;
        this.f46916k = field11;
        this.f46917l = field12;
        this.f46918m = field13;
        this.f46919n = field14;
        this.f46920o = field15;
        this.f46921p = field16;
        this.f46922q = field17;
        this.f46923r = field18;
        this.f46924s = field19;
        this.f46925t = field20;
        this.f46926u = field21;
        this.f46927v = field22;
        this.f46928w = field23;
        this.f46929x = field24;
        this.f46930y = field25;
        this.f46931z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        K = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        L = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        M = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        N = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        O = new bk.p<ParsingEnvironment, JSONObject, DivCustomTemplate>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCustomTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivCustomTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCustomTemplate(ParsingEnvironment parsingEnvironment, DivCustomTemplate divCustomTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCustomTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCustomTemplate(ParsingEnvironment parsingEnvironment, DivCustomTemplate divCustomTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
