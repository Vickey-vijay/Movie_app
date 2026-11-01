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

/* JADX INFO: compiled from: DivFixedCountJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50638a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50639b = new ValueValidator() { // from class: oe.b4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.g1.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivFixedCountJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFixedCountJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50640a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedCount deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivFixedCount(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, g1.f50639b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedCount divFixedCount) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divFixedCount.f47151a);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50640a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFixedCountJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50641a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFixedCountTemplate divFixedCountTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divFixedCountTemplate.f47155a);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50641a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedCountTemplate deserialize(ParsingContext parsingContext, DivFixedCountTemplate divFixedCountTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            if (divFixedCountTemplate != null) {
                field = divFixedCountTemplate.f47155a;
            } else {
                field = null;
            }
            return new DivFixedCountTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT, g1.f50639b));
        }
    }

    /* JADX INFO: compiled from: DivFixedCountJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFixedCountTemplate, DivFixedCount> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50642a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFixedCount resolve(ParsingContext parsingContext, DivFixedCountTemplate divFixedCountTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivFixedCount(JsonFieldResolver.resolveExpression(parsingContext, divFixedCountTemplate.f47155a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, g1.f50639b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50642a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
