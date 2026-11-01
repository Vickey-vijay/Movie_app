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
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTimerJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50925a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50926b = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50927c = new ValueValidator() { // from class: oe.jb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.y4.c(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50928d = new ValueValidator() { // from class: oe.kb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.y4.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50929a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTimer deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = y4.f50927c;
            Expression<Long> expression = y4.f50926b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivTimer(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f50929a.u0()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tick_actions", this.f50929a.u0()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tick_interval", typeHelper, lVar, y4.f50928d), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTimer divTimer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divTimer.f49817a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divTimer.f49818b, this.f50929a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTimer.f49819c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tick_actions", divTimer.f49820d, this.f50929a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tick_interval", divTimer.f49821e);
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", divTimer.f49822f);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50929a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50930a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTimerTemplate deserialize(ParsingContext parsingContext, DivTimerTemplate divTimerTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divTimerTemplate != null ? divTimerTemplate.f49827a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivTimerTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, lVar, y4.f50927c), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f49828b : null, this.f50930a.v0()), (Field<String>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f49829c : null), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tick_actions", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f49830d : null, this.f50930a.v0()), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tick_interval", typeHelper, allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f49831e : null, lVar, y4.f50928d), (Field<String>) JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.f49832f : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTimerTemplate divTimerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divTimerTemplate.f49827a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divTimerTemplate.f49828b, this.f50930a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTimerTemplate.f49829c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tick_actions", divTimerTemplate.f49830d, this.f50930a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tick_interval", divTimerTemplate.f49831e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", divTimerTemplate.f49832f);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50930a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTimerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTimerTemplate, DivTimer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50931a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTimer resolve(ParsingContext parsingContext, DivTimerTemplate divTimerTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divTimerTemplate.f49827a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = y4.f50927c;
            Expression<Long> expression = y4.f50926b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTimer(expression, JsonFieldResolver.resolveOptionalList(parsingContext, divTimerTemplate.f49828b, jSONObject, "end_actions", this.f50931a.w0(), this.f50931a.u0()), (String) JsonFieldResolver.resolve(parsingContext, divTimerTemplate.f49829c, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, divTimerTemplate.f49830d, jSONObject, "tick_actions", this.f50931a.w0(), this.f50931a.u0()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divTimerTemplate.f49831e, jSONObject, "tick_interval", typeHelper, lVar, y4.f50928d), (String) JsonFieldResolver.resolveOptional(parsingContext, divTimerTemplate.f49832f, jSONObject, "value_variable"));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50931a = jsonParserComponent;
        }
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
