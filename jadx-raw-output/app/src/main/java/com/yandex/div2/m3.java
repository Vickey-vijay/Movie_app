package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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

/* JADX INFO: compiled from: DivShadowJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50753a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f50754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f50756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50758f;

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50759a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivShadow deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = m3.f50757e;
            Expression<Double> expression = m3.f50754b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = m3.f50758f;
            Expression<Long> expression2 = m3.f50755c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "blur", typeHelper2, lVar2, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression3 = m3.f50756d;
            Expression<Integer> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper3, lVar3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            return new DivShadow(expression, expression2, expression3, (DivPoint) JsonPropertyParser.read(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f50759a.Z5()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivShadow divShadow) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divShadow.f48767a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "blur", divShadow.f48768b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divShadow.f48769c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divShadow.f48770d, this.f50759a.Z5());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50759a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50760a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivShadowTemplate divShadowTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divShadowTemplate.f48777a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "blur", divShadowTemplate.f48778b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divShadowTemplate.f48779c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divShadowTemplate.f48780d, this.f50760a.a6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50760a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivShadowTemplate deserialize(ParsingContext parsingContext, DivShadowTemplate divShadowTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field;
            Field<Expression<Long>> field2;
            Field<Expression<Integer>> field3;
            Field<DivPointTemplate> field4;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (divShadowTemplate != null) {
                field = divShadowTemplate.f48777a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE, m3.f50757e);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            if (divShadowTemplate != null) {
                field2 = divShadowTemplate.f48778b;
            } else {
                field2 = null;
            }
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "blur", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT, m3.f50758f);
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            if (divShadowTemplate != null) {
                field3 = divShadowTemplate.f48779c;
            } else {
                field3 = null;
            }
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", typeHelper3, allowPropertyOverride, field3, ParsingConvertersKt.STRING_TO_COLOR_INT);
            if (divShadowTemplate != null) {
                field4 = divShadowTemplate.f48780d;
            } else {
                field4 = null;
            }
            return new DivShadowTemplate((Field<Expression<Double>>) optionalFieldWithExpression, (Field<Expression<Long>>) optionalFieldWithExpression2, (Field<Expression<Integer>>) optionalFieldWithExpression3, (Field<DivPointTemplate>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, allowPropertyOverride, field4, this.f50760a.a6()));
        }
    }

    /* JADX INFO: compiled from: DivShadowJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivShadowTemplate, DivShadow> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50761a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivShadow resolve(ParsingContext parsingContext, DivShadowTemplate divShadowTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = divShadowTemplate.f48777a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = m3.f50757e;
            Expression<Double> expression = m3.f50754b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Long>> field2 = divShadowTemplate.f48778b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = m3.f50758f;
            Expression<Long> expression2 = m3.f50755c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "blur", typeHelper2, lVar2, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Integer>> field3 = divShadowTemplate.f48779c;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression3 = m3.f50756d;
            Expression<Integer> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "color", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new DivShadow(expression, expression2, expression3, (DivPoint) JsonFieldResolver.resolve(parsingContext, divShadowTemplate.f48780d, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f50761a.b6(), this.f50761a.Z5()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50761a = jsonParserComponent;
        }
    }

    public static final boolean c(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50754b = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f50755c = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f50756d = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f50757e = new ValueValidator() { // from class: oe.x8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m3.c(((Double) obj).doubleValue());
            }
        };
        f50758f = new ValueValidator() { // from class: oe.y8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m3.d(((Long) obj).longValue());
            }
        };
    }
}
