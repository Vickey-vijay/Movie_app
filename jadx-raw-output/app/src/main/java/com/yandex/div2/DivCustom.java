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

/* JADX INFO: compiled from: DivCustom.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCustom implements JSONSerializable, Hashable, oe.e2 {
    public static final a L = new a(null);
    public static final Expression<Double> M;
    public static final DivSize.d N;
    public static final Expression<DivVisibility> O;
    public static final DivSize.c P;
    public static final bk.p<ParsingEnvironment, JSONObject, DivCustom> Q;
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
    public Integer K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f46865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f46866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f46867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f46868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f46869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f46870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f46871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f46872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final JSONObject f46873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f46874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DivDisappearAction> f46875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DivExtension> f46876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DivFocus f46877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivFunction> f46878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DivSize f46879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f46880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<Div> f46881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DivLayoutProvider f46882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivEdgeInsets f46883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DivEdgeInsets f46884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<String> f46885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Expression<Long> f46886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<DivAction> f46887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<DivTooltip> f46888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DivTransform f46889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivChangeTransition f46890z;

    /* JADX WARN: Multi-variable type inference failed */
    public DivCustom(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, JSONObject jSONObject, String str, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str2, List<? extends Div> list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<String> expression5, Expression<Long> expression6, List<DivAction> list7, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression7, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        this.f46865a = divAccessibility;
        this.f46866b = expression;
        this.f46867c = expression2;
        this.f46868d = expression3;
        this.f46869e = list;
        this.f46870f = list2;
        this.f46871g = divBorder;
        this.f46872h = expression4;
        this.f46873i = jSONObject;
        this.f46874j = str;
        this.f46875k = list3;
        this.f46876l = list4;
        this.f46877m = divFocus;
        this.f46878n = list5;
        this.f46879o = divSize;
        this.f46880p = str2;
        this.f46881q = list6;
        this.f46882r = divLayoutProvider;
        this.f46883s = divEdgeInsets;
        this.f46884t = divEdgeInsets2;
        this.f46885u = expression5;
        this.f46886v = expression6;
        this.f46887w = list7;
        this.f46888x = list8;
        this.f46889y = divTransform;
        this.f46890z = divChangeTransition;
        this.A = divAppearanceTransition;
        this.B = divAppearanceTransition2;
        this.C = list9;
        this.D = list10;
        this.E = list11;
        this.F = expression7;
        this.G = divVisibilityAction;
        this.H = list12;
        this.I = divSize2;
    }

    public final boolean C(DivCustom divCustom, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean z10;
        boolean z11;
        boolean zA2;
        boolean z12;
        boolean z13;
        boolean zA3;
        boolean z14;
        boolean z15;
        boolean zA4;
        boolean zA5;
        boolean zA6;
        boolean z16;
        boolean z17;
        boolean zA7;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean zG;
        boolean z21;
        if (divCustom == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divCustom.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divCustom.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divCustom.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divCustom.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divCustom.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divCustom.y();
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
            z10 = divCustom.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divCustom.getBackground();
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
            z11 = divCustom.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divCustom.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divCustom.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divCustom.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || !ck.p.e(this.f46873i, divCustom.f46873i) || !ck.p.e(this.f46874j, divCustom.f46874j)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divCustom.k();
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
            z12 = divCustom.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divCustom.getExtensions();
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
            z13 = divCustom.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divCustom.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divCustom.p() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divCustom.w();
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
            z14 = divCustom.w() == null;
        }
        if (!z14 || !getHeight().a(divCustom.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divCustom.getId())) {
            return false;
        }
        List<Div> list = this.f46881q;
        if (list != null) {
            List<Div> list2 = divCustom.f46881q;
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
            z15 = divCustom.f46881q == null;
        }
        if (!z15) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA4 = divLayoutProviderT.a(divCustom.t(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divCustom.t() == null;
        }
        if (!zA4) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA5 = divEdgeInsetsD.a(divCustom.d(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divCustom.d() == null;
        }
        if (!zA5) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA6 = divEdgeInsetsR.a(divCustom.r(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divCustom.r() == null;
        }
        if (!zA6) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divCustom.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divCustom.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divCustom.s();
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
            z16 = divCustom.s() == null;
        }
        if (!z16) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divCustom.h();
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
            z17 = divCustom.h() == null;
        }
        if (!z17) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA7 = divTransformL.a(divCustom.l(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divCustom.l() == null;
        }
        if (!zA7) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA8 = divChangeTransitionJ.a(divCustom.j(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divCustom.j() == null;
        }
        if (!zA8) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA9 = divAppearanceTransitionX.a(divCustom.x(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divCustom.x() == null;
        }
        if (!zA9) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA10 = divAppearanceTransitionI.a(divCustom.i(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divCustom.i() == null;
        }
        if (!zA10) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divCustom.m();
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
            z18 = divCustom.m() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divCustom.u();
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
            z19 = divCustom.u() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divCustom.c();
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
            z20 = divCustom.c() == null;
        }
        if (!z20 || getVisibility().evaluate(expressionResolver) != divCustom.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divCustom.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divCustom.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divCustom.a();
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
            z21 = divCustom.a() == null;
        }
        return z21 && getWidth().a(divCustom.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivCustom.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCustom a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        M = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        N = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        O = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        P = new DivSize.c(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        Q = new bk.p<ParsingEnvironment, JSONObject, DivCustom>() { // from class: com.yandex.div2.DivCustom$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCustom mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivCustom.L.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public final DivCustom A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, JSONObject jSONObject, String str, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str2, List<? extends Div> list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<String> expression5, Expression<Long> expression6, List<DivAction> list7, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression7, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        return new DivCustom(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, jSONObject, str, list3, list4, divFocus, list5, divSize, str2, list6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression5, expression6, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression7, divVisibilityAction, list12, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.H;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f46872h;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.E;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f46883s;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.f46886v;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.f46885u;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f46866b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f46870f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f46876l;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f46879o;
    }

    @Override // oe.e2
    public String getId() {
        return this.f46880p;
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
        return this.f46888x;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.K;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<Div> list = this.f46881q;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((Div) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.K = Integer.valueOf(i10);
        return i10;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.B;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.f46890z;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f46875k;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.f46889y;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.C;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f46867c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f46868d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f46877m;
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
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivCustom.class).hashCode();
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
        JSONObject jSONObject = this.f46873i;
        int iHashCode5 = iHashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.f46874j.hashCode();
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
        int i12 = iHashCode5 + iHash3;
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
        int iHashCode6 = iHash14 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderT = t();
        int iHash15 = iHashCode6 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash16 = iHash15 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash17 = iHash16 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
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
    public DivAccessibility q() {
        return this.f46865a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f46884t;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.f46887w;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f46882r;
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
        return this.f46878n;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.A;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f46869e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f46871g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
