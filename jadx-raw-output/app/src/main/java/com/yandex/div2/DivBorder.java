package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBorder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivBorder implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f46534g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Boolean> f46535h = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivBorder> f46536i = new bk.p<ParsingEnvironment, JSONObject, DivBorder>() { // from class: com.yandex.div2.DivBorder$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBorder mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivBorder.f46534g.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivCornersRadius f46538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Boolean> f46539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DivShadow f46540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DivStroke f46541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f46542f;

    public DivBorder() {
        this(null, null, null, null, null, 31, null);
    }

    public DivBorder(Expression<Long> expression, DivCornersRadius divCornersRadius, Expression<Boolean> expression2, DivShadow divShadow, DivStroke divStroke) {
        this.f46537a = expression;
        this.f46538b = divCornersRadius;
        this.f46539c = expression2;
        this.f46540d = divShadow;
        this.f46541e = divStroke;
    }

    public final boolean a(DivBorder divBorder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean zA3;
        if (divBorder == null) {
            return false;
        }
        Expression<Long> expression = this.f46537a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divBorder.f46537a;
        if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivCornersRadius divCornersRadius = this.f46538b;
        if (divCornersRadius != null) {
            zA = divCornersRadius.a(divBorder.f46538b, expressionResolver, expressionResolver2);
        } else {
            zA = divBorder.f46538b == null;
        }
        if (!zA || this.f46539c.evaluate(expressionResolver).booleanValue() != divBorder.f46539c.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        DivShadow divShadow = this.f46540d;
        if (divShadow != null) {
            zA2 = divShadow.a(divBorder.f46540d, expressionResolver, expressionResolver2);
        } else {
            zA2 = divBorder.f46540d == null;
        }
        if (!zA2) {
            return false;
        }
        DivStroke divStroke = this.f46541e;
        DivStroke divStroke2 = divBorder.f46541e;
        if (divStroke != null) {
            zA3 = divStroke.a(divStroke2, expressionResolver, expressionResolver2);
        } else {
            zA3 = divStroke2 == null;
        }
        return zA3;
    }

    /* JADX INFO: compiled from: DivBorder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivBorder a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46542f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivBorder.class).hashCode();
        Expression<Long> expression = this.f46537a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        DivCornersRadius divCornersRadius = this.f46538b;
        int iHash = iHashCode2 + (divCornersRadius != null ? divCornersRadius.hash() : 0) + this.f46539c.hashCode();
        DivShadow divShadow = this.f46540d;
        int iHash2 = iHash + (divShadow != null ? divShadow.hash() : 0);
        DivStroke divStroke = this.f46541e;
        int iHash3 = iHash2 + (divStroke != null ? divStroke.hash() : 0);
        this.f46542f = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivBorder(Expression expression, DivCornersRadius divCornersRadius, Expression expression2, DivShadow divShadow, DivStroke divStroke, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divCornersRadius, (i10 & 4) != 0 ? f46535h : expression2, (i10 & 8) != 0 ? null : divShadow, (i10 & 16) != 0 ? null : divStroke);
    }
}
