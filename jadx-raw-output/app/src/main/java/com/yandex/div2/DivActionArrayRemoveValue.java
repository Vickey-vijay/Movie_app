package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayRemoveValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionArrayRemoveValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46096d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValue> f46097e = new bk.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValue>() { // from class: com.yandex.div2.DivActionArrayRemoveValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayRemoveValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionArrayRemoveValue.f46096d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f46099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46100c;

    public final boolean a(DivActionArrayRemoveValue divActionArrayRemoveValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionArrayRemoveValue != null && this.f46098a.evaluate(expressionResolver).longValue() == divActionArrayRemoveValue.f46098a.evaluate(expressionResolver2).longValue() && ck.p.e(this.f46099b.evaluate(expressionResolver), divActionArrayRemoveValue.f46099b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionArrayRemoveValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionArrayRemoveValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().T().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46100c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionArrayRemoveValue.class).hashCode() + this.f46098a.hashCode() + this.f46099b.hashCode();
        this.f46100c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionArrayRemoveValue(Expression<Long> expression, Expression<String> expression2) {
        this.f46098a = expression;
        this.f46099b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
