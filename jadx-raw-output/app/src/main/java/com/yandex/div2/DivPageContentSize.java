package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageContentSize.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPageContentSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48131b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageContentSize> f48132c = new bk.p<ParsingEnvironment, JSONObject, DivPageContentSize>() { // from class: com.yandex.div2.DivPageContentSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageContentSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPageContentSize.f48131b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48133a;

    public final boolean a(DivPageContentSize divPageContentSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPageContentSize != null;
    }

    /* JADX INFO: compiled from: DivPageContentSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPageContentSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().k5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48133a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPageContentSize.class).hashCode();
        this.f48133a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
