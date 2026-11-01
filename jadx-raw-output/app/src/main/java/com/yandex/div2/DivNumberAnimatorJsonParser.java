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
import com.yandex.div2.DivNumberAnimatorJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivNumberAnimatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48102a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationDirection> f48103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f48104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivCount.b f48105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationDirection> f48107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f48108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48110i;

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48111a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivNumberAnimator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.f48111a.u0());
            TypeHelper<DivAnimationDirection> typeHelper = DivNumberAnimatorJsonParser.f48107f;
            bk.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivNumberAnimatorJsonParser.f48103b;
            Expression<DivAnimationDirection> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, DivNumberAnimatorJsonParser.f48109h);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f48111a.u0());
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivNumberAnimatorJsonParser.f48108g;
            bk.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression5 = DivNumberAnimatorJsonParser.f48104c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, lVar4, expression5);
            if (optionalExpression2 != null) {
                expression5 = optionalExpression2;
            }
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f48111a.v2());
            if (divCount == null) {
                divCount = DivNumberAnimatorJsonParser.f48105d;
            }
            DivCount divCount2 = divCount;
            ValueValidator<Long> valueValidator = DivNumberAnimatorJsonParser.f48110i;
            Expression<Long> expression6 = DivNumberAnimatorJsonParser.f48106e;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression6);
            if (optionalExpression3 != null) {
                expression6 = optionalExpression3;
            }
            return new DivNumberAnimator(optionalList, expression2, expression3, optionalList2, expression4, str, expression5, divCount2, expression6, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivNumberAnimator divNumberAnimator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", divNumberAnimator.a(), this.f48111a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divNumberAnimator.getDirection(), DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divNumberAnimator.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divNumberAnimator.d(), this.f48111a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divNumberAnimator.f48094e);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divNumberAnimator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divNumberAnimator.c(), DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divNumberAnimator.b(), this.f48111a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divNumberAnimator.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divNumberAnimator.f48099j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", divNumberAnimator.g());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48111a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48112a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivNumberAnimatorTemplate deserialize(ParsingContext parsingContext, DivNumberAnimatorTemplate divNumberAnimatorTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48120a : null, this.f48112a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", DivNumberAnimatorJsonParser.f48107f, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48121b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48122c : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivNumberAnimatorJsonParser.f48109h);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48123d : null, this.f48112a.v0());
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48124e : null;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivNumberAnimatorTemplate(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48125f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivNumberAnimatorJsonParser.f48108g, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48126g : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48127h : null, this.f48112a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48128i : null, lVar, DivNumberAnimatorJsonParser.f48110i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48129j : null, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.f48130k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivNumberAnimatorTemplate divNumberAnimatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", divNumberAnimatorTemplate.f48120a, this.f48112a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divNumberAnimatorTemplate.f48121b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divNumberAnimatorTemplate.f48122c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divNumberAnimatorTemplate.f48123d, this.f48112a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", divNumberAnimatorTemplate.f48124e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divNumberAnimatorTemplate.f48125f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divNumberAnimatorTemplate.f48126g, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divNumberAnimatorTemplate.f48127h, this.f48112a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divNumberAnimatorTemplate.f48128i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divNumberAnimatorTemplate.f48129j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", divNumberAnimatorTemplate.f48130k);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48112a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivNumberAnimatorTemplate, DivNumberAnimator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48113a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivNumberAnimator resolve(ParsingContext parsingContext, DivNumberAnimatorTemplate divNumberAnimatorTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divNumberAnimatorTemplate.f48120a, jSONObject, "cancel_actions", this.f48113a.w0(), this.f48113a.u0());
            Field<Expression<DivAnimationDirection>> field = divNumberAnimatorTemplate.f48121b;
            TypeHelper<DivAnimationDirection> typeHelper = DivNumberAnimatorJsonParser.f48107f;
            bk.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivNumberAnimatorJsonParser.f48103b;
            Expression<DivAnimationDirection> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<Long>> field2 = divNumberAnimatorTemplate.f48122c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, DivNumberAnimatorJsonParser.f48109h);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divNumberAnimatorTemplate.f48123d, jSONObject, "end_actions", this.f48113a.w0(), this.f48113a.u0());
            Field<Expression<Double>> field3 = divNumberAnimatorTemplate.f48124e;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, divNumberAnimatorTemplate.f48125f, jSONObject, "id");
            Field<Expression<DivAnimationInterpolator>> field4 = divNumberAnimatorTemplate.f48126g;
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivNumberAnimatorJsonParser.f48108g;
            bk.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivNumberAnimatorJsonParser.f48104c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divNumberAnimatorTemplate.f48127h, jSONObject, "repeat_count", this.f48113a.x2(), this.f48113a.v2());
            if (divCount == null) {
                divCount = DivNumberAnimatorJsonParser.f48105d;
            }
            DivCount divCount2 = divCount;
            Field<Expression<Long>> field5 = divNumberAnimatorTemplate.f48128i;
            ValueValidator<Long> valueValidator = DivNumberAnimatorJsonParser.f48110i;
            Expression<Long> expression4 = DivNumberAnimatorJsonParser.f48106e;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            return new DivNumberAnimator(listResolveOptionalList, expression2, expressionResolveExpression, listResolveOptionalList2, expressionResolveExpression2, str, expression3, divCount2, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, divNumberAnimatorTemplate.f48129j, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonFieldResolver.resolve(parsingContext, divNumberAnimatorTemplate.f48130k, jSONObject, "variable_name"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48113a = jsonParserComponent;
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
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        f48103b = Expression.Companion.constant$default(companion, divAnimationDirection, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        f48104c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f48105d = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f48106e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48107f = companion2.from(divAnimationDirection, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        f48108g = companion2.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f48109h = new ValueValidator() { // from class: oe.u6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivNumberAnimatorJsonParser.c(((Long) obj).longValue());
            }
        };
        f48110i = new ValueValidator() { // from class: oe.v6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivNumberAnimatorJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
