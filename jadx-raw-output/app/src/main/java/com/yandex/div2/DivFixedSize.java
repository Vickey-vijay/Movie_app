package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedSize.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivFixedSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47184d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f47185e = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFixedSize> f47186f = new bk.p<ParsingEnvironment, JSONObject, DivFixedSize>() { // from class: com.yandex.div2.DivFixedSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFixedSize.f47184d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<DivSizeUnit> f47187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f47188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f47189c;

    public DivFixedSize(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.f47187a = expression;
        this.f47188b = expression2;
    }

    public final boolean a(DivFixedSize divFixedSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFixedSize != null && this.f47187a.evaluate(expressionResolver) == divFixedSize.f47187a.evaluate(expressionResolver2) && this.f47188b.evaluate(expressionResolver).longValue() == divFixedSize.f47188b.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivFixedSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFixedSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47189c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFixedSize.class).hashCode() + this.f47187a.hashCode() + this.f47188b.hashCode();
        this.f47189c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFixedSize(Expression expression, Expression expression2, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f47185e : expression, expression2);
    }
}
