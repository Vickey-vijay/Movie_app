package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50687a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50690d;

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50691a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRoundedRectangleShape deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corner_radius", this.f50691a.w3());
            if (divFixedSize == null) {
                divFixedSize = i3.f50688b;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_height", this.f50691a.w3());
            if (divFixedSize3 == null) {
                divFixedSize3 = i3.f50689c;
            }
            DivFixedSize divFixedSize4 = divFixedSize3;
            DivFixedSize divFixedSize5 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_width", this.f50691a.w3());
            if (divFixedSize5 == null) {
                divFixedSize5 = i3.f50690d;
            }
            return new DivRoundedRectangleShape(optionalExpression, divFixedSize2, divFixedSize4, divFixedSize5, (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f50691a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRoundedRectangleShape divRoundedRectangleShape) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", divRoundedRectangleShape.f48515a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "corner_radius", divRoundedRectangleShape.f48516b, this.f50691a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_height", divRoundedRectangleShape.f48517c, this.f50691a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_width", divRoundedRectangleShape.f48518d, this.f50691a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divRoundedRectangleShape.f48519e, this.f50691a.C7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50691a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50692a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRoundedRectangleShapeTemplate deserialize(ParsingContext parsingContext, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivRoundedRectangleShapeTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f48526a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f48527b : null, this.f50692a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_height", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f48528c : null, this.f50692a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_width", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f48529d : null, this.f50692a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.f48530e : null, this.f50692a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", divRoundedRectangleShapeTemplate.f48526a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corner_radius", divRoundedRectangleShapeTemplate.f48527b, this.f50692a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_height", divRoundedRectangleShapeTemplate.f48528c, this.f50692a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_width", divRoundedRectangleShapeTemplate.f48529d, this.f50692a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divRoundedRectangleShapeTemplate.f48530e, this.f50692a.D7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50692a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRoundedRectangleShapeTemplate, DivRoundedRectangleShape> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50693a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRoundedRectangleShape resolve(ParsingContext parsingContext, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divRoundedRectangleShapeTemplate.f48526a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f48527b, jSONObject, "corner_radius", this.f50693a.y3(), this.f50693a.w3());
            if (divFixedSize == null) {
                divFixedSize = i3.f50688b;
            }
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f48528c, jSONObject, "item_height", this.f50693a.y3(), this.f50693a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = i3.f50689c;
            }
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f48529d, jSONObject, "item_width", this.f50693a.y3(), this.f50693a.w3());
            if (divFixedSize3 == null) {
                divFixedSize3 = i3.f50690d;
            }
            return new DivRoundedRectangleShape(expressionResolveOptionalExpression, divFixedSize, divFixedSize2, divFixedSize3, (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.f48530e, jSONObject, VastAttributes.STROKE_COLOR, this.f50693a.E7(), this.f50693a.C7()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50693a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50688b = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f50689c = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f50690d = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
    }
}
