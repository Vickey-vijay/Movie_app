package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPoint.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPoint implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48416d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPoint> f48417e = new bk.p<ParsingEnvironment, JSONObject, DivPoint>() { // from class: com.yandex.div2.DivPoint$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPoint mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPoint.f48416d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivDimension f48418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivDimension f48419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f48420c;

    public final boolean a(DivPoint divPoint, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPoint != null && this.f48418a.a(divPoint.f48418a, expressionResolver, expressionResolver2) && this.f48419b.a(divPoint.f48419b, expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivPoint.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPoint a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Z5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48420c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPoint.class).hashCode() + this.f48418a.hash() + this.f48419b.hash();
        this.f48420c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivPoint(DivDimension divDimension, DivDimension divDimension2) {
        this.f48418a = divDimension;
        this.f48419b = divDimension2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
