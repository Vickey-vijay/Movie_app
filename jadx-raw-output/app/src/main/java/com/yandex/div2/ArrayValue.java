package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45872c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ArrayValue> f45873d = new bk.p<ParsingEnvironment, JSONObject, ArrayValue>() { // from class: com.yandex.div2.ArrayValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ArrayValue.f45872c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<JSONArray> f45874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45875b;

    /* JADX INFO: compiled from: ArrayValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final ArrayValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().a().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(ArrayValue arrayValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (arrayValue == null) {
            return false;
        }
        return ck.p.e(this.f45874a.evaluate(expressionResolver), arrayValue.f45874a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45875b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(ArrayValue.class).hashCode() + this.f45874a.hashCode();
        this.f45875b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public ArrayValue(Expression<JSONArray> expression) {
        this.f45874a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
