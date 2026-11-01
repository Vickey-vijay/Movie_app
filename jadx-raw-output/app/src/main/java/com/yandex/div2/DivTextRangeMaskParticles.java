package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskParticles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTextRangeMaskParticles implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f49669g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Double> f49670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Boolean> f49671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Boolean> f49672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DivFixedSize f49673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticles> f49674l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f49675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Double> f49676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Boolean> f49677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Boolean> f49678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DivFixedSize f49679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f49680f;

    public final boolean a(DivTextRangeMaskParticles divTextRangeMaskParticles, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextRangeMaskParticles != null && this.f49675a.evaluate(expressionResolver).intValue() == divTextRangeMaskParticles.f49675a.evaluate(expressionResolver2).intValue()) {
            return ((this.f49676b.evaluate(expressionResolver).doubleValue() > divTextRangeMaskParticles.f49676b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f49676b.evaluate(expressionResolver).doubleValue() == divTextRangeMaskParticles.f49676b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && this.f49677c.evaluate(expressionResolver).booleanValue() == divTextRangeMaskParticles.f49677c.evaluate(expressionResolver2).booleanValue() && this.f49678d.evaluate(expressionResolver).booleanValue() == divTextRangeMaskParticles.f49678d.evaluate(expressionResolver2).booleanValue() && this.f49679e.a(divTextRangeMaskParticles.f49679e, expressionResolver, expressionResolver2);
        }
        return false;
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticles.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextRangeMaskParticles a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().G8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49670h = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f49671i = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f49672j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49673k = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f49674l = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskParticles>() { // from class: com.yandex.div2.DivTextRangeMaskParticles$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextRangeMaskParticles mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivTextRangeMaskParticles.f49669g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49680f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTextRangeMaskParticles.class).hashCode() + this.f49675a.hashCode() + this.f49676b.hashCode() + this.f49677c.hashCode() + this.f49678d.hashCode() + this.f49679e.hash();
        this.f49680f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivTextRangeMaskParticles(Expression<Integer> expression, Expression<Double> expression2, Expression<Boolean> expression3, Expression<Boolean> expression4, DivFixedSize divFixedSize) {
        this.f49675a = expression;
        this.f49676b = expression2;
        this.f49677c = expression3;
        this.f49678d = expression4;
        this.f49679e = divFixedSize;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
