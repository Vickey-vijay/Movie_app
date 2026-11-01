package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradient.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivRadialGradient implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48425g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DivRadialGradientCenter.c f48426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DivRadialGradientCenter.c f48427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final DivRadialGradientRadius.c f48428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradient> f48429k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivRadialGradientCenter f48430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivRadialGradientCenter f48431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ColorPoint> f48432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExpressionList<Integer> f48433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DivRadialGradientRadius f48434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f48435f;

    /* JADX INFO: compiled from: DivRadialGradient.kt */
    public static final class ColorPoint implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f48436d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ColorPoint> f48437e = new bk.p<ParsingEnvironment, JSONObject, ColorPoint>() { // from class: com.yandex.div2.DivRadialGradient$ColorPoint$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradient.ColorPoint mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivRadialGradient.ColorPoint.f48436d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Integer> f48438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Double> f48439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48440c;

        public final boolean a(ColorPoint colorPoint, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (colorPoint != null && this.f48438a.evaluate(expressionResolver).intValue() == colorPoint.f48438a.evaluate(expressionResolver2).intValue()) {
                return (this.f48439b.evaluate(expressionResolver).doubleValue() > colorPoint.f48439b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f48439b.evaluate(expressionResolver).doubleValue() == colorPoint.f48439b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
            }
            return false;
        }

        /* JADX INFO: compiled from: DivRadialGradient.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final ColorPoint a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().f6().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48440c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(ColorPoint.class).hashCode() + this.f48438a.hashCode() + this.f48439b.hashCode();
            this.f48440c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        public ColorPoint(Expression<Integer> expression, Expression<Double> expression2) {
            this.f48438a = expression;
            this.f48439b = expression2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().f6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public DivRadialGradient() {
        this(null, null, null, null, null, 31, null);
    }

    public DivRadialGradient(DivRadialGradientCenter divRadialGradientCenter, DivRadialGradientCenter divRadialGradientCenter2, List<ColorPoint> list, ExpressionList<Integer> expressionList, DivRadialGradientRadius divRadialGradientRadius) {
        this.f48430a = divRadialGradientCenter;
        this.f48431b = divRadialGradientCenter2;
        this.f48432c = list;
        this.f48433d = expressionList;
        this.f48434e = divRadialGradientRadius;
    }

    public final boolean a(DivRadialGradient divRadialGradient, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        List<Integer> listEvaluate;
        List<Integer> listEvaluate2;
        if (divRadialGradient == null || !this.f48430a.a(divRadialGradient.f48430a, expressionResolver, expressionResolver2) || !this.f48431b.a(divRadialGradient.f48431b, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<ColorPoint> list = this.f48432c;
        if (list != null) {
            List<ColorPoint> list2 = divRadialGradient.f48432c;
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
                        if (((ColorPoint) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divRadialGradient.f48432c == null;
        }
        if (!z10) {
            return false;
        }
        ExpressionList<Integer> expressionList = this.f48433d;
        if (expressionList == null || (listEvaluate = expressionList.evaluate(expressionResolver)) == null) {
            z11 = divRadialGradient.f48433d == null;
        } else {
            ExpressionList<Integer> expressionList2 = divRadialGradient.f48433d;
            if (expressionList2 == null || (listEvaluate2 = expressionList2.evaluate(expressionResolver2)) == null) {
                return false;
            }
            if (listEvaluate.size() == listEvaluate2.size()) {
                Iterator<T> it2 = listEvaluate.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((Number) next2).intValue() == listEvaluate2.get(i12).intValue()) {
                            i12 = i13;
                        }
                    }
                }
            }
        }
        return z11 && this.f48434e.a(divRadialGradient.f48434e, expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivRadialGradient.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRadialGradient a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().l6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        f48426h = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f48427i = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f48428j = new DivRadialGradientRadius.c(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        f48429k = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradient>() { // from class: com.yandex.div2.DivRadialGradient$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradient mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivRadialGradient.f48425g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48435f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivRadialGradient.class).hashCode() + this.f48430a.hash() + this.f48431b.hash();
        List<ColorPoint> list = this.f48432c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((ColorPoint) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        ExpressionList<Integer> expressionList = this.f48433d;
        int iHashCode2 = i10 + (expressionList != null ? expressionList.hashCode() : 0) + this.f48434e.hash();
        this.f48435f = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivRadialGradient(DivRadialGradientCenter divRadialGradientCenter, DivRadialGradientCenter divRadialGradientCenter2, List list, ExpressionList expressionList, DivRadialGradientRadius divRadialGradientRadius, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f48426h : divRadialGradientCenter, (i10 & 2) != 0 ? f48427i : divRadialGradientCenter2, (i10 & 4) != 0 ? null : list, (i10 & 8) == 0 ? expressionList : null, (i10 & 16) != 0 ? f48428j : divRadialGradientRadius);
    }
}
