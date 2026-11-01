package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class IntegerValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50146c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, IntegerValue> f50147d = new bk.p<ParsingEnvironment, JSONObject, IntegerValue>() { // from class: com.yandex.div2.IntegerValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return IntegerValue.f50146c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f50148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f50149b;

    public final boolean a(IntegerValue integerValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return integerValue != null && this.f50148a.evaluate(expressionResolver).longValue() == integerValue.f50148a.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: IntegerValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final IntegerValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50149b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(IntegerValue.class).hashCode() + this.f50148a.hashCode();
        this.f50149b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public IntegerValue(Expression<Long> expression) {
        this.f50148a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
