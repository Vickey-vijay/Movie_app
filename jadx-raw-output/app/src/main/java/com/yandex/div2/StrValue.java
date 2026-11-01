package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrValue.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class StrValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50518c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, StrValue> f50519d = new bk.p<ParsingEnvironment, JSONObject, StrValue>() { // from class: com.yandex.div2.StrValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StrValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return StrValue.f50518c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f50520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f50521b;

    /* JADX INFO: compiled from: StrValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final StrValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().da().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(StrValue strValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (strValue == null) {
            return false;
        }
        return ck.p.e(this.f50520a.evaluate(expressionResolver), strValue.f50520a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50521b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(StrValue.class).hashCode() + this.f50520a.hashCode();
        this.f50521b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public StrValue(Expression<String> expression) {
        this.f50520a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().da().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
