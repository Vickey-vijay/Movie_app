package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivMatchParentSize.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivMatchParentSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48057e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivMatchParentSize> f48058f = new bk.p<ParsingEnvironment, JSONObject, DivMatchParentSize>() { // from class: com.yandex.div2.DivMatchParentSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivMatchParentSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivMatchParentSize.f48057e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivSizeUnitValue f48059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivSizeUnitValue f48060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Double> f48061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f48062d;

    public DivMatchParentSize() {
        this(null, null, null, 7, null);
    }

    public DivMatchParentSize(DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, Expression<Double> expression) {
        this.f48059a = divSizeUnitValue;
        this.f48060b = divSizeUnitValue2;
        this.f48061c = expression;
    }

    public final boolean a(DivMatchParentSize divMatchParentSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        if (divMatchParentSize == null) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue = this.f48059a;
        if (divSizeUnitValue != null) {
            zA = divSizeUnitValue.a(divMatchParentSize.f48059a, expressionResolver, expressionResolver2);
        } else {
            zA = divMatchParentSize.f48059a == null;
        }
        if (!zA) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue2 = this.f48060b;
        if (divSizeUnitValue2 != null) {
            zA2 = divSizeUnitValue2.a(divMatchParentSize.f48060b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divMatchParentSize.f48060b == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Double> expression = this.f48061c;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divMatchParentSize.f48061c;
        return ck.p.b(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivMatchParentSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivMatchParentSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Y4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48062d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivMatchParentSize.class).hashCode();
        DivSizeUnitValue divSizeUnitValue = this.f48059a;
        int iHash = iHashCode + (divSizeUnitValue != null ? divSizeUnitValue.hash() : 0);
        DivSizeUnitValue divSizeUnitValue2 = this.f48060b;
        int iHash2 = iHash + (divSizeUnitValue2 != null ? divSizeUnitValue2.hash() : 0);
        Expression<Double> expression = this.f48061c;
        int iHashCode2 = iHash2 + (expression != null ? expression.hashCode() : 0);
        this.f48062d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivMatchParentSize(DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, Expression expression, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : divSizeUnitValue, (i10 & 2) != 0 ? null : divSizeUnitValue2, (i10 & 4) != 0 ? null : expression);
    }
}
