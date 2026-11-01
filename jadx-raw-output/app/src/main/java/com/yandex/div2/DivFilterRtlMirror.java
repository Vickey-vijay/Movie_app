package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirror.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivFilterRtlMirror implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47140b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFilterRtlMirror> f47141c = new bk.p<ParsingEnvironment, JSONObject, DivFilterRtlMirror>() { // from class: com.yandex.div2.DivFilterRtlMirror$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilterRtlMirror mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFilterRtlMirror.f47140b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47142a;

    public final boolean a(DivFilterRtlMirror divFilterRtlMirror, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFilterRtlMirror != null;
    }

    /* JADX INFO: compiled from: DivFilterRtlMirror.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFilterRtlMirror a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().k3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47142a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFilterRtlMirror.class).hashCode();
        this.f47142a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
