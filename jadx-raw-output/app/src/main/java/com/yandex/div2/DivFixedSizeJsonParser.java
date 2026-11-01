package com.yandex.div2;

import com.ironsource.Ne;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import com.yandex.div2.DivFixedSizeJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedSizeJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivFixedSizeJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47190a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f47191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f47192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47193d;

    /* JADX INFO: compiled from: DivFixedSizeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFixedSizeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47194a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivFixedSizeJsonParser.f47192c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivFixedSizeJsonParser.f47191b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivFixedSize(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivFixedSizeJsonParser.f47193d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedSize divFixedSize) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divFixedSize.f47187a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divFixedSize.f47188b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47194a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFixedSizeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47195a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedSizeTemplate divFixedSizeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divFixedSizeTemplate.f47200a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divFixedSizeTemplate.f47201b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47195a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedSizeTemplate deserialize(ParsingContext parsingContext, DivFixedSizeTemplate divFixedSizeTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field;
            Field<Expression<Long>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivSizeUnit> typeHelper = DivFixedSizeJsonParser.f47192c;
            if (divFixedSizeTemplate != null) {
                field = divFixedSizeTemplate.f47200a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, typeHelper, allowPropertyOverride, field, DivSizeUnit.FROM_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            if (divFixedSizeTemplate != null) {
                field2 = divFixedSizeTemplate.f47201b;
            } else {
                field2 = null;
            }
            return new DivFixedSizeTemplate(optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT, DivFixedSizeJsonParser.f47193d));
        }
    }

    /* JADX INFO: compiled from: DivFixedSizeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFixedSizeTemplate, DivFixedSize> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47196a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedSize resolve(ParsingContext parsingContext, DivFixedSizeTemplate divFixedSizeTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divFixedSizeTemplate.f47200a;
            TypeHelper<DivSizeUnit> typeHelper = DivFixedSizeJsonParser.f47192c;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivFixedSizeJsonParser.f47191b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivFixedSize(expression, JsonFieldResolver.resolveExpression(parsingContext, divFixedSizeTemplate.f47201b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivFixedSizeJsonParser.f47193d));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47196a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f47191b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f47192c = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivFixedSizeJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f47193d = new ValueValidator() { // from class: oe.f4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivFixedSizeJsonParser.b(((Long) obj).longValue());
            }
        };
    }
}
