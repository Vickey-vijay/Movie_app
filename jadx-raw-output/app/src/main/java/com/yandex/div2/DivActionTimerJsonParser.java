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

/* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionTimerJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46345a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivActionTimer.Action> f46346b = TypeHelper.Companion.from(nj.n.K(DivActionTimer.Action.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionTimerJsonParser$Companion$TYPE_HELPER_ACTION$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivActionTimer.Action);
        }
    });

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46347a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTimer deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivActionTimer(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", DivActionTimerJsonParser.f46346b, DivActionTimer.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionTimer divActionTimer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionTimer.f46341a, DivActionTimer.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionTimer.f46342b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46347a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46348a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionTimerTemplate divActionTimerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", divActionTimerTemplate.f46352a, DivActionTimer.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionTimerTemplate.f46353b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46348a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTimerTemplate deserialize(ParsingContext parsingContext, DivActionTimerTemplate divActionTimerTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivActionTimer.Action>> field;
            Field<Expression<String>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivActionTimer.Action> typeHelper = DivActionTimerJsonParser.f46346b;
            if (divActionTimerTemplate != null) {
                field = divActionTimerTemplate.f46352a;
            } else {
                field = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", typeHelper, allowPropertyOverride, field, DivActionTimer.Action.FROM_STRING);
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            if (divActionTimerTemplate != null) {
                field2 = divActionTimerTemplate.f46353b;
            } else {
                field2 = null;
            }
            return new DivActionTimerTemplate(fieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", typeHelper2, allowPropertyOverride, field2));
        }
    }

    /* JADX INFO: compiled from: DivActionTimerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionTimerTemplate, DivActionTimer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46349a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTimer resolve(ParsingContext parsingContext, DivActionTimerTemplate divActionTimerTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivActionTimer(JsonFieldResolver.resolveExpression(parsingContext, divActionTimerTemplate.f46352a, jSONObject, "action", DivActionTimerJsonParser.f46346b, DivActionTimer.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, divActionTimerTemplate.f46353b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46349a = jsonParserComponent;
        }
    }
}
