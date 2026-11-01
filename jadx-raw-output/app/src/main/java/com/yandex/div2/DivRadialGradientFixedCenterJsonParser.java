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

/* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivRadialGradientFixedCenterJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48456a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f48457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f48458c;

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48459a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientFixedCenter deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivRadialGradientFixedCenterJsonParser.f48458c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivRadialGradientFixedCenterJsonParser.f48457b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivRadialGradientFixedCenter(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientFixedCenter divRadialGradientFixedCenter) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divRadialGradientFixedCenter.f48453a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientFixedCenter.f48454b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48459a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48460a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divRadialGradientFixedCenterTemplate.f48465a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientFixedCenterTemplate.f48466b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48460a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientFixedCenterTemplate deserialize(ParsingContext parsingContext, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field;
            Field<Expression<Long>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivSizeUnit> typeHelper = DivRadialGradientFixedCenterJsonParser.f48458c;
            if (divRadialGradientFixedCenterTemplate != null) {
                field = divRadialGradientFixedCenterTemplate.f48465a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, typeHelper, allowPropertyOverride, field, DivSizeUnit.FROM_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            if (divRadialGradientFixedCenterTemplate != null) {
                field2 = divRadialGradientFixedCenterTemplate.f48466b;
            } else {
                field2 = null;
            }
            return new DivRadialGradientFixedCenterTemplate(optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRadialGradientFixedCenterTemplate, DivRadialGradientFixedCenter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48461a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientFixedCenter resolve(ParsingContext parsingContext, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divRadialGradientFixedCenterTemplate.f48465a;
            TypeHelper<DivSizeUnit> typeHelper = DivRadialGradientFixedCenterJsonParser.f48458c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivRadialGradientFixedCenterJsonParser.f48457b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivRadialGradientFixedCenter(expression, JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientFixedCenterTemplate.f48466b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48461a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f48457b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f48458c = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientFixedCenterJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
    }
}
