package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSize.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPageSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48136c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageSize> f48137d = new bk.p<ParsingEnvironment, JSONObject, DivPageSize>() { // from class: com.yandex.div2.DivPageSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPageSize.f48136c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivPercentageSize f48138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48139b;

    /* JADX INFO: compiled from: DivPageSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPageSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivPageSize divPageSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPageSize == null) {
            return false;
        }
        return this.f48138a.a(divPageSize.f48138a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48139b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPageSize.class).hashCode() + this.f48138a.hash();
        this.f48139b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivPageSize(DivPercentageSize divPercentageSize) {
        this.f48138a = divPercentageSize;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
