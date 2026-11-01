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
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50946a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50949d;

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50950a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStretchIndicatorItemPlacement deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f50950a.w3());
            if (divFixedSize == null) {
                divFixedSize = z3.f50947b;
            }
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z3.f50949d;
            Expression<Long> expression = z3.f50948c;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_items", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divStretchIndicatorItemPlacement.f49117a, this.f50950a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_items", divStretchIndicatorItemPlacement.f49118b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50950a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50951a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", divStretchIndicatorItemPlacementTemplate.f49124a, this.f50951a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_items", divStretchIndicatorItemPlacementTemplate.f49125b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50951a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStretchIndicatorItemPlacementTemplate deserialize(ParsingContext parsingContext, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, JSONObject jSONObject) throws ParsingException {
            Field<DivFixedSizeTemplate> field;
            Field<Expression<Long>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divStretchIndicatorItemPlacementTemplate != null) {
                field = divStretchIndicatorItemPlacementTemplate.f49124a;
            } else {
                field = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, field, this.f50951a.x3());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            if (divStretchIndicatorItemPlacementTemplate != null) {
                field2 = divStretchIndicatorItemPlacementTemplate.f49125b;
            } else {
                field2 = null;
            }
            return new DivStretchIndicatorItemPlacementTemplate(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_items", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT, z3.f50949d));
        }
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivStretchIndicatorItemPlacementTemplate, DivStretchIndicatorItemPlacement> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50952a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStretchIndicatorItemPlacement resolve(ParsingContext parsingContext, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divStretchIndicatorItemPlacementTemplate.f49124a, jSONObject, "item_spacing", this.f50952a.y3(), this.f50952a.w3());
            if (divFixedSize == null) {
                divFixedSize = z3.f50947b;
            }
            Field<Expression<Long>> field = divStretchIndicatorItemPlacementTemplate.f49125b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z3.f50949d;
            Expression<Long> expression = z3.f50948c;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "max_visible_items", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50952a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 > 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50947b = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f50948c = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f50949d = new ValueValidator() { // from class: oe.u9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z3.b(((Long) obj).longValue());
            }
        };
    }
}
