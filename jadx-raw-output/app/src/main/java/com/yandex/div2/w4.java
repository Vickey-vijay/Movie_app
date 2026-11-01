package com.yandex.div2;

import com.safedk.android.analytics.events.BrandSafetyEvent;
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

/* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50893a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f50894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50898f;

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50899a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskParticles deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = w4.f50898f;
            Expression<Double> expression2 = w4.f50894b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "density", typeHelper, lVar, valueValidator, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = w4.f50895c;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, BrandSafetyEvent.f44600s, typeHelper2, lVar2, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            Expression<Boolean> expression4 = w4.f50896d;
            Expression<Boolean> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, lVar2, expression4);
            Expression<Boolean> expression5 = optionalExpression3 == null ? expression4 : optionalExpression3;
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "particle_size", this.f50899a.w3());
            if (divFixedSize == null) {
                divFixedSize = w4.f50897e;
            }
            return new DivTextRangeMaskParticles(expression, expression2, expression3, expression5, divFixedSize);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskParticles divTextRangeMaskParticles) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divTextRangeMaskParticles.f49675a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "density", divTextRangeMaskParticles.f49676b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, BrandSafetyEvent.f44600s, divTextRangeMaskParticles.f49677c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskParticles.f49678d);
            JsonPropertyParser.write(parsingContext, jSONObject, "particle_size", divTextRangeMaskParticles.f49679e, this.f50899a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50899a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50900a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskParticlesTemplate deserialize(ParsingContext parsingContext, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f49687a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f49688b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, w4.f50898f);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f49689c : null;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivTextRangeMaskParticlesTemplate(fieldWithExpression, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, BrandSafetyEvent.f44600s, typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f49690d : null, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "particle_size", allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.f49691e : null, this.f50900a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divTextRangeMaskParticlesTemplate.f49687a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "density", divTextRangeMaskParticlesTemplate.f49688b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, BrandSafetyEvent.f44600s, divTextRangeMaskParticlesTemplate.f49689c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskParticlesTemplate.f49690d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "particle_size", divTextRangeMaskParticlesTemplate.f49691e, this.f50900a.x3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50900a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeMaskParticlesTemplate, DivTextRangeMaskParticles> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50901a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskParticles resolve(ParsingContext parsingContext, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextRangeMaskParticlesTemplate.f49687a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<Double>> field = divTextRangeMaskParticlesTemplate.f49688b;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = w4.f50898f;
            Expression<Double> expression = w4.f50894b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "density", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Boolean>> field2 = divTextRangeMaskParticlesTemplate.f49689c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = w4.f50895c;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, BrandSafetyEvent.f44600s, typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Boolean>> field3 = divTextRangeMaskParticlesTemplate.f49690d;
            Expression<Boolean> expression3 = w4.f50896d;
            Expression<Boolean> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divTextRangeMaskParticlesTemplate.f49691e, jSONObject, "particle_size", this.f50901a.y3(), this.f50901a.w3());
            if (divFixedSize == null) {
                divFixedSize = w4.f50897e;
            }
            return new DivTextRangeMaskParticles(expressionResolveExpression, expression, expression2, expression3, divFixedSize);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50901a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d && d10 <= 1.0d;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50894b = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f50895c = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f50896d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f50897e = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f50898f = new ValueValidator() { // from class: oe.ib
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.w4.b(((Double) obj).doubleValue());
            }
        };
    }
}
