package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStroke.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivStroke implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49126f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DivStrokeStyle.c f49127g = new DivStrokeStyle.c(new DivStrokeStyleSolid());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f49128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Double> f49129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStroke> f49130j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f49131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivStrokeStyle f49132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivSizeUnit> f49133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f49134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f49135e;

    public final boolean a(DivStroke divStroke, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divStroke != null && this.f49131a.evaluate(expressionResolver).intValue() == divStroke.f49131a.evaluate(expressionResolver2).intValue() && this.f49132b.a(divStroke.f49132b, expressionResolver, expressionResolver2) && this.f49133c.evaluate(expressionResolver) == divStroke.f49133c.evaluate(expressionResolver2)) {
            return (this.f49134d.evaluate(expressionResolver).doubleValue() > divStroke.f49134d.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f49134d.evaluate(expressionResolver).doubleValue() == divStroke.f49134d.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
        }
        return false;
    }

    /* JADX INFO: compiled from: DivStroke.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivStroke a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().C7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49128h = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f49129i = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f49130j = new bk.p<ParsingEnvironment, JSONObject, DivStroke>() { // from class: com.yandex.div2.DivStroke$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStroke mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivStroke.f49126f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49135e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivStroke.class).hashCode() + this.f49131a.hashCode() + this.f49132b.hash() + this.f49133c.hashCode() + this.f49134d.hashCode();
        this.f49135e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivStroke(Expression<Integer> expression, DivStrokeStyle divStrokeStyle, Expression<DivSizeUnit> expression2, Expression<Double> expression3) {
        this.f49131a = expression;
        this.f49132b = divStrokeStyle;
        this.f49133c = expression2;
        this.f49134d = expression3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
