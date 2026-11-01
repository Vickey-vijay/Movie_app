package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStop.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionAnimatorStop implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46078c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStop> f46079d = new bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStop>() { // from class: com.yandex.div2.DivActionAnimatorStop$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStop mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionAnimatorStop.f46078c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46081b;

    /* JADX INFO: compiled from: DivActionAnimatorStop.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionAnimatorStop a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().N().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionAnimatorStop divActionAnimatorStop, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionAnimatorStop == null) {
            return false;
        }
        return ck.p.e(this.f46080a, divActionAnimatorStop.f46080a);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46081b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionAnimatorStop.class).hashCode() + this.f46080a.hashCode();
        this.f46081b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionAnimatorStop(String str) {
        this.f46080a = str;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
