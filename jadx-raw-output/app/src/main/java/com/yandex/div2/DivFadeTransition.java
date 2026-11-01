package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFadeTransition.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivFadeTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47102f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Double> f47103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f47104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f47105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f47106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFadeTransition> f47107k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f47108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f47109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f47110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Long> f47111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f47112e;

    public DivFadeTransition() {
        this(null, null, null, null, 15, null);
    }

    public DivFadeTransition(Expression<Double> expression, Expression<Long> expression2, Expression<DivAnimationInterpolator> expression3, Expression<Long> expression4) {
        this.f47108a = expression;
        this.f47109b = expression2;
        this.f47110c = expression3;
        this.f47111d = expression4;
    }

    public final boolean a(DivFadeTransition divFadeTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divFadeTransition == null) {
            return false;
        }
        return ((this.f47108a.evaluate(expressionResolver).doubleValue() > divFadeTransition.f47108a.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f47108a.evaluate(expressionResolver).doubleValue() == divFadeTransition.f47108a.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && b().evaluate(expressionResolver).longValue() == divFadeTransition.b().evaluate(expressionResolver2).longValue() && c().evaluate(expressionResolver) == divFadeTransition.c().evaluate(expressionResolver2) && d().evaluate(expressionResolver).longValue() == divFadeTransition.d().evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivFadeTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFadeTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47103g = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f47104h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f47105i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f47106j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47107k = new bk.p<ParsingEnvironment, JSONObject, DivFadeTransition>() { // from class: com.yandex.div2.DivFadeTransition$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFadeTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivFadeTransition.f47102f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public Expression<Long> b() {
        return this.f47109b;
    }

    public Expression<DivAnimationInterpolator> c() {
        return this.f47110c;
    }

    public Expression<Long> d() {
        return this.f47111d;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47112e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFadeTransition.class).hashCode() + this.f47108a.hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f47112e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFadeTransition(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f47103g : expression, (i10 & 2) != 0 ? f47104h : expression2, (i10 & 4) != 0 ? f47105i : expression3, (i10 & 8) != 0 ? f47106j : expression4);
    }
}
