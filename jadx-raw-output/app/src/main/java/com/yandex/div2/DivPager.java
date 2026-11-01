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

/* JADX INFO: compiled from: DivPager.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivPager implements JSONSerializable, Hashable, oe.e2 {
    public static final a T = new a(null);
    public static final Expression<Double> U;
    public static final Expression<ItemAlignment> V;
    public static final Expression<Long> W;
    public static final DivSize.d X;
    public static final Expression<Boolean> Y;
    public static final DivFixedSize Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Orientation> f48235a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Boolean> f48236b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<ItemAlignment> f48237c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Expression<DivVisibility> f48238d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final DivSize.c f48239e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPager> f48240f0;
    public final Expression<Boolean> A;
    public final Expression<String> B;
    public final Expression<Long> C;
    public final Expression<ItemAlignment> D;
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
    public final DivAccessibility f48241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f48242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f48243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f48244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f48245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f48246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f48247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f48248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<ItemAlignment> f48249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Long> f48250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DivDisappearAction> f48251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DivExtension> f48252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DivFocus f48253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivFunction> f48254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DivSize f48255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f48256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Expression<Boolean> f48257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DivCollectionItemBuilder f48258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivFixedSize f48259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<Div> f48260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DivPagerLayoutMode f48261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DivLayoutProvider f48262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivEdgeInsets f48263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression<Orientation> f48264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DivEdgeInsets f48265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivPageTransformation f48266z;

    /* JADX INFO: compiled from: DivPager.kt */
    public enum ItemAlignment {
        START("start"),
        CENTER("center"),
        END("end");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<ItemAlignment, String> TO_STRING = new bk.l<ItemAlignment, String>() { // from class: com.yandex.div2.DivPager$ItemAlignment$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivPager.ItemAlignment itemAlignment) {
                return DivPager.ItemAlignment.Converter.b(itemAlignment);
            }
        };
        public static final bk.l<String, ItemAlignment> FROM_STRING = new bk.l<String, ItemAlignment>() { // from class: com.yandex.div2.DivPager$ItemAlignment$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivPager.ItemAlignment invoke(String str) {
                return DivPager.ItemAlignment.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivPager.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final ItemAlignment a(String str) {
                ItemAlignment itemAlignment = ItemAlignment.START;
                if (ck.p.e(str, itemAlignment.value)) {
                    return itemAlignment;
                }
                ItemAlignment itemAlignment2 = ItemAlignment.CENTER;
                if (ck.p.e(str, itemAlignment2.value)) {
                    return itemAlignment2;
                }
                ItemAlignment itemAlignment3 = ItemAlignment.END;
                if (ck.p.e(str, itemAlignment3.value)) {
                    return itemAlignment3;
                }
                return null;
            }

            public final String b(ItemAlignment itemAlignment) {
                return itemAlignment.value;
            }
        }

        ItemAlignment(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivPager.kt */
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Orientation, String> TO_STRING = new bk.l<Orientation, String>() { // from class: com.yandex.div2.DivPager$Orientation$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivPager.Orientation orientation) {
                return DivPager.Orientation.Converter.b(orientation);
            }
        };
        public static final bk.l<String, Orientation> FROM_STRING = new bk.l<String, Orientation>() { // from class: com.yandex.div2.DivPager$Orientation$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivPager.Orientation invoke(String str) {
                return DivPager.Orientation.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivPager.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    public DivPager(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, Expression<ItemAlignment> expression5, Expression<Long> expression6, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Boolean> expression7, DivCollectionItemBuilder divCollectionItemBuilder, DivFixedSize divFixedSize, List<? extends Div> list6, DivPagerLayoutMode divPagerLayoutMode, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Orientation> expression8, DivEdgeInsets divEdgeInsets2, DivPageTransformation divPageTransformation, Expression<Boolean> expression9, Expression<String> expression10, Expression<Long> expression11, Expression<ItemAlignment> expression12, List<DivAction> list7, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression13, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        this.f48241a = divAccessibility;
        this.f48242b = expression;
        this.f48243c = expression2;
        this.f48244d = expression3;
        this.f48245e = list;
        this.f48246f = list2;
        this.f48247g = divBorder;
        this.f48248h = expression4;
        this.f48249i = expression5;
        this.f48250j = expression6;
        this.f48251k = list3;
        this.f48252l = list4;
        this.f48253m = divFocus;
        this.f48254n = list5;
        this.f48255o = divSize;
        this.f48256p = str;
        this.f48257q = expression7;
        this.f48258r = divCollectionItemBuilder;
        this.f48259s = divFixedSize;
        this.f48260t = list6;
        this.f48261u = divPagerLayoutMode;
        this.f48262v = divLayoutProvider;
        this.f48263w = divEdgeInsets;
        this.f48264x = expression8;
        this.f48265y = divEdgeInsets2;
        this.f48266z = divPageTransformation;
        this.A = expression9;
        this.B = expression10;
        this.C = expression11;
        this.D = expression12;
        this.E = list7;
        this.F = list8;
        this.G = divTransform;
        this.H = divChangeTransition;
        this.I = divAppearanceTransition;
        this.J = divAppearanceTransition2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression13;
        this.O = divVisibilityAction;
        this.P = list12;
        this.Q = divSize2;
    }

    public final boolean C(DivPager divPager, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean zA8;
        boolean z16;
        boolean z17;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean zA12;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean zG;
        boolean z21;
        if (divPager == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divPager.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divPager.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divPager.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divPager.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divPager.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divPager.y();
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
            z10 = divPager.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divPager.getBackground();
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
            z11 = divPager.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divPager.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divPager.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divPager.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null) || this.f48249i.evaluate(expressionResolver) != divPager.f48249i.evaluate(expressionResolver2) || this.f48250j.evaluate(expressionResolver).longValue() != divPager.f48250j.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divPager.k();
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
            z12 = divPager.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divPager.getExtensions();
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
            z13 = divPager.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divPager.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divPager.p() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divPager.w();
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
            z14 = divPager.w() == null;
        }
        if (!z14 || !getHeight().a(divPager.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divPager.getId()) || this.f48257q.evaluate(expressionResolver).booleanValue() != divPager.f48257q.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = this.f48258r;
        if (divCollectionItemBuilder != null) {
            zA4 = divCollectionItemBuilder.a(divPager.f48258r, expressionResolver, expressionResolver2);
        } else {
            zA4 = divPager.f48258r == null;
        }
        if (!zA4 || !this.f48259s.a(divPager.f48259s, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<Div> list = this.f48260t;
        if (list != null) {
            List<Div> list2 = divPager.f48260t;
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
            z15 = divPager.f48260t == null;
        }
        if (!z15 || !this.f48261u.a(divPager.f48261u, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA5 = divLayoutProviderT.a(divPager.t(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divPager.t() == null;
        }
        if (!zA5) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA6 = divEdgeInsetsD.a(divPager.d(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divPager.d() == null;
        }
        if (!zA6 || this.f48264x.evaluate(expressionResolver) != divPager.f48264x.evaluate(expressionResolver2)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA7 = divEdgeInsetsR.a(divPager.r(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divPager.r() == null;
        }
        if (!zA7) {
            return false;
        }
        DivPageTransformation divPageTransformation = this.f48266z;
        if (divPageTransformation != null) {
            zA8 = divPageTransformation.a(divPager.f48266z, expressionResolver, expressionResolver2);
        } else {
            zA8 = divPager.f48266z == null;
        }
        if (!zA8 || this.A.evaluate(expressionResolver).booleanValue() != divPager.A.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divPager.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divPager.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.D.evaluate(expressionResolver) != divPager.D.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divPager.s();
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
            z16 = divPager.s() == null;
        }
        if (!z16) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divPager.h();
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
            z17 = divPager.h() == null;
        }
        if (!z17) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA9 = divTransformL.a(divPager.l(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divPager.l() == null;
        }
        if (!zA9) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA10 = divChangeTransitionJ.a(divPager.j(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divPager.j() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA11 = divAppearanceTransitionX.a(divPager.x(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divPager.x() == null;
        }
        if (!zA11) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA12 = divAppearanceTransitionI.a(divPager.i(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divPager.i() == null;
        }
        if (!zA12) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divPager.m();
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
            z18 = divPager.m() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divPager.u();
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
            z19 = divPager.u() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divPager.c();
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
            z20 = divPager.c() == null;
        }
        if (!z20 || getVisibility().evaluate(expressionResolver) != divPager.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divPager.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divPager.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divPager.a();
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
            z21 = divPager.a() == null;
        }
        return z21 && getWidth().a(divPager.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivPager.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPager a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, ItemAlignment.START, null, 2, null);
        W = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        f48235a0 = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        f48236b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f48237c0 = Expression.Companion.constant$default(companion, ItemAlignment.CENTER, null, 2, null);
        f48238d0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f48239e0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f48240f0 = new bk.p<ParsingEnvironment, JSONObject, DivPager>() { // from class: com.yandex.div2.DivPager$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPager mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivPager.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivPager B(DivPager divPager, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression7, DivCollectionItemBuilder divCollectionItemBuilder, DivFixedSize divFixedSize, List list6, DivPagerLayoutMode divPagerLayoutMode, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression8, DivEdgeInsets divEdgeInsets2, DivPageTransformation divPageTransformation, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divPager.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divPager.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divPager.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divPager.o() : expression3;
        List listY = (i10 & 16) != 0 ? divPager.y() : list;
        List background = (i10 & 32) != 0 ? divPager.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 64) != 0 ? divPager.z() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divPager.b() : expression4;
        Expression expression14 = (i10 & 256) != 0 ? divPager.f48249i : expression5;
        Expression expression15 = (i10 & 512) != 0 ? divPager.f48250j : expression6;
        List listK = (i10 & 1024) != 0 ? divPager.k() : list3;
        List extensions = (i10 & 2048) != 0 ? divPager.getExtensions() : list4;
        DivFocus divFocusP = (i10 & 4096) != 0 ? divPager.p() : divFocus;
        List listW = (i10 & 8192) != 0 ? divPager.w() : list5;
        DivSize height = (i10 & 16384) != 0 ? divPager.getHeight() : divSize;
        String id2 = (i10 & 32768) != 0 ? divPager.getId() : str;
        DivSize divSize3 = height;
        Expression expression16 = (i10 & 65536) != 0 ? divPager.f48257q : expression7;
        DivCollectionItemBuilder divCollectionItemBuilder2 = (i10 & 131072) != 0 ? divPager.f48258r : divCollectionItemBuilder;
        DivFixedSize divFixedSize2 = (i10 & 262144) != 0 ? divPager.f48259s : divFixedSize;
        List list13 = (i10 & 524288) != 0 ? divPager.f48260t : list6;
        DivPagerLayoutMode divPagerLayoutMode2 = (i10 & 1048576) != 0 ? divPager.f48261u : divPagerLayoutMode;
        DivLayoutProvider divLayoutProviderT = (i10 & 2097152) != 0 ? divPager.t() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 4194304) != 0 ? divPager.d() : divEdgeInsets;
        DivPagerLayoutMode divPagerLayoutMode3 = divPagerLayoutMode2;
        Expression expression17 = (i10 & 8388608) != 0 ? divPager.f48264x : expression8;
        return divPager.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, background, divBorderZ, expressionB, expression14, expression15, listK, extensions, divFocusP, listW, divSize3, id2, expression16, divCollectionItemBuilder2, divFixedSize2, list13, divPagerLayoutMode3, divLayoutProviderT, divEdgeInsetsD, expression17, (i10 & 16777216) != 0 ? divPager.r() : divEdgeInsets2, (i10 & 33554432) != 0 ? divPager.f48266z : divPageTransformation, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divPager.A : expression9, (i10 & 134217728) != 0 ? divPager.f() : expression10, (i10 & 268435456) != 0 ? divPager.e() : expression11, (i10 & 536870912) != 0 ? divPager.D : expression12, (i10 & 1073741824) != 0 ? divPager.s() : list7, (i10 & Integer.MIN_VALUE) != 0 ? divPager.h() : list8, (i11 & 1) != 0 ? divPager.l() : divTransform, (i11 & 2) != 0 ? divPager.j() : divChangeTransition, (i11 & 4) != 0 ? divPager.x() : divAppearanceTransition, (i11 & 8) != 0 ? divPager.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divPager.m() : list9, (i11 & 32) != 0 ? divPager.u() : list10, (i11 & 64) != 0 ? divPager.c() : list11, (i11 & 128) != 0 ? divPager.getVisibility() : expression13, (i11 & 256) != 0 ? divPager.v() : divVisibilityAction, (i11 & 512) != 0 ? divPager.a() : list12, (i11 & 1024) != 0 ? divPager.getWidth() : divSize2);
    }

    public final DivPager A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, Expression<ItemAlignment> expression5, Expression<Long> expression6, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Boolean> expression7, DivCollectionItemBuilder divCollectionItemBuilder, DivFixedSize divFixedSize, List<? extends Div> list6, DivPagerLayoutMode divPagerLayoutMode, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Orientation> expression8, DivEdgeInsets divEdgeInsets2, DivPageTransformation divPageTransformation, Expression<Boolean> expression9, Expression<String> expression10, Expression<Long> expression11, Expression<ItemAlignment> expression12, List<DivAction> list7, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression13, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        return new DivPager(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, expression5, expression6, list3, list4, divFocus, list5, divSize, str, expression7, divCollectionItemBuilder, divFixedSize, list6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression8, divEdgeInsets2, divPageTransformation, expression9, expression10, expression11, expression12, list7, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression13, divVisibilityAction, list12, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f48248h;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f48263w;
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
        return this.f48242b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f48246f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f48252l;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f48255o;
    }

    @Override // oe.e2
    public String getId() {
        return this.f48256p;
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
        List<Div> list = this.f48260t;
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
        return this.f48251k;
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
        return this.f48243c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f48244d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f48253m;
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
        int iHashCode = ck.s.b(DivPager.class).hashCode();
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
        int iHashCode4 = iHash12 + (expressionB != null ? expressionB.hashCode() : 0) + this.f48249i.hashCode() + this.f48250j.hashCode();
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
        int iHashCode5 = iHash14 + (id2 != null ? id2.hashCode() : 0) + this.f48257q.hashCode();
        DivCollectionItemBuilder divCollectionItemBuilder = this.f48258r;
        int iHash15 = iHashCode5 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.hash() : 0) + this.f48259s.hash() + this.f48261u.hash();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash16 = iHash15 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash17 = iHash16 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f48264x.hashCode();
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash18 = iHash17 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        DivPageTransformation divPageTransformation = this.f48266z;
        int iHash19 = iHash18 + (divPageTransformation != null ? divPageTransformation.hash() : 0) + this.A.hashCode();
        Expression<String> expressionF = f();
        int iHashCode6 = iHash19 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0) + this.D.hashCode();
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
        int i14 = iHashCode7 + iHash6;
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
        int iHash20 = i15 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash21 = iHash20 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash22 = iHash21 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash23 = iHash22 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode8 = iHash23 + (listM != null ? listM.hashCode() : 0);
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
        int i16 = iHashCode8 + iHash8;
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
        int iHashCode9 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash24 = iHashCode9 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash25 = iHash24 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash25);
        return iHash25;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f48241a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f48265y;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.E;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f48262v;
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
        return this.f48254n;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.I;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f48245e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f48247g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
