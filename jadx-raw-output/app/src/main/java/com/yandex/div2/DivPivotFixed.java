package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotFixed.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPivotFixed implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48388d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f48389e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPivotFixed> f48390f = new bk.p<ParsingEnvironment, JSONObject, DivPivotFixed>() { // from class: com.yandex.div2.DivPivotFixed$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotFixed mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPivotFixed.f48388d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivSizeUnit> f48391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f48392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f48393c;

    /* JADX WARN: Multi-variable type inference failed */
    public DivPivotFixed() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivPivotFixed(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.f48391a = expression;
        this.f48392b = expression2;
    }

    public final boolean a(DivPivotFixed divPivotFixed, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPivotFixed == null || this.f48391a.evaluate(expressionResolver) != divPivotFixed.f48391a.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<Long> expression = this.f48392b;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divPivotFixed.f48392b;
        return ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivPivotFixed.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPivotFixed a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Q5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48393c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPivotFixed.class).hashCode() + this.f48391a.hashCode();
        Expression<Long> expression = this.f48392b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f48393c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPivotFixed(Expression expression, Expression expression2, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f48389e : expression, (i10 & 2) != 0 ? null : expression2);
    }
}
