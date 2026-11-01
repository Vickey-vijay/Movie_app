package com.yandex.div2;

import com.ironsource.Ne;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* JADX INFO: compiled from: DivDimensionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivDimensionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46985a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f46986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f46987c;

    /* JADX INFO: compiled from: DivDimensionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDimensionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46988a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDimension deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivDimensionJsonParser.f46987c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivDimensionJsonParser.f46986b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivDimension(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDimension divDimension) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divDimension.f46982a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divDimension.f46983b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46988a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivDimensionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46989a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDimensionTemplate divDimensionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divDimensionTemplate.f46994a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divDimensionTemplate.f46995b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46989a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDimensionTemplate deserialize(ParsingContext parsingContext, DivDimensionTemplate divDimensionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field;
            Field<Expression<Double>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivSizeUnit> typeHelper = DivDimensionJsonParser.f46987c;
            if (divDimensionTemplate != null) {
                field = divDimensionTemplate.f46994a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, typeHelper, allowPropertyOverride, field, DivSizeUnit.FROM_STRING);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (divDimensionTemplate != null) {
                field2 = divDimensionTemplate.f46995b;
            } else {
                field2 = null;
            }
            return new DivDimensionTemplate(optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    /* JADX INFO: compiled from: DivDimensionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDimensionTemplate, DivDimension> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46990a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDimension resolve(ParsingContext parsingContext, DivDimensionTemplate divDimensionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divDimensionTemplate.f46994a;
            TypeHelper<DivSizeUnit> typeHelper = DivDimensionJsonParser.f46987c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivDimensionJsonParser.f46986b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivDimension(expression, JsonFieldResolver.resolveExpression(parsingContext, divDimensionTemplate.f46995b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46990a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f46986b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f46987c = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivDimensionJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
    }
}
