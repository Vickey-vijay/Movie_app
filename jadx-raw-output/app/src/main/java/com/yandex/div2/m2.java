package com.yandex.div2;

import androidx.appcompat.widget.ActivityChooserModel;
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

/* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50748a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50749b = new ValueValidator() { // from class: oe.n6
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.m2.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50750a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivMatchParentSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivMatchParentSize((DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.f50750a.b7()), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.f50750a.b7()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, m2.f50749b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivMatchParentSize divMatchParentSize) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "max_size", divMatchParentSize.f48059a, this.f50750a.b7());
            JsonPropertyParser.write(parsingContext, jSONObject, "min_size", divMatchParentSize.f48060b, this.f50750a.b7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, divMatchParentSize.f48061c);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50750a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50751a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivMatchParentSizeTemplate divMatchParentSizeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", divMatchParentSizeTemplate.f48065a, this.f50751a.c7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", divMatchParentSizeTemplate.f48066b, this.f50751a.c7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, divMatchParentSizeTemplate.f48067c);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50751a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivMatchParentSizeTemplate deserialize(ParsingContext parsingContext, DivMatchParentSizeTemplate divMatchParentSizeTemplate, JSONObject jSONObject) throws ParsingException {
            Field<DivSizeUnitValueTemplate> field;
            Field<DivSizeUnitValueTemplate> field2;
            Field<Expression<Double>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divMatchParentSizeTemplate != null) {
                field = divMatchParentSizeTemplate.f48065a;
            } else {
                field = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, field, this.f50751a.c7());
            if (divMatchParentSizeTemplate != null) {
                field2 = divMatchParentSizeTemplate.f48066b;
            } else {
                field2 = null;
            }
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, field2, this.f50751a.c7());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (divMatchParentSizeTemplate != null) {
                field3 = divMatchParentSizeTemplate.f48067c;
            } else {
                field3 = null;
            }
            return new DivMatchParentSizeTemplate(optionalField, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, typeHelper, allowPropertyOverride, field3, ParsingConvertersKt.NUMBER_TO_DOUBLE, m2.f50749b));
        }
    }

    /* JADX INFO: compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivMatchParentSizeTemplate, DivMatchParentSize> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50752a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivMatchParentSize resolve(ParsingContext parsingContext, DivMatchParentSizeTemplate divMatchParentSizeTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivMatchParentSize((DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divMatchParentSizeTemplate.f48065a, jSONObject, "max_size", this.f50752a.d7(), this.f50752a.b7()), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divMatchParentSizeTemplate.f48066b, jSONObject, "min_size", this.f50752a.d7(), this.f50752a.b7()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divMatchParentSizeTemplate.f48067c, jSONObject, ActivityChooserModel.ATTRIBUTE_WEIGHT, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, m2.f50749b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50752a = jsonParserComponent;
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
