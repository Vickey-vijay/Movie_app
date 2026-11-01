package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAspect.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivAspect implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46504c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAspect> f46505d = new bk.p<ParsingEnvironment, JSONObject, DivAspect>() { // from class: com.yandex.div2.DivAspect$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAspect mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAspect.f46504c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f46506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46507b;

    public final boolean a(DivAspect divAspect, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divAspect != null && this.f46506a.evaluate(expressionResolver).doubleValue() == divAspect.f46506a.evaluate(expressionResolver2).doubleValue();
    }

    /* JADX INFO: compiled from: DivAspect.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAspect a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().C1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46507b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivAspect.class).hashCode() + this.f46506a.hashCode();
        this.f46507b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivAspect(Expression<Double> expression) {
        this.f46506a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
