package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.ViewCompat;
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
import com.yandex.div2.DivSliderTextStyleJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivSliderTextStyleJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48992a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f48994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f48996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f48997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f48998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49000i;

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49001a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider.TextStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSliderTextStyleJsonParser.f48999h;
            Expression<Long> expression = DivSliderTextStyleJsonParser.f48993b;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            TypeHelper<DivSizeUnit> typeHelper2 = DivSliderTextStyleJsonParser.f48997f;
            bk.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivSliderTextStyleJsonParser.f48994c;
            Expression<DivSizeUnit> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper2, lVar2, expression2);
            if (optionalExpression3 != null) {
                expression2 = optionalExpression3;
            }
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSliderTextStyleJsonParser.f48998g, DivFontWeight.FROM_STRING);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper, lVar, DivSliderTextStyleJsonParser.f49000i);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression3 = DivSliderTextStyleJsonParser.f48995d;
            Expression<Double> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, lVar3, expression3);
            if (optionalExpression7 != null) {
                expression3 = optionalExpression7;
            }
            DivPoint divPoint = (DivPoint) JsonPropertyParser.readOptional(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f49001a.Z5());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression4 = DivSliderTextStyleJsonParser.f48996e;
            Expression<Integer> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper4, lVar4, expression4);
            if (optionalExpression8 != null) {
                expression4 = optionalExpression8;
            }
            return new DivSlider.TextStyle(optionalExpression, expression, expression2, optionalExpression4, optionalExpression5, optionalExpression6, expression3, divPoint, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSlider.TextStyle textStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", textStyle.f48912a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", textStyle.f48913b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", textStyle.f48914c, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, textStyle.f48915d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, textStyle.f48916e, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", textStyle.f48917f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", textStyle.f48918g);
            JsonPropertyParser.write(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, textStyle.f48919h, this.f49001a.Z5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", textStyle.f48920i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49001a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49002a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSliderTemplate.TextStyleTemplate deserialize(ParsingContext parsingContext, DivSliderTemplate.TextStyleTemplate textStyleTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48983a : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = textStyleTemplate != null ? textStyleTemplate.f48984b : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivSliderTemplate.TextStyleTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper, allowPropertyOverride, field, lVar, DivSliderTextStyleJsonParser.f48999h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivSliderTextStyleJsonParser.f48997f, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48985c : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48986d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSliderTextStyleJsonParser.f48998g, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48987e : null, DivFontWeight.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48988f : null, lVar, DivSliderTextStyleJsonParser.f49000i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48989g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48990h : null, this.f49002a.a6()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.f48991i : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSliderTemplate.TextStyleTemplate textStyleTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", textStyleTemplate.f48983a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", textStyleTemplate.f48984b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", textStyleTemplate.f48985c, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, textStyleTemplate.f48986d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, textStyleTemplate.f48987e, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", textStyleTemplate.f48988f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", textStyleTemplate.f48989g);
            JsonFieldParser.writeField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, textStyleTemplate.f48990h, this.f49002a.a6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", textStyleTemplate.f48991i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49002a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSliderTemplate.TextStyleTemplate, DivSlider.TextStyle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49003a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider.TextStyle resolve(ParsingContext parsingContext, DivSliderTemplate.TextStyleTemplate textStyleTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f48983a, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field = textStyleTemplate.f48984b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivSliderTextStyleJsonParser.f48999h;
            Expression<Long> expression = DivSliderTextStyleJsonParser.f48993b;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "font_size", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            Field<Expression<DivSizeUnit>> field2 = textStyleTemplate.f48985c;
            TypeHelper<DivSizeUnit> typeHelper2 = DivSliderTextStyleJsonParser.f48997f;
            bk.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivSliderTextStyleJsonParser.f48994c;
            Expression<DivSizeUnit> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "font_size_unit", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression3 != null) {
                expression2 = expressionResolveOptionalExpression3;
            }
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f48986d, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f48987e, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSliderTextStyleJsonParser.f48998g, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.f48988f, jSONObject, "font_weight_value", typeHelper, lVar, DivSliderTextStyleJsonParser.f49000i);
            Field<Expression<Double>> field3 = textStyleTemplate.f48989g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression3 = DivSliderTextStyleJsonParser.f48995d;
            Expression<Double> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "letter_spacing", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression7 != null) {
                expression3 = expressionResolveOptionalExpression7;
            }
            DivPoint divPoint = (DivPoint) JsonFieldResolver.resolveOptional(parsingContext, textStyleTemplate.f48990h, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f49003a.b6(), this.f49003a.Z5());
            Field<Expression<Integer>> field4 = textStyleTemplate.f48991i;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression4 = DivSliderTextStyleJsonParser.f48996e;
            Expression<Integer> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "text_color", typeHelper4, lVar4, expression4);
            if (expressionResolveOptionalExpression8 != null) {
                expression4 = expressionResolveOptionalExpression8;
            }
            return new DivSlider.TextStyle(expressionResolveOptionalExpression, expression, expression2, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, expression3, divPoint, expression4);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49003a = jsonParserComponent;
        }
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 > 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48993b = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f48994c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f48995d = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48996e = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48997f = companion2.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f48998g = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f48999h = new ValueValidator() { // from class: oe.k9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderTextStyleJsonParser.c(((Long) obj).longValue());
            }
        };
        f49000i = new ValueValidator() { // from class: oe.l9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderTextStyleJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
