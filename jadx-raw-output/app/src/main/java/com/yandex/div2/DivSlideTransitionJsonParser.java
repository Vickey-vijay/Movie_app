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
import com.yandex.div2.DivSlideTransitionJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSlideTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48844a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSlideTransition.Edge> f48846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f48847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSlideTransition.Edge> f48849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f48850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48852i;

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48853a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlideTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivDimension divDimension = (DivDimension) JsonPropertyParser.readOptional(parsingContext, jSONObject, "distance", this.f48853a.M2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSlideTransitionJsonParser.f48851h;
            Expression<Long> expression = DivSlideTransitionJsonParser.f48845b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivSlideTransition.Edge> typeHelper2 = DivSlideTransitionJsonParser.f48849f;
            bk.l<String, DivSlideTransition.Edge> lVar2 = DivSlideTransition.Edge.FROM_STRING;
            Expression<DivSlideTransition.Edge> expression2 = DivSlideTransitionJsonParser.f48846c;
            Expression<DivSlideTransition.Edge> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "edge", typeHelper2, lVar2, expression2);
            Expression<DivSlideTransition.Edge> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivSlideTransitionJsonParser.f48850g;
            bk.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression4 = DivSlideTransitionJsonParser.f48847d;
            Expression<DivAnimationInterpolator> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, lVar3, expression4);
            Expression<DivAnimationInterpolator> expression5 = optionalExpression3 == null ? expression4 : optionalExpression3;
            ValueValidator<Long> valueValidator2 = DivSlideTransitionJsonParser.f48852i;
            Expression<Long> expression6 = DivSlideTransitionJsonParser.f48848e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression6);
            if (optionalExpression4 != null) {
                expression6 = optionalExpression4;
            }
            return new DivSlideTransition(divDimension, expression, expression3, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSlideTransition divSlideTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "distance", divSlideTransition.f48837a, this.f48853a.M2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divSlideTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "edge", divSlideTransition.f48839c, DivSlideTransition.Edge.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divSlideTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divSlideTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48853a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48854a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlideTransitionTemplate deserialize(ParsingContext parsingContext, DivSlideTransitionTemplate divSlideTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "distance", allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f48862a : null, this.f48854a.N2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f48863b : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivSlideTransitionTemplate(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivSlideTransitionJsonParser.f48851h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "edge", DivSlideTransitionJsonParser.f48849f, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f48864c : null, DivSlideTransition.Edge.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivSlideTransitionJsonParser.f48850g, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f48865d : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.f48866e : null, lVar, DivSlideTransitionJsonParser.f48852i));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSlideTransitionTemplate divSlideTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "distance", divSlideTransitionTemplate.f48862a, this.f48854a.N2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divSlideTransitionTemplate.f48863b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "edge", divSlideTransitionTemplate.f48864c, DivSlideTransition.Edge.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divSlideTransitionTemplate.f48865d, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divSlideTransitionTemplate.f48866e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48854a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSlideTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSlideTransitionTemplate, DivSlideTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48855a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlideTransition resolve(ParsingContext parsingContext, DivSlideTransitionTemplate divSlideTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            DivDimension divDimension = (DivDimension) JsonFieldResolver.resolveOptional(parsingContext, divSlideTransitionTemplate.f48862a, jSONObject, "distance", this.f48855a.O2(), this.f48855a.M2());
            Field<Expression<Long>> field = divSlideTransitionTemplate.f48863b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSlideTransitionJsonParser.f48851h;
            Expression<Long> expression = DivSlideTransitionJsonParser.f48845b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivSlideTransition.Edge>> field2 = divSlideTransitionTemplate.f48864c;
            TypeHelper<DivSlideTransition.Edge> typeHelper2 = DivSlideTransitionJsonParser.f48849f;
            bk.l<String, DivSlideTransition.Edge> lVar2 = DivSlideTransition.Edge.FROM_STRING;
            Expression<DivSlideTransition.Edge> expression2 = DivSlideTransitionJsonParser.f48846c;
            Expression<DivSlideTransition.Edge> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "edge", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<DivAnimationInterpolator>> field3 = divSlideTransitionTemplate.f48865d;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivSlideTransitionJsonParser.f48850g;
            bk.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivSlideTransitionJsonParser.f48847d;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field<Expression<Long>> field4 = divSlideTransitionTemplate.f48866e;
            ValueValidator<Long> valueValidator2 = DivSlideTransitionJsonParser.f48852i;
            Expression<Long> expression4 = DivSlideTransitionJsonParser.f48848e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression4);
            return new DivSlideTransition(divDimension, expression, expression2, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4 == null ? expression4 : expressionResolveOptionalExpression4);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48855a = jsonParserComponent;
        }
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48845b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivSlideTransition.Edge edge = DivSlideTransition.Edge.BOTTOM;
        f48846c = Expression.Companion.constant$default(companion, edge, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f48847d = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f48848e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48849f = companion2.from(edge, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$Companion$TYPE_HELPER_EDGE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSlideTransition.Edge);
            }
        });
        f48850g = companion2.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f48851h = new ValueValidator() { // from class: oe.e9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSlideTransitionJsonParser.c(((Long) obj).longValue());
            }
        };
        f48852i = new ValueValidator() { // from class: oe.f9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSlideTransitionJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
