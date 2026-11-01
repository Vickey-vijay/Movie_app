package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberVariable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NumberVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50474d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, NumberVariable> f50475e = new bk.p<ParsingEnvironment, JSONObject, NumberVariable>() { // from class: com.yandex.div2.NumberVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final NumberVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return NumberVariable.f50474d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Double> f50477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f50478c;

    public final boolean a(NumberVariable numberVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (numberVariable != null && ck.p.e(this.f50476a, numberVariable.f50476a)) {
            return (this.f50477b.evaluate(expressionResolver).doubleValue() > numberVariable.f50477b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f50477b.evaluate(expressionResolver).doubleValue() == numberVariable.f50477b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    /* JADX INFO: compiled from: NumberVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final NumberVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().R9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50478c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(NumberVariable.class).hashCode() + this.f50476a.hashCode() + this.f50477b.hashCode();
        this.f50478c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public NumberVariable(String str, Expression<Double> expression) {
        this.f50476a = str;
        this.f50477b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
