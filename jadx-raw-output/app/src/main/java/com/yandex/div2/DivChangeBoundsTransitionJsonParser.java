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
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivChangeBoundsTransitionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46560a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAnimationInterpolator> f46562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f46564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46566g;

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46567a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeBoundsTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivChangeBoundsTransitionJsonParser.f46565f;
            Expression<Long> expression = DivChangeBoundsTransitionJsonParser.f46561b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper2 = DivChangeBoundsTransitionJsonParser.f46564e;
            bk.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivChangeBoundsTransitionJsonParser.f46562c;
            Expression<DivAnimationInterpolator> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, lVar2, expression2);
            Expression<DivAnimationInterpolator> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            ValueValidator<Long> valueValidator2 = DivChangeBoundsTransitionJsonParser.f46566g;
            Expression<Long> expression4 = DivChangeBoundsTransitionJsonParser.f46563d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            return new DivChangeBoundsTransition(expression, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivChangeBoundsTransition divChangeBoundsTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divChangeBoundsTransition.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divChangeBoundsTransition.c(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divChangeBoundsTransition.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46567a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46568a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeBoundsTransitionTemplate deserialize(ParsingContext parsingContext, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.f46575a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivChangeBoundsTransitionTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, DivChangeBoundsTransitionJsonParser.f46565f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivChangeBoundsTransitionJsonParser.f46564e, allowPropertyOverride, divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.f46576b : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.f46577c : null, lVar, DivChangeBoundsTransitionJsonParser.f46566g));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divChangeBoundsTransitionTemplate.f46575a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divChangeBoundsTransitionTemplate.f46576b, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divChangeBoundsTransitionTemplate.f46577c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46568a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivChangeBoundsTransitionTemplate, DivChangeBoundsTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46569a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeBoundsTransition resolve(ParsingContext parsingContext, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divChangeBoundsTransitionTemplate.f46575a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivChangeBoundsTransitionJsonParser.f46565f;
            Expression<Long> expression = DivChangeBoundsTransitionJsonParser.f46561b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivAnimationInterpolator>> field2 = divChangeBoundsTransitionTemplate.f46576b;
            TypeHelper<DivAnimationInterpolator> typeHelper2 = DivChangeBoundsTransitionJsonParser.f46564e;
            bk.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = DivChangeBoundsTransitionJsonParser.f46562c;
            Expression<DivAnimationInterpolator> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field<Expression<Long>> field3 = divChangeBoundsTransitionTemplate.f46577c;
            ValueValidator<Long> valueValidator2 = DivChangeBoundsTransitionJsonParser.f46566g;
            Expression<Long> expression3 = DivChangeBoundsTransitionJsonParser.f46563d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "start_delay", typeHelper, lVar, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new DivChangeBoundsTransition(expression, expressionResolveOptionalExpression2, expression3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46569a = jsonParserComponent;
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
        f46561b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        f46562c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        f46563d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46564e = TypeHelper.Companion.from(divAnimationInterpolator, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivChangeBoundsTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f46565f = new ValueValidator() { // from class: oe.h2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivChangeBoundsTransitionJsonParser.c(((Long) obj).longValue());
            }
        };
        f46566g = new ValueValidator() { // from class: oe.i2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivChangeBoundsTransitionJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
