package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationSlide.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivPageTransformationSlide implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48192g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Double> f48194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Double> f48195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Double> f48196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Double> f48197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageTransformationSlide> f48198m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f48199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Double> f48200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Double> f48201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f48202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Double> f48203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f48204f;

    public DivPageTransformationSlide() {
        this(null, null, null, null, null, 31, null);
    }

    public DivPageTransformationSlide(Expression<DivAnimationInterpolator> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5) {
        this.f48199a = expression;
        this.f48200b = expression2;
        this.f48201c = expression3;
        this.f48202d = expression4;
        this.f48203e = expression5;
    }

    public final boolean a(DivPageTransformationSlide divPageTransformationSlide, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPageTransformationSlide == null || this.f48199a.evaluate(expressionResolver) != divPageTransformationSlide.f48199a.evaluate(expressionResolver2)) {
            return false;
        }
        if (!(this.f48200b.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f48200b.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (!(this.f48201c.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f48201c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (this.f48202d.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f48202d.evaluate(expressionResolver2).doubleValue()) {
            return (this.f48203e.evaluate(expressionResolver).doubleValue() > divPageTransformationSlide.f48203e.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f48203e.evaluate(expressionResolver).doubleValue() == divPageTransformationSlide.f48203e.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    /* JADX INFO: compiled from: DivPageTransformationSlide.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPageTransformationSlide a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48193h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f48194i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48195j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48196k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48197l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48198m = new bk.p<ParsingEnvironment, JSONObject, DivPageTransformationSlide>() { // from class: com.yandex.div2.DivPageTransformationSlide$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationSlide mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivPageTransformationSlide.f48192g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48204f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPageTransformationSlide.class).hashCode() + this.f48199a.hashCode() + this.f48200b.hashCode() + this.f48201c.hashCode() + this.f48202d.hashCode() + this.f48203e.hashCode();
        this.f48204f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPageTransformationSlide(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f48193h : expression, (i10 & 2) != 0 ? f48194i : expression2, (i10 & 4) != 0 ? f48195j : expression3, (i10 & 8) != 0 ? f48196k : expression4, (i10 & 16) != 0 ? f48197l : expression5);
    }
}
