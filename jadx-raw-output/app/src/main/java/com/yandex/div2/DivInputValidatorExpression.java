package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorExpression.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivInputValidatorExpression implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47991f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Boolean> f47992g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidatorExpression> f47993h = new bk.p<ParsingEnvironment, JSONObject, DivInputValidatorExpression>() { // from class: com.yandex.div2.DivInputValidatorExpression$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorExpression mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputValidatorExpression.f47991f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f47994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f47995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f47996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f47998e;

    public final boolean a(DivInputValidatorExpression divInputValidatorExpression, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInputValidatorExpression != null && this.f47994a.evaluate(expressionResolver).booleanValue() == divInputValidatorExpression.f47994a.evaluate(expressionResolver2).booleanValue() && this.f47995b.evaluate(expressionResolver).booleanValue() == divInputValidatorExpression.f47995b.evaluate(expressionResolver2).booleanValue() && ck.p.e(this.f47996c.evaluate(expressionResolver), divInputValidatorExpression.f47996c.evaluate(expressionResolver2)) && ck.p.e(this.f47997d, divInputValidatorExpression.f47997d);
    }

    /* JADX INFO: compiled from: DivInputValidatorExpression.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputValidatorExpression a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().D4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47998e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInputValidatorExpression.class).hashCode() + this.f47994a.hashCode() + this.f47995b.hashCode() + this.f47996c.hashCode() + this.f47997d.hashCode();
        this.f47998e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivInputValidatorExpression(Expression<Boolean> expression, Expression<Boolean> expression2, Expression<String> expression3, String str) {
        this.f47994a = expression;
        this.f47995b = expression2;
        this.f47996c = expression3;
        this.f47997d = str;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
