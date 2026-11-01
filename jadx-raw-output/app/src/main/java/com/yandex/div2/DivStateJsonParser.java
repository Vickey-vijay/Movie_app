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
import com.yandex.div2.DivStateJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivStateJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49053a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivAnimation f49054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f49058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivTransitionSelector> f49059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f49060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f49061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f49062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f49063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTransitionSelector> f49064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f49065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f49066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivState.State> f49069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f49070r;

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49071a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivState deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f49071a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f49071a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f49071a.q1());
            if (divAnimation == null) {
                divAnimation = DivStateJsonParser.f49054b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f49071a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivStateJsonParser.f49062j, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivStateJsonParser.f49063k, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStateJsonParser.f49066n;
            Expression<Double> expression = DivStateJsonParser.f49055c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f49071a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f49071a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f49071a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivStateJsonParser.f49056d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            Expression<Boolean> expression3 = DivStateJsonParser.f49057e;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, lVar2, expression3);
            if (optionalExpression5 != null) {
                expression3 = optionalExpression5;
            }
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, lVar3, DivStateJsonParser.f49067o);
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_state_id", typeHelper4);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f49071a.P2());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div_id");
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f49071a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f49071a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f49071a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f49071a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f49071a.Y6());
            if (divSize == null) {
                divSize = DivStateJsonParser.f49058f;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f49071a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f49071a.u0());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f49071a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f49071a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f49071a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f49071a.Y2());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f49071a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f49071a.u0());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, lVar3, DivStateJsonParser.f49068p);
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f49071a.u0());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "state_id_variable");
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "states", this.f49071a.w7(), DivStateJsonParser.f49069q);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f49071a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f49071a.b9());
            TypeHelper<DivTransitionSelector> typeHelper5 = DivStateJsonParser.f49064l;
            bk.l<String, DivTransitionSelector> lVar4 = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression4 = DivStateJsonParser.f49059g;
            Expression<DivTransitionSelector> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "transition_animation_selector", typeHelper5, lVar4, expression4);
            Expression<DivTransitionSelector> expression5 = optionalExpression10 == null ? expression4 : optionalExpression10;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f49071a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f49071a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f49071a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivStateJsonParser.f49070r);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f49071a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f49071a.k9());
            TypeHelper<DivVisibility> typeHelper6 = DivStateJsonParser.f49065m;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression6 = DivStateJsonParser.f49060h;
            Expression<DivVisibility> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, lVar5, expression6);
            Expression<DivVisibility> expression7 = optionalExpression11 == null ? expression6 : optionalExpression11;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f49071a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f49071a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f49071a.Y6());
            if (divSize3 == null) {
                divSize3 = DivStateJsonParser.f49061i;
            }
            return new DivState(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, divBorder, expression2, expression3, optionalExpression6, optionalExpression7, optionalList4, str, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str2, divLayoutProvider, optionalList10, divEdgeInsets, divEdgeInsets2, optionalList11, optionalList12, optionalExpression8, optionalExpression9, optionalList13, str3, list, optionalList14, divTransform, expression5, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList15, optionalList16, optionalList17, expression7, divVisibilityAction, optionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivState divState) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divState.q(), this.f49071a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divState.f49020b, this.f49071a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divState.f49021c, this.f49071a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divState.f49022d, this.f49071a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divState.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divState.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divState.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divState.y(), this.f49071a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divState.getBackground(), this.f49071a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divState.z(), this.f49071a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divState.f49029k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", divState.f49030l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divState.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_state_id", divState.f49032n);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divState.k(), this.f49071a.P2());
            JsonPropertyParser.write(parsingContext, jSONObject, "div_id", divState.f49034p);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divState.f49035q, this.f49071a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divState.getExtensions(), this.f49071a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divState.p(), this.f49071a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divState.w(), this.f49071a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divState.getHeight(), this.f49071a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divState.f49040v, this.f49071a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divState.f49041w, this.f49071a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divState.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divState.t(), this.f49071a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divState.f49044z, this.f49071a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divState.d(), this.f49071a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divState.r(), this.f49071a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divState.C, this.f49071a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divState.D, this.f49071a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divState.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divState.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divState.s(), this.f49071a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "state_id_variable", divState.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", divState.I, this.f49071a.w7());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divState.h(), this.f49071a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divState.l(), this.f49071a.b9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", divState.L, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divState.j(), this.f49071a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divState.x(), this.f49071a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divState.i(), this.f49071a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divState.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divState.u(), this.f49071a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divState.c(), this.f49071a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divState.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divState.v(), this.f49071a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divState.a(), this.f49071a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divState.getWidth(), this.f49071a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49071a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49072a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivStateTemplate deserialize(ParsingContext parsingContext, DivStateTemplate divStateTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49080a : null, this.f49072a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49081b : null, this.f49072a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49082c : null, this.f49072a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49083d : null, this.f49072a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivStateJsonParser.f49062j, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49084e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivStateJsonParser.f49063k, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49085f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49086g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivStateJsonParser.f49066n);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49087h : null, this.f49072a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49088i : null, this.f49072a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49089j : null, this.f49072a.M1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divStateTemplate != null ? divStateTemplate.f49090k : null;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, lVar);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49091l : null, lVar);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divStateTemplate != null ? divStateTemplate.f49092m : null;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, lVar2, DivStateJsonParser.f49067o);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_state_id", typeHelper3, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49093n : null);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49094o : null, this.f49072a.Q2());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "div_id", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49095p : null);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49096q : null, this.f49072a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49097r : null, this.f49072a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49098s : null, this.f49072a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49099t : null, this.f49072a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49100u : null, this.f49072a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49101v : null, this.f49072a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49102w : null, this.f49072a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49103x : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49104y : null, this.f49072a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.f49105z : null, this.f49072a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.A : null, this.f49072a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.B : null, this.f49072a.Z2());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.C : null, this.f49072a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.D : null, this.f49072a.v0());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.E : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.F : null, lVar2, DivStateJsonParser.f49068p);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.G : null, this.f49072a.v0());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "state_id_variable", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.H : null);
            Field<List<DivStateTemplate.StateTemplate>> field3 = divStateTemplate != null ? divStateTemplate.I : null;
            mj.g<x3> gVarX7 = this.f49072a.x7();
            ListValidator<DivState.State> listValidator = DivStateJsonParser.f49069q;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field3, gVarX7, listValidator);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.J : null, this.f49072a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.K : null, this.f49072a.c9());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "transition_animation_selector", DivStateJsonParser.f49064l, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.L : null, DivTransitionSelector.FROM_STRING);
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.M : null, this.f49072a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.N : null, this.f49072a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.O : null, this.f49072a.A1());
            Field<List<DivTransitionTrigger>> field4 = divStateTemplate != null ? divStateTemplate.P : null;
            bk.l<String, DivTransitionTrigger> lVar3 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator2 = DivStateJsonParser.f49070r;
            ck.p.h(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivStateTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalField5, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalListField11, optionalListField12, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField13, optionalField12, listField, optionalListField14, optionalField13, optionalFieldWithExpression10, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar3, listValidator2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.Q : null, this.f49072a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.R : null, this.f49072a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivStateJsonParser.f49065m, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.S : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.T : null, this.f49072a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.U : null, this.f49072a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.V : null, this.f49072a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivStateTemplate divStateTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divStateTemplate.f49080a, this.f49072a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divStateTemplate.f49081b, this.f49072a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divStateTemplate.f49082c, this.f49072a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divStateTemplate.f49083d, this.f49072a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divStateTemplate.f49084e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divStateTemplate.f49085f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divStateTemplate.f49086g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divStateTemplate.f49087h, this.f49072a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divStateTemplate.f49088i, this.f49072a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divStateTemplate.f49089j, this.f49072a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divStateTemplate.f49090k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", divStateTemplate.f49091l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divStateTemplate.f49092m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_state_id", divStateTemplate.f49093n);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divStateTemplate.f49094o, this.f49072a.Q2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "div_id", divStateTemplate.f49095p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divStateTemplate.f49096q, this.f49072a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divStateTemplate.f49097r, this.f49072a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divStateTemplate.f49098s, this.f49072a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divStateTemplate.f49099t, this.f49072a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divStateTemplate.f49100u, this.f49072a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divStateTemplate.f49101v, this.f49072a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divStateTemplate.f49102w, this.f49072a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divStateTemplate.f49103x);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divStateTemplate.f49104y, this.f49072a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divStateTemplate.f49105z, this.f49072a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divStateTemplate.A, this.f49072a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divStateTemplate.B, this.f49072a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divStateTemplate.C, this.f49072a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divStateTemplate.D, this.f49072a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divStateTemplate.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divStateTemplate.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divStateTemplate.G, this.f49072a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "state_id_variable", divStateTemplate.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", divStateTemplate.I, this.f49072a.x7());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divStateTemplate.J, this.f49072a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divStateTemplate.K, this.f49072a.c9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", divStateTemplate.L, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divStateTemplate.M, this.f49072a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divStateTemplate.N, this.f49072a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divStateTemplate.O, this.f49072a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divStateTemplate.P, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divStateTemplate.Q, this.f49072a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divStateTemplate.R, this.f49072a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divStateTemplate.S, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divStateTemplate.T, this.f49072a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divStateTemplate.U, this.f49072a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divStateTemplate.V, this.f49072a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49072a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivStateJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivStateTemplate, DivState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49073a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivState resolve(ParsingContext parsingContext, DivStateTemplate divStateTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49080a, jSONObject, "accessibility", this.f49073a.J(), this.f49073a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49081b, jSONObject, "action", this.f49073a.w0(), this.f49073a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49082c, jSONObject, "action_animation", this.f49073a.s1(), this.f49073a.q1());
            if (divAnimation == null) {
                divAnimation = DivStateJsonParser.f49054b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49083d, jSONObject, "actions", this.f49073a.w0(), this.f49073a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.f49084e, jSONObject, "alignment_horizontal", DivStateJsonParser.f49062j, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.f49085f, jSONObject, "alignment_vertical", DivStateJsonParser.f49063k, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divStateTemplate.f49086g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivStateJsonParser.f49066n;
            Expression<Double> expression = DivStateJsonParser.f49055c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49087h, jSONObject, "animators", this.f49073a.v1(), this.f49073a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49088i, jSONObject, A2.f54950g, this.f49073a.H1(), this.f49073a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49089j, jSONObject, "border", this.f49073a.N1(), this.f49073a.L1());
            Field<Expression<Boolean>> field2 = divStateTemplate.f49090k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivStateJsonParser.f49056d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Boolean>> field3 = divStateTemplate.f49091l;
            Expression<Boolean> expression4 = DivStateJsonParser.f49057e;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, lVar2, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Field<Expression<Long>> field4 = divStateTemplate.f49092m;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, lVar3, DivStateJsonParser.f49067o);
            Field<Expression<String>> field5 = divStateTemplate.f49093n;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "default_state_id", typeHelper4);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49094o, jSONObject, "disappear_actions", this.f49073a.R2(), this.f49073a.P2());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49095p, jSONObject, "div_id");
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49096q, jSONObject, "doubletap_actions", this.f49073a.w0(), this.f49073a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49097r, jSONObject, "extensions", this.f49073a.d3(), this.f49073a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49098s, jSONObject, "focus", this.f49073a.B3(), this.f49073a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49099t, jSONObject, "functions", this.f49073a.K3(), this.f49073a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49100u, jSONObject, "height", this.f49073a.a7(), this.f49073a.Y6());
            if (divSize == null) {
                divSize = DivStateJsonParser.f49058f;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49101v, jSONObject, "hover_end_actions", this.f49073a.w0(), this.f49073a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49102w, jSONObject, "hover_start_actions", this.f49073a.w0(), this.f49073a.u0());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49103x, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.f49104y, jSONObject, "layout_provider", this.f49073a.R4(), this.f49073a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.f49105z, jSONObject, "longtap_actions", this.f49073a.w0(), this.f49073a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.A, jSONObject, "margins", this.f49073a.a3(), this.f49073a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.B, jSONObject, "paddings", this.f49073a.a3(), this.f49073a.Y2());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.C, jSONObject, "press_end_actions", this.f49073a.w0(), this.f49073a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.D, jSONObject, "press_start_actions", this.f49073a.w0(), this.f49073a.u0());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.E, jSONObject, "reuse_id", typeHelper4);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.F, jSONObject, "row_span", typeHelper3, lVar3, DivStateJsonParser.f49068p);
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.G, jSONObject, "selected_actions", this.f49073a.w0(), this.f49073a.u0());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.H, jSONObject, "state_id_variable");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divStateTemplate.I, jSONObject, "states", this.f49073a.y7(), this.f49073a.w7(), DivStateJsonParser.f49069q);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.J, jSONObject, "tooltips", this.f49073a.R8(), this.f49073a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.K, jSONObject, "transform", this.f49073a.d9(), this.f49073a.b9());
            Field<Expression<DivTransitionSelector>> field6 = divStateTemplate.L;
            TypeHelper<DivTransitionSelector> typeHelper5 = DivStateJsonParser.f49064l;
            bk.l<String, DivTransitionSelector> lVar4 = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression5 = DivStateJsonParser.f49059g;
            Expression<DivTransitionSelector> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "transition_animation_selector", typeHelper5, lVar4, expression5);
            Expression<DivTransitionSelector> expression6 = expressionResolveOptionalExpression10 == null ? expression5 : expressionResolveOptionalExpression10;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.M, jSONObject, "transition_change", this.f49073a.W1(), this.f49073a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.N, jSONObject, "transition_in", this.f49073a.B1(), this.f49073a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.O, jSONObject, "transition_out", this.f49073a.B1(), this.f49073a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.P, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivStateJsonParser.f49070r);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.Q, jSONObject, "variable_triggers", this.f49073a.g9(), this.f49073a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.R, jSONObject, "variables", this.f49073a.m9(), this.f49073a.k9());
            Field<Expression<DivVisibility>> field7 = divStateTemplate.S;
            TypeHelper<DivVisibility> typeHelper6 = DivStateJsonParser.f49065m;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression7 = DivStateJsonParser.f49060h;
            Expression<DivVisibility> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "visibility", typeHelper6, lVar5, expression7);
            Expression<DivVisibility> expression8 = expressionResolveOptionalExpression11 == null ? expression7 : expressionResolveOptionalExpression11;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.T, jSONObject, "visibility_action", this.f49073a.y9(), this.f49073a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.U, jSONObject, "visibility_actions", this.f49073a.y9(), this.f49073a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.V, jSONObject, "width", this.f49073a.a7(), this.f49073a.Y6());
            if (divSize3 == null) {
                divSize3 = DivStateJsonParser.f49061i;
            }
            return new DivState(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, listResolveOptionalList3, divBorder, expression3, expression4, expressionResolveOptionalExpression6, expressionResolveOptionalExpression7, listResolveOptionalList4, str, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str2, divLayoutProvider, listResolveOptionalList10, divEdgeInsets, divEdgeInsets2, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList13, str3, listResolveList, listResolveOptionalList14, divTransform, expression6, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression8, divVisibilityAction, listResolveOptionalList18, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49073a = jsonParserComponent;
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f49054b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f49055c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f49056d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49057e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        f49058f = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, null == true ? 1 : 0, 7, null));
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.STATE_CHANGE;
        f49059g = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f49060h = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f49061i = new DivSize.c(new DivMatchParentSize(divSizeUnitValue, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49062j = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f49063k = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f49064l = companion2.from(divTransitionSelector, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTransitionSelector);
            }
        });
        f49065m = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f49066n = new ValueValidator() { // from class: oe.p9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStateJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f49067o = new ValueValidator() { // from class: oe.q9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStateJsonParser.g(((Long) obj).longValue());
            }
        };
        f49068p = new ValueValidator() { // from class: oe.r9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivStateJsonParser.h(((Long) obj).longValue());
            }
        };
        f49069q = new ListValidator() { // from class: oe.s9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivStateJsonParser.i(list);
            }
        };
        f49070r = new ListValidator() { // from class: oe.t9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivStateJsonParser.j(list);
            }
        };
    }

    public static final boolean i(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }

    public static final boolean j(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
