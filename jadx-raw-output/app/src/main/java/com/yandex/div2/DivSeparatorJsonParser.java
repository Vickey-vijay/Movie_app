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
import com.yandex.div2.DivSeparatorJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSeparatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48713a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivAnimation f48714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f48716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f48717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f48718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f48719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f48720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f48721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f48722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f48726n;

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48727a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f48727a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f48727a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f48727a.q1());
            if (divAnimation == null) {
                divAnimation = DivSeparatorJsonParser.f48714b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f48727a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSeparatorJsonParser.f48720h, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSeparatorJsonParser.f48721i, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSeparatorJsonParser.f48723k;
            Expression<Double> expression = DivSeparatorJsonParser.f48715c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f48727a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f48727a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f48727a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSeparatorJsonParser.f48716d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression2);
            Expression<Boolean> expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, lVar3, DivSeparatorJsonParser.f48724l);
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "delimiter_style", this.f48727a.J6());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f48727a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f48727a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f48727a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f48727a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f48727a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f48727a.Y6());
            if (divSize == null) {
                divSize = DivSeparatorJsonParser.f48717e;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f48727a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f48727a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f48727a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f48727a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f48727a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f48727a.Y2());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f48727a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f48727a.u0());
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, lVar3, DivSeparatorJsonParser.f48725m);
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f48727a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f48727a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f48727a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f48727a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f48727a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f48727a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSeparatorJsonParser.f48726n);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f48727a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f48727a.k9());
            TypeHelper<DivVisibility> typeHelper4 = DivSeparatorJsonParser.f48722j;
            bk.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = DivSeparatorJsonParser.f48718f;
            Expression<DivVisibility> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, lVar4, expression4);
            Expression<DivVisibility> expression5 = optionalExpression8 == null ? expression4 : optionalExpression8;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f48727a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f48727a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f48727a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSeparatorJsonParser.f48719g;
            }
            return new DivSeparator(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, divBorder, expression3, optionalExpression5, delimiterStyle, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str, divLayoutProvider, optionalList10, divEdgeInsets, divEdgeInsets2, optionalList11, optionalList12, optionalExpression6, optionalExpression7, optionalList13, optionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList15, optionalList16, optionalList17, expression5, divVisibilityAction, optionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSeparator divSeparator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSeparator.q(), this.f48727a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divSeparator.f48673b, this.f48727a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divSeparator.f48674c, this.f48727a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divSeparator.f48675d, this.f48727a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSeparator.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSeparator.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSeparator.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSeparator.y(), this.f48727a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divSeparator.getBackground(), this.f48727a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSeparator.z(), this.f48727a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divSeparator.f48682k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSeparator.b());
            JsonPropertyParser.write(parsingContext, jSONObject, "delimiter_style", divSeparator.f48684m, this.f48727a.J6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSeparator.k(), this.f48727a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divSeparator.f48686o, this.f48727a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSeparator.getExtensions(), this.f48727a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSeparator.p(), this.f48727a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSeparator.w(), this.f48727a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSeparator.getHeight(), this.f48727a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divSeparator.f48691t, this.f48727a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divSeparator.f48692u, this.f48727a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSeparator.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSeparator.t(), this.f48727a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divSeparator.f48695x, this.f48727a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSeparator.d(), this.f48727a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSeparator.r(), this.f48727a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divSeparator.A, this.f48727a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divSeparator.B, this.f48727a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSeparator.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSeparator.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSeparator.s(), this.f48727a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSeparator.h(), this.f48727a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSeparator.l(), this.f48727a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSeparator.j(), this.f48727a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSeparator.x(), this.f48727a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSeparator.i(), this.f48727a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSeparator.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSeparator.u(), this.f48727a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSeparator.c(), this.f48727a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSeparator.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSeparator.v(), this.f48727a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSeparator.a(), this.f48727a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSeparator.getWidth(), this.f48727a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48727a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48728a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparatorTemplate deserialize(ParsingContext parsingContext, DivSeparatorTemplate divSeparatorTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48730a : null, this.f48728a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48731b : null, this.f48728a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48732c : null, this.f48728a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48733d : null, this.f48728a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSeparatorJsonParser.f48720h, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48734e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSeparatorJsonParser.f48721i, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48735f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48736g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSeparatorJsonParser.f48723k);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48737h : null, this.f48728a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48738i : null, this.f48728a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48739j : null, this.f48728a.M1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48740k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSeparatorTemplate != null ? divSeparatorTemplate.f48741l : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivSeparatorJsonParser.f48724l);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "delimiter_style", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48742m : null, this.f48728a.K6());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48743n : null, this.f48728a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48744o : null, this.f48728a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48745p : null, this.f48728a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48746q : null, this.f48728a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48747r : null, this.f48728a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48748s : null, this.f48728a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48749t : null, this.f48728a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48750u : null, this.f48728a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48751v : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48752w : null, this.f48728a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48753x : null, this.f48728a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48754y : null, this.f48728a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.f48755z : null, this.f48728a.Z2());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.A : null, this.f48728a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.B : null, this.f48728a.v0());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.C : null);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.D : null, lVar, DivSeparatorJsonParser.f48725m);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.E : null, this.f48728a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.F : null, this.f48728a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.G : null, this.f48728a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.H : null, this.f48728a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.I : null, this.f48728a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.J : null, this.f48728a.A1());
            Field<List<DivTransitionTrigger>> field2 = divSeparatorTemplate != null ? divSeparatorTemplate.K : null;
            bk.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivSeparatorJsonParser.f48726n;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSeparatorTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalField5, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalListField11, optionalListField12, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField13, optionalListField14, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.L : null, this.f48728a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.M : null, this.f48728a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSeparatorJsonParser.f48722j, allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.O : null, this.f48728a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.P : null, this.f48728a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSeparatorTemplate != null ? divSeparatorTemplate.Q : null, this.f48728a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSeparatorTemplate divSeparatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSeparatorTemplate.f48730a, this.f48728a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divSeparatorTemplate.f48731b, this.f48728a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divSeparatorTemplate.f48732c, this.f48728a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divSeparatorTemplate.f48733d, this.f48728a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSeparatorTemplate.f48734e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSeparatorTemplate.f48735f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSeparatorTemplate.f48736g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSeparatorTemplate.f48737h, this.f48728a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divSeparatorTemplate.f48738i, this.f48728a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divSeparatorTemplate.f48739j, this.f48728a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divSeparatorTemplate.f48740k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSeparatorTemplate.f48741l);
            JsonFieldParser.writeField(parsingContext, jSONObject, "delimiter_style", divSeparatorTemplate.f48742m, this.f48728a.K6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSeparatorTemplate.f48743n, this.f48728a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divSeparatorTemplate.f48744o, this.f48728a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSeparatorTemplate.f48745p, this.f48728a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSeparatorTemplate.f48746q, this.f48728a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSeparatorTemplate.f48747r, this.f48728a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSeparatorTemplate.f48748s, this.f48728a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divSeparatorTemplate.f48749t, this.f48728a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divSeparatorTemplate.f48750u, this.f48728a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSeparatorTemplate.f48751v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSeparatorTemplate.f48752w, this.f48728a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divSeparatorTemplate.f48753x, this.f48728a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSeparatorTemplate.f48754y, this.f48728a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSeparatorTemplate.f48755z, this.f48728a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divSeparatorTemplate.A, this.f48728a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divSeparatorTemplate.B, this.f48728a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSeparatorTemplate.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSeparatorTemplate.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSeparatorTemplate.E, this.f48728a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSeparatorTemplate.F, this.f48728a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSeparatorTemplate.G, this.f48728a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSeparatorTemplate.H, this.f48728a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSeparatorTemplate.I, this.f48728a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSeparatorTemplate.J, this.f48728a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSeparatorTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSeparatorTemplate.L, this.f48728a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSeparatorTemplate.M, this.f48728a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSeparatorTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSeparatorTemplate.O, this.f48728a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSeparatorTemplate.P, this.f48728a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSeparatorTemplate.Q, this.f48728a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48728a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSeparatorTemplate, DivSeparator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48729a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator resolve(ParsingContext parsingContext, DivSeparatorTemplate divSeparatorTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48730a, jSONObject, "accessibility", this.f48729a.J(), this.f48729a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48731b, jSONObject, "action", this.f48729a.w0(), this.f48729a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48732c, jSONObject, "action_animation", this.f48729a.s1(), this.f48729a.q1());
            if (divAnimation == null) {
                divAnimation = DivSeparatorJsonParser.f48714b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48733d, jSONObject, "actions", this.f48729a.w0(), this.f48729a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.f48734e, jSONObject, "alignment_horizontal", DivSeparatorJsonParser.f48720h, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.f48735f, jSONObject, "alignment_vertical", DivSeparatorJsonParser.f48721i, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSeparatorTemplate.f48736g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSeparatorJsonParser.f48723k;
            Expression<Double> expression = DivSeparatorJsonParser.f48715c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48737h, jSONObject, "animators", this.f48729a.v1(), this.f48729a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48738i, jSONObject, A2.f54950g, this.f48729a.H1(), this.f48729a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48739j, jSONObject, "border", this.f48729a.N1(), this.f48729a.L1());
            Field<Expression<Boolean>> field2 = divSeparatorTemplate.f48740k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivSeparatorJsonParser.f48716d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field3 = divSeparatorTemplate.f48741l;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper3, lVar3, DivSeparatorJsonParser.f48724l);
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48742m, jSONObject, "delimiter_style", this.f48729a.L6(), this.f48729a.J6());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48743n, jSONObject, "disappear_actions", this.f48729a.R2(), this.f48729a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48744o, jSONObject, "doubletap_actions", this.f48729a.w0(), this.f48729a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48745p, jSONObject, "extensions", this.f48729a.d3(), this.f48729a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48746q, jSONObject, "focus", this.f48729a.B3(), this.f48729a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48747r, jSONObject, "functions", this.f48729a.K3(), this.f48729a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48748s, jSONObject, "height", this.f48729a.a7(), this.f48729a.Y6());
            if (divSize == null) {
                divSize = DivSeparatorJsonParser.f48717e;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48749t, jSONObject, "hover_end_actions", this.f48729a.w0(), this.f48729a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48750u, jSONObject, "hover_start_actions", this.f48729a.w0(), this.f48729a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48751v, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48752w, jSONObject, "layout_provider", this.f48729a.R4(), this.f48729a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.f48753x, jSONObject, "longtap_actions", this.f48729a.w0(), this.f48729a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48754y, jSONObject, "margins", this.f48729a.a3(), this.f48729a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.f48755z, jSONObject, "paddings", this.f48729a.a3(), this.f48729a.Y2());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.A, jSONObject, "press_end_actions", this.f48729a.w0(), this.f48729a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.B, jSONObject, "press_start_actions", this.f48729a.w0(), this.f48729a.u0());
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.C, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSeparatorTemplate.D, jSONObject, "row_span", typeHelper3, lVar3, DivSeparatorJsonParser.f48725m);
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.E, jSONObject, "selected_actions", this.f48729a.w0(), this.f48729a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.F, jSONObject, "tooltips", this.f48729a.R8(), this.f48729a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.G, jSONObject, "transform", this.f48729a.d9(), this.f48729a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.H, jSONObject, "transition_change", this.f48729a.W1(), this.f48729a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.I, jSONObject, "transition_in", this.f48729a.B1(), this.f48729a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.J, jSONObject, "transition_out", this.f48729a.B1(), this.f48729a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSeparatorJsonParser.f48726n);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.L, jSONObject, "variable_triggers", this.f48729a.g9(), this.f48729a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.M, jSONObject, "variables", this.f48729a.m9(), this.f48729a.k9());
            Field<Expression<DivVisibility>> field4 = divSeparatorTemplate.N;
            TypeHelper<DivVisibility> typeHelper4 = DivSeparatorJsonParser.f48722j;
            bk.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = DivSeparatorJsonParser.f48718f;
            Expression<DivVisibility> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper4, lVar4, expression4);
            Expression<DivVisibility> expression5 = expressionResolveOptionalExpression8 == null ? expression4 : expressionResolveOptionalExpression8;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.O, jSONObject, "visibility_action", this.f48729a.y9(), this.f48729a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divSeparatorTemplate.P, jSONObject, "visibility_actions", this.f48729a.y9(), this.f48729a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSeparatorTemplate.Q, jSONObject, "width", this.f48729a.a7(), this.f48729a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSeparatorJsonParser.f48719g;
            }
            return new DivSeparator(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression5, delimiterStyle, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, divLayoutProvider, listResolveOptionalList10, divEdgeInsets, divEdgeInsets2, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression6, expressionResolveOptionalExpression7, listResolveOptionalList13, listResolveOptionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression5, divVisibilityAction, listResolveOptionalList18, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48729a = jsonParserComponent;
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
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f48714b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f48715c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48716d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        int i10 = 7;
        ck.i iVar = null;
        f48717e = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, null, i10, iVar));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f48718f = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f48719g = new DivSize.c(new DivMatchParentSize(null == true ? 1 : 0, divSizeUnitValue, null == true ? 1 : 0, i10, iVar));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48720h = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f48721i = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f48722j = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f48723k = new ValueValidator() { // from class: oe.t8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSeparatorJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f48724l = new ValueValidator() { // from class: oe.u8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSeparatorJsonParser.f(((Long) obj).longValue());
            }
        };
        f48725m = new ValueValidator() { // from class: oe.v8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSeparatorJsonParser.g(((Long) obj).longValue());
            }
        };
        f48726n = new ListValidator() { // from class: oe.w8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSeparatorJsonParser.h(list);
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
