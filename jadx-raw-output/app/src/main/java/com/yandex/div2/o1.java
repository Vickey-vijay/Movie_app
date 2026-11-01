package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50800a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<String> f50801b = new ValueValidator() { // from class: oe.k4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.o1.b((String) obj);
        }
    };

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50802a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFunction deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivFunction(JsonPropertyParser.readList(parsingContext, jSONObject, "arguments", this.f50802a.F3()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "body"), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name", o1.f50801b), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFunction divFunction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "arguments", divFunction.f47235a, this.f50802a.F3());
            JsonPropertyParser.write(parsingContext, jSONObject, "body", divFunction.f47236b);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", divFunction.f47237c);
            JsonPropertyParser.write(parsingContext, jSONObject, "return_type", divFunction.f47238d, (bk.l<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50802a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50803a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivFunctionTemplate divFunctionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "arguments", divFunctionTemplate.f47251a, this.f50803a.G3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "body", divFunctionTemplate.f47252b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", divFunctionTemplate.f47253c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "return_type", divFunctionTemplate.f47254d, DivEvaluableType.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50803a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFunctionTemplate deserialize(ParsingContext parsingContext, DivFunctionTemplate divFunctionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<List<DivFunctionArgumentTemplate>> field;
            Field<String> field2;
            Field<String> field3;
            Field<DivEvaluableType> field4;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divFunctionTemplate != null) {
                field = divFunctionTemplate.f47251a;
            } else {
                field = null;
            }
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "arguments", allowPropertyOverride, field, this.f50803a.G3());
            if (divFunctionTemplate != null) {
                field2 = divFunctionTemplate.f47252b;
            } else {
                field2 = null;
            }
            Field field5 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "body", allowPropertyOverride, field2);
            if (divFunctionTemplate != null) {
                field3 = divFunctionTemplate.f47253c;
            } else {
                field3 = null;
            }
            Field field6 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, field3, o1.f50801b);
            if (divFunctionTemplate != null) {
                field4 = divFunctionTemplate.f47254d;
            } else {
                field4 = null;
            }
            return new DivFunctionTemplate((Field<List<DivFunctionArgumentTemplate>>) listField, (Field<String>) field5, (Field<String>) field6, (Field<DivEvaluableType>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "return_type", allowPropertyOverride, field4, DivEvaluableType.FROM_STRING));
        }
    }

    /* JADX INFO: compiled from: DivFunctionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivFunctionTemplate, DivFunction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50804a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivFunction resolve(ParsingContext parsingContext, DivFunctionTemplate divFunctionTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivFunction(JsonFieldResolver.resolveList(parsingContext, divFunctionTemplate.f47251a, jSONObject, "arguments", this.f50804a.H3(), this.f50804a.F3()), (String) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.f47252b, jSONObject, "body"), (String) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.f47253c, jSONObject, "name", o1.f50801b), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.f47254d, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50804a = jsonParserComponent;
        }
    }

    public static final boolean b(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^[a-zA-Z_][a-zA-Z0-9_]*$");
    }
}
