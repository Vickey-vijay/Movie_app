package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionShowTooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionShowTooltip implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46269d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionShowTooltip> f46270e = new bk.p<ParsingEnvironment, JSONObject, DivActionShowTooltip>() { // from class: com.yandex.div2.DivActionShowTooltip$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionShowTooltip mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionShowTooltip.f46269d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f46272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46273c;

    public final boolean a(DivActionShowTooltip divActionShowTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionShowTooltip == null || !ck.p.e(this.f46271a.evaluate(expressionResolver), divActionShowTooltip.f46271a.evaluate(expressionResolver2))) {
            return false;
        }
        Expression<Boolean> expression = this.f46272b;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Boolean> expression2 = divActionShowTooltip.f46272b;
        return ck.p.e(boolEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivActionShowTooltip.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionShowTooltip a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().S0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46273c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionShowTooltip.class).hashCode() + this.f46271a.hashCode();
        Expression<Boolean> expression = this.f46272b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f46273c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivActionShowTooltip(Expression<String> expression, Expression<Boolean> expression2) {
        this.f46271a = expression;
        this.f46272b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
