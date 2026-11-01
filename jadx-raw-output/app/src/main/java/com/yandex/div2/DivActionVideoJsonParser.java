package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionVideoJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46418a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivActionVideo.Action> f46419b = TypeHelper.Companion.from(nj.n.K(DivActionVideo.Action.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionVideoJsonParser$Companion$TYPE_HELPER_ACTION$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivActionVideo.Action);
        }
    });

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46420a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionVideo deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivActionVideo(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", DivActionVideoJsonParser.f46419b, DivActionVideo.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionVideo divActionVideo) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionVideo.f46414a, DivActionVideo.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionVideo.f46415b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46420a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46421a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionVideoTemplate divActionVideoTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", divActionVideoTemplate.f46425a, DivActionVideo.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionVideoTemplate.f46426b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46421a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionVideoTemplate deserialize(ParsingContext parsingContext, DivActionVideoTemplate divActionVideoTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivActionVideo.Action>> field;
            Field<Expression<String>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivActionVideo.Action> typeHelper = DivActionVideoJsonParser.f46419b;
            if (divActionVideoTemplate != null) {
                field = divActionVideoTemplate.f46425a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", typeHelper, allowPropertyOverride, field, DivActionVideo.Action.FROM_STRING);
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divActionVideoTemplate != null) {
                field2 = divActionVideoTemplate.f46426b;
            } else {
                field2 = null;
            }
            return new DivActionVideoTemplate(fieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", typeHelper2, allowPropertyOverride, field2));
        }
    }

    /* JADX INFO: compiled from: DivActionVideoJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionVideoTemplate, DivActionVideo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46422a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionVideo resolve(ParsingContext parsingContext, DivActionVideoTemplate divActionVideoTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivActionVideo(JsonFieldResolver.resolveExpression(parsingContext, divActionVideoTemplate.f46425a, jSONObject, "action", DivActionVideoJsonParser.f46419b, DivActionVideo.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, divActionVideoTemplate.f46426b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46422a = jsonParserComponent;
        }
    }
}
