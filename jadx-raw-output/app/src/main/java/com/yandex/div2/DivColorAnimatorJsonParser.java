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
import com.yandex.div2.DivColorAnimatorJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivColorAnimatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46663a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationDirection> f46664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f46665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivCount.b f46666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationDirection> f46668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f46669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46671i;

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46672a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivColorAnimator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.f46672a.u0());
            TypeHelper<DivAnimationDirection> typeHelper = DivColorAnimatorJsonParser.f46668f;
            bk.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivColorAnimatorJsonParser.f46664b;
            Expression<DivAnimationDirection> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, DivColorAnimatorJsonParser.f46670h);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f46672a.u0());
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivColorAnimatorJsonParser.f46669g;
            bk.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression5 = DivColorAnimatorJsonParser.f46665c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, lVar4, expression5);
            if (optionalExpression2 != null) {
                expression5 = optionalExpression2;
            }
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f46672a.v2());
            if (divCount == null) {
                divCount = DivColorAnimatorJsonParser.f46666d;
            }
            DivCount divCount2 = divCount;
            ValueValidator<Long> valueValidator = DivColorAnimatorJsonParser.f46671i;
            Expression<Long> expression6 = DivColorAnimatorJsonParser.f46667e;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression6);
            if (optionalExpression3 != null) {
                expression6 = optionalExpression3;
            }
            return new DivColorAnimator(optionalList, expression2, expression3, optionalList2, expression4, str, expression5, divCount2, expression6, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivColorAnimator divColorAnimator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", divColorAnimator.a(), this.f46672a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divColorAnimator.getDirection(), DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divColorAnimator.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divColorAnimator.d(), this.f46672a.u0());
            Expression<Integer> expression = divColorAnimator.f46655e;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", expression, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divColorAnimator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divColorAnimator.c(), DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divColorAnimator.b(), this.f46672a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divColorAnimator.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divColorAnimator.f46660j, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", divColorAnimator.g());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46672a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46673a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivColorAnimatorTemplate deserialize(ParsingContext parsingContext, DivColorAnimatorTemplate divColorAnimatorTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46681a : null, this.f46673a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", DivColorAnimatorJsonParser.f46668f, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46682b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46683c : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivColorAnimatorJsonParser.f46670h);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46684d : null, this.f46673a.v0());
            TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field2 = divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46685e : null;
            bk.l<Object, Integer> lVar2 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            return new DivColorAnimatorTemplate(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46686f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivColorAnimatorJsonParser.f46669g, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46687g : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46688h : null, this.f46673a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46689i : null, lVar, DivColorAnimatorJsonParser.f46671i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46690j : null, lVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.f46691k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivColorAnimatorTemplate divColorAnimatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", divColorAnimatorTemplate.f46681a, this.f46673a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divColorAnimatorTemplate.f46682b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divColorAnimatorTemplate.f46683c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divColorAnimatorTemplate.f46684d, this.f46673a.v0());
            Field<Expression<Integer>> field = divColorAnimatorTemplate.f46685e;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", field, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divColorAnimatorTemplate.f46686f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divColorAnimatorTemplate.f46687g, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divColorAnimatorTemplate.f46688h, this.f46673a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divColorAnimatorTemplate.f46689i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divColorAnimatorTemplate.f46690j, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", divColorAnimatorTemplate.f46691k);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46673a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivColorAnimatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivColorAnimatorTemplate, DivColorAnimator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46674a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivColorAnimator resolve(ParsingContext parsingContext, DivColorAnimatorTemplate divColorAnimatorTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divColorAnimatorTemplate.f46681a, jSONObject, "cancel_actions", this.f46674a.w0(), this.f46674a.u0());
            Field<Expression<DivAnimationDirection>> field = divColorAnimatorTemplate.f46682b;
            TypeHelper<DivAnimationDirection> typeHelper = DivColorAnimatorJsonParser.f46668f;
            bk.l<String, DivAnimationDirection> lVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = DivColorAnimatorJsonParser.f46664b;
            Expression<DivAnimationDirection> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, lVar, expression);
            Expression<DivAnimationDirection> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<Long>> field2 = divColorAnimatorTemplate.f46683c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, DivColorAnimatorJsonParser.f46670h);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divColorAnimatorTemplate.f46684d, jSONObject, "end_actions", this.f46674a.w0(), this.f46674a.u0());
            Field<Expression<Integer>> field3 = divColorAnimatorTemplate.f46685e;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, divColorAnimatorTemplate.f46686f, jSONObject, "id");
            Field<Expression<DivAnimationInterpolator>> field4 = divColorAnimatorTemplate.f46687g;
            TypeHelper<DivAnimationInterpolator> typeHelper4 = DivColorAnimatorJsonParser.f46669g;
            bk.l<String, DivAnimationInterpolator> lVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = DivColorAnimatorJsonParser.f46665c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divColorAnimatorTemplate.f46688h, jSONObject, "repeat_count", this.f46674a.x2(), this.f46674a.v2());
            if (divCount == null) {
                divCount = DivColorAnimatorJsonParser.f46666d;
            }
            DivCount divCount2 = divCount;
            Field<Expression<Long>> field5 = divColorAnimatorTemplate.f46689i;
            ValueValidator<Long> valueValidator = DivColorAnimatorJsonParser.f46671i;
            Expression<Long> expression4 = DivColorAnimatorJsonParser.f46667e;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, lVar2, valueValidator, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            return new DivColorAnimator(listResolveOptionalList, expression2, expressionResolveExpression, listResolveOptionalList2, expressionResolveExpression2, str, expression3, divCount2, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, divColorAnimatorTemplate.f46690j, jSONObject, "start_value", typeHelper3, lVar3), (String) JsonFieldResolver.resolve(parsingContext, divColorAnimatorTemplate.f46691k, jSONObject, "variable_name"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46674a = jsonParserComponent;
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
        f46664b = Expression.Companion.constant$default(companion, divAnimationDirection, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        f46665c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f46666d = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f46667e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f46668f = companion2.from(divAnimationDirection, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        f46669g = companion2.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f46670h = new ValueValidator() { // from class: oe.m2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivColorAnimatorJsonParser.c(((Long) obj).longValue());
            }
        };
        f46671i = new ValueValidator() { // from class: oe.n2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivColorAnimatorJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
