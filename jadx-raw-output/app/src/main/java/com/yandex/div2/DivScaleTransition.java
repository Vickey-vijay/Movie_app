package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivScaleTransition.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivScaleTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f48531h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f48532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Double> f48534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Double> f48535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Double> f48536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Long> f48537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivScaleTransition> f48538o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f48539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f48540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Double> f48541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f48542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Double> f48543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Long> f48544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f48545g;

    public DivScaleTransition() {
        this(null, null, null, null, null, null, 63, null);
    }

    public DivScaleTransition(Expression<Long> expression, Expression<DivAnimationInterpolator> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5, Expression<Long> expression6) {
        this.f48539a = expression;
        this.f48540b = expression2;
        this.f48541c = expression3;
        this.f48542d = expression4;
        this.f48543e = expression5;
        this.f48544f = expression6;
    }

    public final boolean a(DivScaleTransition divScaleTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divScaleTransition == null || b().evaluate(expressionResolver).longValue() != divScaleTransition.b().evaluate(expressionResolver2).longValue() || c().evaluate(expressionResolver) != divScaleTransition.c().evaluate(expressionResolver2)) {
            return false;
        }
        if (!(this.f48541c.evaluate(expressionResolver).doubleValue() == divScaleTransition.f48541c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (this.f48542d.evaluate(expressionResolver).doubleValue() == divScaleTransition.f48542d.evaluate(expressionResolver2).doubleValue()) {
            return ((this.f48543e.evaluate(expressionResolver).doubleValue() > divScaleTransition.f48543e.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f48543e.evaluate(expressionResolver).doubleValue() == divScaleTransition.f48543e.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && d().evaluate(expressionResolver).longValue() == divScaleTransition.d().evaluate(expressionResolver2).longValue();
        }
        return false;
    }

    /* JADX INFO: compiled from: DivScaleTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivScaleTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().A6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48532i = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f48533j = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f48534k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48535l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48536m = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48537n = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48538o = new bk.p<ParsingEnvironment, JSONObject, DivScaleTransition>() { // from class: com.yandex.div2.DivScaleTransition$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivScaleTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivScaleTransition.f48531h.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public Expression<Long> b() {
        return this.f48539a;
    }

    public Expression<DivAnimationInterpolator> c() {
        return this.f48540b;
    }

    public Expression<Long> d() {
        return this.f48544f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48545g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivScaleTransition.class).hashCode() + b().hashCode() + c().hashCode() + this.f48541c.hashCode() + this.f48542d.hashCode() + this.f48543e.hashCode() + d().hashCode();
        this.f48545g = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivScaleTransition(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f48532i : expression, (i10 & 2) != 0 ? f48533j : expression2, (i10 & 4) != 0 ? f48534k : expression3, (i10 & 8) != 0 ? f48535l : expression4, (i10 & 16) != 0 ? f48536m : expression5, (i10 & 32) != 0 ? f48537n : expression6);
    }
}
