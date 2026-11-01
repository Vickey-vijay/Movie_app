package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSolidBackground.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSolidBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49004c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSolidBackground> f49005d = new bk.p<ParsingEnvironment, JSONObject, DivSolidBackground>() { // from class: com.yandex.div2.DivSolidBackground$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSolidBackground mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivSolidBackground.f49004c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f49006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f49007b;

    public final boolean a(DivSolidBackground divSolidBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divSolidBackground != null && this.f49006a.evaluate(expressionResolver).intValue() == divSolidBackground.f49006a.evaluate(expressionResolver2).intValue();
    }

    /* JADX INFO: compiled from: DivSolidBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSolidBackground a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49007b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSolidBackground.class).hashCode() + this.f49006a.hashCode();
        this.f49007b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivSolidBackground(Expression<Integer> expression) {
        this.f49006a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
