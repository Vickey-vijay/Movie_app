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
import com.yandex.div2.DivFadeTransitionJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFadeTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47113a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f47116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f47118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47121i;

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47122a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFadeTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivFadeTransitionJsonParser.f47119g;
            Expression<Double> expression = DivFadeTransitionJsonParser.f47114b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = DivFadeTransitionJsonParser.f47120h;
            Expression<Long> expression2 = DivFadeTransitionJsonParser.f47115c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivFadeTransitionJsonParser.f47118f;
            bk.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivFadeTransitionJsonParser.f47116d;
            Expression<DivAnimationInterpolator> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, lVar3, expression3);
            Expression<DivAnimationInterpolator> expression4 = optionalExpression3 == null ? expression3 : optionalExpression3;
            ValueValidator<Long> valueValidator3 = DivFadeTransitionJsonParser.f47121i;
            Expression<Long> expression5 = DivFadeTransitionJsonParser.f47117e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator3, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            return new DivFadeTransition(expression, expression2, expression4, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFadeTransition divFadeTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divFadeTransition.f47108a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divFadeTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divFadeTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divFadeTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47122a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47123a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFadeTransitionTemplate deserialize(ParsingContext parsingContext, DivFadeTransitionTemplate divFadeTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f47131a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivFadeTransitionJsonParser.f47119g);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f47132b : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivFadeTransitionTemplate((Field<Expression<Double>>) optionalFieldWithExpression, (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivFadeTransitionJsonParser.f47120h), (Field<Expression<DivAnimationInterpolator>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivFadeTransitionJsonParser.f47118f, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f47133c : null, DivAnimationInterpolator.FROM_STRING), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.f47134d : null, lVar, DivFadeTransitionJsonParser.f47121i));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFadeTransitionTemplate divFadeTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divFadeTransitionTemplate.f47131a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divFadeTransitionTemplate.f47132b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divFadeTransitionTemplate.f47133c, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divFadeTransitionTemplate.f47134d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47123a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFadeTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFadeTransitionTemplate, DivFadeTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47124a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFadeTransition resolve(ParsingContext parsingContext, DivFadeTransitionTemplate divFadeTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = divFadeTransitionTemplate.f47131a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivFadeTransitionJsonParser.f47119g;
            Expression<Double> expression = DivFadeTransitionJsonParser.f47114b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Long>> field2 = divFadeTransitionTemplate.f47132b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator2 = DivFadeTransitionJsonParser.f47120h;
            Expression<Long> expression2 = DivFadeTransitionJsonParser.f47115c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field<Expression<DivAnimationInterpolator>> field3 = divFadeTransitionTemplate.f47133c;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivFadeTransitionJsonParser.f47118f;
            bk.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivFadeTransitionJsonParser.f47116d;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field<Expression<Long>> field4 = divFadeTransitionTemplate.f47134d;
            ValueValidator<Long> valueValidator3 = DivFadeTransitionJsonParser.f47121i;
            Expression<Long> expression4 = DivFadeTransitionJsonParser.f47117e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            return new DivFadeTransition(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression4);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47124a = jsonParserComponent;
        }
    }

    public static final boolean d(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47114b = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f47115c = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f47116d = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f47117e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47118f = TypeHelper.Companion.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivFadeTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f47119g = new ValueValidator() { // from class: oe.v3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFadeTransitionJsonParser.d(((Double) obj).doubleValue());
            }
        };
        f47120h = new ValueValidator() { // from class: oe.w3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFadeTransitionJsonParser.e(((Long) obj).longValue());
            }
        };
        f47121i = new ValueValidator() { // from class: oe.x3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFadeTransitionJsonParser.f(((Long) obj).longValue());
            }
        };
    }
}
