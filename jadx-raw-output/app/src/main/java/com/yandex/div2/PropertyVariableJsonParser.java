package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PropertyVariableJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50499a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f50500b = "new_value";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivEvaluableType> f50501c = TypeHelper.Companion.from(nj.n.K(DivEvaluableType.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.PropertyVariableJsonParser$Companion$TYPE_HELPER_VALUE_TYPE$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivEvaluableType);
        }
    });

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50502a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PropertyVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "name");
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = PropertyVariableJsonParser.f50500b;
            }
            return new PropertyVariable(expression, str, str2, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "set", this.f50502a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value_type", PropertyVariableJsonParser.f50501c, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, PropertyVariable propertyVariable) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "get", propertyVariable.f50493a);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", propertyVariable.f50494b);
            JsonPropertyParser.write(parsingContext, jSONObject, "new_value_variable_name", propertyVariable.f50495c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "set", propertyVariable.f50496d, this.f50502a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value_type", propertyVariable.f50497e, DivEvaluableType.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50502a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50503a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PropertyVariableTemplate deserialize(ParsingContext parsingContext, PropertyVariableTemplate propertyVariableTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new PropertyVariableTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f50508a : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f50509b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "new_value_variable_name", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f50510c : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "set", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f50511d : null, this.f50503a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value_type", PropertyVariableJsonParser.f50501c, allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.f50512e : null, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, PropertyVariableTemplate propertyVariableTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "get", propertyVariableTemplate.f50508a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", propertyVariableTemplate.f50509b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "new_value_variable_name", propertyVariableTemplate.f50510c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "set", propertyVariableTemplate.f50511d, this.f50503a.v0());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value_type", propertyVariableTemplate.f50512e, DivEvaluableType.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50503a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: PropertyVariableJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, PropertyVariableTemplate, PropertyVariable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50504a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PropertyVariable resolve(ParsingContext parsingContext, PropertyVariableTemplate propertyVariableTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, propertyVariableTemplate.f50508a, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonFieldResolver.resolve(parsingContext, propertyVariableTemplate.f50509b, jSONObject, "name");
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, propertyVariableTemplate.f50510c, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = PropertyVariableJsonParser.f50500b;
            }
            return new PropertyVariable(expressionResolveExpression, str, str2, JsonFieldResolver.resolveOptionalList(parsingContext, propertyVariableTemplate.f50511d, jSONObject, "set", this.f50504a.w0(), this.f50504a.u0()), JsonFieldResolver.resolveExpression(parsingContext, propertyVariableTemplate.f50512e, jSONObject, "value_type", PropertyVariableJsonParser.f50501c, DivEvaluableType.FROM_STRING));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50504a = jsonParserComponent;
        }
    }
}
