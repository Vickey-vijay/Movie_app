package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedCount.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivFixedCount implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47149c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFixedCount> f47150d = new bk.p<ParsingEnvironment, JSONObject, DivFixedCount>() { // from class: com.yandex.div2.DivFixedCount$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedCount mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFixedCount.f47149c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f47151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f47152b;

    public final boolean a(DivFixedCount divFixedCount, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFixedCount != null && this.f47151a.evaluate(expressionResolver).longValue() == divFixedCount.f47151a.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivFixedCount.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFixedCount a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47152b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFixedCount.class).hashCode() + this.f47151a.hashCode();
        this.f47152b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivFixedCount(Expression<Long> expression) {
        this.f47151a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
