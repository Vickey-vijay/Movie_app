package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetVariable.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionSetVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46260d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionSetVariable> f46261e = new bk.p<ParsingEnvironment, JSONObject, DivActionSetVariable>() { // from class: com.yandex.div2.DivActionSetVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionSetVariable.f46260d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivTypedValue f46262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f46263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46264c;

    public final boolean a(DivActionSetVariable divActionSetVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionSetVariable != null && this.f46262a.a(divActionSetVariable.f46262a, expressionResolver, expressionResolver2) && ck.p.e(this.f46263b.evaluate(expressionResolver), divActionSetVariable.f46263b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionSetVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionSetVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46264c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionSetVariable.class).hashCode() + this.f46262a.hash() + this.f46263b.hashCode();
        this.f46264c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionSetVariable(DivTypedValue divTypedValue, Expression<String> expression) {
        this.f46262a = divTypedValue;
        this.f46263b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
