package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import oe.f6;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivCurrencyInputMask implements JSONSerializable, Hashable, f6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46856d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCurrencyInputMask> f46857e = new bk.p<ParsingEnvironment, JSONObject, DivCurrencyInputMask>() { // from class: com.yandex.div2.DivCurrencyInputMask$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCurrencyInputMask mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCurrencyInputMask.f46856d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46860c;

    public final boolean b(DivCurrencyInputMask divCurrencyInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCurrencyInputMask == null) {
            return false;
        }
        Expression<String> expression = this.f46858a;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divCurrencyInputMask.f46858a;
        return ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && ck.p.e(a(), divCurrencyInputMask.a());
    }

    /* JADX INFO: compiled from: DivCurrencyInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCurrencyInputMask a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().y2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // oe.f6
    public String a() {
        return this.f46859b;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46860c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivCurrencyInputMask.class).hashCode();
        Expression<String> expression = this.f46858a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + a().hashCode();
        this.f46860c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivCurrencyInputMask(Expression<String> expression, String str) {
        this.f46858a = expression;
        this.f46859b = str;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().y2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
