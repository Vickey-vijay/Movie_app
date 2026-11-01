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
import com.yandex.div2.DivIndicatorJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivIndicatorJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47736a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f47737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivIndicator.Animation> f47740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f47741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f47742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final DivShape.c f47744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f47745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f47746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f47747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivIndicator.Animation> f47750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f47751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f47755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f47756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f47757v;

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47758a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivIndicator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f47758a.H());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivIndicatorJsonParser.f47737b;
            Expression<Integer> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivIndicatorJsonParser.f47752q;
            Expression<Double> expression3 = DivIndicatorJsonParser.f47738c;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_size", typeHelper2, lVar2, valueValidator, expression3);
            if (optionalExpression2 != null) {
                expression3 = optionalExpression2;
            }
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "active_shape", this.f47758a.x6());
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.f47748m, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivIndicatorJsonParser.f47749n, DivAlignmentVertical.FROM_STRING);
            ValueValidator<Double> valueValidator2 = DivIndicatorJsonParser.f47753r;
            Expression<Double> expression4 = DivIndicatorJsonParser.f47739d;
            Expression<Double> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression5 != null) {
                expression4 = optionalExpression5;
            }
            TypeHelper<DivIndicator.Animation> typeHelper3 = DivIndicatorJsonParser.f47750o;
            bk.l<String, DivIndicator.Animation> lVar3 = DivIndicator.Animation.FROM_STRING;
            Expression<DivIndicator.Animation> expression5 = DivIndicatorJsonParser.f47740e;
            Expression<DivIndicator.Animation> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation", typeHelper3, lVar3, expression5);
            Expression<DivIndicator.Animation> expression6 = optionalExpression6 == null ? expression5 : optionalExpression6;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f47758a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f47758a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f47758a.L1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, lVar4, DivIndicatorJsonParser.f47754s);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f47758a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f47758a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f47758a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f47758a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f47758a.Y6());
            if (divSize == null) {
                divSize = DivIndicatorJsonParser.f47741f;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression<Integer> expression7 = DivIndicatorJsonParser.f47742g;
            Expression<Integer> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_item_color", typeHelper, lVar, expression7);
            Expression<Integer> expression8 = optionalExpression8 == null ? expression7 : optionalExpression8;
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_minimum_shape", this.f47758a.x6());
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_shape", this.f47758a.x6());
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonPropertyParser.readOptional(parsingContext, jSONObject, "items_placement", this.f47758a.a4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f47758a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f47758a.Y2());
            ValueValidator<Double> valueValidator3 = DivIndicatorJsonParser.f47755t;
            Expression<Double> expression9 = DivIndicatorJsonParser.f47743h;
            Expression<Double> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "minimum_item_size", typeHelper2, lVar2, valueValidator3, expression9);
            Expression<Double> expression10 = optionalExpression9 == null ? expression9 : optionalExpression9;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f47758a.Y2());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pager_id");
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, lVar4, DivIndicatorJsonParser.f47756u);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f47758a.u0());
            DivShape divShape = (DivShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shape", this.f47758a.V6());
            if (divShape == null) {
                divShape = DivIndicatorJsonParser.f47744i;
            }
            DivShape divShape2 = divShape;
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f47758a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivIndicatorJsonParser.f47745j;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f47758a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f47758a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f47758a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f47758a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f47758a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivIndicatorJsonParser.f47757v);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f47758a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f47758a.k9());
            TypeHelper<DivVisibility> typeHelper5 = DivIndicatorJsonParser.f47751p;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression11 = DivIndicatorJsonParser.f47746k;
            Expression<DivVisibility> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, lVar5, expression11);
            Expression<DivVisibility> expression12 = optionalExpression12 == null ? expression11 : optionalExpression12;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f47758a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f47758a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f47758a.Y6());
            if (divSize3 == null) {
                divSize3 = DivIndicatorJsonParser.f47747l;
            }
            return new DivIndicator(divAccessibility, expression2, expression3, divRoundedRectangleShape, optionalExpression3, optionalExpression4, expression4, expression6, optionalList, optionalList2, divBorder, optionalExpression7, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, str2, optionalExpression10, optionalExpression11, optionalList6, divShape2, divFixedSize2, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, optionalList9, optionalList10, expression12, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivIndicator divIndicator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divIndicator.q(), this.f47758a.H());
            Expression<Integer> expression = divIndicator.f47701b;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_color", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_size", divIndicator.f47702c);
            JsonPropertyParser.write(parsingContext, jSONObject, "active_shape", divIndicator.f47703d, this.f47758a.x6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divIndicator.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divIndicator.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divIndicator.o());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation", divIndicator.f47707h, DivIndicator.Animation.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divIndicator.y(), this.f47758a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divIndicator.getBackground(), this.f47758a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divIndicator.z(), this.f47758a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divIndicator.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divIndicator.k(), this.f47758a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divIndicator.getExtensions(), this.f47758a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divIndicator.p(), this.f47758a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divIndicator.w(), this.f47758a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divIndicator.getHeight(), this.f47758a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divIndicator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_item_color", divIndicator.f47718s, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_minimum_shape", divIndicator.f47719t, this.f47758a.x6());
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_shape", divIndicator.f47720u, this.f47758a.x6());
            JsonPropertyParser.write(parsingContext, jSONObject, "items_placement", divIndicator.f47721v, this.f47758a.a4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divIndicator.t(), this.f47758a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divIndicator.d(), this.f47758a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "minimum_item_size", divIndicator.f47724y);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divIndicator.r(), this.f47758a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "pager_id", divIndicator.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divIndicator.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divIndicator.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divIndicator.s(), this.f47758a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "shape", divIndicator.E, this.f47758a.V6());
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divIndicator.F, this.f47758a.w3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divIndicator.h(), this.f47758a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divIndicator.l(), this.f47758a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divIndicator.j(), this.f47758a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divIndicator.x(), this.f47758a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divIndicator.i(), this.f47758a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divIndicator.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divIndicator.u(), this.f47758a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divIndicator.c(), this.f47758a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divIndicator.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divIndicator.v(), this.f47758a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divIndicator.a(), this.f47758a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divIndicator.getWidth(), this.f47758a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47758a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47759a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivIndicatorTemplate deserialize(ParsingContext parsingContext, DivIndicatorTemplate divIndicatorTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47766a : null, this.f47759a.I());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field = divIndicatorTemplate != null ? divIndicatorTemplate.f47767b : null;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_color", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = divIndicatorTemplate != null ? divIndicatorTemplate.f47768c : null;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_size", typeHelper2, allowPropertyOverride, field2, lVar2, DivIndicatorJsonParser.f47752q);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "active_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47769d : null, this.f47759a.y6());
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.f47748m, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47770e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivIndicatorJsonParser.f47749n, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47771f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper2, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47772g : null, lVar2, DivIndicatorJsonParser.f47753r);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation", DivIndicatorJsonParser.f47750o, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47773h : null, DivIndicator.Animation.FROM_STRING);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47774i : null, this.f47759a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47775j : null, this.f47759a.G1());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47776k : null, this.f47759a.M1());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = divIndicatorTemplate != null ? divIndicatorTemplate.f47777l : null;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, field3, lVar3, DivIndicatorJsonParser.f47754s);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47778m : null, this.f47759a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47779n : null, this.f47759a.c3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47780o : null, this.f47759a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47781p : null, this.f47759a.J3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47782q : null, this.f47759a.Z6());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47783r : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_item_color", typeHelper, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47784s : null, lVar);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_minimum_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47785t : null, this.f47759a.y6());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47786u : null, this.f47759a.y6());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "items_placement", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47787v : null, this.f47759a.b4());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47788w : null, this.f47759a.Q4());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47789x : null, this.f47759a.Z2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "minimum_item_size", typeHelper2, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47790y : null, lVar2, DivIndicatorJsonParser.f47755t);
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.f47791z : null, this.f47759a.Z2());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pager_id", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.A : null);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.B : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.C : null, lVar3, DivIndicatorJsonParser.f47756u);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.D : null, this.f47759a.v0());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.E : null, this.f47759a.W6());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.F : null, this.f47759a.x3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.G : null, this.f47759a.Q8());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.H : null, this.f47759a.c9());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.I : null, this.f47759a.V1());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.J : null, this.f47759a.A1());
            Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.K : null, this.f47759a.A1());
            Field<List<DivTransitionTrigger>> field4 = divIndicatorTemplate != null ? divIndicatorTemplate.L : null;
            bk.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivIndicatorJsonParser.f47757v;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivIndicatorTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField, optionalListField2, optionalField3, optionalFieldWithExpression7, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalFieldWithExpression8, optionalField7, optionalField8, optionalField9, optionalField10, optionalField11, optionalFieldWithExpression9, optionalField12, optionalField13, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalListField6, optionalField14, optionalField15, optionalListField7, optionalField16, optionalField17, optionalField18, optionalField19, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar4, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.M : null, this.f47759a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.N : null, this.f47759a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivIndicatorJsonParser.f47751p, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.O : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.P : null, this.f47759a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.Q : null, this.f47759a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.R : null, this.f47759a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivIndicatorTemplate divIndicatorTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divIndicatorTemplate.f47766a, this.f47759a.I());
            Field<Expression<Integer>> field = divIndicatorTemplate.f47767b;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_color", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_size", divIndicatorTemplate.f47768c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "active_shape", divIndicatorTemplate.f47769d, this.f47759a.y6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divIndicatorTemplate.f47770e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divIndicatorTemplate.f47771f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divIndicatorTemplate.f47772g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation", divIndicatorTemplate.f47773h, DivIndicator.Animation.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divIndicatorTemplate.f47774i, this.f47759a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divIndicatorTemplate.f47775j, this.f47759a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divIndicatorTemplate.f47776k, this.f47759a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divIndicatorTemplate.f47777l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divIndicatorTemplate.f47778m, this.f47759a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divIndicatorTemplate.f47779n, this.f47759a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divIndicatorTemplate.f47780o, this.f47759a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divIndicatorTemplate.f47781p, this.f47759a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divIndicatorTemplate.f47782q, this.f47759a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divIndicatorTemplate.f47783r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_item_color", divIndicatorTemplate.f47784s, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_minimum_shape", divIndicatorTemplate.f47785t, this.f47759a.y6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_shape", divIndicatorTemplate.f47786u, this.f47759a.y6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "items_placement", divIndicatorTemplate.f47787v, this.f47759a.b4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divIndicatorTemplate.f47788w, this.f47759a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divIndicatorTemplate.f47789x, this.f47759a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "minimum_item_size", divIndicatorTemplate.f47790y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divIndicatorTemplate.f47791z, this.f47759a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pager_id", divIndicatorTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divIndicatorTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divIndicatorTemplate.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divIndicatorTemplate.D, this.f47759a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "shape", divIndicatorTemplate.E, this.f47759a.W6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", divIndicatorTemplate.F, this.f47759a.x3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divIndicatorTemplate.G, this.f47759a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divIndicatorTemplate.H, this.f47759a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divIndicatorTemplate.I, this.f47759a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divIndicatorTemplate.J, this.f47759a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divIndicatorTemplate.K, this.f47759a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divIndicatorTemplate.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divIndicatorTemplate.M, this.f47759a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divIndicatorTemplate.N, this.f47759a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divIndicatorTemplate.O, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divIndicatorTemplate.P, this.f47759a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divIndicatorTemplate.Q, this.f47759a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divIndicatorTemplate.R, this.f47759a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47759a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivIndicatorTemplate, DivIndicator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47760a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivIndicator resolve(ParsingContext parsingContext, DivIndicatorTemplate divIndicatorTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47766a, jSONObject, "accessibility", this.f47760a.J(), this.f47760a.H());
            Field<Expression<Integer>> field = divIndicatorTemplate.f47767b;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivIndicatorJsonParser.f47737b;
            Expression<Integer> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_item_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<Double>> field2 = divIndicatorTemplate.f47768c;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivIndicatorJsonParser.f47752q;
            Expression<Double> expression3 = DivIndicatorJsonParser.f47738c;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_item_size", typeHelper2, lVar2, valueValidator, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47769d, jSONObject, "active_shape", this.f47760a.z6(), this.f47760a.x6());
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.f47770e, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.f47748m, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.f47771f, jSONObject, "alignment_vertical", DivIndicatorJsonParser.f47749n, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field3 = divIndicatorTemplate.f47772g;
            ValueValidator<Double> valueValidator2 = DivIndicatorJsonParser.f47753r;
            Expression<Double> expression4 = DivIndicatorJsonParser.f47739d;
            Expression<Double> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper2, lVar2, valueValidator2, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Field<Expression<DivIndicator.Animation>> field4 = divIndicatorTemplate.f47773h;
            TypeHelper<DivIndicator.Animation> typeHelper3 = DivIndicatorJsonParser.f47750o;
            bk.l<String, DivIndicator.Animation> lVar3 = DivIndicator.Animation.FROM_STRING;
            Expression<DivIndicator.Animation> expression5 = DivIndicatorJsonParser.f47740e;
            Expression<DivIndicator.Animation> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "animation", typeHelper3, lVar3, expression5);
            Expression<DivIndicator.Animation> expression6 = expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f47774i, jSONObject, "animators", this.f47760a.v1(), this.f47760a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f47775j, jSONObject, A2.f54950g, this.f47760a.H1(), this.f47760a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47776k, jSONObject, "border", this.f47760a.N1(), this.f47760a.L1());
            Field<Expression<Long>> field5 = divIndicatorTemplate.f47777l;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, lVar4, DivIndicatorJsonParser.f47754s);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f47778m, jSONObject, "disappear_actions", this.f47760a.R2(), this.f47760a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f47779n, jSONObject, "extensions", this.f47760a.d3(), this.f47760a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47780o, jSONObject, "focus", this.f47760a.B3(), this.f47760a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.f47781p, jSONObject, "functions", this.f47760a.K3(), this.f47760a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47782q, jSONObject, "height", this.f47760a.a7(), this.f47760a.Y6());
            if (divSize == null) {
                divSize = DivIndicatorJsonParser.f47741f;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47783r, jSONObject, "id");
            Field<Expression<Integer>> field6 = divIndicatorTemplate.f47784s;
            Expression<Integer> expression7 = DivIndicatorJsonParser.f47742g;
            Expression<Integer> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "inactive_item_color", typeHelper, lVar, expression7);
            Expression<Integer> expression8 = expressionResolveOptionalExpression8 == null ? expression7 : expressionResolveOptionalExpression8;
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47785t, jSONObject, "inactive_minimum_shape", this.f47760a.z6(), this.f47760a.x6());
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47786u, jSONObject, "inactive_shape", this.f47760a.z6(), this.f47760a.x6());
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47787v, jSONObject, "items_placement", this.f47760a.c4(), this.f47760a.a4());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47788w, jSONObject, "layout_provider", this.f47760a.R4(), this.f47760a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47789x, jSONObject, "margins", this.f47760a.a3(), this.f47760a.Y2());
            Field<Expression<Double>> field7 = divIndicatorTemplate.f47790y;
            ValueValidator<Double> valueValidator3 = DivIndicatorJsonParser.f47755t;
            Expression<Double> expression9 = DivIndicatorJsonParser.f47743h;
            Expression<Double> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "minimum_item_size", typeHelper2, lVar2, valueValidator3, expression9);
            Expression<Double> expression10 = expressionResolveOptionalExpression9 == null ? expression9 : expressionResolveOptionalExpression9;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.f47791z, jSONObject, "paddings", this.f47760a.a3(), this.f47760a.Y2());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.A, jSONObject, "pager_id");
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.C, jSONObject, "row_span", typeHelper4, lVar4, DivIndicatorJsonParser.f47756u);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.D, jSONObject, "selected_actions", this.f47760a.w0(), this.f47760a.u0());
            DivShape divShape = (DivShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.E, jSONObject, "shape", this.f47760a.X6(), this.f47760a.V6());
            if (divShape == null) {
                divShape = DivIndicatorJsonParser.f47744i;
            }
            DivShape divShape2 = divShape;
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.F, jSONObject, "space_between_centers", this.f47760a.y3(), this.f47760a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivIndicatorJsonParser.f47745j;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.G, jSONObject, "tooltips", this.f47760a.R8(), this.f47760a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.H, jSONObject, "transform", this.f47760a.d9(), this.f47760a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.I, jSONObject, "transition_change", this.f47760a.W1(), this.f47760a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.J, jSONObject, "transition_in", this.f47760a.B1(), this.f47760a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.K, jSONObject, "transition_out", this.f47760a.B1(), this.f47760a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.L, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivIndicatorJsonParser.f47757v);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.M, jSONObject, "variable_triggers", this.f47760a.g9(), this.f47760a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.N, jSONObject, "variables", this.f47760a.m9(), this.f47760a.k9());
            Field<Expression<DivVisibility>> field8 = divIndicatorTemplate.O;
            TypeHelper<DivVisibility> typeHelper5 = DivIndicatorJsonParser.f47751p;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression11 = DivIndicatorJsonParser.f47746k;
            Expression<DivVisibility> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper5, lVar5, expression11);
            Expression<DivVisibility> expression12 = expressionResolveOptionalExpression12 == null ? expression11 : expressionResolveOptionalExpression12;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.P, jSONObject, "visibility_action", this.f47760a.y9(), this.f47760a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.Q, jSONObject, "visibility_actions", this.f47760a.y9(), this.f47760a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.R, jSONObject, "width", this.f47760a.a7(), this.f47760a.Y6());
            if (divSize3 == null) {
                divSize3 = DivIndicatorJsonParser.f47747l;
            }
            return new DivIndicator(divAccessibility, expression2, expression3, divRoundedRectangleShape, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expression4, expression6, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression7, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, str2, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, listResolveOptionalList6, divShape2, divFixedSize2, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression12, divVisibilityAction, listResolveOptionalList11, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47760a = jsonParserComponent;
        }
    }

    public static final boolean g(double d10) {
        return d10 > 0.0d;
    }

    public static final boolean h(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(double d10) {
        return d10 > 0.0d;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47737b = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        f47738c = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        f47739d = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivIndicator.Animation animation = DivIndicator.Animation.SCALE;
        f47740e = Expression.Companion.constant$default(companion, animation, null, 2, null);
        f47741f = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f47742g = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        f47743h = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        f47744i = new DivShape.c(new DivRoundedRectangleShape(null, null, null, null, null, 31, null));
        f47745j = new DivFixedSize(null, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f47746k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f47747l = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f47748m = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47749n = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47750o = companion2.from(animation, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ANIMATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivIndicator.Animation);
            }
        });
        f47751p = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f47752q = new ValueValidator() { // from class: oe.h5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f47753r = new ValueValidator() { // from class: oe.i5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.h(((Double) obj).doubleValue());
            }
        };
        f47754s = new ValueValidator() { // from class: oe.j5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.i(((Long) obj).longValue());
            }
        };
        f47755t = new ValueValidator() { // from class: oe.k5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.j(((Double) obj).doubleValue());
            }
        };
        f47756u = new ValueValidator() { // from class: oe.l5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivIndicatorJsonParser.k(((Long) obj).longValue());
            }
        };
        f47757v = new ListValidator() { // from class: oe.m5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivIndicatorJsonParser.l(list);
            }
        };
    }

    public static final boolean l(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
