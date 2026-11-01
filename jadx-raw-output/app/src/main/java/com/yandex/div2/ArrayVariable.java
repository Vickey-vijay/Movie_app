package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayVariable.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ArrayVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45879d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ArrayVariable> f45880e = new bk.p<ParsingEnvironment, JSONObject, ArrayVariable>() { // from class: com.yandex.div2.ArrayVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ArrayVariable.f45879d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<JSONArray> f45882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f45883c;

    public final boolean a(ArrayVariable arrayVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return arrayVariable != null && ck.p.e(this.f45881a, arrayVariable.f45881a) && ck.p.e(this.f45882b.evaluate(expressionResolver), arrayVariable.f45882b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: ArrayVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final ArrayVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().d().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45883c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(ArrayVariable.class).hashCode() + this.f45881a.hashCode() + this.f45882b.hashCode();
        this.f45883c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public ArrayVariable(String str, Expression<JSONArray> expression) {
        this.f45881a = str;
        this.f45882b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
