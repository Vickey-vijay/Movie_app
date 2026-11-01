package com.yandex.div2;

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
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50742a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50743b = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null), 1, null);

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50744a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCircleShape deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.f50744a.w3());
            if (divFixedSize == null) {
                divFixedSize = m0.f50743b;
            }
            return new DivCircleShape(optionalExpression, divFixedSize, (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f50744a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCircleShape divCircleShape) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", divCircleShape.f46598a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", divCircleShape.f46599b, this.f50744a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divCircleShape.f46600c, this.f50744a.C7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50744a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50745a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCircleShapeTemplate divCircleShapeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", divCircleShapeTemplate.f46605a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", divCircleShapeTemplate.f46606b, this.f50745a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divCircleShapeTemplate.f46607c, this.f50745a.D7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50745a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCircleShapeTemplate deserialize(ParsingContext parsingContext, DivCircleShapeTemplate divCircleShapeTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field;
            Field<DivFixedSizeTemplate> field2;
            Field<DivStrokeTemplate> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            if (divCircleShapeTemplate != null) {
                field = divCircleShapeTemplate.f46605a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT);
            if (divCircleShapeTemplate != null) {
                field2 = divCircleShapeTemplate.f46606b;
            } else {
                field2 = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, field2, this.f50745a.x3());
            if (divCircleShapeTemplate != null) {
                field3 = divCircleShapeTemplate.f46607c;
            } else {
                field3 = null;
            }
            return new DivCircleShapeTemplate(optionalFieldWithExpression, optionalField, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, field3, this.f50745a.D7()));
        }
    }

    /* JADX INFO: compiled from: DivCircleShapeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCircleShapeTemplate, DivCircleShape> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50746a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCircleShape resolve(ParsingContext parsingContext, DivCircleShapeTemplate divCircleShapeTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCircleShapeTemplate.f46605a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divCircleShapeTemplate.f46606b, jSONObject, "radius", this.f50746a.y3(), this.f50746a.w3());
            if (divFixedSize == null) {
                divFixedSize = m0.f50743b;
            }
            return new DivCircleShape(expressionResolveOptionalExpression, divFixedSize, (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divCircleShapeTemplate.f46607c, jSONObject, VastAttributes.STROKE_COLOR, this.f50746a.E7(), this.f50746a.C7()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50746a = jsonParserComponent;
        }
    }
}
