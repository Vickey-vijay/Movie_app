package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBorder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTextRangeBorder implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49628d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeBorder> f49629e = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeBorder>() { // from class: com.yandex.div2.DivTextRangeBorder$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBorder mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeBorder.f49628d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f49630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivStroke f49631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f49632c;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTextRangeBorder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivTextRangeBorder(Expression<Long> expression, DivStroke divStroke) {
        this.f49630a = expression;
        this.f49631b = divStroke;
    }

    public final boolean a(DivTextRangeBorder divTextRangeBorder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divTextRangeBorder == null) {
            return false;
        }
        Expression<Long> expression = this.f49630a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divTextRangeBorder.f49630a;
        if (!ck.p.e(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivStroke divStroke = this.f49631b;
        DivStroke divStroke2 = divTextRangeBorder.f49631b;
        if (divStroke != null) {
            zA = divStroke.a(divStroke2, expressionResolver, expressionResolver2);
        } else {
            zA = divStroke2 == null;
        }
        return zA;
    }

    /* JADX INFO: compiled from: DivTextRangeBorder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextRangeBorder a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().v8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49632c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTextRangeBorder.class).hashCode();
        Expression<Long> expression = this.f49630a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        DivStroke divStroke = this.f49631b;
        int iHash = iHashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this.f49632c = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTextRangeBorder(Expression expression, DivStroke divStroke, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divStroke);
    }
}
