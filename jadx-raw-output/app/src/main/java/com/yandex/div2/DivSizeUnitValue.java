package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeUnitValue.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSizeUnitValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48813d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f48814e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSizeUnitValue> f48815f = new bk.p<ParsingEnvironment, JSONObject, DivSizeUnitValue>() { // from class: com.yandex.div2.DivSizeUnitValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSizeUnitValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivSizeUnitValue.f48813d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivSizeUnit> f48816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f48817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f48818c;

    public final boolean a(DivSizeUnitValue divSizeUnitValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divSizeUnitValue != null && this.f48816a.evaluate(expressionResolver) == divSizeUnitValue.f48816a.evaluate(expressionResolver2) && this.f48817b.evaluate(expressionResolver).longValue() == divSizeUnitValue.f48817b.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivSizeUnitValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSizeUnitValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48818c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSizeUnitValue.class).hashCode() + this.f48816a.hashCode() + this.f48817b.hashCode();
        this.f48818c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivSizeUnitValue(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.f48816a = expression;
        this.f48817b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
