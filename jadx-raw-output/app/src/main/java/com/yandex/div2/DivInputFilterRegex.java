package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterRegex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivInputFilterRegex implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47868c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputFilterRegex> f47869d = new bk.p<ParsingEnvironment, JSONObject, DivInputFilterRegex>() { // from class: com.yandex.div2.DivInputFilterRegex$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterRegex mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputFilterRegex.f47868c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f47870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f47871b;

    /* JADX INFO: compiled from: DivInputFilterRegex.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputFilterRegex a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().p4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivInputFilterRegex divInputFilterRegex, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputFilterRegex == null) {
            return false;
        }
        return ck.p.e(this.f47870a.evaluate(expressionResolver), divInputFilterRegex.f47870a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47871b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInputFilterRegex.class).hashCode() + this.f47870a.hashCode();
        this.f47871b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivInputFilterRegex(Expression<String> expression) {
        this.f47870a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
