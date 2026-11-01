package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSwitch.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSwitch implements JSONSerializable, Hashable, oe.e2 {
    public static final a K = new a(null);
    public static final Expression<Double> L;
    public static final DivSize.d M;
    public static final Expression<Boolean> N;
    public static final Expression<DivVisibility> O;
    public static final DivSize.c P;
    public static final bk.p<ParsingEnvironment, JSONObject, DivSwitch> Q;
    public final DivAppearanceTransition A;
    public final DivAppearanceTransition B;
    public final List<DivTransitionTrigger> C;
    public final List<DivTrigger> D;
    public final List<DivVariable> E;
    public final Expression<DivVisibility> F;
    public final DivVisibilityAction G;
    public final List<DivVisibilityAction> H;
    public final DivSize I;
    public Integer J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f49173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f49174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f49175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f49176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f49177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f49178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f49179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f49180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivDisappearAction> f49181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivExtension> f49182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivFocus f49183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DivFunction> f49184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DivSize f49185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f49186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<Boolean> f49187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f49188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DivLayoutProvider f49189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DivEdgeInsets f49190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression<Integer> f49191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DivEdgeInsets f49192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<String> f49193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Expression<Long> f49194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<DivAction> f49195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<DivTooltip> f49196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DivTransform f49197y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivChangeTransition f49198z;

    /* JADX WARN: Multi-variable type inference failed */
    public DivSwitch(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Boolean> expression5, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Integer> expression6, DivEdgeInsets divEdgeInsets2, Expression<String> expression7, Expression<Long> expression8, List<DivAction> list6, List<DivTooltip> list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list8, List<DivTrigger> list9, List<? extends DivVariable> list10, Expression<DivVisibility> expression9, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list11, DivSize divSize2) {
        this.f49173a = divAccessibility;
        this.f49174b = expression;
        this.f49175c = expression2;
        this.f49176d = expression3;
        this.f49177e = list;
        this.f49178f = list2;
        this.f49179g = divBorder;
        this.f49180h = expression4;
        this.f49181i = list3;
        this.f49182j = list4;
        this.f49183k = divFocus;
        this.f49184l = list5;
        this.f49185m = divSize;
        this.f49186n = str;
        this.f49187o = expression5;
        this.f49188p = str2;
        this.f49189q = divLayoutProvider;
        this.f49190r = divEdgeInsets;
        this.f49191s = expression6;
        this.f49192t = divEdgeInsets2;
        this.f49193u = expression7;
        this.f49194v = expression8;
        this.f49195w = list6;
        this.f49196x = list7;
        this.f49197y = divTransform;
        this.f49198z = divChangeTransition;
        this.A = divAppearanceTransition;
        this.B = divAppearanceTransition2;
        this.C = list8;
        this.D = list9;
        this.E = list10;
        this.F = expression9;
        this.G = divVisibilityAction;
        this.H = list11;
        this.I = divSize2;
    }

    public final boolean C(DivSwitch divSwitch, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean z10;
        boolean z11;
        boolean zA2;
        boolean z12;
        boolean z13;
        boolean zA3;
        boolean z14;
        boolean zA4;
        boolean zA5;
        boolean zA6;
        boolean z15;
        boolean z16;
        boolean zA7;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zG;
        boolean z20;
        if (divSwitch == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divSwitch.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divSwitch.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSwitch.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divSwitch.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divSwitch.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divSwitch.y();
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
            z10 = divSwitch.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSwitch.getBackground();
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
            z11 = divSwitch.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divSwitch.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divSwitch.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSwitch.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSwitch.k();
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
            z12 = divSwitch.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSwitch.getExtensions();
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
            z13 = divSwitch.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divSwitch.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divSwitch.p() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divSwitch.w();
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
            z14 = divSwitch.w() == null;
        }
        if (!z14 || !getHeight().a(divSwitch.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divSwitch.getId()) || this.f49187o.evaluate(expressionResolver).booleanValue() != divSwitch.f49187o.evaluate(expressionResolver2).booleanValue() || !ck.p.e(this.f49188p, divSwitch.f49188p)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA4 = divLayoutProviderT.a(divSwitch.t(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divSwitch.t() == null;
        }
        if (!zA4) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA5 = divEdgeInsetsD.a(divSwitch.d(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divSwitch.d() == null;
        }
        if (!zA5) {
            return false;
        }
        Expression<Integer> expression = this.f49191s;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divSwitch.f49191s;
        if (!ck.p.e(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA6 = divEdgeInsetsR.a(divSwitch.r(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divSwitch.r() == null;
        }
        if (!zA6) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSwitch.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSwitch.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divSwitch.s();
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
            z15 = divSwitch.s() == null;
        }
        if (!z15) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSwitch.h();
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
            z16 = divSwitch.h() == null;
        }
        if (!z16) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA7 = divTransformL.a(divSwitch.l(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divSwitch.l() == null;
        }
        if (!zA7) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA8 = divChangeTransitionJ.a(divSwitch.j(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divSwitch.j() == null;
        }
        if (!zA8) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA9 = divAppearanceTransitionX.a(divSwitch.x(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divSwitch.x() == null;
        }
        if (!zA9) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA10 = divAppearanceTransitionI.a(divSwitch.i(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divSwitch.i() == null;
        }
        if (!zA10) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divSwitch.m();
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
            z17 = divSwitch.m() == null;
        }
        if (!z17) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divSwitch.u();
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
            z18 = divSwitch.u() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSwitch.c();
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
            z19 = divSwitch.c() == null;
        }
        if (!z19 || getVisibility().evaluate(expressionResolver) != divSwitch.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divSwitch.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divSwitch.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSwitch.a();
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
            z20 = divSwitch.a() == null;
        }
        return z20 && getWidth().a(divSwitch.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivSwitch.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSwitch a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        L = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        M = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        N = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        O = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        P = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        Q = new bk.p<ParsingEnvironment, JSONObject, DivSwitch>() { // from class: com.yandex.div2.DivSwitch$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSwitch mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSwitch.K.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public final DivSwitch A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Boolean> expression5, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Integer> expression6, DivEdgeInsets divEdgeInsets2, Expression<String> expression7, Expression<Long> expression8, List<DivAction> list6, List<DivTooltip> list7, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list8, List<DivTrigger> list9, List<? extends DivVariable> list10, Expression<DivVisibility> expression9, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list11, DivSize divSize2) {
        return new DivSwitch(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, str2, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, expression7, expression8, list6, list7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list8, list9, list10, expression9, divVisibilityAction, list11, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.H;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f49180h;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.E;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f49190r;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.f49194v;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.f49193u;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f49174b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f49178f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f49182j;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f49185m;
    }

    @Override // oe.e2
    public String getId() {
        return this.f49186n;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.F;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.I;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.f49196x;
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
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSwitch.class).hashCode();
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
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash12 + (expressionB != null ? expressionB.hashCode() : 0);
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
        int iHashCode5 = iHash14 + (id2 != null ? id2.hashCode() : 0) + this.f49187o.hashCode() + this.f49188p.hashCode();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash15 = iHashCode5 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash16 = iHash15 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        Expression<Integer> expression = this.f49191s;
        int iHashCode6 = iHash16 + (expression != null ? expression.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash17 = iHashCode6 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        Expression<String> expressionF = f();
        int iHashCode7 = iHash17 + (expressionF != null ? expressionF.hashCode() : 0);
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
        int i14 = iHashCode8 + iHash6;
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
        int iHash18 = i15 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash19 = iHash18 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash20 = iHash19 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash21 = iHash20 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode9 = iHash21 + (listM != null ? listM.hashCode() : 0);
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
        int i16 = iHashCode9 + iHash8;
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
        int iHashCode10 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash22 = iHashCode10 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash23 = iHash22 + iHash10 + getWidth().hash();
        this.J = Integer.valueOf(iHash23);
        return iHash23;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.B;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.f49198z;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f49181i;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.f49197y;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.C;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f49175c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f49176d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f49183k;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f49173a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f49192t;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.f49195w;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f49189q;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.D;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.G;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f49184l;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.A;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f49177e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f49179g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
