package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: IndexDestination.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class IndexDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50139c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, IndexDestination> f50140d = new bk.p<ParsingEnvironment, JSONObject, IndexDestination>() { // from class: com.yandex.div2.IndexDestination$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IndexDestination mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return IndexDestination.f50139c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f50141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f50142b;

    public final boolean a(IndexDestination indexDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return indexDestination != null && this.f50141a.evaluate(expressionResolver).longValue() == indexDestination.f50141a.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: IndexDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final IndexDestination a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().F9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50142b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(IndexDestination.class).hashCode() + this.f50141a.hashCode();
        this.f50142b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public IndexDestination(Expression<Long> expression) {
        this.f50141a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
