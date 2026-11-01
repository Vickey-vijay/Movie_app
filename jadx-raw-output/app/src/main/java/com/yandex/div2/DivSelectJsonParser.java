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
import com.yandex.div2.DivSelectJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSelectJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSelectJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48612a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f48615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f48616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f48617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f48619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f48620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f48621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f48622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f48623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f48624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f48625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f48626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivSelect.Option> f48632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48633v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f48634w;

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48635a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSelect deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f48635a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSelectJsonParser.f48622k, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSelectJsonParser.f48623l, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSelectJsonParser.f48627p;
            Expression<Double> expression = DivSelectJsonParser.f48613b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f48635a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f48635a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f48635a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivSelectJsonParser.f48628q);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f48635a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f48635a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f48635a.z3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            ValueValidator<Long> valueValidator2 = DivSelectJsonParser.f48629r;
            Expression<Long> expression2 = DivSelectJsonParser.f48614c;
            Expression<Double> expression3 = expression;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, lVar2, valueValidator2, expression2);
            if (optionalExpression6 != null) {
                expression2 = optionalExpression6;
            }
            TypeHelper<DivSizeUnit> typeHelper4 = DivSelectJsonParser.f48624m;
            bk.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression4 = DivSelectJsonParser.f48615d;
            Expression<DivSizeUnit> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, lVar3, expression4);
            Expression<DivSizeUnit> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSelectJsonParser.f48625n, DivFontWeight.FROM_STRING);
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, lVar2, DivSelectJsonParser.f48630s);
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f48635a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f48635a.Y6());
            if (divSize == null) {
                divSize = DivSelectJsonParser.f48616e;
            }
            DivSize divSize2 = divSize;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivSelectJsonParser.f48617f;
            Expression<Integer> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper5, lVar4, expression6);
            if (optionalExpression11 != null) {
                expression6 = optionalExpression11;
            }
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f48635a.P4());
            Expression<Double> expression7 = DivSelectJsonParser.f48618g;
            Expression<Double> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, lVar, expression7);
            if (optionalExpression13 != null) {
                expression7 = optionalExpression13;
            }
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, lVar2, DivSelectJsonParser.f48631t);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f48635a.Y2());
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "options", this.f48635a.G6(), DivSelectJsonParser.f48632u);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f48635a.Y2());
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivSelectJsonParser.f48633v);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f48635a.u0());
            Expression<Integer> expression8 = DivSelectJsonParser.f48619h;
            Expression<Integer> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper5, lVar4, expression8);
            Expression<Integer> expression9 = optionalExpression17 == null ? expression8 : optionalExpression17;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f48635a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f48635a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f48635a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f48635a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f48635a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSelectJsonParser.f48634w);
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "value_variable");
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f48635a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f48635a.k9());
            TypeHelper<DivVisibility> typeHelper6 = DivSelectJsonParser.f48626o;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivSelectJsonParser.f48620i;
            Expression<DivVisibility> optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, lVar5, expression10);
            Expression<DivVisibility> expression11 = optionalExpression18 == null ? expression10 : optionalExpression18;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f48635a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f48635a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f48635a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSelectJsonParser.f48621j;
            }
            return new DivSelect(divAccessibility, optionalExpression, optionalExpression2, expression3, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, optionalList4, divFocus, optionalExpression5, expression2, expression5, optionalExpression8, optionalExpression9, optionalExpression10, optionalList5, divSize2, expression6, optionalExpression12, str, divLayoutProvider, expression7, optionalExpression14, divEdgeInsets, list, divEdgeInsets2, optionalExpression15, optionalExpression16, optionalList6, expression9, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, str2, optionalList9, optionalList10, expression11, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSelect divSelect) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSelect.q(), this.f48635a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSelect.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSelect.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSelect.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSelect.y(), this.f48635a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divSelect.getBackground(), this.f48635a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSelect.z(), this.f48635a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSelect.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSelect.k(), this.f48635a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSelect.getExtensions(), this.f48635a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSelect.p(), this.f48635a.z3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divSelect.f48592l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divSelect.f48593m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divSelect.f48594n, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divSelect.f48595o);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divSelect.f48596p, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divSelect.f48597q);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSelect.w(), this.f48635a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSelect.getHeight(), this.f48635a.Y6());
            Expression<Integer> expression = divSelect.f48600t;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divSelect.f48601u);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSelect.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSelect.t(), this.f48635a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divSelect.f48604x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divSelect.f48605y);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSelect.d(), this.f48635a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "options", divSelect.A, this.f48635a.G6());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSelect.r(), this.f48635a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSelect.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSelect.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSelect.s(), this.f48635a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divSelect.F, lVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSelect.h(), this.f48635a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSelect.l(), this.f48635a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSelect.j(), this.f48635a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSelect.x(), this.f48635a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSelect.i(), this.f48635a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSelect.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", divSelect.M);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSelect.u(), this.f48635a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSelect.c(), this.f48635a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSelect.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSelect.v(), this.f48635a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSelect.a(), this.f48635a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSelect.getWidth(), this.f48635a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48635a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48636a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSelectTemplate deserialize(ParsingContext parsingContext, DivSelectTemplate divSelectTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48642a : null, this.f48636a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSelectJsonParser.f48622k, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48643b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSelectJsonParser.f48623l, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48644c : null, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = divSelectTemplate != null ? divSelectTemplate.f48645d : null;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper, allowPropertyOverride, field, lVar, DivSelectJsonParser.f48627p);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48646e : null, this.f48636a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48647f : null, this.f48636a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48648g : null, this.f48636a.M1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divSelectTemplate != null ? divSelectTemplate.f48649h : null;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, lVar2, DivSelectJsonParser.f48628q);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48650i : null, this.f48636a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48651j : null, this.f48636a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48652k : null, this.f48636a.A3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48653l : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48654m : null, lVar2, DivSelectJsonParser.f48629r);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivSelectJsonParser.f48624m, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48655n : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48656o : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSelectJsonParser.f48625n, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48657p : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48658q : null, lVar2, DivSelectJsonParser.f48630s);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48659r : null, this.f48636a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48660s : null, this.f48636a.Z6());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field3 = divSelectTemplate != null ? divSelectTemplate.f48661t : null;
            bk.l<Object, Integer> lVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper4, allowPropertyOverride, field3, lVar3);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48662u : null);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48663v : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48664w : null, this.f48636a.Q4());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48665x : null, lVar);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48666y : null, lVar2, DivSelectJsonParser.f48631t);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.f48667z : null, this.f48636a.Z2());
            Field<List<DivSelectTemplate.OptionTemplate>> field4 = divSelectTemplate != null ? divSelectTemplate.A : null;
            mj.g<k3> gVarH6 = this.f48636a.H6();
            ListValidator<DivSelect.Option> listValidator = DivSelectJsonParser.f48632u;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "options", allowPropertyOverride, field4, gVarH6, listValidator);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.B : null, this.f48636a.Z2());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.C : null);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.D : null, lVar2, DivSelectJsonParser.f48633v);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.E : null, this.f48636a.v0());
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper4, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.F : null, lVar3);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.G : null, this.f48636a.Q8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.H : null, this.f48636a.c9());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.I : null, this.f48636a.V1());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.J : null, this.f48636a.A1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.K : null, this.f48636a.A1());
            Field<List<DivTransitionTrigger>> field5 = divSelectTemplate != null ? divSelectTemplate.L : null;
            bk.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator2 = DivSelectJsonParser.f48634w;
            ck.p.h(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSelectTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField5, optionalField4, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField5, optionalField6, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalField7, listField, optionalField8, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField6, optionalFieldWithExpression17, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar4, listValidator2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.M : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.N : null, this.f48636a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.O : null, this.f48636a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSelectJsonParser.f48626o, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.P : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.Q : null, this.f48636a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.R : null, this.f48636a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.S : null, this.f48636a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSelectTemplate divSelectTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSelectTemplate.f48642a, this.f48636a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSelectTemplate.f48643b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSelectTemplate.f48644c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSelectTemplate.f48645d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSelectTemplate.f48646e, this.f48636a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divSelectTemplate.f48647f, this.f48636a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divSelectTemplate.f48648g, this.f48636a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSelectTemplate.f48649h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSelectTemplate.f48650i, this.f48636a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSelectTemplate.f48651j, this.f48636a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSelectTemplate.f48652k, this.f48636a.A3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divSelectTemplate.f48653l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", divSelectTemplate.f48654m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divSelectTemplate.f48655n, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divSelectTemplate.f48656o);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divSelectTemplate.f48657p, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divSelectTemplate.f48658q);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSelectTemplate.f48659r, this.f48636a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSelectTemplate.f48660s, this.f48636a.Z6());
            Field<Expression<Integer>> field = divSelectTemplate.f48661t;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", divSelectTemplate.f48662u);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSelectTemplate.f48663v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSelectTemplate.f48664w, this.f48636a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divSelectTemplate.f48665x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divSelectTemplate.f48666y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSelectTemplate.f48667z, this.f48636a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "options", divSelectTemplate.A, this.f48636a.H6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSelectTemplate.B, this.f48636a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSelectTemplate.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSelectTemplate.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSelectTemplate.E, this.f48636a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divSelectTemplate.F, lVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSelectTemplate.G, this.f48636a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSelectTemplate.H, this.f48636a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSelectTemplate.I, this.f48636a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSelectTemplate.J, this.f48636a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSelectTemplate.K, this.f48636a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSelectTemplate.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", divSelectTemplate.M);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSelectTemplate.N, this.f48636a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSelectTemplate.O, this.f48636a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSelectTemplate.P, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSelectTemplate.Q, this.f48636a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSelectTemplate.R, this.f48636a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSelectTemplate.S, this.f48636a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48636a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSelectJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSelectTemplate, DivSelect> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48637a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSelect resolve(ParsingContext parsingContext, DivSelectTemplate divSelectTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48642a, jSONObject, "accessibility", this.f48637a.J(), this.f48637a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48643b, jSONObject, "alignment_horizontal", DivSelectJsonParser.f48622k, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48644c, jSONObject, "alignment_vertical", DivSelectJsonParser.f48623l, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSelectTemplate.f48645d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSelectJsonParser.f48627p;
            Expression<Double> expression = DivSelectJsonParser.f48613b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f48646e, jSONObject, "animators", this.f48637a.v1(), this.f48637a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f48647f, jSONObject, A2.f54950g, this.f48637a.H1(), this.f48637a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48648g, jSONObject, "border", this.f48637a.N1(), this.f48637a.L1());
            Field<Expression<Long>> field2 = divSelectTemplate.f48649h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivSelectJsonParser.f48628q);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f48650i, jSONObject, "disappear_actions", this.f48637a.R2(), this.f48637a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f48651j, jSONObject, "extensions", this.f48637a.d3(), this.f48637a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48652k, jSONObject, "focus", this.f48637a.B3(), this.f48637a.z3());
            Field<Expression<String>> field3 = divSelectTemplate.f48653l;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Field<Expression<Long>> field4 = divSelectTemplate.f48654m;
            ValueValidator<Long> valueValidator2 = DivSelectJsonParser.f48629r;
            Expression<Long> expression2 = DivSelectJsonParser.f48614c;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size", typeHelper2, lVar2, valueValidator2, expression2);
            if (expressionResolveOptionalExpression6 != null) {
                expression2 = expressionResolveOptionalExpression6;
            }
            Field<Expression<DivSizeUnit>> field5 = divSelectTemplate.f48655n;
            TypeHelper<DivSizeUnit> typeHelper4 = DivSelectJsonParser.f48624m;
            bk.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression3 = DivSelectJsonParser.f48615d;
            Expression<DivSizeUnit> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "font_size_unit", typeHelper4, lVar3, expression3);
            Expression<DivSizeUnit> expression4 = expressionResolveOptionalExpression7 == null ? expression3 : expressionResolveOptionalExpression7;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48656o, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48657p, jSONObject, FontsContractCompat.Columns.WEIGHT, DivSelectJsonParser.f48625n, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48658q, jSONObject, "font_weight_value", typeHelper2, lVar2, DivSelectJsonParser.f48630s);
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.f48659r, jSONObject, "functions", this.f48637a.K3(), this.f48637a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48660s, jSONObject, "height", this.f48637a.a7(), this.f48637a.Y6());
            if (divSize == null) {
                divSize = DivSelectJsonParser.f48616e;
            }
            DivSize divSize2 = divSize;
            Field<Expression<Integer>> field6 = divSelectTemplate.f48661t;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression5 = DivSelectJsonParser.f48617f;
            Expression<Integer> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "hint_color", typeHelper5, lVar4, expression5);
            if (expressionResolveOptionalExpression11 != null) {
                expression5 = expressionResolveOptionalExpression11;
            }
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48662u, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48663v, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48664w, jSONObject, "layout_provider", this.f48637a.R4(), this.f48637a.P4());
            Field<Expression<Double>> field7 = divSelectTemplate.f48665x;
            Expression<Double> expression6 = DivSelectJsonParser.f48618g;
            Expression<Double> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "letter_spacing", typeHelper, lVar, expression6);
            if (expressionResolveOptionalExpression13 != null) {
                expression6 = expressionResolveOptionalExpression13;
            }
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.f48666y, jSONObject, "line_height", typeHelper2, lVar2, DivSelectJsonParser.f48631t);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.f48667z, jSONObject, "margins", this.f48637a.a3(), this.f48637a.Y2());
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divSelectTemplate.A, jSONObject, "options", this.f48637a.I6(), this.f48637a.G6(), DivSelectJsonParser.f48632u);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.B, jSONObject, "paddings", this.f48637a.a3(), this.f48637a.Y2());
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.C, jSONObject, "reuse_id", typeHelper3);
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.D, jSONObject, "row_span", typeHelper2, lVar2, DivSelectJsonParser.f48633v);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.E, jSONObject, "selected_actions", this.f48637a.w0(), this.f48637a.u0());
            Field<Expression<Integer>> field8 = divSelectTemplate.F;
            Expression<Integer> expression7 = DivSelectJsonParser.f48619h;
            Expression<Integer> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "text_color", typeHelper5, lVar4, expression7);
            Expression<Integer> expression8 = expressionResolveOptionalExpression17 == null ? expression7 : expressionResolveOptionalExpression17;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.G, jSONObject, "tooltips", this.f48637a.R8(), this.f48637a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.H, jSONObject, "transform", this.f48637a.d9(), this.f48637a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.I, jSONObject, "transition_change", this.f48637a.W1(), this.f48637a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.J, jSONObject, "transition_in", this.f48637a.B1(), this.f48637a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.K, jSONObject, "transition_out", this.f48637a.B1(), this.f48637a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.L, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSelectJsonParser.f48634w);
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divSelectTemplate.M, jSONObject, "value_variable");
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.N, jSONObject, "variable_triggers", this.f48637a.g9(), this.f48637a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.O, jSONObject, "variables", this.f48637a.m9(), this.f48637a.k9());
            Field<Expression<DivVisibility>> field9 = divSelectTemplate.P;
            TypeHelper<DivVisibility> typeHelper6 = DivSelectJsonParser.f48626o;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression9 = DivSelectJsonParser.f48620i;
            Expression<DivVisibility> expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper6, lVar5, expression9);
            Expression<DivVisibility> expression10 = expressionResolveOptionalExpression18 == null ? expression9 : expressionResolveOptionalExpression18;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.Q, jSONObject, "visibility_action", this.f48637a.y9(), this.f48637a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.R, jSONObject, "visibility_actions", this.f48637a.y9(), this.f48637a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.S, jSONObject, "width", this.f48637a.a7(), this.f48637a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSelectJsonParser.f48621j;
            }
            return new DivSelect(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, expressionResolveOptionalExpression5, expression2, expression4, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expressionResolveOptionalExpression10, listResolveOptionalList5, divSize2, expression5, expressionResolveOptionalExpression12, str, divLayoutProvider, expression6, expressionResolveOptionalExpression14, divEdgeInsets, listResolveList, divEdgeInsets2, expressionResolveOptionalExpression15, expressionResolveOptionalExpression16, listResolveOptionalList6, expression8, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, str2, listResolveOptionalList9, listResolveOptionalList10, expression10, divVisibilityAction, listResolveOptionalList11, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48637a = jsonParserComponent;
        }
    }

    public static final boolean i(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 > 0;
    }

    public static final boolean m(long j10) {
        return j10 >= 0;
    }

    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48613b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f48614c = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f48615d = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f48616e = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f48617f = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f48618g = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48619h = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f48620i = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f48621j = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48622k = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f48623l = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f48624m = companion2.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f48625n = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f48626o = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f48627p = new ValueValidator() { // from class: oe.l8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.i(((Double) obj).doubleValue());
            }
        };
        f48628q = new ValueValidator() { // from class: oe.m8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.j(((Long) obj).longValue());
            }
        };
        f48629r = new ValueValidator() { // from class: oe.n8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.k(((Long) obj).longValue());
            }
        };
        f48630s = new ValueValidator() { // from class: oe.o8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.l(((Long) obj).longValue());
            }
        };
        f48631t = new ValueValidator() { // from class: oe.p8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.m(((Long) obj).longValue());
            }
        };
        f48632u = new ListValidator() { // from class: oe.q8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSelectJsonParser.n(list);
            }
        };
        f48633v = new ValueValidator() { // from class: oe.r8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSelectJsonParser.o(((Long) obj).longValue());
            }
        };
        f48634w = new ListValidator() { // from class: oe.s8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSelectJsonParser.p(list);
            }
        };
    }

    public static final boolean n(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }

    public static final boolean p(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
