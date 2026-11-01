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
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50649a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f50651c;

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50652a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleDelimiter deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f50652a.w3());
            if (divFixedSize == null) {
                divFixedSize = g4.f50650b;
            }
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f50652a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = g4.f50651c;
            }
            return new DivTabs.TabTitleDelimiter(divFixedSize, expression, divFixedSize2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTabs.TabTitleDelimiter tabTitleDelimiter) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "height", tabTitleDelimiter.f49284a, this.f50652a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", tabTitleDelimiter.f49285b, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", tabTitleDelimiter.f49286c, this.f50652a.w3());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50652a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50653a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", tabTitleDelimiterTemplate.f49405a, this.f50653a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", tabTitleDelimiterTemplate.f49406b, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", tabTitleDelimiterTemplate.f49407c, this.f50653a.x3());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50653a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabsTemplate.TabTitleDelimiterTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate, JSONObject jSONObject) throws ParsingException {
            Field<DivFixedSizeTemplate> field;
            Field<Expression<Uri>> field2;
            Field<DivFixedSizeTemplate> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (tabTitleDelimiterTemplate != null) {
                field = tabTitleDelimiterTemplate.f49405a;
            } else {
                field = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, field, this.f50653a.x3());
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            if (tabTitleDelimiterTemplate != null) {
                field2 = tabTitleDelimiterTemplate.f49406b;
            } else {
                field2 = null;
            }
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", typeHelper, allowPropertyOverride, field2, ParsingConvertersKt.ANY_TO_URI);
            if (tabTitleDelimiterTemplate != null) {
                field3 = tabTitleDelimiterTemplate.f49407c;
            } else {
                field3 = null;
            }
            return new DivTabsTemplate.TabTitleDelimiterTemplate(optionalField, fieldWithExpression, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, field3, this.f50653a.x3()));
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTabsTemplate.TabTitleDelimiterTemplate, DivTabs.TabTitleDelimiter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50654a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleDelimiter resolve(ParsingContext parsingContext, DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate, JSONObject jSONObject) throws ParsingException {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, tabTitleDelimiterTemplate.f49405a, jSONObject, "height", this.f50654a.y3(), this.f50654a.w3());
            if (divFixedSize == null) {
                divFixedSize = g4.f50650b;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, tabTitleDelimiterTemplate.f49406b, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, tabTitleDelimiterTemplate.f49407c, jSONObject, "width", this.f50654a.y3(), this.f50654a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = g4.f50651c;
            }
            return new DivTabs.TabTitleDelimiter(divFixedSize, expressionResolveExpression, divFixedSize2);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50654a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50650b = new DivFixedSize(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
        f50651c = new DivFixedSize(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
    }
}
