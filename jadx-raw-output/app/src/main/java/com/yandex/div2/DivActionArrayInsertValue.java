package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionArrayInsertValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46085e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionArrayInsertValue> f46086f = new bk.p<ParsingEnvironment, JSONObject, DivActionArrayInsertValue>() { // from class: com.yandex.div2.DivActionArrayInsertValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayInsertValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionArrayInsertValue.f46085e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivTypedValue f46088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f46089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46090d;

    public final boolean a(DivActionArrayInsertValue divActionArrayInsertValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionArrayInsertValue == null) {
            return false;
        }
        Expression<Long> expression = this.f46087a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divActionArrayInsertValue.f46087a;
        return ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f46088b.a(divActionArrayInsertValue.f46088b, expressionResolver, expressionResolver2) && ck.p.e(this.f46089c.evaluate(expressionResolver), divActionArrayInsertValue.f46089c.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionArrayInsertValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionArrayInsertValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Q().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46090d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionArrayInsertValue.class).hashCode();
        Expression<Long> expression = this.f46087a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f46088b.hash() + this.f46089c.hashCode();
        this.f46090d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivActionArrayInsertValue(Expression<Long> expression, DivTypedValue divTypedValue, Expression<String> expression2) {
        this.f46087a = expression;
        this.f46088b = divTypedValue;
        this.f46089c = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
