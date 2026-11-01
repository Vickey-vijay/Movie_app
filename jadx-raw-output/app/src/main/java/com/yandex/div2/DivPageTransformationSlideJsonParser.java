package com.yandex.div2;

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
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPageTransformationSlideJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48205a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f48206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f48211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48215k;

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48216a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationSlide deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationSlideJsonParser.f48211g;
            bk.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationSlideJsonParser.f48206b;
            Expression<DivAnimationInterpolator> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, lVar, expression);
            Expression<DivAnimationInterpolator> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationSlideJsonParser.f48212h;
            Expression<Double> expression3 = DivPageTransformationSlideJsonParser.f48207c;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            ValueValidator<Double> valueValidator2 = DivPageTransformationSlideJsonParser.f48213i;
            Expression<Double> expression4 = DivPageTransformationSlideJsonParser.f48208d;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            ValueValidator<Double> valueValidator3 = DivPageTransformationSlideJsonParser.f48214j;
            Expression<Double> expression5 = DivPageTransformationSlideJsonParser.f48209e;
            Expression<Double> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            ValueValidator<Double> valueValidator4 = DivPageTransformationSlideJsonParser.f48215k;
            Expression<Double> expression6 = DivPageTransformationSlideJsonParser.f48210f;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression6);
            if (optionalExpression5 != null) {
                expression6 = optionalExpression5;
            }
            return new DivPageTransformationSlide(expression2, expression3, expression4, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationSlide divPageTransformationSlide) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divPageTransformationSlide.f48199a, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", divPageTransformationSlide.f48200b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", divPageTransformationSlide.f48201c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationSlide.f48202d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", divPageTransformationSlide.f48203e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48216a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48217a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationSlideTemplate deserialize(ParsingContext parsingContext, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivPageTransformationSlideJsonParser.f48211g, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f48226a : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f48227b : null;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivPageTransformationSlideTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, lVar, DivPageTransformationSlideJsonParser.f48212h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f48228c : null, lVar, DivPageTransformationSlideJsonParser.f48213i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f48229d : null, lVar, DivPageTransformationSlideJsonParser.f48214j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.f48230e : null, lVar, DivPageTransformationSlideJsonParser.f48215k));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divPageTransformationSlideTemplate.f48226a, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", divPageTransformationSlideTemplate.f48227b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", divPageTransformationSlideTemplate.f48228c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationSlideTemplate.f48229d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", divPageTransformationSlideTemplate.f48230e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48217a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPageTransformationSlideTemplate, DivPageTransformationSlide> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48218a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationSlide resolve(ParsingContext parsingContext, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivAnimationInterpolator>> field = divPageTransformationSlideTemplate.f48226a;
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationSlideJsonParser.f48211g;
            bk.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationSlideJsonParser.f48206b;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = divPageTransformationSlideTemplate.f48227b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationSlideJsonParser.f48212h;
            Expression<Double> expression2 = DivPageTransformationSlideJsonParser.f48207c;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Double>> field3 = divPageTransformationSlideTemplate.f48228c;
            ValueValidator<Double> valueValidator2 = DivPageTransformationSlideJsonParser.f48213i;
            Expression<Double> expression3 = DivPageTransformationSlideJsonParser.f48208d;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Field<Expression<Double>> field4 = divPageTransformationSlideTemplate.f48229d;
            ValueValidator<Double> valueValidator3 = DivPageTransformationSlideJsonParser.f48214j;
            Expression<Double> expression4 = DivPageTransformationSlideJsonParser.f48209e;
            Expression<Double> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Double>> field5 = divPageTransformationSlideTemplate.f48230e;
            ValueValidator<Double> valueValidator4 = DivPageTransformationSlideJsonParser.f48215k;
            Expression<Double> expression5 = DivPageTransformationSlideJsonParser.f48210f;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression5);
            return new DivPageTransformationSlide(expression, expression2, expression3, expression4, expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48218a = jsonParserComponent;
        }
    }

    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean f(double d10) {
        return d10 >= 0.0d;
    }

    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean h(double d10) {
        return d10 >= 0.0d;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f48206b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f48207c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48208d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48209e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48210f = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48211g = TypeHelper.Companion.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f48212h = new ValueValidator() { // from class: oe.g7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f48213i = new ValueValidator() { // from class: oe.h7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f48214j = new ValueValidator() { // from class: oe.i7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f48215k = new ValueValidator() { // from class: oe.j7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationSlideJsonParser.h(((Double) obj).doubleValue());
            }
        };
    }
}
