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

/* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50775a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50776b = new ValueValidator() { // from class: oe.k2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.n0.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50777a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCloudBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivCloudBackground(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n0.f50776b), (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f50777a.Y2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCloudBackground divCloudBackground) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divCloudBackground.f46610a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divCloudBackground.f46611b);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divCloudBackground.f46612c, this.f50777a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50777a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50778a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCloudBackgroundTemplate divCloudBackgroundTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divCloudBackgroundTemplate.f46616a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divCloudBackgroundTemplate.f46617b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divCloudBackgroundTemplate.f46618c, this.f50778a.Z2());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50778a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCloudBackgroundTemplate deserialize(ParsingContext parsingContext, DivCloudBackgroundTemplate divCloudBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field;
            Field<Expression<Long>> field2;
            Field<DivEdgeInsetsTemplate> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            if (divCloudBackgroundTemplate != null) {
                field = divCloudBackgroundTemplate.f46616a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            if (divCloudBackgroundTemplate != null) {
                field2 = divCloudBackgroundTemplate.f46617b;
            } else {
                field2 = null;
            }
            Field fieldWithExpression2 = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", typeHelper2, allowPropertyOverride, field2, ParsingConvertersKt.NUMBER_TO_INT, n0.f50776b);
            if (divCloudBackgroundTemplate != null) {
                field3 = divCloudBackgroundTemplate.f46618c;
            } else {
                field3 = null;
            }
            return new DivCloudBackgroundTemplate(fieldWithExpression, fieldWithExpression2, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, field3, this.f50778a.Z2()));
        }
    }

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCloudBackgroundTemplate, DivCloudBackground> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50779a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCloudBackground resolve(ParsingContext parsingContext, DivCloudBackgroundTemplate divCloudBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivCloudBackground(JsonFieldResolver.resolveExpression(parsingContext, divCloudBackgroundTemplate.f46616a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, divCloudBackgroundTemplate.f46617b, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n0.f50776b), (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCloudBackgroundTemplate.f46618c, jSONObject, "paddings", this.f50779a.a3(), this.f50779a.Y2()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50779a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
