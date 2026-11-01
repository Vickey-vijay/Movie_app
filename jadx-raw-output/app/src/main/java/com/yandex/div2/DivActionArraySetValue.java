package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArraySetValue.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionArraySetValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46105e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionArraySetValue> f46106f = new bk.p<ParsingEnvironment, JSONObject, DivActionArraySetValue>() { // from class: com.yandex.div2.DivActionArraySetValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArraySetValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionArraySetValue.f46105e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivTypedValue f46108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f46109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46110d;

    public final boolean a(DivActionArraySetValue divActionArraySetValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionArraySetValue != null && this.f46107a.evaluate(expressionResolver).longValue() == divActionArraySetValue.f46107a.evaluate(expressionResolver2).longValue() && this.f46108b.a(divActionArraySetValue.f46108b, expressionResolver, expressionResolver2) && ck.p.e(this.f46109c.evaluate(expressionResolver), divActionArraySetValue.f46109c.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionArraySetValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionArraySetValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().W().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46110d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionArraySetValue.class).hashCode() + this.f46107a.hashCode() + this.f46108b.hash() + this.f46109c.hashCode();
        this.f46110d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionArraySetValue(Expression<Long> expression, DivTypedValue divTypedValue, Expression<String> expression2) {
        this.f46107a = expression;
        this.f46108b = divTypedValue;
        this.f46109c = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
