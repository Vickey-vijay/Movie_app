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
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50783a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivText.Image.Accessibility.Type f50784b = DivText.Image.Accessibility.Type.AUTO;

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50785a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image.Accessibility deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = n4.f50784b;
            }
            return new DivText.Image.Accessibility(optionalExpression, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivText.Image.Accessibility accessibility) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, accessibility.f49534a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", accessibility.f49535b, (bk.l<DivText.Image.Accessibility.Type, R>) DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50785a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50786a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, accessibilityTemplate.f49786a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", accessibilityTemplate.f49787b, DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50786a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate.ImageTemplate.AccessibilityTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field;
            Field<DivText.Image.Accessibility.Type> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (accessibilityTemplate != null) {
                field = accessibilityTemplate.f49786a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, typeHelper, allowPropertyOverride, field);
            if (accessibilityTemplate != null) {
                field2 = accessibilityTemplate.f49787b;
            } else {
                field2 = null;
            }
            return new DivTextTemplate.ImageTemplate.AccessibilityTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, field2, DivText.Image.Accessibility.Type.FROM_STRING));
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate.ImageTemplate.AccessibilityTemplate, DivText.Image.Accessibility> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50787a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image.Accessibility resolve(ParsingContext parsingContext, DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, accessibilityTemplate.f49786a, jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, accessibilityTemplate.f49787b, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = n4.f50784b;
            }
            return new DivText.Image.Accessibility(expressionResolveOptionalExpression, type);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50787a = jsonParserComponent;
        }
    }
}
