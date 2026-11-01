package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3426d4;
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
import com.yandex.div2.DivTooltipJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTooltipJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49851a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivTooltipMode.b f49854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTooltip.Position> f49855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49856f;

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49857a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTooltip deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.f49857a.q1());
            DivAnimation divAnimation2 = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.f49857a.q1());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivTooltipJsonParser.f49852b;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "close_by_tap_outside", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = optionalExpression2 == null ? expression : optionalExpression2;
            Div div = (Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f49857a.M4());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTooltipJsonParser.f49856f;
            Expression<Long> expression3 = DivTooltipJsonParser.f49853c;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = optionalExpression3 == null ? expression3 : optionalExpression3;
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            DivTooltipMode divTooltipMode = (DivTooltipMode) JsonPropertyParser.readOptional(parsingContext, jSONObject, C3426d4.a.f28427t, this.f49857a.S8());
            if (divTooltipMode == null) {
                divTooltipMode = DivTooltipJsonParser.f49854d;
            }
            return new DivTooltip(divAnimation, divAnimation2, optionalExpression, expression2, div, expression4, str, divTooltipMode, (DivPoint) JsonPropertyParser.readOptional(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f49857a.Z5()), JsonExpressionParser.readExpression(parsingContext, jSONObject, C3426d4.i.L, DivTooltipJsonParser.f49855e, DivTooltip.Position.FROM_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tap_outside_actions", this.f49857a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTooltip divTooltip) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", divTooltip.f49838a, this.f49857a.q1());
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", divTooltip.f49839b, this.f49857a.q1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_accessibility_description", divTooltip.f49840c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "close_by_tap_outside", divTooltip.f49841d);
            JsonPropertyParser.write(parsingContext, jSONObject, "div", divTooltip.f49842e, this.f49857a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divTooltip.f49843f);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTooltip.f49844g);
            JsonPropertyParser.write(parsingContext, jSONObject, C3426d4.a.f28427t, divTooltip.f49845h, this.f49857a.S8());
            JsonPropertyParser.write(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divTooltip.f49846i, this.f49857a.Z5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.i.L, divTooltip.f49847j, DivTooltip.Position.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tap_outside_actions", divTooltip.f49848k, this.f49857a.u0());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49857a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49858a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTooltipTemplate deserialize(ParsingContext parsingContext, DivTooltipTemplate divTooltipTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTooltipTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49884a : null, this.f49858a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49885b : null, this.f49858a.r1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49886c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49887d : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49888e : null, this.f49858a.N4()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49889f : null, ParsingConvertersKt.NUMBER_TO_INT, DivTooltipJsonParser.f49856f), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49890g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.a.f28427t, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49891h : null, this.f49858a.T8()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49892i : null, this.f49858a.a6()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3426d4.i.L, DivTooltipJsonParser.f49855e, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49893j : null, DivTooltip.Position.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tap_outside_actions", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.f49894k : null, this.f49858a.v0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTooltipTemplate divTooltipTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", divTooltipTemplate.f49884a, this.f49858a.r1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", divTooltipTemplate.f49885b, this.f49858a.r1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_accessibility_description", divTooltipTemplate.f49886c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "close_by_tap_outside", divTooltipTemplate.f49887d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", divTooltipTemplate.f49888e, this.f49858a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", divTooltipTemplate.f49889f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTooltipTemplate.f49890g);
            JsonFieldParser.writeField(parsingContext, jSONObject, C3426d4.a.f28427t, divTooltipTemplate.f49891h, this.f49858a.T8());
            JsonFieldParser.writeField(parsingContext, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, divTooltipTemplate.f49892i, this.f49858a.a6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3426d4.i.L, divTooltipTemplate.f49893j, DivTooltip.Position.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tap_outside_actions", divTooltipTemplate.f49894k, this.f49858a.v0());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49858a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTooltipJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTooltipTemplate, DivTooltip> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49859a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTooltip resolve(ParsingContext parsingContext, DivTooltipTemplate divTooltipTemplate, JSONObject jSONObject) throws ParsingException {
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f49884a, jSONObject, "animation_in", this.f49859a.s1(), this.f49859a.q1());
            DivAnimation divAnimation2 = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f49885b, jSONObject, "animation_out", this.f49859a.s1(), this.f49859a.q1());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTooltipTemplate.f49886c, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field = divTooltipTemplate.f49887d;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivTooltipJsonParser.f49852b;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "close_by_tap_outside", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = expressionResolveOptionalExpression2 == null ? expression : expressionResolveOptionalExpression2;
            Div div = (Div) JsonFieldResolver.resolve(parsingContext, divTooltipTemplate.f49888e, jSONObject, "div", this.f49859a.O4(), this.f49859a.M4());
            Field<Expression<Long>> field2 = divTooltipTemplate.f49889f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTooltipJsonParser.f49856f;
            Expression<Long> expression3 = DivTooltipJsonParser.f49853c;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            String str = (String) JsonFieldResolver.resolve(parsingContext, divTooltipTemplate.f49890g, jSONObject, "id");
            DivTooltipMode divTooltipMode = (DivTooltipMode) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f49891h, jSONObject, C3426d4.a.f28427t, this.f49859a.U8(), this.f49859a.S8());
            if (divTooltipMode == null) {
                divTooltipMode = DivTooltipJsonParser.f49854d;
            }
            return new DivTooltip(divAnimation, divAnimation2, expressionResolveOptionalExpression, expression2, div, expression4, str, divTooltipMode, (DivPoint) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.f49892i, jSONObject, TypedValues.CycleType.S_WAVE_OFFSET, this.f49859a.b6(), this.f49859a.Z5()), JsonFieldResolver.resolveExpression(parsingContext, divTooltipTemplate.f49893j, jSONObject, C3426d4.i.L, DivTooltipJsonParser.f49855e, DivTooltip.Position.FROM_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, divTooltipTemplate.f49894k, jSONObject, "tap_outside_actions", this.f49859a.w0(), this.f49859a.u0()));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49859a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49852b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49853c = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f49854d = new DivTooltipMode.b(new DivTooltipModeModal());
        f49855e = TypeHelper.Companion.from(nj.n.K(DivTooltip.Position.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTooltipJsonParser$Companion$TYPE_HELPER_POSITION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTooltip.Position);
            }
        });
        f49856f = new ValueValidator() { // from class: oe.lb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTooltipJsonParser.b(((Long) obj).longValue());
            }
        };
    }
}
