package com.yandex.div2;

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
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50614a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivRadialGradientCenter.c f50615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivRadialGradientCenter.c f50616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivRadialGradientRadius.c f50617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<Integer> f50618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivRadialGradient.ColorPoint> f50619f;

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50620a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradient deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_x", this.f50620a.c6());
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = e3.f50615b;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = divRadialGradientCenter;
            DivRadialGradientCenter divRadialGradientCenter3 = (DivRadialGradientCenter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_y", this.f50620a.c6());
            if (divRadialGradientCenter3 == null) {
                divRadialGradientCenter3 = e3.f50616c;
            }
            DivRadialGradientCenter divRadialGradientCenter4 = divRadialGradientCenter3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.f50620a.f6(), e3.f50619f);
            ExpressionList optionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, e3.f50618e);
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.f50620a.o6());
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = e3.f50617d;
            }
            return new DivRadialGradient(divRadialGradientCenter2, divRadialGradientCenter4, optionalList, optionalExpressionList, divRadialGradientRadius);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradient divRadialGradient) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "center_x", divRadialGradient.f48430a, this.f50620a.c6());
            JsonPropertyParser.write(parsingContext, jSONObject, "center_y", divRadialGradient.f48431b, this.f50620a.c6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", divRadialGradient.f48432c, this.f50620a.f6());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", divRadialGradient.f48433d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", divRadialGradient.f48434e, this.f50620a.o6());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50620a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50621a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientTemplate deserialize(ParsingContext parsingContext, DivRadialGradientTemplate divRadialGradientTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_x", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.f48501a : null, this.f50621a.d6());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_y", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.f48502b : null, this.f50621a.d6());
            Field<List<DivRadialGradientTemplate.ColorPointTemplate>> field = divRadialGradientTemplate != null ? divRadialGradientTemplate.f48503c : null;
            mj.g<d3.c> gVarG6 = this.f50621a.g6();
            ListValidator<DivRadialGradient.ColorPoint> listValidator = e3.f50619f;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, gVarG6, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<ExpressionList<Integer>> field2 = divRadialGradientTemplate != null ? divRadialGradientTemplate.f48504d : null;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator<Integer> listValidator2 = e3.f50618e;
            ck.p.h(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivRadialGradientTemplate(optionalField, optionalField2, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, lVar, listValidator2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.f48505e : null, this.f50621a.p6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientTemplate divRadialGradientTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_x", divRadialGradientTemplate.f48501a, this.f50621a.d6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_y", divRadialGradientTemplate.f48502b, this.f50621a.d6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", divRadialGradientTemplate.f48503c, this.f50621a.g6());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", divRadialGradientTemplate.f48504d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", divRadialGradientTemplate.f48505e, this.f50621a.p6());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50621a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRadialGradientTemplate, DivRadialGradient> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50622a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradient resolve(ParsingContext parsingContext, DivRadialGradientTemplate divRadialGradientTemplate, JSONObject jSONObject) throws ParsingException {
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.f48501a, jSONObject, "center_x", this.f50622a.e6(), this.f50622a.c6());
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = e3.f50615b;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = (DivRadialGradientCenter) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.f48502b, jSONObject, "center_y", this.f50622a.e6(), this.f50622a.c6());
            if (divRadialGradientCenter2 == null) {
                divRadialGradientCenter2 = e3.f50616c;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divRadialGradientTemplate.f48503c, jSONObject, "color_map", this.f50622a.h6(), this.f50622a.f6(), e3.f50619f);
            ExpressionList expressionListResolveOptionalExpressionList = JsonFieldResolver.resolveOptionalExpressionList(parsingContext, divRadialGradientTemplate.f48504d, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, e3.f50618e);
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.f48505e, jSONObject, "radius", this.f50622a.q6(), this.f50622a.o6());
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = e3.f50617d;
            }
            return new DivRadialGradient(divRadialGradientCenter, divRadialGradientCenter2, listResolveOptionalList, expressionListResolveOptionalExpressionList, divRadialGradientRadius);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50622a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        f50615b = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f50616c = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f50617d = new DivRadialGradientRadius.c(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        f50618e = new ListValidator() { // from class: oe.b8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return com.yandex.div2.e3.c(list);
            }
        };
        f50619f = new ListValidator() { // from class: oe.c8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return com.yandex.div2.e3.d(list);
            }
        };
    }

    public static final boolean c(List list) {
        if (list.size() >= 2) {
            return true;
        }
        return false;
    }

    public static final boolean d(List list) {
        if (list.size() >= 2) {
            return true;
        }
        return false;
    }
}
