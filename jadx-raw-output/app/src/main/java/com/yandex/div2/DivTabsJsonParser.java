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
import com.yandex.div2.DivTabsJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivTabsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49315a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f49319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f49322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final DivEdgeInsets f49323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final DivEdgeInsets f49325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f49326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f49327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f49328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f49329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f49330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f49331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTabs.Item> f49333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49335u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f49336v;

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49337a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f49337a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivTabsJsonParser.f49328n, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivTabsJsonParser.f49329o, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTabsJsonParser.f49331q;
            Expression<Double> expression = DivTabsJsonParser.f49316b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f49337a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f49337a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f49337a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivTabsJsonParser.f49332r);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f49337a.P2());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivTabsJsonParser.f49317c;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "dynamic_height", typeHelper3, lVar3, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f49337a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f49337a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f49337a.I3());
            Expression<Boolean> expression3 = DivTabsJsonParser.f49318d;
            Expression<Boolean> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_separator", typeHelper3, lVar3, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f49337a.Y6());
            if (divSize == null) {
                divSize = DivTabsJsonParser.f49319e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.f49337a.R7(), DivTabsJsonParser.f49333s);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f49337a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f49337a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f49337a.Y2());
            Expression<Boolean> expression4 = DivTabsJsonParser.f49320f;
            Expression<Boolean> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper3, lVar3, expression4);
            if (optionalExpression7 != null) {
                expression4 = optionalExpression7;
            }
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivTabsJsonParser.f49334t);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f49337a.u0());
            ValueValidator<Long> valueValidator2 = DivTabsJsonParser.f49335u;
            Expression<Long> expression5 = DivTabsJsonParser.f49321g;
            Expression<Long> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selected_tab", typeHelper2, lVar2, valueValidator2, expression5);
            if (optionalExpression10 != null) {
                expression5 = optionalExpression10;
            }
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivTabsJsonParser.f49322h;
            Expression<Integer> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "separator_color", typeHelper4, lVar4, expression6);
            Expression<Integer> expression7 = optionalExpression11 == null ? expression6 : optionalExpression11;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator_paddings", this.f49337a.Y2());
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabsJsonParser.f49323i;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Expression<Boolean> expression8 = DivTabsJsonParser.f49324j;
            Expression<Boolean> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, lVar3, expression8);
            Expression<Boolean> expression9 = optionalExpression12 == null ? expression8 : optionalExpression12;
            DivTabs.TabTitleDelimiter tabTitleDelimiter = (DivTabs.TabTitleDelimiter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_delimiter", this.f49337a.X7());
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_style", this.f49337a.a8());
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_paddings", this.f49337a.Y2());
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabsJsonParser.f49325k;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f49337a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f49337a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f49337a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f49337a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f49337a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTabsJsonParser.f49336v);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f49337a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f49337a.k9());
            TypeHelper<DivVisibility> typeHelper5 = DivTabsJsonParser.f49330p;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivTabsJsonParser.f49326l;
            Expression<DivVisibility> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, lVar5, expression10);
            Expression<DivVisibility> expression11 = optionalExpression13 == null ? expression10 : optionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f49337a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f49337a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f49337a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTabsJsonParser.f49327m;
            }
            return new DivTabs(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, expression2, optionalList4, divFocus, optionalList5, expression3, divSize2, str, list, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression4, optionalExpression8, optionalExpression9, optionalList6, expression5, expression7, divEdgeInsets4, expression9, tabTitleDelimiter, tabTitleStyle, divEdgeInsets6, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, optionalList9, optionalList10, expression11, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTabs divTabs) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divTabs.q(), this.f49337a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divTabs.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divTabs.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divTabs.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divTabs.y(), this.f49337a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divTabs.getBackground(), this.f49337a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divTabs.z(), this.f49337a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divTabs.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divTabs.k(), this.f49337a.P2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "dynamic_height", divTabs.f49257j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divTabs.getExtensions(), this.f49337a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divTabs.p(), this.f49337a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divTabs.w(), this.f49337a.I3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_separator", divTabs.f49261n);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divTabs.getHeight(), this.f49337a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTabs.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divTabs.f49264q, this.f49337a.R7());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divTabs.t(), this.f49337a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divTabs.d(), this.f49337a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divTabs.r(), this.f49337a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divTabs.f49268u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divTabs.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divTabs.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divTabs.s(), this.f49337a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selected_tab", divTabs.f49272y);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "separator_color", divTabs.f49273z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "separator_paddings", divTabs.A, this.f49337a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabs.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_delimiter", divTabs.C, this.f49337a.X7());
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_style", divTabs.D, this.f49337a.a8());
            JsonPropertyParser.write(parsingContext, jSONObject, "title_paddings", divTabs.E, this.f49337a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divTabs.h(), this.f49337a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divTabs.l(), this.f49337a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divTabs.j(), this.f49337a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divTabs.x(), this.f49337a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divTabs.i(), this.f49337a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divTabs.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divTabs.u(), this.f49337a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divTabs.c(), this.f49337a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divTabs.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divTabs.v(), this.f49337a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divTabs.a(), this.f49337a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divTabs.getWidth(), this.f49337a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49337a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49338a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabsTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate divTabsTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49370a : null, this.f49338a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivTabsJsonParser.f49328n, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49371b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivTabsJsonParser.f49329o, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49372c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49373d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivTabsJsonParser.f49331q);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49374e : null, this.f49338a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49375f : null, this.f49338a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49376g : null, this.f49338a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divTabsTemplate != null ? divTabsTemplate.f49377h : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivTabsJsonParser.f49332r);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49378i : null, this.f49338a.Q2());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = divTabsTemplate != null ? divTabsTemplate.f49379j : null;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "dynamic_height", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49380k : null, this.f49338a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49381l : null, this.f49338a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49382m : null, this.f49338a.J3());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_separator", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49383n : null, lVar2);
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49384o : null, this.f49338a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49385p : null);
            Field<List<DivTabsTemplate.ItemTemplate>> field3 = divTabsTemplate != null ? divTabsTemplate.f49386q : null;
            mj.g<e4> gVarS7 = this.f49338a.S7();
            ListValidator<DivTabs.Item> listValidator = DivTabsJsonParser.f49333s;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field3, gVarS7, listValidator);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49387r : null, this.f49338a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49388s : null, this.f49338a.Z2());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49389t : null, this.f49338a.Z2());
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49390u : null, lVar2);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49391v : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49392w : null, lVar, DivTabsJsonParser.f49334t);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49393x : null, this.f49338a.v0());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selected_tab", typeHelper, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49394y : null, lVar, DivTabsJsonParser.f49335u);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f49395z : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "separator_paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.A : null, this.f49338a.Z2());
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.B : null, lVar2);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_delimiter", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.C : null, this.f49338a.Y7());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_style", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.D : null, this.f49338a.b8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.E : null, this.f49338a.Z2());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.F : null, this.f49338a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.G : null, this.f49338a.c9());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.H : null, this.f49338a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.I : null, this.f49338a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.J : null, this.f49338a.A1());
            Field<List<DivTransitionTrigger>> field4 = divTabsTemplate != null ? divTabsTemplate.K : null;
            bk.l<String, DivTransitionTrigger> lVar3 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator2 = DivTabsJsonParser.f49336v;
            ck.p.h(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTabsTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField3, optionalListField5, optionalFieldWithExpression6, optionalField4, optionalField5, listField, optionalField6, optionalField7, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField6, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalField9, optionalFieldWithExpression12, optionalField10, optionalField11, optionalField12, optionalListField7, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar3, listValidator2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.L : null, this.f49338a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.M : null, this.f49338a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivTabsJsonParser.f49330p, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.O : null, this.f49338a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.P : null, this.f49338a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.Q : null, this.f49338a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate divTabsTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divTabsTemplate.f49370a, this.f49338a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divTabsTemplate.f49371b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divTabsTemplate.f49372c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divTabsTemplate.f49373d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divTabsTemplate.f49374e, this.f49338a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divTabsTemplate.f49375f, this.f49338a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divTabsTemplate.f49376g, this.f49338a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divTabsTemplate.f49377h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divTabsTemplate.f49378i, this.f49338a.Q2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "dynamic_height", divTabsTemplate.f49379j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divTabsTemplate.f49380k, this.f49338a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divTabsTemplate.f49381l, this.f49338a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divTabsTemplate.f49382m, this.f49338a.J3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_separator", divTabsTemplate.f49383n);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divTabsTemplate.f49384o, this.f49338a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTabsTemplate.f49385p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divTabsTemplate.f49386q, this.f49338a.S7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divTabsTemplate.f49387r, this.f49338a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divTabsTemplate.f49388s, this.f49338a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divTabsTemplate.f49389t, this.f49338a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divTabsTemplate.f49390u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divTabsTemplate.f49391v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divTabsTemplate.f49392w);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divTabsTemplate.f49393x, this.f49338a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selected_tab", divTabsTemplate.f49394y);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "separator_color", divTabsTemplate.f49395z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator_paddings", divTabsTemplate.A, this.f49338a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabsTemplate.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_delimiter", divTabsTemplate.C, this.f49338a.Y7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_style", divTabsTemplate.D, this.f49338a.b8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "title_paddings", divTabsTemplate.E, this.f49338a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divTabsTemplate.F, this.f49338a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divTabsTemplate.G, this.f49338a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divTabsTemplate.H, this.f49338a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divTabsTemplate.I, this.f49338a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divTabsTemplate.J, this.f49338a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divTabsTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divTabsTemplate.L, this.f49338a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divTabsTemplate.M, this.f49338a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divTabsTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divTabsTemplate.O, this.f49338a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divTabsTemplate.P, this.f49338a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divTabsTemplate.Q, this.f49338a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49338a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTabsTemplate, DivTabs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49339a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs resolve(ParsingContext parsingContext, DivTabsTemplate divTabsTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49370a, jSONObject, "accessibility", this.f49339a.J(), this.f49339a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f49371b, jSONObject, "alignment_horizontal", DivTabsJsonParser.f49328n, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f49372c, jSONObject, "alignment_vertical", DivTabsJsonParser.f49329o, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divTabsTemplate.f49373d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTabsJsonParser.f49331q;
            Expression<Double> expression = DivTabsJsonParser.f49316b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f49374e, jSONObject, "animators", this.f49339a.v1(), this.f49339a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f49375f, jSONObject, A2.f54950g, this.f49339a.H1(), this.f49339a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49376g, jSONObject, "border", this.f49339a.N1(), this.f49339a.L1());
            Field<Expression<Long>> field2 = divTabsTemplate.f49377h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivTabsJsonParser.f49332r);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f49378i, jSONObject, "disappear_actions", this.f49339a.R2(), this.f49339a.P2());
            Field<Expression<Boolean>> field3 = divTabsTemplate.f49379j;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivTabsJsonParser.f49317c;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "dynamic_height", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression5 != null) {
                expression2 = expressionResolveOptionalExpression5;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f49380k, jSONObject, "extensions", this.f49339a.d3(), this.f49339a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49381l, jSONObject, "focus", this.f49339a.B3(), this.f49339a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f49382m, jSONObject, "functions", this.f49339a.K3(), this.f49339a.I3());
            Field<Expression<Boolean>> field4 = divTabsTemplate.f49383n;
            Expression<Boolean> expression3 = DivTabsJsonParser.f49318d;
            Expression<Boolean> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "has_separator", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression6 != null) {
                expression3 = expressionResolveOptionalExpression6;
            }
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49384o, jSONObject, "height", this.f49339a.a7(), this.f49339a.Y6());
            if (divSize == null) {
                divSize = DivTabsJsonParser.f49319e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49385p, jSONObject, "id");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divTabsTemplate.f49386q, jSONObject, "items", this.f49339a.T7(), this.f49339a.R7(), DivTabsJsonParser.f49333s);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49387r, jSONObject, "layout_provider", this.f49339a.R4(), this.f49339a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49388s, jSONObject, "margins", this.f49339a.a3(), this.f49339a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f49389t, jSONObject, "paddings", this.f49339a.a3(), this.f49339a.Y2());
            Field<Expression<Boolean>> field5 = divTabsTemplate.f49390u;
            Expression<Boolean> expression4 = DivTabsJsonParser.f49320f;
            Expression<Boolean> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "restrict_parent_scroll", typeHelper3, lVar3, expression4);
            if (expressionResolveOptionalExpression7 != null) {
                expression4 = expressionResolveOptionalExpression7;
            }
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f49391v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f49392w, jSONObject, "row_span", typeHelper2, lVar2, DivTabsJsonParser.f49334t);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f49393x, jSONObject, "selected_actions", this.f49339a.w0(), this.f49339a.u0());
            Field<Expression<Long>> field6 = divTabsTemplate.f49394y;
            ValueValidator<Long> valueValidator2 = DivTabsJsonParser.f49335u;
            Expression<Long> expression5 = DivTabsJsonParser.f49321g;
            Expression<Long> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "selected_tab", typeHelper2, lVar2, valueValidator2, expression5);
            if (expressionResolveOptionalExpression10 != null) {
                expression5 = expressionResolveOptionalExpression10;
            }
            Field<Expression<Integer>> field7 = divTabsTemplate.f49395z;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivTabsJsonParser.f49322h;
            Expression<Integer> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "separator_color", typeHelper4, lVar4, expression6);
            Expression<Integer> expression7 = expressionResolveOptionalExpression11 == null ? expression6 : expressionResolveOptionalExpression11;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.A, jSONObject, "separator_paddings", this.f49339a.a3(), this.f49339a.Y2());
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabsJsonParser.f49323i;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Field<Expression<Boolean>> field8 = divTabsTemplate.B;
            Expression<Boolean> expression8 = DivTabsJsonParser.f49324j;
            Expression<Boolean> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, lVar3, expression8);
            Expression<Boolean> expression9 = expressionResolveOptionalExpression12 == null ? expression8 : expressionResolveOptionalExpression12;
            DivTabs.TabTitleDelimiter tabTitleDelimiter = (DivTabs.TabTitleDelimiter) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.C, jSONObject, "tab_title_delimiter", this.f49339a.Z7(), this.f49339a.X7());
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.D, jSONObject, "tab_title_style", this.f49339a.c8(), this.f49339a.a8());
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.E, jSONObject, "title_paddings", this.f49339a.a3(), this.f49339a.Y2());
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabsJsonParser.f49325k;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.F, jSONObject, "tooltips", this.f49339a.R8(), this.f49339a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.G, jSONObject, "transform", this.f49339a.d9(), this.f49339a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.H, jSONObject, "transition_change", this.f49339a.W1(), this.f49339a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.I, jSONObject, "transition_in", this.f49339a.B1(), this.f49339a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.J, jSONObject, "transition_out", this.f49339a.B1(), this.f49339a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTabsJsonParser.f49336v);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.L, jSONObject, "variable_triggers", this.f49339a.g9(), this.f49339a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.M, jSONObject, "variables", this.f49339a.m9(), this.f49339a.k9());
            Field<Expression<DivVisibility>> field9 = divTabsTemplate.N;
            TypeHelper<DivVisibility> typeHelper5 = DivTabsJsonParser.f49330p;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivTabsJsonParser.f49326l;
            Expression<DivVisibility> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper5, lVar5, expression10);
            Expression<DivVisibility> expression11 = expressionResolveOptionalExpression13 == null ? expression10 : expressionResolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.O, jSONObject, "visibility_action", this.f49339a.y9(), this.f49339a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.P, jSONObject, "visibility_actions", this.f49339a.y9(), this.f49339a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.Q, jSONObject, "width", this.f49339a.a7(), this.f49339a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTabsJsonParser.f49327m;
            }
            return new DivTabs(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, expression2, listResolveOptionalList4, divFocus, listResolveOptionalList5, expression3, divSize2, str, listResolveList, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression4, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList6, expression5, expression7, divEdgeInsets4, expression9, tabTitleDelimiter, tabTitleStyle, divEdgeInsets6, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression11, divVisibilityAction, listResolveOptionalList11, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49339a = jsonParserComponent;
        }
    }

    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49316b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f49317c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49318d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49319e = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f49320f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f49321g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f49322h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f49323i = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        f49324j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49325k = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f49326l = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f49327m = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49328n = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f49329o = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f49330p = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f49331q = new ValueValidator() { // from class: oe.ga
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f49332r = new ValueValidator() { // from class: oe.ha
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.h(((Long) obj).longValue());
            }
        };
        f49333s = new ListValidator() { // from class: oe.ia
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTabsJsonParser.i(list);
            }
        };
        f49334t = new ValueValidator() { // from class: oe.ja
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.j(((Long) obj).longValue());
            }
        };
        f49335u = new ValueValidator() { // from class: oe.ka
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.k(((Long) obj).longValue());
            }
        };
        f49336v = new ListValidator() { // from class: oe.la
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTabsJsonParser.l(list);
            }
        };
    }

    public static final boolean i(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }

    public static final boolean l(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
