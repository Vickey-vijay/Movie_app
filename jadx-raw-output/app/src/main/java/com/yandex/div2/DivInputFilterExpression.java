package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterExpression.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputFilterExpression implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47861c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputFilterExpression> f47862d = new bk.p<ParsingEnvironment, JSONObject, DivInputFilterExpression>() { // from class: com.yandex.div2.DivInputFilterExpression$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterExpression mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputFilterExpression.f47861c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f47863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f47864b;

    public final boolean a(DivInputFilterExpression divInputFilterExpression, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInputFilterExpression != null && this.f47863a.evaluate(expressionResolver).booleanValue() == divInputFilterExpression.f47863a.evaluate(expressionResolver2).booleanValue();
    }

    /* JADX INFO: compiled from: DivInputFilterExpression.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputFilterExpression a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().j4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47864b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInputFilterExpression.class).hashCode() + this.f47863a.hashCode();
        this.f47864b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivInputFilterExpression(Expression<Boolean> expression) {
        this.f47863a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
