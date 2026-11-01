package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrVariable.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class StrVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50525d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, StrVariable> f50526e = new bk.p<ParsingEnvironment, JSONObject, StrVariable>() { // from class: com.yandex.div2.StrVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StrVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return StrVariable.f50525d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f50528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f50529c;

    public final boolean a(StrVariable strVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return strVariable != null && ck.p.e(this.f50527a, strVariable.f50527a) && ck.p.e(this.f50528b.evaluate(expressionResolver), strVariable.f50528b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: StrVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final StrVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().ga().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50529c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(StrVariable.class).hashCode() + this.f50527a.hashCode() + this.f50528b.hashCode();
        this.f50529c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public StrVariable(String str, Expression<String> expression) {
        this.f50527a = str;
        this.f50528b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ga().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
