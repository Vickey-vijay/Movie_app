package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRoundedRectangleShape.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivRoundedRectangleShape implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48510g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DivFixedSize f48511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DivFixedSize f48512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final DivFixedSize f48513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShape> f48514k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f48515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivFixedSize f48516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivFixedSize f48517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DivFixedSize f48518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DivStroke f48519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f48520f;

    public DivRoundedRectangleShape() {
        this(null, null, null, null, null, 31, null);
    }

    public DivRoundedRectangleShape(Expression<Integer> expression, DivFixedSize divFixedSize, DivFixedSize divFixedSize2, DivFixedSize divFixedSize3, DivStroke divStroke) {
        this.f48515a = expression;
        this.f48516b = divFixedSize;
        this.f48517c = divFixedSize2;
        this.f48518d = divFixedSize3;
        this.f48519e = divStroke;
    }

    public final boolean a(DivRoundedRectangleShape divRoundedRectangleShape, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divRoundedRectangleShape == null) {
            return false;
        }
        Expression<Integer> expression = this.f48515a;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divRoundedRectangleShape.f48515a;
        if (!ck.p.e(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !this.f48516b.a(divRoundedRectangleShape.f48516b, expressionResolver, expressionResolver2) || !this.f48517c.a(divRoundedRectangleShape.f48517c, expressionResolver, expressionResolver2) || !this.f48518d.a(divRoundedRectangleShape.f48518d, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.f48519e;
        DivStroke divStroke2 = divRoundedRectangleShape.f48519e;
        if (divStroke != null) {
            zA = divStroke.a(divStroke2, expressionResolver, expressionResolver2);
        } else {
            zA = divStroke2 == null;
        }
        return zA;
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShape.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRoundedRectangleShape a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().x6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48511h = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f48512i = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f48513j = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f48514k = new bk.p<ParsingEnvironment, JSONObject, DivRoundedRectangleShape>() { // from class: com.yandex.div2.DivRoundedRectangleShape$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRoundedRectangleShape mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivRoundedRectangleShape.f48510g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48520f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivRoundedRectangleShape.class).hashCode();
        Expression<Integer> expression = this.f48515a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f48516b.hash() + this.f48517c.hash() + this.f48518d.hash();
        DivStroke divStroke = this.f48519e;
        int iHash = iHashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this.f48520f = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivRoundedRectangleShape(Expression expression, DivFixedSize divFixedSize, DivFixedSize divFixedSize2, DivFixedSize divFixedSize3, DivStroke divStroke, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f48511h : divFixedSize, (i10 & 4) != 0 ? f48512i : divFixedSize2, (i10 & 8) != 0 ? f48513j : divFixedSize3, (i10 & 16) != 0 ? null : divStroke);
    }
}
