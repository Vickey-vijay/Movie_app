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

/* JADX INFO: compiled from: DivImage.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivImage implements JSONSerializable, Hashable, oe.e2 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final a f47534e0 = new a(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final DivAnimation f47535f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Expression<Double> f47536g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Expression<Boolean> f47537h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47538i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47539j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final DivSize.d f47540k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Expression<Boolean> f47541l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Expression<Integer> f47542m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Expression<Boolean> f47543n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Expression<DivImageScale> f47544o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Expression<DivBlendMode> f47545p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47546q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final DivSize.c f47547r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivImage> f47548s0;
    public final String A;
    public final Expression<Uri> B;
    public final DivLayoutProvider C;
    public final List<DivAction> D;
    public final DivEdgeInsets E;
    public final DivEdgeInsets F;
    public final Expression<Integer> G;
    public final Expression<Boolean> H;
    public final List<DivAction> I;
    public final List<DivAction> J;
    public final Expression<String> K;
    public final Expression<String> L;
    public final Expression<Long> M;
    public final Expression<DivImageScale> N;
    public final List<DivAction> O;
    public final Expression<Integer> P;
    public final Expression<DivBlendMode> Q;
    public final List<DivTooltip> R;
    public final DivTransform S;
    public final DivChangeTransition T;
    public final DivAppearanceTransition U;
    public final DivAppearanceTransition V;
    public final List<DivTransitionTrigger> W;
    public final List<DivTrigger> X;
    public final List<DivVariable> Y;
    public final Expression<DivVisibility> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f47549a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final DivVisibilityAction f47550a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAction f47551b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List<DivVisibilityAction> f47552b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivAnimation f47553c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final DivSize f47554c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f47555d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Integer f47556d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f47559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivAnimator> f47560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DivFadeTransition f47561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DivAspect f47562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DivBackground> f47563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DivBorder f47564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression<Boolean> f47565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression<Long> f47566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<DivDisappearAction> f47569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivAction> f47570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<DivExtension> f47571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<DivFilter> f47572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DivFocus f47573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<DivFunction> f47574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivSize f47575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression<Boolean> f47576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<DivAction> f47577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<DivAction> f47578z;

    /* JADX WARN: Multi-variable type inference failed */
    public DivImage(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, Expression<DivAlignmentHorizontal> expression6, Expression<DivAlignmentVertical> expression7, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, List<? extends DivFilter> list7, DivFocus divFocus, List<DivFunction> list8, DivSize divSize, Expression<Boolean> expression8, List<DivAction> list9, List<DivAction> list10, String str, Expression<Uri> expression9, DivLayoutProvider divLayoutProvider, List<DivAction> list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<Integer> expression10, Expression<Boolean> expression11, List<DivAction> list12, List<DivAction> list13, Expression<String> expression12, Expression<String> expression13, Expression<Long> expression14, Expression<DivImageScale> expression15, List<DivAction> list14, Expression<Integer> expression16, Expression<DivBlendMode> expression17, List<DivTooltip> list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends DivVariable> list18, Expression<DivVisibility> expression18, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list19, DivSize divSize2) {
        this.f47549a = divAccessibility;
        this.f47551b = divAction;
        this.f47553c = divAnimation;
        this.f47555d = list;
        this.f47557e = expression;
        this.f47558f = expression2;
        this.f47559g = expression3;
        this.f47560h = list2;
        this.f47561i = divFadeTransition;
        this.f47562j = divAspect;
        this.f47563k = list3;
        this.f47564l = divBorder;
        this.f47565m = expression4;
        this.f47566n = expression5;
        this.f47567o = expression6;
        this.f47568p = expression7;
        this.f47569q = list4;
        this.f47570r = list5;
        this.f47571s = list6;
        this.f47572t = list7;
        this.f47573u = divFocus;
        this.f47574v = list8;
        this.f47575w = divSize;
        this.f47576x = expression8;
        this.f47577y = list9;
        this.f47578z = list10;
        this.A = str;
        this.B = expression9;
        this.C = divLayoutProvider;
        this.D = list11;
        this.E = divEdgeInsets;
        this.F = divEdgeInsets2;
        this.G = expression10;
        this.H = expression11;
        this.I = list12;
        this.J = list13;
        this.K = expression12;
        this.L = expression13;
        this.M = expression14;
        this.N = expression15;
        this.O = list14;
        this.P = expression16;
        this.Q = expression17;
        this.R = list15;
        this.S = divTransform;
        this.T = divChangeTransition;
        this.U = divAppearanceTransition;
        this.V = divAppearanceTransition2;
        this.W = list16;
        this.X = list17;
        this.Y = list18;
        this.Z = expression18;
        this.f47550a0 = divVisibilityAction;
        this.f47552b0 = list19;
        this.f47554c0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivImage B(DivImage divImage, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, Expression expression8, List list9, List list10, String str, Expression expression9, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression18, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divImage.q() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divImage.f47551b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divImage.f47553c : divAnimation;
        List list20 = (i10 & 8) != 0 ? divImage.f47555d : list;
        Expression expressionG = (i10 & 16) != 0 ? divImage.g() : expression;
        Expression expressionN = (i10 & 32) != 0 ? divImage.n() : expression2;
        Expression expressionO = (i10 & 64) != 0 ? divImage.o() : expression3;
        List listY = (i10 & 128) != 0 ? divImage.y() : list2;
        DivFadeTransition divFadeTransition2 = (i10 & 256) != 0 ? divImage.f47561i : divFadeTransition;
        DivAspect divAspect2 = (i10 & 512) != 0 ? divImage.f47562j : divAspect;
        List background = (i10 & 1024) != 0 ? divImage.getBackground() : list3;
        DivBorder divBorderZ = (i10 & 2048) != 0 ? divImage.z() : divBorder;
        Expression expression19 = (i10 & 4096) != 0 ? divImage.f47565m : expression4;
        Expression expressionB = (i10 & 8192) != 0 ? divImage.b() : expression5;
        Expression expression20 = (i10 & 16384) != 0 ? divImage.f47567o : expression6;
        Expression expression21 = (i10 & 32768) != 0 ? divImage.f47568p : expression7;
        List listK = (i10 & 65536) != 0 ? divImage.k() : list4;
        Expression expression22 = expression21;
        List list21 = (i10 & 131072) != 0 ? divImage.f47570r : list5;
        List extensions = (i10 & 262144) != 0 ? divImage.getExtensions() : list6;
        List list22 = list21;
        List list23 = (i10 & 524288) != 0 ? divImage.f47572t : list7;
        DivFocus divFocusP = (i10 & 1048576) != 0 ? divImage.p() : divFocus;
        List listW = (i10 & 2097152) != 0 ? divImage.w() : list8;
        DivSize height = (i10 & 4194304) != 0 ? divImage.getHeight() : divSize;
        List list24 = list23;
        Expression expression23 = (i10 & 8388608) != 0 ? divImage.f47576x : expression8;
        List list25 = (i10 & 16777216) != 0 ? divImage.f47577y : list9;
        List list26 = (i10 & 33554432) != 0 ? divImage.f47578z : list10;
        String id2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divImage.getId() : str;
        List list27 = list26;
        Expression expression24 = (i10 & 134217728) != 0 ? divImage.B : expression9;
        return divImage.A(divAccessibilityQ, divAction2, divAnimation2, list20, expressionG, expressionN, expressionO, listY, divFadeTransition2, divAspect2, background, divBorderZ, expression19, expressionB, expression20, expression22, listK, list22, extensions, list24, divFocusP, listW, height, expression23, list25, list27, id2, expression24, (i10 & 268435456) != 0 ? divImage.t() : divLayoutProvider, (i10 & 536870912) != 0 ? divImage.D : list11, (i10 & 1073741824) != 0 ? divImage.d() : divEdgeInsets, (i10 & Integer.MIN_VALUE) != 0 ? divImage.r() : divEdgeInsets2, (i11 & 1) != 0 ? divImage.G : expression10, (i11 & 2) != 0 ? divImage.H : expression11, (i11 & 4) != 0 ? divImage.I : list12, (i11 & 8) != 0 ? divImage.J : list13, (i11 & 16) != 0 ? divImage.K : expression12, (i11 & 32) != 0 ? divImage.f() : expression13, (i11 & 64) != 0 ? divImage.e() : expression14, (i11 & 128) != 0 ? divImage.N : expression15, (i11 & 256) != 0 ? divImage.s() : list14, (i11 & 512) != 0 ? divImage.P : expression16, (i11 & 1024) != 0 ? divImage.Q : expression17, (i11 & 2048) != 0 ? divImage.h() : list15, (i11 & 4096) != 0 ? divImage.l() : divTransform, (i11 & 8192) != 0 ? divImage.j() : divChangeTransition, (i11 & 16384) != 0 ? divImage.x() : divAppearanceTransition, (i11 & 32768) != 0 ? divImage.i() : divAppearanceTransition2, (i11 & 65536) != 0 ? divImage.m() : list16, (i11 & 131072) != 0 ? divImage.u() : list17, (i11 & 262144) != 0 ? divImage.c() : list18, (i11 & 524288) != 0 ? divImage.getVisibility() : expression18, (i11 & 1048576) != 0 ? divImage.v() : divVisibilityAction, (i11 & 2097152) != 0 ? divImage.a() : list19, (i11 & 4194304) != 0 ? divImage.getWidth() : divSize2);
    }

    public final DivImage A(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, DivFadeTransition divFadeTransition, DivAspect divAspect, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, Expression<DivAlignmentHorizontal> expression6, Expression<DivAlignmentVertical> expression7, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, List<? extends DivFilter> list7, DivFocus divFocus, List<DivFunction> list8, DivSize divSize, Expression<Boolean> expression8, List<DivAction> list9, List<DivAction> list10, String str, Expression<Uri> expression9, DivLayoutProvider divLayoutProvider, List<DivAction> list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<Integer> expression10, Expression<Boolean> expression11, List<DivAction> list12, List<DivAction> list13, Expression<String> expression12, Expression<String> expression13, Expression<Long> expression14, Expression<DivImageScale> expression15, List<DivAction> list14, Expression<Integer> expression16, Expression<DivBlendMode> expression17, List<DivTooltip> list15, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends DivVariable> list18, Expression<DivVisibility> expression18, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list19, DivSize divSize2) {
        return new DivImage(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, divFadeTransition, divAspect, list3, divBorder, expression4, expression5, expression6, expression7, list4, list5, list6, list7, divFocus, list8, divSize, expression8, list9, list10, str, expression9, divLayoutProvider, list11, divEdgeInsets, divEdgeInsets2, expression10, expression11, list12, list13, expression12, expression13, expression14, expression15, list14, expression16, expression17, list15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list16, list17, list18, expression18, divVisibilityAction, list19, divSize2);
    }

    public final boolean C(DivImage divImage, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean z10;
        boolean z11;
        boolean zA3;
        boolean zA4;
        boolean z12;
        boolean zA5;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean zA6;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zA7;
        boolean z20;
        boolean zA8;
        boolean zA9;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean zA10;
        boolean zA11;
        boolean zA12;
        boolean zA13;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean zG;
        boolean z28;
        if (divImage == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divImage.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divImage.q() == null;
        }
        if (!zA) {
            return false;
        }
        DivAction divAction = this.f47551b;
        if (divAction != null) {
            zA2 = divAction.a(divImage.f47551b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divImage.f47551b == null;
        }
        if (!zA2 || !this.f47553c.a(divImage.f47553c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f47555d;
        if (list != null) {
            List<DivAction> list2 = divImage.f47555d;
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
            z10 = divImage.f47555d == null;
        }
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divImage.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divImage.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divImage.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divImage.y();
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
            z11 = divImage.y() == null;
        }
        if (!z11) {
            return false;
        }
        DivFadeTransition divFadeTransition = this.f47561i;
        if (divFadeTransition != null) {
            zA3 = divFadeTransition.a(divImage.f47561i, expressionResolver, expressionResolver2);
        } else {
            zA3 = divImage.f47561i == null;
        }
        if (!zA3) {
            return false;
        }
        DivAspect divAspect = this.f47562j;
        if (divAspect != null) {
            zA4 = divAspect.a(divImage.f47562j, expressionResolver, expressionResolver2);
        } else {
            zA4 = divImage.f47562j == null;
        }
        if (!zA4) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divImage.getBackground();
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
            z12 = divImage.getBackground() == null;
        }
        if (!z12) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA5 = divBorderZ.a(divImage.z(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divImage.z() == null;
        }
        if (!zA5 || this.f47565m.evaluate(expressionResolver).booleanValue() != divImage.f47565m.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divImage.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f47567o.evaluate(expressionResolver) != divImage.f47567o.evaluate(expressionResolver2) || this.f47568p.evaluate(expressionResolver) != divImage.f47568p.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divImage.k();
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
            z13 = divImage.k() == null;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f47570r;
        if (list3 != null) {
            List<DivAction> list4 = divImage.f47570r;
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
            z14 = divImage.f47570r == null;
        }
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divImage.getExtensions();
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
            z15 = divImage.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        List<DivFilter> list5 = this.f47572t;
        if (list5 != null) {
            List<DivFilter> list6 = divImage.f47572t;
            if (list6 == null) {
                return false;
            }
            if (list5.size() == list6.size()) {
                Iterator<T> it7 = list5.iterator();
                int i22 = 0;
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            nj.s.u();
                        }
                        if (((DivFilter) next7).a(list6.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divImage.f47572t == null;
        }
        if (!z16) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA6 = divFocusP.a(divImage.p(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divImage.p() == null;
        }
        if (!zA6) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divImage.w();
            if (listW2 == null) {
                return false;
            }
            if (listW.size() == listW2.size()) {
                Iterator<T> it8 = listW.iterator();
                int i24 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            nj.s.u();
                        }
                        if (((DivFunction) next8).a(listW2.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                }
            }
        } else {
            z17 = divImage.w() == null;
        }
        if (!z17 || !getHeight().a(divImage.getHeight(), expressionResolver, expressionResolver2) || this.f47576x.evaluate(expressionResolver).booleanValue() != divImage.f47576x.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list7 = this.f47577y;
        if (list7 != null) {
            List<DivAction> list8 = divImage.f47577y;
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
            z18 = divImage.f47577y == null;
        }
        if (!z18) {
            return false;
        }
        List<DivAction> list9 = this.f47578z;
        if (list9 != null) {
            List<DivAction> list10 = divImage.f47578z;
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
            z19 = divImage.f47578z == null;
        }
        if (!z19 || !ck.p.e(getId(), divImage.getId()) || !ck.p.e(this.B.evaluate(expressionResolver), divImage.B.evaluate(expressionResolver2))) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA7 = divLayoutProviderT.a(divImage.t(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divImage.t() == null;
        }
        if (!zA7) {
            return false;
        }
        List<DivAction> list11 = this.D;
        if (list11 != null) {
            List<DivAction> list12 = divImage.D;
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
            z20 = divImage.D == null;
        }
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA8 = divEdgeInsetsD.a(divImage.d(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divImage.d() == null;
        }
        if (!zA8) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA9 = divEdgeInsetsR.a(divImage.r(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divImage.r() == null;
        }
        if (!zA9 || this.G.evaluate(expressionResolver).intValue() != divImage.G.evaluate(expressionResolver2).intValue() || this.H.evaluate(expressionResolver).booleanValue() != divImage.H.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list13 = this.I;
        if (list13 != null) {
            List<DivAction> list14 = divImage.I;
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
            z21 = divImage.I == null;
        }
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.J;
        if (list15 != null) {
            List<DivAction> list16 = divImage.J;
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
            z22 = divImage.J == null;
        }
        if (!z22) {
            return false;
        }
        Expression<String> expression = this.K;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divImage.K;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divImage.f();
        if (!ck.p.e(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divImage.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.N.evaluate(expressionResolver) != divImage.N.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divImage.s();
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
            z23 = divImage.s() == null;
        }
        if (!z23) {
            return false;
        }
        Expression<Integer> expression3 = this.P;
        Integer numEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Integer> expression4 = divImage.P;
        if (!ck.p.e(numEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || this.Q.evaluate(expressionResolver) != divImage.Q.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divImage.h();
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
            z24 = divImage.h() == null;
        }
        if (!z24) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA10 = divTransformL.a(divImage.l(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divImage.l() == null;
        }
        if (!zA10) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA11 = divChangeTransitionJ.a(divImage.j(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divImage.j() == null;
        }
        if (!zA11) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA12 = divAppearanceTransitionX.a(divImage.x(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divImage.x() == null;
        }
        if (!zA12) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA13 = divAppearanceTransitionI.a(divImage.i(), expressionResolver, expressionResolver2);
        } else {
            zA13 = divImage.i() == null;
        }
        if (!zA13) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divImage.m();
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
            z25 = divImage.m() == null;
        }
        if (!z25) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divImage.u();
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
            z26 = divImage.u() == null;
        }
        if (!z26) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divImage.c();
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
            z27 = divImage.c() == null;
        }
        if (!z27 || getVisibility().evaluate(expressionResolver) != divImage.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divImage.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divImage.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divImage.a();
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
            z28 = divImage.a() == null;
        }
        return z28 && getWidth().a(divImage.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivImage.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivImage a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().X3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f47535f0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47536g0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47537h0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47538i0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f47539j0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47540k0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        Boolean bool = Boolean.FALSE;
        f47541l0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f47542m0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f47543n0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f47544o0 = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f47545p0 = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        f47546q0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47547r0 = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        f47548s0 = new bk.p<ParsingEnvironment, JSONObject, DivImage>() { // from class: com.yandex.div2.DivImage$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImage mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivImage.f47534e0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.f47552b0;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f47566n;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.Y;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.E;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.M;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.L;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f47557e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f47563k;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f47571s;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f47575w;
    }

    @Override // oe.e2
    public String getId() {
        return this.A;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.Z;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.f47554c0;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.R;
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
        int iHash17;
        Integer num = this.f47556d0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivImage.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash18 = 0;
        int iHash19 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        DivAction divAction = this.f47551b;
        int iHash20 = iHash19 + (divAction != null ? divAction.hash() : 0) + this.f47553c.hash();
        List<DivAction> list = this.f47555d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash20 + iHash;
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
        DivFadeTransition divFadeTransition = this.f47561i;
        int iHash21 = i11 + (divFadeTransition != null ? divFadeTransition.hash() : 0);
        DivAspect divAspect = this.f47562j;
        int iHash22 = iHash21 + (divAspect != null ? divAspect.hash() : 0);
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
        int i12 = iHash22 + iHash3;
        DivBorder divBorderZ = z();
        int iHash23 = i12 + (divBorderZ != null ? divBorderZ.hash() : 0) + this.f47565m.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash23 + (expressionB != null ? expressionB.hashCode() : 0) + this.f47567o.hashCode() + this.f47568p.hashCode();
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
        List<DivAction> list2 = this.f47570r;
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
        List<DivFilter> list3 = this.f47572t;
        if (list3 != null) {
            Iterator<T> it7 = list3.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFilter) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i16 = i15 + iHash7;
        DivFocus divFocusP = p();
        int iHash24 = i16 + (divFocusP != null ? divFocusP.hash() : 0);
        List<DivFunction> listW = w();
        if (listW != null) {
            Iterator<T> it8 = listW.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivFunction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHash25 = iHash24 + iHash8 + getHeight().hash() + this.f47576x.hashCode();
        List<DivAction> list4 = this.f47577y;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = iHash25 + iHash9;
        List<DivAction> list5 = this.f47578z;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = i17 + iHash10;
        String id2 = getId();
        int iHashCode5 = i18 + (id2 != null ? id2.hashCode() : 0) + this.B.hashCode();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash26 = iHashCode5 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
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
        int i19 = iHash26 + iHash11;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash27 = i19 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash28 = iHash27 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0) + this.G.hashCode() + this.H.hashCode();
        List<DivAction> list7 = this.I;
        if (list7 != null) {
            Iterator<T> it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivAction) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = iHash28 + iHash12;
        List<DivAction> list8 = this.J;
        if (list8 != null) {
            Iterator<T> it13 = list8.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivAction) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = i20 + iHash13;
        Expression<String> expression = this.K;
        int iHashCode6 = i21 + (expression != null ? expression.hashCode() : 0);
        Expression<String> expressionF = f();
        int iHashCode7 = iHashCode6 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode8 = iHashCode7 + (expressionE != null ? expressionE.hashCode() : 0) + this.N.hashCode();
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it14 = listS.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((DivAction) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = iHashCode8 + iHash14;
        Expression<Integer> expression2 = this.P;
        int iHashCode9 = i22 + (expression2 != null ? expression2.hashCode() : 0) + this.Q.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it15 = listH.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((DivTooltip) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int i23 = iHashCode9 + iHash15;
        DivTransform divTransformL = l();
        int iHash29 = i23 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash30 = iHash29 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash31 = iHash30 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash32 = iHash31 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode10 = iHash32 + (listM != null ? listM.hashCode() : 0);
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it16 = listU.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((DivTrigger) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int i24 = iHashCode10 + iHash16;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it17 = listC.iterator();
            iHash17 = 0;
            while (it17.hasNext()) {
                iHash17 += ((DivVariable) it17.next()).hash();
            }
        } else {
            iHash17 = 0;
        }
        int iHashCode11 = i24 + iHash17 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash33 = iHashCode11 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it18 = listA.iterator();
            while (it18.hasNext()) {
                iHash18 += ((DivVisibilityAction) it18.next()).hash();
            }
        }
        int iHash34 = iHash33 + iHash18 + getWidth().hash();
        this.f47556d0 = Integer.valueOf(iHash34);
        return iHash34;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.V;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.T;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f47569q;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.S;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.W;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f47558f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f47559g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f47573u;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f47549a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.F;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.O;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.C;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.X;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.f47550a0;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f47574v;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.U;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f47560h;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f47564l;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
