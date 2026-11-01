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
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBorderJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50657a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50658b = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50659c = new ValueValidator() { // from class: oe.g2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.h0.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50660a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBorder deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, h0.f50659c);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.f50660a.s2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = h0.f50658b;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_shadow", typeHelper, lVar, expression);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression;
            }
            return new DivBorder(optionalExpression, divCornersRadius, optionalExpression2, (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shadow", this.f50660a.P6()), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.f50660a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivBorder divBorder) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divBorder.f46537a);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", divBorder.f46538b, this.f50660a.s2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_shadow", divBorder.f46539c);
            JsonPropertyParser.write(parsingContext, jSONObject, "shadow", divBorder.f46540d, this.f50660a.P6());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divBorder.f46541e, this.f50660a.C7());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50660a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50661a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBorderTemplate deserialize(ParsingContext parsingContext, DivBorderTemplate divBorderTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivBorderTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f46546a : null, ParsingConvertersKt.NUMBER_TO_INT, h0.f50659c), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f46547b : null, this.f50661a.t2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f46548c : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shadow", allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f46549d : null, this.f50661a.Q6()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.f46550e : null, this.f50661a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivBorderTemplate divBorderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divBorderTemplate.f46546a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", divBorderTemplate.f46547b, this.f50661a.t2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_shadow", divBorderTemplate.f46548c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "shadow", divBorderTemplate.f46549d, this.f50661a.Q6());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divBorderTemplate.f46550e, this.f50661a.D7());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50661a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: compiled from: DivBorderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivBorderTemplate, DivBorder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50662a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivBorder resolve(ParsingContext parsingContext, DivBorderTemplate divBorderTemplate, JSONObject jSONObject) throws ParsingException {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divBorderTemplate.f46546a, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, h0.f50659c);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.f46547b, jSONObject, "corners_radius", this.f50662a.u2(), this.f50662a.s2());
            Field<Expression<Boolean>> field = divBorderTemplate.f46548c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = h0.f50658b;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "has_shadow", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            return new DivBorder(expressionResolveOptionalExpression, divCornersRadius, expression, (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.f46549d, jSONObject, "shadow", this.f50662a.R6(), this.f50662a.P6()), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.f46550e, jSONObject, VastAttributes.STROKE_COLOR, this.f50662a.E7(), this.f50662a.C7()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50662a = jsonParserComponent;
        }
    }
}
