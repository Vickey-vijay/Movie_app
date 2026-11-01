package com.yandex.div2;

import com.ironsource.C3426d4;
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
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivAccessibilityJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46007a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAccessibility.Mode> f46008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f46009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivAccessibility.Type f46010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAccessibility.Mode> f46011e;

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46012a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAccessibility deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint", typeHelper);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_checked", typeHelper2, lVar);
            TypeHelper<DivAccessibility.Mode> typeHelper3 = DivAccessibilityJsonParser.f46011e;
            bk.l<String, DivAccessibility.Mode> lVar2 = DivAccessibility.Mode.FROM_STRING;
            Expression<DivAccessibility.Mode> expression = DivAccessibilityJsonParser.f46008b;
            Expression<DivAccessibility.Mode> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.a.f28427t, typeHelper3, lVar2, expression);
            if (optionalExpression4 != null) {
                expression = optionalExpression4;
            }
            Expression<Boolean> expression2 = DivAccessibilityJsonParser.f46009c;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "mute_after_action", typeHelper2, lVar, expression2);
            Expression<Boolean> expression3 = optionalExpression5 == null ? expression2 : optionalExpression5;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivAccessibilityJsonParser.f46010d;
            }
            return new DivAccessibility(optionalExpression, optionalExpression2, optionalExpression3, expression, expression3, optionalExpression6, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAccessibility divAccessibility) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, divAccessibility.f45997a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint", divAccessibility.f45998b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_checked", divAccessibility.f45999c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.a.f28427t, divAccessibility.f46000d, DivAccessibility.Mode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mute_after_action", divAccessibility.f46001e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_description", divAccessibility.f46002f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", divAccessibility.f46003g, (bk.l<DivAccessibility.Type, R>) DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46012a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46013a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAccessibilityTemplate deserialize(ParsingContext parsingContext, DivAccessibilityTemplate divAccessibilityTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f46020a : null);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint", typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f46021b : null);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divAccessibilityTemplate != null ? divAccessibilityTemplate.f46022c : null;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivAccessibilityTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_checked", typeHelper2, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.a.f28427t, DivAccessibilityJsonParser.f46011e, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f46023d : null, DivAccessibility.Mode.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "mute_after_action", typeHelper2, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f46024e : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "state_description", typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f46025f : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.f46026g : null, DivAccessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAccessibilityTemplate divAccessibilityTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, divAccessibilityTemplate.f46020a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint", divAccessibilityTemplate.f46021b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_checked", divAccessibilityTemplate.f46022c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.a.f28427t, divAccessibilityTemplate.f46023d, DivAccessibility.Mode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mute_after_action", divAccessibilityTemplate.f46024e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_description", divAccessibilityTemplate.f46025f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", divAccessibilityTemplate.f46026g, DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46013a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAccessibilityJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAccessibilityTemplate, DivAccessibility> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46014a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAccessibility resolve(ParsingContext parsingContext, DivAccessibilityTemplate divAccessibilityTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = divAccessibilityTemplate.f46020a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divAccessibilityTemplate.f46021b, jSONObject, "hint", typeHelper);
            Field<Expression<Boolean>> field2 = divAccessibilityTemplate.f46022c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_checked", typeHelper2, lVar);
            Field<Expression<DivAccessibility.Mode>> field3 = divAccessibilityTemplate.f46023d;
            TypeHelper<DivAccessibility.Mode> typeHelper3 = DivAccessibilityJsonParser.f46011e;
            bk.l<String, DivAccessibility.Mode> lVar2 = DivAccessibility.Mode.FROM_STRING;
            Expression<DivAccessibility.Mode> expression = DivAccessibilityJsonParser.f46008b;
            Expression<DivAccessibility.Mode> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, C3426d4.a.f28427t, typeHelper3, lVar2, expression);
            if (expressionResolveOptionalExpression4 != null) {
                expression = expressionResolveOptionalExpression4;
            }
            Field<Expression<Boolean>> field4 = divAccessibilityTemplate.f46024e;
            Expression<Boolean> expression2 = DivAccessibilityJsonParser.f46009c;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "mute_after_action", typeHelper2, lVar, expression2);
            Expression<Boolean> expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divAccessibilityTemplate.f46025f, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, divAccessibilityTemplate.f46026g, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivAccessibilityJsonParser.f46010d;
            }
            return new DivAccessibility(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression, expression3, expressionResolveOptionalExpression6, type);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46014a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
        f46008b = Expression.Companion.constant$default(companion, mode, null, 2, null);
        f46009c = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f46010d = DivAccessibility.Type.AUTO;
        f46011e = TypeHelper.Companion.from(mode, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivAccessibilityJsonParser$Companion$TYPE_HELPER_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAccessibility.Mode);
            }
        });
    }
}
