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
import com.yandex.div2.DivInputJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivInputJsonParser {

    @Deprecated
    public static final TypeHelper<DivVisibility> A;

    @Deprecated
    public static final ValueValidator<Double> B;

    @Deprecated
    public static final ValueValidator<Long> C;

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
    public static final ListValidator<DivTransitionTrigger> J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47879a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivInput.Autocapitalization> f47881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivInput.EnterKeyType> f47882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f47883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f47884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f47885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f47886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivInput.KeyboardType> f47888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f47889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f47890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentHorizontal> f47891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivAlignmentVertical> f47892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f47893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f47894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f47895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivInput.Autocapitalization> f47898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivInput.EnterKeyType> f47899u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f47900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f47901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivInput.KeyboardType> f47902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f47903y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f47904z;

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47905a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInput deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f47905a.H());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivInputJsonParser.f47896r;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivInputJsonParser.f47897s;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivInputJsonParser.B;
            Expression<Double> expression = DivInputJsonParser.f47880b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f47905a.t1());
            TypeHelper<DivInput.Autocapitalization> typeHelper4 = DivInputJsonParser.f47898t;
            bk.l<String, DivInput.Autocapitalization> lVar4 = DivInput.Autocapitalization.FROM_STRING;
            Expression<DivInput.Autocapitalization> expression2 = DivInputJsonParser.f47881c;
            Expression<DivInput.Autocapitalization> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autocapitalization", typeHelper4, lVar4, expression2);
            Expression<DivInput.Autocapitalization> expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f47905a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f47905a.L1());
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivInputJsonParser.C);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f47905a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "enter_key_actions", this.f47905a.u0());
            TypeHelper<DivInput.EnterKeyType> typeHelper6 = DivInputJsonParser.f47899u;
            bk.l<String, DivInput.EnterKeyType> lVar6 = DivInput.EnterKeyType.FROM_STRING;
            Expression<DivInput.EnterKeyType> expression4 = DivInputJsonParser.f47882d;
            Expression<DivInput.EnterKeyType> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "enter_key_type", typeHelper6, lVar6, expression4);
            Expression<DivInput.EnterKeyType> expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f47905a.b3());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f47905a.m4());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f47905a.z3());
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            ValueValidator<Long> valueValidator2 = DivInputJsonParser.D;
            Expression<Long> expression6 = DivInputJsonParser.f47883e;
            Expression<Long> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression6);
            if (optionalExpression8 != null) {
                expression6 = optionalExpression8;
            }
            TypeHelper<DivSizeUnit> typeHelper8 = DivInputJsonParser.f47900v;
            bk.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression7 = DivInputJsonParser.f47884f;
            Expression<DivSizeUnit> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, lVar7, expression7);
            Expression<DivSizeUnit> expression8 = optionalExpression9 == null ? expression7 : optionalExpression9;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivInputJsonParser.f47901w, DivFontWeight.FROM_STRING);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, lVar5, DivInputJsonParser.E);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f47905a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f47905a.Y6());
            if (divSize == null) {
                divSize = DivInputJsonParser.f47885g;
            }
            DivSize divSize2 = divSize;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar8 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "highlight_color", typeHelper9, lVar8);
            Expression<Integer> expression9 = DivInputJsonParser.f47886h;
            Expression<Integer> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper9, lVar8, expression9);
            if (optionalExpression14 != null) {
                expression9 = optionalExpression14;
            }
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar9 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression10 = DivInputJsonParser.f47887i;
            Expression<Boolean> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper10, lVar9, expression10);
            if (optionalExpression16 != null) {
                expression10 = optionalExpression16;
            }
            TypeHelper<DivInput.KeyboardType> typeHelper11 = DivInputJsonParser.f47902x;
            bk.l<String, DivInput.KeyboardType> lVar10 = DivInput.KeyboardType.FROM_STRING;
            Expression<DivInput.KeyboardType> expression11 = DivInputJsonParser.f47888j;
            Expression<DivInput.KeyboardType> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "keyboard_type", typeHelper11, lVar10, expression11);
            if (optionalExpression17 != null) {
                expression11 = optionalExpression17;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f47905a.P4());
            Expression<Double> expression12 = DivInputJsonParser.f47889k;
            Expression<Double> optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, lVar3, expression12);
            if (optionalExpression18 != null) {
                expression12 = optionalExpression18;
            }
            Expression optionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, lVar5, DivInputJsonParser.F);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f47905a.Y2());
            DivInputMask divInputMask = (DivInputMask) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.f47905a.v4());
            Expression optionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_length", typeHelper5, lVar5, DivInputJsonParser.G);
            Expression optionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_lines", typeHelper5, lVar5, DivInputJsonParser.H);
            DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) JsonPropertyParser.readOptional(parsingContext, jSONObject, "native_interface", this.f47905a.y4());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f47905a.Y2());
            Expression optionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression optionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivInputJsonParser.I);
            Expression<Boolean> expression13 = DivInputJsonParser.f47890l;
            Expression<Boolean> optionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "select_all_on_focus", typeHelper10, lVar9, expression13);
            Expression<Boolean> expression14 = optionalExpression24 == null ? expression13 : optionalExpression24;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f47905a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper12 = DivInputJsonParser.f47903y;
            Expression<DivAlignmentHorizontal> expression15 = DivInputJsonParser.f47891m;
            Expression<DivAlignmentHorizontal> optionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper12, lVar, expression15);
            Expression<DivAlignmentHorizontal> expression16 = optionalExpression25 == null ? expression15 : optionalExpression25;
            TypeHelper<DivAlignmentVertical> typeHelper13 = DivInputJsonParser.f47904z;
            Expression<DivAlignmentVertical> expression17 = DivInputJsonParser.f47892n;
            Expression<DivAlignmentVertical> optionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper13, lVar2, expression17);
            Expression<DivAlignmentVertical> expression18 = optionalExpression26 == null ? expression17 : optionalExpression26;
            Expression<Integer> expression19 = DivInputJsonParser.f47893o;
            Expression<Integer> optionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper9, lVar8, expression19);
            Expression<Integer> expression20 = optionalExpression27 == null ? expression19 : optionalExpression27;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "text_variable");
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f47905a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f47905a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f47905a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f47905a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f47905a.z1());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivInputJsonParser.J);
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "validators", this.f47905a.G4());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f47905a.e9());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f47905a.k9());
            TypeHelper<DivVisibility> typeHelper14 = DivInputJsonParser.A;
            bk.l<String, DivVisibility> lVar11 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression21 = DivInputJsonParser.f47894p;
            Expression<DivVisibility> optionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, lVar11, expression21);
            Expression<DivVisibility> expression22 = optionalExpression28 == null ? expression21 : optionalExpression28;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f47905a.w9());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f47905a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f47905a.Y6());
            if (divSize3 == null) {
                divSize3 = DivInputJsonParser.f47895q;
            }
            return new DivInput(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, expression3, optionalList2, divBorder, optionalExpression5, optionalList3, optionalList4, expression5, optionalList5, optionalList6, divFocus, optionalExpression7, expression6, expression8, optionalExpression10, optionalExpression11, optionalExpression12, optionalList7, divSize2, optionalExpression13, expression9, optionalExpression15, str, expression10, expression11, divLayoutProvider, expression12, optionalExpression19, divEdgeInsets, divInputMask, optionalExpression20, optionalExpression21, nativeInterface, divEdgeInsets2, optionalExpression22, optionalExpression23, expression14, optionalList8, expression16, expression18, expression20, str2, optionalList9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList10, optionalList11, optionalList12, optionalList13, expression22, divVisibilityAction, optionalList14, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInput divInput) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divInput.q(), this.f47905a.H());
            Expression<DivAlignmentHorizontal> expressionG = divInput.g();
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionN = divInput.n();
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionN, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divInput.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divInput.y(), this.f47905a.t1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autocapitalization", divInput.f47825f, DivInput.Autocapitalization.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divInput.getBackground(), this.f47905a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divInput.z(), this.f47905a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divInput.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divInput.k(), this.f47905a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "enter_key_actions", divInput.f47833k, this.f47905a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "enter_key_type", divInput.f47834l, DivInput.EnterKeyType.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divInput.getExtensions(), this.f47905a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divInput.f47836n, this.f47905a.m4());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divInput.p(), this.f47905a.z3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divInput.f47838p);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divInput.f47839q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divInput.f47840r, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divInput.f47841s);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divInput.f47842t, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divInput.f47843u);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divInput.w(), this.f47905a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divInput.getHeight(), this.f47905a.Y6());
            Expression<Integer> expression = divInput.f47846x;
            bk.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "highlight_color", expression, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", divInput.f47847y, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divInput.f47848z);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divInput.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divInput.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "keyboard_type", divInput.C, DivInput.KeyboardType.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divInput.t(), this.f47905a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divInput.E);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divInput.F);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divInput.d(), this.f47905a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", divInput.H, this.f47905a.v4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_length", divInput.I);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_lines", divInput.J);
            JsonPropertyParser.write(parsingContext, jSONObject, "native_interface", divInput.K, this.f47905a.y4());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divInput.r(), this.f47905a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divInput.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divInput.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "select_all_on_focus", divInput.O);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divInput.s(), this.f47905a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divInput.Q, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divInput.R, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divInput.S, lVar3);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_variable", divInput.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divInput.h(), this.f47905a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divInput.l(), this.f47905a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divInput.j(), this.f47905a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divInput.x(), this.f47905a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divInput.i(), this.f47905a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divInput.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "validators", divInput.f47816a0, this.f47905a.G4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divInput.u(), this.f47905a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divInput.c(), this.f47905a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divInput.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divInput.v(), this.f47905a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divInput.a(), this.f47905a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divInput.getWidth(), this.f47905a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f47905a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47906a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInputTemplate deserialize(ParsingContext parsingContext, DivInputTemplate divInputTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47937a : null, this.f47906a.I());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivInputJsonParser.f47896r;
            Field<Expression<DivAlignmentHorizontal>> field = divInputTemplate != null ? divInputTemplate.f47939b : null;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivInputJsonParser.f47897s;
            Field<Expression<DivAlignmentVertical>> field2 = divInputTemplate != null ? divInputTemplate.f47941c : null;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field3 = divInputTemplate != null ? divInputTemplate.f47943d : null;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, lVar3, DivInputJsonParser.B);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47945e : null, this.f47906a.u1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autocapitalization", DivInputJsonParser.f47898t, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47947f : null, DivInput.Autocapitalization.FROM_STRING);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47949g : null, this.f47906a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47951h : null, this.f47906a.M1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = divInputTemplate != null ? divInputTemplate.f47952i : null;
            bk.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, lVar4, DivInputJsonParser.C);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47953j : null, this.f47906a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47954k : null, this.f47906a.v0());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_type", DivInputJsonParser.f47899u, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47955l : null, DivInput.EnterKeyType.FROM_STRING);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47956m : null, this.f47906a.c3());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47957n : null, this.f47906a.n4());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47958o : null, this.f47906a.A3());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47959p : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47960q : null, lVar4, DivInputJsonParser.D);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivInputJsonParser.f47900v, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47961r : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47962s : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivInputJsonParser.f47901w, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47963t : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47964u : null, lVar4, DivInputJsonParser.E);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47965v : null, this.f47906a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47966w : null, this.f47906a.Z6());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field5 = divInputTemplate != null ? divInputTemplate.f47967x : null;
            bk.l<Object, Integer> lVar5 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "highlight_color", typeHelper6, allowPropertyOverride, field5, lVar5);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper6, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47968y : null, lVar5);
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47969z : null);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.A : null);
            TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field6 = divInputTemplate != null ? divInputTemplate.B : null;
            bk.l<Object, Boolean> lVar6 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper7, allowPropertyOverride, field6, lVar6);
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "keyboard_type", DivInputJsonParser.f47902x, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.C : null, DivInput.KeyboardType.FROM_STRING);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.D : null, this.f47906a.Q4());
            Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.E : null, lVar3);
            Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.F : null, lVar4, DivInputJsonParser.F);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.G : null, this.f47906a.Z2());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.H : null, this.f47906a.w4());
            Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_length", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.I : null, lVar4, DivInputJsonParser.G);
            Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_lines", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.J : null, lVar4, DivInputJsonParser.H);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "native_interface", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.K : null, this.f47906a.z4());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.L : null, this.f47906a.Z2());
            Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.M : null);
            Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.N : null, lVar4, DivInputJsonParser.I);
            Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "select_all_on_focus", typeHelper7, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.O : null, lVar6);
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.P : null, this.f47906a.v0());
            Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", DivInputJsonParser.f47903y, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.Q : null, lVar);
            Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", DivInputJsonParser.f47904z, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.R : null, lVar2);
            Field optionalFieldWithExpression27 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.S : null, lVar5);
            Field field7 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "text_variable", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.T : null);
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.U : null, this.f47906a.Q8());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.V : null, this.f47906a.c9());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.W : null, this.f47906a.V1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.X : null, this.f47906a.A1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.Y : null, this.f47906a.A1());
            Field<List<DivTransitionTrigger>> field8 = divInputTemplate != null ? divInputTemplate.Z : null;
            bk.l<String, DivTransitionTrigger> lVar7 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivInputJsonParser.J;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivInputTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalFieldWithExpression4, optionalListField2, optionalField2, optionalFieldWithExpression5, optionalListField3, optionalListField4, optionalFieldWithExpression6, optionalListField5, optionalListField6, optionalField3, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalField4, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalField5, optionalFieldWithExpression16, optionalFieldWithExpression17, optionalField6, optionalFieldWithExpression18, optionalFieldWithExpression19, optionalField7, optionalField8, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalField9, optionalField10, optionalFieldWithExpression22, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalListField8, optionalFieldWithExpression25, optionalFieldWithExpression26, optionalFieldWithExpression27, field7, optionalListField9, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, lVar7, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "validators", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47938a0 : null, this.f47906a.H4()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47940b0 : null, this.f47906a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47942c0 : null, this.f47906a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivInputJsonParser.A, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47944d0 : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47946e0 : null, this.f47906a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47948f0 : null, this.f47906a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.f47950g0 : null, this.f47906a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivInputTemplate divInputTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divInputTemplate.f47937a, this.f47906a.I());
            Field<Expression<DivAlignmentHorizontal>> field = divInputTemplate.f47939b;
            bk.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divInputTemplate.f47941c;
            bk.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divInputTemplate.f47943d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divInputTemplate.f47945e, this.f47906a.u1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autocapitalization", divInputTemplate.f47947f, DivInput.Autocapitalization.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divInputTemplate.f47949g, this.f47906a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divInputTemplate.f47951h, this.f47906a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divInputTemplate.f47952i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divInputTemplate.f47953j, this.f47906a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "enter_key_actions", divInputTemplate.f47954k, this.f47906a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "enter_key_type", divInputTemplate.f47955l, DivInput.EnterKeyType.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divInputTemplate.f47956m, this.f47906a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divInputTemplate.f47957n, this.f47906a.n4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divInputTemplate.f47958o, this.f47906a.A3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divInputTemplate.f47959p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", divInputTemplate.f47960q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divInputTemplate.f47961r, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, divInputTemplate.f47962s);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, divInputTemplate.f47963t, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divInputTemplate.f47964u);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divInputTemplate.f47965v, this.f47906a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divInputTemplate.f47966w, this.f47906a.Z6());
            Field<Expression<Integer>> field3 = divInputTemplate.f47967x;
            bk.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "highlight_color", field3, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", divInputTemplate.f47968y, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", divInputTemplate.f47969z);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divInputTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divInputTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "keyboard_type", divInputTemplate.C, DivInput.KeyboardType.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divInputTemplate.D, this.f47906a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divInputTemplate.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divInputTemplate.F);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divInputTemplate.G, this.f47906a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", divInputTemplate.H, this.f47906a.w4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_length", divInputTemplate.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_lines", divInputTemplate.J);
            JsonFieldParser.writeField(parsingContext, jSONObject, "native_interface", divInputTemplate.K, this.f47906a.z4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divInputTemplate.L, this.f47906a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divInputTemplate.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divInputTemplate.N);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "select_all_on_focus", divInputTemplate.O);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divInputTemplate.P, this.f47906a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", divInputTemplate.Q, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", divInputTemplate.R, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divInputTemplate.S, lVar3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_variable", divInputTemplate.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divInputTemplate.U, this.f47906a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divInputTemplate.V, this.f47906a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divInputTemplate.W, this.f47906a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divInputTemplate.X, this.f47906a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divInputTemplate.Y, this.f47906a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divInputTemplate.Z, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "validators", divInputTemplate.f47938a0, this.f47906a.H4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divInputTemplate.f47940b0, this.f47906a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divInputTemplate.f47942c0, this.f47906a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divInputTemplate.f47944d0, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divInputTemplate.f47946e0, this.f47906a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divInputTemplate.f47948f0, this.f47906a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divInputTemplate.f47950g0, this.f47906a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f47906a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivInputJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivInputTemplate, DivInput> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f47907a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivInput resolve(ParsingContext parsingContext, DivInputTemplate divInputTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f47937a, jSONObject, "accessibility", this.f47907a.J(), this.f47907a.H());
            Field<Expression<DivAlignmentHorizontal>> field = divInputTemplate.f47939b;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivInputJsonParser.f47896r;
            bk.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divInputTemplate.f47941c;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivInputJsonParser.f47897s;
            bk.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divInputTemplate.f47943d;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivInputJsonParser.B;
            Expression<Double> expression = DivInputJsonParser.f47880b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47945e, jSONObject, "animators", this.f47907a.v1(), this.f47907a.t1());
            Field<Expression<DivInput.Autocapitalization>> field4 = divInputTemplate.f47947f;
            TypeHelper<DivInput.Autocapitalization> typeHelper4 = DivInputJsonParser.f47898t;
            bk.l<String, DivInput.Autocapitalization> lVar4 = DivInput.Autocapitalization.FROM_STRING;
            Expression<DivInput.Autocapitalization> expression2 = DivInputJsonParser.f47881c;
            Expression<DivInput.Autocapitalization> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "autocapitalization", typeHelper4, lVar4, expression2);
            Expression<DivInput.Autocapitalization> expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47949g, jSONObject, A2.f54950g, this.f47907a.H1(), this.f47907a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f47951h, jSONObject, "border", this.f47907a.N1(), this.f47907a.L1());
            Field<Expression<Long>> field5 = divInputTemplate.f47952i;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, lVar5, DivInputJsonParser.C);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47953j, jSONObject, "disappear_actions", this.f47907a.R2(), this.f47907a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47954k, jSONObject, "enter_key_actions", this.f47907a.w0(), this.f47907a.u0());
            Field<Expression<DivInput.EnterKeyType>> field6 = divInputTemplate.f47955l;
            TypeHelper<DivInput.EnterKeyType> typeHelper6 = DivInputJsonParser.f47899u;
            bk.l<String, DivInput.EnterKeyType> lVar6 = DivInput.EnterKeyType.FROM_STRING;
            Expression<DivInput.EnterKeyType> expression4 = DivInputJsonParser.f47882d;
            Expression<DivInput.EnterKeyType> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "enter_key_type", typeHelper6, lVar6, expression4);
            Expression<DivInput.EnterKeyType> expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47956m, jSONObject, "extensions", this.f47907a.d3(), this.f47907a.b3());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47957n, jSONObject, "filters", this.f47907a.o4(), this.f47907a.m4());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f47958o, jSONObject, "focus", this.f47907a.B3(), this.f47907a.z3());
            Field<Expression<String>> field7 = divInputTemplate.f47959p;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_family", typeHelper7);
            Field<Expression<Long>> field8 = divInputTemplate.f47960q;
            ValueValidator<Long> valueValidator2 = DivInputJsonParser.D;
            Expression<Long> expression6 = DivInputJsonParser.f47883e;
            Expression<Long> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size", typeHelper5, lVar5, valueValidator2, expression6);
            if (expressionResolveOptionalExpression8 != null) {
                expression6 = expressionResolveOptionalExpression8;
            }
            Field<Expression<DivSizeUnit>> field9 = divInputTemplate.f47961r;
            TypeHelper<DivSizeUnit> typeHelper8 = DivInputJsonParser.f47900v;
            bk.l<String, DivSizeUnit> lVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression7 = DivInputJsonParser.f47884f;
            Expression<DivSizeUnit> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size_unit", typeHelper8, lVar7, expression7);
            Expression<DivSizeUnit> expression8 = expressionResolveOptionalExpression9 == null ? expression7 : expressionResolveOptionalExpression9;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f47962s, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f47963t, jSONObject, FontsContractCompat.Columns.WEIGHT, DivInputJsonParser.f47901w, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f47964u, jSONObject, "font_weight_value", typeHelper5, lVar5, DivInputJsonParser.E);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47965v, jSONObject, "functions", this.f47907a.K3(), this.f47907a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f47966w, jSONObject, "height", this.f47907a.a7(), this.f47907a.Y6());
            if (divSize == null) {
                divSize = DivInputJsonParser.f47885g;
            }
            DivSize divSize2 = divSize;
            Field<Expression<Integer>> field10 = divInputTemplate.f47967x;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar8 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "highlight_color", typeHelper9, lVar8);
            Field<Expression<Integer>> field11 = divInputTemplate.f47968y;
            Expression<Integer> expression9 = DivInputJsonParser.f47886h;
            Expression<Integer> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "hint_color", typeHelper9, lVar8, expression9);
            if (expressionResolveOptionalExpression14 != null) {
                expression9 = expressionResolveOptionalExpression14;
            }
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.f47969z, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.A, jSONObject, "id");
            Field<Expression<Boolean>> field12 = divInputTemplate.B;
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar9 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression10 = DivInputJsonParser.f47887i;
            Expression<Boolean> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "is_enabled", typeHelper10, lVar9, expression10);
            if (expressionResolveOptionalExpression16 != null) {
                expression10 = expressionResolveOptionalExpression16;
            }
            Field<Expression<DivInput.KeyboardType>> field13 = divInputTemplate.C;
            TypeHelper<DivInput.KeyboardType> typeHelper11 = DivInputJsonParser.f47902x;
            bk.l<String, DivInput.KeyboardType> lVar10 = DivInput.KeyboardType.FROM_STRING;
            Expression<DivInput.KeyboardType> expression11 = DivInputJsonParser.f47888j;
            Expression<DivInput.KeyboardType> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "keyboard_type", typeHelper11, lVar10, expression11);
            if (expressionResolveOptionalExpression17 != null) {
                expression11 = expressionResolveOptionalExpression17;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.D, jSONObject, "layout_provider", this.f47907a.R4(), this.f47907a.P4());
            Field<Expression<Double>> field14 = divInputTemplate.E;
            Expression<Double> expression12 = DivInputJsonParser.f47889k;
            Expression<Double> expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "letter_spacing", typeHelper3, lVar3, expression12);
            if (expressionResolveOptionalExpression18 != null) {
                expression12 = expressionResolveOptionalExpression18;
            }
            Expression expressionResolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.F, jSONObject, "line_height", typeHelper5, lVar5, DivInputJsonParser.F);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.G, jSONObject, "margins", this.f47907a.a3(), this.f47907a.Y2());
            DivInputMask divInputMask = (DivInputMask) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.H, jSONObject, "mask", this.f47907a.x4(), this.f47907a.v4());
            Expression expressionResolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.I, jSONObject, "max_length", typeHelper5, lVar5, DivInputJsonParser.G);
            Expression expressionResolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.J, jSONObject, "max_visible_lines", typeHelper5, lVar5, DivInputJsonParser.H);
            DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.K, jSONObject, "native_interface", this.f47907a.A4(), this.f47907a.y4());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.L, jSONObject, "paddings", this.f47907a.a3(), this.f47907a.Y2());
            Expression expressionResolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.M, jSONObject, "reuse_id", typeHelper7);
            Expression expressionResolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.N, jSONObject, "row_span", typeHelper5, lVar5, DivInputJsonParser.I);
            Field<Expression<Boolean>> field15 = divInputTemplate.O;
            Expression<Boolean> expression13 = DivInputJsonParser.f47890l;
            Expression<Boolean> expressionResolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "select_all_on_focus", typeHelper10, lVar9, expression13);
            Expression<Boolean> expression14 = expressionResolveOptionalExpression24 == null ? expression13 : expressionResolveOptionalExpression24;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.P, jSONObject, "selected_actions", this.f47907a.w0(), this.f47907a.u0());
            Field<Expression<DivAlignmentHorizontal>> field16 = divInputTemplate.Q;
            TypeHelper<DivAlignmentHorizontal> typeHelper12 = DivInputJsonParser.f47903y;
            Expression<DivAlignmentHorizontal> expression15 = DivInputJsonParser.f47891m;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_alignment_horizontal", typeHelper12, lVar, expression15);
            Expression<DivAlignmentHorizontal> expression16 = expressionResolveOptionalExpression25 == null ? expression15 : expressionResolveOptionalExpression25;
            Field<Expression<DivAlignmentVertical>> field17 = divInputTemplate.R;
            TypeHelper<DivAlignmentVertical> typeHelper13 = DivInputJsonParser.f47904z;
            Expression<DivAlignmentVertical> expression17 = DivInputJsonParser.f47892n;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "text_alignment_vertical", typeHelper13, lVar2, expression17);
            Expression<DivAlignmentVertical> expression18 = expressionResolveOptionalExpression26 == null ? expression17 : expressionResolveOptionalExpression26;
            Field<Expression<Integer>> field18 = divInputTemplate.S;
            Expression<Integer> expression19 = DivInputJsonParser.f47893o;
            Expression<Integer> expressionResolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "text_color", typeHelper9, lVar8, expression19);
            Expression<Integer> expression20 = expressionResolveOptionalExpression27 == null ? expression19 : expressionResolveOptionalExpression27;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divInputTemplate.T, jSONObject, "text_variable");
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.U, jSONObject, "tooltips", this.f47907a.R8(), this.f47907a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.V, jSONObject, "transform", this.f47907a.d9(), this.f47907a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.W, jSONObject, "transition_change", this.f47907a.W1(), this.f47907a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.X, jSONObject, "transition_in", this.f47907a.B1(), this.f47907a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.Y, jSONObject, "transition_out", this.f47907a.B1(), this.f47907a.z1());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.Z, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivInputJsonParser.J);
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47938a0, jSONObject, "validators", this.f47907a.I4(), this.f47907a.G4());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47940b0, jSONObject, "variable_triggers", this.f47907a.g9(), this.f47907a.e9());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47942c0, jSONObject, "variables", this.f47907a.m9(), this.f47907a.k9());
            Field<Expression<DivVisibility>> field19 = divInputTemplate.f47944d0;
            TypeHelper<DivVisibility> typeHelper14 = DivInputJsonParser.A;
            bk.l<String, DivVisibility> lVar11 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression21 = DivInputJsonParser.f47894p;
            Expression<DivVisibility> expressionResolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "visibility", typeHelper14, lVar11, expression21);
            Expression<DivVisibility> expression22 = expressionResolveOptionalExpression28 == null ? expression21 : expressionResolveOptionalExpression28;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f47946e0, jSONObject, "visibility_action", this.f47907a.y9(), this.f47907a.w9());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.f47948f0, jSONObject, "visibility_actions", this.f47907a.y9(), this.f47907a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.f47950g0, jSONObject, "width", this.f47907a.a7(), this.f47907a.Y6());
            if (divSize3 == null) {
                divSize3 = DivInputJsonParser.f47895q;
            }
            return new DivInput(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, expression3, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression5, listResolveOptionalList3, listResolveOptionalList4, expression5, listResolveOptionalList5, listResolveOptionalList6, divFocus, expressionResolveOptionalExpression7, expression6, expression8, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, listResolveOptionalList7, divSize2, expressionResolveOptionalExpression13, expression9, expressionResolveOptionalExpression15, str, expression10, expression11, divLayoutProvider, expression12, expressionResolveOptionalExpression19, divEdgeInsets, divInputMask, expressionResolveOptionalExpression20, expressionResolveOptionalExpression21, nativeInterface, divEdgeInsets2, expressionResolveOptionalExpression22, expressionResolveOptionalExpression23, expression14, listResolveOptionalList8, expression16, expression18, expression20, str2, listResolveOptionalList9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList10, listResolveOptionalList11, listResolveOptionalList12, listResolveOptionalList13, expression22, divVisibilityAction, listResolveOptionalList14, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f47907a = jsonParserComponent;
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
        return j10 > 0;
    }

    public static final boolean p(long j10) {
        return j10 > 0;
    }

    public static final boolean q(long j10) {
        return j10 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f47880b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivInput.Autocapitalization autocapitalization = DivInput.Autocapitalization.AUTO;
        f47881c = Expression.Companion.constant$default(companion, autocapitalization, null, 2, null);
        DivInput.EnterKeyType enterKeyType = DivInput.EnterKeyType.DEFAULT;
        f47882d = Expression.Companion.constant$default(companion, enterKeyType, null, 2, null);
        f47883e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f47884f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f47885g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f47886h = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f47887i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivInput.KeyboardType keyboardType = DivInput.KeyboardType.MULTI_LINE_TEXT;
        f47888j = Expression.Companion.constant$default(companion, keyboardType, null, 2, null);
        f47889k = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f47890l = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        f47891m = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f47892n = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f47893o = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f47894p = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f47895q = new DivSize.c(new DivMatchParentSize(null, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f47896r = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47897s = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f47898t = companion2.from(autocapitalization, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_AUTOCAPITALIZATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.Autocapitalization);
            }
        });
        f47899u = companion2.from(enterKeyType, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ENTER_KEY_TYPE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.EnterKeyType);
            }
        });
        f47900v = companion2.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f47901w = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f47902x = companion2.from(keyboardType, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_KEYBOARD_TYPE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.KeyboardType);
            }
        });
        f47903y = companion2.from(divAlignmentHorizontal, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f47904z = companion2.from(divAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        A = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        B = new ValueValidator() { // from class: oe.w5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.j(((Double) obj).doubleValue());
            }
        };
        C = new ValueValidator() { // from class: oe.x5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.k(((Long) obj).longValue());
            }
        };
        D = new ValueValidator() { // from class: oe.y5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.l(((Long) obj).longValue());
            }
        };
        E = new ValueValidator() { // from class: oe.z5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.m(((Long) obj).longValue());
            }
        };
        F = new ValueValidator() { // from class: oe.a6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.n(((Long) obj).longValue());
            }
        };
        G = new ValueValidator() { // from class: oe.b6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.o(((Long) obj).longValue());
            }
        };
        H = new ValueValidator() { // from class: oe.c6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.p(((Long) obj).longValue());
            }
        };
        I = new ValueValidator() { // from class: oe.d6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivInputJsonParser.q(((Long) obj).longValue());
            }
        };
        J = new ListValidator() { // from class: oe.e6
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivInputJsonParser.r(list);
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
