package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValue.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionDictSetValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46137e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionDictSetValue> f46138f = new bk.p<ParsingEnvironment, JSONObject, DivActionDictSetValue>() { // from class: com.yandex.div2.DivActionDictSetValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDictSetValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionDictSetValue.f46137e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivTypedValue f46140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f46141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46142d;

    public final boolean a(DivActionDictSetValue divActionDictSetValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divActionDictSetValue == null || !ck.p.e(this.f46139a.evaluate(expressionResolver), divActionDictSetValue.f46139a.evaluate(expressionResolver2))) {
            return false;
        }
        DivTypedValue divTypedValue = this.f46140b;
        if (divTypedValue != null) {
            zA = divTypedValue.a(divActionDictSetValue.f46140b, expressionResolver, expressionResolver2);
        } else {
            zA = divActionDictSetValue.f46140b == null;
        }
        return zA && ck.p.e(this.f46141c.evaluate(expressionResolver), divActionDictSetValue.f46141c.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionDictSetValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionDictSetValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().i0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46142d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionDictSetValue.class).hashCode() + this.f46139a.hashCode();
        DivTypedValue divTypedValue = this.f46140b;
        int iHash = iHashCode + (divTypedValue != null ? divTypedValue.hash() : 0) + this.f46141c.hashCode();
        this.f46142d = Integer.valueOf(iHash);
        return iHash;
    }

    public DivActionDictSetValue(Expression<String> expression, DivTypedValue divTypedValue, Expression<String> expression2) {
        this.f46139a = expression;
        this.f46140b = divTypedValue;
        this.f46141c = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
