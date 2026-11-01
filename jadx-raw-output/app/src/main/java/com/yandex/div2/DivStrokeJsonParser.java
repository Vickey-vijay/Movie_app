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
import com.yandex.div2.DivStrokeJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivStrokeJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49136a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivStrokeStyle.c f49137b = new DivStrokeStyle.c(new DivStrokeStyleSolid());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f49138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f49140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f49141f;

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49142a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStroke deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivStrokeStyle divStrokeStyle = (DivStrokeStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "style", this.f49142a.I7());
            if (divStrokeStyle == null) {
                divStrokeStyle = DivStrokeJsonParser.f49137b;
            }
            DivStrokeStyle divStrokeStyle2 = divStrokeStyle;
            TypeHelper<DivSizeUnit> typeHelper = DivStrokeJsonParser.f49140e;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivStrokeJsonParser.f49138c;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f27158n1, typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStrokeJsonParser.f49141f;
            Expression<Double> expression3 = DivStrokeJsonParser.f49139d;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "width", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            return new DivStroke(expression, divStrokeStyle2, expression2, expression3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivStroke divStroke) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divStroke.f49131a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", divStroke.f49132b, this.f49142a.I7());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f27158n1, divStroke.f49133c, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", divStroke.f49134d);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49142a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49143a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStrokeTemplate deserialize(ParsingContext parsingContext, DivStrokeTemplate divStrokeTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivStrokeTemplate((Field<Expression<Integer>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f49169a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), (Field<DivStrokeStyleTemplate>) JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "style", allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f49170b : null, this.f49143a.J7()), (Field<Expression<DivSizeUnit>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f27158n1, DivStrokeJsonParser.f49140e, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f49171c : null, DivSizeUnit.FROM_STRING), (Field<Expression<Double>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.f49172d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivStrokeJsonParser.f49141f));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivStrokeTemplate divStrokeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divStrokeTemplate.f49169a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", divStrokeTemplate.f49170b, this.f49143a.J7());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f27158n1, divStrokeTemplate.f49171c, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", divStrokeTemplate.f49172d);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49143a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivStrokeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivStrokeTemplate, DivStroke> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49144a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStroke resolve(ParsingContext parsingContext, DivStrokeTemplate divStrokeTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divStrokeTemplate.f49169a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivStrokeStyle divStrokeStyle = (DivStrokeStyle) JsonFieldResolver.resolveOptional(parsingContext, divStrokeTemplate.f49170b, jSONObject, "style", this.f49144a.K7(), this.f49144a.I7());
            if (divStrokeStyle == null) {
                divStrokeStyle = DivStrokeJsonParser.f49137b;
            }
            Field<Expression<DivSizeUnit>> field = divStrokeTemplate.f49171c;
            TypeHelper<DivSizeUnit> typeHelper = DivStrokeJsonParser.f49140e;
            bk.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivStrokeJsonParser.f49138c;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f27158n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = divStrokeTemplate.f49172d;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStrokeJsonParser.f49141f;
            Expression<Double> expression2 = DivStrokeJsonParser.f49139d;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "width", typeHelper2, lVar2, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            return new DivStroke(expressionResolveExpression, divStrokeStyle, expression, expression2);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49144a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 >= 0.0d;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f49138c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f49139d = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f49140e = TypeHelper.Companion.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivStrokeJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f49141f = new ValueValidator() { // from class: oe.v9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStrokeJsonParser.b(((Double) obj).doubleValue());
            }
        };
    }
}
