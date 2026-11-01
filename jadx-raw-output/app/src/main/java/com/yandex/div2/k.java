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

/* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50703a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50704b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50705a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollTo deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = k.f50704b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivActionScrollTo(expression, (DivActionScrollDestination) JsonPropertyParser.read(parsingContext, jSONObject, "destination", this.f50705a.D0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollTo divActionScrollTo) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", divActionScrollTo.f46228a);
            JsonPropertyParser.write(parsingContext, jSONObject, "destination", divActionScrollTo.f46229b, this.f50705a.D0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionScrollTo.f46230c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50705a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50706a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollToTemplate divActionScrollToTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", divActionScrollToTemplate.f46235a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "destination", divActionScrollToTemplate.f46236b, this.f50706a.E0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionScrollToTemplate.f46237c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50706a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollToTemplate deserialize(ParsingContext parsingContext, DivActionScrollToTemplate divActionScrollToTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field;
            Field<DivActionScrollDestinationTemplate> field2;
            Field<Expression<String>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (divActionScrollToTemplate != null) {
                field = divActionScrollToTemplate.f46235a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animated", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_BOOLEAN);
            if (divActionScrollToTemplate != null) {
                field2 = divActionScrollToTemplate.f46236b;
            } else {
                field2 = null;
            }
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "destination", allowPropertyOverride, field2, this.f50706a.E0());
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divActionScrollToTemplate != null) {
                field3 = divActionScrollToTemplate.f46237c;
            } else {
                field3 = null;
            }
            return new DivActionScrollToTemplate(optionalFieldWithExpression, field4, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", typeHelper2, allowPropertyOverride, field3));
        }
    }

    /* JADX INFO: compiled from: DivActionScrollToJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionScrollToTemplate, DivActionScrollTo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50707a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollTo resolve(ParsingContext parsingContext, DivActionScrollToTemplate divActionScrollToTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divActionScrollToTemplate.f46235a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = k.f50704b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivActionScrollTo(expression, (DivActionScrollDestination) JsonFieldResolver.resolve(parsingContext, divActionScrollToTemplate.f46236b, jSONObject, "destination", this.f50707a.F0(), this.f50707a.D0()), JsonFieldResolver.resolveExpression(parsingContext, divActionScrollToTemplate.f46237c, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50707a = jsonParserComponent;
        }
    }
}
