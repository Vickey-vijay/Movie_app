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

/* JADX INFO: compiled from: DivActionSetStateJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50718a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50719b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivActionSetStateJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionSetStateJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50720a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSetState deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = l.f50719b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "temporary", typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivActionSetState(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionSetState divActionSetState) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_id", divActionSetState.f46241a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "temporary", divActionSetState.f46242b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50720a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionSetStateJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50721a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionSetStateTemplate divActionSetStateTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_id", divActionSetStateTemplate.f46247a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "temporary", divActionSetStateTemplate.f46248b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50721a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSetStateTemplate deserialize(ParsingContext parsingContext, DivActionSetStateTemplate divActionSetStateTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field;
            Field<Expression<Boolean>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divActionSetStateTemplate != null) {
                field = divActionSetStateTemplate.f46247a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "state_id", typeHelper, allowPropertyOverride, field);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (divActionSetStateTemplate != null) {
                field2 = divActionSetStateTemplate.f46248b;
            } else {
                field2 = null;
            }
            return new DivActionSetStateTemplate(fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "temporary", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }
    }

    /* JADX INFO: compiled from: DivActionSetStateJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionSetStateTemplate, DivActionSetState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50722a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSetState resolve(ParsingContext parsingContext, DivActionSetStateTemplate divActionSetStateTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionSetStateTemplate.f46247a, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field = divActionSetStateTemplate.f46248b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = l.f50719b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "temporary", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivActionSetState(expressionResolveExpression, expression);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50722a = jsonParserComponent;
        }
    }
}
