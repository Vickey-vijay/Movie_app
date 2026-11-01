package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDimension.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDimension implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46979d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f46980e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDimension> f46981f = new bk.p<ParsingEnvironment, JSONObject, DivDimension>() { // from class: com.yandex.div2.DivDimension$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDimension mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivDimension.f46979d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivSizeUnit> f46982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Double> f46983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46984c;

    public final boolean a(DivDimension divDimension, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDimension != null && this.f46982a.evaluate(expressionResolver) == divDimension.f46982a.evaluate(expressionResolver2)) {
            return (this.f46983b.evaluate(expressionResolver).doubleValue() > divDimension.f46983b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f46983b.evaluate(expressionResolver).doubleValue() == divDimension.f46983b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    /* JADX INFO: compiled from: DivDimension.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivDimension a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().M2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46984c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivDimension.class).hashCode() + this.f46982a.hashCode() + this.f46983b.hashCode();
        this.f46984c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivDimension(Expression<DivSizeUnit> expression, Expression<Double> expression2) {
        this.f46982a = expression;
        this.f46983b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
