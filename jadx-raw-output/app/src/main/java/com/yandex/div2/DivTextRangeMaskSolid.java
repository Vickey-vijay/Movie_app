package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskSolid.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTextRangeMaskSolid implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49692d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Boolean> f49693e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolid> f49694f = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolid>() { // from class: com.yandex.div2.DivTextRangeMaskSolid$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskSolid mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeMaskSolid.f49692d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f49695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f49696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f49697c;

    public final boolean a(DivTextRangeMaskSolid divTextRangeMaskSolid, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divTextRangeMaskSolid != null && this.f49695a.evaluate(expressionResolver).intValue() == divTextRangeMaskSolid.f49695a.evaluate(expressionResolver2).intValue() && this.f49696b.evaluate(expressionResolver).booleanValue() == divTextRangeMaskSolid.f49696b.evaluate(expressionResolver2).booleanValue();
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolid.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextRangeMaskSolid a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49697c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTextRangeMaskSolid.class).hashCode() + this.f49695a.hashCode() + this.f49696b.hashCode();
        this.f49697c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivTextRangeMaskSolid(Expression<Integer> expression, Expression<Boolean> expression2) {
        this.f49695a = expression;
        this.f49696b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
