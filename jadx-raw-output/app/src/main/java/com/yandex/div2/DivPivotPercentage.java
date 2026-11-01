package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotPercentage.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPivotPercentage implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48405c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPivotPercentage> f48406d = new bk.p<ParsingEnvironment, JSONObject, DivPivotPercentage>() { // from class: com.yandex.div2.DivPivotPercentage$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotPercentage mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPivotPercentage.f48405c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f48407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48408b;

    public final boolean a(DivPivotPercentage divPivotPercentage, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPivotPercentage != null && this.f48407a.evaluate(expressionResolver).doubleValue() == divPivotPercentage.f48407a.evaluate(expressionResolver2).doubleValue();
    }

    /* JADX INFO: compiled from: DivPivotPercentage.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPivotPercentage a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().W5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48408b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPivotPercentage.class).hashCode() + this.f48407a.hashCode();
        this.f48408b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivPivotPercentage(Expression<Double> expression) {
        this.f48407a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
