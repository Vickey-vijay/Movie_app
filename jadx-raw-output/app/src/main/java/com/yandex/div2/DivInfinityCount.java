package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInfinityCount.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivInfinityCount implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47792b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInfinityCount> f47793c = new bk.p<ParsingEnvironment, JSONObject, DivInfinityCount>() { // from class: com.yandex.div2.DivInfinityCount$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInfinityCount mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInfinityCount.f47792b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47794a;

    public final boolean a(DivInfinityCount divInfinityCount, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divInfinityCount != null;
    }

    /* JADX INFO: compiled from: DivInfinityCount.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInfinityCount a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().g4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47794a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInfinityCount.class).hashCode();
        this.f47794a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
