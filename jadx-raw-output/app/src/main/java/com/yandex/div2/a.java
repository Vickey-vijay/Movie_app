package com.yandex.div2;

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
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0456a f50550a = new C0456a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50558i;

    /* JADX INFO: renamed from: com.yandex.div2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class C0456a {
        public C0456a() {
        }

        public /* synthetic */ C0456a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50559a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAbsoluteEdgeInsets deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = a.f50555f;
            Expression<Long> expression = a.f50551b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            ValueValidator<Long> valueValidator2 = a.f50556g;
            Expression<Long> expression2 = a.f50552c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, lVar, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            ValueValidator<Long> valueValidator3 = a.f50557h;
            Expression<Long> expression3 = a.f50553d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, lVar, valueValidator3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            ValueValidator<Long> valueValidator4 = a.f50558i;
            Expression<Long> expression4 = a.f50554e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, lVar, valueValidator4, expression4);
            if (optionalExpression4 != null) {
                expression4 = optionalExpression4;
            }
            return new DivAbsoluteEdgeInsets(expression, expression2, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", divAbsoluteEdgeInsets.f45977a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", divAbsoluteEdgeInsets.f45978b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", divAbsoluteEdgeInsets.f45979c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", divAbsoluteEdgeInsets.f45980d);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50559a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50560a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAbsoluteEdgeInsetsTemplate deserialize(ParsingContext parsingContext, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f45988a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivAbsoluteEdgeInsetsTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, lVar, a.f50555f), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f45989b : null, lVar, a.f50556g), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f45990c : null, lVar, a.f50557h), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f45991d : null, lVar, a.f50558i));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", divAbsoluteEdgeInsetsTemplate.f45988a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", divAbsoluteEdgeInsetsTemplate.f45989b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", divAbsoluteEdgeInsetsTemplate.f45990c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", divAbsoluteEdgeInsetsTemplate.f45991d);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50560a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAbsoluteEdgeInsetsTemplate, DivAbsoluteEdgeInsets> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50561a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAbsoluteEdgeInsets resolve(ParsingContext parsingContext, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divAbsoluteEdgeInsetsTemplate.f45988a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = a.f50555f;
            Expression<Long> expression = a.f50551b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field<Expression<Long>> field2 = divAbsoluteEdgeInsetsTemplate.f45989b;
            ValueValidator<Long> valueValidator2 = a.f50556g;
            Expression<Long> expression2 = a.f50552c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, lVar, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Long>> field3 = divAbsoluteEdgeInsetsTemplate.f45990c;
            ValueValidator<Long> valueValidator3 = a.f50557h;
            Expression<Long> expression3 = a.f50553d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, lVar, valueValidator3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Field<Expression<Long>> field4 = divAbsoluteEdgeInsetsTemplate.f45991d;
            ValueValidator<Long> valueValidator4 = a.f50558i;
            Expression<Long> expression4 = a.f50554e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "top", typeHelper, lVar, valueValidator4, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            return new DivAbsoluteEdgeInsets(expressionResolveOptionalExpression, expression2, expression3, expression4);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50561a = jsonParserComponent;
        }
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50551b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f50552c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f50553d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f50554e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f50555f = new ValueValidator() { // from class: oe.e0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.e(((Long) obj).longValue());
            }
        };
        f50556g = new ValueValidator() { // from class: oe.f0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.f(((Long) obj).longValue());
            }
        };
        f50557h = new ValueValidator() { // from class: oe.g0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.g(((Long) obj).longValue());
            }
        };
        f50558i = new ValueValidator() { // from class: oe.h0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.h(((Long) obj).longValue());
            }
        };
    }
}
