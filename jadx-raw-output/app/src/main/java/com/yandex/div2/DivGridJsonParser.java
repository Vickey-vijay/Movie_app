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
import com.yandex.div2.DivGridJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGridJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivGridJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47482a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivAnimation f47483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentHorizontal> f47486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentVertical> f47487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f47488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f47489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f47490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f47495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f47500s;

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47501a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGrid deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f47501a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f47501a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f47501a.q1());
            if (divAnimation == null) {
                divAnimation = DivGridJsonParser.f47483b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f47501a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGridJsonParser.f47491j;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGridJsonParser.f47492k;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGridJsonParser.f47496o;
            Expression<Double> expression = DivGridJsonParser.f47484c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f47501a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f47501a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f47501a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivGridJsonParser.f47485d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            Expression<Boolean> expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "column_count", typeHelper5, lVar5, DivGridJsonParser.f47497p);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivGridJsonParser.f47498q);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGridJsonParser.f47493l;
            Expression<DivAlignmentHorizontal> expression5 = DivGridJsonParser.f47486e;
            Expression<DivAlignmentHorizontal> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression5);
            if (optionalExpression6 != null) {
                expression5 = optionalExpression6;
            }
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGridJsonParser.f47494m;
            Expression<DivAlignmentVertical> expression6 = DivGridJsonParser.f47487f;
            Expression<DivAlignmentVertical> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f47501a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f47501a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f47501a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f47501a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f47501a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f47501a.Y6());
            if (divSize == null) {
                divSize = DivGridJsonParser.f47488g;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f47501a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f47501a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f47501a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f47501a.P4());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f47501a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f47501a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f47501a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f47501a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f47501a.u0());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivGridJsonParser.f47499r);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f47501a.u0());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f47501a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f47501a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f47501a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f47501a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f47501a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGridJsonParser.f47500s);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f47501a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f47501a.k9());
            TypeHelper<DivVisibility> typeHelper8 = DivGridJsonParser.f47495n;
            bk.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = DivGridJsonParser.f47489h;
            Expression<DivVisibility> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, lVar6, expression8);
            Expression<DivVisibility> expression9 = optionalExpression10 == null ? expression8 : optionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f47501a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f47501a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f47501a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGridJsonParser.f47490i;
            }
            return new DivGrid(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, divBorder, expression3, expression4, optionalExpression5, expression5, expression7, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str, optionalList10, divLayoutProvider, optionalList11, divEdgeInsets, divEdgeInsets2, optionalList12, optionalList13, optionalExpression8, optionalExpression9, optionalList14, optionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList16, optionalList17, optionalList18, expression9, divVisibilityAction, optionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivGrid divGrid) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGrid.q(), this.f47501a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divGrid.f47457b, this.f47501a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divGrid.f47458c, this.f47501a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divGrid.f47459d, this.f47501a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divGrid.g();
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionN = divGrid.n();
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionN, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGrid.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGrid.y(), this.f47501a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divGrid.getBackground(), this.f47501a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divGrid.z(), this.f47501a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divGrid.f47466k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", divGrid.f47467l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGrid.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divGrid.f47469n, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divGrid.f47470o, lVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGrid.k(), this.f47501a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divGrid.f47472q, this.f47501a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGrid.getExtensions(), this.f47501a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGrid.p(), this.f47501a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGrid.w(), this.f47501a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGrid.getHeight(), this.f47501a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divGrid.f47477v, this.f47501a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divGrid.f47478w, this.f47501a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGrid.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divGrid.f47480y, this.f47501a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGrid.t(), this.f47501a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divGrid.A, this.f47501a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGrid.d(), this.f47501a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGrid.r(), this.f47501a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divGrid.D, this.f47501a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divGrid.E, this.f47501a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGrid.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGrid.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGrid.s(), this.f47501a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGrid.h(), this.f47501a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGrid.l(), this.f47501a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGrid.j(), this.f47501a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGrid.x(), this.f47501a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGrid.i(), this.f47501a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGrid.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGrid.u(), this.f47501a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGrid.c(), this.f47501a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divGrid.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGrid.v(), this.f47501a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGrid.a(), this.f47501a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGrid.getWidth(), this.f47501a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47501a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47502a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGridTemplate deserialize(ParsingContext parsingContext, DivGridTemplate divGridTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47508a : null, this.f47502a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47509b : null, this.f47502a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47510c : null, this.f47502a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47511d : null, this.f47502a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGridJsonParser.f47491j;
            Field<Expression<DivAlignmentHorizontal>> field = divGridTemplate != null ? divGridTemplate.f47512e : null;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGridJsonParser.f47492k;
            Field<Expression<DivAlignmentVertical>> field2 = divGridTemplate != null ? divGridTemplate.f47513f : null;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47514g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGridJsonParser.f47496o);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47515h : null, this.f47502a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47516i : null, this.f47502a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47517j : null, this.f47502a.M1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47518k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = divGridTemplate != null ? divGridTemplate.f47519l : null;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_count", typeHelper3, allowPropertyOverride, field3, lVar3, DivGridJsonParser.f47497p);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47520m : null, lVar3, DivGridJsonParser.f47498q);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivGridJsonParser.f47493l, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47521n : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivGridJsonParser.f47494m, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47522o : null, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47523p : null, this.f47502a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47524q : null, this.f47502a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47525r : null, this.f47502a.c3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47526s : null, this.f47502a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47527t : null, this.f47502a.J3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47528u : null, this.f47502a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47529v : null, this.f47502a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47530w : null, this.f47502a.v0());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47531x : null);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47532y : null, this.f47502a.N4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.f47533z : null, this.f47502a.Q4());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.A : null, this.f47502a.v0());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.B : null, this.f47502a.Z2());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.C : null, this.f47502a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.D : null, this.f47502a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.E : null, this.f47502a.v0());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.F : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.G : null, lVar3, DivGridJsonParser.f47499r);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.H : null, this.f47502a.v0());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.I : null, this.f47502a.Q8());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.J : null, this.f47502a.c9());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.K : null, this.f47502a.V1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.L : null, this.f47502a.A1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.M : null, this.f47502a.A1());
            Field<List<DivTransitionTrigger>> field4 = divGridTemplate != null ? divGridTemplate.N : null;
            bk.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivGridJsonParser.f47500s;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGridTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, fieldWithExpression, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalField5, optionalListField7, optionalField6, optionalListField8, optionalListField9, optionalField7, optionalListField10, optionalField8, optionalListField11, optionalField9, optionalField10, optionalListField12, optionalListField13, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField14, optionalListField15, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar4, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.O : null, this.f47502a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.P : null, this.f47502a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivGridJsonParser.f47495n, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.Q : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.R : null, this.f47502a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.S : null, this.f47502a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.T : null, this.f47502a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivGridTemplate divGridTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGridTemplate.f47508a, this.f47502a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divGridTemplate.f47509b, this.f47502a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divGridTemplate.f47510c, this.f47502a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divGridTemplate.f47511d, this.f47502a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divGridTemplate.f47512e;
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGridTemplate.f47513f;
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGridTemplate.f47514g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGridTemplate.f47515h, this.f47502a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divGridTemplate.f47516i, this.f47502a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divGridTemplate.f47517j, this.f47502a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divGridTemplate.f47518k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", divGridTemplate.f47519l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGridTemplate.f47520m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divGridTemplate.f47521n, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divGridTemplate.f47522o, lVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGridTemplate.f47523p, this.f47502a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divGridTemplate.f47524q, this.f47502a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGridTemplate.f47525r, this.f47502a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGridTemplate.f47526s, this.f47502a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGridTemplate.f47527t, this.f47502a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGridTemplate.f47528u, this.f47502a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divGridTemplate.f47529v, this.f47502a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divGridTemplate.f47530w, this.f47502a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGridTemplate.f47531x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divGridTemplate.f47532y, this.f47502a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGridTemplate.f47533z, this.f47502a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divGridTemplate.A, this.f47502a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGridTemplate.B, this.f47502a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGridTemplate.C, this.f47502a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divGridTemplate.D, this.f47502a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divGridTemplate.E, this.f47502a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGridTemplate.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGridTemplate.G);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGridTemplate.H, this.f47502a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGridTemplate.I, this.f47502a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGridTemplate.J, this.f47502a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGridTemplate.K, this.f47502a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGridTemplate.L, this.f47502a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGridTemplate.M, this.f47502a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGridTemplate.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGridTemplate.O, this.f47502a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGridTemplate.P, this.f47502a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divGridTemplate.Q, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGridTemplate.R, this.f47502a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGridTemplate.S, this.f47502a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGridTemplate.T, this.f47502a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47502a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivGridJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivGridTemplate, DivGrid> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47503a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGrid resolve(ParsingContext parsingContext, DivGridTemplate divGridTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47508a, jSONObject, "accessibility", this.f47503a.J(), this.f47503a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47509b, jSONObject, "action", this.f47503a.w0(), this.f47503a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47510c, jSONObject, "action_animation", this.f47503a.s1(), this.f47503a.q1());
            if (divAnimation == null) {
                divAnimation = DivGridJsonParser.f47483b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47511d, jSONObject, "actions", this.f47503a.w0(), this.f47503a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divGridTemplate.f47512e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGridJsonParser.f47491j;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGridTemplate.f47513f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGridJsonParser.f47492k;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divGridTemplate.f47514g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGridJsonParser.f47496o;
            Expression<Double> expression = DivGridJsonParser.f47484c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47515h, jSONObject, "animators", this.f47503a.v1(), this.f47503a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47516i, jSONObject, A2.f54950g, this.f47503a.H1(), this.f47503a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47517j, jSONObject, "border", this.f47503a.N1(), this.f47503a.L1());
            Field<Expression<Boolean>> field4 = divGridTemplate.f47518k;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivGridJsonParser.f47485d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field5 = divGridTemplate.f47519l;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field5, jSONObject, "column_count", typeHelper5, lVar5, DivGridJsonParser.f47497p);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.f47520m, jSONObject, "column_span", typeHelper5, lVar5, DivGridJsonParser.f47498q);
            Field<Expression<DivAlignmentHorizontal>> field6 = divGridTemplate.f47521n;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGridJsonParser.f47493l;
            Expression<DivAlignmentHorizontal> expression4 = DivGridJsonParser.f47486e;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression4);
            if (expressionResolveOptionalExpression6 != null) {
                expression4 = expressionResolveOptionalExpression6;
            }
            Field<Expression<DivAlignmentVertical>> field7 = divGridTemplate.f47522o;
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGridJsonParser.f47494m;
            Expression<DivAlignmentVertical> expression5 = DivGridJsonParser.f47487f;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression5);
            if (expressionResolveOptionalExpression7 != null) {
                expression5 = expressionResolveOptionalExpression7;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47523p, jSONObject, "disappear_actions", this.f47503a.R2(), this.f47503a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47524q, jSONObject, "doubletap_actions", this.f47503a.w0(), this.f47503a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47525r, jSONObject, "extensions", this.f47503a.d3(), this.f47503a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47526s, jSONObject, "focus", this.f47503a.B3(), this.f47503a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47527t, jSONObject, "functions", this.f47503a.K3(), this.f47503a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47528u, jSONObject, "height", this.f47503a.a7(), this.f47503a.Y6());
            if (divSize == null) {
                divSize = DivGridJsonParser.f47488g;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47529v, jSONObject, "hover_end_actions", this.f47503a.w0(), this.f47503a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47530w, jSONObject, "hover_start_actions", this.f47503a.w0(), this.f47503a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47531x, jSONObject, "id");
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.f47532y, jSONObject, "items", this.f47503a.O4(), this.f47503a.M4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.f47533z, jSONObject, "layout_provider", this.f47503a.R4(), this.f47503a.P4());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.A, jSONObject, "longtap_actions", this.f47503a.w0(), this.f47503a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.B, jSONObject, "margins", this.f47503a.a3(), this.f47503a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.C, jSONObject, "paddings", this.f47503a.a3(), this.f47503a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.D, jSONObject, "press_end_actions", this.f47503a.w0(), this.f47503a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.E, jSONObject, "press_start_actions", this.f47503a.w0(), this.f47503a.u0());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.F, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.G, jSONObject, "row_span", typeHelper5, lVar5, DivGridJsonParser.f47499r);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.H, jSONObject, "selected_actions", this.f47503a.w0(), this.f47503a.u0());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.I, jSONObject, "tooltips", this.f47503a.R8(), this.f47503a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.J, jSONObject, "transform", this.f47503a.d9(), this.f47503a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.K, jSONObject, "transition_change", this.f47503a.W1(), this.f47503a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.L, jSONObject, "transition_in", this.f47503a.B1(), this.f47503a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.M, jSONObject, "transition_out", this.f47503a.B1(), this.f47503a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.N, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGridJsonParser.f47500s);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.O, jSONObject, "variable_triggers", this.f47503a.g9(), this.f47503a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.P, jSONObject, "variables", this.f47503a.m9(), this.f47503a.k9());
            Field<Expression<DivVisibility>> field8 = divGridTemplate.Q;
            TypeHelper<DivVisibility> typeHelper8 = DivGridJsonParser.f47495n;
            bk.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression6 = DivGridJsonParser.f47489h;
            Expression<DivVisibility> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper8, lVar6, expression6);
            Expression<DivVisibility> expression7 = expressionResolveOptionalExpression10 == null ? expression6 : expressionResolveOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.R, jSONObject, "visibility_action", this.f47503a.y9(), this.f47503a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.S, jSONObject, "visibility_actions", this.f47503a.y9(), this.f47503a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.T, jSONObject, "width", this.f47503a.a7(), this.f47503a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGridJsonParser.f47490i;
            }
            return new DivGrid(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, listResolveOptionalList3, divBorder, expression3, expressionResolveExpression, expressionResolveOptionalExpression5, expression4, expression5, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, listResolveOptionalList10, divLayoutProvider, listResolveOptionalList11, divEdgeInsets, divEdgeInsets2, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList14, listResolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression7, divVisibilityAction, listResolveOptionalList19, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47503a = jsonParserComponent;
        }
    }

    public static final boolean f(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f47483b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47484c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47485d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        f47486e = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        f47487f = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f47488g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f47489h = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f47490i = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f47491j = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47492k = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47493l = companion2.from(divAlignmentHorizontal, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47494m = companion2.from(divAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47495n = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f47496o = new ValueValidator() { // from class: oe.x4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f47497p = new ValueValidator() { // from class: oe.y4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.g(((Long) obj).longValue());
            }
        };
        f47498q = new ValueValidator() { // from class: oe.z4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.h(((Long) obj).longValue());
            }
        };
        f47499r = new ValueValidator() { // from class: oe.a5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGridJsonParser.i(((Long) obj).longValue());
            }
        };
        f47500s = new ListValidator() { // from class: oe.b5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivGridJsonParser.j(list);
            }
        };
    }

    public static final boolean j(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
