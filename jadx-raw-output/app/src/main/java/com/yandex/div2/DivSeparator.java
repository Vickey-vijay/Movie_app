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

/* JADX INFO: compiled from: DivSeparator.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSeparator implements JSONSerializable, Hashable, oe.e2 {
    public static final a S = new a(null);
    public static final DivAnimation T;
    public static final Expression<Double> U;
    public static final Expression<Boolean> V;
    public static final DivSize.d W;
    public static final Expression<DivVisibility> X;
    public static final DivSize.c Y;
    public static final bk.p<ParsingEnvironment, JSONObject, DivSeparator> Z;
    public final List<DivAction> A;
    public final List<DivAction> B;
    public final Expression<String> C;
    public final Expression<Long> D;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f48672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAction f48673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivAnimation f48674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f48675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f48676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f48677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f48678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivAnimator> f48679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivBackground> f48680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DivBorder f48681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Boolean> f48682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Long> f48683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DelimiterStyle f48684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivDisappearAction> f48685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<DivAction> f48686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<DivExtension> f48687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DivFocus f48688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<DivFunction> f48689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivSize f48690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<DivAction> f48691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<DivAction> f48692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f48693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivLayoutProvider f48694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<DivAction> f48695x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DivEdgeInsets f48696y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivEdgeInsets f48697z;

    /* JADX INFO: compiled from: DivSeparator.kt */
    public static final class DelimiterStyle implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f48698d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Expression<Integer> f48699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Expression<Orientation> f48700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, DelimiterStyle> f48701g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Integer> f48702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Orientation> f48703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48704c;

        /* JADX INFO: compiled from: DivSeparator.kt */
        public enum Orientation {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");

            private final String value;
            public static final a Converter = new a(null);
            public static final bk.l<Orientation, String> TO_STRING = new bk.l<Orientation, String>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$TO_STRING$1
                @Override // bk.l
                public final String invoke(DivSeparator.DelimiterStyle.Orientation orientation) {
                    return DivSeparator.DelimiterStyle.Orientation.Converter.b(orientation);
                }
            };
            public static final bk.l<String, Orientation> FROM_STRING = new bk.l<String, Orientation>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$FROM_STRING$1
                @Override // bk.l
                public final DivSeparator.DelimiterStyle.Orientation invoke(String str) {
                    return DivSeparator.DelimiterStyle.Orientation.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivSeparator.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }

                public final Orientation a(String str) {
                    Orientation orientation = Orientation.VERTICAL;
                    if (ck.p.e(str, orientation.value)) {
                        return orientation;
                    }
                    Orientation orientation2 = Orientation.HORIZONTAL;
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
        public DelimiterStyle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public DelimiterStyle(Expression<Integer> expression, Expression<Orientation> expression2) {
            this.f48702a = expression;
            this.f48703b = expression2;
        }

        public final boolean a(DelimiterStyle delimiterStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return delimiterStyle != null && this.f48702a.evaluate(expressionResolver).intValue() == delimiterStyle.f48702a.evaluate(expressionResolver2).intValue() && this.f48703b.evaluate(expressionResolver) == delimiterStyle.f48703b.evaluate(expressionResolver2);
        }

        /* JADX INFO: compiled from: DivSeparator.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final DelimiterStyle a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().J6().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f48699e = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            f48700f = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
            f48701g = new bk.p<ParsingEnvironment, JSONObject, DelimiterStyle>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSeparator.DelimiterStyle mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivSeparator.DelimiterStyle.f48698d.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48704c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(DelimiterStyle.class).hashCode() + this.f48702a.hashCode() + this.f48703b.hashCode();
            this.f48704c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().J6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ DelimiterStyle(Expression expression, Expression expression2, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? f48699e : expression, (i10 & 2) != 0 ? f48700f : expression2);
        }
    }

    public DivSeparator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSeparator(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, DelimiterStyle delimiterStyle, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, DivLayoutProvider divLayoutProvider, List<DivAction> list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List<DivAction> list11, List<DivAction> list12, Expression<String> expression6, Expression<Long> expression7, List<DivAction> list13, List<DivTooltip> list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list15, List<DivTrigger> list16, List<? extends DivVariable> list17, Expression<DivVisibility> expression8, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list18, DivSize divSize2) {
        this.f48672a = divAccessibility;
        this.f48673b = divAction;
        this.f48674c = divAnimation;
        this.f48675d = list;
        this.f48676e = expression;
        this.f48677f = expression2;
        this.f48678g = expression3;
        this.f48679h = list2;
        this.f48680i = list3;
        this.f48681j = divBorder;
        this.f48682k = expression4;
        this.f48683l = expression5;
        this.f48684m = delimiterStyle;
        this.f48685n = list4;
        this.f48686o = list5;
        this.f48687p = list6;
        this.f48688q = divFocus;
        this.f48689r = list7;
        this.f48690s = divSize;
        this.f48691t = list8;
        this.f48692u = list9;
        this.f48693v = str;
        this.f48694w = divLayoutProvider;
        this.f48695x = list10;
        this.f48696y = divEdgeInsets;
        this.f48697z = divEdgeInsets2;
        this.A = list11;
        this.B = list12;
        this.C = expression6;
        this.D = expression7;
        this.E = list13;
        this.F = list14;
        this.G = divTransform;
        this.H = divChangeTransition;
        this.I = divAppearanceTransition;
        this.J = divAppearanceTransition2;
        this.K = list15;
        this.L = list16;
        this.M = list17;
        this.N = expression8;
        this.O = divVisibilityAction;
        this.P = list18;
        this.Q = divSize2;
    }

    public final boolean C(DivSeparator divSeparator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zA3;
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
        if (divSeparator == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divSeparator.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divSeparator.q() == null;
        }
        if (!zA) {
            return false;
        }
        DivAction divAction = this.f48673b;
        if (divAction != null) {
            zA2 = divAction.a(divSeparator.f48673b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divSeparator.f48673b == null;
        }
        if (!zA2 || !this.f48674c.a(divSeparator.f48674c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f48675d;
        if (list != null) {
            List<DivAction> list2 = divSeparator.f48675d;
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
            z10 = divSeparator.f48675d == null;
        }
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSeparator.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divSeparator.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divSeparator.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divSeparator.y();
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
            z11 = divSeparator.y() == null;
        }
        if (!z11) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSeparator.getBackground();
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
            z12 = divSeparator.getBackground() == null;
        }
        if (!z12) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA3 = divBorderZ.a(divSeparator.z(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divSeparator.z() == null;
        }
        if (!zA3 || this.f48682k.evaluate(expressionResolver).booleanValue() != divSeparator.f48682k.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSeparator.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DelimiterStyle delimiterStyle = this.f48684m;
        if (delimiterStyle != null) {
            zA4 = delimiterStyle.a(divSeparator.f48684m, expressionResolver, expressionResolver2);
        } else {
            zA4 = divSeparator.f48684m == null;
        }
        if (!zA4) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSeparator.k();
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
            z13 = divSeparator.k() == null;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f48686o;
        if (list3 != null) {
            List<DivAction> list4 = divSeparator.f48686o;
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
            z14 = divSeparator.f48686o == null;
        }
        if (!z14) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSeparator.getExtensions();
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
            z15 = divSeparator.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA5 = divFocusP.a(divSeparator.p(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divSeparator.p() == null;
        }
        if (!zA5) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divSeparator.w();
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
            z16 = divSeparator.w() == null;
        }
        if (!z16 || !getHeight().a(divSeparator.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.f48691t;
        if (list5 != null) {
            List<DivAction> list6 = divSeparator.f48691t;
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
            z17 = divSeparator.f48691t == null;
        }
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.f48692u;
        if (list7 != null) {
            List<DivAction> list8 = divSeparator.f48692u;
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
            z18 = divSeparator.f48692u == null;
        }
        if (!z18 || !ck.p.e(getId(), divSeparator.getId())) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA6 = divLayoutProviderT.a(divSeparator.t(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divSeparator.t() == null;
        }
        if (!zA6) {
            return false;
        }
        List<DivAction> list9 = this.f48695x;
        if (list9 != null) {
            List<DivAction> list10 = divSeparator.f48695x;
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
            z19 = divSeparator.f48695x == null;
        }
        if (!z19) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA7 = divEdgeInsetsD.a(divSeparator.d(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divSeparator.d() == null;
        }
        if (!zA7) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA8 = divEdgeInsetsR.a(divSeparator.r(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divSeparator.r() == null;
        }
        if (!zA8) {
            return false;
        }
        List<DivAction> list11 = this.A;
        if (list11 != null) {
            List<DivAction> list12 = divSeparator.A;
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
            z20 = divSeparator.A == null;
        }
        if (!z20) {
            return false;
        }
        List<DivAction> list13 = this.B;
        if (list13 != null) {
            List<DivAction> list14 = divSeparator.B;
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
            z21 = divSeparator.B == null;
        }
        if (!z21) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSeparator.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSeparator.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divSeparator.s();
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
            z22 = divSeparator.s() == null;
        }
        if (!z22) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSeparator.h();
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
            z23 = divSeparator.h() == null;
        }
        if (!z23) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA9 = divTransformL.a(divSeparator.l(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divSeparator.l() == null;
        }
        if (!zA9) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA10 = divChangeTransitionJ.a(divSeparator.j(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divSeparator.j() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA11 = divAppearanceTransitionX.a(divSeparator.x(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divSeparator.x() == null;
        }
        if (!zA11) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA12 = divAppearanceTransitionI.a(divSeparator.i(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divSeparator.i() == null;
        }
        if (!zA12) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divSeparator.m();
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
            z24 = divSeparator.m() == null;
        }
        if (!z24) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divSeparator.u();
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
            z25 = divSeparator.u() == null;
        }
        if (!z25) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSeparator.c();
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
            z26 = divSeparator.c() == null;
        }
        if (!z26 || getVisibility().evaluate(expressionResolver) != divSeparator.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divSeparator.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divSeparator.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSeparator.a();
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
            z27 = divSeparator.a() == null;
        }
        return z27 && getWidth().a(divSeparator.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivSeparator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSeparator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        T = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        U = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        V = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        W = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        X = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        Y = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        Z = new bk.p<ParsingEnvironment, JSONObject, DivSeparator>() { // from class: com.yandex.div2.DivSeparator$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSeparator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSeparator.S.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivSeparator B(DivSeparator divSeparator, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divSeparator.q() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divSeparator.f48673b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divSeparator.f48674c : divAnimation;
        List list19 = (i10 & 8) != 0 ? divSeparator.f48675d : list;
        Expression expressionG = (i10 & 16) != 0 ? divSeparator.g() : expression;
        Expression expressionN = (i10 & 32) != 0 ? divSeparator.n() : expression2;
        Expression expressionO = (i10 & 64) != 0 ? divSeparator.o() : expression3;
        List listY = (i10 & 128) != 0 ? divSeparator.y() : list2;
        List background = (i10 & 256) != 0 ? divSeparator.getBackground() : list3;
        DivBorder divBorderZ = (i10 & 512) != 0 ? divSeparator.z() : divBorder;
        Expression expression9 = (i10 & 1024) != 0 ? divSeparator.f48682k : expression4;
        Expression expressionB = (i10 & 2048) != 0 ? divSeparator.b() : expression5;
        DelimiterStyle delimiterStyle2 = (i10 & 4096) != 0 ? divSeparator.f48684m : delimiterStyle;
        List listK = (i10 & 8192) != 0 ? divSeparator.k() : list4;
        List list20 = (i10 & 16384) != 0 ? divSeparator.f48686o : list5;
        List extensions = (i10 & 32768) != 0 ? divSeparator.getExtensions() : list6;
        DivFocus divFocusP = (i10 & 65536) != 0 ? divSeparator.p() : divFocus;
        List listW = (i10 & 131072) != 0 ? divSeparator.w() : list7;
        DivSize height = (i10 & 262144) != 0 ? divSeparator.getHeight() : divSize;
        List list21 = list20;
        List list22 = (i10 & 524288) != 0 ? divSeparator.f48691t : list8;
        List list23 = (i10 & 1048576) != 0 ? divSeparator.f48692u : list9;
        return divSeparator.A(divAccessibilityQ, divAction2, divAnimation2, list19, expressionG, expressionN, expressionO, listY, background, divBorderZ, expression9, expressionB, delimiterStyle2, listK, list21, extensions, divFocusP, listW, height, list22, list23, (i10 & 2097152) != 0 ? divSeparator.getId() : str, (i10 & 4194304) != 0 ? divSeparator.t() : divLayoutProvider, (i10 & 8388608) != 0 ? divSeparator.f48695x : list10, (i10 & 16777216) != 0 ? divSeparator.d() : divEdgeInsets, (i10 & 33554432) != 0 ? divSeparator.r() : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSeparator.A : list11, (i10 & 134217728) != 0 ? divSeparator.B : list12, (i10 & 268435456) != 0 ? divSeparator.f() : expression6, (i10 & 536870912) != 0 ? divSeparator.e() : expression7, (i10 & 1073741824) != 0 ? divSeparator.s() : list13, (i10 & Integer.MIN_VALUE) != 0 ? divSeparator.h() : list14, (i11 & 1) != 0 ? divSeparator.l() : divTransform, (i11 & 2) != 0 ? divSeparator.j() : divChangeTransition, (i11 & 4) != 0 ? divSeparator.x() : divAppearanceTransition, (i11 & 8) != 0 ? divSeparator.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divSeparator.m() : list15, (i11 & 32) != 0 ? divSeparator.u() : list16, (i11 & 64) != 0 ? divSeparator.c() : list17, (i11 & 128) != 0 ? divSeparator.getVisibility() : expression8, (i11 & 256) != 0 ? divSeparator.v() : divVisibilityAction, (i11 & 512) != 0 ? divSeparator.a() : list18, (i11 & 1024) != 0 ? divSeparator.getWidth() : divSize2);
    }

    public final DivSeparator A(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression4, Expression<Long> expression5, DelimiterStyle delimiterStyle, List<DivDisappearAction> list4, List<DivAction> list5, List<DivExtension> list6, DivFocus divFocus, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, DivLayoutProvider divLayoutProvider, List<DivAction> list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List<DivAction> list11, List<DivAction> list12, Expression<String> expression6, Expression<Long> expression7, List<DivAction> list13, List<DivTooltip> list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list15, List<DivTrigger> list16, List<? extends DivVariable> list17, Expression<DivVisibility> expression8, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list18, DivSize divSize2) {
        return new DivSeparator(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, delimiterStyle, list4, list5, list6, divFocus, list7, divSize, list8, list9, str, divLayoutProvider, list10, divEdgeInsets, divEdgeInsets2, list11, list12, expression6, expression7, list13, list14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list15, list16, list17, expression8, divVisibilityAction, list18, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f48683l;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f48696y;
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
        return this.f48676e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f48680i;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f48687p;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f48690s;
    }

    @Override // oe.e2
    public String getId() {
        return this.f48693v;
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSeparator.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash17 = 0;
        int iHash18 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        DivAction divAction = this.f48673b;
        int iHash19 = iHash18 + (divAction != null ? divAction.hash() : 0) + this.f48674c.hash();
        List<DivAction> list = this.f48675d;
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
        int iHash20 = i12 + (divBorderZ != null ? divBorderZ.hash() : 0) + this.f48682k.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0);
        DelimiterStyle delimiterStyle = this.f48684m;
        int iHash21 = iHashCode4 + (delimiterStyle != null ? delimiterStyle.hash() : 0);
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
        int i13 = iHash21 + iHash4;
        List<DivAction> list2 = this.f48686o;
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
        int iHash23 = iHash22 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.f48691t;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash23 + iHash8;
        List<DivAction> list4 = this.f48692u;
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
        int iHash24 = iHashCode5 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        List<DivAction> list5 = this.f48695x;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivAction) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash24 + iHash10;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash25 = i18 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash26 = iHash25 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        List<DivAction> list6 = this.A;
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
        List<DivAction> list7 = this.B;
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
        int iHash27 = i22 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash28 = iHash27 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash29 = iHash28 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash30 = iHash29 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode8 = iHash30 + (listM != null ? listM.hashCode() : 0);
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
        int iHash31 = iHashCode9 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((DivVisibilityAction) it17.next()).hash();
            }
        }
        int iHash32 = iHash31 + iHash17 + getWidth().hash();
        this.R = Integer.valueOf(iHash32);
        return iHash32;
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
        return this.f48685n;
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
        return this.f48677f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f48678g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f48688q;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f48672a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f48697z;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.E;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f48694w;
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
        return this.f48689r;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.I;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f48679h;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f48681j;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSeparator(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, DelimiterStyle delimiterStyle, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list15, List list16, List list17, Expression expression8, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2, int i10, int i11, ck.i iVar) {
        this((i10 & 1) != 0 ? null : divAccessibility, (i10 & 2) != 0 ? null : divAction, (i10 & 4) != 0 ? T : divAnimation, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : expression, (i10 & 32) != 0 ? null : expression2, (i10 & 64) != 0 ? U : expression3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : list3, (i10 & 512) != 0 ? null : divBorder, (i10 & 1024) != 0 ? V : expression4, (i10 & 2048) != 0 ? null : expression5, (i10 & 4096) != 0 ? null : delimiterStyle, (i10 & 8192) != 0 ? null : list4, (i10 & 16384) != 0 ? null : list5, (i10 & 32768) != 0 ? null : list6, (i10 & 65536) != 0 ? null : divFocus, (i10 & 131072) != 0 ? null : list7, (i10 & 262144) != 0 ? W : divSize, (i10 & 524288) != 0 ? null : list8, (i10 & 1048576) != 0 ? null : list9, (i10 & 2097152) != 0 ? null : str, (i10 & 4194304) != 0 ? null : divLayoutProvider, (i10 & 8388608) != 0 ? null : list10, (i10 & 16777216) != 0 ? null : divEdgeInsets, (i10 & 33554432) != 0 ? null : divEdgeInsets2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : list11, (i10 & 134217728) != 0 ? null : list12, (i10 & 268435456) != 0 ? null : expression6, (i10 & 536870912) != 0 ? null : expression7, (i10 & 1073741824) != 0 ? null : list13, (i10 & Integer.MIN_VALUE) != 0 ? null : list14, (i11 & 1) != 0 ? null : divTransform, (i11 & 2) != 0 ? null : divChangeTransition, (i11 & 4) != 0 ? null : divAppearanceTransition, (i11 & 8) != 0 ? null : divAppearanceTransition2, (i11 & 16) != 0 ? null : list15, (i11 & 32) != 0 ? null : list16, (i11 & 64) != 0 ? null : list17, (i11 & 128) != 0 ? X : expression8, (i11 & 256) != 0 ? null : divVisibilityAction, (i11 & 512) != 0 ? null : list18, (i11 & 1024) != 0 ? Y : divSize2);
    }
}
