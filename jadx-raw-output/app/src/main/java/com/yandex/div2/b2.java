package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
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

/* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50571a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50572b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50573a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorBase deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = b2.f50572b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivInputValidatorBase(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorBase divInputValidatorBase) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorBase.f47981a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorBase.f47982b);
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorBase.f47983c);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50573a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50574a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorBaseTemplate.f47988a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorBaseTemplate.f47989b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorBaseTemplate.f47990c);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50574a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorBaseTemplate deserialize(ParsingContext parsingContext, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field;
            Field<Expression<String>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<String> field3 = null;
            if (divInputValidatorBaseTemplate != null) {
                field = divInputValidatorBaseTemplate.f47988a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divInputValidatorBaseTemplate != null) {
                field2 = divInputValidatorBaseTemplate.f47989b;
            } else {
                field2 = null;
            }
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", typeHelper2, allowPropertyOverride, field2);
            if (divInputValidatorBaseTemplate != null) {
                field3 = divInputValidatorBaseTemplate.f47990c;
            }
            return new DivInputValidatorBaseTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, field3));
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputValidatorBaseTemplate, DivInputValidatorBase> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50575a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorBase resolve(ParsingContext parsingContext, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divInputValidatorBaseTemplate.f47988a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = b2.f50572b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivInputValidatorBase(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputValidatorBaseTemplate.f47989b, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolveOptional(parsingContext, divInputValidatorBaseTemplate.f47990c, jSONObject, "variable"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50575a = jsonParserComponent;
        }
    }
}
