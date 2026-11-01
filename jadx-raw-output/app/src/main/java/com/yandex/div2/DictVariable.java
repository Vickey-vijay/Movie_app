package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictVariable.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DictVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45941d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DictVariable> f45942e = new bk.p<ParsingEnvironment, JSONObject, DictVariable>() { // from class: com.yandex.div2.DictVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DictVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DictVariable.f45941d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<JSONObject> f45944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f45945c;

    public final boolean a(DictVariable dictVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return dictVariable != null && ck.p.e(this.f45943a, dictVariable.f45943a) && ck.p.e(this.f45944b.evaluate(expressionResolver), dictVariable.f45944b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DictVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DictVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45945c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DictVariable.class).hashCode() + this.f45943a.hashCode() + this.f45944b.hashCode();
        this.f45945c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DictVariable(String str, Expression<JSONObject> expression) {
        this.f45943a = str;
        this.f45944b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
