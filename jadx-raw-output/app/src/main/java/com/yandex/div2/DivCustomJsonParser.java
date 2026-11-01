package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivCustomJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCustomJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivCustomJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46891a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f46892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f46893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f46894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f46895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f46896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f46897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f46898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f46899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f46901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f46902l;

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46903a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCustom deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f46903a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivCustomJsonParser.f46896f, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivCustomJsonParser.f46897g, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivCustomJsonParser.f46899i;
            Expression<Double> expression = DivCustomJsonParser.f46892b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f46903a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f46903a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f46903a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivCustomJsonParser.f46900j);
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "custom_props");
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "custom_type");
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f46903a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f46903a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f46903a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f46903a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f46903a.Y6());
            if (divSize == null) {
                divSize = DivCustomJsonParser.f46893c;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f46903a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f46903a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f46903a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f46903a.Y2());
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivCustomJsonParser.f46901k);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f46903a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f46903a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f46903a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f46903a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f46903a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f46903a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivCustomJsonParser.f46902l);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f46903a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f46903a.k9());
            TypeHelper<DivVisibility> typeHelper3 = DivCustomJsonParser.f46898h;
            bk.l<String, DivVisibility> lVar3 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression2 = DivCustomJsonParser.f46894d;
            Expression<DivVisibility> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper3, lVar3, expression2);
            Expression<DivVisibility> expression3 = optionalExpression7 == null ? expression2 : optionalExpression7;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f46903a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f46903a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f46903a.Y6());
            if (divSize3 == null) {
                divSize3 = DivCustomJsonParser.f46895e;
            }
            return new DivCustom(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, jSONObject2, str, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str2, optionalList6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, optionalExpression5, optionalExpression6, optionalList7, optionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression3, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCustom divCustom) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divCustom.q(), this.f46903a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divCustom.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divCustom.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divCustom.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divCustom.y(), this.f46903a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divCustom.getBackground(), this.f46903a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divCustom.z(), this.f46903a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divCustom.b());
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_props", divCustom.f46873i);
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_type", divCustom.f46874j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divCustom.k(), this.f46903a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divCustom.getExtensions(), this.f46903a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divCustom.p(), this.f46903a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divCustom.w(), this.f46903a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divCustom.getHeight(), this.f46903a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divCustom.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divCustom.f46881q, this.f46903a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divCustom.t(), this.f46903a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divCustom.d(), this.f46903a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divCustom.r(), this.f46903a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divCustom.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divCustom.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divCustom.s(), this.f46903a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divCustom.h(), this.f46903a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divCustom.l(), this.f46903a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divCustom.j(), this.f46903a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divCustom.x(), this.f46903a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divCustom.i(), this.f46903a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divCustom.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divCustom.u(), this.f46903a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divCustom.c(), this.f46903a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divCustom.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divCustom.v(), this.f46903a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divCustom.a(), this.f46903a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divCustom.getWidth(), this.f46903a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46903a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46904a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCustomTemplate deserialize(ParsingContext parsingContext, DivCustomTemplate divCustomTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46906a : null, this.f46904a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivCustomJsonParser.f46896f, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46907b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivCustomJsonParser.f46897g, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46908c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46909d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivCustomJsonParser.f46899i);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46910e : null, this.f46904a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46911f : null, this.f46904a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46912g : null, this.f46904a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divCustomTemplate != null ? divCustomTemplate.f46913h : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivCustomJsonParser.f46900j);
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "custom_props", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46914i : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "custom_type", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46915j : null);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46916k : null, this.f46904a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46917l : null, this.f46904a.c3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46918m : null, this.f46904a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46919n : null, this.f46904a.J3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46920o : null, this.f46904a.Z6());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46921p : null);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46922q : null, this.f46904a.N4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46923r : null, this.f46904a.Q4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46924s : null, this.f46904a.Z2());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46925t : null, this.f46904a.Z2());
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46926u : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46927v : null, lVar, DivCustomJsonParser.f46901k);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46928w : null, this.f46904a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46929x : null, this.f46904a.Q8());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46930y : null, this.f46904a.c9());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.f46931z : null, this.f46904a.V1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.A : null, this.f46904a.A1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.B : null, this.f46904a.A1());
            Field<List<DivTransitionTrigger>> field3 = divCustomTemplate != null ? divCustomTemplate.C : null;
            bk.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivCustomJsonParser.f46902l;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivCustomTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalField3, field2, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalListField6, optionalField7, optionalField8, optionalField9, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField7, optionalListField8, optionalField10, optionalField11, optionalField12, optionalField13, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.D : null, this.f46904a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.E : null, this.f46904a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivCustomJsonParser.f46898h, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.F : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.G : null, this.f46904a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.H : null, this.f46904a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.I : null, this.f46904a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCustomTemplate divCustomTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divCustomTemplate.f46906a, this.f46904a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divCustomTemplate.f46907b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divCustomTemplate.f46908c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divCustomTemplate.f46909d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divCustomTemplate.f46910e, this.f46904a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divCustomTemplate.f46911f, this.f46904a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divCustomTemplate.f46912g, this.f46904a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divCustomTemplate.f46913h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_props", divCustomTemplate.f46914i);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_type", divCustomTemplate.f46915j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divCustomTemplate.f46916k, this.f46904a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divCustomTemplate.f46917l, this.f46904a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divCustomTemplate.f46918m, this.f46904a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divCustomTemplate.f46919n, this.f46904a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divCustomTemplate.f46920o, this.f46904a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divCustomTemplate.f46921p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divCustomTemplate.f46922q, this.f46904a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divCustomTemplate.f46923r, this.f46904a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divCustomTemplate.f46924s, this.f46904a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divCustomTemplate.f46925t, this.f46904a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divCustomTemplate.f46926u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divCustomTemplate.f46927v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divCustomTemplate.f46928w, this.f46904a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divCustomTemplate.f46929x, this.f46904a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divCustomTemplate.f46930y, this.f46904a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divCustomTemplate.f46931z, this.f46904a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divCustomTemplate.A, this.f46904a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divCustomTemplate.B, this.f46904a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divCustomTemplate.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divCustomTemplate.D, this.f46904a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divCustomTemplate.E, this.f46904a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divCustomTemplate.F, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divCustomTemplate.G, this.f46904a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divCustomTemplate.H, this.f46904a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divCustomTemplate.I, this.f46904a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46904a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCustomJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCustomTemplate, DivCustom> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46905a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCustom resolve(ParsingContext parsingContext, DivCustomTemplate divCustomTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46906a, jSONObject, "accessibility", this.f46905a.J(), this.f46905a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f46907b, jSONObject, "alignment_horizontal", DivCustomJsonParser.f46896f, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f46908c, jSONObject, "alignment_vertical", DivCustomJsonParser.f46897g, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divCustomTemplate.f46909d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivCustomJsonParser.f46899i;
            Expression<Double> expression = DivCustomJsonParser.f46892b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46910e, jSONObject, "animators", this.f46905a.v1(), this.f46905a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46911f, jSONObject, A2.f54950g, this.f46905a.H1(), this.f46905a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46912g, jSONObject, "border", this.f46905a.N1(), this.f46905a.L1());
            Field<Expression<Long>> field2 = divCustomTemplate.f46913h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivCustomJsonParser.f46900j);
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46914i, jSONObject, "custom_props");
            String str = (String) JsonFieldResolver.resolve(parsingContext, divCustomTemplate.f46915j, jSONObject, "custom_type");
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46916k, jSONObject, "disappear_actions", this.f46905a.R2(), this.f46905a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46917l, jSONObject, "extensions", this.f46905a.d3(), this.f46905a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46918m, jSONObject, "focus", this.f46905a.B3(), this.f46905a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46919n, jSONObject, "functions", this.f46905a.K3(), this.f46905a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46920o, jSONObject, "height", this.f46905a.a7(), this.f46905a.Y6());
            if (divSize == null) {
                divSize = DivCustomJsonParser.f46893c;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46921p, jSONObject, "id");
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46922q, jSONObject, "items", this.f46905a.O4(), this.f46905a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46923r, jSONObject, "layout_provider", this.f46905a.R4(), this.f46905a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46924s, jSONObject, "margins", this.f46905a.a3(), this.f46905a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46925t, jSONObject, "paddings", this.f46905a.a3(), this.f46905a.Y2());
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f46926u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.f46927v, jSONObject, "row_span", typeHelper2, lVar2, DivCustomJsonParser.f46901k);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46928w, jSONObject, "selected_actions", this.f46905a.w0(), this.f46905a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.f46929x, jSONObject, "tooltips", this.f46905a.R8(), this.f46905a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46930y, jSONObject, "transform", this.f46905a.d9(), this.f46905a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.f46931z, jSONObject, "transition_change", this.f46905a.W1(), this.f46905a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.A, jSONObject, "transition_in", this.f46905a.B1(), this.f46905a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.B, jSONObject, "transition_out", this.f46905a.B1(), this.f46905a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.C, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivCustomJsonParser.f46902l);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.D, jSONObject, "variable_triggers", this.f46905a.g9(), this.f46905a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.E, jSONObject, "variables", this.f46905a.m9(), this.f46905a.k9());
            Field<Expression<DivVisibility>> field3 = divCustomTemplate.F;
            TypeHelper<DivVisibility> typeHelper3 = DivCustomJsonParser.f46898h;
            bk.l<String, DivVisibility> lVar3 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression2 = DivCustomJsonParser.f46894d;
            Expression<DivVisibility> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "visibility", typeHelper3, lVar3, expression2);
            Expression<DivVisibility> expression3 = expressionResolveOptionalExpression7 == null ? expression2 : expressionResolveOptionalExpression7;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.G, jSONObject, "visibility_action", this.f46905a.y9(), this.f46905a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.H, jSONObject, "visibility_actions", this.f46905a.y9(), this.f46905a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.I, jSONObject, "width", this.f46905a.a7(), this.f46905a.Y6());
            if (divSize3 == null) {
                divSize3 = DivCustomJsonParser.f46895e;
            }
            return new DivCustom(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, jSONObject2, str, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str2, listResolveOptionalList6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, listResolveOptionalList7, listResolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression3, divVisibilityAction, listResolveOptionalList12, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46905a = jsonParserComponent;
        }
    }

    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f46892b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f46893c = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f46894d = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f46895e = new DivSize.c(new DivMatchParentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f46896f = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f46897g = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f46898h = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f46899i = new ValueValidator() { // from class: oe.b3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivCustomJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f46900j = new ValueValidator() { // from class: oe.c3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivCustomJsonParser.f(((Long) obj).longValue());
            }
        };
        f46901k = new ValueValidator() { // from class: oe.d3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivCustomJsonParser.g(((Long) obj).longValue());
            }
        };
        f46902l = new ListValidator() { // from class: oe.e3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivCustomJsonParser.h(list);
            }
        };
    }

    public static final boolean h(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
