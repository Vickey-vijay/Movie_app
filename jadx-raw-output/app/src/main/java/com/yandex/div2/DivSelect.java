package com.yandex.div2;

import androidx.core.view.ViewCompat;
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

/* JADX INFO: compiled from: DivSelect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivSelect implements JSONSerializable, Hashable, oe.e2 {
    public static final a U = new a(null);
    public static final Expression<Double> V;
    public static final Expression<Long> W;
    public static final Expression<DivSizeUnit> X;
    public static final DivSize.d Y;
    public static final Expression<Integer> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Double> f48576a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Integer> f48577b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivVisibility> f48578c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final DivSize.c f48579d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSelect> f48580e0;
    public final List<Option> A;
    public final DivEdgeInsets B;
    public final Expression<String> C;
    public final Expression<Long> D;
    public final List<DivAction> E;
    public final Expression<Integer> F;
    public final List<DivTooltip> G;
    public final DivTransform H;
    public final DivChangeTransition I;
    public final DivAppearanceTransition J;
    public final DivAppearanceTransition K;
    public final List<DivTransitionTrigger> L;
    public final String M;
    public final List<DivTrigger> N;
    public final List<DivVariable> O;
    public final Expression<DivVisibility> P;
    public final DivVisibilityAction Q;
    public final List<DivVisibilityAction> R;
    public final DivSize S;
    public Integer T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f48581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f48582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f48583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f48584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f48585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f48586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f48587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f48588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivDisappearAction> f48589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivExtension> f48590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivFocus f48591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<String> f48592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression<Long> f48593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression<DivSizeUnit> f48594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<JSONObject> f48595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression<DivFontWeight> f48596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Expression<Long> f48597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivFunction> f48598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivSize f48599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression<Integer> f48600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<String> f48601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f48602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivLayoutProvider f48603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression<Double> f48604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression<Long> f48605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivEdgeInsets f48606z;

    /* JADX INFO: compiled from: DivSelect.kt */
    public static final class Option implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f48607d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Option> f48608e = new bk.p<ParsingEnvironment, JSONObject, Option>() { // from class: com.yandex.div2.DivSelect$Option$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelect.Option mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSelect.Option.f48607d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<String> f48609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<String> f48610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48611c;

        public final boolean a(Option option, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (option == null) {
                return false;
            }
            Expression<String> expression = this.f48609a;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = option.f48609a;
            return ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && ck.p.e(this.f48610b.evaluate(expressionResolver), option.f48610b.evaluate(expressionResolver2));
        }

        /* JADX INFO: compiled from: DivSelect.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Option a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().G6().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48611c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Option.class).hashCode();
            Expression<String> expression = this.f48609a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f48610b.hashCode();
            this.f48611c = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public Option(Expression<String> expression, Expression<String> expression2) {
            this.f48609a = expression;
            this.f48610b = expression2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().G6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSelect(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, Expression<String> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7, Expression<JSONObject> expression8, Expression<DivFontWeight> expression9, Expression<Long> expression10, List<DivFunction> list5, DivSize divSize, Expression<Integer> expression11, Expression<String> expression12, String str, DivLayoutProvider divLayoutProvider, Expression<Double> expression13, Expression<Long> expression14, DivEdgeInsets divEdgeInsets, List<Option> list6, DivEdgeInsets divEdgeInsets2, Expression<String> expression15, Expression<Long> expression16, List<DivAction> list7, Expression<Integer> expression17, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, String str2, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression18, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        this.f48581a = divAccessibility;
        this.f48582b = expression;
        this.f48583c = expression2;
        this.f48584d = expression3;
        this.f48585e = list;
        this.f48586f = list2;
        this.f48587g = divBorder;
        this.f48588h = expression4;
        this.f48589i = list3;
        this.f48590j = list4;
        this.f48591k = divFocus;
        this.f48592l = expression5;
        this.f48593m = expression6;
        this.f48594n = expression7;
        this.f48595o = expression8;
        this.f48596p = expression9;
        this.f48597q = expression10;
        this.f48598r = list5;
        this.f48599s = divSize;
        this.f48600t = expression11;
        this.f48601u = expression12;
        this.f48602v = str;
        this.f48603w = divLayoutProvider;
        this.f48604x = expression13;
        this.f48605y = expression14;
        this.f48606z = divEdgeInsets;
        this.A = list6;
        this.B = divEdgeInsets2;
        this.C = expression15;
        this.D = expression16;
        this.E = list7;
        this.F = expression17;
        this.G = list8;
        this.H = divTransform;
        this.I = divChangeTransition;
        this.J = divAppearanceTransition;
        this.K = divAppearanceTransition2;
        this.L = list9;
        this.M = str2;
        this.N = list10;
        this.O = list11;
        this.P = expression18;
        this.Q = divVisibilityAction;
        this.R = list12;
        this.S = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivSelect B(DivSelect divSelect, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, DivSize divSize, Expression expression11, Expression expression12, String str, DivLayoutProvider divLayoutProvider, Expression expression13, Expression expression14, DivEdgeInsets divEdgeInsets, List list6, DivEdgeInsets divEdgeInsets2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, String str2, List list10, List list11, Expression expression18, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divSelect.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divSelect.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divSelect.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divSelect.o() : expression3;
        List listY = (i10 & 16) != 0 ? divSelect.y() : list;
        List background = (i10 & 32) != 0 ? divSelect.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 64) != 0 ? divSelect.z() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divSelect.b() : expression4;
        List listK = (i10 & 256) != 0 ? divSelect.k() : list3;
        List extensions = (i10 & 512) != 0 ? divSelect.getExtensions() : list4;
        DivFocus divFocusP = (i10 & 1024) != 0 ? divSelect.p() : divFocus;
        Expression expression19 = (i10 & 2048) != 0 ? divSelect.f48592l : expression5;
        Expression expression20 = (i10 & 4096) != 0 ? divSelect.f48593m : expression6;
        Expression expression21 = (i10 & 8192) != 0 ? divSelect.f48594n : expression7;
        Expression expression22 = (i10 & 16384) != 0 ? divSelect.f48595o : expression8;
        Expression expression23 = (i10 & 32768) != 0 ? divSelect.f48596p : expression9;
        Expression expression24 = (i10 & 65536) != 0 ? divSelect.f48597q : expression10;
        List listW = (i10 & 131072) != 0 ? divSelect.w() : list5;
        DivSize height = (i10 & 262144) != 0 ? divSelect.getHeight() : divSize;
        Expression expression25 = expression24;
        Expression expression26 = (i10 & 524288) != 0 ? divSelect.f48600t : expression11;
        Expression expression27 = (i10 & 1048576) != 0 ? divSelect.f48601u : expression12;
        String id2 = (i10 & 2097152) != 0 ? divSelect.getId() : str;
        DivLayoutProvider divLayoutProviderT = (i10 & 4194304) != 0 ? divSelect.t() : divLayoutProvider;
        Expression expression28 = expression27;
        Expression expression29 = (i10 & 8388608) != 0 ? divSelect.f48604x : expression13;
        Expression expression30 = (i10 & 16777216) != 0 ? divSelect.f48605y : expression14;
        return divSelect.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, background, divBorderZ, expressionB, listK, extensions, divFocusP, expression19, expression20, expression21, expression22, expression23, expression25, listW, height, expression26, expression28, id2, divLayoutProviderT, expression29, expression30, (i10 & 33554432) != 0 ? divSelect.d() : divEdgeInsets, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSelect.A : list6, (i10 & 134217728) != 0 ? divSelect.r() : divEdgeInsets2, (i10 & 268435456) != 0 ? divSelect.f() : expression15, (i10 & 536870912) != 0 ? divSelect.e() : expression16, (i10 & 1073741824) != 0 ? divSelect.s() : list7, (i10 & Integer.MIN_VALUE) != 0 ? divSelect.F : expression17, (i11 & 1) != 0 ? divSelect.h() : list8, (i11 & 2) != 0 ? divSelect.l() : divTransform, (i11 & 4) != 0 ? divSelect.j() : divChangeTransition, (i11 & 8) != 0 ? divSelect.x() : divAppearanceTransition, (i11 & 16) != 0 ? divSelect.i() : divAppearanceTransition2, (i11 & 32) != 0 ? divSelect.m() : list9, (i11 & 64) != 0 ? divSelect.M : str2, (i11 & 128) != 0 ? divSelect.u() : list10, (i11 & 256) != 0 ? divSelect.c() : list11, (i11 & 512) != 0 ? divSelect.getVisibility() : expression18, (i11 & 1024) != 0 ? divSelect.v() : divVisibilityAction, (i11 & 2048) != 0 ? divSelect.a() : list12, (i11 & 4096) != 0 ? divSelect.getWidth() : divSize2);
    }

    public final DivSelect A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, Expression<String> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7, Expression<JSONObject> expression8, Expression<DivFontWeight> expression9, Expression<Long> expression10, List<DivFunction> list5, DivSize divSize, Expression<Integer> expression11, Expression<String> expression12, String str, DivLayoutProvider divLayoutProvider, Expression<Double> expression13, Expression<Long> expression14, DivEdgeInsets divEdgeInsets, List<Option> list6, DivEdgeInsets divEdgeInsets2, Expression<String> expression15, Expression<Long> expression16, List<DivAction> list7, Expression<Integer> expression17, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, String str2, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression18, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        return new DivSelect(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, expression5, expression6, expression7, expression8, expression9, expression10, list5, divSize, expression11, expression12, str, divLayoutProvider, expression13, expression14, divEdgeInsets, list6, divEdgeInsets2, expression15, expression16, list7, expression17, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, str2, list10, list11, expression18, divVisibilityAction, list12, divSize2);
    }

    public final boolean C(DivSelect divSelect, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean z15;
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
        if (divSelect == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divSelect.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divSelect.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSelect.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divSelect.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divSelect.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divSelect.y();
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
            z10 = divSelect.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSelect.getBackground();
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
            z11 = divSelect.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divSelect.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divSelect.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSelect.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSelect.k();
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
            z12 = divSelect.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSelect.getExtensions();
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
            z13 = divSelect.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divSelect.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divSelect.p() == null;
        }
        if (!zA3) {
            return false;
        }
        Expression<String> expression = this.f48592l;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divSelect.f48592l;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f48593m.evaluate(expressionResolver).longValue() != divSelect.f48593m.evaluate(expressionResolver2).longValue() || this.f48594n.evaluate(expressionResolver) != divSelect.f48594n.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression3 = this.f48595o;
        JSONObject jSONObjectEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression4 = divSelect.f48595o;
        if (!ck.p.e(jSONObjectEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression5 = this.f48596p;
        DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression6 = divSelect.f48596p;
        if (divFontWeightEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.f48597q;
        Long lEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divSelect.f48597q;
        if (!ck.p.e(lEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divSelect.w();
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
            z14 = divSelect.w() == null;
        }
        if (!z14 || !getHeight().a(divSelect.getHeight(), expressionResolver, expressionResolver2) || this.f48600t.evaluate(expressionResolver).intValue() != divSelect.f48600t.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        Expression<String> expression9 = this.f48601u;
        String strEvaluate2 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<String> expression10 = divSelect.f48601u;
        if (!ck.p.e(strEvaluate2, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || !ck.p.e(getId(), divSelect.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA4 = divLayoutProviderT.a(divSelect.t(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divSelect.t() == null;
        }
        if (!zA4) {
            return false;
        }
        if (!(this.f48604x.evaluate(expressionResolver).doubleValue() == divSelect.f48604x.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression11 = this.f48605y;
        Long lEvaluate3 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<Long> expression12 = divSelect.f48605y;
        if (!ck.p.e(lEvaluate3, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA5 = divEdgeInsetsD.a(divSelect.d(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divSelect.d() == null;
        }
        if (!zA5) {
            return false;
        }
        List<Option> list = this.A;
        List<Option> list2 = divSelect.A;
        if (list.size() == list2.size()) {
            Iterator<T> it6 = list.iterator();
            int i20 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    z15 = true;
                    break;
                }
                Object next6 = it6.next();
                int i21 = i20 + 1;
                if (i20 < 0) {
                    nj.s.u();
                }
                if (!((Option) next6).a(list2.get(i20), expressionResolver, expressionResolver2)) {
                    z15 = false;
                    break;
                }
                i20 = i21;
            }
        } else {
            z15 = false;
            break;
        }
        if (!z15) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA6 = divEdgeInsetsR.a(divSelect.r(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divSelect.r() == null;
        }
        if (!zA6) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate3 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSelect.f();
        if (!ck.p.e(strEvaluate3, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate4 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSelect.e();
        if (!ck.p.e(lEvaluate4, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divSelect.s();
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
            z16 = divSelect.s() == null;
        }
        if (!z16 || this.F.evaluate(expressionResolver).intValue() != divSelect.F.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSelect.h();
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
            z17 = divSelect.h() == null;
        }
        if (!z17) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA7 = divTransformL.a(divSelect.l(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divSelect.l() == null;
        }
        if (!zA7) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA8 = divChangeTransitionJ.a(divSelect.j(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divSelect.j() == null;
        }
        if (!zA8) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA9 = divAppearanceTransitionX.a(divSelect.x(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divSelect.x() == null;
        }
        if (!zA9) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA10 = divAppearanceTransitionI.a(divSelect.i(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divSelect.i() == null;
        }
        if (!zA10) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divSelect.m();
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
            z18 = divSelect.m() == null;
        }
        if (!z18 || !ck.p.e(this.M, divSelect.M)) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divSelect.u();
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
            z19 = divSelect.u() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSelect.c();
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
            z20 = divSelect.c() == null;
        }
        if (!z20 || getVisibility().evaluate(expressionResolver) != divSelect.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divSelect.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divSelect.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSelect.a();
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
            z21 = divSelect.a() == null;
        }
        return z21 && getWidth().a(divSelect.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivSelect.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSelect a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().D6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        X = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f48576a0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48577b0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f48578c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f48579d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f48580e0 = new bk.p<ParsingEnvironment, JSONObject, DivSelect>() { // from class: com.yandex.div2.DivSelect$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSelect mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSelect.U.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.R;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f48588h;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.O;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f48606z;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.D;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.C;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f48582b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f48586f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f48590j;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f48599s;
    }

    @Override // oe.e2
    public String getId() {
        return this.f48602v;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.P;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.S;
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
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSelect.class).hashCode();
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
        Expression<String> expression = this.f48592l;
        int iHashCode5 = iHash13 + (expression != null ? expression.hashCode() : 0) + this.f48593m.hashCode() + this.f48594n.hashCode();
        Expression<JSONObject> expression2 = this.f48595o;
        int iHashCode6 = iHashCode5 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<DivFontWeight> expression3 = this.f48596p;
        int iHashCode7 = iHashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.f48597q;
        int iHashCode8 = iHashCode7 + (expression4 != null ? expression4.hashCode() : 0);
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
        int iHash14 = iHashCode8 + iHash5 + getHeight().hash() + this.f48600t.hashCode();
        Expression<String> expression5 = this.f48601u;
        int iHashCode9 = iHash14 + (expression5 != null ? expression5.hashCode() : 0);
        String id2 = getId();
        int iHashCode10 = iHashCode9 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderT = t();
        int iHash15 = iHashCode10 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0) + this.f48604x.hashCode();
        Expression<Long> expression6 = this.f48605y;
        int iHashCode11 = iHash15 + (expression6 != null ? expression6.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash16 = iHashCode11 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        Iterator<T> it6 = this.A.iterator();
        int iHash17 = 0;
        while (it6.hasNext()) {
            iHash17 += ((Option) it6.next()).hash();
        }
        int i14 = iHash16 + iHash17;
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash18 = i14 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        Expression<String> expressionF = f();
        int iHashCode12 = iHash18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode13 = iHashCode12 + (expressionE != null ? expressionE.hashCode() : 0);
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it7 = listS.iterator();
            iHash6 = 0;
            while (it7.hasNext()) {
                iHash6 += ((DivAction) it7.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int iHashCode14 = iHashCode13 + iHash6 + this.F.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it8 = listH.iterator();
            iHash7 = 0;
            while (it8.hasNext()) {
                iHash7 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = iHashCode14 + iHash7;
        DivTransform divTransformL = l();
        int iHash19 = i15 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash20 = iHash19 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash21 = iHash20 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash22 = iHash21 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode15 = iHash22 + (listM != null ? listM.hashCode() : 0) + this.M.hashCode();
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it9 = listU.iterator();
            iHash8 = 0;
            while (it9.hasNext()) {
                iHash8 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode15 + iHash8;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it10 = listC.iterator();
            iHash9 = 0;
            while (it10.hasNext()) {
                iHash9 += ((DivVariable) it10.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int iHashCode16 = i16 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash23 = iHashCode16 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it11 = listA.iterator();
            while (it11.hasNext()) {
                iHash10 += ((DivVisibilityAction) it11.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.T = Integer.valueOf(iHash24);
        return iHash24;
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
        return this.f48589i;
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
        return this.f48583c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f48584d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f48591k;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f48581a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.B;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.E;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f48603w;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.N;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.Q;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f48598r;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.J;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f48585e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f48587g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
