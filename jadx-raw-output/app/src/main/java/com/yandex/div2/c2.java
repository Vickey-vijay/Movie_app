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

/* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50586a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50587b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50588a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorExpression deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = c2.f50587b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivInputValidatorExpression(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", typeHelper, lVar), JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorExpression divInputValidatorExpression) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorExpression.f47994a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divInputValidatorExpression.f47995b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorExpression.f47996c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorExpression.f47997d);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50588a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50589a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorExpressionTemplate deserialize(ParsingContext parsingContext, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f48002a : null;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivInputValidatorExpressionTemplate((Field<Expression<Boolean>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, lVar), (Field<Expression<Boolean>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", typeHelper, allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f48003b : null, lVar), (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f48004c : null), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.f48005d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorExpressionTemplate.f48002a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divInputValidatorExpressionTemplate.f48003b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorExpressionTemplate.f48004c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorExpressionTemplate.f48005d);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50589a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputValidatorExpressionTemplate, DivInputValidatorExpression> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50590a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorExpression resolve(ParsingContext parsingContext, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divInputValidatorExpressionTemplate.f48002a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = c2.f50587b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivInputValidatorExpression(expression, JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorExpressionTemplate.f48003b, jSONObject, "condition", typeHelper, lVar), JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorExpressionTemplate.f48004c, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, divInputValidatorExpressionTemplate.f48005d, jSONObject, "variable"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50590a = jsonParserComponent;
        }
    }
}
