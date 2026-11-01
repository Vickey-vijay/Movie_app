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

/* JADX INFO: compiled from: DivIndicator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivIndicator implements JSONSerializable, Hashable, oe.e2 {
    public static final a T = new a(null);
    public static final Expression<Integer> U;
    public static final Expression<Double> V;
    public static final Expression<Double> W;
    public static final Expression<Animation> X;
    public static final DivSize.d Y;
    public static final Expression<Integer> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Double> f47694a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final DivShape.c f47695b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivFixedSize f47696c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47697d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.c f47698e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivIndicator> f47699f0;
    public final String A;
    public final Expression<String> B;
    public final Expression<Long> C;
    public final List<DivAction> D;
    public final DivShape E;
    public final DivFixedSize F;
    public final List<DivTooltip> G;
    public final DivTransform H;
    public final DivChangeTransition I;
    public final DivAppearanceTransition J;
    public final DivAppearanceTransition K;
    public final List<DivTransitionTrigger> L;
    public final List<DivTrigger> M;
    public final List<DivVariable> N;
    public final Expression<DivVisibility> O;
    public final DivVisibilityAction P;
    public final List<DivVisibilityAction> Q;
    public final DivSize R;
    public Integer S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f47700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Integer> f47701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Double> f47702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DivRoundedRectangleShape f47703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f47706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Animation> f47707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivAnimator> f47708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivBackground> f47709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivBorder f47710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Long> f47711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DivDisappearAction> f47712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivExtension> f47713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DivFocus f47714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<DivFunction> f47715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DivSize f47716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f47717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression<Integer> f47718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DivRoundedRectangleShape f47719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DivRoundedRectangleShape f47720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DivIndicatorItemPlacement f47721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivLayoutProvider f47722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DivEdgeInsets f47723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression<Double> f47724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivEdgeInsets f47725z;

    /* JADX INFO: compiled from: DivIndicator.kt */
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Animation, String> TO_STRING = new bk.l<Animation, String>() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivIndicator.Animation animation) {
                return DivIndicator.Animation.Converter.b(animation);
            }
        };
        public static final bk.l<String, Animation> FROM_STRING = new bk.l<String, Animation>() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivIndicator.Animation invoke(String str) {
                return DivIndicator.Animation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivIndicator.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Animation a(String str) {
                Animation animation = Animation.SCALE;
                if (ck.p.e(str, animation.value)) {
                    return animation;
                }
                Animation animation2 = Animation.WORM;
                if (ck.p.e(str, animation2.value)) {
                    return animation2;
                }
                Animation animation3 = Animation.SLIDER;
                if (ck.p.e(str, animation3.value)) {
                    return animation3;
                }
                return null;
            }

            public final String b(Animation animation) {
                return animation.value;
            }
        }

        Animation(String str) {
            this.value = str;
        }
    }

    public DivIndicator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivIndicator(DivAccessibility divAccessibility, Expression<Integer> expression, Expression<Double> expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression<DivAlignmentHorizontal> expression3, Expression<DivAlignmentVertical> expression4, Expression<Double> expression5, Expression<Animation> expression6, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression7, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Integer> expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Double> expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression<String> expression10, Expression<Long> expression11, List<DivAction> list6, DivShape divShape, DivFixedSize divFixedSize, List<DivTooltip> list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list8, List<DivTrigger> list9, List<? extends DivVariable> list10, Expression<DivVisibility> expression12, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list11, DivSize divSize2) {
        this.f47700a = divAccessibility;
        this.f47701b = expression;
        this.f47702c = expression2;
        this.f47703d = divRoundedRectangleShape;
        this.f47704e = expression3;
        this.f47705f = expression4;
        this.f47706g = expression5;
        this.f47707h = expression6;
        this.f47708i = list;
        this.f47709j = list2;
        this.f47710k = divBorder;
        this.f47711l = expression7;
        this.f47712m = list3;
        this.f47713n = list4;
        this.f47714o = divFocus;
        this.f47715p = list5;
        this.f47716q = divSize;
        this.f47717r = str;
        this.f47718s = expression8;
        this.f47719t = divRoundedRectangleShape2;
        this.f47720u = divRoundedRectangleShape3;
        this.f47721v = divIndicatorItemPlacement;
        this.f47722w = divLayoutProvider;
        this.f47723x = divEdgeInsets;
        this.f47724y = expression9;
        this.f47725z = divEdgeInsets2;
        this.A = str2;
        this.B = expression10;
        this.C = expression11;
        this.D = list6;
        this.E = divShape;
        this.F = divFixedSize;
        this.G = list7;
        this.H = divTransform;
        this.I = divChangeTransition;
        this.J = divAppearanceTransition;
        this.K = divAppearanceTransition2;
        this.L = list8;
        this.M = list9;
        this.N = list10;
        this.O = expression12;
        this.P = divVisibilityAction;
        this.Q = list11;
        this.R = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivIndicator B(DivIndicator divIndicator, DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divIndicator.q() : divAccessibility;
        Expression expression13 = (i10 & 2) != 0 ? divIndicator.f47701b : expression;
        Expression expression14 = (i10 & 4) != 0 ? divIndicator.f47702c : expression2;
        DivRoundedRectangleShape divRoundedRectangleShape4 = (i10 & 8) != 0 ? divIndicator.f47703d : divRoundedRectangleShape;
        Expression expressionG = (i10 & 16) != 0 ? divIndicator.g() : expression3;
        Expression expressionN = (i10 & 32) != 0 ? divIndicator.n() : expression4;
        Expression expressionO = (i10 & 64) != 0 ? divIndicator.o() : expression5;
        Expression expression15 = (i10 & 128) != 0 ? divIndicator.f47707h : expression6;
        List listY = (i10 & 256) != 0 ? divIndicator.y() : list;
        List background = (i10 & 512) != 0 ? divIndicator.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 1024) != 0 ? divIndicator.z() : divBorder;
        Expression expressionB = (i10 & 2048) != 0 ? divIndicator.b() : expression7;
        List listK = (i10 & 4096) != 0 ? divIndicator.k() : list3;
        List extensions = (i10 & 8192) != 0 ? divIndicator.getExtensions() : list4;
        DivFocus divFocusP = (i10 & 16384) != 0 ? divIndicator.p() : divFocus;
        List listW = (i10 & 32768) != 0 ? divIndicator.w() : list5;
        DivSize height = (i10 & 65536) != 0 ? divIndicator.getHeight() : divSize;
        String id2 = (i10 & 131072) != 0 ? divIndicator.getId() : str;
        DivFocus divFocus2 = divFocusP;
        Expression expression16 = (i10 & 262144) != 0 ? divIndicator.f47718s : expression8;
        DivRoundedRectangleShape divRoundedRectangleShape5 = (i10 & 524288) != 0 ? divIndicator.f47719t : divRoundedRectangleShape2;
        DivRoundedRectangleShape divRoundedRectangleShape6 = (i10 & 1048576) != 0 ? divIndicator.f47720u : divRoundedRectangleShape3;
        DivIndicatorItemPlacement divIndicatorItemPlacement2 = (i10 & 2097152) != 0 ? divIndicator.f47721v : divIndicatorItemPlacement;
        DivLayoutProvider divLayoutProviderT = (i10 & 4194304) != 0 ? divIndicator.t() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 8388608) != 0 ? divIndicator.d() : divEdgeInsets;
        DivIndicatorItemPlacement divIndicatorItemPlacement3 = divIndicatorItemPlacement2;
        Expression expression17 = (i10 & 16777216) != 0 ? divIndicator.f47724y : expression9;
        return divIndicator.A(divAccessibilityQ, expression13, expression14, divRoundedRectangleShape4, expressionG, expressionN, expressionO, expression15, listY, background, divBorderZ, expressionB, listK, extensions, divFocus2, listW, height, id2, expression16, divRoundedRectangleShape5, divRoundedRectangleShape6, divIndicatorItemPlacement3, divLayoutProviderT, divEdgeInsetsD, expression17, (i10 & 33554432) != 0 ? divIndicator.r() : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divIndicator.A : str2, (i10 & 134217728) != 0 ? divIndicator.f() : expression10, (i10 & 268435456) != 0 ? divIndicator.e() : expression11, (i10 & 536870912) != 0 ? divIndicator.s() : list6, (i10 & 1073741824) != 0 ? divIndicator.E : divShape, (i10 & Integer.MIN_VALUE) != 0 ? divIndicator.F : divFixedSize, (i11 & 1) != 0 ? divIndicator.h() : list7, (i11 & 2) != 0 ? divIndicator.l() : divTransform, (i11 & 4) != 0 ? divIndicator.j() : divChangeTransition, (i11 & 8) != 0 ? divIndicator.x() : divAppearanceTransition, (i11 & 16) != 0 ? divIndicator.i() : divAppearanceTransition2, (i11 & 32) != 0 ? divIndicator.m() : list8, (i11 & 64) != 0 ? divIndicator.u() : list9, (i11 & 128) != 0 ? divIndicator.c() : list10, (i11 & 256) != 0 ? divIndicator.getVisibility() : expression12, (i11 & 512) != 0 ? divIndicator.v() : divVisibilityAction, (i11 & 1024) != 0 ? divIndicator.a() : list11, (i11 & 2048) != 0 ? divIndicator.getWidth() : divSize2);
    }

    public final DivIndicator A(DivAccessibility divAccessibility, Expression<Integer> expression, Expression<Double> expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression<DivAlignmentHorizontal> expression3, Expression<DivAlignmentVertical> expression4, Expression<Double> expression5, Expression<Animation> expression6, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression7, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Integer> expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Double> expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression<String> expression10, Expression<Long> expression11, List<DivAction> list6, DivShape divShape, DivFixedSize divFixedSize, List<DivTooltip> list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list8, List<DivTrigger> list9, List<? extends DivVariable> list10, Expression<DivVisibility> expression12, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list11, DivSize divSize2) {
        return new DivIndicator(divAccessibility, expression, expression2, divRoundedRectangleShape, expression3, expression4, expression5, expression6, list, list2, divBorder, expression7, list3, list4, divFocus, list5, divSize, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression9, divEdgeInsets2, str2, expression10, expression11, list6, divShape, divFixedSize, list7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list8, list9, list10, expression12, divVisibilityAction, list11, divSize2);
    }

    public final boolean C(DivIndicator divIndicator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean z10;
        boolean z11;
        boolean zA3;
        boolean z12;
        boolean z13;
        boolean zA4;
        boolean z14;
        boolean zA5;
        boolean zA6;
        boolean zA7;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean z15;
        boolean z16;
        boolean zA11;
        boolean zA12;
        boolean zA13;
        boolean zA14;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zG;
        boolean z20;
        if (divIndicator == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divIndicator.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divIndicator.q() == null;
        }
        if (!zA || this.f47701b.evaluate(expressionResolver).intValue() != divIndicator.f47701b.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        if (!(this.f47702c.evaluate(expressionResolver).doubleValue() == divIndicator.f47702c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape = this.f47703d;
        if (divRoundedRectangleShape != null) {
            zA2 = divRoundedRectangleShape.a(divIndicator.f47703d, expressionResolver, expressionResolver2);
        } else {
            zA2 = divIndicator.f47703d == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divIndicator.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divIndicator.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divIndicator.o().evaluate(expressionResolver2).doubleValue()) || this.f47707h.evaluate(expressionResolver) != divIndicator.f47707h.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divIndicator.y();
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
            z10 = divIndicator.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divIndicator.getBackground();
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
            z11 = divIndicator.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA3 = divBorderZ.a(divIndicator.z(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divIndicator.z() == null;
        }
        if (!zA3) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divIndicator.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divIndicator.k();
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
            z12 = divIndicator.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divIndicator.getExtensions();
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
            z13 = divIndicator.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA4 = divFocusP.a(divIndicator.p(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divIndicator.p() == null;
        }
        if (!zA4) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divIndicator.w();
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
            z14 = divIndicator.w() == null;
        }
        if (!z14 || !getHeight().a(divIndicator.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divIndicator.getId()) || this.f47718s.evaluate(expressionResolver).intValue() != divIndicator.f47718s.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape2 = this.f47719t;
        if (divRoundedRectangleShape2 != null) {
            zA5 = divRoundedRectangleShape2.a(divIndicator.f47719t, expressionResolver, expressionResolver2);
        } else {
            zA5 = divIndicator.f47719t == null;
        }
        if (!zA5) {
            return false;
        }
        DivRoundedRectangleShape divRoundedRectangleShape3 = this.f47720u;
        if (divRoundedRectangleShape3 != null) {
            zA6 = divRoundedRectangleShape3.a(divIndicator.f47720u, expressionResolver, expressionResolver2);
        } else {
            zA6 = divIndicator.f47720u == null;
        }
        if (!zA6) {
            return false;
        }
        DivIndicatorItemPlacement divIndicatorItemPlacement = this.f47721v;
        if (divIndicatorItemPlacement != null) {
            zA7 = divIndicatorItemPlacement.a(divIndicator.f47721v, expressionResolver, expressionResolver2);
        } else {
            zA7 = divIndicator.f47721v == null;
        }
        if (!zA7) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA8 = divLayoutProviderT.a(divIndicator.t(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divIndicator.t() == null;
        }
        if (!zA8) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA9 = divEdgeInsetsD.a(divIndicator.d(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divIndicator.d() == null;
        }
        if (!zA9) {
            return false;
        }
        if (!(this.f47724y.evaluate(expressionResolver).doubleValue() == divIndicator.f47724y.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA10 = divEdgeInsetsR.a(divIndicator.r(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divIndicator.r() == null;
        }
        if (!zA10 || !ck.p.e(this.A, divIndicator.A)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divIndicator.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divIndicator.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divIndicator.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it6 = listS.iterator();
                int i20 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next6).a(listS2.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                }
            }
        } else {
            z15 = divIndicator.s() == null;
        }
        if (!z15 || !this.E.a(divIndicator.E, expressionResolver, expressionResolver2) || !this.F.a(divIndicator.F, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divIndicator.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it7 = listH.iterator();
                int i22 = 0;
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next7).a(listH2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divIndicator.h() == null;
        }
        if (!z16) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA11 = divTransformL.a(divIndicator.l(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divIndicator.l() == null;
        }
        if (!zA11) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA12 = divChangeTransitionJ.a(divIndicator.j(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divIndicator.j() == null;
        }
        if (!zA12) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA13 = divAppearanceTransitionX.a(divIndicator.x(), expressionResolver, expressionResolver2);
        } else {
            zA13 = divIndicator.x() == null;
        }
        if (!zA13) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA14 = divAppearanceTransitionI.a(divIndicator.i(), expressionResolver, expressionResolver2);
        } else {
            zA14 = divIndicator.i() == null;
        }
        if (!zA14) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divIndicator.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it8 = listM.iterator();
                int i24 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next8) == listM2.get(i24)) {
                            i24 = i25;
                        }
                    }
                }
            }
        } else {
            z17 = divIndicator.m() == null;
        }
        if (!z17) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divIndicator.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it9 = listU.iterator();
                int i26 = 0;
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next9).a(listU2.get(i26), expressionResolver, expressionResolver2)) {
                            i26 = i27;
                        }
                    }
                }
            }
        } else {
            z18 = divIndicator.u() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divIndicator.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it10 = listC.iterator();
                int i28 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next10).a(listC2.get(i28), expressionResolver, expressionResolver2)) {
                            i28 = i29;
                        }
                    }
                }
            }
        } else {
            z19 = divIndicator.c() == null;
        }
        if (!z19 || getVisibility().evaluate(expressionResolver) != divIndicator.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divIndicator.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divIndicator.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divIndicator.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it11 = listA.iterator();
                int i30 = 0;
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next11).g(listA2.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                }
            }
        } else {
            z20 = divIndicator.a() == null;
        }
        return z20 && getWidth().a(divIndicator.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivIndicator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivIndicator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().d4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        X = Expression.Companion.constant$default(companion, Animation.SCALE, null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        f47694a0 = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        f47695b0 = new DivShape.c(new DivRoundedRectangleShape(null, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, null));
        f47696c0 = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null == true ? 1 : 0);
        f47697d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47698e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f47699f0 = new bk.p<ParsingEnvironment, JSONObject, DivIndicator>() { // from class: com.yandex.div2.DivIndicator$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivIndicator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivIndicator.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.Q;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f47711l;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.N;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f47723x;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.C;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.B;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f47704e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f47709j;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f47713n;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f47716q;
    }

    @Override // oe.e2
    public String getId() {
        return this.f47717r;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.O;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.R;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.G;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivIndicator.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash10 = 0;
        int iHash11 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0) + this.f47701b.hashCode() + this.f47702c.hashCode();
        DivRoundedRectangleShape divRoundedRectangleShape = this.f47703d;
        int iHash12 = iHash11 + (divRoundedRectangleShape != null ? divRoundedRectangleShape.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash12 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionN = n();
        int iHashCode3 = iHashCode2 + (expressionN != null ? expressionN.hashCode() : 0) + o().hashCode() + this.f47707h.hashCode();
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
        int iHash13 = i11 + (divBorderZ != null ? divBorderZ.hash() : 0);
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash13 + (expressionB != null ? expressionB.hashCode() : 0);
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
        int i12 = iHashCode4 + iHash3;
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
        int iHash14 = i13 + (divFocusP != null ? divFocusP.hash() : 0);
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
        int iHash15 = iHash14 + iHash5 + getHeight().hash();
        String id2 = getId();
        int iHashCode5 = iHash15 + (id2 != null ? id2.hashCode() : 0) + this.f47718s.hashCode();
        DivRoundedRectangleShape divRoundedRectangleShape2 = this.f47719t;
        int iHash16 = iHashCode5 + (divRoundedRectangleShape2 != null ? divRoundedRectangleShape2.hash() : 0);
        DivRoundedRectangleShape divRoundedRectangleShape3 = this.f47720u;
        int iHash17 = iHash16 + (divRoundedRectangleShape3 != null ? divRoundedRectangleShape3.hash() : 0);
        DivIndicatorItemPlacement divIndicatorItemPlacement = this.f47721v;
        int iHash18 = iHash17 + (divIndicatorItemPlacement != null ? divIndicatorItemPlacement.hash() : 0);
        DivLayoutProvider divLayoutProviderT = t();
        int iHash19 = iHash18 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash20 = iHash19 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f47724y.hashCode();
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash21 = iHash20 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        String str = this.A;
        int iHashCode6 = iHash21 + (str != null ? str.hashCode() : 0);
        Expression<String> expressionF = f();
        int iHashCode7 = iHashCode6 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode8 = iHashCode7 + (expressionE != null ? expressionE.hashCode() : 0);
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
        int iHash22 = iHashCode8 + iHash6 + this.E.hash() + this.F.hash();
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
        int i14 = iHash22 + iHash7;
        DivTransform divTransformL = l();
        int iHash23 = i14 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash24 = iHash23 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash25 = iHash24 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash26 = iHash25 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode9 = iHash26 + (listM != null ? listM.hashCode() : 0);
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
        int i15 = iHashCode9 + iHash8;
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
        int iHashCode10 = i15 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash27 = iHashCode10 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash28 = iHash27 + iHash10 + getWidth().hash();
        this.S = Integer.valueOf(iHash28);
        return iHash28;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.K;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.I;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f47712m;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.H;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.L;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f47705f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f47706g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f47714o;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f47700a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f47725z;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.D;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f47722w;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.M;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.P;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f47715p;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.J;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f47708i;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f47710k;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivIndicator(DivAccessibility divAccessibility, Expression expression, Expression expression2, DivRoundedRectangleShape divRoundedRectangleShape, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, DivRoundedRectangleShape divRoundedRectangleShape2, DivRoundedRectangleShape divRoundedRectangleShape3, DivIndicatorItemPlacement divIndicatorItemPlacement, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, DivShape divShape, DivFixedSize divFixedSize, List list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list8, List list9, List list10, Expression expression12, DivVisibilityAction divVisibilityAction, List list11, DivSize divSize2, int i10, int i11, ck.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? U : expression, (i10 & 4) != 0 ? V : expression2, (i10 & 8) != 0 ? null : divRoundedRectangleShape, (i10 & 16) != 0 ? null : expression3, (i10 & 32) != 0 ? null : expression4, (i10 & 64) != 0 ? W : expression5, (i10 & 128) != 0 ? X : expression6, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : list2, (i10 & 1024) != 0 ? null : divBorder, (i10 & 2048) != 0 ? null : expression7, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : list4, (i10 & 16384) != 0 ? null : divFocus, (i10 & 32768) != 0 ? null : list5, (i10 & 65536) != 0 ? Y : divSize, (i10 & 131072) != 0 ? null : str, (i10 & 262144) != 0 ? Z : expression8, (i10 & 524288) != 0 ? null : divRoundedRectangleShape2, (i10 & 1048576) != 0 ? null : divRoundedRectangleShape3, (i10 & 2097152) != 0 ? null : divIndicatorItemPlacement, (i10 & 4194304) != 0 ? null : divLayoutProvider, (i10 & 8388608) != 0 ? null : divEdgeInsets, (i10 & 16777216) != 0 ? f47694a0 : expression9, (i10 & 33554432) != 0 ? null : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str2, (i10 & 134217728) != 0 ? null : expression10, (i10 & 268435456) != 0 ? null : expression11, (i10 & 536870912) != 0 ? null : list6, (i10 & 1073741824) != 0 ? f47695b0 : divShape, (i10 & Integer.MIN_VALUE) != 0 ? f47696c0 : divFixedSize, (i11 & 1) != 0 ? null : list7, (i11 & 2) != 0 ? null : divTransform, (i11 & 4) != 0 ? null : divChangeTransition, (i11 & 8) != 0 ? null : divAppearanceTransition, (i11 & 16) != 0 ? null : divAppearanceTransition2, (i11 & 32) != 0 ? null : list8, (i11 & 64) != 0 ? null : list9, (i11 & 128) != 0 ? null : list10, (i11 & 256) != 0 ? f47697d0 : expression12, (i11 & 512) != 0 ? null : divVisibilityAction, (i11 & 1024) != 0 ? null : list11, (i11 & 2048) != 0 ? f47698e0 : divSize2);
    }
}
