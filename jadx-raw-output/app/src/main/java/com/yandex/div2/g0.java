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

/* JADX INFO: compiled from: DivBlurJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50633a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50634b = new ValueValidator() { // from class: oe.f2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.g0.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50635a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBlur deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivBlur(JsonExpressionParser.readExpression(parsingContext, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, g0.f50634b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivBlur divBlur) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "radius", divBlur.f46529a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50635a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50636a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivBlurTemplate divBlurTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "radius", divBlurTemplate.f46533a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50636a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBlurTemplate deserialize(ParsingContext parsingContext, DivBlurTemplate divBlurTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            if (divBlurTemplate != null) {
                field = divBlurTemplate.f46533a;
            } else {
                field = null;
            }
            return new DivBlurTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "radius", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_INT, g0.f50634b));
        }
    }

    /* JADX INFO: compiled from: DivBlurJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivBlurTemplate, DivBlur> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50637a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBlur resolve(ParsingContext parsingContext, DivBlurTemplate divBlurTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivBlur(JsonFieldResolver.resolveExpression(parsingContext, divBlurTemplate.f46533a, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, g0.f50634b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50637a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
