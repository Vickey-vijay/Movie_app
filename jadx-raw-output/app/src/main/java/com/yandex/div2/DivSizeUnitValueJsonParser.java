package com.yandex.div2;

import com.ironsource.Ne;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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
import com.yandex.div2.DivSizeUnitValueJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSizeUnitValueJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48819a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f48820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f48821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48822d;

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48823a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSizeUnitValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivSizeUnitValueJsonParser.f48821c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivSizeUnitValueJsonParser.f48820b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivSizeUnitValue(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.f48822d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSizeUnitValue divSizeUnitValue) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divSizeUnitValue.f48816a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divSizeUnitValue.f48817b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48823a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48824a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSizeUnitValueTemplate divSizeUnitValueTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divSizeUnitValueTemplate.f48829a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divSizeUnitValueTemplate.f48830b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48824a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSizeUnitValueTemplate deserialize(ParsingContext parsingContext, DivSizeUnitValueTemplate divSizeUnitValueTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field;
            Field<Expression<Long>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivSizeUnit> typeHelper = DivSizeUnitValueJsonParser.f48821c;
            if (divSizeUnitValueTemplate != null) {
                field = divSizeUnitValueTemplate.f48829a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, typeHelper, allowPropertyOverride, field, DivSizeUnit.FROM_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            if (divSizeUnitValueTemplate != null) {
                field2 = divSizeUnitValueTemplate.f48830b;
            } else {
                field2 = null;
            }
            return new DivSizeUnitValueTemplate(optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.f48822d));
        }
    }

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSizeUnitValueTemplate, DivSizeUnitValue> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48825a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSizeUnitValue resolve(ParsingContext parsingContext, DivSizeUnitValueTemplate divSizeUnitValueTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divSizeUnitValueTemplate.f48829a;
            TypeHelper<DivSizeUnit> typeHelper = DivSizeUnitValueJsonParser.f48821c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivSizeUnitValueJsonParser.f48820b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivSizeUnitValue(expression, JsonFieldResolver.resolveExpression(parsingContext, divSizeUnitValueTemplate.f48830b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.f48822d));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48825a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f48820b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f48821c = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSizeUnitValueJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f48822d = new ValueValidator() { // from class: oe.d9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSizeUnitValueJsonParser.b(((Long) obj).longValue());
            }
        };
    }
}
