package com.yandex.div2;

import androidx.core.graphics.drawable.IconCompat;
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
import com.yandex.div2.DivImageJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivImageJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47621a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivAnimation f47622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentHorizontal> f47625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentVertical> f47626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f47627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f47629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivImageScale> f47631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivBlendMode> f47632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f47633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f47634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47635o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivImageScale> f47639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivBlendMode> f47640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f47641u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47642v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f47645y;

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47646a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImage deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f47646a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f47646a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f47646a.q1());
            if (divAnimation == null) {
                divAnimation = DivImageJsonParser.f47622b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f47646a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivImageJsonParser.f47635o;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivImageJsonParser.f47636p;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageJsonParser.f47642v;
            Expression<Double> expression = DivImageJsonParser.f47623c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f47646a.t1());
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "appearance_animation", this.f47646a.e3());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f47646a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f47646a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f47646a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivImageJsonParser.f47624d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivImageJsonParser.f47643w);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivImageJsonParser.f47637q;
            Expression<DivAlignmentHorizontal> expression3 = DivImageJsonParser.f47625e;
            Expression<DivAlignmentHorizontal> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivImageJsonParser.f47638r;
            Expression<DivAlignmentVertical> expression4 = DivImageJsonParser.f47626f;
            Expression<DivAlignmentVertical> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression4);
            Expression<DivAlignmentVertical> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f47646a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f47646a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f47646a.b3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f47646a.h3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f47646a.z3());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f47646a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f47646a.Y6());
            if (divSize == null) {
                divSize = DivImageJsonParser.f47627g;
            }
            DivSize divSize2 = divSize;
            Expression<Boolean> expression6 = DivImageJsonParser.f47628h;
            Expression<Boolean> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "high_priority_preview_show", typeHelper4, lVar4, expression6);
            Expression<Boolean> expression7 = optionalExpression8 == null ? expression6 : optionalExpression8;
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f47646a.u0());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f47646a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression expression8 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f47646a.P4());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f47646a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f47646a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f47646a.Y2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression9 = DivImageJsonParser.f47629i;
            Expression<Integer> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, lVar6, expression9);
            if (optionalExpression9 != null) {
                expression9 = optionalExpression9;
            }
            Expression<Boolean> expression10 = DivImageJsonParser.f47630j;
            Expression<Boolean> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, lVar4, expression10);
            if (optionalExpression10 != null) {
                expression10 = optionalExpression10;
            }
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f47646a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f47646a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivImageJsonParser.f47644x);
            TypeHelper<DivImageScale> typeHelper10 = DivImageJsonParser.f47639s;
            bk.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression11 = DivImageJsonParser.f47631k;
            Expression<DivImageScale> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, lVar7, expression11);
            Expression<DivImageScale> expression12 = optionalExpression14 == null ? expression11 : optionalExpression14;
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f47646a.u0());
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", typeHelper8, lVar6);
            TypeHelper<DivBlendMode> typeHelper11 = DivImageJsonParser.f47640t;
            bk.l<String, DivBlendMode> lVar8 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression13 = DivImageJsonParser.f47632l;
            Expression<DivBlendMode> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper11, lVar8, expression13);
            Expression<DivBlendMode> expression14 = optionalExpression16 == null ? expression13 : optionalExpression16;
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f47646a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f47646a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f47646a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f47646a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f47646a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivImageJsonParser.f47645y);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f47646a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f47646a.k9());
            TypeHelper<DivVisibility> typeHelper12 = DivImageJsonParser.f47641u;
            bk.l<String, DivVisibility> lVar9 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression15 = DivImageJsonParser.f47633m;
            Expression<DivVisibility> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper12, lVar9, expression15);
            Expression<DivVisibility> expression16 = optionalExpression17 == null ? expression15 : optionalExpression17;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f47646a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f47646a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f47646a.Y6());
            if (divSize3 == null) {
                divSize3 = DivImageJsonParser.f47634n;
            }
            return new DivImage(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, divFadeTransition, divAspect, optionalList3, divBorder, expression2, optionalExpression5, expression3, expression5, optionalList4, optionalList5, optionalList6, optionalList7, divFocus, optionalList8, divSize2, expression7, optionalList9, optionalList10, str, expression8, divLayoutProvider, optionalList11, divEdgeInsets, divEdgeInsets2, expression9, expression10, optionalList12, optionalList13, optionalExpression11, optionalExpression12, optionalExpression13, expression12, optionalList14, optionalExpression15, expression14, optionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList16, optionalList17, optionalList18, expression16, divVisibilityAction, optionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivImage divImage) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divImage.q(), this.f47646a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divImage.f47551b, this.f47646a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divImage.f47553c, this.f47646a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divImage.f47555d, this.f47646a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divImage.g();
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionN = divImage.n();
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionN, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divImage.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divImage.y(), this.f47646a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "appearance_animation", divImage.f47561i, this.f47646a.e3());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divImage.f47562j, this.f47646a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divImage.getBackground(), this.f47646a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divImage.z(), this.f47646a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divImage.f47565m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divImage.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divImage.f47567o, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divImage.f47568p, lVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divImage.k(), this.f47646a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divImage.f47570r, this.f47646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divImage.getExtensions(), this.f47646a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divImage.f47572t, this.f47646a.h3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divImage.p(), this.f47646a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divImage.w(), this.f47646a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divImage.getHeight(), this.f47646a.Y6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "high_priority_preview_show", divImage.f47576x);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divImage.f47577y, this.f47646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divImage.f47578z, this.f47646a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divImage.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divImage.B, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divImage.t(), this.f47646a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divImage.D, this.f47646a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divImage.d(), this.f47646a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divImage.r(), this.f47646a.Y2());
            Expression<Integer> expression = divImage.G;
            bk.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", expression, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divImage.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divImage.I, this.f47646a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divImage.J, this.f47646a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divImage.K);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divImage.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divImage.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divImage.N, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divImage.s(), this.f47646a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", divImage.P, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, divImage.Q, DivBlendMode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divImage.h(), this.f47646a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divImage.l(), this.f47646a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divImage.j(), this.f47646a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divImage.x(), this.f47646a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divImage.i(), this.f47646a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divImage.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divImage.u(), this.f47646a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divImage.c(), this.f47646a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divImage.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divImage.v(), this.f47646a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divImage.a(), this.f47646a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divImage.getWidth(), this.f47646a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47646a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47647a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageTemplate deserialize(ParsingContext parsingContext, DivImageTemplate divImageTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47665a : null, this.f47647a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47667b : null, this.f47647a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47669c : null, this.f47647a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47671d : null, this.f47647a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivImageJsonParser.f47635o;
            Field<Expression<DivAlignmentHorizontal>> field = divImageTemplate != null ? divImageTemplate.f47672e : null;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivImageJsonParser.f47636p;
            Field<Expression<DivAlignmentVertical>> field2 = divImageTemplate != null ? divImageTemplate.f47673f : null;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47674g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivImageJsonParser.f47642v);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47675h : null, this.f47647a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "appearance_animation", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47676i : null, this.f47647a.f3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47677j : null, this.f47647a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47678k : null, this.f47647a.G1());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47679l : null, this.f47647a.M1());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = divImageTemplate != null ? divImageTemplate.f47680m : null;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, lVar3);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = divImageTemplate != null ? divImageTemplate.f47681n : null;
            bk.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, lVar4, DivImageJsonParser.f47643w);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivImageJsonParser.f47637q, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47682o : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivImageJsonParser.f47638r, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47683p : null, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47684q : null, this.f47647a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47685r : null, this.f47647a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47686s : null, this.f47647a.c3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47687t : null, this.f47647a.i3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47688u : null, this.f47647a.A3());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47689v : null, this.f47647a.J3());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47690w : null, this.f47647a.Z6());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "high_priority_preview_show", typeHelper3, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47691x : null, lVar3);
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47692y : null, this.f47647a.v0());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47693z : null, this.f47647a.v0());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.A : null);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.B : null, ParsingConvertersKt.ANY_TO_URI);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.C : null, this.f47647a.Q4());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.D : null, this.f47647a.v0());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.E : null, this.f47647a.Z2());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.F : null, this.f47647a.Z2());
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field5 = divImageTemplate != null ? divImageTemplate.G : null;
            bk.l<Object, Integer> lVar5 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder_color", typeHelper5, allowPropertyOverride, field5, lVar5);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.H : null, lVar3);
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.I : null, this.f47647a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.J : null, this.f47647a.v0());
            TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper6, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.K : null);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper6, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.L : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.M : null, lVar4, DivImageJsonParser.f47644x);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivImageJsonParser.f47639s, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.N : null, DivImageScale.FROM_STRING);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.O : null, this.f47647a.v0());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_color", typeHelper5, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.P : null, lVar5);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, IconCompat.EXTRA_TINT_MODE, DivImageJsonParser.f47640t, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.Q : null, DivBlendMode.FROM_STRING);
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.R : null, this.f47647a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.S : null, this.f47647a.c9());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.T : null, this.f47647a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.U : null, this.f47647a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.V : null, this.f47647a.A1());
            Field<List<DivTransitionTrigger>> field6 = divImageTemplate != null ? divImageTemplate.W : null;
            bk.l<String, DivTransitionTrigger> lVar6 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivImageJsonParser.f47645y;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivImageTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalField5, optionalListField3, optionalField6, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalListField7, optionalField7, optionalListField8, optionalField8, optionalFieldWithExpression8, optionalListField9, optionalListField10, optionalField9, fieldWithExpression, optionalField10, optionalListField11, optionalField11, optionalField12, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField12, optionalListField13, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField14, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField15, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, lVar6, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.X : null, this.f47647a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.Y : null, this.f47647a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivImageJsonParser.f47641u, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.Z : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47666a0 : null, this.f47647a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47668b0 : null, this.f47647a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f47670c0 : null, this.f47647a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivImageTemplate divImageTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divImageTemplate.f47665a, this.f47647a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divImageTemplate.f47667b, this.f47647a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divImageTemplate.f47669c, this.f47647a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divImageTemplate.f47671d, this.f47647a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divImageTemplate.f47672e;
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divImageTemplate.f47673f;
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divImageTemplate.f47674g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divImageTemplate.f47675h, this.f47647a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "appearance_animation", divImageTemplate.f47676i, this.f47647a.f3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divImageTemplate.f47677j, this.f47647a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divImageTemplate.f47678k, this.f47647a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divImageTemplate.f47679l, this.f47647a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divImageTemplate.f47680m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divImageTemplate.f47681n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divImageTemplate.f47682o, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divImageTemplate.f47683p, lVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divImageTemplate.f47684q, this.f47647a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divImageTemplate.f47685r, this.f47647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divImageTemplate.f47686s, this.f47647a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divImageTemplate.f47687t, this.f47647a.i3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divImageTemplate.f47688u, this.f47647a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divImageTemplate.f47689v, this.f47647a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divImageTemplate.f47690w, this.f47647a.Z6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "high_priority_preview_show", divImageTemplate.f47691x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divImageTemplate.f47692y, this.f47647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divImageTemplate.f47693z, this.f47647a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divImageTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divImageTemplate.B, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divImageTemplate.C, this.f47647a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divImageTemplate.D, this.f47647a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divImageTemplate.E, this.f47647a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divImageTemplate.F, this.f47647a.Z2());
            Field<Expression<Integer>> field3 = divImageTemplate.G;
            bk.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", field3, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divImageTemplate.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divImageTemplate.I, this.f47647a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divImageTemplate.J, this.f47647a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divImageTemplate.K);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divImageTemplate.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divImageTemplate.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divImageTemplate.N, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divImageTemplate.O, this.f47647a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", divImageTemplate.P, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, divImageTemplate.Q, DivBlendMode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divImageTemplate.R, this.f47647a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divImageTemplate.S, this.f47647a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divImageTemplate.T, this.f47647a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divImageTemplate.U, this.f47647a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divImageTemplate.V, this.f47647a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divImageTemplate.W, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divImageTemplate.X, this.f47647a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divImageTemplate.Y, this.f47647a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divImageTemplate.Z, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divImageTemplate.f47666a0, this.f47647a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divImageTemplate.f47668b0, this.f47647a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divImageTemplate.f47670c0, this.f47647a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47647a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivImageTemplate, DivImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47648a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImage resolve(ParsingContext parsingContext, DivImageTemplate divImageTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47665a, jSONObject, "accessibility", this.f47648a.J(), this.f47648a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47667b, jSONObject, "action", this.f47648a.w0(), this.f47648a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47669c, jSONObject, "action_animation", this.f47648a.s1(), this.f47648a.q1());
            if (divAnimation == null) {
                divAnimation = DivImageJsonParser.f47622b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47671d, jSONObject, "actions", this.f47648a.w0(), this.f47648a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divImageTemplate.f47672e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivImageJsonParser.f47635o;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divImageTemplate.f47673f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivImageJsonParser.f47636p;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divImageTemplate.f47674g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageJsonParser.f47642v;
            Expression<Double> expression = DivImageJsonParser.f47623c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47675h, jSONObject, "animators", this.f47648a.v1(), this.f47648a.t1());
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47676i, jSONObject, "appearance_animation", this.f47648a.g3(), this.f47648a.e3());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47677j, jSONObject, "aspect", this.f47648a.E1(), this.f47648a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47678k, jSONObject, A2.f54950g, this.f47648a.H1(), this.f47648a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47679l, jSONObject, "border", this.f47648a.N1(), this.f47648a.L1());
            Field<Expression<Boolean>> field4 = divImageTemplate.f47680m;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivImageJsonParser.f47624d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field5 = divImageTemplate.f47681n;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, lVar5, DivImageJsonParser.f47643w);
            Field<Expression<DivAlignmentHorizontal>> field6 = divImageTemplate.f47682o;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivImageJsonParser.f47637q;
            Expression<DivAlignmentHorizontal> expression4 = DivImageJsonParser.f47625e;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            Field<Expression<DivAlignmentVertical>> field7 = divImageTemplate.f47683p;
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivImageJsonParser.f47638r;
            Expression<DivAlignmentVertical> expression6 = DivImageJsonParser.f47626f;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression6);
            if (expressionResolveOptionalExpression7 != null) {
                expression6 = expressionResolveOptionalExpression7;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47684q, jSONObject, "disappear_actions", this.f47648a.R2(), this.f47648a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47685r, jSONObject, "doubletap_actions", this.f47648a.w0(), this.f47648a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47686s, jSONObject, "extensions", this.f47648a.d3(), this.f47648a.b3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47687t, jSONObject, "filters", this.f47648a.j3(), this.f47648a.h3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47688u, jSONObject, "focus", this.f47648a.B3(), this.f47648a.z3());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47689v, jSONObject, "functions", this.f47648a.K3(), this.f47648a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47690w, jSONObject, "height", this.f47648a.a7(), this.f47648a.Y6());
            if (divSize == null) {
                divSize = DivImageJsonParser.f47627g;
            }
            DivSize divSize2 = divSize;
            Field<Expression<Boolean>> field8 = divImageTemplate.f47691x;
            Expression<Boolean> expression7 = DivImageJsonParser.f47628h;
            Expression<Boolean> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "high_priority_preview_show", typeHelper4, lVar4, expression7);
            if (expressionResolveOptionalExpression8 != null) {
                expression7 = expressionResolveOptionalExpression8;
            }
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47692y, jSONObject, "hover_end_actions", this.f47648a.w0(), this.f47648a.u0());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47693z, jSONObject, "hover_start_actions", this.f47648a.w0(), this.f47648a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.A, jSONObject, "id");
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divImageTemplate.B, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.C, jSONObject, "layout_provider", this.f47648a.R4(), this.f47648a.P4());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.D, jSONObject, "longtap_actions", this.f47648a.w0(), this.f47648a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.E, jSONObject, "margins", this.f47648a.a3(), this.f47648a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.F, jSONObject, "paddings", this.f47648a.a3(), this.f47648a.Y2());
            Field<Expression<Integer>> field9 = divImageTemplate.G;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression8 = DivImageJsonParser.f47629i;
            Expression<Integer> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "placeholder_color", typeHelper8, lVar6, expression8);
            if (expressionResolveOptionalExpression9 != null) {
                expression8 = expressionResolveOptionalExpression9;
            }
            Field<Expression<Boolean>> field10 = divImageTemplate.H;
            Expression<Boolean> expression9 = DivImageJsonParser.f47630j;
            Expression<Boolean> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preload_required", typeHelper4, lVar4, expression9);
            if (expressionResolveOptionalExpression10 != null) {
                expression9 = expressionResolveOptionalExpression10;
            }
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.I, jSONObject, "press_end_actions", this.f47648a.w0(), this.f47648a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.J, jSONObject, "press_start_actions", this.f47648a.w0(), this.f47648a.u0());
            Field<Expression<String>> field11 = divImageTemplate.K;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "preview", typeHelper9);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.L, jSONObject, "reuse_id", typeHelper9);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.M, jSONObject, "row_span", typeHelper5, lVar5, DivImageJsonParser.f47644x);
            Field<Expression<DivImageScale>> field12 = divImageTemplate.N;
            TypeHelper<DivImageScale> typeHelper10 = DivImageJsonParser.f47639s;
            bk.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression10 = DivImageJsonParser.f47631k;
            Expression<DivImageScale> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "scale", typeHelper10, lVar7, expression10);
            Expression<DivImageScale> expression11 = expressionResolveOptionalExpression14 == null ? expression10 : expressionResolveOptionalExpression14;
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.O, jSONObject, "selected_actions", this.f47648a.w0(), this.f47648a.u0());
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.P, jSONObject, "tint_color", typeHelper8, lVar6);
            Field<Expression<DivBlendMode>> field13 = divImageTemplate.Q;
            TypeHelper<DivBlendMode> typeHelper11 = DivImageJsonParser.f47640t;
            bk.l<String, DivBlendMode> lVar8 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression12 = DivImageJsonParser.f47632l;
            Expression<DivBlendMode> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper11, lVar8, expression12);
            Expression<DivBlendMode> expression13 = expressionResolveOptionalExpression16 == null ? expression12 : expressionResolveOptionalExpression16;
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.R, jSONObject, "tooltips", this.f47648a.R8(), this.f47648a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.S, jSONObject, "transform", this.f47648a.d9(), this.f47648a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.T, jSONObject, "transition_change", this.f47648a.W1(), this.f47648a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.U, jSONObject, "transition_in", this.f47648a.B1(), this.f47648a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.V, jSONObject, "transition_out", this.f47648a.B1(), this.f47648a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.W, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivImageJsonParser.f47645y);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.X, jSONObject, "variable_triggers", this.f47648a.g9(), this.f47648a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.Y, jSONObject, "variables", this.f47648a.m9(), this.f47648a.k9());
            Field<Expression<DivVisibility>> field14 = divImageTemplate.Z;
            TypeHelper<DivVisibility> typeHelper12 = DivImageJsonParser.f47641u;
            bk.l<String, DivVisibility> lVar9 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = DivImageJsonParser.f47633m;
            Expression<DivVisibility> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "visibility", typeHelper12, lVar9, expression14);
            Expression<DivVisibility> expression15 = expressionResolveOptionalExpression17 == null ? expression14 : expressionResolveOptionalExpression17;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47666a0, jSONObject, "visibility_action", this.f47648a.y9(), this.f47648a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f47668b0, jSONObject, "visibility_actions", this.f47648a.y9(), this.f47648a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f47670c0, jSONObject, "width", this.f47648a.a7(), this.f47648a.Y6());
            if (divSize3 == null) {
                divSize3 = DivImageJsonParser.f47634n;
            }
            return new DivImage(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, divFadeTransition, divAspect, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression5, expression5, expression6, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, listResolveOptionalList7, divFocus, listResolveOptionalList8, divSize2, expression7, listResolveOptionalList9, listResolveOptionalList10, str, expressionResolveExpression, divLayoutProvider, listResolveOptionalList11, divEdgeInsets, divEdgeInsets2, expression8, expression9, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expression11, listResolveOptionalList14, expressionResolveOptionalExpression15, expression13, listResolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression15, divVisibilityAction, listResolveOptionalList19, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47648a = jsonParserComponent;
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

    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f47622b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47623c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47624d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        f47625e = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f47626f = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f47627g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        f47628h = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f47629i = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f47630j = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        f47631k = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        f47632l = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f47633m = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f47634n = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f47635o = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47636p = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47637q = companion2.from(divAlignmentHorizontal, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47638r = companion2.from(divAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47639s = companion2.from(divImageScale, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        f47640t = companion2.from(divBlendMode, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivBlendMode);
            }
        });
        f47641u = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f47642v = new ValueValidator() { // from class: oe.d5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f47643w = new ValueValidator() { // from class: oe.e5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageJsonParser.f(((Long) obj).longValue());
            }
        };
        f47644x = new ValueValidator() { // from class: oe.f5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageJsonParser.g(((Long) obj).longValue());
            }
        };
        f47645y = new ListValidator() { // from class: oe.g5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivImageJsonParser.h(list);
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
