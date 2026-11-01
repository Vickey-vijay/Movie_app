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

/* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50907a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50908b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50909a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskSolid deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = x4.f50908b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivTextRangeMaskSolid(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskSolid divTextRangeMaskSolid) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divTextRangeMaskSolid.f49695a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskSolid.f49696b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50909a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50910a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divTextRangeMaskSolidTemplate.f49701a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskSolidTemplate.f49702b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50910a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskSolidTemplate deserialize(ParsingContext parsingContext, DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field;
            Field<Expression<Boolean>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            if (divTextRangeMaskSolidTemplate != null) {
                field = divTextRangeMaskSolidTemplate.f49701a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (divTextRangeMaskSolidTemplate != null) {
                field2 = divTextRangeMaskSolidTemplate.f49702b;
            } else {
                field2 = null;
            }
            return new DivTextRangeMaskSolidTemplate(fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskSolidJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeMaskSolidTemplate, DivTextRangeMaskSolid> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50911a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskSolid resolve(ParsingContext parsingContext, DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextRangeMaskSolidTemplate.f49701a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<Boolean>> field = divTextRangeMaskSolidTemplate.f49702b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = x4.f50908b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTextRangeMaskSolid(expressionResolveExpression, expression);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50911a = jsonParserComponent;
        }
    }
}
