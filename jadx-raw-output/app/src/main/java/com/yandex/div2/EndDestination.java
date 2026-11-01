package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndDestination.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class EndDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50134b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, EndDestination> f50135c = new bk.p<ParsingEnvironment, JSONObject, EndDestination>() { // from class: com.yandex.div2.EndDestination$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final EndDestination mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return EndDestination.f50134b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f50136a;

    public final boolean a(EndDestination endDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return endDestination != null;
    }

    /* JADX INFO: compiled from: EndDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final EndDestination a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().C9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50136a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(EndDestination.class).hashCode();
        this.f50136a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
