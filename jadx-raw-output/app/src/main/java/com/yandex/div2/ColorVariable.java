package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorVariable.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColorVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45911d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ColorVariable> f45912e = new bk.p<ParsingEnvironment, JSONObject, ColorVariable>() { // from class: com.yandex.div2.ColorVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ColorVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ColorVariable.f45911d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Integer> f45914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f45915c;

    public final boolean a(ColorVariable colorVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return colorVariable != null && ck.p.e(this.f45913a, colorVariable.f45913a) && this.f45914b.evaluate(expressionResolver).intValue() == colorVariable.f45914b.evaluate(expressionResolver2).intValue();
    }

    /* JADX INFO: compiled from: ColorVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final ColorVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().p().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45915c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(ColorVariable.class).hashCode() + this.f45913a.hashCode() + this.f45914b.hashCode();
        this.f45915c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public ColorVariable(String str, Expression<Integer> expression) {
        this.f45913a = str;
        this.f45914b = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
