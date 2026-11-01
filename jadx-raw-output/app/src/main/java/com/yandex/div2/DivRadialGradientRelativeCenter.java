package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeCenter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivRadialGradientRelativeCenter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48476c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenter> f48477d = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenter>() { // from class: com.yandex.div2.DivRadialGradientRelativeCenter$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeCenter mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientRelativeCenter.f48476c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f48478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48479b;

    public final boolean a(DivRadialGradientRelativeCenter divRadialGradientRelativeCenter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divRadialGradientRelativeCenter != null && this.f48478a.evaluate(expressionResolver).doubleValue() == divRadialGradientRelativeCenter.f48478a.evaluate(expressionResolver2).doubleValue();
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeCenter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRadialGradientRelativeCenter a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().r6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48479b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivRadialGradientRelativeCenter.class).hashCode() + this.f48478a.hashCode();
        this.f48479b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivRadialGradientRelativeCenter(Expression<Double> expression) {
        this.f48478a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
