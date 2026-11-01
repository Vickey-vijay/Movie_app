package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBlur.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivBlur implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46527c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivBlur> f46528d = new bk.p<ParsingEnvironment, JSONObject, DivBlur>() { // from class: com.yandex.div2.DivBlur$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBlur mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivBlur.f46527c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f46529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46530b;

    public final boolean a(DivBlur divBlur, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divBlur != null && this.f46529a.evaluate(expressionResolver).longValue() == divBlur.f46529a.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivBlur.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivBlur a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46530b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivBlur.class).hashCode() + this.f46529a.hashCode();
        this.f46530b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivBlur(Expression<Long> expression) {
        this.f46529a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
