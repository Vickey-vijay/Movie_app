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

/* JADX INFO: compiled from: DivGrid.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivGrid implements JSONSerializable, Hashable, oe.e2 {
    public static final a W = new a(null);
    public static final DivAnimation X;
    public static final Expression<Double> Y;
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47450a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47451b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final DivSize.d f47452c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47453d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.c f47454e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivGrid> f47455f0;
    public final List<DivAction> A;
    public final DivEdgeInsets B;
    public final DivEdgeInsets C;
    public final List<DivAction> D;
    public final List<DivAction> E;
    public final Expression<String> F;
    public final Expression<Long> G;
    public final List<DivAction> H;
    public final List<DivTooltip> I;
    public final DivTransform J;
    public final DivChangeTransition K;
    public final DivAppearanceTransition L;
    public final DivAppearanceTransition M;
    public final List<DivTransitionTrigger> N;
    public final List<DivTrigger> O;
    public final List<DivVariable> P;
    public final Expression<DivVisibility> Q;
    public final DivVisibilityAction R;
    public final List<DivVisibilityAction> S;
    public final DivSize T;
    public Integer U;
    public Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f47456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAction f47457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivAnimation f47458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f47459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f47462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivAnimator> f47463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivBackground> f47464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DivBorder f47465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Boolean> f47466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Long> f47467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression<Long> f47468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<DivDisappearAction> f47471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<DivAction> f47472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivExtension> f47473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivFocus f47474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<DivFunction> f47475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DivSize f47476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<DivAction> f47477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<DivAction> f47478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f47479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<Div> f47480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivLayoutProvider f47481z;

    /* JADX WARN: Multi-variable type inference failed */
    public DivGrid(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, Expression<Long> expression6, Expression<DivAlignmentHorizontal> expression7, Expression<DivAlignmentVertical> expression8, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, List<? extends Div> list10, DivLayoutProvider divLayoutProvider, List<DivAction> list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List<DivAction> list12, List<DivAction> list13, Expression<String> expression9, Expression<Long> expression10, List<DivAction> list14, List<DivTooltip> list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends DivVariable> list18, Expression<DivVisibility> expression11, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list19, DivSize divSize2) {
        this.f47456a = divAccessibility;
        this.f47457b = divAction;
        this.f47458c = divAnimation;
        this.f47459d = list;
        this.f47460e = expression;
        this.f47461f = expression2;
        this.f47462g = expression3;
        this.f47463h = list2;
        this.f47464i = list3;
        this.f47465j = divBorder;
        this.f47466k = expression4;
        this.f47467l = expression5;
        this.f47468m = expression6;
        this.f47469n = expression7;
        this.f47470o = expression8;
        this.f47471p = list4;
        this.f47472q = list5;
        this.f47473r = list6;
        this.f47474s = divFocus;
        this.f47475t = list7;
        this.f47476u = divSize;
        this.f47477v = list8;
        this.f47478w = list9;
        this.f47479x = str;
        this.f47480y = list10;
        this.f47481z = divLayoutProvider;
        this.A = list11;
        this.B = divEdgeInsets;
        this.C = divEdgeInsets2;
        this.D = list12;
        this.E = list13;
        this.F = expression9;
        this.G = expression10;
        this.H = list14;
        this.I = list15;
        this.J = divTransform;
        this.K = divChangeTransition;
        this.L = divAppearanceTransition;
        this.M = divAppearanceTransition2;
        this.N = list16;
        this.O = list17;
        this.P = list18;
        this.Q = expression11;
        this.R = divVisibilityAction;
        this.S = list19;
        this.T = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivGrid B(DivGrid divGrid, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression9, Expression expression10, List list14, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression11, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divGrid.q() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divGrid.f47457b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divGrid.f47458c : divAnimation;
        List list20 = (i10 & 8) != 0 ? divGrid.f47459d : list;
        Expression expressionG = (i10 & 16) != 0 ? divGrid.g() : expression;
        Expression expressionN = (i10 & 32) != 0 ? divGrid.n() : expression2;
        Expression expressionO = (i10 & 64) != 0 ? divGrid.o() : expression3;
        List listY = (i10 & 128) != 0 ? divGrid.y() : list2;
        List background = (i10 & 256) != 0 ? divGrid.getBackground() : list3;
        DivBorder divBorderZ = (i10 & 512) != 0 ? divGrid.z() : divBorder;
        Expression expression12 = (i10 & 1024) != 0 ? divGrid.f47466k : expression4;
        Expression expression13 = (i10 & 2048) != 0 ? divGrid.f47467l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? divGrid.b() : expression6;
        Expression expression14 = (i10 & 8192) != 0 ? divGrid.f47469n : expression7;
        Expression expression15 = (i10 & 16384) != 0 ? divGrid.f47470o : expression8;
        List listK = (i10 & 32768) != 0 ? divGrid.k() : list4;
        Expression expression16 = expression15;
        List list21 = (i10 & 65536) != 0 ? divGrid.f47472q : list5;
        List extensions = (i10 & 131072) != 0 ? divGrid.getExtensions() : list6;
        DivFocus divFocusP = (i10 & 262144) != 0 ? divGrid.p() : divFocus;
        List listW = (i10 & 524288) != 0 ? divGrid.w() : list7;
        DivSize height = (i10 & 1048576) != 0 ? divGrid.getHeight() : divSize;
        List list22 = list21;
        List list23 = (i10 & 2097152) != 0 ? divGrid.f47477v : list8;
        List list24 = (i10 & 4194304) != 0 ? divGrid.f47478w : list9;
        String id2 = (i10 & 8388608) != 0 ? divGrid.getId() : str;
        List list25 = list24;
        List list26 = (i10 & 16777216) != 0 ? divGrid.f47480y : list10;
        return divGrid.A(divAccessibilityQ, divAction2, divAnimation2, list20, expressionG, expressionN, expressionO, listY, background, divBorderZ, expression12, expression13, expressionB, expression14, expression16, listK, list22, extensions, divFocusP, listW, height, list23, list25, id2, list26, (i10 & 33554432) != 0 ? divGrid.t() : divLayoutProvider, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divGrid.A : list11, (i10 & 134217728) != 0 ? divGrid.d() : divEdgeInsets, (i10 & 268435456) != 0 ? divGrid.r() : divEdgeInsets2, (i10 & 536870912) != 0 ? divGrid.D : list12, (i10 & 1073741824) != 0 ? divGrid.E : list13, (i10 & Integer.MIN_VALUE) != 0 ? divGrid.f() : expression9, (i11 & 1) != 0 ? divGrid.e() : expression10, (i11 & 2) != 0 ? divGrid.s() : list14, (i11 & 4) != 0 ? divGrid.h() : list15, (i11 & 8) != 0 ? divGrid.l() : divTransform, (i11 & 16) != 0 ? divGrid.j() : divChangeTransition, (i11 & 32) != 0 ? divGrid.x() : divAppearanceTransition, (i11 & 64) != 0 ? divGrid.i() : divAppearanceTransition2, (i11 & 128) != 0 ? divGrid.m() : list16, (i11 & 256) != 0 ? divGrid.u() : list17, (i11 & 512) != 0 ? divGrid.c() : list18, (i11 & 1024) != 0 ? divGrid.getVisibility() : expression11, (i11 & 2048) != 0 ? divGrid.v() : divVisibilityAction, (i11 & 4096) != 0 ? divGrid.a() : list19, (i11 & 8192) != 0 ? divGrid.getWidth() : divSize2);
    }

    public final DivGrid A(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, Expression<Long> expression6, Expression<DivAlignmentHorizontal> expression7, Expression<DivAlignmentVertical> expression8, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, List<? extends Div> list10, DivLayoutProvider divLayoutProvider, List<DivAction> list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List<DivAction> list12, List<DivAction> list13, Expression<String> expression9, Expression<Long> expression10, List<DivAction> list14, List<DivTooltip> list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends DivVariable> list18, Expression<DivVisibility> expression11, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list19, DivSize divSize2) {
        return new DivGrid(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, expression6, expression7, expression8, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, list10, divLayoutProvider, list11, divEdgeInsets, divEdgeInsets2, list12, list13, expression9, expression10, list14, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression11, divVisibilityAction, list19, divSize2);
    }

    public final boolean C(DivGrid divGrid, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zA3;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zA4;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zA5;
        boolean z20;
        boolean zA6;
        boolean zA7;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean zG;
        boolean z28;
        if (divGrid == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divGrid.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divGrid.q() == null;
        }
        if (!zA) {
            return false;
        }
        DivAction divAction = this.f47457b;
        if (divAction != null) {
            zA2 = divAction.a(divGrid.f47457b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divGrid.f47457b == null;
        }
        if (!zA2 || !this.f47458c.a(divGrid.f47458c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f47459d;
        if (list != null) {
            List<DivAction> list2 = divGrid.f47459d;
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
            z10 = divGrid.f47459d == null;
        }
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divGrid.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divGrid.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divGrid.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divGrid.y();
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
            z11 = divGrid.y() == null;
        }
        if (!z11) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divGrid.getBackground();
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
            z12 = divGrid.getBackground() == null;
        }
        if (!z12) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA3 = divBorderZ.a(divGrid.z(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divGrid.z() == null;
        }
        if (!zA3 || this.f47466k.evaluate(expressionResolver).booleanValue() != divGrid.f47466k.evaluate(expressionResolver2).booleanValue() || this.f47467l.evaluate(expressionResolver).longValue() != divGrid.f47467l.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divGrid.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f47469n.evaluate(expressionResolver) != divGrid.f47469n.evaluate(expressionResolver2) || this.f47470o.evaluate(expressionResolver) != divGrid.f47470o.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divGrid.k();
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
            z13 = divGrid.k() == null;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f47472q;
        if (list3 != null) {
            List<DivAction> list4 = divGrid.f47472q;
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
            z14 = divGrid.f47472q == null;
        }
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divGrid.getExtensions();
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
            z15 = divGrid.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA4 = divFocusP.a(divGrid.p(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divGrid.p() == null;
        }
        if (!zA4) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divGrid.w();
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
            z16 = divGrid.w() == null;
        }
        if (!z16 || !getHeight().a(divGrid.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f47477v;
        if (list5 != null) {
            List<DivAction> list6 = divGrid.f47477v;
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
            z17 = divGrid.f47477v == null;
        }
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f47478w;
        if (list7 != null) {
            List<DivAction> list8 = divGrid.f47478w;
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
            z18 = divGrid.f47478w == null;
        }
        if (!z18 || !ck.p.e(getId(), divGrid.getId())) {
            return false;
        }
        List<Div> list9 = this.f47480y;
        if (list9 != null) {
            List<Div> list10 = divGrid.f47480y;
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
            z19 = divGrid.f47480y == null;
        }
        if (!z19) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA5 = divLayoutProviderT.a(divGrid.t(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divGrid.t() == null;
        }
        if (!zA5) {
            return false;
        }
        List<DivAction> list11 = this.A;
        if (list11 != null) {
            List<DivAction> list12 = divGrid.A;
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
            z20 = divGrid.A == null;
        }
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA6 = divEdgeInsetsD.a(divGrid.d(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divGrid.d() == null;
        }
        if (!zA6) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA7 = divEdgeInsetsR.a(divGrid.r(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divGrid.r() == null;
        }
        if (!zA7) {
            return false;
        }
        List<DivAction> list13 = this.D;
        if (list13 != null) {
            List<DivAction> list14 = divGrid.D;
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
            z21 = divGrid.D == null;
        }
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.E;
        if (list15 != null) {
            List<DivAction> list16 = divGrid.E;
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
            z22 = divGrid.E == null;
        }
        if (!z22) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divGrid.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divGrid.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divGrid.s();
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
            z23 = divGrid.s() == null;
        }
        if (!z23) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divGrid.h();
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
            z24 = divGrid.h() == null;
        }
        if (!z24) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA8 = divTransformL.a(divGrid.l(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divGrid.l() == null;
        }
        if (!zA8) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA9 = divChangeTransitionJ.a(divGrid.j(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divGrid.j() == null;
        }
        if (!zA9) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA10 = divAppearanceTransitionX.a(divGrid.x(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divGrid.x() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA11 = divAppearanceTransitionI.a(divGrid.i(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divGrid.i() == null;
        }
        if (!zA11) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divGrid.m();
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
            z25 = divGrid.m() == null;
        }
        if (!z25) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divGrid.u();
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
            z26 = divGrid.u() == null;
        }
        if (!z26) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divGrid.c();
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
            z27 = divGrid.c() == null;
        }
        if (!z27 || getVisibility().evaluate(expressionResolver) != divGrid.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divGrid.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divGrid.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divGrid.a();
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
            z28 = divGrid.a() == null;
        }
        return z28 && getWidth().a(divGrid.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivGrid.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivGrid a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().R3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        X = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        Y = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47450a0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        f47451b0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        f47452c0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f47453d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47454e0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f47455f0 = new bk.p<ParsingEnvironment, JSONObject, DivGrid>() { // from class: com.yandex.div2.DivGrid$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGrid mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivGrid.W.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.S;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f47468m;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.P;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.B;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.G;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.F;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f47460e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f47464i;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f47473r;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f47476u;
    }

    @Override // oe.e2
    public String getId() {
        return this.f47479x;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.Q;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.T;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.I;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.f47480y;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.V = Integer.valueOf(i10);
        return i10;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.M;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.K;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f47471p;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.J;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.N;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f47461f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f47462g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f47474s;
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
        Integer num = this.U;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivGrid.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        DivAction divAction = this.f47457b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f47458c.hash();
        List<DivAction> list = this.f47459d;
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
        int i12 = i11 + iHash3;
        DivBorder divBorderZ = z();
        int iHash20 = i12 + (divBorderZ != null ? divBorderZ.hash() : 0) + this.f47466k.hashCode() + this.f47467l.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0) + this.f47469n.hashCode() + this.f47470o.hashCode();
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
        List<DivAction> list2 = this.f47472q;
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
        int iHash21 = i15 + (divFocusP != null ? divFocusP.hash() : 0);
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
        int iHash22 = iHash21 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.f47477v;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash22 + iHash8;
        List<DivAction> list4 = this.f47478w;
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
        DivLayoutProvider divLayoutProviderT = t();
        int iHash23 = iHashCode5 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        List<DivAction> list5 = this.A;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash23 + iHash10;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash24 = i18 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash25 = iHash24 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        List<DivAction> list6 = this.D;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash25 + iHash11;
        List<DivAction> list7 = this.E;
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
        int i22 = i21 + iHash14;
        DivTransform divTransformL = l();
        int iHash26 = i22 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash27 = iHash26 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash28 = iHash27 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash29 = iHash28 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode8 = iHash29 + (listM != null ? listM.hashCode() : 0);
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
        int iHash30 = iHashCode9 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.U = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f47456a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.C;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.H;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f47481z;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.O;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.R;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f47475t;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.L;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f47463h;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f47465j;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
