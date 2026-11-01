package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSize.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivNeighbourPageSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48068c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivNeighbourPageSize> f48069d = new bk.p<ParsingEnvironment, JSONObject, DivNeighbourPageSize>() { // from class: com.yandex.div2.DivNeighbourPageSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNeighbourPageSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivNeighbourPageSize.f48068c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivFixedSize f48070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48071b;

    /* JADX INFO: compiled from: DivNeighbourPageSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivNeighbourPageSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivNeighbourPageSize divNeighbourPageSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divNeighbourPageSize == null) {
            return false;
        }
        return this.f48070a.a(divNeighbourPageSize.f48070a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48071b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivNeighbourPageSize.class).hashCode() + this.f48070a.hash();
        this.f48071b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivNeighbourPageSize(DivFixedSize divFixedSize) {
        this.f48070a = divFixedSize;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
