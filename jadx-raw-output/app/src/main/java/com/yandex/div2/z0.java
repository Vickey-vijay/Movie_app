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

/* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50933a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f50937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50940h;

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50941a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDisappearAction deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z0.f50938f;
            Expression<Long> expression = z0.f50934b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "disappear_duration", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.f50941a.S2());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = z0.f50935c;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, lVar2, expression2);
            Expression<Boolean> expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator<Long> valueValidator2 = z0.f50939g;
            Expression<Long> expression5 = z0.f50936d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_limit", typeHelper, lVar, valueValidator2, expression5);
            if (optionalExpression3 != null) {
                expression5 = optionalExpression3;
            }
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload");
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            bk.l<Object, Uri> lVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper3, lVar3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.f50941a.h1());
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper3, lVar3);
            ValueValidator<Long> valueValidator3 = z0.f50940h;
            Expression<Long> expression6 = z0.f50937e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_percentage", typeHelper, lVar, valueValidator3, expression6);
            if (optionalExpression6 != null) {
                expression6 = optionalExpression6;
            }
            return new DivDisappearAction(expression, divDownloadCallbacks, expression3, expression4, expression5, jSONObject2, optionalExpression4, str, divActionTyped, optionalExpression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDisappearAction divDisappearAction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "disappear_duration", divDisappearAction.f47002a);
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divDisappearAction.a(), this.f50941a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divDisappearAction.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divDisappearAction.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", divDisappearAction.c());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divDisappearAction.getPayload());
            Expression<Uri> expressionF = divDisappearAction.f();
            bk.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expressionF, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divDisappearAction.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divDisappearAction.d(), this.f50941a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divDisappearAction.getUrl(), lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", divDisappearAction.f47012k);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50941a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50942a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDisappearActionTemplate deserialize(ParsingContext parsingContext, DivDisappearActionTemplate divDisappearActionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divDisappearActionTemplate != null ? divDisappearActionTemplate.f47020a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "disappear_duration", typeHelper, allowPropertyOverride, field, lVar, z0.f50938f);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47021b : null, this.f50942a.T2());
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47022c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47023d : null);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47024e : null, lVar, z0.f50939g);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47025f : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field2 = divDisappearActionTemplate != null ? divDisappearActionTemplate.f47026g : null;
            bk.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivDisappearActionTemplate(optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, fieldWithExpression, optionalFieldWithExpression3, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, lVar2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47027h : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47028i : null, this.f50942a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47029j : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.f47030k : null, lVar, z0.f50940h));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDisappearActionTemplate divDisappearActionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "disappear_duration", divDisappearActionTemplate.f47020a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divDisappearActionTemplate.f47021b, this.f50942a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divDisappearActionTemplate.f47022c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divDisappearActionTemplate.f47023d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", divDisappearActionTemplate.f47024e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divDisappearActionTemplate.f47025f);
            Field<Expression<Uri>> field = divDisappearActionTemplate.f47026g;
            bk.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divDisappearActionTemplate.f47027h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divDisappearActionTemplate.f47028i, this.f50942a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divDisappearActionTemplate.f47029j, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", divDisappearActionTemplate.f47030k);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50942a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivDisappearActionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDisappearActionTemplate, DivDisappearAction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50943a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDisappearAction resolve(ParsingContext parsingContext, DivDisappearActionTemplate divDisappearActionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divDisappearActionTemplate.f47020a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = z0.f50938f;
            Expression<Long> expression = z0.f50934b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "disappear_duration", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f47021b, jSONObject, "download_callbacks", this.f50943a.U2(), this.f50943a.S2());
            Field<Expression<Boolean>> field2 = divDisappearActionTemplate.f47022c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = z0.f50935c;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_enabled", typeHelper2, lVar2, expression2);
            Expression<Boolean> expression3 = expressionResolveOptionalExpression2 == null ? expression2 : expressionResolveOptionalExpression2;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divDisappearActionTemplate.f47023d, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field3 = divDisappearActionTemplate.f47024e;
            ValueValidator<Long> valueValidator2 = z0.f50939g;
            Expression<Long> expression4 = z0.f50936d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "log_limit", typeHelper, lVar, valueValidator2, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f47025f, jSONObject, "payload");
            Field<Expression<Uri>> field4 = divDisappearActionTemplate.f47026g;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            bk.l<Object, Uri> lVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "referer", typeHelper3, lVar3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f47027h, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.f47028i, jSONObject, "typed", this.f50943a.j1(), this.f50943a.h1());
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divDisappearActionTemplate.f47029j, jSONObject, "url", typeHelper3, lVar3);
            Field<Expression<Long>> field5 = divDisappearActionTemplate.f47030k;
            ValueValidator<Long> valueValidator3 = z0.f50940h;
            Expression<Long> expression5 = z0.f50937e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility_percentage", typeHelper, lVar, valueValidator3, expression5);
            return new DivDisappearAction(expression, divDownloadCallbacks, expression3, expressionResolveExpression, expression4, jSONObject2, expressionResolveOptionalExpression4, str, divActionTyped, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50943a = jsonParserComponent;
        }
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0 && j10 < 100;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50934b = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f50935c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f50936d = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f50937e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f50938f = new ValueValidator() { // from class: oe.g3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z0.d(((Long) obj).longValue());
            }
        };
        f50939g = new ValueValidator() { // from class: oe.h3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z0.e(((Long) obj).longValue());
            }
        };
        f50940h = new ValueValidator() { // from class: oe.i3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.z0.f(((Long) obj).longValue());
            }
        };
    }
}
