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

/* JADX INFO: compiled from: DivTabs.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTabs implements JSONSerializable, Hashable, oe.e2 {
    public static final a T = new a(null);
    public static final Expression<Double> U;
    public static final Expression<Boolean> V;
    public static final Expression<Boolean> W;
    public static final DivSize.d X;
    public static final Expression<Boolean> Y;
    public static final Expression<Long> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Expression<Integer> f49241a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final DivEdgeInsets f49242b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Expression<Boolean> f49243c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final DivEdgeInsets f49244d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Expression<DivVisibility> f49245e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final DivSize.c f49246f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTabs> f49247g0;
    public final DivEdgeInsets A;
    public final Expression<Boolean> B;
    public final TabTitleDelimiter C;
    public final TabTitleStyle D;
    public final DivEdgeInsets E;
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
    public final DivAccessibility f49248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f49249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f49250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f49251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f49252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DivBackground> f49253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DivBorder f49254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression<Long> f49255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<DivDisappearAction> f49256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Boolean> f49257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DivExtension> f49258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DivFocus f49259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DivFunction> f49260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression<Boolean> f49261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DivSize f49262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f49263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<Item> f49264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DivLayoutProvider f49265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DivEdgeInsets f49266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DivEdgeInsets f49267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<Boolean> f49268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Expression<String> f49269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Expression<Long> f49270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<DivAction> f49271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression<Long> f49272y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression<Integer> f49273z;

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class Item implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f49274e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Item> f49275f = new bk.p<ParsingEnvironment, JSONObject, Item>() { // from class: com.yandex.div2.DivTabs$Item$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabs.Item mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivTabs.Item.f49274e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Div f49276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<String> f49277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivAction f49278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f49279d;

        public final boolean c(Item item, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            if (item == null || !this.f49276a.a(item.f49276a, expressionResolver, expressionResolver2) || !ck.p.e(this.f49277b.evaluate(expressionResolver), item.f49277b.evaluate(expressionResolver2))) {
                return false;
            }
            DivAction divAction = this.f49278c;
            DivAction divAction2 = item.f49278c;
            if (divAction != null) {
                zA = divAction.a(divAction2, expressionResolver, expressionResolver2);
            } else {
                zA = divAction2 == null;
            }
            return zA;
        }

        /* JADX INFO: compiled from: DivTabs.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Item a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().R7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item b(Item item, Div div, Expression expression, DivAction divAction, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                div = item.f49276a;
            }
            if ((i10 & 2) != 0) {
                expression = item.f49277b;
            }
            if ((i10 & 4) != 0) {
                divAction = item.f49278c;
            }
            return item.a(div, expression, divAction);
        }

        public final Item a(Div div, Expression<String> expression, DivAction divAction) {
            return new Item(div, expression, divAction);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f49279d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Item.class).hashCode() + this.f49276a.hash() + this.f49277b.hashCode();
            DivAction divAction = this.f49278c;
            int iHash = iHashCode + (divAction != null ? divAction.hash() : 0);
            this.f49279d = Integer.valueOf(iHash);
            return iHash;
        }

        public Item(Div div, Expression<String> expression, DivAction divAction) {
            this.f49276a = div;
            this.f49277b = expression;
            this.f49278c = divAction;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().R7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class TabTitleDelimiter implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f49280e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final DivFixedSize f49281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final DivFixedSize f49282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, TabTitleDelimiter> f49283h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DivFixedSize f49284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Uri> f49285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFixedSize f49286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f49287d;

        public final boolean a(TabTitleDelimiter tabTitleDelimiter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return tabTitleDelimiter != null && this.f49284a.a(tabTitleDelimiter.f49284a, expressionResolver, expressionResolver2) && ck.p.e(this.f49285b.evaluate(expressionResolver), tabTitleDelimiter.f49285b.evaluate(expressionResolver2)) && this.f49286c.a(tabTitleDelimiter.f49286c, expressionResolver, expressionResolver2);
        }

        /* JADX INFO: compiled from: DivTabs.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final TabTitleDelimiter a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().X7().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            int i10 = 1;
            f49281f = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f49282g = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, null == true ? 1 : 0);
            f49283h = new bk.p<ParsingEnvironment, JSONObject, TabTitleDelimiter>() { // from class: com.yandex.div2.DivTabs$TabTitleDelimiter$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabs.TabTitleDelimiter mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivTabs.TabTitleDelimiter.f49280e.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f49287d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(TabTitleDelimiter.class).hashCode() + this.f49284a.hash() + this.f49285b.hashCode() + this.f49286c.hash();
            this.f49287d = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        public TabTitleDelimiter(DivFixedSize divFixedSize, Expression<Uri> expression, DivFixedSize divFixedSize2) {
            this.f49284a = divFixedSize;
            this.f49285b = expression;
            this.f49286c = divFixedSize2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().X7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class TabTitleStyle implements JSONSerializable, Hashable {
        public static final Expression<Long> A;
        public static final Expression<DivSizeUnit> B;
        public static final Expression<DivFontWeight> C;
        public static final Expression<Integer> D;
        public static final Expression<Long> E;
        public static final Expression<Double> F;
        public static final DivEdgeInsets G;
        public static final bk.p<ParsingEnvironment, JSONObject, TabTitleStyle> H;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f49288v = new a(null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final Expression<Integer> f49289w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Expression<Integer> f49290x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Expression<Long> f49291y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Expression<AnimationType> f49292z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Integer> f49293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<JSONObject> f49294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<DivFontWeight> f49295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<Integer> f49296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression<Long> f49297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression<AnimationType> f49298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression<Long> f49299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final DivCornersRadius f49300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression<String> f49301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Expression<Long> f49302j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Expression<DivSizeUnit> f49303k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Expression<DivFontWeight> f49304l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Expression<Integer> f49305m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Expression<JSONObject> f49306n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Expression<DivFontWeight> f49307o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Expression<Integer> f49308p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Expression<Long> f49309q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Expression<Double> f49310r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Expression<Long> f49311s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final DivEdgeInsets f49312t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Integer f49313u;

        /* JADX INFO: compiled from: DivTabs.kt */
        public enum AnimationType {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");

            private final String value;
            public static final a Converter = new a(null);
            public static final bk.l<AnimationType, String> TO_STRING = new bk.l<AnimationType, String>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$TO_STRING$1
                @Override // bk.l
                public final String invoke(DivTabs.TabTitleStyle.AnimationType animationType) {
                    return DivTabs.TabTitleStyle.AnimationType.Converter.b(animationType);
                }
            };
            public static final bk.l<String, AnimationType> FROM_STRING = new bk.l<String, AnimationType>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$FROM_STRING$1
                @Override // bk.l
                public final DivTabs.TabTitleStyle.AnimationType invoke(String str) {
                    return DivTabs.TabTitleStyle.AnimationType.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivTabs.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }

                public final AnimationType a(String str) {
                    AnimationType animationType = AnimationType.SLIDE;
                    if (ck.p.e(str, animationType.value)) {
                        return animationType;
                    }
                    AnimationType animationType2 = AnimationType.FADE;
                    if (ck.p.e(str, animationType2.value)) {
                        return animationType2;
                    }
                    AnimationType animationType3 = AnimationType.NONE;
                    if (ck.p.e(str, animationType3.value)) {
                        return animationType3;
                    }
                    return null;
                }

                public final String b(AnimationType animationType) {
                    return animationType.value;
                }
            }

            AnimationType(String str) {
                this.value = str;
            }
        }

        public TabTitleStyle() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        }

        public TabTitleStyle(Expression<Integer> expression, Expression<JSONObject> expression2, Expression<DivFontWeight> expression3, Expression<Integer> expression4, Expression<Long> expression5, Expression<AnimationType> expression6, Expression<Long> expression7, DivCornersRadius divCornersRadius, Expression<String> expression8, Expression<Long> expression9, Expression<DivSizeUnit> expression10, Expression<DivFontWeight> expression11, Expression<Integer> expression12, Expression<JSONObject> expression13, Expression<DivFontWeight> expression14, Expression<Integer> expression15, Expression<Long> expression16, Expression<Double> expression17, Expression<Long> expression18, DivEdgeInsets divEdgeInsets) {
            this.f49293a = expression;
            this.f49294b = expression2;
            this.f49295c = expression3;
            this.f49296d = expression4;
            this.f49297e = expression5;
            this.f49298f = expression6;
            this.f49299g = expression7;
            this.f49300h = divCornersRadius;
            this.f49301i = expression8;
            this.f49302j = expression9;
            this.f49303k = expression10;
            this.f49304l = expression11;
            this.f49305m = expression12;
            this.f49306n = expression13;
            this.f49307o = expression14;
            this.f49308p = expression15;
            this.f49309q = expression16;
            this.f49310r = expression17;
            this.f49311s = expression18;
            this.f49312t = divEdgeInsets;
        }

        public final boolean a(TabTitleStyle tabTitleStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            if (tabTitleStyle == null || this.f49293a.evaluate(expressionResolver).intValue() != tabTitleStyle.f49293a.evaluate(expressionResolver2).intValue()) {
                return false;
            }
            Expression<JSONObject> expression = this.f49294b;
            JSONObject jSONObjectEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression2 = tabTitleStyle.f49294b;
            if (!ck.p.e(jSONObjectEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression3 = this.f49295c;
            DivFontWeight divFontWeightEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression4 = tabTitleStyle.f49295c;
            if (divFontWeightEvaluate != (expression4 != null ? expression4.evaluate(expressionResolver2) : null) || this.f49296d.evaluate(expressionResolver).intValue() != tabTitleStyle.f49296d.evaluate(expressionResolver2).intValue() || this.f49297e.evaluate(expressionResolver).longValue() != tabTitleStyle.f49297e.evaluate(expressionResolver2).longValue() || this.f49298f.evaluate(expressionResolver) != tabTitleStyle.f49298f.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<Long> expression5 = this.f49299g;
            Long lEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<Long> expression6 = tabTitleStyle.f49299g;
            if (!ck.p.e(lEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivCornersRadius divCornersRadius = this.f49300h;
            if (divCornersRadius != null) {
                zA = divCornersRadius.a(tabTitleStyle.f49300h, expressionResolver, expressionResolver2);
            } else {
                zA = tabTitleStyle.f49300h == null;
            }
            if (!zA) {
                return false;
            }
            Expression<String> expression7 = this.f49301i;
            String strEvaluate = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = tabTitleStyle.f49301i;
            if (!ck.p.e(strEvaluate, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.f49302j.evaluate(expressionResolver).longValue() != tabTitleStyle.f49302j.evaluate(expressionResolver2).longValue() || this.f49303k.evaluate(expressionResolver) != tabTitleStyle.f49303k.evaluate(expressionResolver2) || this.f49304l.evaluate(expressionResolver) != tabTitleStyle.f49304l.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<Integer> expression9 = this.f49305m;
            Integer numEvaluate = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<Integer> expression10 = tabTitleStyle.f49305m;
            if (!ck.p.e(numEvaluate, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<JSONObject> expression11 = this.f49306n;
            JSONObject jSONObjectEvaluate2 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression12 = tabTitleStyle.f49306n;
            if (!ck.p.e(jSONObjectEvaluate2, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression13 = this.f49307o;
            DivFontWeight divFontWeightEvaluate2 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression14 = tabTitleStyle.f49307o;
            if (divFontWeightEvaluate2 != (expression14 != null ? expression14.evaluate(expressionResolver2) : null) || this.f49308p.evaluate(expressionResolver).intValue() != tabTitleStyle.f49308p.evaluate(expressionResolver2).intValue() || this.f49309q.evaluate(expressionResolver).longValue() != tabTitleStyle.f49309q.evaluate(expressionResolver2).longValue()) {
                return false;
            }
            if (!(this.f49310r.evaluate(expressionResolver).doubleValue() == tabTitleStyle.f49310r.evaluate(expressionResolver2).doubleValue())) {
                return false;
            }
            Expression<Long> expression15 = this.f49311s;
            Long lEvaluate2 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
            Expression<Long> expression16 = tabTitleStyle.f49311s;
            return ck.p.e(lEvaluate2, expression16 != null ? expression16.evaluate(expressionResolver2) : null) && this.f49312t.a(tabTitleStyle.f49312t, expressionResolver, expressionResolver2);
        }

        /* JADX INFO: compiled from: DivTabs.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final TabTitleStyle a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().a8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f49289w = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            f49290x = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            f49291y = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            f49292z = Expression.Companion.constant$default(companion, AnimationType.SLIDE, null, 2, null);
            A = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            B = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            C = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            D = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            E = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            F = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            G = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            H = new bk.p<ParsingEnvironment, JSONObject, TabTitleStyle>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTabs.TabTitleStyle mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivTabs.TabTitleStyle.f49288v.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f49313u;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(TabTitleStyle.class).hashCode() + this.f49293a.hashCode();
            Expression<JSONObject> expression = this.f49294b;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            Expression<DivFontWeight> expression2 = this.f49295c;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f49296d.hashCode() + this.f49297e.hashCode() + this.f49298f.hashCode();
            Expression<Long> expression3 = this.f49299g;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            DivCornersRadius divCornersRadius = this.f49300h;
            int iHash = iHashCode4 + (divCornersRadius != null ? divCornersRadius.hash() : 0);
            Expression<String> expression4 = this.f49301i;
            int iHashCode5 = iHash + (expression4 != null ? expression4.hashCode() : 0) + this.f49302j.hashCode() + this.f49303k.hashCode() + this.f49304l.hashCode();
            Expression<Integer> expression5 = this.f49305m;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            Expression<JSONObject> expression6 = this.f49306n;
            int iHashCode7 = iHashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression<DivFontWeight> expression7 = this.f49307o;
            int iHashCode8 = iHashCode7 + (expression7 != null ? expression7.hashCode() : 0) + this.f49308p.hashCode() + this.f49309q.hashCode() + this.f49310r.hashCode();
            Expression<Long> expression8 = this.f49311s;
            int iHashCode9 = iHashCode8 + (expression8 != null ? expression8.hashCode() : 0) + this.f49312t.hash();
            this.f49313u = Integer.valueOf(iHashCode9);
            return iHashCode9;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().a8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ TabTitleStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DivCornersRadius divCornersRadius, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? f49289w : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? f49290x : expression4, (i10 & 16) != 0 ? f49291y : expression5, (i10 & 32) != 0 ? f49292z : expression6, (i10 & 64) != 0 ? null : expression7, (i10 & 128) != 0 ? null : divCornersRadius, (i10 & 256) != 0 ? null : expression8, (i10 & 512) != 0 ? A : expression9, (i10 & 1024) != 0 ? B : expression10, (i10 & 2048) != 0 ? C : expression11, (i10 & 4096) != 0 ? null : expression12, (i10 & 8192) != 0 ? null : expression13, (i10 & 16384) != 0 ? null : expression14, (i10 & 32768) != 0 ? D : expression15, (i10 & 65536) != 0 ? E : expression16, (i10 & 131072) != 0 ? F : expression17, (i10 & 262144) != 0 ? null : expression18, (i10 & 524288) != 0 ? G : divEdgeInsets);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivTabs(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, Expression<Boolean> expression5, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, Expression<Boolean> expression6, DivSize divSize, String str, List<Item> list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<Boolean> expression7, Expression<String> expression8, Expression<Long> expression9, List<DivAction> list7, Expression<Long> expression10, Expression<Integer> expression11, DivEdgeInsets divEdgeInsets3, Expression<Boolean> expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression13, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        this.f49248a = divAccessibility;
        this.f49249b = expression;
        this.f49250c = expression2;
        this.f49251d = expression3;
        this.f49252e = list;
        this.f49253f = list2;
        this.f49254g = divBorder;
        this.f49255h = expression4;
        this.f49256i = list3;
        this.f49257j = expression5;
        this.f49258k = list4;
        this.f49259l = divFocus;
        this.f49260m = list5;
        this.f49261n = expression6;
        this.f49262o = divSize;
        this.f49263p = str;
        this.f49264q = list6;
        this.f49265r = divLayoutProvider;
        this.f49266s = divEdgeInsets;
        this.f49267t = divEdgeInsets2;
        this.f49268u = expression7;
        this.f49269v = expression8;
        this.f49270w = expression9;
        this.f49271x = list7;
        this.f49272y = expression10;
        this.f49273z = expression11;
        this.A = divEdgeInsets3;
        this.B = expression12;
        this.C = tabTitleDelimiter;
        this.D = tabTitleStyle;
        this.E = divEdgeInsets4;
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

    public final boolean C(DivTabs divTabs, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean zA7;
        boolean zA8;
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
        if (divTabs == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divTabs.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divTabs.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divTabs.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divTabs.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divTabs.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divTabs.y();
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
            z10 = divTabs.y() == null;
        }
        if (!z10) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divTabs.getBackground();
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
            z11 = divTabs.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divTabs.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divTabs.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divTabs.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divTabs.k();
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
            z12 = divTabs.k() == null;
        }
        if (!z12 || this.f49257j.evaluate(expressionResolver).booleanValue() != divTabs.f49257j.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divTabs.getExtensions();
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
            z13 = divTabs.getExtensions() == null;
        }
        if (!z13) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divTabs.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divTabs.p() == null;
        }
        if (!zA3) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divTabs.w();
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
            z14 = divTabs.w() == null;
        }
        if (!z14 || this.f49261n.evaluate(expressionResolver).booleanValue() != divTabs.f49261n.evaluate(expressionResolver2).booleanValue() || !getHeight().a(divTabs.getHeight(), expressionResolver, expressionResolver2) || !ck.p.e(getId(), divTabs.getId())) {
            return false;
        }
        List<Item> list = this.f49264q;
        List<Item> list2 = divTabs.f49264q;
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
                if (!((Item) next6).c(list2.get(i20), expressionResolver, expressionResolver2)) {
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
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA4 = divLayoutProviderT.a(divTabs.t(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divTabs.t() == null;
        }
        if (!zA4) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA5 = divEdgeInsetsD.a(divTabs.d(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divTabs.d() == null;
        }
        if (!zA5) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA6 = divEdgeInsetsR.a(divTabs.r(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divTabs.r() == null;
        }
        if (!zA6 || this.f49268u.evaluate(expressionResolver).booleanValue() != divTabs.f49268u.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divTabs.f();
        if (!ck.p.e(strEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate2 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divTabs.e();
        if (!ck.p.e(lEvaluate2, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divTabs.s();
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
            z16 = divTabs.s() == null;
        }
        if (!z16 || this.f49272y.evaluate(expressionResolver).longValue() != divTabs.f49272y.evaluate(expressionResolver2).longValue() || this.f49273z.evaluate(expressionResolver).intValue() != divTabs.f49273z.evaluate(expressionResolver2).intValue() || !this.A.a(divTabs.A, expressionResolver, expressionResolver2) || this.B.evaluate(expressionResolver).booleanValue() != divTabs.B.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        TabTitleDelimiter tabTitleDelimiter = this.C;
        if (tabTitleDelimiter != null) {
            zA7 = tabTitleDelimiter.a(divTabs.C, expressionResolver, expressionResolver2);
        } else {
            zA7 = divTabs.C == null;
        }
        if (!zA7) {
            return false;
        }
        TabTitleStyle tabTitleStyle = this.D;
        if (tabTitleStyle != null) {
            zA8 = tabTitleStyle.a(divTabs.D, expressionResolver, expressionResolver2);
        } else {
            zA8 = divTabs.D == null;
        }
        if (!zA8 || !this.E.a(divTabs.E, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divTabs.h();
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
            z17 = divTabs.h() == null;
        }
        if (!z17) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA9 = divTransformL.a(divTabs.l(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divTabs.l() == null;
        }
        if (!zA9) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA10 = divChangeTransitionJ.a(divTabs.j(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divTabs.j() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA11 = divAppearanceTransitionX.a(divTabs.x(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divTabs.x() == null;
        }
        if (!zA11) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA12 = divAppearanceTransitionI.a(divTabs.i(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divTabs.i() == null;
        }
        if (!zA12) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divTabs.m();
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
            z18 = divTabs.m() == null;
        }
        if (!z18) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divTabs.u();
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
            z19 = divTabs.u() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divTabs.c();
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
            z20 = divTabs.c() == null;
        }
        if (!z20 || getVisibility().evaluate(expressionResolver) != divTabs.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divTabs.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divTabs.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divTabs.a();
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
            z21 = divTabs.a() == null;
        }
        return z21 && getWidth().a(divTabs.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivTabs.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTabs a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().U7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        V = Expression.Companion.constant$default(companion, bool, null, 2, null);
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f49241a0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression expression = null;
        Expression expression2 = null;
        int i10 = 82;
        ck.i iVar = null;
        f49242b0 = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f49243c0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49244d0 = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f49245e0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f49246f0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        f49247g0 = new bk.p<ParsingEnvironment, JSONObject, DivTabs>() { // from class: com.yandex.div2.DivTabs$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTabs mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivTabs.T.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivTabs B(DivTabs divTabs, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, Expression expression5, List list4, DivFocus divFocus, List list5, Expression expression6, DivSize divSize, String str, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, DivEdgeInsets divEdgeInsets3, Expression expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression13, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divTabs.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divTabs.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divTabs.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divTabs.o() : expression3;
        List listY = (i10 & 16) != 0 ? divTabs.y() : list;
        List background = (i10 & 32) != 0 ? divTabs.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 64) != 0 ? divTabs.z() : divBorder;
        Expression expressionB = (i10 & 128) != 0 ? divTabs.b() : expression4;
        List listK = (i10 & 256) != 0 ? divTabs.k() : list3;
        Expression expression14 = (i10 & 512) != 0 ? divTabs.f49257j : expression5;
        List extensions = (i10 & 1024) != 0 ? divTabs.getExtensions() : list4;
        DivFocus divFocusP = (i10 & 2048) != 0 ? divTabs.p() : divFocus;
        List listW = (i10 & 4096) != 0 ? divTabs.w() : list5;
        Expression expression15 = (i10 & 8192) != 0 ? divTabs.f49261n : expression6;
        DivSize height = (i10 & 16384) != 0 ? divTabs.getHeight() : divSize;
        String id2 = (i10 & 32768) != 0 ? divTabs.getId() : str;
        DivSize divSize3 = height;
        List list13 = (i10 & 65536) != 0 ? divTabs.f49264q : list6;
        return divTabs.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, background, divBorderZ, expressionB, listK, expression14, extensions, divFocusP, listW, expression15, divSize3, id2, list13, (i10 & 131072) != 0 ? divTabs.t() : divLayoutProvider, (i10 & 262144) != 0 ? divTabs.d() : divEdgeInsets, (i10 & 524288) != 0 ? divTabs.r() : divEdgeInsets2, (i10 & 1048576) != 0 ? divTabs.f49268u : expression7, (i10 & 2097152) != 0 ? divTabs.f() : expression8, (i10 & 4194304) != 0 ? divTabs.e() : expression9, (i10 & 8388608) != 0 ? divTabs.s() : list7, (i10 & 16777216) != 0 ? divTabs.f49272y : expression10, (i10 & 33554432) != 0 ? divTabs.f49273z : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divTabs.A : divEdgeInsets3, (i10 & 134217728) != 0 ? divTabs.B : expression12, (i10 & 268435456) != 0 ? divTabs.C : tabTitleDelimiter, (i10 & 536870912) != 0 ? divTabs.D : tabTitleStyle, (i10 & 1073741824) != 0 ? divTabs.E : divEdgeInsets4, (i10 & Integer.MIN_VALUE) != 0 ? divTabs.h() : list8, (i11 & 1) != 0 ? divTabs.l() : divTransform, (i11 & 2) != 0 ? divTabs.j() : divChangeTransition, (i11 & 4) != 0 ? divTabs.x() : divAppearanceTransition, (i11 & 8) != 0 ? divTabs.i() : divAppearanceTransition2, (i11 & 16) != 0 ? divTabs.m() : list9, (i11 & 32) != 0 ? divTabs.u() : list10, (i11 & 64) != 0 ? divTabs.c() : list11, (i11 & 128) != 0 ? divTabs.getVisibility() : expression13, (i11 & 256) != 0 ? divTabs.v() : divVisibilityAction, (i11 & 512) != 0 ? divTabs.a() : list12, (i11 & 1024) != 0 ? divTabs.getWidth() : divSize2);
    }

    public final DivTabs A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression4, List<DivDisappearAction> list3, Expression<Boolean> expression5, List<DivExtension> list4, DivFocus divFocus, List<DivFunction> list5, Expression<Boolean> expression6, DivSize divSize, String str, List<Item> list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression<Boolean> expression7, Expression<String> expression8, Expression<Long> expression9, List<DivAction> list7, Expression<Long> expression10, Expression<Integer> expression11, DivEdgeInsets divEdgeInsets3, Expression<Boolean> expression12, TabTitleDelimiter tabTitleDelimiter, TabTitleStyle tabTitleStyle, DivEdgeInsets divEdgeInsets4, List<DivTooltip> list8, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends DivVariable> list11, Expression<DivVisibility> expression13, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list12, DivSize divSize2) {
        return new DivTabs(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, expression5, list4, divFocus, list5, expression6, divSize, str, list6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression7, expression8, expression9, list7, expression10, expression11, divEdgeInsets3, expression12, tabTitleDelimiter, tabTitleStyle, divEdgeInsets4, list8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression13, divVisibilityAction, list12, divSize2);
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.P;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f49255h;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.M;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.f49266s;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.f49270w;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.f49269v;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f49249b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f49253f;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f49258k;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f49262o;
    }

    @Override // oe.e2
    public String getId() {
        return this.f49263p;
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
        int iHash = 0;
        Iterator<T> it = this.f49264q.iterator();
        while (it.hasNext()) {
            iHash += ((Item) it.next()).hash();
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
        return this.f49256i;
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
        return this.f49250c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f49251d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f49259l;
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
        int iHashCode = ck.s.b(DivTabs.class).hashCode();
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
        int iHashCode5 = iHashCode4 + iHash3 + this.f49257j.hashCode();
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
        int i12 = iHashCode5 + iHash4;
        DivFocus divFocusP = p();
        int iHash13 = i12 + (divFocusP != null ? divFocusP.hash() : 0);
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
        int iHashCode6 = iHash13 + iHash5 + this.f49261n.hashCode() + getHeight().hash();
        String id2 = getId();
        int iHashCode7 = iHashCode6 + (id2 != null ? id2.hashCode() : 0);
        DivLayoutProvider divLayoutProviderT = t();
        int iHash14 = iHashCode7 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash15 = iHash14 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash16 = iHash15 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0) + this.f49268u.hashCode();
        Expression<String> expressionF = f();
        int iHashCode8 = iHash16 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0);
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
        int iHashCode10 = iHashCode9 + iHash6 + this.f49272y.hashCode() + this.f49273z.hashCode() + this.A.hash() + this.B.hashCode();
        TabTitleDelimiter tabTitleDelimiter = this.C;
        int iHash17 = iHashCode10 + (tabTitleDelimiter != null ? tabTitleDelimiter.hash() : 0);
        TabTitleStyle tabTitleStyle = this.D;
        int iHash18 = iHash17 + (tabTitleStyle != null ? tabTitleStyle.hash() : 0) + this.E.hash();
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
        int i13 = iHash18 + iHash7;
        DivTransform divTransformL = l();
        int iHash19 = i13 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash20 = iHash19 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash21 = iHash20 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash22 = iHash21 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode11 = iHash22 + (listM != null ? listM.hashCode() : 0);
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
        int i14 = iHashCode11 + iHash8;
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
        int iHashCode12 = i14 + iHash9 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash23 = iHashCode12 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((DivVisibilityAction) it10.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash24);
        return iHash24;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f49248a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.f49267t;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.f49271x;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.f49265r;
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
        return this.f49260m;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.I;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f49252e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f49254g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
