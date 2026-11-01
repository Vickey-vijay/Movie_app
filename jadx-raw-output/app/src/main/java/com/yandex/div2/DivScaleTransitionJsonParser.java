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
import com.yandex.div2.DivScaleTransitionJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivScaleTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivScaleTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48546a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f48548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f48553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48558m;

    /* JADX INFO: compiled from: DivScaleTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivScaleTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48559a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivScaleTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivScaleTransitionJsonParser.f48554i;
            Expression<Long> expression = DivScaleTransitionJsonParser.f48547b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper2 = DivScaleTransitionJsonParser.f48553h;
            bk.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivScaleTransitionJsonParser.f48548c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, lVar2, expression2);
            Expression<DivAnimationInterpolator> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator2 = DivScaleTransitionJsonParser.f48555j;
            Expression<Double> expression4 = DivScaleTransitionJsonParser.f48549d;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_x", typeHelper3, lVar3, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            ValueValidator<Double> valueValidator3 = DivScaleTransitionJsonParser.f48556k;
            Expression<Double> expression5 = DivScaleTransitionJsonParser.f48550e;
            Expression<Double> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_y", typeHelper3, lVar3, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            ValueValidator<Double> valueValidator4 = DivScaleTransitionJsonParser.f48557l;
            Expression<Double> expression6 = DivScaleTransitionJsonParser.f48551f;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper3, lVar3, valueValidator4, expression6);
            if (optionalExpression5 != null) {
                expression6 = optionalExpression5;
            }
            ValueValidator<Long> valueValidator5 = DivScaleTransitionJsonParser.f48558m;
            Expression<Long> expression7 = DivScaleTransitionJsonParser.f48552g;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator5, expression7);
            return new DivScaleTransition(expression, expression3, expression4, expression5, expression6, optionalExpression6 == null ? expression7 : optionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivScaleTransition divScaleTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divScaleTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divScaleTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_x", divScaleTransition.f48541c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_y", divScaleTransition.f48542d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divScaleTransition.f48543e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divScaleTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48559a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivScaleTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48560a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivScaleTransitionTemplate deserialize(ParsingContext parsingContext, DivScaleTransitionTemplate divScaleTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divScaleTransitionTemplate != null ? divScaleTransitionTemplate.f48570a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivScaleTransitionJsonParser.f48554i);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivScaleTransitionJsonParser.f48553h, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.f48571b : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divScaleTransitionTemplate != null ? divScaleTransitionTemplate.f48572c : null;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivScaleTransitionTemplate((Field<Expression<Long>>) optionalFieldWithExpression, (Field<Expression<DivAnimationInterpolator>>) optionalFieldWithExpression2, (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pivot_x", typeHelper2, allowPropertyOverride, field2, lVar2, DivScaleTransitionJsonParser.f48555j), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pivot_y", typeHelper2, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.f48573d : null, lVar2, DivScaleTransitionJsonParser.f48556k), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", typeHelper2, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.f48574e : null, lVar2, DivScaleTransitionJsonParser.f48557l), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.f48575f : null, lVar, DivScaleTransitionJsonParser.f48558m));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivScaleTransitionTemplate divScaleTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divScaleTransitionTemplate.f48570a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divScaleTransitionTemplate.f48571b, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_x", divScaleTransitionTemplate.f48572c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_y", divScaleTransitionTemplate.f48573d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divScaleTransitionTemplate.f48574e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divScaleTransitionTemplate.f48575f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48560a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivScaleTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivScaleTransitionTemplate, DivScaleTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48561a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivScaleTransition resolve(ParsingContext parsingContext, DivScaleTransitionTemplate divScaleTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divScaleTransitionTemplate.f48570a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivScaleTransitionJsonParser.f48554i;
            Expression<Long> expression = DivScaleTransitionJsonParser.f48547b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivAnimationInterpolator>> field2 = divScaleTransitionTemplate.f48571b;
            TypeHelper<DivAnimationInterpolator> typeHelper2 = DivScaleTransitionJsonParser.f48553h;
            bk.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivScaleTransitionJsonParser.f48548c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Double>> field3 = divScaleTransitionTemplate.f48572c;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator2 = DivScaleTransitionJsonParser.f48555j;
            Expression<Double> expression3 = DivScaleTransitionJsonParser.f48549d;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "pivot_x", typeHelper3, lVar3, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field<Expression<Double>> field4 = divScaleTransitionTemplate.f48573d;
            ValueValidator<Double> valueValidator3 = DivScaleTransitionJsonParser.f48556k;
            Expression<Double> expression4 = DivScaleTransitionJsonParser.f48550e;
            Expression<Double> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "pivot_y", typeHelper3, lVar3, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Double>> field5 = divScaleTransitionTemplate.f48574e;
            ValueValidator<Double> valueValidator4 = DivScaleTransitionJsonParser.f48557l;
            Expression<Double> expression5 = DivScaleTransitionJsonParser.f48551f;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper3, lVar3, valueValidator4, expression5);
            if (expressionResolveOptionalExpression5 == null) {
                expressionResolveOptionalExpression5 = expression5;
            }
            Field<Expression<Long>> field6 = divScaleTransitionTemplate.f48575f;
            ValueValidator<Long> valueValidator5 = DivScaleTransitionJsonParser.f48558m;
            Expression<Long> expression6 = DivScaleTransitionJsonParser.f48552g;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "start_delay", typeHelper, lVar, valueValidator5, expression6);
            return new DivScaleTransition(expression, expression2, expressionResolveOptionalExpression3, expression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48561a = jsonParserComponent;
        }
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean h(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean i(double d10) {
        return d10 >= 0.0d;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48547b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f48548c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f48549d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48550e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48551f = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48552g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48553h = TypeHelper.Companion.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f48554i = new ValueValidator() { // from class: oe.g8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivScaleTransitionJsonParser.f(((Long) obj).longValue());
            }
        };
        f48555j = new ValueValidator() { // from class: oe.h8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivScaleTransitionJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f48556k = new ValueValidator() { // from class: oe.i8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivScaleTransitionJsonParser.h(((Double) obj).doubleValue());
            }
        };
        f48557l = new ValueValidator() { // from class: oe.j8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivScaleTransitionJsonParser.i(((Double) obj).doubleValue());
            }
        };
        f48558m = new ValueValidator() { // from class: oe.k8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivScaleTransitionJsonParser.j(((Long) obj).longValue());
            }
        };
    }
}
