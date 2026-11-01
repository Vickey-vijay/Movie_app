package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: StartDestination.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StartDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50513b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, StartDestination> f50514c = new bk.p<ParsingEnvironment, JSONObject, StartDestination>() { // from class: com.yandex.div2.StartDestination$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StartDestination mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return StartDestination.f50513b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f50515a;

    public final boolean a(StartDestination startDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return startDestination != null;
    }

    /* JADX INFO: compiled from: StartDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final StartDestination a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().aa().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50515a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(StartDestination.class).hashCode();
        this.f50515a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().aa().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
