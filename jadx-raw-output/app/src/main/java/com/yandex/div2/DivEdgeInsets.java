package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivEdgeInsets.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivEdgeInsets implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f47047i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f47048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Long> f47049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Long> f47050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Long> f47051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f47052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivEdgeInsets> f47053o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f47054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f47055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f47056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Long> f47057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Long> f47058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Long> f47059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<DivSizeUnit> f47060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f47061h;

    public DivEdgeInsets() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public DivEdgeInsets(Expression<Long> expression, Expression<Long> expression2, Expression<Long> expression3, Expression<Long> expression4, Expression<Long> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7) {
        this.f47054a = expression;
        this.f47055b = expression2;
        this.f47056c = expression3;
        this.f47057d = expression4;
        this.f47058e = expression5;
        this.f47059f = expression6;
        this.f47060g = expression7;
    }

    public final boolean a(DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divEdgeInsets == null || this.f47054a.evaluate(expressionResolver).longValue() != divEdgeInsets.f47054a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Long> expression = this.f47055b;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divEdgeInsets.f47055b;
        if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f47056c.evaluate(expressionResolver).longValue() != divEdgeInsets.f47056c.evaluate(expressionResolver2).longValue() || this.f47057d.evaluate(expressionResolver).longValue() != divEdgeInsets.f47057d.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Long> expression3 = this.f47058e;
        Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divEdgeInsets.f47058e;
        return ck.p.e(lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) && this.f47059f.evaluate(expressionResolver).longValue() == divEdgeInsets.f47059f.evaluate(expressionResolver2).longValue() && this.f47060g.evaluate(expressionResolver) == divEdgeInsets.f47060g.evaluate(expressionResolver2);
    }

    /* JADX INFO: compiled from: DivEdgeInsets.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivEdgeInsets a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Y2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47048j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47049k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47050l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47051m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47052n = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f47053o = new bk.p<ParsingEnvironment, JSONObject, DivEdgeInsets>() { // from class: com.yandex.div2.DivEdgeInsets$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivEdgeInsets mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivEdgeInsets.f47047i.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47061h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivEdgeInsets.class).hashCode() + this.f47054a.hashCode();
        Expression<Long> expression = this.f47055b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f47056c.hashCode() + this.f47057d.hashCode();
        Expression<Long> expression2 = this.f47058e;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f47059f.hashCode() + this.f47060g.hashCode();
        this.f47061h = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f47048j : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? f47049k : expression3, (i10 & 8) != 0 ? f47050l : expression4, (i10 & 16) == 0 ? expression5 : null, (i10 & 32) != 0 ? f47051m : expression6, (i10 & 64) != 0 ? f47052n : expression7);
    }
}
