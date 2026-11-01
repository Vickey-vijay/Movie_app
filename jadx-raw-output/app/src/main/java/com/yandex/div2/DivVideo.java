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

/* JADX INFO: compiled from: DivVideo.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivVideo implements JSONSerializable, Hashable, oe.e2 {
    public static final a W = new a(null);
    public static final Expression<Double> X;
    public static final Expression<Boolean> Y;
    public static final DivSize.d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Boolean> f49977a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Boolean> f49978b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<Boolean> f49979c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVideoScale> f49980d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Expression<DivVisibility> f49981e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final DivSize.c f49982f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVideo> f49983g0;
    public final Expression<Boolean> A;
    public final Expression<String> B;
    public final Expression<Boolean> C;
    public final List<DivAction> D;
    public final Expression<String> E;
    public final Expression<Long> F;
    public final Expression<DivVideoScale> G;
    public final List<DivAction> H;
    public final List<DivTooltip> I;
    public final DivTransform J;
    public final DivChangeTransition K;
    public final DivAppearanceTransition L;
    public final DivAppearanceTransition M;
    public final List<DivTransitionTrigger> N;
    public final List<DivTrigger> O;
    public final List<DivVariable> P;
    public final List<DivVideoSource> Q;
    public final Expression<DivVisibility> R;
    public final DivVisibilityAction S;
    public final List<DivVisibilityAction> T;
    public final DivSize U;
    public Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f49984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f49985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f49986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f49987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f49988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivAspect f49989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Boolean> f49990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivBackground> f49991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DivBorder f49992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivAction> f49993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Long> f49994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DivDisappearAction> f49995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f49996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivAction> f49997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<DivExtension> f49998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<DivAction> f49999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DivFocus f50000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivFunction> f50001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivSize f50002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f50003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DivLayoutProvider f50004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DivEdgeInsets f50005v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Expression<Boolean> f50006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DivEdgeInsets f50007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<DivAction> f50008y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final JSONObject f50009z;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVideo(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, DivAspect divAspect, Expression<Boolean> expression4, List<? extends DivBackground> list2, DivBorder divBorder, List<DivAction> list3, Expression<Long> expression5, List<DivDisappearAction> list4, String str, List<DivAction> list5, List<DivExtension> list6, List<DivAction> list7, DivFocus divFocus, List<DivFunction> list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Boolean> expression6, DivEdgeInsets divEdgeInsets2, List<DivAction> list9, JSONObject jSONObject, Expression<Boolean> expression7, Expression<String> expression8, Expression<Boolean> expression9, List<DivAction> list10, Expression<String> expression10, Expression<Long> expression11, Expression<DivVideoScale> expression12, List<DivAction> list11, List<DivTooltip> list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list13, List<DivTrigger> list14, List<? extends DivVariable> list15, List<DivVideoSource> list16, Expression<DivVisibility> expression13, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list17, DivSize divSize2) {
        this.f49984a = divAccessibility;
        this.f49985b = expression;
        this.f49986c = expression2;
        this.f49987d = expression3;
        this.f49988e = list;
        this.f49989f = divAspect;
        this.f49990g = expression4;
        this.f49991h = list2;
        this.f49992i = divBorder;
        this.f49993j = list3;
        this.f49994k = expression5;
        this.f49995l = list4;
        this.f49996m = str;
        this.f49997n = list5;
        this.f49998o = list6;
        this.f49999p = list7;
        this.f50000q = divFocus;
        this.f50001r = list8;
        this.f50002s = divSize;
        this.f50003t = str2;
        this.f50004u = divLayoutProvider;
        this.f50005v = divEdgeInsets;
        this.f50006w = expression6;
        this.f50007x = divEdgeInsets2;
        this.f50008y = list9;
        this.f50009z = jSONObject;
        this.A = expression7;
        this.B = expression8;
        this.C = expression9;
        this.D = list10;
        this.E = expression10;
        this.F = expression11;
        this.G = expression12;
        this.H = list11;
        this.I = list12;
        this.J = divTransform;
        this.K = divChangeTransition;
        this.L = divAppearanceTransition;
        this.M = divAppearanceTransition2;
        this.N = list13;
        this.O = list14;
        this.P = list15;
        this.Q = list16;
        this.R = expression13;
        this.S = divVisibilityAction;
        this.T = list17;
        this.U = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivVideo B(DivVideo divVideo, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, DivAspect divAspect, Expression expression4, List list2, DivBorder divBorder, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list13, List list14, List list15, List list16, Expression expression13, DivVisibilityAction divVisibilityAction, List list17, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divVideo.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divVideo.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divVideo.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divVideo.o() : expression3;
        List listY = (i10 & 16) != 0 ? divVideo.y() : list;
        DivAspect divAspect2 = (i10 & 32) != 0 ? divVideo.f49989f : divAspect;
        Expression expression14 = (i10 & 64) != 0 ? divVideo.f49990g : expression4;
        List background = (i10 & 128) != 0 ? divVideo.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 256) != 0 ? divVideo.z() : divBorder;
        List list18 = (i10 & 512) != 0 ? divVideo.f49993j : list3;
        Expression expressionB = (i10 & 1024) != 0 ? divVideo.b() : expression5;
        List listK = (i10 & 2048) != 0 ? divVideo.k() : list4;
        String str3 = (i10 & 4096) != 0 ? divVideo.f49996m : str;
        List list19 = (i10 & 8192) != 0 ? divVideo.f49997n : list5;
        List extensions = (i10 & 16384) != 0 ? divVideo.getExtensions() : list6;
        List list20 = (i10 & 32768) != 0 ? divVideo.f49999p : list7;
        DivFocus divFocusP = (i10 & 65536) != 0 ? divVideo.p() : divFocus;
        List listW = (i10 & 131072) != 0 ? divVideo.w() : list8;
        DivSize height = (i10 & 262144) != 0 ? divVideo.getHeight() : divSize;
        String id2 = (i10 & 524288) != 0 ? divVideo.getId() : str2;
        DivLayoutProvider divLayoutProviderT = (i10 & 1048576) != 0 ? divVideo.t() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 2097152) != 0 ? divVideo.d() : divEdgeInsets;
        List list21 = list20;
        Expression expression15 = (i10 & 4194304) != 0 ? divVideo.f50006w : expression6;
        return divVideo.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, divAspect2, expression14, background, divBorderZ, list18, expressionB, listK, str3, list19, extensions, list21, divFocusP, listW, height, id2, divLayoutProviderT, divEdgeInsetsD, expression15, (i10 & 8388608) != 0 ? divVideo.r() : divEdgeInsets2, (i10 & 16777216) != 0 ? divVideo.f50008y : list9, (i10 & 33554432) != 0 ? divVideo.f50009z : jSONObject, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divVideo.A : expression7, (i10 & 134217728) != 0 ? divVideo.B : expression8, (i10 & 268435456) != 0 ? divVideo.C : expression9, (i10 & 536870912) != 0 ? divVideo.D : list10, (i10 & 1073741824) != 0 ? divVideo.f() : expression10, (i10 & Integer.MIN_VALUE) != 0 ? divVideo.e() : expression11, (i11 & 1) != 0 ? divVideo.G : expression12, (i11 & 2) != 0 ? divVideo.s() : list11, (i11 & 4) != 0 ? divVideo.h() : list12, (i11 & 8) != 0 ? divVideo.l() : divTransform, (i11 & 16) != 0 ? divVideo.j() : divChangeTransition, (i11 & 32) != 0 ? divVideo.x() : divAppearanceTransition, (i11 & 64) != 0 ? divVideo.i() : divAppearanceTransition2, (i11 & 128) != 0 ? divVideo.m() : list13, (i11 & 256) != 0 ? divVideo.u() : list14, (i11 & 512) != 0 ? divVideo.c() : list15, (i11 & 1024) != 0 ? divVideo.Q : list16, (i11 & 2048) != 0 ? divVideo.getVisibility() : expression13, (i11 & 4096) != 0 ? divVideo.v() : divVisibilityAction, (i11 & 8192) != 0 ? divVideo.a() : list17, (i11 & 16384) != 0 ? divVideo.getWidth() : divSize2);
    }

    public final boolean C(DivVideo divVideo, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean z10;
        boolean zA2;
        boolean z11;
        boolean zA3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean zA4;
        boolean z17;
        boolean zA5;
        boolean zA6;
        boolean zA7;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean zG;
        boolean z26;
        if (divVideo == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divVideo.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divVideo.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divVideo.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divVideo.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divVideo.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divVideo.y();
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
            z10 = divVideo.y() == null;
        }
        if (!z10) {
            return false;
        }
        DivAspect divAspect = this.f49989f;
        if (divAspect != null) {
            zA2 = divAspect.a(divVideo.f49989f, expressionResolver, expressionResolver2);
        } else {
            zA2 = divVideo.f49989f == null;
        }
        if (!zA2 || this.f49990g.evaluate(expressionResolver).booleanValue() != divVideo.f49990g.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divVideo.getBackground();
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
            z11 = divVideo.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA3 = divBorderZ.a(divVideo.z(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divVideo.z() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivAction> list = this.f49993j;
        if (list != null) {
            List<DivAction> list2 = divVideo.f49993j;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it3 = list.iterator();
                int i14 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next3).a(list2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                }
            }
        } else {
            z12 = divVideo.f49993j == null;
        }
        if (!z12) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divVideo.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divVideo.k();
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
            z13 = divVideo.k() == null;
        }
        if (!z13 || !ck.p.e(this.f49996m, divVideo.f49996m)) {
            return false;
        }
        List<DivAction> list3 = this.f49997n;
        if (list3 != null) {
            List<DivAction> list4 = divVideo.f49997n;
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
            z14 = divVideo.f49997n == null;
        }
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divVideo.getExtensions();
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
            z15 = divVideo.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        List<DivAction> list5 = this.f49999p;
        if (list5 != null) {
            List<DivAction> list6 = divVideo.f49999p;
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
                        if (((DivAction) next7).a(list6.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divVideo.f49999p == null;
        }
        if (!z16) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA4 = divFocusP.a(divVideo.p(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divVideo.p() == null;
        }
        if (!zA4) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divVideo.w();
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
            z17 = divVideo.w() == null;
        }
        if (!z17 || !getHeight().a(divVideo.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divVideo.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA5 = divLayoutProviderT.a(divVideo.t(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divVideo.t() == null;
        }
        if (!zA5) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA6 = divEdgeInsetsD.a(divVideo.d(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divVideo.d() == null;
        }
        if (!zA6 || this.f50006w.evaluate(expressionResolver).booleanValue() != divVideo.f50006w.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA7 = divEdgeInsetsR.a(divVideo.r(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divVideo.r() == null;
        }
        if (!zA7) {
            return false;
        }
        List<DivAction> list7 = this.f50008y;
        if (list7 != null) {
            List<DivAction> list8 = divVideo.f50008y;
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
            z18 = divVideo.f50008y == null;
        }
        if (!z18 || !ck.p.e(this.f50009z, divVideo.f50009z) || this.A.evaluate(expressionResolver).booleanValue() != divVideo.A.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expression = this.B;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divVideo.B;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.C.evaluate(expressionResolver).booleanValue() != divVideo.C.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list9 = this.D;
        if (list9 != null) {
            List<DivAction> list10 = divVideo.D;
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
            z19 = divVideo.D == null;
        }
        if (!z19) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate2 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divVideo.f();
        if (!ck.p.e(strEvaluate2, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divVideo.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.G.evaluate(expressionResolver) != divVideo.G.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divVideo.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it11 = listS.iterator();
                int i30 = 0;
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next11).a(listS2.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                }
            }
        } else {
            z20 = divVideo.s() == null;
        }
        if (!z20) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divVideo.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it12 = listH.iterator();
                int i32 = 0;
                while (true) {
                    if (it12.hasNext()) {
                        Object next12 = it12.next();
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next12).a(listH2.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                }
            }
        } else {
            z21 = divVideo.h() == null;
        }
        if (!z21) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA8 = divTransformL.a(divVideo.l(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divVideo.l() == null;
        }
        if (!zA8) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA9 = divChangeTransitionJ.a(divVideo.j(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divVideo.j() == null;
        }
        if (!zA9) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA10 = divAppearanceTransitionX.a(divVideo.x(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divVideo.x() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA11 = divAppearanceTransitionI.a(divVideo.i(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divVideo.i() == null;
        }
        if (!zA11) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divVideo.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it13 = listM.iterator();
                int i34 = 0;
                while (true) {
                    if (it13.hasNext()) {
                        Object next13 = it13.next();
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next13) == listM2.get(i34)) {
                            i34 = i35;
                        }
                    }
                }
            }
        } else {
            z22 = divVideo.m() == null;
        }
        if (!z22) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divVideo.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it14 = listU.iterator();
                int i36 = 0;
                while (true) {
                    if (it14.hasNext()) {
                        Object next14 = it14.next();
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next14).a(listU2.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                }
            }
        } else {
            z23 = divVideo.u() == null;
        }
        if (!z23) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divVideo.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it15 = listC.iterator();
                int i38 = 0;
                while (true) {
                    if (it15.hasNext()) {
                        Object next15 = it15.next();
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next15).a(listC2.get(i38), expressionResolver, expressionResolver2)) {
                            i38 = i39;
                        }
                    }
                }
            }
        } else {
            z24 = divVideo.c() == null;
        }
        if (!z24) {
            return false;
        }
        List<DivVideoSource> list11 = this.Q;
        List<DivVideoSource> list12 = divVideo.Q;
        if (list11.size() == list12.size()) {
            Iterator<T> it16 = list11.iterator();
            int i40 = 0;
            while (true) {
                if (!it16.hasNext()) {
                    z25 = true;
                    break;
                }
                Object next16 = it16.next();
                int i41 = i40 + 1;
                if (i40 < 0) {
                    nj.s.u();
                }
                if (!((DivVideoSource) next16).a(list12.get(i40), expressionResolver, expressionResolver2)) {
                    z25 = false;
                    break;
                }
                i40 = i41;
            }
        } else {
            z25 = false;
            break;
        }
        if (!z25 || getVisibility().evaluate(expressionResolver) != divVideo.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divVideo.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divVideo.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divVideo.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it17 = listA.iterator();
                int i42 = 0;
                while (true) {
                    if (it17.hasNext()) {
                        Object next17 = it17.next();
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next17).g(listA2.get(i42), expressionResolver, expressionResolver2)) {
                            i42 = i43;
                        }
                    }
                }
            }
        } else {
            z26 = divVideo.a() == null;
        }
        return z26 && getWidth().a(divVideo.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivVideo.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivVideo a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        X = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f49977a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49978b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49979c0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49980d0 = Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        f49981e0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f49982f0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        f49983g0 = new bk.p<ParsingEnvironment, JSONObject, DivVideo>() { // from class: com.yandex.div2.DivVideo$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideo mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivVideo.W.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public final DivVideo A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, DivAspect divAspect, Expression<Boolean> expression4, List<? extends DivBackground> list2, DivBorder divBorder, List<DivAction> list3, Expression<Long> expression5, List<DivDisappearAction> list4, String str, List<DivAction> list5, List<DivExtension> list6, List<DivAction> list7, DivFocus divFocus, List<DivFunction> list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Boolean> expression6, DivEdgeInsets divEdgeInsets2, List<DivAction> list9, JSONObject jSONObject, Expression<Boolean> expression7, Expression<String> expression8, Expression<Boolean> expression9, List<DivAction> list10, Expression<String> expression10, Expression<Long> expression11, Expression<DivVideoScale> expression12, List<DivAction> list11, List<DivTooltip> list12, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list13, List<DivTrigger> list14, List<? extends DivVariable> list15, List<DivVideoSource> list16, Expression<DivVisibility> expression13, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list17, DivSize divSize2) {
        return new DivVideo(divAccessibility, expression, expression2, expression3, list, divAspect, expression4, list2, divBorder, list3, expression5, list4, str, list5, list6, list7, divFocus, list8, divSize, str2, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, list9, jSONObject, expression7, expression8, expression9, list10, expression10, expression11, expression12, list11, list12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list13, list14, list15, list16, expression13, divVisibilityAction, list17, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.T;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f49994k;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.P;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f50005v;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.F;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.E;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f49985b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f49991h;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f49998o;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f50002s;
    }

    @Override // oe.e2
    public String getId() {
        return this.f50003t;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.R;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.U;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.I;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivVideo.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash15 = 0;
        int iHash16 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash16 + (expressionG != null ? expressionG.hashCode() : 0);
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
        DivAspect divAspect = this.f49989f;
        int iHash17 = i10 + (divAspect != null ? divAspect.hash() : 0) + this.f49990g.hashCode();
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
        int i11 = iHash17 + iHash2;
        DivBorder divBorderZ = z();
        int iHash18 = i11 + (divBorderZ != null ? divBorderZ.hash() : 0);
        List<DivAction> list = this.f49993j;
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivAction) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHash18 + iHash3;
        Expression<Long> expressionB = b();
        int iHashCode4 = i12 + (expressionB != null ? expressionB.hashCode() : 0);
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
        String str = this.f49996m;
        int iHashCode5 = i13 + (str != null ? str.hashCode() : 0);
        List<DivAction> list2 = this.f49997n;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = iHashCode5 + iHash5;
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
        List<DivAction> list3 = this.f49999p;
        if (list3 != null) {
            Iterator<T> it7 = list3.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivAction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i16 = i15 + iHash7;
        DivFocus divFocusP = p();
        int iHash19 = i16 + (divFocusP != null ? divFocusP.hash() : 0);
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
        int iHash20 = iHash19 + iHash8 + getHeight().hash();
        String id2 = getId();
        int iHashCode6 = iHash20 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderT = t();
        int iHash21 = iHashCode6 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash22 = iHash21 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f50006w.hashCode();
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash23 = iHash22 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        List<DivAction> list4 = this.f50008y;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = iHash23 + iHash9;
        JSONObject jSONObject = this.f50009z;
        int iHashCode7 = i17 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.A.hashCode();
        Expression<String> expression = this.B;
        int iHashCode8 = iHashCode7 + (expression != null ? expression.hashCode() : 0) + this.C.hashCode();
        List<DivAction> list5 = this.D;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHashCode8 + iHash10;
        Expression<String> expressionF = f();
        int iHashCode9 = i18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode10 = iHashCode9 + (expressionE != null ? expressionE.hashCode() : 0) + this.G.hashCode();
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it11 = listS.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHashCode10 + iHash11;
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it12 = listH.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivTooltip) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = i19 + iHash12;
        DivTransform divTransformL = l();
        int iHash24 = i20 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash25 = iHash24 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash26 = iHash25 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash27 = iHash26 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode11 = iHash27 + (listM != null ? listM.hashCode() : 0);
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it13 = listU.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivTrigger) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = iHashCode11 + iHash13;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it14 = listC.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((DivVariable) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        Iterator<T> it15 = this.Q.iterator();
        int iHash28 = 0;
        while (it15.hasNext()) {
            iHash28 += ((DivVideoSource) it15.next()).hash();
        }
        int iHashCode12 = i22 + iHash28 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash29 = iHashCode12 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it16 = listA.iterator();
            while (it16.hasNext()) {
                iHash15 += ((DivVisibilityAction) it16.next()).hash();
            }
        }
        int iHash30 = iHash29 + iHash15 + getWidth().hash();
        this.V = Integer.valueOf(iHash30);
        return iHash30;
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
        return this.f49995l;
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
        return this.f49986c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f49987d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f50000q;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f49984a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f50007x;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.H;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f50004u;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.O;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.S;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f50001r;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.L;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f49988e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f49992i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
