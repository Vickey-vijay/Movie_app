package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* JADX INFO: compiled from: DivAspectJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50580a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50581b = new ValueValidator() { // from class: oe.d2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.c0.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50582a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAspect deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivAspect(JsonExpressionParser.readExpression(parsingContext, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, c0.f50581b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAspect divAspect) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "ratio", divAspect.f46506a);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50582a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50583a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAspectTemplate divAspectTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "ratio", divAspectTemplate.f46510a);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50583a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAspectTemplate deserialize(ParsingContext parsingContext, DivAspectTemplate divAspectTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (divAspectTemplate != null) {
                field = divAspectTemplate.f46510a;
            } else {
                field = null;
            }
            return new DivAspectTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "ratio", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE, c0.f50581b));
        }
    }

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAspectTemplate, DivAspect> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50584a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAspect resolve(ParsingContext parsingContext, DivAspectTemplate divAspectTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivAspect(JsonFieldResolver.resolveExpression(parsingContext, divAspectTemplate.f46510a, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, c0.f50581b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50584a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
