package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientFixedCenter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivRadialGradientFixedCenter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48450d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f48451e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientFixedCenter> f48452f = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientFixedCenter>() { // from class: com.yandex.div2.DivRadialGradientFixedCenter$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientFixedCenter mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientFixedCenter.f48450d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivSizeUnit> f48453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f48454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f48455c;

    public final boolean a(DivRadialGradientFixedCenter divRadialGradientFixedCenter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divRadialGradientFixedCenter != null && this.f48453a.evaluate(expressionResolver) == divRadialGradientFixedCenter.f48453a.evaluate(expressionResolver2) && this.f48454b.evaluate(expressionResolver).longValue() == divRadialGradientFixedCenter.f48454b.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRadialGradientFixedCenter a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().i6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48455c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivRadialGradientFixedCenter.class).hashCode() + this.f48453a.hashCode() + this.f48454b.hashCode();
        this.f48455c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivRadialGradientFixedCenter(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.f48453a = expression;
        this.f48454b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
