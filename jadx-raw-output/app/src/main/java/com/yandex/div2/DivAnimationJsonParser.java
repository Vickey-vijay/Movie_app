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
import com.yandex.div2.DivAnimationJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimationJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivAnimationJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46448a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f46450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivCount.c f46451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f46453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimation.Name> f46454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46456i;

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46457a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAnimation deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivAnimationJsonParser.f46455h;
            Expression<Long> expression = DivAnimationJsonParser.f46449b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end_value", typeHelper2, lVar2);
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivAnimationJsonParser.f46453f;
            bk.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivAnimationJsonParser.f46450c;
            Expression<DivAnimationInterpolator> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, lVar3, expression2);
            Expression<DivAnimationInterpolator> expression3 = optionalExpression3 == null ? expression2 : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f46457a.q1());
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", DivAnimationJsonParser.f46454g, DivAnimation.Name.FROM_STRING);
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat", this.f46457a.v2());
            if (divCount == null) {
                divCount = DivAnimationJsonParser.f46451d;
            }
            DivCount divCount2 = divCount;
            ValueValidator<Long> valueValidator2 = DivAnimationJsonParser.f46456i;
            Expression<Long> expression5 = DivAnimationJsonParser.f46452e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            return new DivAnimation(expression, optionalExpression2, expression3, optionalList, expression4, divCount2, expression5, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, lVar2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAnimation divAnimation) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divAnimation.f46435a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divAnimation.f46436b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divAnimation.f46437c, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divAnimation.f46438d, this.f46457a.q1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", divAnimation.f46439e, DivAnimation.Name.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat", divAnimation.f46440f, this.f46457a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divAnimation.f46441g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divAnimation.f46442h);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46457a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46458a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAnimationTemplate deserialize(ParsingContext parsingContext, DivAnimationTemplate divAnimationTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divAnimationTemplate != null ? divAnimationTemplate.f46466a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivAnimationJsonParser.f46455h);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divAnimationTemplate != null ? divAnimationTemplate.f46467b : null;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivAnimationTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivAnimationJsonParser.f46453f, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f46468c : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f46469d : null, this.f46458a.r1()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", DivAnimationJsonParser.f46454g, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f46470e : null, DivAnimation.Name.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat", allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f46471f : null, this.f46458a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f46472g : null, lVar, DivAnimationJsonParser.f46456i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.f46473h : null, lVar2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAnimationTemplate divAnimationTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divAnimationTemplate.f46466a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", divAnimationTemplate.f46467b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divAnimationTemplate.f46468c, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divAnimationTemplate.f46469d, this.f46458a.r1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", divAnimationTemplate.f46470e, DivAnimation.Name.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat", divAnimationTemplate.f46471f, this.f46458a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divAnimationTemplate.f46472g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divAnimationTemplate.f46473h);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46458a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAnimationJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAnimationTemplate, DivAnimation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46459a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAnimation resolve(ParsingContext parsingContext, DivAnimationTemplate divAnimationTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divAnimationTemplate.f46466a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivAnimationJsonParser.f46455h;
            Expression<Long> expression = DivAnimationJsonParser.f46449b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field<Expression<Double>> field2 = divAnimationTemplate.f46467b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end_value", typeHelper2, lVar2);
            Field<Expression<DivAnimationInterpolator>> field3 = divAnimationTemplate.f46468c;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = DivAnimationJsonParser.f46453f;
            bk.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivAnimationJsonParser.f46450c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression2;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divAnimationTemplate.f46469d, jSONObject, "items", this.f46459a.s1(), this.f46459a.q1());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divAnimationTemplate.f46470e, jSONObject, "name", DivAnimationJsonParser.f46454g, DivAnimation.Name.FROM_STRING);
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divAnimationTemplate.f46471f, jSONObject, "repeat", this.f46459a.x2(), this.f46459a.v2());
            if (divCount == null) {
                divCount = DivAnimationJsonParser.f46451d;
            }
            Field<Expression<Long>> field4 = divAnimationTemplate.f46472g;
            ValueValidator<Long> valueValidator2 = DivAnimationJsonParser.f46456i;
            Expression<Long> expression3 = DivAnimationJsonParser.f46452e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            return new DivAnimation(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, listResolveOptionalList, expressionResolveExpression, divCount, expression3, JsonFieldResolver.resolveOptionalExpression(parsingContext, divAnimationTemplate.f46473h, jSONObject, "start_value", typeHelper2, lVar2));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46459a = jsonParserComponent;
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
        f46449b = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.SPRING;
        f46450c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f46451d = new DivCount.c(new DivInfinityCount());
        f46452e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f46453f = companion2.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivAnimationJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f46454g = companion2.from(nj.n.K(DivAnimation.Name.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivAnimationJsonParser$Companion$TYPE_HELPER_NAME$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimation.Name);
            }
        });
        f46455h = new ValueValidator() { // from class: oe.z1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivAnimationJsonParser.c(((Long) obj).longValue());
            }
        };
        f46456i = new ValueValidator() { // from class: oe.a2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivAnimationJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
