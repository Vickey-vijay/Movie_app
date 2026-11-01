package com.yandex.div2;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50679a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<String> f50680b = Expression.Companion.constant$default(Expression.Companion, "_", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<String> f50681c = new ValueValidator() { // from class: oe.d4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.i1.c((String) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<String> f50682d = new ValueValidator() { // from class: oe.e4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.i1.d((String) obj);
        }
    };

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50683a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMask.PatternElement deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, C3426d4.i.W, typeHelper, i1.f50681c);
            ValueValidator<String> valueValidator = i1.f50682d;
            Expression<String> expression2 = i1.f50680b;
            Expression<String> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder", typeHelper, valueValidator, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivFixedLengthInputMask.PatternElement(expression, expression2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "regex", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMask.PatternElement patternElement) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.i.W, patternElement.f47167a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder", patternElement.f47168b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "regex", patternElement.f47169c);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50683a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50684a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.i.W, patternElementTemplate.f47181a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder", patternElementTemplate.f47182b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "regex", patternElementTemplate.f47183c);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50684a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMaskTemplate.PatternElementTemplate deserialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field;
            Field<Expression<String>> field2;
            Field<Expression<String>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (patternElementTemplate != null) {
                field = patternElementTemplate.f47181a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.i.W, typeHelper, allowPropertyOverride, field, i1.f50681c);
            if (patternElementTemplate != null) {
                field2 = patternElementTemplate.f47182b;
            } else {
                field2 = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder", typeHelper, allowPropertyOverride, field2, i1.f50682d);
            if (patternElementTemplate != null) {
                field3 = patternElementTemplate.f47183c;
            } else {
                field3 = null;
            }
            return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(fieldWithExpression, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "regex", typeHelper, allowPropertyOverride, field3));
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFixedLengthInputMaskTemplate.PatternElementTemplate, DivFixedLengthInputMask.PatternElement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50685a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMask.PatternElement resolve(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = patternElementTemplate.f47181a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, C3426d4.i.W, typeHelper, i1.f50681c);
            Field<Expression<String>> field2 = patternElementTemplate.f47182b;
            ValueValidator<String> valueValidator = i1.f50682d;
            Expression<String> expression = i1.f50680b;
            Expression<String> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "placeholder", typeHelper, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivFixedLengthInputMask.PatternElement(expressionResolveExpression, expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, patternElementTemplate.f47183c, jSONObject, "regex", typeHelper));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50685a = jsonParserComponent;
        }
    }

    public static final boolean c(String str) {
        if (str.length() >= 1) {
            return true;
        }
        return false;
    }

    public static final boolean d(String str) {
        if (str.length() >= 1) {
            return true;
        }
        return false;
    }
}
