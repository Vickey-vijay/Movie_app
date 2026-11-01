package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class NumberValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50467c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, NumberValue> f50468d = new bk.p<ParsingEnvironment, JSONObject, NumberValue>() { // from class: com.yandex.div2.NumberValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final NumberValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return NumberValue.f50467c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f50469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f50470b;

    public final boolean a(NumberValue numberValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return numberValue != null && this.f50469a.evaluate(expressionResolver).doubleValue() == numberValue.f50469a.evaluate(expressionResolver2).doubleValue();
    }

    /* JADX INFO: compiled from: NumberValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final NumberValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50470b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(NumberValue.class).hashCode() + this.f50469a.hashCode();
        this.f50470b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public NumberValue(Expression<Double> expression) {
        this.f50469a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
