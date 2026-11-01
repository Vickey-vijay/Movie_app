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
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPageTransformationOverlapJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48163a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f48164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f48169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f48170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48174l;

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48175a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationOverlap deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationOverlapJsonParser.f48170h;
            bk.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationOverlapJsonParser.f48164b;
            Expression<DivAnimationInterpolator> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, lVar, expression);
            Expression<DivAnimationInterpolator> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationOverlapJsonParser.f48171i;
            Expression<Double> expression3 = DivPageTransformationOverlapJsonParser.f48165c;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            ValueValidator<Double> valueValidator2 = DivPageTransformationOverlapJsonParser.f48172j;
            Expression<Double> expression4 = DivPageTransformationOverlapJsonParser.f48166d;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            ValueValidator<Double> valueValidator3 = DivPageTransformationOverlapJsonParser.f48173k;
            Expression<Double> expression5 = DivPageTransformationOverlapJsonParser.f48167e;
            Expression<Double> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            ValueValidator<Double> valueValidator4 = DivPageTransformationOverlapJsonParser.f48174l;
            Expression<Double> expression6 = DivPageTransformationOverlapJsonParser.f48168f;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression6);
            if (optionalExpression5 != null) {
                expression6 = optionalExpression5;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression7 = DivPageTransformationOverlapJsonParser.f48169g;
            Expression<Boolean> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reversed_stacking_order", typeHelper3, lVar3, expression7);
            return new DivPageTransformationOverlap(expression2, expression3, expression4, expression5, expression6, optionalExpression6 == null ? expression7 : optionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationOverlap divPageTransformationOverlap) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divPageTransformationOverlap.f48156a, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", divPageTransformationOverlap.f48157b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", divPageTransformationOverlap.f48158c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationOverlap.f48159d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", divPageTransformationOverlap.f48160e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reversed_stacking_order", divPageTransformationOverlap.f48161f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48175a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48176a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationOverlapTemplate deserialize(ParsingContext parsingContext, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivPageTransformationOverlapJsonParser.f48170h, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f48186a : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f48187b : null;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivPageTransformationOverlapTemplate((Field<Expression<DivAnimationInterpolator>>) optionalFieldWithExpression, (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, lVar, DivPageTransformationOverlapJsonParser.f48171i), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f48188c : null, lVar, DivPageTransformationOverlapJsonParser.f48172j), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f48189d : null, lVar, DivPageTransformationOverlapJsonParser.f48173k), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f48190e : null, lVar, DivPageTransformationOverlapJsonParser.f48174l), (Field<Expression<Boolean>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.f48191f : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divPageTransformationOverlapTemplate.f48186a, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", divPageTransformationOverlapTemplate.f48187b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", divPageTransformationOverlapTemplate.f48188c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationOverlapTemplate.f48189d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", divPageTransformationOverlapTemplate.f48190e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reversed_stacking_order", divPageTransformationOverlapTemplate.f48191f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48176a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPageTransformationOverlapTemplate, DivPageTransformationOverlap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48177a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPageTransformationOverlap resolve(ParsingContext parsingContext, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivAnimationInterpolator>> field = divPageTransformationOverlapTemplate.f48186a;
            TypeHelper<DivAnimationInterpolator> typeHelper = DivPageTransformationOverlapJsonParser.f48170h;
            bk.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = DivPageTransformationOverlapJsonParser.f48164b;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = divPageTransformationOverlapTemplate.f48187b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPageTransformationOverlapJsonParser.f48171i;
            Expression<Double> expression2 = DivPageTransformationOverlapJsonParser.f48165c;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, lVar2, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Double>> field3 = divPageTransformationOverlapTemplate.f48188c;
            ValueValidator<Double> valueValidator2 = DivPageTransformationOverlapJsonParser.f48172j;
            Expression<Double> expression3 = DivPageTransformationOverlapJsonParser.f48166d;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, lVar2, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Field<Expression<Double>> field4 = divPageTransformationOverlapTemplate.f48189d;
            ValueValidator<Double> valueValidator3 = DivPageTransformationOverlapJsonParser.f48173k;
            Expression<Double> expression4 = DivPageTransformationOverlapJsonParser.f48167e;
            Expression<Double> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, lVar2, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Double>> field5 = divPageTransformationOverlapTemplate.f48190e;
            ValueValidator<Double> valueValidator4 = DivPageTransformationOverlapJsonParser.f48174l;
            Expression<Double> expression5 = DivPageTransformationOverlapJsonParser.f48168f;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, lVar2, valueValidator4, expression5);
            if (expressionResolveOptionalExpression5 != null) {
                expression5 = expressionResolveOptionalExpression5;
            }
            Field<Expression<Boolean>> field6 = divPageTransformationOverlapTemplate.f48191f;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression6 = DivPageTransformationOverlapJsonParser.f48169g;
            Expression<Boolean> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "reversed_stacking_order", typeHelper3, lVar3, expression6);
            return new DivPageTransformationOverlap(expression, expression2, expression3, expression4, expression5, expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48177a = jsonParserComponent;
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
        f48164b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f48165c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48166d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48167e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48168f = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48169g = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f48170h = TypeHelper.Companion.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f48171i = new ValueValidator() { // from class: oe.c7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f48172j = new ValueValidator() { // from class: oe.d7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f48173k = new ValueValidator() { // from class: oe.e7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f48174l = new ValueValidator() { // from class: oe.f7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPageTransformationOverlapJsonParser.h(((Double) obj).doubleValue());
            }
        };
    }
}
