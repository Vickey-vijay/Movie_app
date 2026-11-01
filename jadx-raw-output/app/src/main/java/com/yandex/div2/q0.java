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

/* JADX INFO: compiled from: DivContainerJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50824a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50827d;

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50828a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainer.Separator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f50828a.Y2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = q0.f50825b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_end", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            Expression<Boolean> expression2 = q0.f50826c;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_start", typeHelper, lVar, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            Expression<Boolean> expression3 = q0.f50827d;
            Expression<Boolean> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_between", typeHelper, lVar, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            return new DivContainer.Separator(divEdgeInsets, expression, expression2, expression3, (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "style", this.f50828a.V2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivContainer.Separator separator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", separator.f46744a, this.f50828a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_end", separator.f46745b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_start", separator.f46746c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_between", separator.f46747d);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", separator.f46748e, this.f50828a.V2());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50828a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50829a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainerTemplate.SeparatorTemplate deserialize(ParsingContext parsingContext, DivContainerTemplate.SeparatorTemplate separatorTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f46827a : null, this.f50829a.Z2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = separatorTemplate != null ? separatorTemplate.f46828b : null;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivContainerTemplate.SeparatorTemplate(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_at_end", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_at_start", typeHelper, allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f46829c : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_between", typeHelper, allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f46830d : null, lVar), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "style", allowPropertyOverride, separatorTemplate != null ? separatorTemplate.f46831e : null, this.f50829a.W2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivContainerTemplate.SeparatorTemplate separatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", separatorTemplate.f46827a, this.f50829a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_end", separatorTemplate.f46828b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_start", separatorTemplate.f46829c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_between", separatorTemplate.f46830d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", separatorTemplate.f46831e, this.f50829a.W2());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50829a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivContainerTemplate.SeparatorTemplate, DivContainer.Separator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50830a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainer.Separator resolve(ParsingContext parsingContext, DivContainerTemplate.SeparatorTemplate separatorTemplate, JSONObject jSONObject) throws ParsingException {
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, separatorTemplate.f46827a, jSONObject, "margins", this.f50830a.a3(), this.f50830a.Y2());
            Field<Expression<Boolean>> field = separatorTemplate.f46828b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = q0.f50825b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "show_at_end", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Boolean>> field2 = separatorTemplate.f46829c;
            Expression<Boolean> expression2 = q0.f50826c;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "show_at_start", typeHelper, lVar, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Boolean>> field3 = separatorTemplate.f46830d;
            Expression<Boolean> expression3 = q0.f50827d;
            Expression<Boolean> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "show_between", typeHelper, lVar, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new DivContainer.Separator(divEdgeInsets, expression, expression2, expression3, (DivDrawable) JsonFieldResolver.resolve(parsingContext, separatorTemplate.f46831e, jSONObject, "style", this.f50830a.X2(), this.f50830a.V2()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50830a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Boolean bool = Boolean.FALSE;
        f50825b = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50826c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50827d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
    }
}
