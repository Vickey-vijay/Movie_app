package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeBoundsTransition.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivChangeBoundsTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46551e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Long> f46552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f46553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f46554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransition> f46555i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f46557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f46558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46559d;

    public DivChangeBoundsTransition() {
        this(null, null, null, 7, null);
    }

    public DivChangeBoundsTransition(Expression<Long> expression, Expression<DivAnimationInterpolator> expression2, Expression<Long> expression3) {
        this.f46556a = expression;
        this.f46557b = expression2;
        this.f46558c = expression3;
    }

    public final boolean a(DivChangeBoundsTransition divChangeBoundsTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divChangeBoundsTransition != null && b().evaluate(expressionResolver).longValue() == divChangeBoundsTransition.b().evaluate(expressionResolver2).longValue() && c().evaluate(expressionResolver) == divChangeBoundsTransition.c().evaluate(expressionResolver2) && d().evaluate(expressionResolver).longValue() == divChangeBoundsTransition.d().evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivChangeBoundsTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().O1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46552f = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f46553g = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f46554h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46555i = new bk.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransition>() { // from class: com.yandex.div2.DivChangeBoundsTransition$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivChangeBoundsTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivChangeBoundsTransition.f46551e.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public Expression<Long> b() {
        return this.f46556a;
    }

    public Expression<DivAnimationInterpolator> c() {
        return this.f46557b;
    }

    public Expression<Long> d() {
        return this.f46558c;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46559d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivChangeBoundsTransition.class).hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f46559d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivChangeBoundsTransition(Expression expression, Expression expression2, Expression expression3, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f46552f : expression, (i10 & 2) != 0 ? f46553g : expression2, (i10 & 4) != 0 ? f46554h : expression3);
    }
}
