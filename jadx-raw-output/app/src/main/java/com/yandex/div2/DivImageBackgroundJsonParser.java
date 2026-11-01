package com.yandex.div2;

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
import com.yandex.div2.DivImageBackgroundJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivImageBackgroundJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47594a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentHorizontal> f47596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentVertical> f47597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivImageScale> f47599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivImageScale> f47602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47603j;

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47604a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageBackgroundJsonParser.f47603j;
            Expression<Double> expression = DivImageBackgroundJsonParser.f47595b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivAlignmentHorizontal> typeHelper2 = DivImageBackgroundJsonParser.f47600g;
            bk.l<String, DivAlignmentHorizontal> lVar2 = DivAlignmentHorizontal.FROM_STRING;
            Expression<DivAlignmentHorizontal> expression2 = DivImageBackgroundJsonParser.f47596c;
            Expression<DivAlignmentHorizontal> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper2, lVar2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<DivAlignmentVertical> typeHelper3 = DivImageBackgroundJsonParser.f47601h;
            bk.l<String, DivAlignmentVertical> lVar3 = DivAlignmentVertical.FROM_STRING;
            Expression<DivAlignmentVertical> expression3 = DivImageBackgroundJsonParser.f47597d;
            Expression<DivAlignmentVertical> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper3, lVar3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f47604a.h3());
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = DivImageBackgroundJsonParser.f47598e;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, lVar4, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            TypeHelper<DivImageScale> typeHelper5 = DivImageBackgroundJsonParser.f47602i;
            bk.l<String, DivImageScale> lVar5 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression6 = DivImageBackgroundJsonParser.f47599f;
            Expression<DivImageScale> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, lVar5, expression6);
            return new DivImageBackground(expression, expression2, expression3, optionalList, expression4, expression5, optionalExpression5 == null ? expression6 : optionalExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivImageBackground divImageBackground) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divImageBackground.f47586a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divImageBackground.f47587b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divImageBackground.f47588c, DivAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divImageBackground.f47589d, this.f47604a.h3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divImageBackground.f47590e, ParsingConvertersKt.URI_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divImageBackground.f47591f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divImageBackground.f47592g, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47604a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47605a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageBackgroundTemplate deserialize(ParsingContext parsingContext, DivImageBackgroundTemplate divImageBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivImageBackgroundTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47614a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivImageBackgroundJsonParser.f47603j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivImageBackgroundJsonParser.f47600g, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47615b : null, DivAlignmentHorizontal.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivImageBackgroundJsonParser.f47601h, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47616c : null, DivAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47617d : null, this.f47605a.i3()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47618e : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47619f : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivImageBackgroundJsonParser.f47602i, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f47620g : null, DivImageScale.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivImageBackgroundTemplate divImageBackgroundTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divImageBackgroundTemplate.f47614a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divImageBackgroundTemplate.f47615b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divImageBackgroundTemplate.f47616c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divImageBackgroundTemplate.f47617d, this.f47605a.i3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divImageBackgroundTemplate.f47618e, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divImageBackgroundTemplate.f47619f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divImageBackgroundTemplate.f47620g, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47605a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivImageBackgroundTemplate, DivImageBackground> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47606a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageBackground resolve(ParsingContext parsingContext, DivImageBackgroundTemplate divImageBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = divImageBackgroundTemplate.f47614a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageBackgroundJsonParser.f47603j;
            Expression<Double> expression = DivImageBackgroundJsonParser.f47595b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivAlignmentHorizontal>> field2 = divImageBackgroundTemplate.f47615b;
            TypeHelper<DivAlignmentHorizontal> typeHelper2 = DivImageBackgroundJsonParser.f47600g;
            bk.l<String, DivAlignmentHorizontal> lVar2 = DivAlignmentHorizontal.FROM_STRING;
            Expression<DivAlignmentHorizontal> expression2 = DivImageBackgroundJsonParser.f47596c;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "content_alignment_horizontal", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<DivAlignmentVertical>> field3 = divImageBackgroundTemplate.f47616c;
            TypeHelper<DivAlignmentVertical> typeHelper3 = DivImageBackgroundJsonParser.f47601h;
            bk.l<String, DivAlignmentVertical> lVar3 = DivAlignmentVertical.FROM_STRING;
            Expression<DivAlignmentVertical> expression3 = DivImageBackgroundJsonParser.f47597d;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "content_alignment_vertical", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divImageBackgroundTemplate.f47617d, jSONObject, "filters", this.f47606a.j3(), this.f47606a.h3());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divImageBackgroundTemplate.f47618e, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Field<Expression<Boolean>> field4 = divImageBackgroundTemplate.f47619f;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression4 = DivImageBackgroundJsonParser.f47598e;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "preload_required", typeHelper4, lVar4, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<DivImageScale>> field5 = divImageBackgroundTemplate.f47620g;
            TypeHelper<DivImageScale> typeHelper5 = DivImageBackgroundJsonParser.f47602i;
            bk.l<String, DivImageScale> lVar5 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression5 = DivImageBackgroundJsonParser.f47599f;
            Expression<DivImageScale> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper5, lVar5, expression5);
            if (expressionResolveOptionalExpression5 == null) {
                expressionResolveOptionalExpression5 = expression5;
            }
            return new DivImageBackground(expression, expression2, expression3, listResolveOptionalList, expressionResolveExpression, expression4, expressionResolveOptionalExpression5);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47606a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47595b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        f47596c = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f47597d = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f47598e = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        f47599f = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f47600g = companion2.from(divAlignmentHorizontal, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47601h = companion2.from(divAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47602i = companion2.from(divImageScale, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        f47603j = new ValueValidator() { // from class: oe.c5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageBackgroundJsonParser.b(((Double) obj).doubleValue());
            }
        };
    }
}
