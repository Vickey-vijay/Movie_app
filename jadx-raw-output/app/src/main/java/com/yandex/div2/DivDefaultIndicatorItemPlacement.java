package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDefaultIndicatorItemPlacement.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivDefaultIndicatorItemPlacement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46970c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DivFixedSize f46971d = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacement> f46972e = new bk.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacement>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacement$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDefaultIndicatorItemPlacement mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivDefaultIndicatorItemPlacement.f46970c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivFixedSize f46973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46974b;

    /* JADX WARN: Multi-variable type inference failed */
    public DivDefaultIndicatorItemPlacement() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DivDefaultIndicatorItemPlacement(DivFixedSize divFixedSize) {
        this.f46973a = divFixedSize;
    }

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivDefaultIndicatorItemPlacement a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().J2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDefaultIndicatorItemPlacement == null) {
            return false;
        }
        return this.f46973a.a(divDefaultIndicatorItemPlacement.f46973a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46974b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivDefaultIndicatorItemPlacement.class).hashCode() + this.f46973a.hash();
        this.f46974b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public /* synthetic */ DivDefaultIndicatorItemPlacement(DivFixedSize divFixedSize, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f46971d : divFixedSize);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
