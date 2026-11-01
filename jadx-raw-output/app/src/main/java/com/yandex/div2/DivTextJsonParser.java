package com.yandex.div2;

import androidx.core.provider.FontsContractCompat;
import androidx.core.view.ViewCompat;
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
import com.yandex.div2.DivTextJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTextJsonParser {

    @Deprecated
    public static final TypeHelper<DivLineStyle> A;

    @Deprecated
    public static final TypeHelper<DivVisibility> B;

    @Deprecated
    public static final ValueValidator<Double> C;

    @Deprecated
    public static final ValueValidator<Long> D;

    @Deprecated
    public static final ValueValidator<Long> E;

    @Deprecated
    public static final ValueValidator<Long> F;

    @Deprecated
    public static final ValueValidator<Long> G;

    @Deprecated
    public static final ValueValidator<Long> H;

    @Deprecated
    public static final ValueValidator<Long> I;

    @Deprecated
    public static final ValueValidator<Long> J;

    @Deprecated
    public static final ListValidator<DivTransitionTrigger> K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49590a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivAnimation f49591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f49595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f49596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivLineStyle> f49599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentHorizontal> f49600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentVertical> f49601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f49602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivText.Truncate> f49604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivLineStyle> f49605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f49606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f49607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f49608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f49609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f49610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f49611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivLineStyle> f49612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f49613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f49614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivText.Truncate> f49615z;

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49616a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f49616a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f49616a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f49616a.q1());
            if (divAnimation == null) {
                divAnimation = DivTextJsonParser.f49591b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f49616a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivTextJsonParser.f49608s;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivTextJsonParser.f49609t;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTextJsonParser.C;
            Expression<Double> expression = DivTextJsonParser.f49592c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f49616a.t1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "auto_ellipsize", typeHelper4, lVar4);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f49616a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f49616a.L1());
            Expression<Boolean> expression2 = DivTextJsonParser.f49593d;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivTextJsonParser.D);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f49616a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f49616a.u0());
            DivText.Ellipsis ellipsis = (DivText.Ellipsis) JsonPropertyParser.readOptional(parsingContext, jSONObject, "ellipsis", this.f49616a.d8());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f49616a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f49616a.z3());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "focused_text_color", typeHelper6, lVar6);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper7);
            ValueValidator<Long> valueValidator2 = DivTextJsonParser.E;
            Expression<Long> expression3 = DivTextJsonParser.f49594e;
            Expression<Long> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression3);
            if (optionalExpression10 != null) {
                expression3 = optionalExpression10;
            }
            TypeHelper<DivSizeUnit> typeHelper8 = DivTextJsonParser.f49610u;
            bk.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression4 = DivTextJsonParser.f49595f;
            Expression<DivSizeUnit> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, lVar7, expression4);
            Expression<DivSizeUnit> expression5 = optionalExpression11 == null ? expression4 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextJsonParser.f49611v, DivFontWeight.FROM_STRING);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, lVar5, DivTextJsonParser.F);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f49616a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f49616a.Y6());
            if (divSize == null) {
                divSize = DivTextJsonParser.f49596g;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f49616a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f49616a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.f49616a.m8());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f49616a.P4());
            Expression<Double> expression6 = DivTextJsonParser.f49597h;
            Expression<Double> optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, lVar3, expression6);
            Expression<Double> expression7 = optionalExpression15 == null ? expression6 : optionalExpression15;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, lVar5, DivTextJsonParser.G);
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f49616a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f49616a.Y2());
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_lines", typeHelper5, lVar5, DivTextJsonParser.H);
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_hidden_lines", typeHelper5, lVar5, DivTextJsonParser.I);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f49616a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f49616a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f49616a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f49616a.y8());
            Expression optionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression optionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivTextJsonParser.J);
            Expression<Boolean> expression8 = DivTextJsonParser.f49598i;
            Expression<Boolean> optionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selectable", typeHelper4, lVar4, expression8);
            Expression<Boolean> expression9 = optionalExpression21 == null ? expression8 : optionalExpression21;
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f49616a.u0());
            TypeHelper<DivLineStyle> typeHelper9 = DivTextJsonParser.f49612w;
            bk.l<String, DivLineStyle> lVar8 = DivLineStyle.FROM_STRING;
            Expression<DivLineStyle> expression10 = DivTextJsonParser.f49599j;
            Expression<DivLineStyle> optionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper9, lVar8, expression10);
            Expression<DivLineStyle> expression11 = optionalExpression22 == null ? expression10 : optionalExpression22;
            Expression expression12 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", typeHelper7);
            TypeHelper<DivAlignmentHorizontal> typeHelper10 = DivTextJsonParser.f49613x;
            Expression<DivAlignmentHorizontal> expression13 = DivTextJsonParser.f49600k;
            Expression<DivAlignmentHorizontal> optionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper10, lVar, expression13);
            Expression<DivAlignmentHorizontal> expression14 = optionalExpression23 == null ? expression13 : optionalExpression23;
            TypeHelper<DivAlignmentVertical> typeHelper11 = DivTextJsonParser.f49614y;
            Expression<DivAlignmentVertical> expression15 = DivTextJsonParser.f49601l;
            Expression<DivAlignmentVertical> optionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper11, lVar2, expression15);
            Expression<DivAlignmentVertical> expression16 = optionalExpression24 == null ? expression15 : optionalExpression24;
            Expression<Integer> expression17 = DivTextJsonParser.f49602m;
            Expression<Integer> optionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, lVar6, expression17);
            Expression<Integer> expression18 = optionalExpression25 == null ? expression17 : optionalExpression25;
            DivTextGradient divTextGradient = (DivTextGradient) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_gradient", this.f49616a.g8());
            DivShadow divShadow = (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.f49616a.P6());
            Expression<Boolean> expression19 = DivTextJsonParser.f49603n;
            Expression<Boolean> optionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tighten_width", typeHelper4, lVar4, expression19);
            Expression<Boolean> expression20 = optionalExpression26 == null ? expression19 : optionalExpression26;
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f49616a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f49616a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f49616a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f49616a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f49616a.z1());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTextJsonParser.K);
            TypeHelper<DivText.Truncate> typeHelper12 = DivTextJsonParser.f49615z;
            bk.l<String, DivText.Truncate> lVar9 = DivText.Truncate.FROM_STRING;
            Expression<DivText.Truncate> expression21 = DivTextJsonParser.f49604o;
            Expression<DivText.Truncate> optionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "truncate", typeHelper12, lVar9, expression21);
            Expression<DivText.Truncate> expression22 = optionalExpression27 == null ? expression21 : optionalExpression27;
            TypeHelper<DivLineStyle> typeHelper13 = DivTextJsonParser.A;
            Expression<DivLineStyle> expression23 = DivTextJsonParser.f49605p;
            Expression<DivLineStyle> optionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", typeHelper13, lVar8, expression23);
            Expression<DivLineStyle> expression24 = optionalExpression28 == null ? expression23 : optionalExpression28;
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f49616a.e9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f49616a.k9());
            TypeHelper<DivVisibility> typeHelper14 = DivTextJsonParser.B;
            bk.l<String, DivVisibility> lVar10 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression25 = DivTextJsonParser.f49606q;
            Expression<DivVisibility> optionalExpression29 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, lVar10, expression25);
            Expression<DivVisibility> expression26 = optionalExpression29 == null ? expression25 : optionalExpression29;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f49616a.w9());
            List optionalList20 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f49616a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f49616a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTextJsonParser.f49607r;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalExpression4, optionalList3, divBorder, expression2, optionalExpression6, optionalList4, optionalList5, ellipsis, optionalList6, divFocus, optionalExpression7, optionalExpression8, optionalExpression9, expression3, expression5, optionalExpression12, optionalExpression13, optionalExpression14, optionalList7, divSize2, optionalList8, optionalList9, str, optionalList10, divLayoutProvider, expression7, optionalExpression16, optionalList11, divEdgeInsets, optionalExpression17, optionalExpression18, divEdgeInsets2, optionalList12, optionalList13, optionalList14, optionalExpression19, optionalExpression20, expression9, optionalList15, expression11, expression12, expression14, expression16, expression18, divTextGradient, divShadow, expression20, optionalList16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList17, expression22, expression24, optionalList18, optionalList19, expression26, divVisibilityAction, optionalList20, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivText divText) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divText.q(), this.f49616a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divText.f49463b, this.f49616a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divText.f49465c, this.f49616a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divText.f49467d, this.f49616a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divText.g();
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionN = divText.n();
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionN, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divText.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divText.y(), this.f49616a.t1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "auto_ellipsize", divText.f49477i);
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divText.getBackground(), this.f49616a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divText.z(), this.f49616a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divText.f49483l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divText.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divText.k(), this.f49616a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divText.f49489o, this.f49616a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "ellipsis", divText.f49491p, this.f49616a.d8());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divText.getExtensions(), this.f49616a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divText.p(), this.f49616a.z3());
            Expression<Integer> expression = divText.f49497s;
            bk.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "focused_text_color", expression, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divText.f49498t);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", divText.f49499u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divText.f49500v);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divText.f49501w, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divText.f49502x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divText.f49503y, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divText.f49504z);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divText.w(), this.f49616a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divText.getHeight(), this.f49616a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divText.C, this.f49616a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divText.D, this.f49616a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divText.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "images", divText.F, this.f49616a.m8());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divText.t(), this.f49616a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divText.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divText.I);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divText.J, this.f49616a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divText.d(), this.f49616a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_lines", divText.L);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_hidden_lines", divText.M);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divText.r(), this.f49616a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divText.O, this.f49616a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divText.P, this.f49616a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divText.Q, this.f49616a.y8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divText.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divText.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selectable", divText.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divText.s(), this.f49616a.u0());
            Expression<DivLineStyle> expression2 = divText.V;
            bk.l<DivLineStyle, String> lVar4 = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression2, lVar4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", divText.W);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divText.X, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divText.Y, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divText.Z, lVar3);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_gradient", divText.f49462a0, this.f49616a.g8());
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", divText.f49464b0, this.f49616a.P6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tighten_width", divText.f49466c0);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divText.h(), this.f49616a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divText.l(), this.f49616a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divText.j(), this.f49616a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divText.x(), this.f49616a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divText.i(), this.f49616a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divText.m(), DivTransitionTrigger.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "truncate", divText.f49480j0, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", divText.f49482k0, lVar4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divText.u(), this.f49616a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divText.c(), this.f49616a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divText.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divText.v(), this.f49616a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divText.a(), this.f49616a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divText.getWidth(), this.f49616a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49616a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49617a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate deserialize(ParsingContext parsingContext, DivTextTemplate divTextTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49716a : null, this.f49617a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49718b : null, this.f49617a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49720c : null, this.f49617a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49722d : null, this.f49617a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivTextJsonParser.f49608s;
            Field<Expression<DivAlignmentHorizontal>> field = divTextTemplate != null ? divTextTemplate.f49724e : null;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivTextJsonParser.f49609t;
            Field<Expression<DivAlignmentVertical>> field2 = divTextTemplate != null ? divTextTemplate.f49726f : null;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field3 = divTextTemplate != null ? divTextTemplate.f49728g : null;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, lVar3, DivTextJsonParser.C);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49730h : null, this.f49617a.u1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field4 = divTextTemplate != null ? divTextTemplate.f49732i : null;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "auto_ellipsize", typeHelper4, allowPropertyOverride, field4, lVar4);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49734j : null, this.f49617a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49736k : null, this.f49617a.M1());
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49738l : null, lVar4);
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field5 = divTextTemplate != null ? divTextTemplate.f49740m : null;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper5, allowPropertyOverride, field5, lVar5, DivTextJsonParser.D);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49742n : null, this.f49617a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49744o : null, this.f49617a.v0());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "ellipsis", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49746p : null, this.f49617a.e8());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49748q : null, this.f49617a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49750r : null, this.f49617a.A3());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field6 = divTextTemplate != null ? divTextTemplate.f49751s : null;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "focused_text_color", typeHelper6, allowPropertyOverride, field6, lVar6);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49752t : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49753u : null);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49754v : null, lVar5, DivTextJsonParser.E);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivTextJsonParser.f49610u, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49755w : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49756x : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextJsonParser.f49611v, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49757y : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49758z : null, lVar5, DivTextJsonParser.F);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.A : null, this.f49617a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.B : null, this.f49617a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.C : null, this.f49617a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.D : null, this.f49617a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.E : null);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "images", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.F : null, this.f49617a.n8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.G : null, this.f49617a.Q4());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.H : null, lVar3);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.I : null, lVar5, DivTextJsonParser.G);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.J : null, this.f49617a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.K : null, this.f49617a.Z2());
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_lines", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.L : null, lVar5, DivTextJsonParser.H);
            Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_hidden_lines", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.M : null, lVar5, DivTextJsonParser.I);
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.N : null, this.f49617a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.O : null, this.f49617a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.P : null, this.f49617a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.Q : null, this.f49617a.z8());
            Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.R : null);
            Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.S : null, lVar5, DivTextJsonParser.J);
            Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selectable", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.T : null, lVar4);
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.U : null, this.f49617a.v0());
            TypeHelper<DivLineStyle> typeHelper8 = DivTextJsonParser.f49612w;
            Field<Expression<DivLineStyle>> field7 = divTextTemplate != null ? divTextTemplate.V : null;
            bk.l<String, DivLineStyle> lVar7 = DivLineStyle.FROM_STRING;
            Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper8, allowPropertyOverride, field7, lVar7);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.W : null);
            Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", DivTextJsonParser.f49613x, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.X : null, lVar);
            Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", DivTextJsonParser.f49614y, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.Y : null, lVar2);
            Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.Z : null, lVar6);
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_gradient", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49717a0 : null, this.f49617a.h8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49719b0 : null, this.f49617a.Q6());
            Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tighten_width", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49721c0 : null, lVar4);
            Field optionalListField16 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49723d0 : null, this.f49617a.Q8());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49725e0 : null, this.f49617a.c9());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49727f0 : null, this.f49617a.V1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49729g0 : null, this.f49617a.A1());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49731h0 : null, this.f49617a.A1());
            Field<List<DivTransitionTrigger>> field8 = divTextTemplate != null ? divTextTemplate.f49733i0 : null;
            bk.l<String, DivTransitionTrigger> lVar8 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivTextJsonParser.K;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTextTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalFieldWithExpression4, optionalListField3, optionalField4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField4, optionalListField5, optionalField5, optionalListField6, optionalField6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalListField10, optionalField9, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField11, optionalField10, optionalFieldWithExpression17, optionalFieldWithExpression18, optionalField11, optionalListField12, optionalListField13, optionalListField14, optionalFieldWithExpression19, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalListField15, optionalFieldWithExpression22, fieldWithExpression, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalFieldWithExpression25, optionalField12, optionalField13, optionalFieldWithExpression26, optionalListField16, optionalField14, optionalField15, optionalField16, optionalField17, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, lVar8, listValidator), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "truncate", DivTextJsonParser.f49615z, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49735j0 : null, DivText.Truncate.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", DivTextJsonParser.A, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49737k0 : null, lVar7), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49739l0 : null, this.f49617a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49741m0 : null, this.f49617a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivTextJsonParser.B, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49743n0 : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49745o0 : null, this.f49617a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49747p0 : null, this.f49617a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.f49749q0 : null, this.f49617a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate divTextTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divTextTemplate.f49716a, this.f49617a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divTextTemplate.f49718b, this.f49617a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divTextTemplate.f49720c, this.f49617a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divTextTemplate.f49722d, this.f49617a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divTextTemplate.f49724e;
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divTextTemplate.f49726f;
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divTextTemplate.f49728g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divTextTemplate.f49730h, this.f49617a.u1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "auto_ellipsize", divTextTemplate.f49732i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divTextTemplate.f49734j, this.f49617a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divTextTemplate.f49736k, this.f49617a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divTextTemplate.f49738l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divTextTemplate.f49740m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divTextTemplate.f49742n, this.f49617a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divTextTemplate.f49744o, this.f49617a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "ellipsis", divTextTemplate.f49746p, this.f49617a.e8());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divTextTemplate.f49748q, this.f49617a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divTextTemplate.f49750r, this.f49617a.A3());
            Field<Expression<Integer>> field3 = divTextTemplate.f49751s;
            bk.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "focused_text_color", field3, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divTextTemplate.f49752t);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", divTextTemplate.f49753u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", divTextTemplate.f49754v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divTextTemplate.f49755w, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divTextTemplate.f49756x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divTextTemplate.f49757y, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divTextTemplate.f49758z);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divTextTemplate.A, this.f49617a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divTextTemplate.B, this.f49617a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divTextTemplate.C, this.f49617a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divTextTemplate.D, this.f49617a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTextTemplate.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "images", divTextTemplate.F, this.f49617a.n8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divTextTemplate.G, this.f49617a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divTextTemplate.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divTextTemplate.I);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divTextTemplate.J, this.f49617a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divTextTemplate.K, this.f49617a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_lines", divTextTemplate.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_hidden_lines", divTextTemplate.M);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divTextTemplate.N, this.f49617a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divTextTemplate.O, this.f49617a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divTextTemplate.P, this.f49617a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", divTextTemplate.Q, this.f49617a.z8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divTextTemplate.R);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divTextTemplate.S);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selectable", divTextTemplate.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divTextTemplate.U, this.f49617a.v0());
            Field<Expression<DivLineStyle>> field4 = divTextTemplate.V;
            bk.l<DivLineStyle, String> lVar4 = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field4, lVar4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", divTextTemplate.W);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", divTextTemplate.X, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", divTextTemplate.Y, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divTextTemplate.Z, lVar3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_gradient", divTextTemplate.f49717a0, this.f49617a.h8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", divTextTemplate.f49719b0, this.f49617a.Q6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tighten_width", divTextTemplate.f49721c0);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divTextTemplate.f49723d0, this.f49617a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divTextTemplate.f49725e0, this.f49617a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divTextTemplate.f49727f0, this.f49617a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divTextTemplate.f49729g0, this.f49617a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divTextTemplate.f49731h0, this.f49617a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divTextTemplate.f49733i0, DivTransitionTrigger.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "truncate", divTextTemplate.f49735j0, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", divTextTemplate.f49737k0, lVar4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divTextTemplate.f49739l0, this.f49617a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divTextTemplate.f49741m0, this.f49617a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divTextTemplate.f49743n0, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divTextTemplate.f49745o0, this.f49617a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divTextTemplate.f49747p0, this.f49617a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divTextTemplate.f49749q0, this.f49617a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49617a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate, DivText> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49618a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText resolve(ParsingContext parsingContext, DivTextTemplate divTextTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49716a, jSONObject, "accessibility", this.f49618a.J(), this.f49618a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49718b, jSONObject, "action", this.f49618a.w0(), this.f49618a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49720c, jSONObject, "action_animation", this.f49618a.s1(), this.f49618a.q1());
            if (divAnimation == null) {
                divAnimation = DivTextJsonParser.f49591b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49722d, jSONObject, "actions", this.f49618a.w0(), this.f49618a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divTextTemplate.f49724e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivTextJsonParser.f49608s;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divTextTemplate.f49726f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivTextJsonParser.f49609t;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divTextTemplate.f49728g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTextJsonParser.C;
            Expression<Double> expression = DivTextJsonParser.f49592c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49730h, jSONObject, "animators", this.f49618a.v1(), this.f49618a.t1());
            Field<Expression<Boolean>> field4 = divTextTemplate.f49732i;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "auto_ellipsize", typeHelper4, lVar4);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49734j, jSONObject, A2.f54950g, this.f49618a.H1(), this.f49618a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49736k, jSONObject, "border", this.f49618a.N1(), this.f49618a.L1());
            Field<Expression<Boolean>> field5 = divTextTemplate.f49738l;
            Expression<Boolean> expression2 = DivTextJsonParser.f49593d;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            Expression<Boolean> expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            Field<Expression<Long>> field6 = divTextTemplate.f49740m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, lVar5, DivTextJsonParser.D);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49742n, jSONObject, "disappear_actions", this.f49618a.R2(), this.f49618a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49744o, jSONObject, "doubletap_actions", this.f49618a.w0(), this.f49618a.u0());
            DivText.Ellipsis ellipsis = (DivText.Ellipsis) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49746p, jSONObject, "ellipsis", this.f49618a.f8(), this.f49618a.d8());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49748q, jSONObject, "extensions", this.f49618a.d3(), this.f49618a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49750r, jSONObject, "focus", this.f49618a.B3(), this.f49618a.z3());
            Field<Expression<Integer>> field7 = divTextTemplate.f49751s;
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "focused_text_color", typeHelper6, lVar6);
            Field<Expression<String>> field8 = divTextTemplate.f49752t;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_family", typeHelper7);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f49753u, jSONObject, "font_feature_settings", typeHelper7);
            Field<Expression<Long>> field9 = divTextTemplate.f49754v;
            ValueValidator<Long> valueValidator2 = DivTextJsonParser.E;
            Expression<Long> expression4 = DivTextJsonParser.f49594e;
            Expression<Long> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression4);
            if (expressionResolveOptionalExpression10 != null) {
                expression4 = expressionResolveOptionalExpression10;
            }
            Field<Expression<DivSizeUnit>> field10 = divTextTemplate.f49755w;
            TypeHelper<DivSizeUnit> typeHelper8 = DivTextJsonParser.f49610u;
            bk.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression5 = DivTextJsonParser.f49595f;
            Expression<DivSizeUnit> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "font_size_unit", typeHelper8, lVar7, expression5);
            Expression<DivSizeUnit> expression6 = expressionResolveOptionalExpression11 == null ? expression5 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f49756x, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f49757y, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextJsonParser.f49611v, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.f49758z, jSONObject, "font_weight_value", typeHelper5, lVar5, DivTextJsonParser.F);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.A, jSONObject, "functions", this.f49618a.K3(), this.f49618a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.B, jSONObject, "height", this.f49618a.a7(), this.f49618a.Y6());
            if (divSize == null) {
                divSize = DivTextJsonParser.f49596g;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.C, jSONObject, "hover_end_actions", this.f49618a.w0(), this.f49618a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.D, jSONObject, "hover_start_actions", this.f49618a.w0(), this.f49618a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.E, jSONObject, "id");
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.F, jSONObject, "images", this.f49618a.o8(), this.f49618a.m8());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.G, jSONObject, "layout_provider", this.f49618a.R4(), this.f49618a.P4());
            Field<Expression<Double>> field11 = divTextTemplate.H;
            Expression<Double> expression7 = DivTextJsonParser.f49597h;
            Expression<Double> expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "letter_spacing", typeHelper3, lVar3, expression7);
            Expression<Double> expression8 = expressionResolveOptionalExpression15 == null ? expression7 : expressionResolveOptionalExpression15;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.I, jSONObject, "line_height", typeHelper5, lVar5, DivTextJsonParser.G);
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.J, jSONObject, "longtap_actions", this.f49618a.w0(), this.f49618a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.K, jSONObject, "margins", this.f49618a.a3(), this.f49618a.Y2());
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.L, jSONObject, "max_lines", typeHelper5, lVar5, DivTextJsonParser.H);
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.M, jSONObject, "min_hidden_lines", typeHelper5, lVar5, DivTextJsonParser.I);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.N, jSONObject, "paddings", this.f49618a.a3(), this.f49618a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.O, jSONObject, "press_end_actions", this.f49618a.w0(), this.f49618a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.P, jSONObject, "press_start_actions", this.f49618a.w0(), this.f49618a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.Q, jSONObject, "ranges", this.f49618a.A8(), this.f49618a.y8());
            Expression expressionResolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.R, jSONObject, "reuse_id", typeHelper7);
            Expression expressionResolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.S, jSONObject, "row_span", typeHelper5, lVar5, DivTextJsonParser.J);
            Field<Expression<Boolean>> field12 = divTextTemplate.T;
            Expression<Boolean> expression9 = DivTextJsonParser.f49598i;
            Expression<Boolean> expressionResolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "selectable", typeHelper4, lVar4, expression9);
            Expression<Boolean> expression10 = expressionResolveOptionalExpression21 == null ? expression9 : expressionResolveOptionalExpression21;
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.U, jSONObject, "selected_actions", this.f49618a.w0(), this.f49618a.u0());
            Field<Expression<DivLineStyle>> field13 = divTextTemplate.V;
            TypeHelper<DivLineStyle> typeHelper9 = DivTextJsonParser.f49612w;
            bk.l<String, DivLineStyle> lVar8 = DivLineStyle.FROM_STRING;
            Expression<DivLineStyle> expression11 = DivTextJsonParser.f49599j;
            Expression<DivLineStyle> expressionResolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "strike", typeHelper9, lVar8, expression11);
            Expression<DivLineStyle> expression12 = expressionResolveOptionalExpression22 == null ? expression11 : expressionResolveOptionalExpression22;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextTemplate.W, jSONObject, "text", typeHelper7);
            Field<Expression<DivAlignmentHorizontal>> field14 = divTextTemplate.X;
            TypeHelper<DivAlignmentHorizontal> typeHelper10 = DivTextJsonParser.f49613x;
            Expression<DivAlignmentHorizontal> expression13 = DivTextJsonParser.f49600k;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "text_alignment_horizontal", typeHelper10, lVar, expression13);
            Expression<DivAlignmentHorizontal> expression14 = expressionResolveOptionalExpression23 == null ? expression13 : expressionResolveOptionalExpression23;
            Field<Expression<DivAlignmentVertical>> field15 = divTextTemplate.Y;
            TypeHelper<DivAlignmentVertical> typeHelper11 = DivTextJsonParser.f49614y;
            Expression<DivAlignmentVertical> expression15 = DivTextJsonParser.f49601l;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "text_alignment_vertical", typeHelper11, lVar2, expression15);
            Expression<DivAlignmentVertical> expression16 = expressionResolveOptionalExpression24 == null ? expression15 : expressionResolveOptionalExpression24;
            Field<Expression<Integer>> field16 = divTextTemplate.Z;
            Expression<Integer> expression17 = DivTextJsonParser.f49602m;
            Expression<Integer> expressionResolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_color", typeHelper6, lVar6, expression17);
            Expression<Integer> expression18 = expressionResolveOptionalExpression25 == null ? expression17 : expressionResolveOptionalExpression25;
            DivTextGradient divTextGradient = (DivTextGradient) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49717a0, jSONObject, "text_gradient", this.f49618a.i8(), this.f49618a.g8());
            DivShadow divShadow = (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49719b0, jSONObject, "text_shadow", this.f49618a.R6(), this.f49618a.P6());
            Field<Expression<Boolean>> field17 = divTextTemplate.f49721c0;
            Expression<Boolean> expression19 = DivTextJsonParser.f49603n;
            Expression<Boolean> expressionResolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "tighten_width", typeHelper4, lVar4, expression19);
            Expression<Boolean> expression20 = expressionResolveOptionalExpression26 == null ? expression19 : expressionResolveOptionalExpression26;
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49723d0, jSONObject, "tooltips", this.f49618a.R8(), this.f49618a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49725e0, jSONObject, "transform", this.f49618a.d9(), this.f49618a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49727f0, jSONObject, "transition_change", this.f49618a.W1(), this.f49618a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49729g0, jSONObject, "transition_in", this.f49618a.B1(), this.f49618a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49731h0, jSONObject, "transition_out", this.f49618a.B1(), this.f49618a.z1());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49733i0, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTextJsonParser.K);
            Field<Expression<DivText.Truncate>> field18 = divTextTemplate.f49735j0;
            TypeHelper<DivText.Truncate> typeHelper12 = DivTextJsonParser.f49615z;
            bk.l<String, DivText.Truncate> lVar9 = DivText.Truncate.FROM_STRING;
            Expression<DivText.Truncate> expression21 = DivTextJsonParser.f49604o;
            Expression<DivText.Truncate> expressionResolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "truncate", typeHelper12, lVar9, expression21);
            Expression<DivText.Truncate> expression22 = expressionResolveOptionalExpression27 == null ? expression21 : expressionResolveOptionalExpression27;
            Field<Expression<DivLineStyle>> field19 = divTextTemplate.f49737k0;
            TypeHelper<DivLineStyle> typeHelper13 = DivTextJsonParser.A;
            Expression<DivLineStyle> expression23 = DivTextJsonParser.f49605p;
            Expression<DivLineStyle> expressionResolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "underline", typeHelper13, lVar8, expression23);
            Expression<DivLineStyle> expression24 = expressionResolveOptionalExpression28 == null ? expression23 : expressionResolveOptionalExpression28;
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49739l0, jSONObject, "variable_triggers", this.f49618a.g9(), this.f49618a.e9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49741m0, jSONObject, "variables", this.f49618a.m9(), this.f49618a.k9());
            Field<Expression<DivVisibility>> field20 = divTextTemplate.f49743n0;
            TypeHelper<DivVisibility> typeHelper14 = DivTextJsonParser.B;
            bk.l<String, DivVisibility> lVar10 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression25 = DivTextJsonParser.f49606q;
            Expression<DivVisibility> expressionResolveOptionalExpression29 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject, "visibility", typeHelper14, lVar10, expression25);
            Expression<DivVisibility> expression26 = expressionResolveOptionalExpression29 == null ? expression25 : expressionResolveOptionalExpression29;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49745o0, jSONObject, "visibility_action", this.f49618a.y9(), this.f49618a.w9());
            List listResolveOptionalList20 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.f49747p0, jSONObject, "visibility_actions", this.f49618a.y9(), this.f49618a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.f49749q0, jSONObject, "width", this.f49618a.a7(), this.f49618a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTextJsonParser.f49607r;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, expressionResolveOptionalExpression4, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression6, listResolveOptionalList4, listResolveOptionalList5, ellipsis, listResolveOptionalList6, divFocus, expressionResolveOptionalExpression7, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expression4, expression6, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, listResolveOptionalList10, divLayoutProvider, expression8, expressionResolveOptionalExpression16, listResolveOptionalList11, divEdgeInsets, expressionResolveOptionalExpression17, expressionResolveOptionalExpression18, divEdgeInsets2, listResolveOptionalList12, listResolveOptionalList13, listResolveOptionalList14, expressionResolveOptionalExpression19, expressionResolveOptionalExpression20, expression10, listResolveOptionalList15, expression12, expressionResolveExpression, expression14, expression16, expression18, divTextGradient, divShadow, expression20, listResolveOptionalList16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList17, expression22, expression24, listResolveOptionalList18, listResolveOptionalList19, expression26, divVisibilityAction, listResolveOptionalList20, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49618a = jsonParserComponent;
        }
    }

    public static final boolean j(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    public static final boolean m(long j10) {
        return j10 > 0;
    }

    public static final boolean n(long j10) {
        return j10 >= 0;
    }

    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    public static final boolean p(long j10) {
        return j10 >= 0;
    }

    public static final boolean q(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f49591b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f49592c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f49593d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49594e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f49595f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f49596g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f49597h = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f49598i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        f49599j = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        f49600k = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        f49601l = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f49602m = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f49603n = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivText.Truncate truncate = DivText.Truncate.END;
        f49604o = Expression.Companion.constant$default(companion, truncate, null, 2, null);
        f49605p = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f49606q = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f49607r = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49608s = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f49609t = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f49610u = companion2.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f49611v = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f49612w = companion2.from(divLineStyle, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_STRIKE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        f49613x = companion2.from(divAlignmentHorizontal, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f49614y = companion2.from(divAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f49615z = companion2.from(truncate, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TRUNCATE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivText.Truncate);
            }
        });
        A = companion2.from(divLineStyle, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_UNDERLINE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        B = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        C = new ValueValidator() { // from class: oe.sa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.j(((Double) obj).doubleValue());
            }
        };
        D = new ValueValidator() { // from class: oe.ta
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.k(((Long) obj).longValue());
            }
        };
        E = new ValueValidator() { // from class: oe.ua
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.l(((Long) obj).longValue());
            }
        };
        F = new ValueValidator() { // from class: oe.va
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.m(((Long) obj).longValue());
            }
        };
        G = new ValueValidator() { // from class: oe.wa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.n(((Long) obj).longValue());
            }
        };
        H = new ValueValidator() { // from class: oe.xa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.o(((Long) obj).longValue());
            }
        };
        I = new ValueValidator() { // from class: oe.ya
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.p(((Long) obj).longValue());
            }
        };
        J = new ValueValidator() { // from class: oe.za
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextJsonParser.q(((Long) obj).longValue());
            }
        };
        K = new ListValidator() { // from class: oe.ab
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTextJsonParser.r(list);
            }
        };
    }

    public static final boolean r(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
