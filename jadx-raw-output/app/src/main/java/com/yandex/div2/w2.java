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

/* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50887a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50888b = new ValueValidator() { // from class: oe.q7
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.w2.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50889a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPercentageSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivPercentageSize(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, w2.f50888b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPercentageSize divPercentageSize) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divPercentageSize.f48371a);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50889a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50890a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPercentageSizeTemplate divPercentageSizeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPercentageSizeTemplate.f48375a);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50890a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPercentageSizeTemplate deserialize(ParsingContext parsingContext, DivPercentageSizeTemplate divPercentageSizeTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (divPercentageSizeTemplate != null) {
                field = divPercentageSizeTemplate.f48375a;
            } else {
                field = null;
            }
            return new DivPercentageSizeTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE, w2.f50888b));
        }
    }

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPercentageSizeTemplate, DivPercentageSize> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50891a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPercentageSize resolve(ParsingContext parsingContext, DivPercentageSizeTemplate divPercentageSizeTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivPercentageSize(JsonFieldResolver.resolveExpression(parsingContext, divPercentageSizeTemplate.f48375a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, w2.f50888b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50891a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
