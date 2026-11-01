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
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50735a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50736b = new ValueValidator() { // from class: oe.zb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.l5.c(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50737c = new ValueValidator() { // from class: oe.ac
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.l5.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50738a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoSource.Resolution deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSource.Resolution(JsonExpressionParser.readExpression(parsingContext, jSONObject, "height", typeHelper, lVar, l5.f50736b), JsonExpressionParser.readExpression(parsingContext, jSONObject, "width", typeHelper, lVar, l5.f50737c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivVideoSource.Resolution resolution) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "height", resolution.f50042a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", resolution.f50043b);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50738a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50739a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoSourceTemplate.ResolutionTemplate deserialize(ParsingContext parsingContext, DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = resolutionTemplate != null ? resolutionTemplate.f50053a : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSourceTemplate.ResolutionTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "height", typeHelper, allowPropertyOverride, field, lVar, l5.f50736b), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "width", typeHelper, allowPropertyOverride, resolutionTemplate != null ? resolutionTemplate.f50054b : null, lVar, l5.f50737c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "height", resolutionTemplate.f50053a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", resolutionTemplate.f50054b);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50739a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivVideoSourceTemplate.ResolutionTemplate, DivVideoSource.Resolution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50740a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoSource.Resolution resolve(ParsingContext parsingContext, DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = resolutionTemplate.f50053a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSource.Resolution(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "height", typeHelper, lVar, l5.f50736b), JsonFieldResolver.resolveExpression(parsingContext, resolutionTemplate.f50054b, jSONObject, "width", typeHelper, lVar, l5.f50737c));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50740a = jsonParserComponent;
        }
    }

    public static final boolean c(long j10) {
        return j10 > 0;
    }

    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
