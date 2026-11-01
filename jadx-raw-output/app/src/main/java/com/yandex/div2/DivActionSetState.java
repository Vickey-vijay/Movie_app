package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetState.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionSetState implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46238d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Boolean> f46239e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionSetState> f46240f = new bk.p<ParsingEnvironment, JSONObject, DivActionSetState>() { // from class: com.yandex.div2.DivActionSetState$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetState mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionSetState.f46238d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f46241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f46242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46243c;

    public final boolean a(DivActionSetState divActionSetState, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionSetState != null && ck.p.e(this.f46241a.evaluate(expressionResolver), divActionSetState.f46241a.evaluate(expressionResolver2)) && this.f46242b.evaluate(expressionResolver).booleanValue() == divActionSetState.f46242b.evaluate(expressionResolver2).booleanValue();
    }

    /* JADX INFO: compiled from: DivActionSetState.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionSetState a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46243c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionSetState.class).hashCode() + this.f46241a.hashCode() + this.f46242b.hashCode();
        this.f46243c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionSetState(Expression<String> expression, Expression<Boolean> expression2) {
        this.f46241a = expression;
        this.f46242b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
