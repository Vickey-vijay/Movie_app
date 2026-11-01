package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTabsTemplate implements JSONSerializable, JsonTemplate<DivTabs> {
    public static final a R = new a(null);
    public static final Expression<Double> S;
    public static final Expression<Boolean> T;
    public static final Expression<Boolean> U;
    public static final DivSize.d V;
    public static final Expression<Boolean> W;
    public static final Expression<Long> X;
    public static final Expression<Integer> Y;
    public static final DivEdgeInsets Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Boolean> f49365a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final DivEdgeInsets f49366b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivVisibility> f49367c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final DivSize.c f49368d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTabsTemplate> f49369e0;
    public final Field<DivEdgeInsetsTemplate> A;
    public final Field<Expression<Boolean>> B;
    public final Field<TabTitleDelimiterTemplate> C;
    public final Field<TabTitleStyleTemplate> D;
    public final Field<DivEdgeInsetsTemplate> E;
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
    public final Field<DivAccessibilityTemplate> f49370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f49371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f49372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f49373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f49374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f49375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivBorderTemplate> f49376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Long>> f49377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f49378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f49380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<DivFocusTemplate> f49381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f49382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<DivSizeTemplate> f49384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<String> f49385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<ItemTemplate>> f49386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<DivLayoutProviderTemplate> f49387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f49388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f49389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49390u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<Expression<String>> f49391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<Expression<Long>> f49392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<Expression<Long>> f49394y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<Expression<Integer>> f49395z;

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class TabTitleDelimiterTemplate implements JSONSerializable, JsonTemplate<DivTabs.TabTitleDelimiter> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f49401d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final DivFixedSize f49402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final DivFixedSize f49403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, TabTitleDelimiterTemplate> f49404g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivFixedSizeTemplate> f49405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<Uri>> f49406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<DivFixedSizeTemplate> f49407c;

        /* JADX INFO: compiled from: DivTabsTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public TabTitleDelimiterTemplate(Field<DivFixedSizeTemplate> field, Field<Expression<Uri>> field2, Field<DivFixedSizeTemplate> field3) {
            this.f49405a = field;
            this.f49406b = field2;
            this.f49407c = field3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            int i10 = 1;
            f49402e = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f49403f = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f49404g = new bk.p<ParsingEnvironment, JSONObject, TabTitleDelimiterTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleDelimiterTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabsTemplate.TabTitleDelimiterTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivTabsTemplate.TabTitleDelimiterTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().Y7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ TabTitleDelimiterTemplate(ParsingEnvironment parsingEnvironment, TabTitleDelimiterTemplate tabTitleDelimiterTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : tabTitleDelimiterTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TabTitleDelimiterTemplate(ParsingEnvironment parsingEnvironment, TabTitleDelimiterTemplate tabTitleDelimiterTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class TabTitleStyleTemplate implements JSONSerializable, JsonTemplate<DivTabs.TabTitleStyle> {
        public static final Expression<DivSizeUnit> A;
        public static final Expression<DivFontWeight> B;
        public static final Expression<Integer> C;
        public static final Expression<Long> D;
        public static final Expression<Double> E;
        public static final DivEdgeInsets F;
        public static final bk.p<ParsingEnvironment, JSONObject, TabTitleStyleTemplate> G;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f49408u = new a(null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final Expression<Integer> f49409v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final Expression<Integer> f49410w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Expression<Long> f49411x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Expression<DivTabs.TabTitleStyle.AnimationType> f49412y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Expression<Long> f49413z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<Expression<Integer>> f49414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<JSONObject>> f49415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<DivFontWeight>> f49416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<Integer>> f49417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<Expression<Long>> f49418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Field<Expression<DivTabs.TabTitleStyle.AnimationType>> f49419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Field<Expression<Long>> f49420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Field<DivCornersRadiusTemplate> f49421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Field<Expression<String>> f49422i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Field<Expression<Long>> f49423j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Field<Expression<DivSizeUnit>> f49424k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Field<Expression<DivFontWeight>> f49425l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Field<Expression<Integer>> f49426m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Field<Expression<JSONObject>> f49427n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Field<Expression<DivFontWeight>> f49428o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Field<Expression<Integer>> f49429p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Field<Expression<Long>> f49430q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Field<Expression<Double>> f49431r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Field<Expression<Long>> f49432s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Field<DivEdgeInsetsTemplate> f49433t;

        /* JADX INFO: compiled from: DivTabsTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public TabTitleStyleTemplate(Field<Expression<Integer>> field, Field<Expression<JSONObject>> field2, Field<Expression<DivFontWeight>> field3, Field<Expression<Integer>> field4, Field<Expression<Long>> field5, Field<Expression<DivTabs.TabTitleStyle.AnimationType>> field6, Field<Expression<Long>> field7, Field<DivCornersRadiusTemplate> field8, Field<Expression<String>> field9, Field<Expression<Long>> field10, Field<Expression<DivSizeUnit>> field11, Field<Expression<DivFontWeight>> field12, Field<Expression<Integer>> field13, Field<Expression<JSONObject>> field14, Field<Expression<DivFontWeight>> field15, Field<Expression<Integer>> field16, Field<Expression<Long>> field17, Field<Expression<Double>> field18, Field<Expression<Long>> field19, Field<DivEdgeInsetsTemplate> field20) {
            this.f49414a = field;
            this.f49415b = field2;
            this.f49416c = field3;
            this.f49417d = field4;
            this.f49418e = field5;
            this.f49419f = field6;
            this.f49420g = field7;
            this.f49421h = field8;
            this.f49422i = field9;
            this.f49423j = field10;
            this.f49424k = field11;
            this.f49425l = field12;
            this.f49426m = field13;
            this.f49427n = field14;
            this.f49428o = field15;
            this.f49429p = field16;
            this.f49430q = field17;
            this.f49431r = field18;
            this.f49432s = field19;
            this.f49433t = field20;
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f49409v = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            f49410w = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            f49411x = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            f49412y = Expression.Companion.constant$default(companion, DivTabs.TabTitleStyle.AnimationType.SLIDE, null, 2, null);
            f49413z = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            A = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            B = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            C = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            D = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            E = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            F = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            G = new bk.p<ParsingEnvironment, JSONObject, TabTitleStyleTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabsTemplate.TabTitleStyleTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivTabsTemplate.TabTitleStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().b8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ TabTitleStyleTemplate(ParsingEnvironment parsingEnvironment, TabTitleStyleTemplate tabTitleStyleTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : tabTitleStyleTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TabTitleStyleTemplate(ParsingEnvironment parsingEnvironment, TabTitleStyleTemplate tabTitleStyleTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTabsTemplate(Field<DivAccessibilityTemplate> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<DivAnimatorTemplate>> field5, Field<List<DivBackgroundTemplate>> field6, Field<DivBorderTemplate> field7, Field<Expression<Long>> field8, Field<List<DivDisappearActionTemplate>> field9, Field<Expression<Boolean>> field10, Field<List<DivExtensionTemplate>> field11, Field<DivFocusTemplate> field12, Field<List<DivFunctionTemplate>> field13, Field<Expression<Boolean>> field14, Field<DivSizeTemplate> field15, Field<String> field16, Field<List<ItemTemplate>> field17, Field<DivLayoutProviderTemplate> field18, Field<DivEdgeInsetsTemplate> field19, Field<DivEdgeInsetsTemplate> field20, Field<Expression<Boolean>> field21, Field<Expression<String>> field22, Field<Expression<Long>> field23, Field<List<DivActionTemplate>> field24, Field<Expression<Long>> field25, Field<Expression<Integer>> field26, Field<DivEdgeInsetsTemplate> field27, Field<Expression<Boolean>> field28, Field<TabTitleDelimiterTemplate> field29, Field<TabTitleStyleTemplate> field30, Field<DivEdgeInsetsTemplate> field31, Field<List<DivTooltipTemplate>> field32, Field<DivTransformTemplate> field33, Field<DivChangeTransitionTemplate> field34, Field<DivAppearanceTransitionTemplate> field35, Field<DivAppearanceTransitionTemplate> field36, Field<List<DivTransitionTrigger>> field37, Field<List<DivTriggerTemplate>> field38, Field<List<DivVariableTemplate>> field39, Field<Expression<DivVisibility>> field40, Field<DivVisibilityActionTemplate> field41, Field<List<DivVisibilityActionTemplate>> field42, Field<DivSizeTemplate> field43) {
        this.f49370a = field;
        this.f49371b = field2;
        this.f49372c = field3;
        this.f49373d = field4;
        this.f49374e = field5;
        this.f49375f = field6;
        this.f49376g = field7;
        this.f49377h = field8;
        this.f49378i = field9;
        this.f49379j = field10;
        this.f49380k = field11;
        this.f49381l = field12;
        this.f49382m = field13;
        this.f49383n = field14;
        this.f49384o = field15;
        this.f49385p = field16;
        this.f49386q = field17;
        this.f49387r = field18;
        this.f49388s = field19;
        this.f49389t = field20;
        this.f49390u = field21;
        this.f49391v = field22;
        this.f49392w = field23;
        this.f49393x = field24;
        this.f49394y = field25;
        this.f49395z = field26;
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

    /* JADX INFO: compiled from: DivTabsTemplate.kt */
    public static final class ItemTemplate implements JSONSerializable, JsonTemplate<DivTabs.Item> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f49396d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ItemTemplate> f49397e = new bk.p<ParsingEnvironment, JSONObject, ItemTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabsTemplate.ItemTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTabsTemplate.ItemTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivTemplate> f49398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<String>> f49399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<DivActionTemplate> f49400c;

        /* JADX INFO: compiled from: DivTabsTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public ItemTemplate(Field<DivTemplate> field, Field<Expression<String>> field2, Field<DivActionTemplate> field3) {
            this.f49398a = field;
            this.f49399b = field2;
            this.f49400c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().S7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ ItemTemplate(ParsingEnvironment parsingEnvironment, ItemTemplate itemTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : itemTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ItemTemplate(ParsingEnvironment parsingEnvironment, ItemTemplate itemTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        S = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        T = Expression.Companion.constant$default(companion, bool, null, 2, null);
        U = Expression.Companion.constant$default(companion, bool, null, 2, null);
        V = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Y = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression expression = null;
        Expression expression2 = null;
        int i10 = 82;
        ck.i iVar = null;
        Z = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f49365a0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49366b0 = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f49367c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f49368d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f49369e0 = new bk.p<ParsingEnvironment, JSONObject, DivTabsTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabsTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTabsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTabsTemplate(ParsingEnvironment parsingEnvironment, DivTabsTemplate divTabsTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTabsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTabsTemplate(ParsingEnvironment parsingEnvironment, DivTabsTemplate divTabsTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
