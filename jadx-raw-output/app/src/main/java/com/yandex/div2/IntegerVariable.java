package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerVariable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class IntegerVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50153d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, IntegerVariable> f50154e = new bk.p<ParsingEnvironment, JSONObject, IntegerVariable>() { // from class: com.yandex.div2.IntegerVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return IntegerVariable.f50153d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f50156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f50157c;

    public final boolean a(IntegerVariable integerVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return integerVariable != null && ck.p.e(this.f50155a, integerVariable.f50155a) && this.f50156b.evaluate(expressionResolver).longValue() == integerVariable.f50156b.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: IntegerVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final IntegerVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50157c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(IntegerVariable.class).hashCode() + this.f50155a.hashCode() + this.f50156b.hashCode();
        this.f50157c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public IntegerVariable(String str, Expression<Long> expression) {
        this.f50155a = str;
        this.f50156b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
