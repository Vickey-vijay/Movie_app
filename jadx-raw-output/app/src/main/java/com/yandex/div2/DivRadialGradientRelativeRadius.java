package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivRadialGradientRelativeRadius implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48483c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadius> f48484d = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadius>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeRadius mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientRelativeRadius.f48483c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Value> f48485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48486b;

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
    public enum Value {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Value, String> TO_STRING = new bk.l<Value, String>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivRadialGradientRelativeRadius.Value value) {
                return DivRadialGradientRelativeRadius.Value.Converter.b(value);
            }
        };
        public static final bk.l<String, Value> FROM_STRING = new bk.l<String, Value>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivRadialGradientRelativeRadius.Value invoke(String str) {
                return DivRadialGradientRelativeRadius.Value.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Value a(String str) {
                Value value = Value.NEAREST_CORNER;
                if (ck.p.e(str, value.value)) {
                    return value;
                }
                Value value2 = Value.FARTHEST_CORNER;
                if (ck.p.e(str, value2.value)) {
                    return value2;
                }
                Value value3 = Value.NEAREST_SIDE;
                if (ck.p.e(str, value3.value)) {
                    return value3;
                }
                Value value4 = Value.FARTHEST_SIDE;
                if (ck.p.e(str, value4.value)) {
                    return value4;
                }
                return null;
            }

            public final String b(Value value) {
                return value.value;
            }
        }

        Value(String str) {
            this.value = str;
        }
    }

    public final boolean a(DivRadialGradientRelativeRadius divRadialGradientRelativeRadius, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divRadialGradientRelativeRadius != null && this.f48485a.evaluate(expressionResolver) == divRadialGradientRelativeRadius.f48485a.evaluate(expressionResolver2);
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRadialGradientRelativeRadius a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().u6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48486b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivRadialGradientRelativeRadius.class).hashCode() + this.f48485a.hashCode();
        this.f48486b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivRadialGradientRelativeRadius(Expression<Value> expression) {
        this.f48485a = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
