package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import com.yandex.div2.DivGifImageJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGifImageJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivGifImageJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47388a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final DivAnimation f47389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentHorizontal> f47392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentVertical> f47393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f47394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f47395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivImageScale> f47397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f47398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f47399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivImageScale> f47404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f47405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f47409v;

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47410a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGifImage deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f47410a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f47410a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f47410a.q1());
            if (divAnimation == null) {
                divAnimation = DivGifImageJsonParser.f47389b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f47410a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGifImageJsonParser.f47400m;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGifImageJsonParser.f47401n;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGifImageJsonParser.f47406s;
            Expression<Double> expression = DivGifImageJsonParser.f47390c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f47410a.t1());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f47410a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f47410a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f47410a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivGifImageJsonParser.f47391d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivGifImageJsonParser.f47407t);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGifImageJsonParser.f47402o;
            Expression<DivAlignmentHorizontal> expression3 = DivGifImageJsonParser.f47392e;
            Expression<DivAlignmentHorizontal> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGifImageJsonParser.f47403p;
            Expression<DivAlignmentVertical> expression4 = DivGifImageJsonParser.f47393f;
            Expression<DivAlignmentVertical> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression4);
            Expression<DivAlignmentVertical> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f47410a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f47410a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f47410a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f47410a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f47410a.I3());
            Expression expression6 = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f47410a.Y6());
            if (divSize == null) {
                divSize = DivGifImageJsonParser.f47394g;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f47410a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f47410a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f47410a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f47410a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f47410a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f47410a.Y2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression7 = DivGifImageJsonParser.f47395h;
            Expression<Integer> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, lVar6, expression7);
            Expression<Integer> expression8 = optionalExpression8 == null ? expression7 : optionalExpression8;
            Expression<Boolean> expression9 = DivGifImageJsonParser.f47396i;
            Expression<Boolean> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, lVar4, expression9);
            Expression<Boolean> expression10 = optionalExpression9 == null ? expression9 : optionalExpression9;
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f47410a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f47410a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivGifImageJsonParser.f47408u);
            TypeHelper<DivImageScale> typeHelper10 = DivGifImageJsonParser.f47404q;
            bk.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression11 = DivGifImageJsonParser.f47397j;
            Expression<DivImageScale> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, lVar7, expression11);
            Expression<DivImageScale> expression12 = optionalExpression13 == null ? expression11 : optionalExpression13;
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f47410a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f47410a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f47410a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f47410a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f47410a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f47410a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGifImageJsonParser.f47409v);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f47410a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f47410a.k9());
            TypeHelper<DivVisibility> typeHelper11 = DivGifImageJsonParser.f47405r;
            bk.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression13 = DivGifImageJsonParser.f47398k;
            Expression<DivVisibility> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper11, lVar8, expression13);
            Expression<DivVisibility> expression14 = optionalExpression14 == null ? expression13 : optionalExpression14;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f47410a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f47410a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f47410a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGifImageJsonParser.f47399l;
            }
            return new DivGifImage(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, divAspect, optionalList3, divBorder, expression2, optionalExpression5, expression3, expression5, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, expression6, divSize2, optionalList8, optionalList9, str, divLayoutProvider, optionalList10, divEdgeInsets, divEdgeInsets2, expression8, expression10, optionalList11, optionalList12, optionalExpression10, optionalExpression11, optionalExpression12, expression12, optionalList13, optionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList15, optionalList16, optionalList17, expression14, divVisibilityAction, optionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivGifImage divGifImage) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGifImage.q(), this.f47410a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divGifImage.f47363b, this.f47410a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divGifImage.f47364c, this.f47410a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divGifImage.f47365d, this.f47410a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divGifImage.g();
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionN = divGifImage.n();
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionN, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGifImage.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGifImage.y(), this.f47410a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divGifImage.f47370i, this.f47410a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divGifImage.getBackground(), this.f47410a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divGifImage.z(), this.f47410a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divGifImage.f47373l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGifImage.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divGifImage.f47375n, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divGifImage.f47376o, lVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGifImage.k(), this.f47410a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divGifImage.f47378q, this.f47410a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGifImage.getExtensions(), this.f47410a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGifImage.p(), this.f47410a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGifImage.w(), this.f47410a.I3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, divGifImage.f47382u, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGifImage.getHeight(), this.f47410a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divGifImage.f47384w, this.f47410a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divGifImage.f47385x, this.f47410a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGifImage.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGifImage.t(), this.f47410a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divGifImage.A, this.f47410a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGifImage.d(), this.f47410a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGifImage.r(), this.f47410a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", divGifImage.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divGifImage.E);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divGifImage.F, this.f47410a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divGifImage.G, this.f47410a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divGifImage.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGifImage.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGifImage.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divGifImage.K, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGifImage.s(), this.f47410a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGifImage.h(), this.f47410a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGifImage.l(), this.f47410a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGifImage.j(), this.f47410a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGifImage.x(), this.f47410a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGifImage.i(), this.f47410a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGifImage.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGifImage.u(), this.f47410a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGifImage.c(), this.f47410a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divGifImage.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGifImage.v(), this.f47410a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGifImage.a(), this.f47410a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGifImage.getWidth(), this.f47410a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47410a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47411a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGifImageTemplate deserialize(ParsingContext parsingContext, DivGifImageTemplate divGifImageTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47424a : null, this.f47411a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47425b : null, this.f47411a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47426c : null, this.f47411a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47427d : null, this.f47411a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGifImageJsonParser.f47400m;
            Field<Expression<DivAlignmentHorizontal>> field = divGifImageTemplate != null ? divGifImageTemplate.f47428e : null;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGifImageJsonParser.f47401n;
            Field<Expression<DivAlignmentVertical>> field2 = divGifImageTemplate != null ? divGifImageTemplate.f47429f : null;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47430g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGifImageJsonParser.f47406s);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47431h : null, this.f47411a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47432i : null, this.f47411a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47433j : null, this.f47411a.G1());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47434k : null, this.f47411a.M1());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = divGifImageTemplate != null ? divGifImageTemplate.f47435l : null;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, lVar3);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = divGifImageTemplate != null ? divGifImageTemplate.f47436m : null;
            bk.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, lVar4, DivGifImageJsonParser.f47407t);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivGifImageJsonParser.f47402o, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47437n : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivGifImageJsonParser.f47403p, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47438o : null, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47439p : null, this.f47411a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47440q : null, this.f47411a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47441r : null, this.f47411a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47442s : null, this.f47411a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47443t : null, this.f47411a.J3());
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47444u : null, ParsingConvertersKt.ANY_TO_URI);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47445v : null, this.f47411a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47446w : null, this.f47411a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47447x : null, this.f47411a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47448y : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f47449z : null, this.f47411a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.A : null, this.f47411a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.B : null, this.f47411a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.C : null, this.f47411a.Z2());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.D : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.E : null, lVar3);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.F : null, this.f47411a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.G : null, this.f47411a.v0());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper5, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.H : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.I : null);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.J : null, lVar4, DivGifImageJsonParser.f47408u);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivGifImageJsonParser.f47404q, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.K : null, DivImageScale.FROM_STRING);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.L : null, this.f47411a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.M : null, this.f47411a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.N : null, this.f47411a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.O : null, this.f47411a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.P : null, this.f47411a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.Q : null, this.f47411a.A1());
            Field<List<DivTransitionTrigger>> field5 = divGifImageTemplate != null ? divGifImageTemplate.R : null;
            bk.l<String, DivTransitionTrigger> lVar5 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivGifImageJsonParser.f47409v;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGifImageTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalListField3, optionalField5, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, fieldWithExpression, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField11, optionalListField12, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalListField13, optionalListField14, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar5, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.S : null, this.f47411a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.T : null, this.f47411a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivGifImageJsonParser.f47405r, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.U : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.V : null, this.f47411a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.W : null, this.f47411a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.X : null, this.f47411a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivGifImageTemplate divGifImageTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGifImageTemplate.f47424a, this.f47411a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divGifImageTemplate.f47425b, this.f47411a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divGifImageTemplate.f47426c, this.f47411a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divGifImageTemplate.f47427d, this.f47411a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divGifImageTemplate.f47428e;
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGifImageTemplate.f47429f;
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGifImageTemplate.f47430g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGifImageTemplate.f47431h, this.f47411a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divGifImageTemplate.f47432i, this.f47411a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divGifImageTemplate.f47433j, this.f47411a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divGifImageTemplate.f47434k, this.f47411a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divGifImageTemplate.f47435l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGifImageTemplate.f47436m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divGifImageTemplate.f47437n, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divGifImageTemplate.f47438o, lVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGifImageTemplate.f47439p, this.f47411a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divGifImageTemplate.f47440q, this.f47411a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGifImageTemplate.f47441r, this.f47411a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGifImageTemplate.f47442s, this.f47411a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGifImageTemplate.f47443t, this.f47411a.J3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, divGifImageTemplate.f47444u, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGifImageTemplate.f47445v, this.f47411a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divGifImageTemplate.f47446w, this.f47411a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divGifImageTemplate.f47447x, this.f47411a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGifImageTemplate.f47448y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGifImageTemplate.f47449z, this.f47411a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divGifImageTemplate.A, this.f47411a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGifImageTemplate.B, this.f47411a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGifImageTemplate.C, this.f47411a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", divGifImageTemplate.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divGifImageTemplate.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divGifImageTemplate.F, this.f47411a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divGifImageTemplate.G, this.f47411a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divGifImageTemplate.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGifImageTemplate.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGifImageTemplate.J);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divGifImageTemplate.K, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGifImageTemplate.L, this.f47411a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGifImageTemplate.M, this.f47411a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGifImageTemplate.N, this.f47411a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGifImageTemplate.O, this.f47411a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGifImageTemplate.P, this.f47411a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGifImageTemplate.Q, this.f47411a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGifImageTemplate.R, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGifImageTemplate.S, this.f47411a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGifImageTemplate.T, this.f47411a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divGifImageTemplate.U, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGifImageTemplate.V, this.f47411a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGifImageTemplate.W, this.f47411a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGifImageTemplate.X, this.f47411a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47411a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivGifImageTemplate, DivGifImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47412a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGifImage resolve(ParsingContext parsingContext, DivGifImageTemplate divGifImageTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47424a, jSONObject, "accessibility", this.f47412a.J(), this.f47412a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47425b, jSONObject, "action", this.f47412a.w0(), this.f47412a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47426c, jSONObject, "action_animation", this.f47412a.s1(), this.f47412a.q1());
            if (divAnimation == null) {
                divAnimation = DivGifImageJsonParser.f47389b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47427d, jSONObject, "actions", this.f47412a.w0(), this.f47412a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divGifImageTemplate.f47428e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGifImageJsonParser.f47400m;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGifImageTemplate.f47429f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGifImageJsonParser.f47401n;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divGifImageTemplate.f47430g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGifImageJsonParser.f47406s;
            Expression<Double> expression = DivGifImageJsonParser.f47390c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47431h, jSONObject, "animators", this.f47412a.v1(), this.f47412a.t1());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47432i, jSONObject, "aspect", this.f47412a.E1(), this.f47412a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47433j, jSONObject, A2.f54950g, this.f47412a.H1(), this.f47412a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47434k, jSONObject, "border", this.f47412a.N1(), this.f47412a.L1());
            Field<Expression<Boolean>> field4 = divGifImageTemplate.f47435l;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivGifImageJsonParser.f47391d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field5 = divGifImageTemplate.f47436m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, lVar5, DivGifImageJsonParser.f47407t);
            Field<Expression<DivAlignmentHorizontal>> field6 = divGifImageTemplate.f47437n;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGifImageJsonParser.f47402o;
            Expression<DivAlignmentHorizontal> expression4 = DivGifImageJsonParser.f47392e;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression4);
            if (expressionResolveOptionalExpression6 != null) {
                expression4 = expressionResolveOptionalExpression6;
            }
            Field<Expression<DivAlignmentVertical>> field7 = divGifImageTemplate.f47438o;
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGifImageJsonParser.f47403p;
            Expression<DivAlignmentVertical> expression5 = DivGifImageJsonParser.f47393f;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression5);
            if (expressionResolveOptionalExpression7 != null) {
                expression5 = expressionResolveOptionalExpression7;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47439p, jSONObject, "disappear_actions", this.f47412a.R2(), this.f47412a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47440q, jSONObject, "doubletap_actions", this.f47412a.w0(), this.f47412a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47441r, jSONObject, "extensions", this.f47412a.d3(), this.f47412a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47442s, jSONObject, "focus", this.f47412a.B3(), this.f47412a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47443t, jSONObject, "functions", this.f47412a.K3(), this.f47412a.I3());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divGifImageTemplate.f47444u, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47445v, jSONObject, "height", this.f47412a.a7(), this.f47412a.Y6());
            if (divSize == null) {
                divSize = DivGifImageJsonParser.f47394g;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47446w, jSONObject, "hover_end_actions", this.f47412a.w0(), this.f47412a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f47447x, jSONObject, "hover_start_actions", this.f47412a.w0(), this.f47412a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47448y, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f47449z, jSONObject, "layout_provider", this.f47412a.R4(), this.f47412a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.A, jSONObject, "longtap_actions", this.f47412a.w0(), this.f47412a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.B, jSONObject, "margins", this.f47412a.a3(), this.f47412a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.C, jSONObject, "paddings", this.f47412a.a3(), this.f47412a.Y2());
            Field<Expression<Integer>> field8 = divGifImageTemplate.D;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivGifImageJsonParser.f47395h;
            Expression<Integer> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "placeholder_color", typeHelper8, lVar6, expression6);
            if (expressionResolveOptionalExpression8 != null) {
                expression6 = expressionResolveOptionalExpression8;
            }
            Field<Expression<Boolean>> field9 = divGifImageTemplate.E;
            Expression<Boolean> expression7 = DivGifImageJsonParser.f47396i;
            Expression<Boolean> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "preload_required", typeHelper4, lVar4, expression7);
            if (expressionResolveOptionalExpression9 != null) {
                expression7 = expressionResolveOptionalExpression9;
            }
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.F, jSONObject, "press_end_actions", this.f47412a.w0(), this.f47412a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.G, jSONObject, "press_start_actions", this.f47412a.w0(), this.f47412a.u0());
            Field<Expression<String>> field10 = divGifImageTemplate.H;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preview", typeHelper9);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGifImageTemplate.I, jSONObject, "reuse_id", typeHelper9);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGifImageTemplate.J, jSONObject, "row_span", typeHelper5, lVar5, DivGifImageJsonParser.f47408u);
            Field<Expression<DivImageScale>> field11 = divGifImageTemplate.K;
            TypeHelper<DivImageScale> typeHelper10 = DivGifImageJsonParser.f47404q;
            bk.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression8 = DivGifImageJsonParser.f47397j;
            Expression<DivImageScale> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "scale", typeHelper10, lVar7, expression8);
            Expression<DivImageScale> expression9 = expressionResolveOptionalExpression13 == null ? expression8 : expressionResolveOptionalExpression13;
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.L, jSONObject, "selected_actions", this.f47412a.w0(), this.f47412a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.M, jSONObject, "tooltips", this.f47412a.R8(), this.f47412a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.N, jSONObject, "transform", this.f47412a.d9(), this.f47412a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.O, jSONObject, "transition_change", this.f47412a.W1(), this.f47412a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.P, jSONObject, "transition_in", this.f47412a.B1(), this.f47412a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.Q, jSONObject, "transition_out", this.f47412a.B1(), this.f47412a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.R, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGifImageJsonParser.f47409v);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.S, jSONObject, "variable_triggers", this.f47412a.g9(), this.f47412a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.T, jSONObject, "variables", this.f47412a.m9(), this.f47412a.k9());
            Field<Expression<DivVisibility>> field12 = divGifImageTemplate.U;
            TypeHelper<DivVisibility> typeHelper11 = DivGifImageJsonParser.f47405r;
            bk.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivGifImageJsonParser.f47398k;
            Expression<DivVisibility> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "visibility", typeHelper11, lVar8, expression10);
            Expression<DivVisibility> expression11 = expressionResolveOptionalExpression14 == null ? expression10 : expressionResolveOptionalExpression14;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.V, jSONObject, "visibility_action", this.f47412a.y9(), this.f47412a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.W, jSONObject, "visibility_actions", this.f47412a.y9(), this.f47412a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.X, jSONObject, "width", this.f47412a.a7(), this.f47412a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGifImageJsonParser.f47399l;
            }
            return new DivGifImage(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, divAspect, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression5, expression4, expression5, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, expressionResolveExpression, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, divLayoutProvider, listResolveOptionalList10, divEdgeInsets, divEdgeInsets2, expression6, expression7, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, expression9, listResolveOptionalList13, listResolveOptionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression11, divVisibilityAction, listResolveOptionalList18, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47412a = jsonParserComponent;
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
        f47389b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f47390c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f47391d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        f47392e = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f47393f = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f47394g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f47395h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f47396i = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        f47397j = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f47398k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f47399l = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f47400m = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47401n = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47402o = companion2.from(divAlignmentHorizontal, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47403p = companion2.from(divAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47404q = companion2.from(divImageScale, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        f47405r = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f47406s = new ValueValidator() { // from class: oe.t4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGifImageJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f47407t = new ValueValidator() { // from class: oe.u4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGifImageJsonParser.f(((Long) obj).longValue());
            }
        };
        f47408u = new ValueValidator() { // from class: oe.v4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGifImageJsonParser.g(((Long) obj).longValue());
            }
        };
        f47409v = new ListValidator() { // from class: oe.w4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivGifImageJsonParser.h(list);
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
