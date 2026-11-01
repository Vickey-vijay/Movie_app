package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCornersRadius.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCornersRadius implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46834f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCornersRadius> f46835g = new bk.p<ParsingEnvironment, JSONObject, DivCornersRadius>() { // from class: com.yandex.div2.DivCornersRadius$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCornersRadius mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCornersRadius.f46834f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f46837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f46838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Long> f46839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f46840e;

    public DivCornersRadius() {
        this(null, null, null, null, 15, null);
    }

    public DivCornersRadius(Expression<Long> expression, Expression<Long> expression2, Expression<Long> expression3, Expression<Long> expression4) {
        this.f46836a = expression;
        this.f46837b = expression2;
        this.f46838c = expression3;
        this.f46839d = expression4;
    }

    public final boolean a(DivCornersRadius divCornersRadius, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCornersRadius == null) {
            return false;
        }
        Expression<Long> expression = this.f46836a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divCornersRadius.f46836a;
        if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression3 = this.f46837b;
        Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divCornersRadius.f46837b;
        if (!ck.p.e(lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression5 = this.f46838c;
        Long lEvaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = divCornersRadius.f46838c;
        if (!ck.p.e(lEvaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.f46839d;
        Long lEvaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divCornersRadius.f46839d;
        return ck.p.e(lEvaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivCornersRadius.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCornersRadius a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().s2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46840e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivCornersRadius.class).hashCode();
        Expression<Long> expression = this.f46836a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.f46837b;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<Long> expression3 = this.f46838c;
        int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.f46839d;
        int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.f46840e = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCornersRadius(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? null : expression4);
    }
}
