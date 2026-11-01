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
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50847a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50848b = new ValueValidator() { // from class: oe.bb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r4.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50849a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeBorder deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivTextRangeBorder(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, r4.f50848b), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f50849a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBorder divTextRangeBorder) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divTextRangeBorder.f49630a);
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divTextRangeBorder.f49631b, this.f50849a.C7());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50849a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50850a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBorderTemplate divTextRangeBorderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divTextRangeBorderTemplate.f49635a);
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divTextRangeBorderTemplate.f49636b, this.f50850a.D7());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50850a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeBorderTemplate deserialize(ParsingContext parsingContext, DivTextRangeBorderTemplate divTextRangeBorderTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field;
            Field<DivStrokeTemplate> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            if (divTextRangeBorderTemplate != null) {
                field = divTextRangeBorderTemplate.f49635a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT, r4.f50848b);
            if (divTextRangeBorderTemplate != null) {
                field2 = divTextRangeBorderTemplate.f49636b;
            } else {
                field2 = null;
            }
            return new DivTextRangeBorderTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, field2, this.f50850a.D7()));
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeBorderTemplate, DivTextRangeBorder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50851a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeBorder resolve(ParsingContext parsingContext, DivTextRangeBorderTemplate divTextRangeBorderTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivTextRangeBorder(JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextRangeBorderTemplate.f49635a, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, r4.f50848b), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divTextRangeBorderTemplate.f49636b, jSONObject, VastAttributes.STROKE_COLOR, this.f50851a.E7(), this.f50851a.C7()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50851a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
