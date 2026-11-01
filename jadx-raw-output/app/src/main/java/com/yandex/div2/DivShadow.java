package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShadow.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivShadow implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48762f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Double> f48763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f48764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Integer> f48765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivShadow> f48766j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f48767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f48768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Integer> f48769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DivPoint f48770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f48771e;

    public final boolean a(DivShadow divShadow, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divShadow == null) {
            return false;
        }
        return ((this.f48767a.evaluate(expressionResolver).doubleValue() > divShadow.f48767a.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f48767a.evaluate(expressionResolver).doubleValue() == divShadow.f48767a.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && this.f48768b.evaluate(expressionResolver).longValue() == divShadow.f48768b.evaluate(expressionResolver2).longValue() && this.f48769c.evaluate(expressionResolver).intValue() == divShadow.f48769c.evaluate(expressionResolver2).intValue() && this.f48770d.a(divShadow.f48770d, expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivShadow.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivShadow a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48763g = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f48764h = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f48765i = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f48766j = new bk.p<ParsingEnvironment, JSONObject, DivShadow>() { // from class: com.yandex.div2.DivShadow$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivShadow mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivShadow.f48762f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48771e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivShadow.class).hashCode() + this.f48767a.hashCode() + this.f48768b.hashCode() + this.f48769c.hashCode() + this.f48770d.hash();
        this.f48771e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivShadow(Expression<Double> expression, Expression<Long> expression2, Expression<Integer> expression3, DivPoint divPoint) {
        this.f48767a = expression;
        this.f48768b = expression2;
        this.f48769c = expression3;
        this.f48770d = divPoint;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
