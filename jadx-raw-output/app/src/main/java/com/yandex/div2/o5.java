package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

/* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50808a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50809b = new ValueValidator() { // from class: oe.xc
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.o5.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50810a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new OffsetDestination(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, o5.f50809b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, OffsetDestination offsetDestination) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.CycleType.S_WAVE_OFFSET);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", offsetDestination.f50485a);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50810a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50811a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, OffsetDestinationTemplate offsetDestinationTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.CycleType.S_WAVE_OFFSET);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", offsetDestinationTemplate.f50489a);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50811a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetDestinationTemplate deserialize(ParsingContext parsingContext, OffsetDestinationTemplate offsetDestinationTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            if (offsetDestinationTemplate != null) {
                field = offsetDestinationTemplate.f50489a;
            } else {
                field = null;
            }
            return new OffsetDestinationTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT, o5.f50809b));
        }
    }

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, OffsetDestinationTemplate, OffsetDestination> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50812a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetDestination resolve(ParsingContext parsingContext, OffsetDestinationTemplate offsetDestinationTemplate, JSONObject jSONObject) throws ParsingException {
            return new OffsetDestination(JsonFieldResolver.resolveExpression(parsingContext, offsetDestinationTemplate.f50489a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, o5.f50809b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50812a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
