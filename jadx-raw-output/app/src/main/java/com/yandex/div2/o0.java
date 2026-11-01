package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50794a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f50795b = "it";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivCollectionItemBuilder.Prototype> f50796c = new ListValidator() { // from class: oe.l2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.o0.b(list);
        }
    };

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50797a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "data_element_name");
            if (str == null) {
                str = o0.f50795b;
            }
            return new DivCollectionItemBuilder(expression, str, JsonPropertyParser.readList(parsingContext, jSONObject, "prototypes", this.f50797a.g2(), o0.f50796c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilder divCollectionItemBuilder) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "data", divCollectionItemBuilder.f46622a);
            JsonPropertyParser.write(parsingContext, jSONObject, "data_element_name", divCollectionItemBuilder.f46623b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "prototypes", divCollectionItemBuilder.f46624c, this.f50797a.g2());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50797a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50798a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "data", divCollectionItemBuilderTemplate.f46636a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "data_element_name", divCollectionItemBuilderTemplate.f46637b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "prototypes", divCollectionItemBuilderTemplate.f46638c, this.f50798a.h2());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50798a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilderTemplate deserialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<JSONArray>> field;
            Field<String> field2;
            Field<List<DivCollectionItemBuilderTemplate.PrototypeTemplate>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<JSONArray> typeHelper = TypeHelpersKt.TYPE_HELPER_JSON_ARRAY;
            if (divCollectionItemBuilderTemplate != null) {
                field = divCollectionItemBuilderTemplate.f46636a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "data", typeHelper, allowPropertyOverride, field);
            if (divCollectionItemBuilderTemplate != null) {
                field2 = divCollectionItemBuilderTemplate.f46637b;
            } else {
                field2 = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "data_element_name", allowPropertyOverride, field2);
            if (divCollectionItemBuilderTemplate != null) {
                field3 = divCollectionItemBuilderTemplate.f46638c;
            } else {
                field3 = null;
            }
            mj.g<p0.c> gVarH2 = this.f50798a.h2();
            ListValidator<DivCollectionItemBuilder.Prototype> listValidator = o0.f50796c;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivCollectionItemBuilderTemplate(fieldWithExpression, optionalField, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "prototypes", allowPropertyOverride, field3, gVarH2, listValidator));
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCollectionItemBuilderTemplate, DivCollectionItemBuilder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50799a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder resolve(ParsingContext parsingContext, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divCollectionItemBuilderTemplate.f46636a, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divCollectionItemBuilderTemplate.f46637b, jSONObject, "data_element_name");
            if (str == null) {
                str = o0.f50795b;
            }
            return new DivCollectionItemBuilder(expressionResolveExpression, str, JsonFieldResolver.resolveList(parsingContext, divCollectionItemBuilderTemplate.f46638c, jSONObject, "prototypes", this.f50799a.i2(), this.f50799a.g2(), o0.f50796c));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50799a = jsonParserComponent;
        }
    }

    public static final boolean b(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
