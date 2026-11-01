package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50725a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50726b = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50727c = new ValueValidator() { // from class: oe.k6
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.l2.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<Integer> f50728d = new ListValidator() { // from class: oe.l6
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.l2.e(list);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivLinearGradient.ColorPoint> f50729e = new ListValidator() { // from class: oe.m6
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.l2.f(list);
        }
    };

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50730a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradient deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = l2.f50727c;
            Expression<Long> expression = l2.f50726b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "angle", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivLinearGradient(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.f50730a.S4(), l2.f50729e), JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, l2.f50728d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradient divLinearGradient) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "angle", divLinearGradient.f48038a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", divLinearGradient.f48039b, this.f50730a.S4());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", divLinearGradient.f48040c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50730a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50731a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradientTemplate deserialize(ParsingContext parsingContext, DivLinearGradientTemplate divLinearGradientTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divLinearGradientTemplate != null ? divLinearGradientTemplate.f48050a : null, ParsingConvertersKt.NUMBER_TO_INT, l2.f50727c);
            Field<List<DivLinearGradientTemplate.ColorPointTemplate>> field = divLinearGradientTemplate != null ? divLinearGradientTemplate.f48051b : null;
            mj.g<k2.c> gVarT4 = this.f50731a.T4();
            ListValidator<DivLinearGradient.ColorPoint> listValidator = l2.f50729e;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, gVarT4, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<ExpressionList<Integer>> field2 = divLinearGradientTemplate != null ? divLinearGradientTemplate.f48052c : null;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator<Integer> listValidator2 = l2.f50728d;
            ck.p.h(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivLinearGradientTemplate(optionalFieldWithExpression, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, lVar, listValidator2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradientTemplate divLinearGradientTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "angle", divLinearGradientTemplate.f48050a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", divLinearGradientTemplate.f48051b, this.f50731a.T4());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", divLinearGradientTemplate.f48052c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50731a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivLinearGradientJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivLinearGradientTemplate, DivLinearGradient> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50732a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivLinearGradient resolve(ParsingContext parsingContext, DivLinearGradientTemplate divLinearGradientTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divLinearGradientTemplate.f48050a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = l2.f50727c;
            Expression<Long> expression = l2.f50726b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "angle", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivLinearGradient(expression, JsonFieldResolver.resolveOptionalList(parsingContext, divLinearGradientTemplate.f48051b, jSONObject, "color_map", this.f50732a.U4(), this.f50732a.S4(), l2.f50729e), JsonFieldResolver.resolveOptionalExpressionList(parsingContext, divLinearGradientTemplate.f48052c, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, l2.f50728d));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50732a = jsonParserComponent;
        }
    }

    public static final boolean d(long j10) {
        return j10 >= 0 && j10 <= 360;
    }

    public static final boolean e(List list) {
        if (list.size() >= 2) {
            return true;
        }
        return false;
    }

    public static final boolean f(List list) {
        if (list.size() >= 2) {
            return true;
        }
        return false;
    }
}
