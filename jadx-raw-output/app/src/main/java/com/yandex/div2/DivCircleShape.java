package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCircleShape.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCircleShape implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46595e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DivFixedSize f46596f = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCircleShape> f46597g = new bk.p<ParsingEnvironment, JSONObject, DivCircleShape>() { // from class: com.yandex.div2.DivCircleShape$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCircleShape mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCircleShape.f46595e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f46598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivFixedSize f46599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivStroke f46600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46601d;

    public DivCircleShape() {
        this(null, null, null, 7, null);
    }

    public DivCircleShape(Expression<Integer> expression, DivFixedSize divFixedSize, DivStroke divStroke) {
        this.f46598a = expression;
        this.f46599b = divFixedSize;
        this.f46600c = divStroke;
    }

    public final boolean a(DivCircleShape divCircleShape, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divCircleShape == null) {
            return false;
        }
        Expression<Integer> expression = this.f46598a;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divCircleShape.f46598a;
        if (!ck.p.e(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !this.f46599b.a(divCircleShape.f46599b, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.f46600c;
        DivStroke divStroke2 = divCircleShape.f46600c;
        if (divStroke != null) {
            zA = divStroke.a(divStroke2, expressionResolver, expressionResolver2);
        } else {
            zA = divStroke2 == null;
        }
        return zA;
    }

    /* JADX INFO: compiled from: DivCircleShape.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCircleShape a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().X1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46601d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivCircleShape.class).hashCode();
        Expression<Integer> expression = this.f46598a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f46599b.hash();
        DivStroke divStroke = this.f46600c;
        int iHash = iHashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this.f46601d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCircleShape(Expression expression, DivFixedSize divFixedSize, DivStroke divStroke, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f46596f : divFixedSize, (i10 & 4) != 0 ? null : divStroke);
    }
}
