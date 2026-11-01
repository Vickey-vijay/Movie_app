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

/* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50643a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50644b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50645a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorRegex deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = g2.f50644b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegex(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", typeHelper2), JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", typeHelper2), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorRegex divInputValidatorRegex) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorRegex.f48009a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorRegex.f48010b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", divInputValidatorRegex.f48011c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorRegex.f48012d);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50645a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50646a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorRegexTemplate.f48017a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorRegexTemplate.f48018b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divInputValidatorRegexTemplate.f48019c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorRegexTemplate.f48020d);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50646a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorRegexTemplate deserialize(ParsingContext parsingContext, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field;
            Field<Expression<String>> field2;
            Field<Expression<String>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<String> field4 = null;
            if (divInputValidatorRegexTemplate != null) {
                field = divInputValidatorRegexTemplate.f48017a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divInputValidatorRegexTemplate != null) {
                field2 = divInputValidatorRegexTemplate.f48018b;
            } else {
                field2 = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", typeHelper2, allowPropertyOverride, field2);
            if (divInputValidatorRegexTemplate != null) {
                field3 = divInputValidatorRegexTemplate.f48019c;
            } else {
                field3 = null;
            }
            Field fieldWithExpression2 = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", typeHelper2, allowPropertyOverride, field3);
            if (divInputValidatorRegexTemplate != null) {
                field4 = divInputValidatorRegexTemplate.f48020d;
            }
            return new DivInputValidatorRegexTemplate((Field<Expression<Boolean>>) optionalFieldWithExpression, (Field<Expression<String>>) fieldWithExpression, (Field<Expression<String>>) fieldWithExpression2, (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, field4));
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputValidatorRegexTemplate, DivInputValidatorRegex> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50647a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputValidatorRegex resolve(ParsingContext parsingContext, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divInputValidatorRegexTemplate.f48017a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = g2.f50644b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<String>> field2 = divInputValidatorRegexTemplate.f48018b;
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegex(expression, JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "label_id", typeHelper2), JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorRegexTemplate.f48019c, jSONObject, "pattern", typeHelper2), (String) JsonFieldResolver.resolve(parsingContext, divInputValidatorRegexTemplate.f48020d, jSONObject, "variable"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50647a = jsonParserComponent;
        }
    }
}
