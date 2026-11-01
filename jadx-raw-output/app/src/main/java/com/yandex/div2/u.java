package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
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

/* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50868a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<String> f50869b = new ValueValidator() { // from class: oe.y1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.u.b((String) obj);
        }
    };

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50870a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionUpdateStructure deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructure(JsonExpressionParser.readExpression(parsingContext, jSONObject, "path", typeHelper, u.f50869b), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f50870a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionUpdateStructure divActionUpdateStructure) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "path", divActionUpdateStructure.f46403a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionUpdateStructure.f46404b, this.f50870a.h9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionUpdateStructure.f46405c);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50870a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50871a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "path", divActionUpdateStructureTemplate.f46409a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionUpdateStructureTemplate.f46410b, this.f50871a.i9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionUpdateStructureTemplate.f46411c);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50871a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionUpdateStructureTemplate deserialize(ParsingContext parsingContext, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field;
            Field<DivTypedValueTemplate> field2;
            Field<Expression<String>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divActionUpdateStructureTemplate != null) {
                field = divActionUpdateStructureTemplate.f46409a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "path", typeHelper, allowPropertyOverride, field, u.f50869b);
            if (divActionUpdateStructureTemplate != null) {
                field2 = divActionUpdateStructureTemplate.f46410b;
            } else {
                field2 = null;
            }
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, field2, this.f50871a.i9());
            if (divActionUpdateStructureTemplate != null) {
                field3 = divActionUpdateStructureTemplate.f46411c;
            } else {
                field3 = null;
            }
            return new DivActionUpdateStructureTemplate(fieldWithExpression, field4, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, field3));
        }
    }

    /* JADX INFO: compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionUpdateStructureTemplate, DivActionUpdateStructure> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50872a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionUpdateStructure resolve(ParsingContext parsingContext, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = divActionUpdateStructureTemplate.f46409a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructure(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "path", typeHelper, u.f50869b), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionUpdateStructureTemplate.f46410b, jSONObject, "value", this.f50872a.j9(), this.f50872a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionUpdateStructureTemplate.f46411c, jSONObject, "variable_name", typeHelper));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50872a = jsonParserComponent;
        }
    }

    public static final boolean b(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^(?!/)(.+)(?<!/)$");
    }
}
