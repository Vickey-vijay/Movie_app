package com.yandex.div2;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPatchJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivPatchJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48351a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivPatch.Mode> f48352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivPatch.Mode> f48353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivPatch.Change> f48354d;

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48355a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPatch deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "changes", this.f48355a.F5(), DivPatchJsonParser.f48354d);
            TypeHelper<DivPatch.Mode> typeHelper = DivPatchJsonParser.f48353c;
            bk.l<String, DivPatch.Mode> lVar = DivPatch.Mode.FROM_STRING;
            Expression<DivPatch.Mode> expression = DivPatchJsonParser.f48352b;
            Expression<DivPatch.Mode> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.a.f28427t, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivPatch(list, expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_applied_actions", this.f48355a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_failed_actions", this.f48355a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPatch divPatch) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "changes", divPatch.f48339a, this.f48355a.F5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.a.f28427t, divPatch.f48340b, DivPatch.Mode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_applied_actions", divPatch.f48341c, this.f48355a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_failed_actions", divPatch.f48342d, this.f48355a.u0());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48355a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48356a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPatchTemplate divPatchTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "changes", divPatchTemplate.f48361a, this.f48356a.G5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.a.f28427t, divPatchTemplate.f48362b, DivPatch.Mode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_applied_actions", divPatchTemplate.f48363c, this.f48356a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_failed_actions", divPatchTemplate.f48364d, this.f48356a.v0());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48356a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPatchTemplate deserialize(ParsingContext parsingContext, DivPatchTemplate divPatchTemplate, JSONObject jSONObject) throws ParsingException {
            Field<List<DivPatchTemplate.ChangeTemplate>> field;
            Field<Expression<DivPatch.Mode>> field2;
            Field<List<DivActionTemplate>> field3;
            Field<List<DivActionTemplate>> field4;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divPatchTemplate != null) {
                field = divPatchTemplate.f48361a;
            } else {
                field = null;
            }
            mj.g<u2> gVarG5 = this.f48356a.G5();
            ListValidator<DivPatch.Change> listValidator = DivPatchJsonParser.f48354d;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "changes", allowPropertyOverride, field, gVarG5, listValidator);
            TypeHelper<DivPatch.Mode> typeHelper = DivPatchJsonParser.f48353c;
            if (divPatchTemplate != null) {
                field2 = divPatchTemplate.f48362b;
            } else {
                field2 = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.a.f28427t, typeHelper, allowPropertyOverride, field2, DivPatch.Mode.FROM_STRING);
            if (divPatchTemplate != null) {
                field3 = divPatchTemplate.f48363c;
            } else {
                field3 = null;
            }
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_applied_actions", allowPropertyOverride, field3, this.f48356a.v0());
            if (divPatchTemplate != null) {
                field4 = divPatchTemplate.f48364d;
            } else {
                field4 = null;
            }
            return new DivPatchTemplate((Field<List<DivPatchTemplate.ChangeTemplate>>) listField, (Field<Expression<DivPatch.Mode>>) optionalFieldWithExpression, (Field<List<DivActionTemplate>>) optionalListField, (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_failed_actions", allowPropertyOverride, field4, this.f48356a.v0()));
        }
    }

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPatchTemplate, DivPatch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48357a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPatch resolve(ParsingContext parsingContext, DivPatchTemplate divPatchTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divPatchTemplate.f48361a, jSONObject, "changes", this.f48357a.H5(), this.f48357a.F5(), DivPatchJsonParser.f48354d);
            Field<Expression<DivPatch.Mode>> field = divPatchTemplate.f48362b;
            TypeHelper<DivPatch.Mode> typeHelper = DivPatchJsonParser.f48353c;
            bk.l<String, DivPatch.Mode> lVar = DivPatch.Mode.FROM_STRING;
            Expression<DivPatch.Mode> expression = DivPatchJsonParser.f48352b;
            Expression<DivPatch.Mode> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C3426d4.a.f28427t, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivPatch(listResolveList, expression, JsonFieldResolver.resolveOptionalList(parsingContext, divPatchTemplate.f48363c, jSONObject, "on_applied_actions", this.f48357a.w0(), this.f48357a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divPatchTemplate.f48364d, jSONObject, "on_failed_actions", this.f48357a.w0(), this.f48357a.u0()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48357a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivPatch.Mode mode = DivPatch.Mode.PARTIAL;
        f48352b = Expression.Companion.constant$default(companion, mode, null, 2, null);
        f48353c = TypeHelper.Companion.from(mode, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPatchJsonParser$Companion$TYPE_HELPER_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivPatch.Mode);
            }
        });
        f48354d = new ListValidator() { // from class: oe.p7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivPatchJsonParser.b(list);
            }
        };
    }

    public static final boolean b(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
