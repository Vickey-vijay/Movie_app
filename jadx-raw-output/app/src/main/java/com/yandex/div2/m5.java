package com.yandex.div2;

import android.net.Uri;
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

/* JADX INFO: compiled from: DivVisibilityActionJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50763a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50770h;

    /* JADX INFO: compiled from: DivVisibilityActionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivVisibilityActionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50771a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVisibilityAction deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.f50771a.S2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = m5.f50764b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = optionalExpression == null ? expression : optionalExpression;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = m5.f50768f;
            Expression<Long> expression4 = m5.f50765c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_limit", typeHelper2, lVar2, valueValidator, expression4);
            if (optionalExpression2 != null) {
                expression4 = optionalExpression2;
            }
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload");
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            bk.l<Object, Uri> lVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.f50771a.h1());
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper3, lVar3);
            ValueValidator<Long> valueValidator2 = m5.f50769g;
            Expression<Long> expression5 = m5.f50766d;
            Expression<Long> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_duration", typeHelper2, lVar2, valueValidator2, expression5);
            if (optionalExpression5 != null) {
                expression5 = optionalExpression5;
            }
            ValueValidator<Long> valueValidator3 = m5.f50770h;
            Expression<Long> expression6 = m5.f50767e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_percentage", typeHelper2, lVar2, valueValidator3, expression6);
            if (optionalExpression6 != null) {
                expression6 = optionalExpression6;
            }
            return new DivVisibilityAction(divDownloadCallbacks, expression2, expression3, expression4, jSONObject2, optionalExpression3, str, divActionTyped, optionalExpression4, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivVisibilityAction divVisibilityAction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divVisibilityAction.a(), this.f50771a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divVisibilityAction.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divVisibilityAction.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", divVisibilityAction.c());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divVisibilityAction.getPayload());
            Expression<Uri> expressionF = divVisibilityAction.f();
            bk.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expressionF, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divVisibilityAction.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divVisibilityAction.d(), this.f50771a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divVisibilityAction.getUrl(), lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_duration", divVisibilityAction.f50103j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", divVisibilityAction.f50104k);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50771a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivVisibilityActionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50772a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVisibilityActionTemplate deserialize(ParsingContext parsingContext, DivVisibilityActionTemplate divVisibilityActionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50112a : null, this.f50772a.T2());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50113b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50114c : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50115d : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, field, lVar, m5.f50768f);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50116e : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field2 = divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50117f : null;
            bk.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivVisibilityActionTemplate(optionalField, optionalFieldWithExpression, fieldWithExpression, optionalFieldWithExpression2, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50118g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50119h : null, this.f50772a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50120i : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_duration", typeHelper, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50121j : null, lVar, m5.f50769g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.f50122k : null, lVar, m5.f50770h));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivVisibilityActionTemplate divVisibilityActionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divVisibilityActionTemplate.f50112a, this.f50772a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divVisibilityActionTemplate.f50113b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divVisibilityActionTemplate.f50114c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", divVisibilityActionTemplate.f50115d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divVisibilityActionTemplate.f50116e);
            Field<Expression<Uri>> field = divVisibilityActionTemplate.f50117f;
            bk.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divVisibilityActionTemplate.f50118g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divVisibilityActionTemplate.f50119h, this.f50772a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divVisibilityActionTemplate.f50120i, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_duration", divVisibilityActionTemplate.f50121j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", divVisibilityActionTemplate.f50122k);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50772a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivVisibilityActionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivVisibilityActionTemplate, DivVisibilityAction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50773a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVisibilityAction resolve(ParsingContext parsingContext, DivVisibilityActionTemplate divVisibilityActionTemplate, JSONObject jSONObject) throws ParsingException {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.f50112a, jSONObject, "download_callbacks", this.f50773a.U2(), this.f50773a.S2());
            Field<Expression<Boolean>> field = divVisibilityActionTemplate.f50113b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = m5.f50764b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divVisibilityActionTemplate.f50114c, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field2 = divVisibilityActionTemplate.f50115d;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = m5.f50768f;
            Expression<Long> expression3 = m5.f50765c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "log_limit", typeHelper2, lVar2, valueValidator, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.f50116e, jSONObject, "payload");
            Field<Expression<Uri>> field3 = divVisibilityActionTemplate.f50117f;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            bk.l<Object, Uri> lVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "referer", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.f50118g, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.f50119h, jSONObject, "typed", this.f50773a.j1(), this.f50773a.h1());
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVisibilityActionTemplate.f50120i, jSONObject, "url", typeHelper3, lVar3);
            Field<Expression<Long>> field4 = divVisibilityActionTemplate.f50121j;
            ValueValidator<Long> valueValidator2 = m5.f50769g;
            Expression<Long> expression4 = m5.f50766d;
            Expression<Long> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility_duration", typeHelper2, lVar2, valueValidator2, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Field<Expression<Long>> field5 = divVisibilityActionTemplate.f50122k;
            ValueValidator<Long> valueValidator3 = m5.f50770h;
            Expression<Long> expression5 = m5.f50767e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility_percentage", typeHelper2, lVar2, valueValidator3, expression5);
            return new DivVisibilityAction(divDownloadCallbacks, expression2, expressionResolveExpression, expression3, jSONObject2, expressionResolveOptionalExpression3, str, divActionTyped, expressionResolveOptionalExpression4, expression4, expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50773a = jsonParserComponent;
        }
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 > 0 && j10 <= 100;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50764b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f50765c = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f50766d = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f50767e = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f50768f = new ValueValidator() { // from class: oe.bc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m5.d(((Long) obj).longValue());
            }
        };
        f50769g = new ValueValidator() { // from class: oe.cc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m5.e(((Long) obj).longValue());
            }
        };
        f50770h = new ValueValidator() { // from class: oe.dc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.m5.f(((Long) obj).longValue());
            }
        };
    }
}
