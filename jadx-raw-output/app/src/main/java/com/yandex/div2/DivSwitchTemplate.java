package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSwitchTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivSwitchTemplate implements JSONSerializable, JsonTemplate<DivSwitch> {
    public static final a J = new a(null);
    public static final Expression<Double> K;
    public static final DivSize.d L;
    public static final Expression<Boolean> M;
    public static final Expression<DivVisibility> N;
    public static final DivSize.c O;
    public static final bk.p<ParsingEnvironment, JSONObject, DivSwitchTemplate> P;
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
    public final Field<DivAccessibilityTemplate> f49215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f49216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f49217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f49218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f49219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f49220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f49221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f49222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f49223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f49224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivFocusTemplate> f49225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f49226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<DivSizeTemplate> f49227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<String> f49228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<String> f49230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f49231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f49232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<Expression<Integer>> f49233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f49234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<String>> f49235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<Expression<Long>> f49236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<List<DivTooltipTemplate>> f49238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<DivTransformTemplate> f49239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<DivChangeTransitionTemplate> f49240z;

    /* JADX INFO: compiled from: DivSwitchTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSwitchTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<List<DivDisappearActionTemplate>> field9, Field<List<DivExtensionTemplate>> field10, Field<DivFocusTemplate> field11, Field<List<DivFunctionTemplate>> field12, Field<DivSizeTemplate> field13, Field<String> field14, Field<Expression<Boolean>> field15, Field<String> field16, Field<DivLayoutProviderTemplate> field17, Field<DivEdgeInsetsTemplate> field18, Field<Expression<Integer>> field19, Field<DivEdgeInsetsTemplate> field20, Field<Expression<String>> field21, Field<Expression<Long>> field22, Field<List<DivActionTemplate>> field23, Field<List<DivTooltipTemplate>> field24, Field<DivTransformTemplate> field25, Field<DivChangeTransitionTemplate> field26, Field<DivAppearanceTransitionTemplate> field27, Field<DivAppearanceTransitionTemplate> field28, Field<List<DivTransitionTrigger>> field29, Field<List<DivTriggerTemplate>> field30, Field<List<DivVariableTemplate>> field31, Field<Expression<DivVisibility>> field32, Field<DivVisibilityActionTemplate> field33, Field<List<DivVisibilityActionTemplate>> field34, Field<DivSizeTemplate> field35) {
        this.f49215a = field;
        this.f49216b = field2;
        this.f49217c = field3;
        this.f49218d = field4;
        this.f49219e = field5;
        this.f49220f = field6;
        this.f49221g = field7;
        this.f49222h = field8;
        this.f49223i = field9;
        this.f49224j = field10;
        this.f49225k = field11;
        this.f49226l = field12;
        this.f49227m = field13;
        this.f49228n = field14;
        this.f49229o = field15;
        this.f49230p = field16;
        this.f49231q = field17;
        this.f49232r = field18;
        this.f49233s = field19;
        this.f49234t = field20;
        this.f49235u = field21;
        this.f49236v = field22;
        this.f49237w = field23;
        this.f49238x = field24;
        this.f49239y = field25;
        this.f49240z = field26;
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
        M = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        N = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        O = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        P = new bk.p<ParsingEnvironment, JSONObject, DivSwitchTemplate>() { // from class: com.yandex.div2.DivSwitchTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSwitchTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSwitchTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSwitchTemplate(ParsingEnvironment parsingEnvironment, DivSwitchTemplate divSwitchTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSwitchTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSwitchTemplate(ParsingEnvironment parsingEnvironment, DivSwitchTemplate divSwitchTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
