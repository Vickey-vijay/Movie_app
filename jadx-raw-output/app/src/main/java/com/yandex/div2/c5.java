package com.yandex.div2;

import androidx.constraintlayout.motion.widget.Key;
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

/* JADX INFO: compiled from: DivTransformJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50593a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivPivot.c f50594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivPivot.c f50595c;

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50596a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTransform deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivPivot divPivot = (DivPivot) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_x", this.f50596a.T5());
            if (divPivot == null) {
                divPivot = c5.f50594b;
            }
            DivPivot divPivot2 = (DivPivot) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_y", this.f50596a.T5());
            if (divPivot2 == null) {
                divPivot2 = c5.f50595c;
            }
            return new DivTransform(divPivot, divPivot2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTransform divTransform) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_x", divTransform.f49899a, this.f50596a.T5());
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_y", divTransform.f49900b, this.f50596a.T5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Key.ROTATION, divTransform.f49901c);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50596a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50597a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTransformTemplate divTransformTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_x", divTransformTemplate.f49907a, this.f50597a.U5());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_y", divTransformTemplate.f49908b, this.f50597a.U5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Key.ROTATION, divTransformTemplate.f49909c);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50597a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTransformTemplate deserialize(ParsingContext parsingContext, DivTransformTemplate divTransformTemplate, JSONObject jSONObject) throws ParsingException {
            Field<DivPivotTemplate> field;
            Field<DivPivotTemplate> field2;
            Field<Expression<Double>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divTransformTemplate != null) {
                field = divTransformTemplate.f49907a;
            } else {
                field = null;
            }
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pivot_x", allowPropertyOverride, field, this.f50597a.U5());
            if (divTransformTemplate != null) {
                field2 = divTransformTemplate.f49908b;
            } else {
                field2 = null;
            }
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pivot_y", allowPropertyOverride, field2, this.f50597a.U5());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (divTransformTemplate != null) {
                field3 = divTransformTemplate.f49909c;
            } else {
                field3 = null;
            }
            return new DivTransformTemplate(optionalField, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Key.ROTATION, typeHelper, allowPropertyOverride, field3, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    /* JADX INFO: compiled from: DivTransformJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTransformTemplate, DivTransform> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50598a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTransform resolve(ParsingContext parsingContext, DivTransformTemplate divTransformTemplate, JSONObject jSONObject) throws ParsingException {
            DivPivot divPivot = (DivPivot) JsonFieldResolver.resolveOptional(parsingContext, divTransformTemplate.f49907a, jSONObject, "pivot_x", this.f50598a.V5(), this.f50598a.T5());
            if (divPivot == null) {
                divPivot = c5.f50594b;
            }
            DivPivot divPivot2 = (DivPivot) JsonFieldResolver.resolveOptional(parsingContext, divTransformTemplate.f49908b, jSONObject, "pivot_y", this.f50598a.V5(), this.f50598a.T5());
            if (divPivot2 == null) {
                divPivot2 = c5.f50595c;
            }
            return new DivTransform(divPivot, divPivot2, JsonFieldResolver.resolveOptionalExpression(parsingContext, divTransformTemplate.f49909c, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50598a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        f50594b = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f50595c = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
    }
}
