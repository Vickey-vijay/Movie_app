package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

/* JADX INFO: compiled from: DivActionScrollByJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionScrollByJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46192a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f46193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f46195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivActionScrollBy.Overflow> f46196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivActionScrollBy.Overflow> f46197f;

    /* JADX INFO: compiled from: DivActionScrollByJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionScrollByJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46198a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollBy deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivActionScrollByJsonParser.f46193b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = optionalExpression == null ? expression : optionalExpression;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression<Long> expression4 = DivActionScrollByJsonParser.f46194c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_count", typeHelper2, lVar2, expression4);
            if (optionalExpression2 != null) {
                expression4 = optionalExpression2;
            }
            Expression<Long> expression5 = DivActionScrollByJsonParser.f46195d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, typeHelper2, lVar2, expression5);
            if (optionalExpression3 != null) {
                expression5 = optionalExpression3;
            }
            TypeHelper<DivActionScrollBy.Overflow> typeHelper3 = DivActionScrollByJsonParser.f46197f;
            bk.l<String, DivActionScrollBy.Overflow> lVar3 = DivActionScrollBy.Overflow.FROM_STRING;
            Expression<DivActionScrollBy.Overflow> expression6 = DivActionScrollByJsonParser.f46196e;
            Expression<DivActionScrollBy.Overflow> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "overflow", typeHelper3, lVar3, expression6);
            if (optionalExpression4 == null) {
                optionalExpression4 = expression6;
            }
            return new DivActionScrollBy(expression2, expression3, expression4, expression5, optionalExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollBy divActionScrollBy) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", divActionScrollBy.f46185a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionScrollBy.f46186b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_count", divActionScrollBy.f46187c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divActionScrollBy.f46188d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "overflow", divActionScrollBy.f46189e, DivActionScrollBy.Overflow.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46198a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollByJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46199a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollByTemplate deserialize(ParsingContext parsingContext, DivActionScrollByTemplate divActionScrollByTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.f46207a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.f46208b : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divActionScrollByTemplate != null ? divActionScrollByTemplate.f46209c : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionScrollByTemplate(optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_count", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, typeHelper, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.f46210d : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "overflow", DivActionScrollByJsonParser.f46197f, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.f46211e : null, DivActionScrollBy.Overflow.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollByTemplate divActionScrollByTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", divActionScrollByTemplate.f46207a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionScrollByTemplate.f46208b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_count", divActionScrollByTemplate.f46209c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divActionScrollByTemplate.f46210d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "overflow", divActionScrollByTemplate.f46211e, DivActionScrollBy.Overflow.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46199a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollByJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionScrollByTemplate, DivActionScrollBy> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46200a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionScrollBy resolve(ParsingContext parsingContext, DivActionScrollByTemplate divActionScrollByTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divActionScrollByTemplate.f46207a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivActionScrollByJsonParser.f46193b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionScrollByTemplate.f46208b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field2 = divActionScrollByTemplate.f46209c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression<Long> expression2 = DivActionScrollByJsonParser.f46194c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "item_count", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Long>> field3 = divActionScrollByTemplate.f46210d;
            Expression<Long> expression3 = DivActionScrollByJsonParser.f46195d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, typeHelper2, lVar2, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            Field<Expression<DivActionScrollBy.Overflow>> field4 = divActionScrollByTemplate.f46211e;
            TypeHelper<DivActionScrollBy.Overflow> typeHelper3 = DivActionScrollByJsonParser.f46197f;
            bk.l<String, DivActionScrollBy.Overflow> lVar3 = DivActionScrollBy.Overflow.FROM_STRING;
            Expression<DivActionScrollBy.Overflow> expression5 = DivActionScrollByJsonParser.f46196e;
            Expression<DivActionScrollBy.Overflow> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "overflow", typeHelper3, lVar3, expression5);
            return new DivActionScrollBy(expression, expressionResolveExpression, expression2, expression4, expressionResolveOptionalExpression4 == null ? expression5 : expressionResolveOptionalExpression4);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46200a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46193b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f46194c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46195d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivActionScrollBy.Overflow overflow = DivActionScrollBy.Overflow.CLAMP;
        f46196e = Expression.Companion.constant$default(companion, overflow, null, 2, null);
        f46197f = TypeHelper.Companion.from(overflow, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionScrollByJsonParser$Companion$TYPE_HELPER_OVERFLOW$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivActionScrollBy.Overflow);
            }
        });
    }
}
