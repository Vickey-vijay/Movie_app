package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorRegex.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivInputValidatorRegex implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48006f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Boolean> f48007g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidatorRegex> f48008h = new bk.p<ParsingEnvironment, JSONObject, DivInputValidatorRegex>() { // from class: com.yandex.div2.DivInputValidatorRegex$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorRegex mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputValidatorRegex.f48006f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f48009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f48010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f48011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f48013e;

    public final boolean a(DivInputValidatorRegex divInputValidatorRegex, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInputValidatorRegex != null && this.f48009a.evaluate(expressionResolver).booleanValue() == divInputValidatorRegex.f48009a.evaluate(expressionResolver2).booleanValue() && ck.p.e(this.f48010b.evaluate(expressionResolver), divInputValidatorRegex.f48010b.evaluate(expressionResolver2)) && ck.p.e(this.f48011c.evaluate(expressionResolver), divInputValidatorRegex.f48011c.evaluate(expressionResolver2)) && ck.p.e(this.f48012d, divInputValidatorRegex.f48012d);
    }

    /* JADX INFO: compiled from: DivInputValidatorRegex.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputValidatorRegex a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48013e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInputValidatorRegex.class).hashCode() + this.f48009a.hashCode() + this.f48010b.hashCode() + this.f48011c.hashCode() + this.f48012d.hashCode();
        this.f48013e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivInputValidatorRegex(Expression<Boolean> expression, Expression<String> expression2, Expression<String> expression3, String str) {
        this.f48009a = expression;
        this.f48010b = expression2;
        this.f48011c = expression3;
        this.f48012d = str;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
