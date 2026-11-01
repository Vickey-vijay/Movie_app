package com.yandex.div2;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivTriggerJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTriggerJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTriggerJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49920a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivTrigger.Mode> f49921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTrigger.Mode> f49922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivAction> f49923d;

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49924a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTrigger deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "actions", this.f49924a.u0(), DivTriggerJsonParser.f49923d);
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<DivTrigger.Mode> typeHelper = DivTriggerJsonParser.f49922c;
            bk.l<String, DivTrigger.Mode> lVar = DivTrigger.Mode.FROM_STRING;
            Expression<DivTrigger.Mode> expression2 = DivTriggerJsonParser.f49921b;
            Expression<DivTrigger.Mode> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.a.f28427t, typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivTrigger(list, expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTrigger divTrigger) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divTrigger.f49915a, this.f49924a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divTrigger.f49916b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.a.f28427t, divTrigger.f49917c, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49924a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49925a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTriggerTemplate divTriggerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divTriggerTemplate.f49930a, this.f49925a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divTriggerTemplate.f49931b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.a.f28427t, divTriggerTemplate.f49932c, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49925a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTriggerTemplate deserialize(ParsingContext parsingContext, DivTriggerTemplate divTriggerTemplate, JSONObject jSONObject) throws ParsingException {
            Field<List<DivActionTemplate>> field;
            Field<Expression<Boolean>> field2;
            Field<Expression<DivTrigger.Mode>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divTriggerTemplate != null) {
                field = divTriggerTemplate.f49930a;
            } else {
                field = null;
            }
            mj.g<DivActionJsonParser.c> gVarV0 = this.f49925a.v0();
            ListValidator<DivAction> listValidator = DivTriggerJsonParser.f49923d;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, gVarV0, listValidator);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (divTriggerTemplate != null) {
                field2 = divTriggerTemplate.f49931b;
            } else {
                field2 = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<DivTrigger.Mode> typeHelper2 = DivTriggerJsonParser.f49922c;
            if (divTriggerTemplate != null) {
                field3 = divTriggerTemplate.f49932c;
            } else {
                field3 = null;
            }
            return new DivTriggerTemplate(listField, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.a.f28427t, typeHelper2, allowPropertyOverride, field3, DivTrigger.Mode.FROM_STRING));
        }
    }

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTriggerTemplate, DivTrigger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49926a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTrigger resolve(ParsingContext parsingContext, DivTriggerTemplate divTriggerTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divTriggerTemplate.f49930a, jSONObject, "actions", this.f49926a.w0(), this.f49926a.u0(), DivTriggerJsonParser.f49923d);
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTriggerTemplate.f49931b, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field<Expression<DivTrigger.Mode>> field = divTriggerTemplate.f49932c;
            TypeHelper<DivTrigger.Mode> typeHelper = DivTriggerJsonParser.f49922c;
            bk.l<String, DivTrigger.Mode> lVar = DivTrigger.Mode.FROM_STRING;
            Expression<DivTrigger.Mode> expression = DivTriggerJsonParser.f49921b;
            Expression<DivTrigger.Mode> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C3426d4.a.f28427t, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTrigger(listResolveList, expressionResolveExpression, expression);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49926a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTrigger.Mode mode = DivTrigger.Mode.ON_CONDITION;
        f49921b = Expression.Companion.constant$default(companion, mode, null, 2, null);
        f49922c = TypeHelper.Companion.from(mode, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTriggerJsonParser$Companion$TYPE_HELPER_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTrigger.Mode);
            }
        });
        f49923d = new ListValidator() { // from class: oe.sb
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTriggerJsonParser.b(list);
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
