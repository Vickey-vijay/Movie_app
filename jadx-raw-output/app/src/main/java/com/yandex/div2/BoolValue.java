package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolValue.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BoolValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45888c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, BoolValue> f45889d = new bk.p<ParsingEnvironment, JSONObject, BoolValue>() { // from class: com.yandex.div2.BoolValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BoolValue.f45888c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f45890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45891b;

    public final boolean a(BoolValue boolValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return boolValue != null && this.f45890a.evaluate(expressionResolver).booleanValue() == boolValue.f45890a.evaluate(expressionResolver2).booleanValue();
    }

    /* JADX INFO: compiled from: BoolValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final BoolValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().g().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45891b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(BoolValue.class).hashCode() + this.f45890a.hashCode();
        this.f45891b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public BoolValue(Expression<Boolean> expression) {
        this.f45890a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
