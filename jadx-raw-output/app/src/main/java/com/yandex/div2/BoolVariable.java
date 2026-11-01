package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolVariable.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class BoolVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45895d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, BoolVariable> f45896e = new bk.p<ParsingEnvironment, JSONObject, BoolVariable>() { // from class: com.yandex.div2.BoolVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BoolVariable.f45895d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f45898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f45899c;

    public final boolean a(BoolVariable boolVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return boolVariable != null && ck.p.e(this.f45897a, boolVariable.f45897a) && this.f45898b.evaluate(expressionResolver).booleanValue() == boolVariable.f45898b.evaluate(expressionResolver2).booleanValue();
    }

    /* JADX INFO: compiled from: BoolVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final BoolVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().j().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45899c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(BoolVariable.class).hashCode() + this.f45897a.hashCode() + this.f45898b.hashCode();
        this.f45899c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public BoolVariable(String str, Expression<Boolean> expression) {
        this.f45897a = str;
        this.f45898b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
