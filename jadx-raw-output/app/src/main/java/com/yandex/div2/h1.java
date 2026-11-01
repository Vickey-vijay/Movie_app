package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50663a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50664b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivFixedLengthInputMask.PatternElement> f50665c = new ListValidator() { // from class: oe.c4
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.h1.b(list);
        }
    };

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50666a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = h1.f50664b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "always_visible", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivFixedLengthInputMask(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readList(parsingContext, jSONObject, "pattern_elements", this.f50666a.t3(), h1.f50665c), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMask divFixedLengthInputMask) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "always_visible", divFixedLengthInputMask.f47159a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", divFixedLengthInputMask.f47160b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pattern_elements", divFixedLengthInputMask.f47161c, this.f50666a.t3());
            JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", divFixedLengthInputMask.a());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50666a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50667a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "always_visible", divFixedLengthInputMaskTemplate.f47174a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divFixedLengthInputMaskTemplate.f47175b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pattern_elements", divFixedLengthInputMaskTemplate.f47176c, this.f50667a.u3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divFixedLengthInputMaskTemplate.f47177d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50667a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMaskTemplate deserialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field;
            Field<Expression<String>> field2;
            Field<List<DivFixedLengthInputMaskTemplate.PatternElementTemplate>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<String> field4 = null;
            if (divFixedLengthInputMaskTemplate != null) {
                field = divFixedLengthInputMaskTemplate.f47174a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "always_visible", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divFixedLengthInputMaskTemplate != null) {
                field2 = divFixedLengthInputMaskTemplate.f47175b;
            } else {
                field2 = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", typeHelper2, allowPropertyOverride, field2);
            if (divFixedLengthInputMaskTemplate != null) {
                field3 = divFixedLengthInputMaskTemplate.f47176c;
            } else {
                field3 = null;
            }
            mj.g<i1.c> gVarU3 = this.f50667a.u3();
            ListValidator<DivFixedLengthInputMask.PatternElement> listValidator = h1.f50665c;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "pattern_elements", allowPropertyOverride, field3, gVarU3, listValidator);
            if (divFixedLengthInputMaskTemplate != null) {
                field4 = divFixedLengthInputMaskTemplate.f47177d;
            }
            return new DivFixedLengthInputMaskTemplate((Field<Expression<Boolean>>) optionalFieldWithExpression, (Field<Expression<String>>) fieldWithExpression, (Field<List<DivFixedLengthInputMaskTemplate.PatternElementTemplate>>) listField, (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, field4));
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFixedLengthInputMaskTemplate, DivFixedLengthInputMask> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50668a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedLengthInputMask resolve(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divFixedLengthInputMaskTemplate.f47174a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = h1.f50664b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "always_visible", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivFixedLengthInputMask(expression, JsonFieldResolver.resolveExpression(parsingContext, divFixedLengthInputMaskTemplate.f47175b, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveList(parsingContext, divFixedLengthInputMaskTemplate.f47176c, jSONObject, "pattern_elements", this.f50668a.v3(), this.f50668a.t3(), h1.f50665c), (String) JsonFieldResolver.resolve(parsingContext, divFixedLengthInputMaskTemplate.f47177d, jSONObject, "raw_text_variable"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50668a = jsonParserComponent;
        }
    }

    public static final boolean b(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
