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
import com.yandex.div2.DivEdgeInsetsJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivEdgeInsetsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47062a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f47067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f47068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47074m;

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47075a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivEdgeInsets deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivEdgeInsetsJsonParser.f47069h;
            Expression<Long> expression = DivEdgeInsetsJsonParser.f47063b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, lVar, DivEdgeInsetsJsonParser.f47070i);
            ValueValidator<Long> valueValidator2 = DivEdgeInsetsJsonParser.f47071j;
            Expression<Long> expression2 = DivEdgeInsetsJsonParser.f47064c;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, lVar, valueValidator2, expression2);
            if (optionalExpression3 != null) {
                expression2 = optionalExpression3;
            }
            ValueValidator<Long> valueValidator3 = DivEdgeInsetsJsonParser.f47072k;
            Expression<Long> expression3 = DivEdgeInsetsJsonParser.f47065d;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, lVar, valueValidator3, expression3);
            if (optionalExpression4 != null) {
                expression3 = optionalExpression4;
            }
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, lVar, DivEdgeInsetsJsonParser.f47073l);
            ValueValidator<Long> valueValidator4 = DivEdgeInsetsJsonParser.f47074m;
            Expression<Long> expression4 = DivEdgeInsetsJsonParser.f47066e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, lVar, valueValidator4, expression4);
            Expression<Long> expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            TypeHelper<DivSizeUnit> typeHelper2 = DivEdgeInsetsJsonParser.f47068g;
            bk.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression6 = DivEdgeInsetsJsonParser.f47067f;
            Expression<DivSizeUnit> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper2, lVar2, expression6);
            if (optionalExpression7 != null) {
                expression6 = optionalExpression7;
            }
            return new DivEdgeInsets(expression, optionalExpression2, expression2, expression3, optionalExpression5, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivEdgeInsets divEdgeInsets) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", divEdgeInsets.f47054a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", divEdgeInsets.f47055b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", divEdgeInsets.f47056c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", divEdgeInsets.f47057d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", divEdgeInsets.f47058e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", divEdgeInsets.f47059f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divEdgeInsets.f47060g, DivSizeUnit.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47075a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47076a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivEdgeInsetsTemplate deserialize(ParsingContext parsingContext, DivEdgeInsetsTemplate divEdgeInsetsTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47085a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivEdgeInsetsTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, lVar, DivEdgeInsetsJsonParser.f47069h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47086b : null, lVar, DivEdgeInsetsJsonParser.f47070i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47087c : null, lVar, DivEdgeInsetsJsonParser.f47071j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47088d : null, lVar, DivEdgeInsetsJsonParser.f47072k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47089e : null, lVar, DivEdgeInsetsJsonParser.f47073l), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47090f : null, lVar, DivEdgeInsetsJsonParser.f47074m), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, DivEdgeInsetsJsonParser.f47068g, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f47091g : null, DivSizeUnit.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivEdgeInsetsTemplate divEdgeInsetsTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", divEdgeInsetsTemplate.f47085a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", divEdgeInsetsTemplate.f47086b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", divEdgeInsetsTemplate.f47087c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", divEdgeInsetsTemplate.f47088d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", divEdgeInsetsTemplate.f47089e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", divEdgeInsetsTemplate.f47090f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divEdgeInsetsTemplate.f47091g, DivSizeUnit.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47076a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivEdgeInsetsTemplate, DivEdgeInsets> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47077a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivEdgeInsets resolve(ParsingContext parsingContext, DivEdgeInsetsTemplate divEdgeInsetsTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divEdgeInsetsTemplate.f47085a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivEdgeInsetsJsonParser.f47069h;
            Expression<Long> expression = DivEdgeInsetsJsonParser.f47063b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            Expression<Long> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divEdgeInsetsTemplate.f47086b, jSONObject, "end", typeHelper, lVar, DivEdgeInsetsJsonParser.f47070i);
            Field<Expression<Long>> field2 = divEdgeInsetsTemplate.f47087c;
            ValueValidator<Long> valueValidator2 = DivEdgeInsetsJsonParser.f47071j;
            Expression<Long> expression3 = DivEdgeInsetsJsonParser.f47064c;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, lVar, valueValidator2, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            Field<Expression<Long>> field3 = divEdgeInsetsTemplate.f47088d;
            ValueValidator<Long> valueValidator3 = DivEdgeInsetsJsonParser.f47072k;
            Expression<Long> expression5 = DivEdgeInsetsJsonParser.f47065d;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, lVar, valueValidator3, expression5);
            Expression<Long> expression6 = expressionResolveOptionalExpression4 == null ? expression5 : expressionResolveOptionalExpression4;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divEdgeInsetsTemplate.f47089e, jSONObject, "start", typeHelper, lVar, DivEdgeInsetsJsonParser.f47073l);
            Field<Expression<Long>> field4 = divEdgeInsetsTemplate.f47090f;
            ValueValidator<Long> valueValidator4 = DivEdgeInsetsJsonParser.f47074m;
            Expression<Long> expression7 = DivEdgeInsetsJsonParser.f47066e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "top", typeHelper, lVar, valueValidator4, expression7);
            Expression<Long> expression8 = expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6;
            Field<Expression<DivSizeUnit>> field5 = divEdgeInsetsTemplate.f47091g;
            TypeHelper<DivSizeUnit> typeHelper2 = DivEdgeInsetsJsonParser.f47068g;
            bk.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression9 = DivEdgeInsetsJsonParser.f47067f;
            Expression<DivSizeUnit> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, Ne.f27158n1, typeHelper2, lVar2, expression9);
            return new DivEdgeInsets(expression2, expressionResolveOptionalExpression2, expression4, expression6, expressionResolveOptionalExpression5, expression8, expressionResolveOptionalExpression7 == null ? expression9 : expressionResolveOptionalExpression7);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47077a = jsonParserComponent;
        }
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47063b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47064c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47065d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47066e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f47067f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f47068g = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f47069h = new ValueValidator() { // from class: oe.m3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.g(((Long) obj).longValue());
            }
        };
        f47070i = new ValueValidator() { // from class: oe.n3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.h(((Long) obj).longValue());
            }
        };
        f47071j = new ValueValidator() { // from class: oe.o3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.i(((Long) obj).longValue());
            }
        };
        f47072k = new ValueValidator() { // from class: oe.p3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.j(((Long) obj).longValue());
            }
        };
        f47073l = new ValueValidator() { // from class: oe.q3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.k(((Long) obj).longValue());
            }
        };
        f47074m = new ValueValidator() { // from class: oe.r3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.l(((Long) obj).longValue());
            }
        };
    }
}
