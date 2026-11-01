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
import com.yandex.div2.DivPagerJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48269a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivPager.ItemAlignment> f48271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f48273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f48274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f48275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivPager.Orientation> f48276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f48277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivPager.ItemAlignment> f48278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f48279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f48280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f48281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f48282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivPager.ItemAlignment> f48283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivPager.Orientation> f48284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivPager.ItemAlignment> f48285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f48286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f48291w;

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48292a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPager deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f48292a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivPagerJsonParser.f48281m, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivPagerJsonParser.f48282n, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPagerJsonParser.f48287s;
            Expression<Double> expression = DivPagerJsonParser.f48270b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f48292a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f48292a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f48292a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivPagerJsonParser.f48288t);
            TypeHelper<DivPager.ItemAlignment> typeHelper3 = DivPagerJsonParser.f48283o;
            bk.l<String, DivPager.ItemAlignment> lVar3 = DivPager.ItemAlignment.FROM_STRING;
            Expression<DivPager.ItemAlignment> expression2 = DivPagerJsonParser.f48271c;
            Expression<DivPager.ItemAlignment> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_axis_alignment", typeHelper3, lVar3, expression2);
            Expression<DivPager.ItemAlignment> expression3 = optionalExpression5 == null ? expression2 : optionalExpression5;
            ValueValidator<Long> valueValidator2 = DivPagerJsonParser.f48289u;
            Expression<Long> expression4 = DivPagerJsonParser.f48272d;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression6 != null) {
                expression4 = optionalExpression6;
            }
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f48292a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f48292a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f48292a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f48292a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f48292a.Y6());
            if (divSize == null) {
                divSize = DivPagerJsonParser.f48273e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = DivPagerJsonParser.f48274f;
            Expression<Boolean> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "infinite_scroll", typeHelper4, lVar4, expression5);
            if (optionalExpression7 != null) {
                expression5 = optionalExpression7;
            }
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f48292a.d2());
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f48292a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivPagerJsonParser.f48275g;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f48292a.M4());
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonPropertyParser.read(parsingContext, jSONObject, "layout_mode", this.f48292a.C5());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f48292a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f48292a.Y2());
            TypeHelper<DivPager.Orientation> typeHelper5 = DivPagerJsonParser.f48284p;
            bk.l<String, DivPager.Orientation> lVar5 = DivPager.Orientation.FROM_STRING;
            Expression<DivPager.Orientation> expression6 = DivPagerJsonParser.f48276h;
            Expression<DivPager.Orientation> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper5, lVar5, expression6);
            if (optionalExpression8 != null) {
                expression6 = optionalExpression8;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f48292a.Y2());
            DivPageTransformation divPageTransformation = (DivPageTransformation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "page_transformation", this.f48292a.q5());
            Expression<Boolean> expression7 = DivPagerJsonParser.f48277i;
            Expression<Boolean> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper4, lVar4, expression7);
            if (optionalExpression9 != null) {
                expression7 = optionalExpression9;
            }
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivPagerJsonParser.f48290v);
            TypeHelper<DivPager.ItemAlignment> typeHelper6 = DivPagerJsonParser.f48285q;
            Expression<DivPager.ItemAlignment> expression8 = DivPagerJsonParser.f48278j;
            Expression<DivPager.ItemAlignment> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_axis_alignment", typeHelper6, lVar3, expression8);
            Expression<DivPager.ItemAlignment> expression9 = optionalExpression12 == null ? expression8 : optionalExpression12;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f48292a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f48292a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f48292a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f48292a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f48292a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f48292a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivPagerJsonParser.f48291w);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f48292a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f48292a.k9());
            TypeHelper<DivVisibility> typeHelper7 = DivPagerJsonParser.f48286r;
            bk.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivPagerJsonParser.f48279k;
            Expression<DivVisibility> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper7, lVar6, expression10);
            Expression<DivVisibility> expression11 = optionalExpression13 == null ? expression10 : optionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f48292a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f48292a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f48292a.Y6());
            if (divSize3 == null) {
                divSize3 = DivPagerJsonParser.f48280l;
            }
            return new DivPager(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, expression3, expression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression5, divCollectionItemBuilder, divFixedSize2, optionalList6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, divPageTransformation, expression7, optionalExpression10, optionalExpression11, expression9, optionalList7, optionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression11, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPager divPager) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divPager.q(), this.f48292a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divPager.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divPager.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divPager.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divPager.y(), this.f48292a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divPager.getBackground(), this.f48292a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divPager.z(), this.f48292a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divPager.b());
            Expression<DivPager.ItemAlignment> expression = divPager.f48249i;
            bk.l<DivPager.ItemAlignment, String> lVar = DivPager.ItemAlignment.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_axis_alignment", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divPager.f48250j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divPager.k(), this.f48292a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divPager.getExtensions(), this.f48292a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divPager.p(), this.f48292a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divPager.w(), this.f48292a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divPager.getHeight(), this.f48292a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divPager.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "infinite_scroll", divPager.f48257q);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divPager.f48258r, this.f48292a.d2());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divPager.f48259s, this.f48292a.w3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divPager.f48260t, this.f48292a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_mode", divPager.f48261u, this.f48292a.C5());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divPager.t(), this.f48292a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divPager.d(), this.f48292a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", divPager.f48264x, DivPager.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divPager.r(), this.f48292a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "page_transformation", divPager.f48266z, this.f48292a.q5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divPager.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divPager.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divPager.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_axis_alignment", divPager.D, lVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divPager.s(), this.f48292a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divPager.h(), this.f48292a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divPager.l(), this.f48292a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divPager.j(), this.f48292a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divPager.x(), this.f48292a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divPager.i(), this.f48292a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divPager.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divPager.u(), this.f48292a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divPager.c(), this.f48292a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divPager.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divPager.v(), this.f48292a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divPager.a(), this.f48292a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divPager.getWidth(), this.f48292a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48292a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48293a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPagerTemplate deserialize(ParsingContext parsingContext, DivPagerTemplate divPagerTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48310a : null, this.f48293a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivPagerJsonParser.f48281m, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48311b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivPagerJsonParser.f48282n, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48312c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48313d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivPagerJsonParser.f48287s);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48314e : null, this.f48293a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48315f : null, this.f48293a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48316g : null, this.f48293a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divPagerTemplate != null ? divPagerTemplate.f48317h : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivPagerJsonParser.f48288t);
            TypeHelper<DivPager.ItemAlignment> typeHelper2 = DivPagerJsonParser.f48283o;
            Field<Expression<DivPager.ItemAlignment>> field2 = divPagerTemplate != null ? divPagerTemplate.f48318i : null;
            bk.l<String, DivPager.ItemAlignment> lVar2 = DivPager.ItemAlignment.FROM_STRING;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48319j : null, lVar, DivPagerJsonParser.f48289u);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48320k : null, this.f48293a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48321l : null, this.f48293a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48322m : null, this.f48293a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48323n : null, this.f48293a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48324o : null, this.f48293a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48325p : null);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = divPagerTemplate != null ? divPagerTemplate.f48326q : null;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "infinite_scroll", typeHelper3, allowPropertyOverride, field3, lVar3);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48327r : null, this.f48293a.e2());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48328s : null, this.f48293a.x3());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48329t : null, this.f48293a.N4());
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "layout_mode", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48330u : null, this.f48293a.D5());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48331v : null, this.f48293a.Q4());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48332w : null, this.f48293a.Z2());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", DivPagerJsonParser.f48284p, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48333x : null, DivPager.Orientation.FROM_STRING);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48334y : null, this.f48293a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "page_transformation", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f48335z : null, this.f48293a.r5());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.A : null, lVar3);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.B : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.C : null, lVar, DivPagerJsonParser.f48290v);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scroll_axis_alignment", DivPagerJsonParser.f48285q, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.D : null, lVar2);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.E : null, this.f48293a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.F : null, this.f48293a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.G : null, this.f48293a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.H : null, this.f48293a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.I : null, this.f48293a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.J : null, this.f48293a.A1());
            Field<List<DivTransitionTrigger>> field5 = divPagerTemplate != null ? divPagerTemplate.K : null;
            bk.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivPagerJsonParser.f48291w;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivPagerTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression7, optionalField6, optionalField7, optionalListField6, field4, optionalField8, optionalField9, optionalFieldWithExpression8, optionalField10, optionalField11, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalListField8, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar4, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.L : null, this.f48293a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.M : null, this.f48293a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivPagerJsonParser.f48286r, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.O : null, this.f48293a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.P : null, this.f48293a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.Q : null, this.f48293a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivPagerTemplate divPagerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divPagerTemplate.f48310a, this.f48293a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divPagerTemplate.f48311b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divPagerTemplate.f48312c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divPagerTemplate.f48313d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divPagerTemplate.f48314e, this.f48293a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divPagerTemplate.f48315f, this.f48293a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divPagerTemplate.f48316g, this.f48293a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divPagerTemplate.f48317h);
            Field<Expression<DivPager.ItemAlignment>> field = divPagerTemplate.f48318i;
            bk.l<DivPager.ItemAlignment, String> lVar = DivPager.ItemAlignment.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_axis_alignment", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", divPagerTemplate.f48319j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divPagerTemplate.f48320k, this.f48293a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divPagerTemplate.f48321l, this.f48293a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divPagerTemplate.f48322m, this.f48293a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divPagerTemplate.f48323n, this.f48293a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divPagerTemplate.f48324o, this.f48293a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divPagerTemplate.f48325p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "infinite_scroll", divPagerTemplate.f48326q);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divPagerTemplate.f48327r, this.f48293a.e2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", divPagerTemplate.f48328s, this.f48293a.x3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divPagerTemplate.f48329t, this.f48293a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_mode", divPagerTemplate.f48330u, this.f48293a.D5());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divPagerTemplate.f48331v, this.f48293a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divPagerTemplate.f48332w, this.f48293a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", divPagerTemplate.f48333x, DivPager.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divPagerTemplate.f48334y, this.f48293a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "page_transformation", divPagerTemplate.f48335z, this.f48293a.r5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divPagerTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divPagerTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divPagerTemplate.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_axis_alignment", divPagerTemplate.D, lVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divPagerTemplate.E, this.f48293a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divPagerTemplate.F, this.f48293a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divPagerTemplate.G, this.f48293a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divPagerTemplate.H, this.f48293a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divPagerTemplate.I, this.f48293a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divPagerTemplate.J, this.f48293a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divPagerTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divPagerTemplate.L, this.f48293a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divPagerTemplate.M, this.f48293a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divPagerTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divPagerTemplate.O, this.f48293a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divPagerTemplate.P, this.f48293a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divPagerTemplate.Q, this.f48293a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48293a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPagerTemplate, DivPager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48294a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPager resolve(ParsingContext parsingContext, DivPagerTemplate divPagerTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48310a, jSONObject, "accessibility", this.f48294a.J(), this.f48294a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.f48311b, jSONObject, "alignment_horizontal", DivPagerJsonParser.f48281m, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.f48312c, jSONObject, "alignment_vertical", DivPagerJsonParser.f48282n, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divPagerTemplate.f48313d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPagerJsonParser.f48287s;
            Expression<Double> expression = DivPagerJsonParser.f48270b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f48314e, jSONObject, "animators", this.f48294a.v1(), this.f48294a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f48315f, jSONObject, A2.f54950g, this.f48294a.H1(), this.f48294a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48316g, jSONObject, "border", this.f48294a.N1(), this.f48294a.L1());
            Field<Expression<Long>> field2 = divPagerTemplate.f48317h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivPagerJsonParser.f48288t);
            Field<Expression<DivPager.ItemAlignment>> field3 = divPagerTemplate.f48318i;
            TypeHelper<DivPager.ItemAlignment> typeHelper3 = DivPagerJsonParser.f48283o;
            bk.l<String, DivPager.ItemAlignment> lVar3 = DivPager.ItemAlignment.FROM_STRING;
            Expression<DivPager.ItemAlignment> expression2 = DivPagerJsonParser.f48271c;
            Expression<DivPager.ItemAlignment> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_axis_alignment", typeHelper3, lVar3, expression2);
            Expression<DivPager.ItemAlignment> expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            Field<Expression<Long>> field4 = divPagerTemplate.f48319j;
            ValueValidator<Long> valueValidator2 = DivPagerJsonParser.f48289u;
            Expression<Long> expression4 = DivPagerJsonParser.f48272d;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, lVar2, valueValidator2, expression4);
            if (expressionResolveOptionalExpression6 != null) {
                expression4 = expressionResolveOptionalExpression6;
            }
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f48320k, jSONObject, "disappear_actions", this.f48294a.R2(), this.f48294a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f48321l, jSONObject, "extensions", this.f48294a.d3(), this.f48294a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48322m, jSONObject, "focus", this.f48294a.B3(), this.f48294a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f48323n, jSONObject, "functions", this.f48294a.K3(), this.f48294a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48324o, jSONObject, "height", this.f48294a.a7(), this.f48294a.Y6());
            if (divSize == null) {
                divSize = DivPagerJsonParser.f48273e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48325p, jSONObject, "id");
            Field<Expression<Boolean>> field5 = divPagerTemplate.f48326q;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = DivPagerJsonParser.f48274f;
            Expression<Boolean> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "infinite_scroll", typeHelper4, lVar4, expression5);
            if (expressionResolveOptionalExpression7 != null) {
                expression5 = expressionResolveOptionalExpression7;
            }
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48327r, jSONObject, "item_builder", this.f48294a.f2(), this.f48294a.d2());
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48328s, jSONObject, "item_spacing", this.f48294a.y3(), this.f48294a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivPagerJsonParser.f48275g;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f48329t, jSONObject, "items", this.f48294a.O4(), this.f48294a.M4());
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonFieldResolver.resolve(parsingContext, divPagerTemplate.f48330u, jSONObject, "layout_mode", this.f48294a.E5(), this.f48294a.C5());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48331v, jSONObject, "layout_provider", this.f48294a.R4(), this.f48294a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48332w, jSONObject, "margins", this.f48294a.a3(), this.f48294a.Y2());
            Field<Expression<DivPager.Orientation>> field6 = divPagerTemplate.f48333x;
            TypeHelper<DivPager.Orientation> typeHelper5 = DivPagerJsonParser.f48284p;
            bk.l<String, DivPager.Orientation> lVar5 = DivPager.Orientation.FROM_STRING;
            Expression<DivPager.Orientation> expression6 = DivPagerJsonParser.f48276h;
            Expression<DivPager.Orientation> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "orientation", typeHelper5, lVar5, expression6);
            if (expressionResolveOptionalExpression8 != null) {
                expression6 = expressionResolveOptionalExpression8;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48334y, jSONObject, "paddings", this.f48294a.a3(), this.f48294a.Y2());
            DivPageTransformation divPageTransformation = (DivPageTransformation) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f48335z, jSONObject, "page_transformation", this.f48294a.s5(), this.f48294a.q5());
            Field<Expression<Boolean>> field7 = divPagerTemplate.A;
            Expression<Boolean> expression7 = DivPagerJsonParser.f48277i;
            Expression<Boolean> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper4, lVar4, expression7);
            if (expressionResolveOptionalExpression9 != null) {
                expression7 = expressionResolveOptionalExpression9;
            }
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.C, jSONObject, "row_span", typeHelper2, lVar2, DivPagerJsonParser.f48290v);
            Field<Expression<DivPager.ItemAlignment>> field8 = divPagerTemplate.D;
            TypeHelper<DivPager.ItemAlignment> typeHelper6 = DivPagerJsonParser.f48285q;
            Expression<DivPager.ItemAlignment> expression8 = DivPagerJsonParser.f48278j;
            Expression<DivPager.ItemAlignment> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_axis_alignment", typeHelper6, lVar3, expression8);
            Expression<DivPager.ItemAlignment> expression9 = expressionResolveOptionalExpression12 == null ? expression8 : expressionResolveOptionalExpression12;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.E, jSONObject, "selected_actions", this.f48294a.w0(), this.f48294a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.F, jSONObject, "tooltips", this.f48294a.R8(), this.f48294a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.G, jSONObject, "transform", this.f48294a.d9(), this.f48294a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.H, jSONObject, "transition_change", this.f48294a.W1(), this.f48294a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.I, jSONObject, "transition_in", this.f48294a.B1(), this.f48294a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.J, jSONObject, "transition_out", this.f48294a.B1(), this.f48294a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivPagerJsonParser.f48291w);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.L, jSONObject, "variable_triggers", this.f48294a.g9(), this.f48294a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.M, jSONObject, "variables", this.f48294a.m9(), this.f48294a.k9());
            Field<Expression<DivVisibility>> field9 = divPagerTemplate.N;
            TypeHelper<DivVisibility> typeHelper7 = DivPagerJsonParser.f48286r;
            bk.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivPagerJsonParser.f48279k;
            Expression<DivVisibility> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper7, lVar6, expression10);
            Expression<DivVisibility> expression11 = expressionResolveOptionalExpression13 == null ? expression10 : expressionResolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.O, jSONObject, "visibility_action", this.f48294a.y9(), this.f48294a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.P, jSONObject, "visibility_actions", this.f48294a.y9(), this.f48294a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.Q, jSONObject, "width", this.f48294a.a7(), this.f48294a.Y6());
            if (divSize3 == null) {
                divSize3 = DivPagerJsonParser.f48280l;
            }
            return new DivPager(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, expression3, expression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression5, divCollectionItemBuilder, divFixedSize2, listResolveOptionalList6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, divPageTransformation, expression7, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expression9, listResolveOptionalList7, listResolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression11, divVisibilityAction, listResolveOptionalList12, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48294a = jsonParserComponent;
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f48270b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivPager.ItemAlignment itemAlignment = DivPager.ItemAlignment.START;
        f48271c = Expression.Companion.constant$default(companion, itemAlignment, null, 2, null);
        f48272d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        DivSizeUnitValue divSizeUnitValue2 = null;
        f48273e = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, divSizeUnitValue2, 7, null));
        Boolean bool = Boolean.FALSE;
        f48274f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f48275g = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
        f48276h = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        f48277i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivPager.ItemAlignment itemAlignment2 = DivPager.ItemAlignment.CENTER;
        f48278j = Expression.Companion.constant$default(companion, itemAlignment2, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f48279k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f48280l = new DivSize.c(new DivMatchParentSize(divSizeUnitValue, divSizeUnitValue2, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48281m = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f48282n = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f48283o = companion2.from(itemAlignment, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_CROSS_AXIS_ALIGNMENT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
            }
        });
        f48284p = companion2.from(orientation, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.Orientation);
            }
        });
        f48285q = companion2.from(itemAlignment2, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_SCROLL_AXIS_ALIGNMENT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
            }
        });
        f48286r = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f48287s = new ValueValidator() { // from class: oe.k7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f48288t = new ValueValidator() { // from class: oe.l7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.g(((Long) obj).longValue());
            }
        };
        f48289u = new ValueValidator() { // from class: oe.m7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.h(((Long) obj).longValue());
            }
        };
        f48290v = new ValueValidator() { // from class: oe.n7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.i(((Long) obj).longValue());
            }
        };
        f48291w = new ListValidator() { // from class: oe.o7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivPagerJsonParser.j(list);
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
