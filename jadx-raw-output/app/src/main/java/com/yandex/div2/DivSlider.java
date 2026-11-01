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

/* JADX INFO: compiled from: DivSlider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSlider implements JSONSerializable, Hashable, oe.e2 {
    public static final a W = new a(null);
    public static final Expression<Double> X;
    public static final DivSize.d Y;
    public static final Expression<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Long> f48867a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Expression<Long> f48868b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<DivVisibility> f48869c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final DivSize.c f48870d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSlider> f48871e0;
    public final TextStyle A;
    public final String B;
    public final DivDrawable C;
    public final TextStyle D;
    public final String E;
    public final DivDrawable F;
    public final DivDrawable G;
    public final List<DivTooltip> H;
    public final DivDrawable I;
    public final DivDrawable J;
    public final DivTransform K;
    public final DivChangeTransition L;
    public final DivAppearanceTransition M;
    public final DivAppearanceTransition N;
    public final List<DivTransitionTrigger> O;
    public final List<DivTrigger> P;
    public final List<DivVariable> Q;
    public final Expression<DivVisibility> R;
    public final DivVisibilityAction S;
    public final List<DivVisibilityAction> T;
    public final DivSize U;
    public Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f48872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f48873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f48874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f48875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f48876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f48877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f48878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f48879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivDisappearAction> f48880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivExtension> f48881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivFocus f48882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DivFunction> f48883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DivSize f48884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression<Boolean> f48886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DivLayoutProvider f48887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DivEdgeInsets f48888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Expression<Long> f48889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression<Long> f48890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DivEdgeInsets f48891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<Range> f48892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Expression<String> f48893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Expression<Long> f48894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DivAccessibility f48895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<DivAction> f48896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DivDrawable f48897z;

    /* JADX INFO: compiled from: DivSlider.kt */
    public static final class Range implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f48898g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Range> f48899h = new bk.p<ParsingEnvironment, JSONObject, Range>() { // from class: com.yandex.div2.DivSlider$Range$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlider.Range mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSlider.Range.f48898g.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Long> f48900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DivEdgeInsets f48901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<Long> f48902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivDrawable f48903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivDrawable f48904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f48905f;

        public Range() {
            this(null, null, null, null, null, 31, null);
        }

        public Range(Expression<Long> expression, DivEdgeInsets divEdgeInsets, Expression<Long> expression2, DivDrawable divDrawable, DivDrawable divDrawable2) {
            this.f48900a = expression;
            this.f48901b = divEdgeInsets;
            this.f48902c = expression2;
            this.f48903d = divDrawable;
            this.f48904e = divDrawable2;
        }

        public final boolean a(Range range, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            boolean zA2;
            boolean zA3;
            if (range == null) {
                return false;
            }
            Expression<Long> expression = this.f48900a;
            Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Long> expression2 = range.f48900a;
            if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivEdgeInsets divEdgeInsets = this.f48901b;
            if (divEdgeInsets != null) {
                zA = divEdgeInsets.a(range.f48901b, expressionResolver, expressionResolver2);
            } else {
                zA = range.f48901b == null;
            }
            if (!zA) {
                return false;
            }
            Expression<Long> expression3 = this.f48902c;
            Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<Long> expression4 = range.f48902c;
            if (!ck.p.e(lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivDrawable divDrawable = this.f48903d;
            if (divDrawable != null) {
                zA2 = divDrawable.a(range.f48903d, expressionResolver, expressionResolver2);
            } else {
                zA2 = range.f48903d == null;
            }
            if (!zA2) {
                return false;
            }
            DivDrawable divDrawable2 = this.f48904e;
            DivDrawable divDrawable3 = range.f48904e;
            if (divDrawable2 != null) {
                zA3 = divDrawable2.a(divDrawable3, expressionResolver, expressionResolver2);
            } else {
                zA3 = divDrawable3 == null;
            }
            return zA3;
        }

        /* JADX INFO: compiled from: DivSlider.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Range a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().k7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48905f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Range.class).hashCode();
            Expression<Long> expression = this.f48900a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            DivEdgeInsets divEdgeInsets = this.f48901b;
            int iHash = iHashCode2 + (divEdgeInsets != null ? divEdgeInsets.hash() : 0);
            Expression<Long> expression2 = this.f48902c;
            int iHashCode3 = iHash + (expression2 != null ? expression2.hashCode() : 0);
            DivDrawable divDrawable = this.f48903d;
            int iHash2 = iHashCode3 + (divDrawable != null ? divDrawable.hash() : 0);
            DivDrawable divDrawable2 = this.f48904e;
            int iHash3 = iHash2 + (divDrawable2 != null ? divDrawable2.hash() : 0);
            this.f48905f = Integer.valueOf(iHash3);
            return iHash3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().k7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ Range(Expression expression, DivEdgeInsets divEdgeInsets, Expression expression2, DivDrawable divDrawable, DivDrawable divDrawable2, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divEdgeInsets, (i10 & 4) != 0 ? null : expression2, (i10 & 8) != 0 ? null : divDrawable, (i10 & 16) != 0 ? null : divDrawable2);
        }
    }

    /* JADX INFO: compiled from: DivSlider.kt */
    public static final class TextStyle implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f48906k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Expression<Long> f48907l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final Expression<DivSizeUnit> f48908m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Expression<Double> f48909n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Expression<Integer> f48910o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, TextStyle> f48911p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<String> f48912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Long> f48913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<DivSizeUnit> f48914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<JSONObject> f48915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression<DivFontWeight> f48916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression<Long> f48917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression<Double> f48918g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final DivPoint f48919h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression<Integer> f48920i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f48921j;

        public TextStyle() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public TextStyle(Expression<String> expression, Expression<Long> expression2, Expression<DivSizeUnit> expression3, Expression<JSONObject> expression4, Expression<DivFontWeight> expression5, Expression<Long> expression6, Expression<Double> expression7, DivPoint divPoint, Expression<Integer> expression8) {
            this.f48912a = expression;
            this.f48913b = expression2;
            this.f48914c = expression3;
            this.f48915d = expression4;
            this.f48916e = expression5;
            this.f48917f = expression6;
            this.f48918g = expression7;
            this.f48919h = divPoint;
            this.f48920i = expression8;
        }

        public final boolean a(TextStyle textStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            if (textStyle == null) {
                return false;
            }
            Expression<String> expression = this.f48912a;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = textStyle.f48912a;
            if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f48913b.evaluate(expressionResolver).longValue() != textStyle.f48913b.evaluate(expressionResolver2).longValue() || this.f48914c.evaluate(expressionResolver) != textStyle.f48914c.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<JSONObject> expression3 = this.f48915d;
            JSONObject jSONObjectEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression4 = textStyle.f48915d;
            if (!ck.p.e(jSONObjectEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression5 = this.f48916e;
            DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression6 = textStyle.f48916e;
            if (divFontWeightEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression7 = this.f48917f;
            Long lEvaluate = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<Long> expression8 = textStyle.f48917f;
            if (!ck.p.e(lEvaluate, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            if (!(this.f48918g.evaluate(expressionResolver).doubleValue() == textStyle.f48918g.evaluate(expressionResolver2).doubleValue())) {
                return false;
            }
            DivPoint divPoint = this.f48919h;
            if (divPoint != null) {
                zA = divPoint.a(textStyle.f48919h, expressionResolver, expressionResolver2);
            } else {
                zA = textStyle.f48919h == null;
            }
            return zA && this.f48920i.evaluate(expressionResolver).intValue() == textStyle.f48920i.evaluate(expressionResolver2).intValue();
        }

        /* JADX INFO: compiled from: DivSlider.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final TextStyle a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().n7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f48907l = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            f48908m = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            f48909n = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f48910o = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
            f48911p = new bk.p<ParsingEnvironment, JSONObject, TextStyle>() { // from class: com.yandex.div2.DivSlider$TextStyle$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivSlider.TextStyle mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivSlider.TextStyle.f48906k.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48921j;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(TextStyle.class).hashCode();
            Expression<String> expression = this.f48912a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f48913b.hashCode() + this.f48914c.hashCode();
            Expression<JSONObject> expression2 = this.f48915d;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<DivFontWeight> expression3 = this.f48916e;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<Long> expression4 = this.f48917f;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f48918g.hashCode();
            DivPoint divPoint = this.f48919h;
            int iHash = iHashCode5 + (divPoint != null ? divPoint.hash() : 0) + this.f48920i.hashCode();
            this.f48921j = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().n7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ TextStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivPoint divPoint, Expression expression8, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f48907l : expression2, (i10 & 4) != 0 ? f48908m : expression3, (i10 & 8) != 0 ? null : expression4, (i10 & 16) != 0 ? null : expression5, (i10 & 32) != 0 ? null : expression6, (i10 & 64) != 0 ? f48909n : expression7, (i10 & 128) == 0 ? divPoint : null, (i10 & 256) != 0 ? f48910o : expression8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSlider(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Boolean> expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Long> expression6, Expression<Long> expression7, DivEdgeInsets divEdgeInsets2, List<Range> list6, Expression<String> expression8, Expression<Long> expression9, DivAccessibility divAccessibility2, List<DivAction> list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List<DivTooltip> list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression10, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        this.f48872a = divAccessibility;
        this.f48873b = expression;
        this.f48874c = expression2;
        this.f48875d = expression3;
        this.f48876e = list;
        this.f48877f = list2;
        this.f48878g = divBorder;
        this.f48879h = expression4;
        this.f48880i = list3;
        this.f48881j = list4;
        this.f48882k = divFocus;
        this.f48883l = list5;
        this.f48884m = divSize;
        this.f48885n = str;
        this.f48886o = expression5;
        this.f48887p = divLayoutProvider;
        this.f48888q = divEdgeInsets;
        this.f48889r = expression6;
        this.f48890s = expression7;
        this.f48891t = divEdgeInsets2;
        this.f48892u = list6;
        this.f48893v = expression8;
        this.f48894w = expression9;
        this.f48895x = divAccessibility2;
        this.f48896y = list7;
        this.f48897z = divDrawable;
        this.A = textStyle;
        this.B = str2;
        this.C = divDrawable2;
        this.D = textStyle2;
        this.E = str3;
        this.F = divDrawable3;
        this.G = divDrawable4;
        this.H = list8;
        this.I = divDrawable5;
        this.J = divDrawable6;
        this.K = divTransform;
        this.L = divChangeTransition;
        this.M = divAppearanceTransition;
        this.N = divAppearanceTransition2;
        this.O = list9;
        this.P = list10;
        this.Q = list11;
        this.R = expression10;
        this.S = divVisibilityAction;
        this.T = list12;
        this.U = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivSlider B(DivSlider divSlider, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, Expression expression7, DivEdgeInsets divEdgeInsets2, List list6, Expression expression8, Expression expression9, DivAccessibility divAccessibility2, List list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression10, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divSlider.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divSlider.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divSlider.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divSlider.o() : expression3;
        List listY = (i10 & 16) != 0 ? divSlider.y() : list;
        List background = (i10 & 32) != 0 ? divSlider.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 64) != 0 ? divSlider.z() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divSlider.b() : expression4;
        List listK = (i10 & 256) != 0 ? divSlider.k() : list3;
        List extensions = (i10 & 512) != 0 ? divSlider.getExtensions() : list4;
        DivFocus divFocusP = (i10 & 1024) != 0 ? divSlider.p() : divFocus;
        List listW = (i10 & 2048) != 0 ? divSlider.w() : list5;
        DivSize height = (i10 & 4096) != 0 ? divSlider.getHeight() : divSize;
        String id2 = (i10 & 8192) != 0 ? divSlider.getId() : str;
        Expression expression11 = (i10 & 16384) != 0 ? divSlider.f48886o : expression5;
        DivLayoutProvider divLayoutProviderT = (i10 & 32768) != 0 ? divSlider.t() : divLayoutProvider;
        DivEdgeInsets divEdgeInsetsD = (i10 & 65536) != 0 ? divSlider.d() : divEdgeInsets;
        Expression expression12 = expression11;
        Expression expression13 = (i10 & 131072) != 0 ? divSlider.f48889r : expression6;
        Expression expression14 = (i10 & 262144) != 0 ? divSlider.f48890s : expression7;
        DivEdgeInsets divEdgeInsetsR = (i10 & 524288) != 0 ? divSlider.r() : divEdgeInsets2;
        Expression expression15 = expression14;
        List list13 = (i10 & 1048576) != 0 ? divSlider.f48892u : list6;
        Expression expressionF = (i10 & 2097152) != 0 ? divSlider.f() : expression8;
        Expression expressionE = (i10 & 4194304) != 0 ? divSlider.e() : expression9;
        List list14 = list13;
        DivAccessibility divAccessibility3 = (i10 & 8388608) != 0 ? divSlider.f48895x : divAccessibility2;
        return divSlider.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, background, divBorderZ, expressionB, listK, extensions, divFocusP, listW, height, id2, expression12, divLayoutProviderT, divEdgeInsetsD, expression13, expression15, divEdgeInsetsR, list14, expressionF, expressionE, divAccessibility3, (i10 & 16777216) != 0 ? divSlider.s() : list7, (i10 & 33554432) != 0 ? divSlider.f48897z : divDrawable, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSlider.A : textStyle, (i10 & 134217728) != 0 ? divSlider.B : str2, (i10 & 268435456) != 0 ? divSlider.C : divDrawable2, (i10 & 536870912) != 0 ? divSlider.D : textStyle2, (i10 & 1073741824) != 0 ? divSlider.E : str3, (i10 & Integer.MIN_VALUE) != 0 ? divSlider.F : divDrawable3, (i11 & 1) != 0 ? divSlider.G : divDrawable4, (i11 & 2) != 0 ? divSlider.h() : list8, (i11 & 4) != 0 ? divSlider.I : divDrawable5, (i11 & 8) != 0 ? divSlider.J : divDrawable6, (i11 & 16) != 0 ? divSlider.l() : divTransform, (i11 & 32) != 0 ? divSlider.j() : divChangeTransition, (i11 & 64) != 0 ? divSlider.x() : divAppearanceTransition, (i11 & 128) != 0 ? divSlider.i() : divAppearanceTransition2, (i11 & 256) != 0 ? divSlider.m() : list9, (i11 & 512) != 0 ? divSlider.u() : list10, (i11 & 1024) != 0 ? divSlider.c() : list11, (i11 & 2048) != 0 ? divSlider.getVisibility() : expression10, (i11 & 4096) != 0 ? divSlider.v() : divVisibilityAction, (i11 & 8192) != 0 ? divSlider.a() : list12, (i11 & 16384) != 0 ? divSlider.getWidth() : divSize2);
    }

    public final boolean C(DivSlider divSlider, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean zA7;
        boolean z16;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean zA12;
        boolean z17;
        boolean zA13;
        boolean zA14;
        boolean zA15;
        boolean zA16;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean zG;
        boolean z21;
        if (divSlider == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divSlider.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divSlider.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divSlider.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divSlider.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divSlider.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divSlider.y();
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
            z10 = divSlider.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divSlider.getBackground();
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
            z11 = divSlider.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divSlider.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divSlider.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divSlider.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divSlider.k();
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
            z12 = divSlider.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divSlider.getExtensions();
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
            z13 = divSlider.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divSlider.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divSlider.p() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divSlider.w();
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
            z14 = divSlider.w() == null;
        }
        if (!z14 || !getHeight().a(divSlider.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divSlider.getId()) || this.f48886o.evaluate(expressionResolver).booleanValue() != divSlider.f48886o.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA4 = divLayoutProviderT.a(divSlider.t(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divSlider.t() == null;
        }
        if (!zA4) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA5 = divEdgeInsetsD.a(divSlider.d(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divSlider.d() == null;
        }
        if (!zA5 || this.f48889r.evaluate(expressionResolver).longValue() != divSlider.f48889r.evaluate(expressionResolver2).longValue() || this.f48890s.evaluate(expressionResolver).longValue() != divSlider.f48890s.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA6 = divEdgeInsetsR.a(divSlider.r(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divSlider.r() == null;
        }
        if (!zA6) {
            return false;
        }
        List<Range> list = this.f48892u;
        if (list != null) {
            List<Range> list2 = divSlider.f48892u;
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
                        if (((Range) next6).a(list2.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                }
            }
        } else {
            z15 = divSlider.f48892u == null;
        }
        if (!z15) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divSlider.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divSlider.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivAccessibility divAccessibility = this.f48895x;
        if (divAccessibility != null) {
            zA7 = divAccessibility.a(divSlider.f48895x, expressionResolver, expressionResolver2);
        } else {
            zA7 = divSlider.f48895x == null;
        }
        if (!zA7) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divSlider.s();
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
            z16 = divSlider.s() == null;
        }
        if (!z16) {
            return false;
        }
        DivDrawable divDrawable = this.f48897z;
        if (divDrawable != null) {
            zA8 = divDrawable.a(divSlider.f48897z, expressionResolver, expressionResolver2);
        } else {
            zA8 = divSlider.f48897z == null;
        }
        if (!zA8) {
            return false;
        }
        TextStyle textStyle = this.A;
        if (textStyle != null) {
            zA9 = textStyle.a(divSlider.A, expressionResolver, expressionResolver2);
        } else {
            zA9 = divSlider.A == null;
        }
        if (!zA9 || !ck.p.e(this.B, divSlider.B) || !this.C.a(divSlider.C, expressionResolver, expressionResolver2)) {
            return false;
        }
        TextStyle textStyle2 = this.D;
        if (textStyle2 != null) {
            zA10 = textStyle2.a(divSlider.D, expressionResolver, expressionResolver2);
        } else {
            zA10 = divSlider.D == null;
        }
        if (!zA10 || !ck.p.e(this.E, divSlider.E)) {
            return false;
        }
        DivDrawable divDrawable2 = this.F;
        if (divDrawable2 != null) {
            zA11 = divDrawable2.a(divSlider.F, expressionResolver, expressionResolver2);
        } else {
            zA11 = divSlider.F == null;
        }
        if (!zA11) {
            return false;
        }
        DivDrawable divDrawable3 = this.G;
        if (divDrawable3 != null) {
            zA12 = divDrawable3.a(divSlider.G, expressionResolver, expressionResolver2);
        } else {
            zA12 = divSlider.G == null;
        }
        if (!zA12) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divSlider.h();
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
            z17 = divSlider.h() == null;
        }
        if (!z17 || !this.I.a(divSlider.I, expressionResolver, expressionResolver2) || !this.J.a(divSlider.J, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA13 = divTransformL.a(divSlider.l(), expressionResolver, expressionResolver2);
        } else {
            zA13 = divSlider.l() == null;
        }
        if (!zA13) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA14 = divChangeTransitionJ.a(divSlider.j(), expressionResolver, expressionResolver2);
        } else {
            zA14 = divSlider.j() == null;
        }
        if (!zA14) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA15 = divAppearanceTransitionX.a(divSlider.x(), expressionResolver, expressionResolver2);
        } else {
            zA15 = divSlider.x() == null;
        }
        if (!zA15) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA16 = divAppearanceTransitionI.a(divSlider.i(), expressionResolver, expressionResolver2);
        } else {
            zA16 = divSlider.i() == null;
        }
        if (!zA16) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divSlider.m();
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
            z18 = divSlider.m() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divSlider.u();
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
            z19 = divSlider.u() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divSlider.c();
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
            z20 = divSlider.c() == null;
        }
        if (!z20 || getVisibility().evaluate(expressionResolver) != divSlider.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divSlider.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divSlider.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divSlider.a();
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
            z21 = divSlider.a() == null;
        }
        return z21 && getWidth().a(divSlider.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivSlider.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSlider a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().h7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        X = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Y = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f48867a0 = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f48868b0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48869c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f48870d0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f48871e0 = new bk.p<ParsingEnvironment, JSONObject, DivSlider>() { // from class: com.yandex.div2.DivSlider$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlider mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSlider.W.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public final DivSlider A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, DivSize divSize, String str, Expression<Boolean> expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression<Long> expression6, Expression<Long> expression7, DivEdgeInsets divEdgeInsets2, List<Range> list6, Expression<String> expression8, Expression<Long> expression9, DivAccessibility divAccessibility2, List<DivAction> list7, DivDrawable divDrawable, TextStyle textStyle, String str2, DivDrawable divDrawable2, TextStyle textStyle2, String str3, DivDrawable divDrawable3, DivDrawable divDrawable4, List<DivTooltip> list8, DivDrawable divDrawable5, DivDrawable divDrawable6, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression10, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        return new DivSlider(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, divLayoutProvider, divEdgeInsets, expression6, expression7, divEdgeInsets2, list6, expression8, expression9, divAccessibility2, list7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, list8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression10, divVisibilityAction, list12, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.T;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f48879h;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.Q;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f48888q;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.f48894w;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.f48893v;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f48873b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f48877f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f48881j;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f48884m;
    }

    @Override // oe.e2
    public String getId() {
        return this.f48885n;
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
        return this.H;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSlider.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash11 = 0;
        int iHash12 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash12 + (expressionG != null ? expressionG.hashCode() : 0);
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
        int iHashCode5 = iHash15 + (id2 != null ? id2.hashCode() : 0) + this.f48886o.hashCode();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash16 = iHashCode5 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash17 = iHash16 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0) + this.f48889r.hashCode() + this.f48890s.hashCode();
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash18 = iHash17 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        List<Range> list = this.f48892u;
        if (list != null) {
            Iterator<T> it6 = list.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((Range) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i14 = iHash18 + iHash6;
        Expression<String> expressionF = f();
        int iHashCode6 = i14 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0);
        DivAccessibility divAccessibility = this.f48895x;
        int iHash19 = iHashCode7 + (divAccessibility != null ? divAccessibility.hash() : 0);
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it7 = listS.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivAction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = iHash19 + iHash7;
        DivDrawable divDrawable = this.f48897z;
        int iHash20 = i15 + (divDrawable != null ? divDrawable.hash() : 0);
        TextStyle textStyle = this.A;
        int iHash21 = iHash20 + (textStyle != null ? textStyle.hash() : 0);
        String str = this.B;
        int iHashCode8 = iHash21 + (str != null ? str.hashCode() : 0) + this.C.hash();
        TextStyle textStyle2 = this.D;
        int iHash22 = iHashCode8 + (textStyle2 != null ? textStyle2.hash() : 0);
        String str2 = this.E;
        int iHashCode9 = iHash22 + (str2 != null ? str2.hashCode() : 0);
        DivDrawable divDrawable2 = this.F;
        int iHash23 = iHashCode9 + (divDrawable2 != null ? divDrawable2.hash() : 0);
        DivDrawable divDrawable3 = this.G;
        int iHash24 = iHash23 + (divDrawable3 != null ? divDrawable3.hash() : 0);
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it8 = listH.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHash25 = iHash24 + iHash8 + this.I.hash() + this.J.hash();
        DivTransform divTransformL = l();
        int iHash26 = iHash25 + (divTransformL != null ? divTransformL.hash() : 0);
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
            Iterator<T> it9 = listU.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i16 = iHashCode10 + iHash9;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it10 = listC.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivVariable) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int iHashCode11 = i16 + iHash10 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash30 = iHashCode11 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it11 = listA.iterator();
            while (it11.hasNext()) {
                iHash11 += ((DivVisibilityAction) it11.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash11 + getWidth().hash();
        this.V = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.N;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.L;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f48880i;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.K;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.O;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f48874c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f48875d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f48882k;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f48872a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f48891t;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.f48896y;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f48887p;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.P;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.S;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f48883l;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.M;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f48876e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f48878g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
