package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGalleryTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivGalleryTemplate implements JSONSerializable, JsonTemplate<DivGallery> {
    public static final a R = new a(null);
    public static final Expression<Double> S;
    public static final Expression<DivGallery.CrossContentAlignment> T;
    public static final Expression<Long> U;
    public static final DivSize.d V;
    public static final Expression<Long> W;
    public static final Expression<DivGallery.Orientation> X;
    public static final Expression<Boolean> Y;
    public static final Expression<DivGallery.ScrollMode> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<DivGallery.Scrollbar> f47320a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47321b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivSize.c f47322c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivGalleryTemplate> f47323d0;
    public final Field<Expression<String>> A;
    public final Field<Expression<Long>> B;
    public final Field<Expression<DivGallery.ScrollMode>> C;
    public final Field<Expression<DivGallery.Scrollbar>> D;
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
    public final Field<DivAccessibilityTemplate> f47324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f47327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f47328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f47329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f47330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f47331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<Long>> f47332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<DivGallery.CrossContentAlignment>> f47333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Long>> f47334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Long>> f47335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f47336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f47337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<DivFocusTemplate> f47338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f47339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<DivSizeTemplate> f47340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<String> f47341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivCollectionItemBuilderTemplate> f47342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<Expression<Long>> f47343t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<List<DivTemplate>> f47344u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f47345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f47346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<Expression<DivGallery.Orientation>> f47347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f47348y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47349z;

    /* JADX INFO: compiled from: DivGalleryTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivGalleryTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<Expression<Long>> field9, Field<Expression<DivGallery.CrossContentAlignment>> field10, Field<Expression<Long>> field11, Field<Expression<Long>> field12, Field<List<DivDisappearActionTemplate>> field13, Field<List<DivExtensionTemplate>> field14, Field<DivFocusTemplate> field15, Field<List<DivFunctionTemplate>> field16, Field<DivSizeTemplate> field17, Field<String> field18, Field<DivCollectionItemBuilderTemplate> field19, Field<Expression<Long>> field20, Field<List<DivTemplate>> field21, Field<DivLayoutProviderTemplate> field22, Field<DivEdgeInsetsTemplate> field23, Field<Expression<DivGallery.Orientation>> field24, Field<DivEdgeInsetsTemplate> field25, Field<Expression<Boolean>> field26, Field<Expression<String>> field27, Field<Expression<Long>> field28, Field<Expression<DivGallery.ScrollMode>> field29, Field<Expression<DivGallery.Scrollbar>> field30, Field<List<DivActionTemplate>> field31, Field<List<DivTooltipTemplate>> field32, Field<DivTransformTemplate> field33, Field<DivChangeTransitionTemplate> field34, Field<DivAppearanceTransitionTemplate> field35, Field<DivAppearanceTransitionTemplate> field36, Field<List<DivTransitionTrigger>> field37, Field<List<DivTriggerTemplate>> field38, Field<List<DivVariableTemplate>> field39, Field<Expression<DivVisibility>> field40, Field<DivVisibilityActionTemplate> field41, Field<List<DivVisibilityActionTemplate>> field42, Field<DivSizeTemplate> field43) {
        this.f47324a = field;
        this.f47325b = field2;
        this.f47326c = field3;
        this.f47327d = field4;
        this.f47328e = field5;
        this.f47329f = field6;
        this.f47330g = field7;
        this.f47331h = field8;
        this.f47332i = field9;
        this.f47333j = field10;
        this.f47334k = field11;
        this.f47335l = field12;
        this.f47336m = field13;
        this.f47337n = field14;
        this.f47338o = field15;
        this.f47339p = field16;
        this.f47340q = field17;
        this.f47341r = field18;
        this.f47342s = field19;
        this.f47343t = field20;
        this.f47344u = field21;
        this.f47345v = field22;
        this.f47346w = field23;
        this.f47347x = field24;
        this.f47348y = field25;
        this.f47349z = field26;
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
        T = Expression.Companion.constant$default(companion, DivGallery.CrossContentAlignment.START, null, 2, null);
        U = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        W = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        X = Expression.Companion.constant$default(companion, DivGallery.Orientation.HORIZONTAL, null, 2, null);
        Y = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Z = Expression.Companion.constant$default(companion, DivGallery.ScrollMode.DEFAULT, null, 2, null);
        f47320a0 = Expression.Companion.constant$default(companion, DivGallery.Scrollbar.NONE, null, 2, null);
        f47321b0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47322c0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f47323d0 = new bk.p<ParsingEnvironment, JSONObject, DivGalleryTemplate>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGalleryTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivGalleryTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivGalleryTemplate(ParsingEnvironment parsingEnvironment, DivGalleryTemplate divGalleryTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divGalleryTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGalleryTemplate(ParsingEnvironment parsingEnvironment, DivGalleryTemplate divGalleryTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
