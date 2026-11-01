package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionSubmitRequestJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46298a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivActionSubmit.Request.Method> f46299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivActionSubmit.Request.Method> f46300c;

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46301a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSubmit.Request deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "headers", this.f46301a.Y0());
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = DivActionSubmitRequestJsonParser.f46300c;
            bk.l<String, DivActionSubmit.Request.Method> lVar = DivActionSubmit.Request.Method.FROM_STRING;
            Expression<DivActionSubmit.Request.Method> expression = DivActionSubmitRequestJsonParser.f46299b;
            Expression<DivActionSubmit.Request.Method> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "method", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivActionSubmit.Request(optionalList, expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionSubmit.Request request) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "headers", request.f46288a, this.f46301a.Y0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "method", request.f46289b, DivActionSubmit.Request.Method.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", request.f46290c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46301a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46302a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate requestTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "headers", requestTemplate.f46313a, this.f46302a.Z0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "method", requestTemplate.f46314b, DivActionSubmit.Request.Method.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", requestTemplate.f46315c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46302a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSubmitTemplate.RequestTemplate deserialize(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate requestTemplate, JSONObject jSONObject) throws ParsingException {
            Field<List<DivActionSubmitTemplate.RequestTemplate.HeaderTemplate>> field;
            Field<Expression<DivActionSubmit.Request.Method>> field2;
            Field<Expression<Uri>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (requestTemplate != null) {
                field = requestTemplate.f46313a;
            } else {
                field = null;
            }
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "headers", allowPropertyOverride, field, this.f46302a.Z0());
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = DivActionSubmitRequestJsonParser.f46300c;
            if (requestTemplate != null) {
                field2 = requestTemplate.f46314b;
            } else {
                field2 = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "method", typeHelper, allowPropertyOverride, field2, DivActionSubmit.Request.Method.FROM_STRING);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            if (requestTemplate != null) {
                field3 = requestTemplate.f46315c;
            } else {
                field3 = null;
            }
            return new DivActionSubmitTemplate.RequestTemplate(optionalListField, optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, field3, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    /* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionSubmitTemplate.RequestTemplate, DivActionSubmit.Request> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46303a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionSubmit.Request resolve(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate requestTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, requestTemplate.f46313a, jSONObject, "headers", this.f46303a.a1(), this.f46303a.Y0());
            Field<Expression<DivActionSubmit.Request.Method>> field = requestTemplate.f46314b;
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = DivActionSubmitRequestJsonParser.f46300c;
            bk.l<String, DivActionSubmit.Request.Method> lVar = DivActionSubmit.Request.Method.FROM_STRING;
            Expression<DivActionSubmit.Request.Method> expression = DivActionSubmitRequestJsonParser.f46299b;
            Expression<DivActionSubmit.Request.Method> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "method", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivActionSubmit.Request(listResolveOptionalList, expression, JsonFieldResolver.resolveExpression(parsingContext, requestTemplate.f46315c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46303a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivActionSubmit.Request.Method method = DivActionSubmit.Request.Method.POST;
        f46299b = Expression.Companion.constant$default(companion, method, null, 2, null);
        f46300c = TypeHelper.Companion.from(method, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionSubmitRequestJsonParser$Companion$TYPE_HELPER_METHOD$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivActionSubmit.Request.Method);
            }
        });
    }
}
