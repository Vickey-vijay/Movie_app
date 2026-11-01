package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleDashed.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStrokeStyleDashed implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49150b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleDashed> f49151c = new bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleDashed>() { // from class: com.yandex.div2.DivStrokeStyleDashed$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleDashed mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivStrokeStyleDashed.f49150b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49152a;

    public final boolean a(DivStrokeStyleDashed divStrokeStyleDashed, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divStrokeStyleDashed != null;
    }

    /* JADX INFO: compiled from: DivStrokeStyleDashed.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivStrokeStyleDashed a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().F7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49152a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivStrokeStyleDashed.class).hashCode();
        this.f49152a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
