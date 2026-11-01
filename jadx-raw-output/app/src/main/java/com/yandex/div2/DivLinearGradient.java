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

/* JADX INFO: compiled from: DivLinearGradient.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivLinearGradient implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48035e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Long> f48036f = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivLinearGradient> f48037g = new bk.p<ParsingEnvironment, JSONObject, DivLinearGradient>() { // from class: com.yandex.div2.DivLinearGradient$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLinearGradient mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivLinearGradient.f48035e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f48038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ColorPoint> f48039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExpressionList<Integer> f48040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f48041d;

    /* JADX INFO: compiled from: DivLinearGradient.kt */
    public static final class ColorPoint implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f48042d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ColorPoint> f48043e = new bk.p<ParsingEnvironment, JSONObject, ColorPoint>() { // from class: com.yandex.div2.DivLinearGradient$ColorPoint$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivLinearGradient.ColorPoint mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivLinearGradient.ColorPoint.f48042d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Integer> f48044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<Double> f48045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48046c;

        public final boolean a(ColorPoint colorPoint, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (colorPoint != null && this.f48044a.evaluate(expressionResolver).intValue() == colorPoint.f48044a.evaluate(expressionResolver2).intValue()) {
                return (this.f48045b.evaluate(expressionResolver).doubleValue() > colorPoint.f48045b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f48045b.evaluate(expressionResolver).doubleValue() == colorPoint.f48045b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
            }
            return false;
        }

        /* JADX INFO: compiled from: DivLinearGradient.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final ColorPoint a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().S4().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48046c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(ColorPoint.class).hashCode() + this.f48044a.hashCode() + this.f48045b.hashCode();
            this.f48046c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        public ColorPoint(Expression<Integer> expression, Expression<Double> expression2) {
            this.f48044a = expression;
            this.f48045b = expression2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().S4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public DivLinearGradient() {
        this(null, null, null, 7, null);
    }

    public DivLinearGradient(Expression<Long> expression, List<ColorPoint> list, ExpressionList<Integer> expressionList) {
        this.f48038a = expression;
        this.f48039b = list;
        this.f48040c = expressionList;
    }

    public final boolean a(DivLinearGradient divLinearGradient, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        List<Integer> listEvaluate;
        List<Integer> listEvaluate2;
        if (divLinearGradient == null || this.f48038a.evaluate(expressionResolver).longValue() != divLinearGradient.f48038a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<ColorPoint> list = this.f48039b;
        if (list != null) {
            List<ColorPoint> list2 = divLinearGradient.f48039b;
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
            z10 = divLinearGradient.f48039b == null;
        }
        if (!z10) {
            return false;
        }
        ExpressionList<Integer> expressionList = this.f48040c;
        if (expressionList == null || (listEvaluate = expressionList.evaluate(expressionResolver)) == null) {
            z11 = divLinearGradient.f48040c == null;
        } else {
            ExpressionList<Integer> expressionList2 = divLinearGradient.f48040c;
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
        return z11;
    }

    /* JADX INFO: compiled from: DivLinearGradient.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivLinearGradient a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().V4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48041d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivLinearGradient.class).hashCode() + this.f48038a.hashCode();
        List<ColorPoint> list = this.f48039b;
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
        ExpressionList<Integer> expressionList = this.f48040c;
        int iHashCode2 = i10 + (expressionList != null ? expressionList.hashCode() : 0);
        this.f48041d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivLinearGradient(Expression expression, List list, ExpressionList expressionList, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f48036f : expression, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : expressionList);
    }
}
