package com.yandex.div2;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivContainer implements JSONSerializable, Hashable, oe.e2 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final a f46692e0 = new a(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final DivAnimation f46693f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Expression<Double> f46694g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Expression<Boolean> f46695h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<Boolean> f46696i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Expression<DivContentAlignmentHorizontal> f46697j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Expression<DivContentAlignmentVertical> f46698k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final DivSize.d f46699l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Expression<Long> f46700m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Expression<LayoutMode> f46701n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Expression<Long> f46702o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Expression<Orientation> f46703p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Expression<DivVisibility> f46704q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final DivSize.c f46705r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivContainer> f46706s0;
    public final Expression<Long> A;
    public final List<Div> B;
    public final Expression<LayoutMode> C;
    public final DivLayoutProvider D;
    public final Separator E;
    public final Expression<Long> F;
    public final List<DivAction> G;
    public final DivEdgeInsets H;
    public final Expression<Orientation> I;
    public final DivEdgeInsets J;
    public final List<DivAction> K;
    public final List<DivAction> L;
    public final Expression<String> M;
    public final Expression<Long> N;
    public final List<DivAction> O;
    public final Separator P;
    public final List<DivTooltip> Q;
    public final DivTransform R;
    public final DivChangeTransition S;
    public final DivAppearanceTransition T;
    public final DivAppearanceTransition U;
    public final List<DivTransitionTrigger> V;
    public final List<DivTrigger> W;
    public final List<DivVariable> X;
    public final Expression<DivVisibility> Y;
    public final DivVisibilityAction Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f46707a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List<DivVisibilityAction> f46708a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAction f46709b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final DivSize f46710b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivAnimation f46711c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Integer f46712c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f46713d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Integer f46714d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f46715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f46716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f46717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivAnimator> f46718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DivAspect f46719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivBackground> f46720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivBorder f46721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Boolean> f46722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression<Boolean> f46723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression<Long> f46724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<DivContentAlignmentHorizontal> f46725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression<DivContentAlignmentVertical> f46726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<DivDisappearAction> f46727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivAction> f46728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<DivExtension> f46729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DivFocus f46730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<DivFunction> f46731u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DivSize f46732v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<DivAction> f46733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<DivAction> f46734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f46735y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivCollectionItemBuilder f46736z;

    /* JADX INFO: compiled from: DivContainer.kt */
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<LayoutMode, String> TO_STRING = new bk.l<LayoutMode, String>() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivContainer.LayoutMode layoutMode) {
                return DivContainer.LayoutMode.Converter.b(layoutMode);
            }
        };
        public static final bk.l<String, LayoutMode> FROM_STRING = new bk.l<String, LayoutMode>() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivContainer.LayoutMode invoke(String str) {
                return DivContainer.LayoutMode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivContainer.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final LayoutMode a(String str) {
                LayoutMode layoutMode = LayoutMode.NO_WRAP;
                if (ck.p.e(str, layoutMode.value)) {
                    return layoutMode;
                }
                LayoutMode layoutMode2 = LayoutMode.WRAP;
                if (ck.p.e(str, layoutMode2.value)) {
                    return layoutMode2;
                }
                return null;
            }

            public final String b(LayoutMode layoutMode) {
                return layoutMode.value;
            }
        }

        LayoutMode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivContainer.kt */
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Orientation, String> TO_STRING = new bk.l<Orientation, String>() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivContainer.Orientation orientation) {
                return DivContainer.Orientation.Converter.b(orientation);
            }
        };
        public static final bk.l<String, Orientation> FROM_STRING = new bk.l<String, Orientation>() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivContainer.Orientation invoke(String str) {
                return DivContainer.Orientation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivContainer.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Orientation a(String str) {
                Orientation orientation = Orientation.VERTICAL;
                if (ck.p.e(str, orientation.value)) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.HORIZONTAL;
                if (ck.p.e(str, orientation2.value)) {
                    return orientation2;
                }
                Orientation orientation3 = Orientation.OVERLAP;
                if (ck.p.e(str, orientation3.value)) {
                    return orientation3;
                }
                return null;
            }

            public final String b(Orientation orientation) {
                return orientation.value;
            }
        }

        Orientation(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivContainer.kt */
    public static final class Separator implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f46739g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Expression<Boolean> f46740h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Expression<Boolean> f46741i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Expression<Boolean> f46742j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Separator> f46743k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DivEdgeInsets f46744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Boolean> f46745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<Boolean> f46746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<Boolean> f46747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivDrawable f46748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f46749f;

        public final boolean a(Separator separator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            if (separator == null) {
                return false;
            }
            DivEdgeInsets divEdgeInsets = this.f46744a;
            if (divEdgeInsets != null) {
                zA = divEdgeInsets.a(separator.f46744a, expressionResolver, expressionResolver2);
            } else {
                zA = separator.f46744a == null;
            }
            return zA && this.f46745b.evaluate(expressionResolver).booleanValue() == separator.f46745b.evaluate(expressionResolver2).booleanValue() && this.f46746c.evaluate(expressionResolver).booleanValue() == separator.f46746c.evaluate(expressionResolver2).booleanValue() && this.f46747d.evaluate(expressionResolver).booleanValue() == separator.f46747d.evaluate(expressionResolver2).booleanValue() && this.f46748e.a(separator.f46748e, expressionResolver, expressionResolver2);
        }

        /* JADX INFO: compiled from: DivContainer.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Separator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().p2().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            Boolean bool = Boolean.FALSE;
            f46740h = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f46741i = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f46742j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            f46743k = new bk.p<ParsingEnvironment, JSONObject, Separator>() { // from class: com.yandex.div2.DivContainer$Separator$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivContainer.Separator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivContainer.Separator.f46739g.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f46749f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Separator.class).hashCode();
            DivEdgeInsets divEdgeInsets = this.f46744a;
            int iHash = iHashCode + (divEdgeInsets != null ? divEdgeInsets.hash() : 0) + this.f46745b.hashCode() + this.f46746c.hashCode() + this.f46747d.hashCode() + this.f46748e.hash();
            this.f46749f = Integer.valueOf(iHash);
            return iHash;
        }

        public Separator(DivEdgeInsets divEdgeInsets, Expression<Boolean> expression, Expression<Boolean> expression2, Expression<Boolean> expression3, DivDrawable divDrawable) {
            this.f46744a = divEdgeInsets;
            this.f46745b = expression;
            this.f46746c = expression2;
            this.f46747d = expression3;
            this.f46748e = divDrawable;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().p2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public DivContainer() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivContainer(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, DivAspect divAspect, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Boolean> expression5, Expression<Long> expression6, Expression<DivContentAlignmentHorizontal> expression7, Expression<DivContentAlignmentVertical> expression8, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression<Long> expression9, List<? extends Div> list10, Expression<LayoutMode> expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression<Long> expression11, List<DivAction> list11, DivEdgeInsets divEdgeInsets, Expression<Orientation> expression12, DivEdgeInsets divEdgeInsets2, List<DivAction> list12, List<DivAction> list13, Expression<String> expression13, Expression<Long> expression14, List<DivAction> list14, Separator separator2, List<DivTooltip> list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends DivVariable> list18, Expression<DivVisibility> expression15, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list19, DivSize divSize2) {
        this.f46707a = divAccessibility;
        this.f46709b = divAction;
        this.f46711c = divAnimation;
        this.f46713d = list;
        this.f46715e = expression;
        this.f46716f = expression2;
        this.f46717g = expression3;
        this.f46718h = list2;
        this.f46719i = divAspect;
        this.f46720j = list3;
        this.f46721k = divBorder;
        this.f46722l = expression4;
        this.f46723m = expression5;
        this.f46724n = expression6;
        this.f46725o = expression7;
        this.f46726p = expression8;
        this.f46727q = list4;
        this.f46728r = list5;
        this.f46729s = list6;
        this.f46730t = divFocus;
        this.f46731u = list7;
        this.f46732v = divSize;
        this.f46733w = list8;
        this.f46734x = list9;
        this.f46735y = str;
        this.f46736z = divCollectionItemBuilder;
        this.A = expression9;
        this.B = list10;
        this.C = expression10;
        this.D = divLayoutProvider;
        this.E = separator;
        this.F = expression11;
        this.G = list11;
        this.H = divEdgeInsets;
        this.I = expression12;
        this.J = divEdgeInsets2;
        this.K = list12;
        this.L = list13;
        this.M = expression13;
        this.N = expression14;
        this.O = list14;
        this.P = separator2;
        this.Q = list15;
        this.R = divTransform;
        this.S = divChangeTransition;
        this.T = divAppearanceTransition;
        this.U = divAppearanceTransition2;
        this.V = list16;
        this.W = list17;
        this.X = list18;
        this.Y = expression15;
        this.Z = divVisibilityAction;
        this.f46708a0 = list19;
        this.f46710b0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivContainer B(DivContainer divContainer, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divContainer.q() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divContainer.f46709b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divContainer.f46711c : divAnimation;
        List list20 = (i10 & 8) != 0 ? divContainer.f46713d : list;
        Expression expressionG = (i10 & 16) != 0 ? divContainer.g() : expression;
        Expression expressionN = (i10 & 32) != 0 ? divContainer.n() : expression2;
        Expression expressionO = (i10 & 64) != 0 ? divContainer.o() : expression3;
        List listY = (i10 & 128) != 0 ? divContainer.y() : list2;
        DivAspect divAspect2 = (i10 & 256) != 0 ? divContainer.f46719i : divAspect;
        List background = (i10 & 512) != 0 ? divContainer.getBackground() : list3;
        DivBorder divBorderZ = (i10 & 1024) != 0 ? divContainer.z() : divBorder;
        Expression expression16 = (i10 & 2048) != 0 ? divContainer.f46722l : expression4;
        Expression expression17 = (i10 & 4096) != 0 ? divContainer.f46723m : expression5;
        Expression expressionB = (i10 & 8192) != 0 ? divContainer.b() : expression6;
        Expression expression18 = (i10 & 16384) != 0 ? divContainer.f46725o : expression7;
        Expression expression19 = (i10 & 32768) != 0 ? divContainer.f46726p : expression8;
        List listK = (i10 & 65536) != 0 ? divContainer.k() : list4;
        Expression expression20 = expression19;
        List list21 = (i10 & 131072) != 0 ? divContainer.f46728r : list5;
        List extensions = (i10 & 262144) != 0 ? divContainer.getExtensions() : list6;
        DivFocus divFocusP = (i10 & 524288) != 0 ? divContainer.p() : divFocus;
        List listW = (i10 & 1048576) != 0 ? divContainer.w() : list7;
        DivSize height = (i10 & 2097152) != 0 ? divContainer.getHeight() : divSize;
        List list22 = list21;
        List list23 = (i10 & 4194304) != 0 ? divContainer.f46733w : list8;
        List list24 = (i10 & 8388608) != 0 ? divContainer.f46734x : list9;
        String id2 = (i10 & 16777216) != 0 ? divContainer.getId() : str;
        List list25 = list24;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i10 & 33554432) != 0 ? divContainer.f46736z : divCollectionItemBuilder;
        Expression expression21 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divContainer.A : expression9;
        List list26 = (i10 & 134217728) != 0 ? divContainer.B : list10;
        Expression expression22 = (i10 & 268435456) != 0 ? divContainer.C : expression10;
        DivLayoutProvider divLayoutProviderT = (i10 & 536870912) != 0 ? divContainer.t() : divLayoutProvider;
        Expression expression23 = expression22;
        Separator separator3 = (i10 & 1073741824) != 0 ? divContainer.E : separator;
        Expression expression24 = (i10 & Integer.MIN_VALUE) != 0 ? divContainer.F : expression11;
        List list27 = (i11 & 1) != 0 ? divContainer.G : list11;
        DivEdgeInsets divEdgeInsetsD = (i11 & 2) != 0 ? divContainer.d() : divEdgeInsets;
        List list28 = list27;
        Expression expression25 = (i11 & 4) != 0 ? divContainer.I : expression12;
        return divContainer.A(divAccessibilityQ, divAction2, divAnimation2, list20, expressionG, expressionN, expressionO, listY, divAspect2, background, divBorderZ, expression16, expression17, expressionB, expression18, expression20, listK, list22, extensions, divFocusP, listW, height, list23, list25, id2, divCollectionItemBuilder2, expression21, list26, expression23, divLayoutProviderT, separator3, expression24, list28, divEdgeInsetsD, expression25, (i11 & 8) != 0 ? divContainer.r() : divEdgeInsets2, (i11 & 16) != 0 ? divContainer.K : list12, (i11 & 32) != 0 ? divContainer.L : list13, (i11 & 64) != 0 ? divContainer.f() : expression13, (i11 & 128) != 0 ? divContainer.e() : expression14, (i11 & 256) != 0 ? divContainer.s() : list14, (i11 & 512) != 0 ? divContainer.P : separator2, (i11 & 1024) != 0 ? divContainer.h() : list15, (i11 & 2048) != 0 ? divContainer.l() : divTransform, (i11 & 4096) != 0 ? divContainer.j() : divChangeTransition, (i11 & 8192) != 0 ? divContainer.x() : divAppearanceTransition, (i11 & 16384) != 0 ? divContainer.i() : divAppearanceTransition2, (i11 & 32768) != 0 ? divContainer.m() : list16, (i11 & 65536) != 0 ? divContainer.u() : list17, (i11 & 131072) != 0 ? divContainer.c() : list18, (i11 & 262144) != 0 ? divContainer.getVisibility() : expression15, (i11 & 524288) != 0 ? divContainer.v() : divVisibilityAction, (i11 & 1048576) != 0 ? divContainer.a() : list19, (i11 & 2097152) != 0 ? divContainer.getWidth() : divSize2);
    }

    public final DivContainer A(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, DivAspect divAspect, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Boolean> expression5, Expression<Long> expression6, Expression<DivContentAlignmentHorizontal> expression7, Expression<DivContentAlignmentVertical> expression8, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression<Long> expression9, List<? extends Div> list10, Expression<LayoutMode> expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression<Long> expression11, List<DivAction> list11, DivEdgeInsets divEdgeInsets, Expression<Orientation> expression12, DivEdgeInsets divEdgeInsets2, List<DivAction> list12, List<DivAction> list13, Expression<String> expression13, Expression<Long> expression14, List<DivAction> list14, Separator separator2, List<DivTooltip> list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends DivVariable> list18, Expression<DivVisibility> expression15, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list19, DivSize divSize2) {
        return new DivContainer(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, expression8, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, divCollectionItemBuilder, expression9, list10, expression10, divLayoutProvider, separator, expression11, list11, divEdgeInsets, expression12, divEdgeInsets2, list12, list13, expression13, expression14, list14, separator2, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression15, divVisibilityAction, list19, divSize2);
    }

    public final boolean C(DivContainer divContainer, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean z10;
        boolean z11;
        boolean zA3;
        boolean z12;
        boolean zA4;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zA5;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean zA6;
        boolean z19;
        boolean zA7;
        boolean zA8;
        boolean z20;
        boolean zA9;
        boolean zA10;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean zA11;
        boolean z24;
        boolean zA12;
        boolean zA13;
        boolean zA14;
        boolean zA15;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean zG;
        boolean z28;
        if (divContainer == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divContainer.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divContainer.q() == null;
        }
        if (!zA) {
            return false;
        }
        DivAction divAction = this.f46709b;
        if (divAction != null) {
            zA2 = divAction.a(divContainer.f46709b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divContainer.f46709b == null;
        }
        if (!zA2 || !this.f46711c.a(divContainer.f46711c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f46713d;
        if (list != null) {
            List<DivAction> list2 = divContainer.f46713d;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divContainer.f46713d == null;
        }
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divContainer.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divContainer.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divContainer.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divContainer.y();
            if (listY2 == null) {
                return false;
            }
            if (listY.size() == listY2.size()) {
                Iterator<T> it2 = listY.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivAnimator) next2).a(listY2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divContainer.y() == null;
        }
        if (!z11) {
            return false;
        }
        DivAspect divAspect = this.f46719i;
        if (divAspect != null) {
            zA3 = divAspect.a(divContainer.f46719i, expressionResolver, expressionResolver2);
        } else {
            zA3 = divContainer.f46719i == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divContainer.getBackground();
            if (background2 == null) {
                return false;
            }
            if (background.size() == background2.size()) {
                Iterator<T> it3 = background.iterator();
                int i14 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            nj.s.u();
                        }
                        if (((DivBackground) next3).a(background2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                }
            }
        } else {
            z12 = divContainer.getBackground() == null;
        }
        if (!z12) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA4 = divBorderZ.a(divContainer.z(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divContainer.z() == null;
        }
        if (!zA4 || this.f46722l.evaluate(expressionResolver).booleanValue() != divContainer.f46722l.evaluate(expressionResolver2).booleanValue() || this.f46723m.evaluate(expressionResolver).booleanValue() != divContainer.f46723m.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divContainer.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f46725o.evaluate(expressionResolver) != divContainer.f46725o.evaluate(expressionResolver2) || this.f46726p.evaluate(expressionResolver) != divContainer.f46726p.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divContainer.k();
            if (listK2 == null) {
                return false;
            }
            if (listK.size() == listK2.size()) {
                Iterator<T> it4 = listK.iterator();
                int i16 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            nj.s.u();
                        }
                        if (((DivDisappearAction) next4).g(listK2.get(i16), expressionResolver, expressionResolver2)) {
                            i16 = i17;
                        }
                    }
                }
            }
        } else {
            z13 = divContainer.k() == null;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f46728r;
        if (list3 != null) {
            List<DivAction> list4 = divContainer.f46728r;
            if (list4 == null) {
                return false;
            }
            if (list3.size() == list4.size()) {
                Iterator<T> it5 = list3.iterator();
                int i18 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        Object next5 = it5.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next5).a(list4.get(i18), expressionResolver, expressionResolver2)) {
                            i18 = i19;
                        }
                    }
                }
            }
        } else {
            z14 = divContainer.f46728r == null;
        }
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divContainer.getExtensions();
            if (extensions2 == null) {
                return false;
            }
            if (extensions.size() == extensions2.size()) {
                Iterator<T> it6 = extensions.iterator();
                int i20 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            nj.s.u();
                        }
                        if (((DivExtension) next6).a(extensions2.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                }
            }
        } else {
            z15 = divContainer.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA5 = divFocusP.a(divContainer.p(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divContainer.p() == null;
        }
        if (!zA5) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divContainer.w();
            if (listW2 == null) {
                return false;
            }
            if (listW.size() == listW2.size()) {
                Iterator<T> it7 = listW.iterator();
                int i22 = 0;
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            nj.s.u();
                        }
                        if (((DivFunction) next7).a(listW2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divContainer.w() == null;
        }
        if (!z16 || !getHeight().a(divContainer.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f46733w;
        if (list5 != null) {
            List<DivAction> list6 = divContainer.f46733w;
            if (list6 == null) {
                return false;
            }
            if (list5.size() == list6.size()) {
                Iterator<T> it8 = list5.iterator();
                int i24 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next8).a(list6.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                }
            }
        } else {
            z17 = divContainer.f46733w == null;
        }
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f46734x;
        if (list7 != null) {
            List<DivAction> list8 = divContainer.f46734x;
            if (list8 == null) {
                return false;
            }
            if (list7.size() == list8.size()) {
                Iterator<T> it9 = list7.iterator();
                int i26 = 0;
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next9).a(list8.get(i26), expressionResolver, expressionResolver2)) {
                            i26 = i27;
                        }
                    }
                }
            }
        } else {
            z18 = divContainer.f46734x == null;
        }
        if (!z18 || !ck.p.e(getId(), divContainer.getId())) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.f46736z;
        if (divCollectionItemBuilder != null) {
            zA6 = divCollectionItemBuilder.a(divContainer.f46736z, expressionResolver, expressionResolver2);
        } else {
            zA6 = divContainer.f46736z == null;
        }
        if (!zA6 || this.A.evaluate(expressionResolver).longValue() != divContainer.A.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<Div> list9 = this.B;
        if (list9 != null) {
            List<Div> list10 = divContainer.B;
            if (list10 == null) {
                return false;
            }
            if (list9.size() == list10.size()) {
                Iterator<T> it10 = list9.iterator();
                int i28 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            nj.s.u();
                        }
                        if (((Div) next10).a(list10.get(i28), expressionResolver, expressionResolver2)) {
                            i28 = i29;
                        }
                    }
                }
            }
        } else {
            z19 = divContainer.B == null;
        }
        if (!z19 || this.C.evaluate(expressionResolver) != divContainer.C.evaluate(expressionResolver2)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA7 = divLayoutProviderT.a(divContainer.t(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divContainer.t() == null;
        }
        if (!zA7) {
            return false;
        }
        Separator separator = this.E;
        if (separator != null) {
            zA8 = separator.a(divContainer.E, expressionResolver, expressionResolver2);
        } else {
            zA8 = divContainer.E == null;
        }
        if (!zA8 || this.F.evaluate(expressionResolver).longValue() != divContainer.F.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> list11 = this.G;
        if (list11 != null) {
            List<DivAction> list12 = divContainer.G;
            if (list12 == null) {
                return false;
            }
            if (list11.size() == list12.size()) {
                Iterator<T> it11 = list11.iterator();
                int i30 = 0;
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next11).a(list12.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                }
            }
        } else {
            z20 = divContainer.G == null;
        }
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA9 = divEdgeInsetsD.a(divContainer.d(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divContainer.d() == null;
        }
        if (!zA9 || this.I.evaluate(expressionResolver) != divContainer.I.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA10 = divEdgeInsetsR.a(divContainer.r(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divContainer.r() == null;
        }
        if (!zA10) {
            return false;
        }
        List<DivAction> list13 = this.K;
        if (list13 != null) {
            List<DivAction> list14 = divContainer.K;
            if (list14 == null) {
                return false;
            }
            if (list13.size() == list14.size()) {
                Iterator<T> it12 = list13.iterator();
                int i32 = 0;
                while (true) {
                    if (it12.hasNext()) {
                        Object next12 = it12.next();
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next12).a(list14.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                }
            }
        } else {
            z21 = divContainer.K == null;
        }
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.L;
        if (list15 != null) {
            List<DivAction> list16 = divContainer.L;
            if (list16 == null) {
                return false;
            }
            if (list15.size() == list16.size()) {
                Iterator<T> it13 = list15.iterator();
                int i34 = 0;
                while (true) {
                    if (it13.hasNext()) {
                        Object next13 = it13.next();
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next13).a(list16.get(i34), expressionResolver, expressionResolver2)) {
                            i34 = i35;
                        }
                    }
                }
            }
        } else {
            z22 = divContainer.L == null;
        }
        if (!z22) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divContainer.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divContainer.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divContainer.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it14 = listS.iterator();
                int i36 = 0;
                while (true) {
                    if (it14.hasNext()) {
                        Object next14 = it14.next();
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next14).a(listS2.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                }
            }
        } else {
            z23 = divContainer.s() == null;
        }
        if (!z23) {
            return false;
        }
        Separator separator2 = this.P;
        if (separator2 != null) {
            zA11 = separator2.a(divContainer.P, expressionResolver, expressionResolver2);
        } else {
            zA11 = divContainer.P == null;
        }
        if (!zA11) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divContainer.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it15 = listH.iterator();
                int i38 = 0;
                while (true) {
                    if (it15.hasNext()) {
                        Object next15 = it15.next();
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next15).a(listH2.get(i38), expressionResolver, expressionResolver2)) {
                            i38 = i39;
                        }
                    }
                }
            }
        } else {
            z24 = divContainer.h() == null;
        }
        if (!z24) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA12 = divTransformL.a(divContainer.l(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divContainer.l() == null;
        }
        if (!zA12) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA13 = divChangeTransitionJ.a(divContainer.j(), expressionResolver, expressionResolver2);
        } else {
            zA13 = divContainer.j() == null;
        }
        if (!zA13) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA14 = divAppearanceTransitionX.a(divContainer.x(), expressionResolver, expressionResolver2);
        } else {
            zA14 = divContainer.x() == null;
        }
        if (!zA14) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA15 = divAppearanceTransitionI.a(divContainer.i(), expressionResolver, expressionResolver2);
        } else {
            zA15 = divContainer.i() == null;
        }
        if (!zA15) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divContainer.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it16 = listM.iterator();
                int i40 = 0;
                while (true) {
                    if (it16.hasNext()) {
                        Object next16 = it16.next();
                        int i41 = i40 + 1;
                        if (i40 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next16) == listM2.get(i40)) {
                            i40 = i41;
                        }
                    }
                }
            }
        } else {
            z25 = divContainer.m() == null;
        }
        if (!z25) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divContainer.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it17 = listU.iterator();
                int i42 = 0;
                while (true) {
                    if (it17.hasNext()) {
                        Object next17 = it17.next();
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next17).a(listU2.get(i42), expressionResolver, expressionResolver2)) {
                            i42 = i43;
                        }
                    }
                }
            }
        } else {
            z26 = divContainer.u() == null;
        }
        if (!z26) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divContainer.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it18 = listC.iterator();
                int i44 = 0;
                while (true) {
                    if (it18.hasNext()) {
                        Object next18 = it18.next();
                        int i45 = i44 + 1;
                        if (i44 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next18).a(listC2.get(i44), expressionResolver, expressionResolver2)) {
                            i44 = i45;
                        }
                    }
                }
            }
        } else {
            z27 = divContainer.c() == null;
        }
        if (!z27 || getVisibility().evaluate(expressionResolver) != divContainer.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divContainer.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divContainer.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divContainer.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it19 = listA.iterator();
                int i46 = 0;
                while (true) {
                    if (it19.hasNext()) {
                        Object next19 = it19.next();
                        int i47 = i46 + 1;
                        if (i46 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next19).g(listA2.get(i46), expressionResolver, expressionResolver2)) {
                            i46 = i47;
                        }
                    }
                }
            }
        } else {
            z28 = divContainer.a() == null;
        }
        return z28 && getWidth().a(divContainer.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivContainer.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivContainer a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().m2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f46693f0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f46694g0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f46695h0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f46696i0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f46697j0 = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        f46698k0 = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        f46699l0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f46700m0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46701n0 = Expression.Companion.constant$default(companion, LayoutMode.NO_WRAP, null, 2, null);
        f46702o0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46703p0 = Expression.Companion.constant$default(companion, Orientation.VERTICAL, null, 2, null);
        f46704q0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f46705r0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        f46706s0 = new bk.p<ParsingEnvironment, JSONObject, DivContainer>() { // from class: com.yandex.div2.DivContainer$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivContainer mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivContainer.f46692e0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.f46708a0;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f46724n;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.X;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.H;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.N;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.M;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f46715e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f46720j;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f46729s;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f46732v;
    }

    @Override // oe.e2
    public String getId() {
        return this.f46735y;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.Y;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.f46710b0;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.Q;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46714d0;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.B;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.f46714d0 = Integer.valueOf(i10);
        return i10;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.U;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.S;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f46727q;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.R;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.V;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f46716f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f46717g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f46730t;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        Integer num = this.f46712c0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivContainer.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        DivAction divAction = this.f46709b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f46711c.hash();
        List<DivAction> list = this.f46713d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash19 + iHash;
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = i10 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionN = n();
        int iHashCode3 = iHashCode2 + (expressionN != null ? expressionN.hashCode() : 0) + o().hashCode();
        List<DivAnimator> listY = y();
        if (listY != null) {
            Iterator<T> it2 = listY.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAnimator) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHashCode3 + iHash2;
        DivAspect divAspect = this.f46719i;
        int iHash20 = i11 + (divAspect != null ? divAspect.hash() : 0);
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it3 = background.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivBackground) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHash20 + iHash3;
        DivBorder divBorderZ = z();
        int iHash21 = i12 + (divBorderZ != null ? divBorderZ.hash() : 0) + this.f46722l.hashCode() + this.f46723m.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash21 + (expressionB != null ? expressionB.hashCode() : 0) + this.f46725o.hashCode() + this.f46726p.hashCode();
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it4 = listK.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivDisappearAction) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = iHashCode4 + iHash4;
        List<DivAction> list2 = this.f46728r;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = i13 + iHash5;
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it6 = extensions.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivExtension) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i15 = i14 + iHash6;
        DivFocus divFocusP = p();
        int iHash22 = i15 + (divFocusP != null ? divFocusP.hash() : 0);
        List<DivFunction> listW = w();
        if (listW != null) {
            Iterator<T> it7 = listW.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFunction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHash23 = iHash22 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.f46733w;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash23 + iHash8;
        List<DivAction> list4 = this.f46734x;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = i16 + iHash9;
        String id2 = getId();
        int iHashCode5 = i17 + (id2 != null ? id2.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.f46736z;
        int iHash24 = iHashCode5 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.A.hashCode() + this.C.hashCode();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash25 = iHash24 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        Separator separator = this.E;
        int iHash26 = iHash25 + (separator != null ? separator.hash() : 0) + this.F.hashCode();
        List<DivAction> list5 = this.G;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash26 + iHash10;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash27 = i18 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.I.hashCode();
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash28 = iHash27 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        List<DivAction> list6 = this.K;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash28 + iHash11;
        List<DivAction> list7 = this.L;
        if (list7 != null) {
            Iterator<T> it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivAction) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = i19 + iHash12;
        Expression<String> expressionF = f();
        int iHashCode6 = i20 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0);
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it13 = listS.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivAction) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = iHashCode7 + iHash13;
        Separator separator2 = this.P;
        int iHash29 = i21 + (separator2 != null ? separator2.hash() : 0);
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it14 = listH.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((DivTooltip) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = iHash29 + iHash14;
        DivTransform divTransformL = l();
        int iHash30 = i22 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash31 = iHash30 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash32 = iHash31 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash33 = iHash32 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode8 = iHash33 + (listM != null ? listM.hashCode() : 0);
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it15 = listU.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int i23 = iHashCode8 + iHash15;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it16 = listC.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((DivVariable) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int iHashCode9 = i23 + iHash16 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash34 = iHashCode9 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash35 = iHash34 + iHash17 + getWidth().hash();
        this.f46712c0 = Integer.valueOf(iHash35);
        return iHash35;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f46707a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.J;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.O;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.D;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.W;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.Z;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f46731u;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.T;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f46718h;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f46721k;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivContainer(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, Separator separator, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, Separator separator2, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression15, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, ck.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? null : divAction, (i10 & 4) != 0 ? f46693f0 : divAnimation, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : expression, (i10 & 32) != 0 ? null : expression2, (i10 & 64) != 0 ? f46694g0 : expression3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : divAspect, (i10 & 512) != 0 ? null : list3, (i10 & 1024) != 0 ? null : divBorder, (i10 & 2048) != 0 ? f46695h0 : expression4, (i10 & 4096) != 0 ? f46696i0 : expression5, (i10 & 8192) != 0 ? null : expression6, (i10 & 16384) != 0 ? f46697j0 : expression7, (i10 & 32768) != 0 ? f46698k0 : expression8, (i10 & 65536) != 0 ? null : list4, (i10 & 131072) != 0 ? null : list5, (i10 & 262144) != 0 ? null : list6, (i10 & 524288) != 0 ? null : divFocus, (i10 & 1048576) != 0 ? null : list7, (i10 & 2097152) != 0 ? f46699l0 : divSize, (i10 & 4194304) != 0 ? null : list8, (i10 & 8388608) != 0 ? null : list9, (i10 & 16777216) != 0 ? null : str, (i10 & 33554432) != 0 ? null : divCollectionItemBuilder, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? f46700m0 : expression9, (i10 & 134217728) != 0 ? null : list10, (i10 & 268435456) != 0 ? f46701n0 : expression10, (i10 & 536870912) != 0 ? null : divLayoutProvider, (i10 & 1073741824) != 0 ? null : separator, (i10 & Integer.MIN_VALUE) != 0 ? f46702o0 : expression11, (i11 & 1) != 0 ? null : list11, (i11 & 2) != 0 ? null : divEdgeInsets, (i11 & 4) != 0 ? f46703p0 : expression12, (i11 & 8) != 0 ? null : divEdgeInsets2, (i11 & 16) != 0 ? null : list12, (i11 & 32) != 0 ? null : list13, (i11 & 64) != 0 ? null : expression13, (i11 & 128) != 0 ? null : expression14, (i11 & 256) != 0 ? null : list14, (i11 & 512) != 0 ? null : separator2, (i11 & 1024) != 0 ? null : list15, (i11 & 2048) != 0 ? null : divTransform, (i11 & 4096) != 0 ? null : divChangeTransition, (i11 & 8192) != 0 ? null : divAppearanceTransition, (i11 & 16384) != 0 ? null : divAppearanceTransition2, (i11 & 32768) != 0 ? null : list16, (i11 & 65536) != 0 ? null : list17, (i11 & 131072) != 0 ? null : list18, (i11 & 262144) != 0 ? f46704q0 : expression15, (i11 & 524288) != 0 ? null : divVisibilityAction, (i11 & 1048576) != 0 ? null : list19, (i11 & 2097152) != 0 ? f46705r0 : divSize2);
    }
}
