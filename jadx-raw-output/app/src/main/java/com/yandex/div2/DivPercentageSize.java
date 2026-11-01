package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPercentageSize.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivPercentageSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48369c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPercentageSize> f48370d = new bk.p<ParsingEnvironment, JSONObject, DivPercentageSize>() { // from class: com.yandex.div2.DivPercentageSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPercentageSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPercentageSize.f48369c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f48371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48372b;

    public final boolean a(DivPercentageSize divPercentageSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPercentageSize != null && this.f48371a.evaluate(expressionResolver).doubleValue() == divPercentageSize.f48371a.evaluate(expressionResolver2).doubleValue();
    }

    /* JADX INFO: compiled from: DivPercentageSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPercentageSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().K5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48372b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPercentageSize.class).hashCode() + this.f48371a.hashCode();
        this.f48372b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivPercentageSize(Expression<Double> expression) {
        this.f48371a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
