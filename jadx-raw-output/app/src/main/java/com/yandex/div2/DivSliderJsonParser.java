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
import com.yandex.div2.DivSliderJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivSliderJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48922a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f48923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f48924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f48925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f48927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f48928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f48929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f48930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f48931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f48932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f48933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f48935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f48936o;

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48937a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f48937a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSliderJsonParser.f48930i, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSliderJsonParser.f48931j, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSliderJsonParser.f48933l;
            Expression<Double> expression = DivSliderJsonParser.f48923b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f48937a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f48937a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f48937a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivSliderJsonParser.f48934m);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f48937a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f48937a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f48937a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f48937a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f48937a.Y6());
            if (divSize == null) {
                divSize = DivSliderJsonParser.f48924c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSliderJsonParser.f48925d;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f48937a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f48937a.Y2());
            Expression<Long> expression3 = DivSliderJsonParser.f48926e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_value", typeHelper2, lVar2, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            Expression<Long> expression4 = DivSliderJsonParser.f48927f;
            Expression<Long> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_value", typeHelper2, lVar2, expression4);
            if (optionalExpression7 != null) {
                expression4 = optionalExpression7;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f48937a.Y2());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f48937a.k7());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivSliderJsonParser.f48935n);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "secondary_value_accessibility", this.f48937a.H());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f48937a.u0());
            DivDrawable divDrawable = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_style", this.f48937a.V2());
            DivSlider.TextStyle textStyle = (DivSlider.TextStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_text_style", this.f48937a.n7());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_value_variable");
            DivDrawable divDrawable2 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "thumb_style", this.f48937a.V2());
            DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_text_style", this.f48937a.n7());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_value_variable");
            DivDrawable divDrawable3 = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_active_style", this.f48937a.V2());
            DivDrawable divDrawable4 = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_inactive_style", this.f48937a.V2());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f48937a.P8());
            DivDrawable divDrawable5 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "track_active_style", this.f48937a.V2());
            DivDrawable divDrawable6 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "track_inactive_style", this.f48937a.V2());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f48937a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f48937a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f48937a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f48937a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSliderJsonParser.f48936o);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f48937a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f48937a.k9());
            TypeHelper<DivVisibility> typeHelper4 = DivSliderJsonParser.f48932k;
            bk.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression5 = DivSliderJsonParser.f48928g;
            Expression<DivVisibility> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, lVar4, expression5);
            Expression<DivVisibility> expression6 = optionalExpression10 == null ? expression5 : optionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f48937a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f48937a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f48937a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSliderJsonParser.f48929h;
            }
            return new DivSlider(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression2, divLayoutProvider, divEdgeInsets, expression3, expression4, divEdgeInsets2, optionalList6, optionalExpression8, optionalExpression9, divAccessibility2, optionalList7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, optionalList8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression6, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSlider divSlider) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSlider.q(), this.f48937a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSlider.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSlider.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSlider.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSlider.y(), this.f48937a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divSlider.getBackground(), this.f48937a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSlider.z(), this.f48937a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSlider.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSlider.k(), this.f48937a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSlider.getExtensions(), this.f48937a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSlider.p(), this.f48937a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSlider.w(), this.f48937a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSlider.getHeight(), this.f48937a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSlider.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divSlider.f48886o);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSlider.t(), this.f48937a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSlider.d(), this.f48937a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_value", divSlider.f48889r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_value", divSlider.f48890s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSlider.r(), this.f48937a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divSlider.f48892u, this.f48937a.k7());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSlider.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSlider.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "secondary_value_accessibility", divSlider.f48895x, this.f48937a.H());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSlider.s(), this.f48937a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_style", divSlider.f48897z, this.f48937a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_text_style", divSlider.A, this.f48937a.n7());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_value_variable", divSlider.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_style", divSlider.C, this.f48937a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_text_style", divSlider.D, this.f48937a.n7());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_value_variable", divSlider.E);
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_active_style", divSlider.F, this.f48937a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_inactive_style", divSlider.G, this.f48937a.V2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSlider.h(), this.f48937a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", divSlider.I, this.f48937a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", divSlider.J, this.f48937a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSlider.l(), this.f48937a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSlider.j(), this.f48937a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSlider.x(), this.f48937a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSlider.i(), this.f48937a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSlider.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSlider.u(), this.f48937a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSlider.c(), this.f48937a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSlider.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSlider.v(), this.f48937a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSlider.a(), this.f48937a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSlider.getWidth(), this.f48937a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48937a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48938a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSliderTemplate deserialize(ParsingContext parsingContext, DivSliderTemplate divSliderTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48944a : null, this.f48938a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivSliderJsonParser.f48930i, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48945b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivSliderJsonParser.f48931j, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48946c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48947d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSliderJsonParser.f48933l);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48948e : null, this.f48938a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48949f : null, this.f48938a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48950g : null, this.f48938a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divSliderTemplate != null ? divSliderTemplate.f48951h : null;
            bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivSliderJsonParser.f48934m);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48952i : null, this.f48938a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48953j : null, this.f48938a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48954k : null, this.f48938a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48955l : null, this.f48938a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48956m : null, this.f48938a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48957n : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48958o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48959p : null, this.f48938a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48960q : null, this.f48938a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_value", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48961r : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_value", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48962s : null, lVar);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48963t : null, this.f48938a.Z2());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48964u : null, this.f48938a.l7());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48965v : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48966w : null, lVar, DivSliderJsonParser.f48935n);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "secondary_value_accessibility", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48967x : null, this.f48938a.I());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48968y : null, this.f48938a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.f48969z : null, this.f48938a.W2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_text_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.A : null, this.f48938a.o7());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_value_variable", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.B : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.C : null, this.f48938a.W2());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_text_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.D : null, this.f48938a.o7());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_value_variable", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.E : null);
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_active_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.F : null, this.f48938a.W2());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_inactive_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.G : null, this.f48938a.W2());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.H : null, this.f48938a.Q8());
            Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.I : null, this.f48938a.W2());
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.J : null, this.f48938a.W2());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.K : null, this.f48938a.c9());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.L : null, this.f48938a.V1());
            Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.M : null, this.f48938a.A1());
            Field optionalField20 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.N : null, this.f48938a.A1());
            Field<List<DivTransitionTrigger>> field5 = divSliderTemplate != null ? divSliderTemplate.O : null;
            bk.l<String, DivTransitionTrigger> lVar2 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivSliderJsonParser.f48936o;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSliderTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, optionalField6, optionalField7, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalField8, optionalListField6, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalField9, optionalListField7, optionalField10, optionalField11, optionalField12, field2, optionalField13, optionalField14, optionalField15, optionalField16, optionalListField8, field3, field4, optionalField17, optionalField18, optionalField19, optionalField20, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.P : null, this.f48938a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.Q : null, this.f48938a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivSliderJsonParser.f48932k, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.R : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.S : null, this.f48938a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.T : null, this.f48938a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.U : null, this.f48938a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSliderTemplate divSliderTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSliderTemplate.f48944a, this.f48938a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSliderTemplate.f48945b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSliderTemplate.f48946c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSliderTemplate.f48947d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSliderTemplate.f48948e, this.f48938a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divSliderTemplate.f48949f, this.f48938a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divSliderTemplate.f48950g, this.f48938a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSliderTemplate.f48951h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSliderTemplate.f48952i, this.f48938a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSliderTemplate.f48953j, this.f48938a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSliderTemplate.f48954k, this.f48938a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSliderTemplate.f48955l, this.f48938a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSliderTemplate.f48956m, this.f48938a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSliderTemplate.f48957n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divSliderTemplate.f48958o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSliderTemplate.f48959p, this.f48938a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSliderTemplate.f48960q, this.f48938a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_value", divSliderTemplate.f48961r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_value", divSliderTemplate.f48962s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSliderTemplate.f48963t, this.f48938a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", divSliderTemplate.f48964u, this.f48938a.l7());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSliderTemplate.f48965v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSliderTemplate.f48966w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "secondary_value_accessibility", divSliderTemplate.f48967x, this.f48938a.I());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSliderTemplate.f48968y, this.f48938a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_style", divSliderTemplate.f48969z, this.f48938a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_text_style", divSliderTemplate.A, this.f48938a.o7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_value_variable", divSliderTemplate.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_style", divSliderTemplate.C, this.f48938a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_text_style", divSliderTemplate.D, this.f48938a.o7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_value_variable", divSliderTemplate.E);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_active_style", divSliderTemplate.F, this.f48938a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_inactive_style", divSliderTemplate.G, this.f48938a.W2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSliderTemplate.H, this.f48938a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", divSliderTemplate.I, this.f48938a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", divSliderTemplate.J, this.f48938a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSliderTemplate.K, this.f48938a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSliderTemplate.L, this.f48938a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSliderTemplate.M, this.f48938a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSliderTemplate.N, this.f48938a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSliderTemplate.O, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSliderTemplate.P, this.f48938a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSliderTemplate.Q, this.f48938a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divSliderTemplate.R, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSliderTemplate.S, this.f48938a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSliderTemplate.T, this.f48938a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSliderTemplate.U, this.f48938a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48938a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSliderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSliderTemplate, DivSlider> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48939a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSlider resolve(ParsingContext parsingContext, DivSliderTemplate divSliderTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48944a, jSONObject, "accessibility", this.f48939a.J(), this.f48939a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f48945b, jSONObject, "alignment_horizontal", DivSliderJsonParser.f48930i, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f48946c, jSONObject, "alignment_vertical", DivSliderJsonParser.f48931j, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divSliderTemplate.f48947d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivSliderJsonParser.f48933l;
            Expression<Double> expression = DivSliderJsonParser.f48923b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48948e, jSONObject, "animators", this.f48939a.v1(), this.f48939a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48949f, jSONObject, A2.f54950g, this.f48939a.H1(), this.f48939a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48950g, jSONObject, "border", this.f48939a.N1(), this.f48939a.L1());
            Field<Expression<Long>> field2 = divSliderTemplate.f48951h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivSliderJsonParser.f48934m);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48952i, jSONObject, "disappear_actions", this.f48939a.R2(), this.f48939a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48953j, jSONObject, "extensions", this.f48939a.d3(), this.f48939a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48954k, jSONObject, "focus", this.f48939a.B3(), this.f48939a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48955l, jSONObject, "functions", this.f48939a.K3(), this.f48939a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48956m, jSONObject, "height", this.f48939a.a7(), this.f48939a.Y6());
            if (divSize == null) {
                divSize = DivSliderJsonParser.f48924c;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48957n, jSONObject, "id");
            Field<Expression<Boolean>> field3 = divSliderTemplate.f48958o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivSliderJsonParser.f48925d;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression5 != null) {
                expression2 = expressionResolveOptionalExpression5;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48959p, jSONObject, "layout_provider", this.f48939a.R4(), this.f48939a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48960q, jSONObject, "margins", this.f48939a.a3(), this.f48939a.Y2());
            Field<Expression<Long>> field4 = divSliderTemplate.f48961r;
            Expression<Long> expression3 = DivSliderJsonParser.f48926e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "max_value", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression6 != null) {
                expression3 = expressionResolveOptionalExpression6;
            }
            Field<Expression<Long>> field5 = divSliderTemplate.f48962s;
            Expression<Long> expression4 = DivSliderJsonParser.f48927f;
            Expression<Long> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "min_value", typeHelper2, lVar2, expression4);
            if (expressionResolveOptionalExpression7 != null) {
                expression4 = expressionResolveOptionalExpression7;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48963t, jSONObject, "paddings", this.f48939a.a3(), this.f48939a.Y2());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48964u, jSONObject, "ranges", this.f48939a.m7(), this.f48939a.k7());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f48965v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.f48966w, jSONObject, "row_span", typeHelper2, lVar2, DivSliderJsonParser.f48935n);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48967x, jSONObject, "secondary_value_accessibility", this.f48939a.J(), this.f48939a.H());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.f48968y, jSONObject, "selected_actions", this.f48939a.w0(), this.f48939a.u0());
            DivDrawable divDrawable = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.f48969z, jSONObject, "thumb_secondary_style", this.f48939a.X2(), this.f48939a.V2());
            DivSlider.TextStyle textStyle = (DivSlider.TextStyle) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.A, jSONObject, "thumb_secondary_text_style", this.f48939a.p7(), this.f48939a.n7());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.B, jSONObject, "thumb_secondary_value_variable");
            DivDrawable divDrawable2 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.C, jSONObject, "thumb_style", this.f48939a.X2(), this.f48939a.V2());
            DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.D, jSONObject, "thumb_text_style", this.f48939a.p7(), this.f48939a.n7());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.E, jSONObject, "thumb_value_variable");
            DivDrawable divDrawable3 = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.F, jSONObject, "tick_mark_active_style", this.f48939a.X2(), this.f48939a.V2());
            DivDrawable divDrawable4 = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.G, jSONObject, "tick_mark_inactive_style", this.f48939a.X2(), this.f48939a.V2());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.H, jSONObject, "tooltips", this.f48939a.R8(), this.f48939a.P8());
            DivDrawable divDrawable5 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.I, jSONObject, "track_active_style", this.f48939a.X2(), this.f48939a.V2());
            DivDrawable divDrawable6 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.J, jSONObject, "track_inactive_style", this.f48939a.X2(), this.f48939a.V2());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.K, jSONObject, "transform", this.f48939a.d9(), this.f48939a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.L, jSONObject, "transition_change", this.f48939a.W1(), this.f48939a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.M, jSONObject, "transition_in", this.f48939a.B1(), this.f48939a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.N, jSONObject, "transition_out", this.f48939a.B1(), this.f48939a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.O, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSliderJsonParser.f48936o);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.P, jSONObject, "variable_triggers", this.f48939a.g9(), this.f48939a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.Q, jSONObject, "variables", this.f48939a.m9(), this.f48939a.k9());
            Field<Expression<DivVisibility>> field6 = divSliderTemplate.R;
            TypeHelper<DivVisibility> typeHelper4 = DivSliderJsonParser.f48932k;
            bk.l<String, DivVisibility> lVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression5 = DivSliderJsonParser.f48928g;
            Expression<DivVisibility> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "visibility", typeHelper4, lVar4, expression5);
            Expression<DivVisibility> expression6 = expressionResolveOptionalExpression10 == null ? expression5 : expressionResolveOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.S, jSONObject, "visibility_action", this.f48939a.y9(), this.f48939a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.T, jSONObject, "visibility_actions", this.f48939a.y9(), this.f48939a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.U, jSONObject, "width", this.f48939a.a7(), this.f48939a.Y6());
            if (divSize3 == null) {
                divSize3 = DivSliderJsonParser.f48929h;
            }
            return new DivSlider(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression2, divLayoutProvider, divEdgeInsets, expression3, expression4, divEdgeInsets2, listResolveOptionalList6, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, divAccessibility2, listResolveOptionalList7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, listResolveOptionalList8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression6, divVisibilityAction, listResolveOptionalList12, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48939a = jsonParserComponent;
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
        f48923b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f48924c = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f48925d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f48926e = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f48927f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f48928g = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f48929h = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f48930i = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f48931j = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f48932k = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f48933l = new ValueValidator() { // from class: oe.g9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f48934m = new ValueValidator() { // from class: oe.h9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderJsonParser.f(((Long) obj).longValue());
            }
        };
        f48935n = new ValueValidator() { // from class: oe.i9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSliderJsonParser.g(((Long) obj).longValue());
            }
        };
        f48936o = new ListValidator() { // from class: oe.j9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivSliderJsonParser.h(list);
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
