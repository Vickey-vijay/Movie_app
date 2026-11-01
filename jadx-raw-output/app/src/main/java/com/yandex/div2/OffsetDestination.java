package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: OffsetDestination.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class OffsetDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50483c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, OffsetDestination> f50484d = new bk.p<ParsingEnvironment, JSONObject, OffsetDestination>() { // from class: com.yandex.div2.OffsetDestination$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final OffsetDestination mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return OffsetDestination.f50483c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f50485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f50486b;

    public final boolean a(OffsetDestination offsetDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return offsetDestination != null && this.f50485a.evaluate(expressionResolver).longValue() == offsetDestination.f50485a.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: OffsetDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final OffsetDestination a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().U9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50486b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(OffsetDestination.class).hashCode() + this.f50485a.hashCode();
        this.f50486b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public OffsetDestination(Expression<Long> expression) {
        this.f50485a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
