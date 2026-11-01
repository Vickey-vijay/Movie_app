package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleSolid.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStrokeStyleSolid implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49155b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleSolid> f49156c = new bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleSolid>() { // from class: com.yandex.div2.DivStrokeStyleSolid$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleSolid mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivStrokeStyleSolid.f49155b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49157a;

    public final boolean a(DivStrokeStyleSolid divStrokeStyleSolid, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divStrokeStyleSolid != null;
    }

    /* JADX INFO: compiled from: DivStrokeStyleSolid.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivStrokeStyleSolid a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().L7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49157a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivStrokeStyleSolid.class).hashCode();
        this.f49157a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
