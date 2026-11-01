package com.yandex.div2;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50836a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50837b = new ValueValidator() { // from class: oe.u2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.e(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50838c = new ValueValidator() { // from class: oe.v2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.f(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50839d = new ValueValidator() { // from class: oe.w2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.g(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50840e = new ValueValidator() { // from class: oe.x2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.h(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50841a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCornersRadius deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadius(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.e.f28479e, typeHelper, lVar, r0.f50837b), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.e.f28478d, typeHelper, lVar, r0.f50838c), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.e.f28477c, typeHelper, lVar, r0.f50839d), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3426d4.e.f28476b, typeHelper, lVar, r0.f50840e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCornersRadius divCornersRadius) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.e.f28479e, divCornersRadius.f46836a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.e.f28478d, divCornersRadius.f46837b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.e.f28477c, divCornersRadius.f46838c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.e.f28476b, divCornersRadius.f46839d);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50841a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50842a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCornersRadiusTemplate deserialize(ParsingContext parsingContext, DivCornersRadiusTemplate divCornersRadiusTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f46843a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadiusTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.e.f28479e, typeHelper, allowPropertyOverride, field, lVar, r0.f50837b), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.e.f28478d, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f46844b : null, lVar, r0.f50838c), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.e.f28477c, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f46845c : null, lVar, r0.f50839d), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.e.f28476b, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f46846d : null, lVar, r0.f50840e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCornersRadiusTemplate divCornersRadiusTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.e.f28479e, divCornersRadiusTemplate.f46843a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.e.f28478d, divCornersRadiusTemplate.f46844b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.e.f28477c, divCornersRadiusTemplate.f46845c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.e.f28476b, divCornersRadiusTemplate.f46846d);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50842a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCornersRadiusTemplate, DivCornersRadius> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50843a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCornersRadius resolve(ParsingContext parsingContext, DivCornersRadiusTemplate divCornersRadiusTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divCornersRadiusTemplate.f46843a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadius(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C3426d4.e.f28479e, typeHelper, lVar, r0.f50837b), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.f46844b, jSONObject, C3426d4.e.f28478d, typeHelper, lVar, r0.f50838c), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.f46845c, jSONObject, C3426d4.e.f28477c, typeHelper, lVar, r0.f50839d), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.f46846d, jSONObject, C3426d4.e.f28476b, typeHelper, lVar, r0.f50840e));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50843a = jsonParserComponent;
        }
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }
}
