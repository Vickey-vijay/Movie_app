package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorValue.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ColorValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45904c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ColorValue> f45905d = new bk.p<ParsingEnvironment, JSONObject, ColorValue>() { // from class: com.yandex.div2.ColorValue$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ColorValue mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ColorValue.f45904c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f45906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45907b;

    public final boolean a(ColorValue colorValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return colorValue != null && this.f45906a.evaluate(expressionResolver).intValue() == colorValue.f45906a.evaluate(expressionResolver2).intValue();
    }

    /* JADX INFO: compiled from: ColorValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final ColorValue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().m().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45907b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(ColorValue.class).hashCode() + this.f45906a.hashCode();
        this.f45907b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public ColorValue(Expression<Integer> expression) {
        this.f45906a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
