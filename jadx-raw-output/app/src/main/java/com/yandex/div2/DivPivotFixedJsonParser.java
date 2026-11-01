package com.yandex.div2;

import com.ironsource.Ne;
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

/* JADX INFO: compiled from: DivPivotFixedJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPivotFixedJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48394a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f48395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f48396c;

    /* JADX INFO: compiled from: DivPivotFixedJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPivotFixedJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48397a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPivotFixed deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivPivotFixedJsonParser.f48396c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivPivotFixedJsonParser.f48395b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivPivotFixed(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPivotFixed divPivotFixed) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divPivotFixed.f48391a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divPivotFixed.f48392b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48397a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPivotFixedJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48398a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPivotFixedTemplate divPivotFixedTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divPivotFixedTemplate.f48403a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPivotFixedTemplate.f48404b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48398a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPivotFixedTemplate deserialize(ParsingContext parsingContext, DivPivotFixedTemplate divPivotFixedTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field;
            Field<Expression<Long>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivSizeUnit> typeHelper = DivPivotFixedJsonParser.f48396c;
            if (divPivotFixedTemplate != null) {
                field = divPivotFixedTemplate.f48403a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, typeHelper, allowPropertyOverride, field, DivSizeUnit.FROM_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            if (divPivotFixedTemplate != null) {
                field2 = divPivotFixedTemplate.f48404b;
            } else {
                field2 = null;
            }
            return new DivPivotFixedTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }

    /* JADX INFO: compiled from: DivPivotFixedJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPivotFixedTemplate, DivPivotFixed> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48399a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPivotFixed resolve(ParsingContext parsingContext, DivPivotFixedTemplate divPivotFixedTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divPivotFixedTemplate.f48403a;
            TypeHelper<DivSizeUnit> typeHelper = DivPivotFixedJsonParser.f48396c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivPivotFixedJsonParser.f48395b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivPivotFixed(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, divPivotFixedTemplate.f48404b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48399a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f48395b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f48396c = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPivotFixedJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
    }
}
