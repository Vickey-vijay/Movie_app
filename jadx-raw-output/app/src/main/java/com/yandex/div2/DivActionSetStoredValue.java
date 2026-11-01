package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValue.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionSetStoredValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46249e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionSetStoredValue> f46250f = new bk.p<ParsingEnvironment, JSONObject, DivActionSetStoredValue>() { // from class: com.yandex.div2.DivActionSetStoredValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetStoredValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionSetStoredValue.f46249e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f46252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivTypedValue f46253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46254d;

    public final boolean a(DivActionSetStoredValue divActionSetStoredValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionSetStoredValue != null && this.f46251a.evaluate(expressionResolver).longValue() == divActionSetStoredValue.f46251a.evaluate(expressionResolver2).longValue() && ck.p.e(this.f46252b.evaluate(expressionResolver), divActionSetStoredValue.f46252b.evaluate(expressionResolver2)) && this.f46253c.a(divActionSetStoredValue.f46253c, expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivActionSetStoredValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionSetStoredValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46254d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionSetStoredValue.class).hashCode() + this.f46251a.hashCode() + this.f46252b.hashCode() + this.f46253c.hash();
        this.f46254d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionSetStoredValue(Expression<Long> expression, Expression<String> expression2, DivTypedValue divTypedValue) {
        this.f46251a = expression;
        this.f46252b = expression2;
        this.f46253c = divTypedValue;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
