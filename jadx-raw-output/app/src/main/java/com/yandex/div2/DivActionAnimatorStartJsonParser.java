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
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivActionAnimatorStartJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46060a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationDirection> f46061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f46062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46064e;

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46065a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionAnimatorStart deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id");
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", DivActionAnimatorStartJsonParser.f46061b, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStart(str, optionalExpression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, lVar, DivActionAnimatorStartJsonParser.f46063d), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "end_value", this.f46065a.h9()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.f46062c, DivAnimationInterpolator.FROM_STRING), (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f46065a.v2()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, lVar, DivActionAnimatorStartJsonParser.f46064e), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "start_value", this.f46065a.h9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStart divActionAnimatorStart) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", divActionAnimatorStart.f46051a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divActionAnimatorStart.f46052b, DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divActionAnimatorStart.f46053c);
            JsonPropertyParser.write(parsingContext, jSONObject, "end_value", divActionAnimatorStart.f46054d, this.f46065a.h9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divActionAnimatorStart.f46055e, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divActionAnimatorStart.f46056f, this.f46065a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divActionAnimatorStart.f46057g);
            JsonPropertyParser.write(parsingContext, jSONObject, "start_value", divActionAnimatorStart.f46058h, this.f46065a.h9());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46065a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46066a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionAnimatorStartTemplate deserialize(ParsingContext parsingContext, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46070a : null);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", DivActionAnimatorStartJsonParser.f46061b, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46071b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46072c : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStartTemplate(field, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, lVar, DivActionAnimatorStartJsonParser.f46063d), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "end_value", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46073d : null, this.f46066a.i9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.f46062c, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46074e : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46075f : null, this.f46066a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46076g : null, lVar, DivActionAnimatorStartJsonParser.f46064e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "start_value", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.f46077h : null, this.f46066a.i9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", divActionAnimatorStartTemplate.f46070a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divActionAnimatorStartTemplate.f46071b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divActionAnimatorStartTemplate.f46072c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "end_value", divActionAnimatorStartTemplate.f46073d, this.f46066a.i9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divActionAnimatorStartTemplate.f46074e, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divActionAnimatorStartTemplate.f46075f, this.f46066a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divActionAnimatorStartTemplate.f46076g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "start_value", divActionAnimatorStartTemplate.f46077h, this.f46066a.i9());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46066a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionAnimatorStartTemplate, DivActionAnimatorStart> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46067a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionAnimatorStart resolve(ParsingContext parsingContext, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, JSONObject jSONObject) throws ParsingException {
            String str = (String) JsonFieldResolver.resolve(parsingContext, divActionAnimatorStartTemplate.f46070a, jSONObject, "animator_id");
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.f46071b, jSONObject, "direction", DivActionAnimatorStartJsonParser.f46061b, DivAnimationDirection.FROM_STRING);
            Field<Expression<Long>> field = divActionAnimatorStartTemplate.f46072c;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStart(str, expressionResolveOptionalExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, lVar, DivActionAnimatorStartJsonParser.f46063d), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.f46073d, jSONObject, "end_value", this.f46067a.j9(), this.f46067a.h9()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.f46074e, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.f46062c, DivAnimationInterpolator.FROM_STRING), (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.f46075f, jSONObject, "repeat_count", this.f46067a.x2(), this.f46067a.v2()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.f46076g, jSONObject, "start_delay", typeHelper, lVar, DivActionAnimatorStartJsonParser.f46064e), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.f46077h, jSONObject, "start_value", this.f46067a.j9(), this.f46067a.h9()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46067a = jsonParserComponent;
        }
    }

    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    static {
        TypeHelper.Companion companion = TypeHelper.Companion;
        f46061b = companion.from(nj.n.K(DivAnimationDirection.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        f46062c = companion.from(nj.n.K(DivAnimationInterpolator.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        f46063d = new ValueValidator() { // from class: oe.i0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivActionAnimatorStartJsonParser.c(((Long) obj).longValue());
            }
        };
        f46064e = new ValueValidator() { // from class: oe.j0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivActionAnimatorStartJsonParser.d(((Long) obj).longValue());
            }
        };
    }
}
