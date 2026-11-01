package com.yandex.div2;

import android.net.Uri;
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

/* JADX INFO: compiled from: DivGifImage.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivGifImage implements JSONSerializable, Hashable, oe.e2 {
    public static final a Z = new a(null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final DivAnimation f47350a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Double> f47351b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<Boolean> f47352c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47353d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47354e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final DivSize.d f47355f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Expression<Integer> f47356g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Expression<Boolean> f47357h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<DivImageScale> f47358i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47359j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final DivSize.c f47360k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivGifImage> f47361l0;
    public final List<DivAction> A;
    public final DivEdgeInsets B;
    public final DivEdgeInsets C;
    public final Expression<Integer> D;
    public final Expression<Boolean> E;
    public final List<DivAction> F;
    public final List<DivAction> G;
    public final Expression<String> H;
    public final Expression<String> I;
    public final Expression<Long> J;
    public final Expression<DivImageScale> K;
    public final List<DivAction> L;
    public final List<DivTooltip> M;
    public final DivTransform N;
    public final DivChangeTransition O;
    public final DivAppearanceTransition P;
    public final DivAppearanceTransition Q;
    public final List<DivTransitionTrigger> R;
    public final List<DivTrigger> S;
    public final List<DivVariable> T;
    public final Expression<DivVisibility> U;
    public final DivVisibilityAction V;
    public final List<DivVisibilityAction> W;
    public final DivSize X;
    public Integer Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f47362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAction f47363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivAnimation f47364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f47365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f47368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivAnimator> f47369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DivAspect f47370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivBackground> f47371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivBorder f47372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Boolean> f47373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression<Long> f47374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<DivDisappearAction> f47377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<DivAction> f47378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivExtension> f47379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivFocus f47380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<DivFunction> f47381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<Uri> f47382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DivSize f47383v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<DivAction> f47384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<DivAction> f47385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f47386y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivLayoutProvider f47387z;

    /* JADX WARN: Multi-variable type inference failed */
    public DivGifImage(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, DivAspect divAspect, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, Expression<DivAlignmentHorizontal> expression6, Expression<DivAlignmentVertical> expression7, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, Expression<Uri> expression8, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, DivLayoutProvider divLayoutProvider, List<DivAction> list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<Integer> expression9, Expression<Boolean> expression10, List<DivAction> list11, List<DivAction> list12, Expression<String> expression11, Expression<String> expression12, Expression<Long> expression13, Expression<DivImageScale> expression14, List<DivAction> list13, List<DivTooltip> list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list15, List<DivTrigger> list16, List<? extends DivVariable> list17, Expression<DivVisibility> expression15, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list18, DivSize divSize2) {
        this.f47362a = divAccessibility;
        this.f47363b = divAction;
        this.f47364c = divAnimation;
        this.f47365d = list;
        this.f47366e = expression;
        this.f47367f = expression2;
        this.f47368g = expression3;
        this.f47369h = list2;
        this.f47370i = divAspect;
        this.f47371j = list3;
        this.f47372k = divBorder;
        this.f47373l = expression4;
        this.f47374m = expression5;
        this.f47375n = expression6;
        this.f47376o = expression7;
        this.f47377p = list4;
        this.f47378q = list5;
        this.f47379r = list6;
        this.f47380s = divFocus;
        this.f47381t = list7;
        this.f47382u = expression8;
        this.f47383v = divSize;
        this.f47384w = list8;
        this.f47385x = list9;
        this.f47386y = str;
        this.f47387z = divLayoutProvider;
        this.A = list10;
        this.B = divEdgeInsets;
        this.C = divEdgeInsets2;
        this.D = expression9;
        this.E = expression10;
        this.F = list11;
        this.G = list12;
        this.H = expression11;
        this.I = expression12;
        this.J = expression13;
        this.K = expression14;
        this.L = list13;
        this.M = list14;
        this.N = divTransform;
        this.O = divChangeTransition;
        this.P = divAppearanceTransition;
        this.Q = divAppearanceTransition2;
        this.R = list15;
        this.S = list16;
        this.T = list17;
        this.U = expression15;
        this.V = divVisibilityAction;
        this.W = list18;
        this.X = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivGifImage B(DivGifImage divGifImage, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, DivFocus divFocus, List list7, Expression expression8, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression15, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divGifImage.q() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divGifImage.f47363b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divGifImage.f47364c : divAnimation;
        List list19 = (i10 & 8) != 0 ? divGifImage.f47365d : list;
        Expression expressionG = (i10 & 16) != 0 ? divGifImage.g() : expression;
        Expression expressionN = (i10 & 32) != 0 ? divGifImage.n() : expression2;
        Expression expressionO = (i10 & 64) != 0 ? divGifImage.o() : expression3;
        List listY = (i10 & 128) != 0 ? divGifImage.y() : list2;
        DivAspect divAspect2 = (i10 & 256) != 0 ? divGifImage.f47370i : divAspect;
        List background = (i10 & 512) != 0 ? divGifImage.getBackground() : list3;
        DivBorder divBorderZ = (i10 & 1024) != 0 ? divGifImage.z() : divBorder;
        Expression expression16 = (i10 & 2048) != 0 ? divGifImage.f47373l : expression4;
        Expression expressionB = (i10 & 4096) != 0 ? divGifImage.b() : expression5;
        Expression expression17 = (i10 & 8192) != 0 ? divGifImage.f47375n : expression6;
        Expression expression18 = (i10 & 16384) != 0 ? divGifImage.f47376o : expression7;
        List listK = (i10 & 32768) != 0 ? divGifImage.k() : list4;
        Expression expression19 = expression18;
        List list20 = (i10 & 65536) != 0 ? divGifImage.f47378q : list5;
        List extensions = (i10 & 131072) != 0 ? divGifImage.getExtensions() : list6;
        DivFocus divFocusP = (i10 & 262144) != 0 ? divGifImage.p() : divFocus;
        List listW = (i10 & 524288) != 0 ? divGifImage.w() : list7;
        List list21 = list20;
        Expression expression20 = (i10 & 1048576) != 0 ? divGifImage.f47382u : expression8;
        DivSize height = (i10 & 2097152) != 0 ? divGifImage.getHeight() : divSize;
        Expression expression21 = expression20;
        List list22 = (i10 & 4194304) != 0 ? divGifImage.f47384w : list8;
        List list23 = (i10 & 8388608) != 0 ? divGifImage.f47385x : list9;
        String id2 = (i10 & 16777216) != 0 ? divGifImage.getId() : str;
        DivLayoutProvider divLayoutProviderT = (i10 & 33554432) != 0 ? divGifImage.t() : divLayoutProvider;
        List list24 = list23;
        List list25 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divGifImage.A : list10;
        return divGifImage.A(divAccessibilityQ, divAction2, divAnimation2, list19, expressionG, expressionN, expressionO, listY, divAspect2, background, divBorderZ, expression16, expressionB, expression17, expression19, listK, list21, extensions, divFocusP, listW, expression21, height, list22, list24, id2, divLayoutProviderT, list25, (i10 & 134217728) != 0 ? divGifImage.d() : divEdgeInsets, (i10 & 268435456) != 0 ? divGifImage.r() : divEdgeInsets2, (i10 & 536870912) != 0 ? divGifImage.D : expression9, (i10 & 1073741824) != 0 ? divGifImage.E : expression10, (i10 & Integer.MIN_VALUE) != 0 ? divGifImage.F : list11, (i11 & 1) != 0 ? divGifImage.G : list12, (i11 & 2) != 0 ? divGifImage.H : expression11, (i11 & 4) != 0 ? divGifImage.f() : expression12, (i11 & 8) != 0 ? divGifImage.e() : expression13, (i11 & 16) != 0 ? divGifImage.K : expression14, (i11 & 32) != 0 ? divGifImage.s() : list13, (i11 & 64) != 0 ? divGifImage.h() : list14, (i11 & 128) != 0 ? divGifImage.l() : divTransform, (i11 & 256) != 0 ? divGifImage.j() : divChangeTransition, (i11 & 512) != 0 ? divGifImage.x() : divAppearanceTransition, (i11 & 1024) != 0 ? divGifImage.i() : divAppearanceTransition2, (i11 & 2048) != 0 ? divGifImage.m() : list15, (i11 & 4096) != 0 ? divGifImage.u() : list16, (i11 & 8192) != 0 ? divGifImage.c() : list17, (i11 & 16384) != 0 ? divGifImage.getVisibility() : expression15, (i11 & 32768) != 0 ? divGifImage.v() : divVisibilityAction, (i11 & 65536) != 0 ? divGifImage.a() : list18, (i11 & 131072) != 0 ? divGifImage.getWidth() : divSize2);
    }

    public final DivGifImage A(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, DivAspect divAspect, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, Expression<DivAlignmentHorizontal> expression6, Expression<DivAlignmentVertical> expression7, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, Expression<Uri> expression8, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, DivLayoutProvider divLayoutProvider, List<DivAction> list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<Integer> expression9, Expression<Boolean> expression10, List<DivAction> list11, List<DivAction> list12, Expression<String> expression11, Expression<String> expression12, Expression<Long> expression13, Expression<DivImageScale> expression14, List<DivAction> list13, List<DivTooltip> list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list15, List<DivTrigger> list16, List<? extends DivVariable> list17, Expression<DivVisibility> expression15, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list18, DivSize divSize2) {
        return new DivGifImage(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, list4, list5, list6, divFocus, list7, expression8, divSize, list8, list9, str, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, expression9, expression10, list11, list12, expression11, expression12, expression13, expression14, list13, list14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list15, list16, list17, expression15, divVisibilityAction, list18, divSize2);
    }

    public final boolean C(DivGifImage divGifImage, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean z21;
        boolean z22;
        boolean z23;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean zA12;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean zG;
        boolean z27;
        if (divGifImage == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divGifImage.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divGifImage.q() == null;
        }
        if (!zA) {
            return false;
        }
        DivAction divAction = this.f47363b;
        if (divAction != null) {
            zA2 = divAction.a(divGifImage.f47363b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divGifImage.f47363b == null;
        }
        if (!zA2 || !this.f47364c.a(divGifImage.f47364c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f47365d;
        if (list != null) {
            List<DivAction> list2 = divGifImage.f47365d;
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
            z10 = divGifImage.f47365d == null;
        }
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divGifImage.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divGifImage.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divGifImage.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divGifImage.y();
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
            z11 = divGifImage.y() == null;
        }
        if (!z11) {
            return false;
        }
        DivAspect divAspect = this.f47370i;
        if (divAspect != null) {
            zA3 = divAspect.a(divGifImage.f47370i, expressionResolver, expressionResolver2);
        } else {
            zA3 = divGifImage.f47370i == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divGifImage.getBackground();
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
            z12 = divGifImage.getBackground() == null;
        }
        if (!z12) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA4 = divBorderZ.a(divGifImage.z(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divGifImage.z() == null;
        }
        if (!zA4 || this.f47373l.evaluate(expressionResolver).booleanValue() != divGifImage.f47373l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divGifImage.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f47375n.evaluate(expressionResolver) != divGifImage.f47375n.evaluate(expressionResolver2) || this.f47376o.evaluate(expressionResolver) != divGifImage.f47376o.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divGifImage.k();
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
            z13 = divGifImage.k() == null;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f47378q;
        if (list3 != null) {
            List<DivAction> list4 = divGifImage.f47378q;
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
            z14 = divGifImage.f47378q == null;
        }
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divGifImage.getExtensions();
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
            z15 = divGifImage.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA5 = divFocusP.a(divGifImage.p(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divGifImage.p() == null;
        }
        if (!zA5) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divGifImage.w();
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
            z16 = divGifImage.w() == null;
        }
        if (!z16 || !ck.p.e(this.f47382u.evaluate(expressionResolver), divGifImage.f47382u.evaluate(expressionResolver2)) || !getHeight().a(divGifImage.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f47384w;
        if (list5 != null) {
            List<DivAction> list6 = divGifImage.f47384w;
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
            z17 = divGifImage.f47384w == null;
        }
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f47385x;
        if (list7 != null) {
            List<DivAction> list8 = divGifImage.f47385x;
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
            z18 = divGifImage.f47385x == null;
        }
        if (!z18 || !ck.p.e(getId(), divGifImage.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA6 = divLayoutProviderT.a(divGifImage.t(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divGifImage.t() == null;
        }
        if (!zA6) {
            return false;
        }
        List<DivAction> list9 = this.A;
        if (list9 != null) {
            List<DivAction> list10 = divGifImage.A;
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
                        if (((DivAction) next10).a(list10.get(i28), expressionResolver, expressionResolver2)) {
                            i28 = i29;
                        }
                    }
                }
            }
        } else {
            z19 = divGifImage.A == null;
        }
        if (!z19) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA7 = divEdgeInsetsD.a(divGifImage.d(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divGifImage.d() == null;
        }
        if (!zA7) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA8 = divEdgeInsetsR.a(divGifImage.r(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divGifImage.r() == null;
        }
        if (!zA8 || this.D.evaluate(expressionResolver).intValue() != divGifImage.D.evaluate(expressionResolver2).intValue() || this.E.evaluate(expressionResolver).booleanValue() != divGifImage.E.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list11 = this.F;
        if (list11 != null) {
            List<DivAction> list12 = divGifImage.F;
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
            z20 = divGifImage.F == null;
        }
        if (!z20) {
            return false;
        }
        List<DivAction> list13 = this.G;
        if (list13 != null) {
            List<DivAction> list14 = divGifImage.G;
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
            z21 = divGifImage.G == null;
        }
        if (!z21) {
            return false;
        }
        Expression<String> expression = this.H;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divGifImage.H;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divGifImage.f();
        if (!ck.p.e(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divGifImage.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.K.evaluate(expressionResolver) != divGifImage.K.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divGifImage.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it13 = listS.iterator();
                int i34 = 0;
                while (true) {
                    if (it13.hasNext()) {
                        Object next13 = it13.next();
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next13).a(listS2.get(i34), expressionResolver, expressionResolver2)) {
                            i34 = i35;
                        }
                    }
                }
            }
        } else {
            z22 = divGifImage.s() == null;
        }
        if (!z22) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divGifImage.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it14 = listH.iterator();
                int i36 = 0;
                while (true) {
                    if (it14.hasNext()) {
                        Object next14 = it14.next();
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next14).a(listH2.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                }
            }
        } else {
            z23 = divGifImage.h() == null;
        }
        if (!z23) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA9 = divTransformL.a(divGifImage.l(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divGifImage.l() == null;
        }
        if (!zA9) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA10 = divChangeTransitionJ.a(divGifImage.j(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divGifImage.j() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA11 = divAppearanceTransitionX.a(divGifImage.x(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divGifImage.x() == null;
        }
        if (!zA11) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA12 = divAppearanceTransitionI.a(divGifImage.i(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divGifImage.i() == null;
        }
        if (!zA12) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divGifImage.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it15 = listM.iterator();
                int i38 = 0;
                while (true) {
                    if (it15.hasNext()) {
                        Object next15 = it15.next();
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next15) == listM2.get(i38)) {
                            i38 = i39;
                        }
                    }
                }
            }
        } else {
            z24 = divGifImage.m() == null;
        }
        if (!z24) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divGifImage.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it16 = listU.iterator();
                int i40 = 0;
                while (true) {
                    if (it16.hasNext()) {
                        Object next16 = it16.next();
                        int i41 = i40 + 1;
                        if (i40 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next16).a(listU2.get(i40), expressionResolver, expressionResolver2)) {
                            i40 = i41;
                        }
                    }
                }
            }
        } else {
            z25 = divGifImage.u() == null;
        }
        if (!z25) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divGifImage.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it17 = listC.iterator();
                int i42 = 0;
                while (true) {
                    if (it17.hasNext()) {
                        Object next17 = it17.next();
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next17).a(listC2.get(i42), expressionResolver, expressionResolver2)) {
                            i42 = i43;
                        }
                    }
                }
            }
        } else {
            z26 = divGifImage.c() == null;
        }
        if (!z26 || getVisibility().evaluate(expressionResolver) != divGifImage.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divGifImage.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divGifImage.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divGifImage.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it18 = listA.iterator();
                int i44 = 0;
                while (true) {
                    if (it18.hasNext()) {
                        Object next18 = it18.next();
                        int i45 = i44 + 1;
                        if (i44 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next18).g(listA2.get(i44), expressionResolver, expressionResolver2)) {
                            i44 = i45;
                        }
                    }
                }
            }
        } else {
            z27 = divGifImage.a() == null;
        }
        return z27 && getWidth().a(divGifImage.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivGifImage.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivGifImage a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f47350a0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47351b0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47352c0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47353d0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f47354e0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47355f0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f47356g0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f47357h0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47358i0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f47359j0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47360k0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f47361l0 = new bk.p<ParsingEnvironment, JSONObject, DivGifImage>() { // from class: com.yandex.div2.DivGifImage$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivGifImage mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivGifImage.Z.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.W;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f47374m;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.T;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.B;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.J;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.I;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f47366e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f47371j;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f47379r;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f47383v;
    }

    @Override // oe.e2
    public String getId() {
        return this.f47386y;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.U;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.X;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.M;
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
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        Integer num = this.Y;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivGifImage.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        DivAction divAction = this.f47363b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f47364c.hash();
        List<DivAction> list = this.f47365d;
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
        DivAspect divAspect = this.f47370i;
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
        int iHash21 = i12 + (divBorderZ != null ? divBorderZ.hash() : 0) + this.f47373l.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash21 + (expressionB != null ? expressionB.hashCode() : 0) + this.f47375n.hashCode() + this.f47376o.hashCode();
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
        List<DivAction> list2 = this.f47378q;
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
        int iHashCode5 = iHash22 + iHash7 + this.f47382u.hashCode() + getHeight().hash();
        List<DivAction> list3 = this.f47384w;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode5 + iHash8;
        List<DivAction> list4 = this.f47385x;
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
        int iHashCode6 = i17 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderT = t();
        int iHash23 = iHashCode6 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
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
        int iHash25 = iHash24 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0) + this.D.hashCode() + this.E.hashCode();
        List<DivAction> list6 = this.F;
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
        List<DivAction> list7 = this.G;
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
        Expression<String> expression = this.H;
        int iHashCode7 = i20 + (expression != null ? expression.hashCode() : 0);
        Expression<String> expressionF = f();
        int iHashCode8 = iHashCode7 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0) + this.K.hashCode();
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
        int i21 = iHashCode9 + iHash13;
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
        int iHashCode10 = iHash29 + (listM != null ? listM.hashCode() : 0);
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
        int i23 = iHashCode10 + iHash15;
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
        int iHashCode11 = i23 + iHash16 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash30 = iHashCode11 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.Y = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.Q;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.O;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f47377p;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.N;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.R;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f47367f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f47368g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f47380s;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f47362a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.C;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.L;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f47387z;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.S;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.V;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f47381t;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.P;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f47369h;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f47372k;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
