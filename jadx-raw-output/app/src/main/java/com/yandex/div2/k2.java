package com.yandex.div2;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50710a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50711b = new ValueValidator() { // from class: oe.j6
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.k2.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50712a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradient.ColorPoint deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivLinearGradient.ColorPoint(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, C3426d4.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, k2.f50711b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradient.ColorPoint colorPoint) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", colorPoint.f48044a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.i.L, colorPoint.f48045b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50712a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50713a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradientTemplate.ColorPointTemplate colorPointTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", colorPointTemplate.f48055a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.i.L, colorPointTemplate.f48056b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50713a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradientTemplate.ColorPointTemplate deserialize(ParsingContext parsingContext, DivLinearGradientTemplate.ColorPointTemplate colorPointTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field;
            Field<Expression<Double>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            if (colorPointTemplate != null) {
                field = colorPointTemplate.f48055a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (colorPointTemplate != null) {
                field2 = colorPointTemplate.f48056b;
            } else {
                field2 = null;
            }
            return new DivLinearGradientTemplate.ColorPointTemplate(fieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.i.L, typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_DOUBLE, k2.f50711b));
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivLinearGradientTemplate.ColorPointTemplate, DivLinearGradient.ColorPoint> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50714a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradient.ColorPoint resolve(ParsingContext parsingContext, DivLinearGradientTemplate.ColorPointTemplate colorPointTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivLinearGradient.ColorPoint(JsonFieldResolver.resolveExpression(parsingContext, colorPointTemplate.f48055a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, colorPointTemplate.f48056b, jSONObject, C3426d4.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, k2.f50711b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50714a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }
}
