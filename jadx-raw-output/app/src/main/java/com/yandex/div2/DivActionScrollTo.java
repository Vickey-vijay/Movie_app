package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollTo.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionScrollTo implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46225e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Boolean> f46226f = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionScrollTo> f46227g = new bk.p<ParsingEnvironment, JSONObject, DivActionScrollTo>() { // from class: com.yandex.div2.DivActionScrollTo$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollTo mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionScrollTo.f46225e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f46228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivActionScrollDestination f46229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f46230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46231d;

    public final boolean a(DivActionScrollTo divActionScrollTo, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionScrollTo != null && this.f46228a.evaluate(expressionResolver).booleanValue() == divActionScrollTo.f46228a.evaluate(expressionResolver2).booleanValue() && this.f46229b.a(divActionScrollTo.f46229b, expressionResolver, expressionResolver2) && ck.p.e(this.f46230c.evaluate(expressionResolver), divActionScrollTo.f46230c.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionScrollTo.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionScrollTo a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().G0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46231d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionScrollTo.class).hashCode() + this.f46228a.hashCode() + this.f46229b.hash() + this.f46230c.hashCode();
        this.f46231d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionScrollTo(Expression<Boolean> expression, DivActionScrollDestination divActionScrollDestination, Expression<String> expression2) {
        this.f46228a = expression;
        this.f46229b = divActionScrollDestination;
        this.f46230c = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
