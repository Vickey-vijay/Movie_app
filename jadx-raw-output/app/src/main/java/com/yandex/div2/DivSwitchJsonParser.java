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
import com.yandex.div2.DivSwitchJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSwitchJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSwitchJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49199a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f49201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f49203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f49204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f49205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f49206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f49207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f49208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f49211m;

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49212a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSwitch deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f49212a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSwitchJsonParser.f49205g, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSwitchJsonParser.f49206h, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSwitchJsonParser.f49208j;
            Expression<Double> expression = DivSwitchJsonParser.f49200b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f49212a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f49212a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f49212a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivSwitchJsonParser.f49209k);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f49212a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f49212a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f49212a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f49212a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f49212a.Y6());
            if (divSize == null) {
                divSize = DivSwitchJsonParser.f49201c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSwitchJsonParser.f49202d;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "is_on_variable");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f49212a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f49212a.Y2());
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f49212a.Y2());
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivSwitchJsonParser.f49210l);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f49212a.u0());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f49212a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f49212a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f49212a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f49212a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f49212a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSwitchJsonParser.f49211m);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f49212a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f49212a.k9());
            TypeHelper<DivVisibility> typeHelper4 = DivSwitchJsonParser.f49207i;
            bk.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression3 = DivSwitchJsonParser.f49203e;
            Expression<DivVisibility> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, lVar4, expression3);
            Expression<DivVisibility> expression4 = optionalExpression9 == null ? expression3 : optionalExpression9;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f49212a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f49212a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f49212a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSwitchJsonParser.f49204f;
            }
            return new DivSwitch(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression2, str2, divLayoutProvider, divEdgeInsets, optionalExpression6, divEdgeInsets2, optionalExpression7, optionalExpression8, optionalList6, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, optionalList9, optionalList10, expression4, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSwitch divSwitch) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSwitch.q(), this.f49212a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSwitch.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSwitch.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSwitch.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSwitch.y(), this.f49212a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divSwitch.getBackground(), this.f49212a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSwitch.z(), this.f49212a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSwitch.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSwitch.k(), this.f49212a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSwitch.getExtensions(), this.f49212a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSwitch.p(), this.f49212a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSwitch.w(), this.f49212a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSwitch.getHeight(), this.f49212a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSwitch.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divSwitch.f49187o);
            JsonPropertyParser.write(parsingContext, jSONObject, "is_on_variable", divSwitch.f49188p);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSwitch.t(), this.f49212a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSwitch.d(), this.f49212a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "on_color", divSwitch.f49191s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSwitch.r(), this.f49212a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSwitch.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSwitch.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSwitch.s(), this.f49212a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSwitch.h(), this.f49212a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSwitch.l(), this.f49212a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSwitch.j(), this.f49212a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSwitch.x(), this.f49212a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSwitch.i(), this.f49212a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSwitch.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSwitch.u(), this.f49212a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSwitch.c(), this.f49212a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSwitch.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSwitch.v(), this.f49212a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSwitch.a(), this.f49212a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSwitch.getWidth(), this.f49212a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49212a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49213a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSwitchTemplate deserialize(ParsingContext parsingContext, DivSwitchTemplate divSwitchTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49215a : null, this.f49213a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSwitchJsonParser.f49205g, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49216b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSwitchJsonParser.f49206h, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49217c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49218d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSwitchJsonParser.f49208j);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49219e : null, this.f49213a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49220f : null, this.f49213a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49221g : null, this.f49213a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSwitchTemplate != null ? divSwitchTemplate.f49222h : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivSwitchJsonParser.f49209k);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49223i : null, this.f49213a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49224j : null, this.f49213a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49225k : null, this.f49213a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49226l : null, this.f49213a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49227m : null, this.f49213a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49228n : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49229o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "is_on_variable", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49230p : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49231q : null, this.f49213a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49232r : null, this.f49213a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49233s : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49234t : null, this.f49213a.Z2());
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49235u : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49236v : null, lVar, DivSwitchJsonParser.f49210l);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49237w : null, this.f49213a.v0());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49238x : null, this.f49213a.Q8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49239y : null, this.f49213a.c9());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.f49240z : null, this.f49213a.V1());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.A : null, this.f49213a.A1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.B : null, this.f49213a.A1());
            Field<List<DivTransitionTrigger>> field3 = divSwitchTemplate != null ? divSwitchTemplate.C : null;
            bk.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivSwitchJsonParser.f49211m;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSwitchTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, field2, optionalField6, optionalField7, optionalFieldWithExpression6, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField6, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.D : null, this.f49213a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.E : null, this.f49213a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSwitchJsonParser.f49207i, allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.F : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.G : null, this.f49213a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.H : null, this.f49213a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSwitchTemplate != null ? divSwitchTemplate.I : null, this.f49213a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSwitchTemplate divSwitchTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSwitchTemplate.f49215a, this.f49213a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSwitchTemplate.f49216b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSwitchTemplate.f49217c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSwitchTemplate.f49218d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSwitchTemplate.f49219e, this.f49213a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divSwitchTemplate.f49220f, this.f49213a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divSwitchTemplate.f49221g, this.f49213a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSwitchTemplate.f49222h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSwitchTemplate.f49223i, this.f49213a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSwitchTemplate.f49224j, this.f49213a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSwitchTemplate.f49225k, this.f49213a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSwitchTemplate.f49226l, this.f49213a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSwitchTemplate.f49227m, this.f49213a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSwitchTemplate.f49228n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divSwitchTemplate.f49229o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "is_on_variable", divSwitchTemplate.f49230p);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSwitchTemplate.f49231q, this.f49213a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSwitchTemplate.f49232r, this.f49213a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "on_color", divSwitchTemplate.f49233s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSwitchTemplate.f49234t, this.f49213a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSwitchTemplate.f49235u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSwitchTemplate.f49236v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSwitchTemplate.f49237w, this.f49213a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSwitchTemplate.f49238x, this.f49213a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSwitchTemplate.f49239y, this.f49213a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSwitchTemplate.f49240z, this.f49213a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSwitchTemplate.A, this.f49213a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSwitchTemplate.B, this.f49213a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSwitchTemplate.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSwitchTemplate.D, this.f49213a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSwitchTemplate.E, this.f49213a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSwitchTemplate.F, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSwitchTemplate.G, this.f49213a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSwitchTemplate.H, this.f49213a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSwitchTemplate.I, this.f49213a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49213a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSwitchJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSwitchTemplate, DivSwitch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49214a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSwitch resolve(ParsingContext parsingContext, DivSwitchTemplate divSwitchTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49215a, jSONObject, "accessibility", this.f49214a.J(), this.f49214a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f49216b, jSONObject, "alignment_horizontal", DivSwitchJsonParser.f49205g, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f49217c, jSONObject, "alignment_vertical", DivSwitchJsonParser.f49206h, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSwitchTemplate.f49218d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSwitchJsonParser.f49208j;
            Expression<Double> expression = DivSwitchJsonParser.f49200b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49219e, jSONObject, "animators", this.f49214a.v1(), this.f49214a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49220f, jSONObject, A2.f54950g, this.f49214a.H1(), this.f49214a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49221g, jSONObject, "border", this.f49214a.N1(), this.f49214a.L1());
            Field<Expression<Long>> field2 = divSwitchTemplate.f49222h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivSwitchJsonParser.f49209k);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49223i, jSONObject, "disappear_actions", this.f49214a.R2(), this.f49214a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49224j, jSONObject, "extensions", this.f49214a.d3(), this.f49214a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49225k, jSONObject, "focus", this.f49214a.B3(), this.f49214a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49226l, jSONObject, "functions", this.f49214a.K3(), this.f49214a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49227m, jSONObject, "height", this.f49214a.a7(), this.f49214a.Y6());
            if (divSize == null) {
                divSize = DivSwitchJsonParser.f49201c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49228n, jSONObject, "id");
            Field<Expression<Boolean>> field3 = divSwitchTemplate.f49229o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSwitchJsonParser.f49202d;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression5 != null) {
                expression2 = expressionResolveOptionalExpression5;
            }
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divSwitchTemplate.f49230p, jSONObject, "is_on_variable");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49231q, jSONObject, "layout_provider", this.f49214a.R4(), this.f49214a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49232r, jSONObject, "margins", this.f49214a.a3(), this.f49214a.Y2());
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f49233s, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49234t, jSONObject, "paddings", this.f49214a.a3(), this.f49214a.Y2());
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f49235u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSwitchTemplate.f49236v, jSONObject, "row_span", typeHelper2, lVar2, DivSwitchJsonParser.f49210l);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49237w, jSONObject, "selected_actions", this.f49214a.w0(), this.f49214a.u0());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.f49238x, jSONObject, "tooltips", this.f49214a.R8(), this.f49214a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49239y, jSONObject, "transform", this.f49214a.d9(), this.f49214a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.f49240z, jSONObject, "transition_change", this.f49214a.W1(), this.f49214a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.A, jSONObject, "transition_in", this.f49214a.B1(), this.f49214a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.B, jSONObject, "transition_out", this.f49214a.B1(), this.f49214a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.C, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSwitchJsonParser.f49211m);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.D, jSONObject, "variable_triggers", this.f49214a.g9(), this.f49214a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.E, jSONObject, "variables", this.f49214a.m9(), this.f49214a.k9());
            Field<Expression<DivVisibility>> field4 = divSwitchTemplate.F;
            TypeHelper<DivVisibility> typeHelper4 = DivSwitchJsonParser.f49207i;
            bk.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression3 = DivSwitchJsonParser.f49203e;
            Expression<DivVisibility> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper4, lVar4, expression3);
            Expression<DivVisibility> expression4 = expressionResolveOptionalExpression9 == null ? expression3 : expressionResolveOptionalExpression9;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.G, jSONObject, "visibility_action", this.f49214a.y9(), this.f49214a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSwitchTemplate.H, jSONObject, "visibility_actions", this.f49214a.y9(), this.f49214a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSwitchTemplate.I, jSONObject, "width", this.f49214a.a7(), this.f49214a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSwitchJsonParser.f49204f;
            }
            return new DivSwitch(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression2, str2, divLayoutProvider, divEdgeInsets, expressionResolveOptionalExpression6, divEdgeInsets2, expressionResolveOptionalExpression7, expressionResolveOptionalExpression8, listResolveOptionalList6, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression4, divVisibilityAction, listResolveOptionalList11, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49214a = jsonParserComponent;
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
        f49200b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f49201c = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f49202d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f49203e = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f49204f = new DivSize.c(new DivMatchParentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49205g = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSwitchJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f49206h = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSwitchJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f49207i = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSwitchJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f49208j = new ValueValidator() { // from class: oe.ca
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSwitchJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f49209k = new ValueValidator() { // from class: oe.da
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSwitchJsonParser.f(((Long) obj).longValue());
            }
        };
        f49210l = new ValueValidator() { // from class: oe.ea
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSwitchJsonParser.g(((Long) obj).longValue());
            }
        };
        f49211m = new ListValidator() { // from class: oe.fa
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSwitchJsonParser.h(list);
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
