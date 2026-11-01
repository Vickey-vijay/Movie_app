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

/* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50788a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50789b = new ValueValidator() { // from class: oe.kc
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.n5.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50790a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new IndexDestination(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n5.f50789b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, IndexDestination indexDestination) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "index");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", indexDestination.f50141a);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50790a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50791a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, IndexDestinationTemplate indexDestinationTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "index");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", indexDestinationTemplate.f50145a);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50791a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexDestinationTemplate deserialize(ParsingContext parsingContext, IndexDestinationTemplate indexDestinationTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            if (indexDestinationTemplate != null) {
                field = indexDestinationTemplate.f50145a;
            } else {
                field = null;
            }
            return new IndexDestinationTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT, n5.f50789b));
        }
    }

    /* JADX INFO: compiled from: IndexDestinationJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, IndexDestinationTemplate, IndexDestination> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50792a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndexDestination resolve(ParsingContext parsingContext, IndexDestinationTemplate indexDestinationTemplate, JSONObject jSONObject) throws ParsingException {
            return new IndexDestination(JsonFieldResolver.resolveExpression(parsingContext, indexDestinationTemplate.f50145a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n5.f50789b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50792a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
