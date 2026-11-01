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

/* JADX INFO: compiled from: DivGallery.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivGallery implements JSONSerializable, Hashable, oe.e2 {
    public static final a T = new a(null);
    public static final Expression<Double> U;
    public static final Expression<CrossContentAlignment> V;
    public static final Expression<Long> W;
    public static final DivSize.d X;
    public static final Expression<Long> Y;
    public static final Expression<Orientation> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Boolean> f47255a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<ScrollMode> f47256b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<Scrollbar> f47257c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47258d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.c f47259e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivGallery> f47260f0;
    public final Expression<String> A;
    public final Expression<Long> B;
    public final Expression<ScrollMode> C;
    public final Expression<Scrollbar> D;
    public final List<DivAction> E;
    public final List<DivTooltip> F;
    public final DivTransform G;
    public final DivChangeTransition H;
    public final DivAppearanceTransition I;
    public final DivAppearanceTransition J;
    public final List<DivTransitionTrigger> K;
    public final List<DivTrigger> L;
    public final List<DivVariable> M;
    public final Expression<DivVisibility> N;
    public final DivVisibilityAction O;
    public final List<DivVisibilityAction> P;
    public final DivSize Q;
    public Integer R;
    public Integer S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f47261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f47264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f47265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f47266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f47267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f47268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Long> f47269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<CrossContentAlignment> f47270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Long> f47271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Long> f47272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DivDisappearAction> f47273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivExtension> f47274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DivFocus f47275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<DivFunction> f47276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DivSize f47277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f47278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivCollectionItemBuilder f47279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression<Long> f47280t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<Div> f47281u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DivLayoutProvider f47282v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivEdgeInsets f47283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression<Orientation> f47284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DivEdgeInsets f47285y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression<Boolean> f47286z;

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum CrossContentAlignment {
        START("start"),
        CENTER("center"),
        END("end");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<CrossContentAlignment, String> TO_STRING = new bk.l<CrossContentAlignment, String>() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivGallery.CrossContentAlignment crossContentAlignment) {
                return DivGallery.CrossContentAlignment.Converter.b(crossContentAlignment);
            }
        };
        public static final bk.l<String, CrossContentAlignment> FROM_STRING = new bk.l<String, CrossContentAlignment>() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivGallery.CrossContentAlignment invoke(String str) {
                return DivGallery.CrossContentAlignment.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final CrossContentAlignment a(String str) {
                CrossContentAlignment crossContentAlignment = CrossContentAlignment.START;
                if (ck.p.e(str, crossContentAlignment.value)) {
                    return crossContentAlignment;
                }
                CrossContentAlignment crossContentAlignment2 = CrossContentAlignment.CENTER;
                if (ck.p.e(str, crossContentAlignment2.value)) {
                    return crossContentAlignment2;
                }
                CrossContentAlignment crossContentAlignment3 = CrossContentAlignment.END;
                if (ck.p.e(str, crossContentAlignment3.value)) {
                    return crossContentAlignment3;
                }
                return null;
            }

            public final String b(CrossContentAlignment crossContentAlignment) {
                return crossContentAlignment.value;
            }
        }

        CrossContentAlignment(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Orientation, String> TO_STRING = new bk.l<Orientation, String>() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivGallery.Orientation orientation) {
                return DivGallery.Orientation.Converter.b(orientation);
            }
        };
        public static final bk.l<String, Orientation> FROM_STRING = new bk.l<String, Orientation>() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivGallery.Orientation invoke(String str) {
                return DivGallery.Orientation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Orientation a(String str) {
                Orientation orientation = Orientation.HORIZONTAL;
                if (ck.p.e(str, orientation.value)) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.VERTICAL;
                if (ck.p.e(str, orientation2.value)) {
                    return orientation2;
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

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT("default");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<ScrollMode, String> TO_STRING = new bk.l<ScrollMode, String>() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivGallery.ScrollMode scrollMode) {
                return DivGallery.ScrollMode.Converter.b(scrollMode);
            }
        };
        public static final bk.l<String, ScrollMode> FROM_STRING = new bk.l<String, ScrollMode>() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivGallery.ScrollMode invoke(String str) {
                return DivGallery.ScrollMode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final ScrollMode a(String str) {
                ScrollMode scrollMode = ScrollMode.PAGING;
                if (ck.p.e(str, scrollMode.value)) {
                    return scrollMode;
                }
                ScrollMode scrollMode2 = ScrollMode.DEFAULT;
                if (ck.p.e(str, scrollMode2.value)) {
                    return scrollMode2;
                }
                return null;
            }

            public final String b(ScrollMode scrollMode) {
                return scrollMode.value;
            }
        }

        ScrollMode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivGallery.kt */
    public enum Scrollbar {
        NONE("none"),
        AUTO("auto");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Scrollbar, String> TO_STRING = new bk.l<Scrollbar, String>() { // from class: com.yandex.div2.DivGallery$Scrollbar$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivGallery.Scrollbar scrollbar) {
                return DivGallery.Scrollbar.Converter.b(scrollbar);
            }
        };
        public static final bk.l<String, Scrollbar> FROM_STRING = new bk.l<String, Scrollbar>() { // from class: com.yandex.div2.DivGallery$Scrollbar$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivGallery.Scrollbar invoke(String str) {
                return DivGallery.Scrollbar.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivGallery.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Scrollbar a(String str) {
                Scrollbar scrollbar = Scrollbar.NONE;
                if (ck.p.e(str, scrollbar.value)) {
                    return scrollbar;
                }
                Scrollbar scrollbar2 = Scrollbar.AUTO;
                if (ck.p.e(str, scrollbar2.value)) {
                    return scrollbar2;
                }
                return null;
            }

            public final String b(Scrollbar scrollbar) {
                return scrollbar.value;
            }
        }

        Scrollbar(String str) {
            this.value = str;
        }
    }

    public DivGallery() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivGallery(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, Expression<Long> expression5, Expression<CrossContentAlignment> expression6, Expression<Long> expression7, Expression<Long> expression8, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression<Long> expression9, List<? extends Div> list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Orientation> expression10, DivEdgeInsets divEdgeInsets2, Expression<Boolean> expression11, Expression<String> expression12, Expression<Long> expression13, Expression<ScrollMode> expression14, Expression<Scrollbar> expression15, List<DivAction> list7, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression16, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        this.f47261a = divAccessibility;
        this.f47262b = expression;
        this.f47263c = expression2;
        this.f47264d = expression3;
        this.f47265e = list;
        this.f47266f = list2;
        this.f47267g = divBorder;
        this.f47268h = expression4;
        this.f47269i = expression5;
        this.f47270j = expression6;
        this.f47271k = expression7;
        this.f47272l = expression8;
        this.f47273m = list3;
        this.f47274n = list4;
        this.f47275o = divFocus;
        this.f47276p = list5;
        this.f47277q = divSize;
        this.f47278r = str;
        this.f47279s = divCollectionItemBuilder;
        this.f47280t = expression9;
        this.f47281u = list6;
        this.f47282v = divLayoutProvider;
        this.f47283w = divEdgeInsets;
        this.f47284x = expression10;
        this.f47285y = divEdgeInsets2;
        this.f47286z = expression11;
        this.A = expression12;
        this.B = expression13;
        this.C = expression14;
        this.D = expression15;
        this.E = list7;
        this.F = list8;
        this.G = divTransform;
        this.H = divChangeTransition;
        this.I = divAppearanceTransition;
        this.J = divAppearanceTransition2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression16;
        this.O = divVisibilityAction;
        this.P = list12;
        this.Q = divSize2;
    }

    public final boolean C(DivGallery divGallery, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean z10;
        boolean z11;
        boolean zA2;
        boolean z12;
        boolean z13;
        boolean zA3;
        boolean z14;
        boolean zA4;
        boolean z15;
        boolean zA5;
        boolean zA6;
        boolean zA7;
        boolean z16;
        boolean z17;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean zG;
        boolean z21;
        if (divGallery == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divGallery.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divGallery.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divGallery.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divGallery.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divGallery.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divGallery.y();
            if (listY2 == null) {
                return false;
            }
            if (listY.size() == listY2.size()) {
                Iterator<T> it = listY.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAnimator) next).a(listY2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divGallery.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divGallery.getBackground();
            if (background2 == null) {
                return false;
            }
            if (background.size() == background2.size()) {
                Iterator<T> it2 = background.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivBackground) next2).a(background2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divGallery.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divGallery.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divGallery.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expression = this.f47268h;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divGallery.f47268h;
        if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate2 = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divGallery.b();
        if (!ck.p.e(lEvaluate2, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f47270j.evaluate(expressionResolver) != divGallery.f47270j.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<Long> expression3 = this.f47271k;
        Long lEvaluate3 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divGallery.f47271k;
        if (!ck.p.e(lEvaluate3, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || this.f47272l.evaluate(expressionResolver).longValue() != divGallery.f47272l.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divGallery.k();
            if (listK2 == null) {
                return false;
            }
            if (listK.size() == listK2.size()) {
                Iterator<T> it3 = listK.iterator();
                int i14 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            nj.s.u();
                        }
                        if (((DivDisappearAction) next3).g(listK2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                }
            }
        } else {
            z12 = divGallery.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divGallery.getExtensions();
            if (extensions2 == null) {
                return false;
            }
            if (extensions.size() == extensions2.size()) {
                Iterator<T> it4 = extensions.iterator();
                int i16 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            nj.s.u();
                        }
                        if (((DivExtension) next4).a(extensions2.get(i16), expressionResolver, expressionResolver2)) {
                            i16 = i17;
                        }
                    }
                }
            }
        } else {
            z13 = divGallery.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divGallery.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divGallery.p() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divGallery.w();
            if (listW2 == null) {
                return false;
            }
            if (listW.size() == listW2.size()) {
                Iterator<T> it5 = listW.iterator();
                int i18 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        Object next5 = it5.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            nj.s.u();
                        }
                        if (((DivFunction) next5).a(listW2.get(i18), expressionResolver, expressionResolver2)) {
                            i18 = i19;
                        }
                    }
                }
            }
        } else {
            z14 = divGallery.w() == null;
        }
        if (!z14 || !getHeight().a(divGallery.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divGallery.getId())) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.f47279s;
        if (divCollectionItemBuilder != null) {
            zA4 = divCollectionItemBuilder.a(divGallery.f47279s, expressionResolver, expressionResolver2);
        } else {
            zA4 = divGallery.f47279s == null;
        }
        if (!zA4 || this.f47280t.evaluate(expressionResolver).longValue() != divGallery.f47280t.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<Div> list = this.f47281u;
        if (list != null) {
            List<Div> list2 = divGallery.f47281u;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it6 = list.iterator();
                int i20 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            nj.s.u();
                        }
                        if (((Div) next6).a(list2.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                }
            }
        } else {
            z15 = divGallery.f47281u == null;
        }
        if (!z15) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA5 = divLayoutProviderT.a(divGallery.t(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divGallery.t() == null;
        }
        if (!zA5) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA6 = divEdgeInsetsD.a(divGallery.d(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divGallery.d() == null;
        }
        if (!zA6 || this.f47284x.evaluate(expressionResolver) != divGallery.f47284x.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA7 = divEdgeInsetsR.a(divGallery.r(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divGallery.r() == null;
        }
        if (!zA7 || this.f47286z.evaluate(expressionResolver).booleanValue() != divGallery.f47286z.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divGallery.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate4 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divGallery.e();
        if (!ck.p.e(lEvaluate4, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.C.evaluate(expressionResolver) != divGallery.C.evaluate(expressionResolver2) || this.D.evaluate(expressionResolver) != divGallery.D.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divGallery.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it7 = listS.iterator();
                int i22 = 0;
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next7).a(listS2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divGallery.s() == null;
        }
        if (!z16) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divGallery.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it8 = listH.iterator();
                int i24 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next8).a(listH2.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                }
            }
        } else {
            z17 = divGallery.h() == null;
        }
        if (!z17) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA8 = divTransformL.a(divGallery.l(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divGallery.l() == null;
        }
        if (!zA8) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA9 = divChangeTransitionJ.a(divGallery.j(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divGallery.j() == null;
        }
        if (!zA9) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA10 = divAppearanceTransitionX.a(divGallery.x(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divGallery.x() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA11 = divAppearanceTransitionI.a(divGallery.i(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divGallery.i() == null;
        }
        if (!zA11) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divGallery.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it9 = listM.iterator();
                int i26 = 0;
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next9) == listM2.get(i26)) {
                            i26 = i27;
                        }
                    }
                }
            }
        } else {
            z18 = divGallery.m() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divGallery.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it10 = listU.iterator();
                int i28 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next10).a(listU2.get(i28), expressionResolver, expressionResolver2)) {
                            i28 = i29;
                        }
                    }
                }
            }
        } else {
            z19 = divGallery.u() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divGallery.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it11 = listC.iterator();
                int i30 = 0;
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next11).a(listC2.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                }
            }
        } else {
            z20 = divGallery.c() == null;
        }
        if (!z20 || getVisibility().evaluate(expressionResolver) != divGallery.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divGallery.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divGallery.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divGallery.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it12 = listA.iterator();
                int i32 = 0;
                while (true) {
                    if (it12.hasNext()) {
                        Object next12 = it12.next();
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next12).g(listA2.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                }
            }
        } else {
            z21 = divGallery.a() == null;
        }
        return z21 && getWidth().a(divGallery.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivGallery.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivGallery a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, CrossContentAlignment.START, null, 2, null);
        W = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        f47255a0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47256b0 = Expression.Companion.constant$default(companion, ScrollMode.DEFAULT, null, 2, null);
        f47257c0 = Expression.Companion.constant$default(companion, Scrollbar.NONE, null, 2, null);
        f47258d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47259e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f47260f0 = new bk.p<ParsingEnvironment, JSONObject, DivGallery>() { // from class: com.yandex.div2.DivGallery$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGallery mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivGallery.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivGallery B(DivGallery divGallery, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divGallery.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divGallery.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divGallery.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divGallery.o() : expression3;
        List listY = (i10 & 16) != 0 ? divGallery.y() : list;
        List background = (i10 & 32) != 0 ? divGallery.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 64) != 0 ? divGallery.z() : divBorder;
        Expression expression17 = (i10 & 128) != 0 ? divGallery.f47268h : expression4;
        Expression expressionB = (i10 & 256) != 0 ? divGallery.b() : expression5;
        Expression expression18 = (i10 & 512) != 0 ? divGallery.f47270j : expression6;
        Expression expression19 = (i10 & 1024) != 0 ? divGallery.f47271k : expression7;
        Expression expression20 = (i10 & 2048) != 0 ? divGallery.f47272l : expression8;
        List listK = (i10 & 4096) != 0 ? divGallery.k() : list3;
        List extensions = (i10 & 8192) != 0 ? divGallery.getExtensions() : list4;
        DivFocus divFocusP = (i10 & 16384) != 0 ? divGallery.p() : divFocus;
        List listW = (i10 & 32768) != 0 ? divGallery.w() : list5;
        DivSize height = (i10 & 65536) != 0 ? divGallery.getHeight() : divSize;
        String id2 = (i10 & 131072) != 0 ? divGallery.getId() : str;
        DivFocus divFocus2 = divFocusP;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i10 & 262144) != 0 ? divGallery.f47279s : divCollectionItemBuilder;
        Expression expression21 = (i10 & 524288) != 0 ? divGallery.f47280t : expression9;
        List list13 = (i10 & 1048576) != 0 ? divGallery.f47281u : list6;
        DivLayoutProvider divLayoutProviderT = (i10 & 2097152) != 0 ? divGallery.t() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 4194304) != 0 ? divGallery.d() : divEdgeInsets;
        List list14 = list13;
        Expression expression22 = (i10 & 8388608) != 0 ? divGallery.f47284x : expression10;
        return divGallery.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, background, divBorderZ, expression17, expressionB, expression18, expression19, expression20, listK, extensions, divFocus2, listW, height, id2, divCollectionItemBuilder2, expression21, list14, divLayoutProviderT, divEdgeInsetsD, expression22, (i10 & 16777216) != 0 ? divGallery.r() : divEdgeInsets2, (i10 & 33554432) != 0 ? divGallery.f47286z : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divGallery.f() : expression12, (i10 & 134217728) != 0 ? divGallery.e() : expression13, (i10 & 268435456) != 0 ? divGallery.C : expression14, (i10 & 536870912) != 0 ? divGallery.D : expression15, (i10 & 1073741824) != 0 ? divGallery.s() : list7, (i10 & Integer.MIN_VALUE) != 0 ? divGallery.h() : list8, (i11 & 1) != 0 ? divGallery.l() : divTransform, (i11 & 2) != 0 ? divGallery.j() : divChangeTransition, (i11 & 4) != 0 ? divGallery.x() : divAppearanceTransition, (i11 & 8) != 0 ? divGallery.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divGallery.m() : list9, (i11 & 32) != 0 ? divGallery.u() : list10, (i11 & 64) != 0 ? divGallery.c() : list11, (i11 & 128) != 0 ? divGallery.getVisibility() : expression16, (i11 & 256) != 0 ? divGallery.v() : divVisibilityAction, (i11 & 512) != 0 ? divGallery.a() : list12, (i11 & 1024) != 0 ? divGallery.getWidth() : divSize2);
    }

    public final DivGallery A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, Expression<Long> expression5, Expression<CrossContentAlignment> expression6, Expression<Long> expression7, Expression<Long> expression8, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression<Long> expression9, List<? extends Div> list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Orientation> expression10, DivEdgeInsets divEdgeInsets2, Expression<Boolean> expression11, Expression<String> expression12, Expression<Long> expression13, Expression<ScrollMode> expression14, Expression<Scrollbar> expression15, List<DivAction> list7, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression16, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        return new DivGallery(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, expression5, expression6, expression7, expression8, list3, list4, divFocus, list5, divSize, str, divCollectionItemBuilder, expression9, list6, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, expression11, expression12, expression13, expression14, expression15, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression16, divVisibilityAction, list12, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f47269i;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f47283w;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.B;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.A;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f47262b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f47266f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f47274n;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f47277q;
    }

    @Override // oe.e2
    public String getId() {
        return this.f47278r;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.N;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.Q;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.F;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.f47281u;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.S = Integer.valueOf(i10);
        return i10;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.J;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.H;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f47273m;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.G;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.K;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f47263c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f47264d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f47275o;
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivGallery.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash10 = 0;
        int iHash11 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash11 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionN = n();
        int iHashCode3 = iHashCode2 + (expressionN != null ? expressionN.hashCode() : 0) + o().hashCode();
        List<DivAnimator> listY = y();
        if (listY != null) {
            Iterator<T> it = listY.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAnimator) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode3 + iHash;
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it2 = background.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivBackground) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = i10 + iHash2;
        DivBorder divBorderZ = z();
        int iHash12 = i11 + (divBorderZ != null ? divBorderZ.hash() : 0);
        Expression<Long> expression = this.f47268h;
        int iHashCode4 = iHash12 + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expressionB = b();
        int iHashCode5 = iHashCode4 + (expressionB != null ? expressionB.hashCode() : 0) + this.f47270j.hashCode();
        Expression<Long> expression2 = this.f47271k;
        int iHashCode6 = iHashCode5 + (expression2 != null ? expression2.hashCode() : 0) + this.f47272l.hashCode();
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it3 = listK.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivDisappearAction) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHashCode6 + iHash3;
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it4 = extensions.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivExtension) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = i12 + iHash4;
        DivFocus divFocusP = p();
        int iHash13 = i13 + (divFocusP != null ? divFocusP.hash() : 0);
        List<DivFunction> listW = w();
        if (listW != null) {
            Iterator<T> it5 = listW.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivFunction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int iHash14 = iHash13 + iHash5 + getHeight().hash();
        String id2 = getId();
        int iHashCode7 = iHash14 + (id2 != null ? id2.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.f47279s;
        int iHash15 = iHashCode7 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.f47280t.hashCode();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash16 = iHash15 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash17 = iHash16 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f47284x.hashCode();
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash18 = iHash17 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0) + this.f47286z.hashCode();
        Expression<String> expressionF = f();
        int iHashCode8 = iHash18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0) + this.C.hashCode() + this.D.hashCode();
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it6 = listS.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivAction) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i14 = iHashCode9 + iHash6;
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it7 = listH.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivTooltip) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = i14 + iHash7;
        DivTransform divTransformL = l();
        int iHash19 = i15 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash20 = iHash19 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash21 = iHash20 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash22 = iHash21 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode10 = iHash22 + (listM != null ? listM.hashCode() : 0);
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it8 = listU.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode10 + iHash8;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it9 = listC.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivVariable) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int iHashCode11 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash23 = iHashCode11 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash24);
        return iHash24;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f47261a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f47285y;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.E;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f47282v;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.L;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.O;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f47276p;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.I;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f47265e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f47267g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivGallery(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression16, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, ck.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? null : expression, (i10 & 4) != 0 ? null : expression2, (i10 & 8) != 0 ? U : expression3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? null : divBorder, (i10 & 128) != 0 ? null : expression4, (i10 & 256) != 0 ? null : expression5, (i10 & 512) != 0 ? V : expression6, (i10 & 1024) != 0 ? null : expression7, (i10 & 2048) != 0 ? W : expression8, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : list4, (i10 & 16384) != 0 ? null : divFocus, (i10 & 32768) != 0 ? null : list5, (i10 & 65536) != 0 ? X : divSize, (i10 & 131072) != 0 ? null : str, (i10 & 262144) != 0 ? null : divCollectionItemBuilder, (i10 & 524288) != 0 ? Y : expression9, (i10 & 1048576) != 0 ? null : list6, (i10 & 2097152) != 0 ? null : divLayoutProvider, (i10 & 4194304) != 0 ? null : divEdgeInsets, (i10 & 8388608) != 0 ? Z : expression10, (i10 & 16777216) != 0 ? null : divEdgeInsets2, (i10 & 33554432) != 0 ? f47255a0 : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : expression12, (i10 & 134217728) != 0 ? null : expression13, (i10 & 268435456) != 0 ? f47256b0 : expression14, (i10 & 536870912) != 0 ? f47257c0 : expression15, (i10 & 1073741824) != 0 ? null : list7, (i10 & Integer.MIN_VALUE) != 0 ? null : list8, (i11 & 1) != 0 ? null : divTransform, (i11 & 2) != 0 ? null : divChangeTransition, (i11 & 4) != 0 ? null : divAppearanceTransition, (i11 & 8) != 0 ? null : divAppearanceTransition2, (i11 & 16) != 0 ? null : list9, (i11 & 32) != 0 ? null : list10, (i11 & 64) != 0 ? null : list11, (i11 & 128) != 0 ? f47258d0 : expression16, (i11 & 256) != 0 ? null : divVisibilityAction, (i11 & 512) != 0 ? null : list12, (i11 & 1024) != 0 ? f47259e0 : divSize2);
    }
}
