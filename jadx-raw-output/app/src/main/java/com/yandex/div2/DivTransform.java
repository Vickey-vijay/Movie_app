package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTransform.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTransform implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49895e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DivPivot.c f49896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DivPivot.c f49897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTransform> f49898h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivPivot f49899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivPivot f49900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Double> f49901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f49902d;

    public DivTransform() {
        this(null, null, null, 7, null);
    }

    public DivTransform(DivPivot divPivot, DivPivot divPivot2, Expression<Double> expression) {
        this.f49899a = divPivot;
        this.f49900b = divPivot2;
        this.f49901c = expression;
    }

    public final boolean a(DivTransform divTransform, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTransform == null || !this.f49899a.a(divTransform.f49899a, expressionResolver, expressionResolver2) || !this.f49900b.a(divTransform.f49900b, expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression<Double> expression = this.f49901c;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divTransform.f49901c;
        return ck.p.b(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivTransform.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTransform a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        f49896f = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f49897g = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f49898h = new bk.p<ParsingEnvironment, JSONObject, DivTransform>() { // from class: com.yandex.div2.DivTransform$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTransform mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivTransform.f49895e.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49902d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTransform.class).hashCode() + this.f49899a.hash() + this.f49900b.hash();
        Expression<Double> expression = this.f49901c;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f49902d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTransform(DivPivot divPivot, DivPivot divPivot2, Expression expression, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f49896f : divPivot, (i10 & 2) != 0 ? f49897g : divPivot2, (i10 & 4) != 0 ? null : expression);
    }
}
