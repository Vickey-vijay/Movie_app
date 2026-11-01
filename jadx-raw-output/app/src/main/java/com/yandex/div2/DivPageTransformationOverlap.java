package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationOverlap.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivPageTransformationOverlap implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f48148h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Double> f48150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Double> f48151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Double> f48152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Double> f48153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Boolean> f48154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageTransformationOverlap> f48155o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f48156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Double> f48157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Double> f48158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f48159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Double> f48160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Boolean> f48161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f48162g;

    public DivPageTransformationOverlap() {
        this(null, null, null, null, null, null, 63, null);
    }

    public DivPageTransformationOverlap(Expression<DivAnimationInterpolator> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5, Expression<Boolean> expression6) {
        this.f48156a = expression;
        this.f48157b = expression2;
        this.f48158c = expression3;
        this.f48159d = expression4;
        this.f48160e = expression5;
        this.f48161f = expression6;
    }

    public final boolean a(DivPageTransformationOverlap divPageTransformationOverlap, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPageTransformationOverlap == null || this.f48156a.evaluate(expressionResolver) != divPageTransformationOverlap.f48156a.evaluate(expressionResolver2)) {
            return false;
        }
        if (!(this.f48157b.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f48157b.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (!(this.f48158c.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f48158c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        if (this.f48159d.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f48159d.evaluate(expressionResolver2).doubleValue()) {
            return ((this.f48160e.evaluate(expressionResolver).doubleValue() > divPageTransformationOverlap.f48160e.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f48160e.evaluate(expressionResolver).doubleValue() == divPageTransformationOverlap.f48160e.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0) && this.f48161f.evaluate(expressionResolver).booleanValue() == divPageTransformationOverlap.f48161f.evaluate(expressionResolver2).booleanValue();
        }
        return false;
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlap.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPageTransformationOverlap a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().t5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48149i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f48150j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48151k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48152l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48153m = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48154n = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f48155o = new bk.p<ParsingEnvironment, JSONObject, DivPageTransformationOverlap>() { // from class: com.yandex.div2.DivPageTransformationOverlap$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationOverlap mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivPageTransformationOverlap.f48148h.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48162g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPageTransformationOverlap.class).hashCode() + this.f48156a.hashCode() + this.f48157b.hashCode() + this.f48158c.hashCode() + this.f48159d.hashCode() + this.f48160e.hashCode() + this.f48161f.hashCode();
        this.f48162g = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPageTransformationOverlap(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f48149i : expression, (i10 & 2) != 0 ? f48150j : expression2, (i10 & 4) != 0 ? f48151k : expression3, (i10 & 8) != 0 ? f48152l : expression4, (i10 & 16) != 0 ? f48153m : expression5, (i10 & 32) != 0 ? f48154n : expression6);
    }
}
