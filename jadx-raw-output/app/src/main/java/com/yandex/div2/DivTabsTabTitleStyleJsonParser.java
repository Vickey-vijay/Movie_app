package com.yandex.div2;

import androidx.core.provider.FontsContractCompat;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import com.yandex.div2.DivTabsTabTitleStyleJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivTabsTabTitleStyleJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49340a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f49341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f49342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivTabs.TabTitleStyle.AnimationType> f49344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f49346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivFontWeight> f49347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f49348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final DivEdgeInsets f49351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f49352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTabs.TabTitleStyle.AnimationType> f49353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f49354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f49355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f49356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49361v;

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
        public final JsonParserComponent f49362a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivTabsTabTitleStyleJsonParser.f49341b;
            Expression<Integer> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_background_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_variation_settings", typeHelper2);
            TypeHelper<DivFontWeight> typeHelper3 = DivTabsTabTitleStyleJsonParser.f49352m;
            bk.l<String, DivFontWeight> lVar2 = DivFontWeight.FROM_STRING;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_weight", typeHelper3, lVar2);
            Expression<Integer> expression3 = DivTabsTabTitleStyleJsonParser.f49342c;
            Expression<Integer> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_text_color", typeHelper, lVar, expression3);
            Expression<Integer> expression4 = optionalExpression4 == null ? expression3 : optionalExpression4;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTabsTabTitleStyleJsonParser.f49357r;
            Expression<Long> expression5 = DivTabsTabTitleStyleJsonParser.f49343d;
            Expression<Long> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_duration", typeHelper4, lVar3, valueValidator, expression5);
            if (optionalExpression5 != null) {
                expression5 = optionalExpression5;
            }
            TypeHelper<DivTabs.TabTitleStyle.AnimationType> typeHelper5 = DivTabsTabTitleStyleJsonParser.f49353n;
            bk.l<String, DivTabs.TabTitleStyle.AnimationType> lVar4 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression6 = DivTabsTabTitleStyleJsonParser.f49344e;
            Expression<DivTabs.TabTitleStyle.AnimationType> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_type", typeHelper5, lVar4, expression6);
            Expression<DivTabs.TabTitleStyle.AnimationType> expression7 = optionalExpression6 == null ? expression6 : optionalExpression6;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f49358s);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.f49362a.s2());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator<Long> valueValidator2 = DivTabsTabTitleStyleJsonParser.f49359t;
            Expression<Long> expression8 = DivTabsTabTitleStyleJsonParser.f49345f;
            Expression<Long> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper4, lVar3, valueValidator2, expression8);
            if (optionalExpression9 != null) {
                expression8 = optionalExpression9;
            }
            TypeHelper<DivSizeUnit> typeHelper6 = DivTabsTabTitleStyleJsonParser.f49354o;
            bk.l<String, DivSizeUnit> lVar5 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression9 = DivTabsTabTitleStyleJsonParser.f49346g;
            Expression<DivSizeUnit> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper6, lVar5, expression9);
            Expression<DivSizeUnit> expression10 = optionalExpression10 == null ? expression9 : optionalExpression10;
            TypeHelper<DivFontWeight> typeHelper7 = DivTabsTabTitleStyleJsonParser.f49355p;
            Expression<DivFontWeight> expression11 = DivTabsTabTitleStyleJsonParser.f49347h;
            Expression<DivFontWeight> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, typeHelper7, lVar2, expression11);
            Expression<DivFontWeight> expression12 = optionalExpression11 == null ? expression11 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_background_color", typeHelper, lVar);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.f49356q, lVar2);
            Expression<Integer> expression13 = DivTabsTabTitleStyleJsonParser.f49348i;
            Expression<Integer> optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_text_color", typeHelper, lVar, expression13);
            Expression<Integer> expression14 = optionalExpression15 == null ? expression13 : optionalExpression15;
            ValueValidator<Long> valueValidator3 = DivTabsTabTitleStyleJsonParser.f49360u;
            Expression<Long> expression15 = DivTabsTabTitleStyleJsonParser.f49349j;
            Expression<Long> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper4, lVar3, valueValidator3, expression15);
            Expression<Long> expression16 = optionalExpression16 == null ? expression15 : optionalExpression16;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar6 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression17 = DivTabsTabTitleStyleJsonParser.f49350k;
            Expression<Double> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper8, lVar6, expression17);
            Expression<Double> expression18 = optionalExpression17 == null ? expression17 : optionalExpression17;
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f49361v);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f49362a.Y2());
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabsTabTitleStyleJsonParser.f49351l;
            }
            return new DivTabs.TabTitleStyle(expression2, optionalExpression2, optionalExpression3, expression4, expression5, expression7, optionalExpression7, divCornersRadius, optionalExpression8, expression8, expression10, expression12, optionalExpression12, optionalExpression13, optionalExpression14, expression14, expression16, expression18, optionalExpression18, divEdgeInsets);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTabs.TabTitleStyle tabTitleStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Expression<Integer> expression = tabTitleStyle.f49293a;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_background_color", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyle.f49294b);
            Expression<DivFontWeight> expression2 = tabTitleStyle.f49295c;
            bk.l<DivFontWeight, String> lVar2 = DivFontWeight.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_weight", expression2, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_text_color", tabTitleStyle.f49296d, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_duration", tabTitleStyle.f49297e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_type", tabTitleStyle.f49298f, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", tabTitleStyle.f49299g);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", tabTitleStyle.f49300h, this.f49362a.s2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", tabTitleStyle.f49301i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", tabTitleStyle.f49302j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", tabTitleStyle.f49303k, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, tabTitleStyle.f49304l, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_background_color", tabTitleStyle.f49305m, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyle.f49306n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyle.f49307o, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_text_color", tabTitleStyle.f49308p, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", tabTitleStyle.f49309q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", tabTitleStyle.f49310r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", tabTitleStyle.f49311s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", tabTitleStyle.f49312t, this.f49362a.Y2());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49362a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49363a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabsTemplate.TabTitleStyleTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49414a : null;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_background_color", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_font_variation_settings", typeHelper2, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49415b : null);
            TypeHelper<DivFontWeight> typeHelper3 = DivTabsTabTitleStyleJsonParser.f49352m;
            Field<Expression<DivFontWeight>> field2 = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49416c : null;
            bk.l<String, DivFontWeight> lVar2 = DivFontWeight.FROM_STRING;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_font_weight", typeHelper3, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_text_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49417d : null, lVar);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49418e : null;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivTabsTemplate.TabTitleStyleTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalFieldWithExpression4, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation_duration", typeHelper4, allowPropertyOverride, field3, lVar3, DivTabsTabTitleStyleJsonParser.f49357r), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation_type", DivTabsTabTitleStyleJsonParser.f49353n, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49419f : null, DivTabs.TabTitleStyle.AnimationType.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49420g : null, lVar3, DivTabsTabTitleStyleJsonParser.f49358s), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49421h : null, this.f49363a.t2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49422i : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49423j : null, lVar3, DivTabsTabTitleStyleJsonParser.f49359t), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivTabsTabTitleStyleJsonParser.f49354o, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49424k : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTabsTabTitleStyleJsonParser.f49355p, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49425l : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_background_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49426m : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_font_variation_settings", typeHelper2, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49427n : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.f49356q, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49428o : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_text_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49429p : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49430q : null, lVar3, DivTabsTabTitleStyleJsonParser.f49360u), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49431r : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49432s : null, lVar3, DivTabsTabTitleStyleJsonParser.f49361v), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f49433t : null, this.f49363a.Z2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<Expression<Integer>> field = tabTitleStyleTemplate.f49414a;
            bk.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_background_color", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyleTemplate.f49415b);
            Field<Expression<DivFontWeight>> field2 = tabTitleStyleTemplate.f49416c;
            bk.l<DivFontWeight, String> lVar2 = DivFontWeight.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_weight", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_text_color", tabTitleStyleTemplate.f49417d, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_duration", tabTitleStyleTemplate.f49418e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_type", tabTitleStyleTemplate.f49419f, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", tabTitleStyleTemplate.f49420g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", tabTitleStyleTemplate.f49421h, this.f49363a.t2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", tabTitleStyleTemplate.f49422i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", tabTitleStyleTemplate.f49423j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", tabTitleStyleTemplate.f49424k, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, tabTitleStyleTemplate.f49425l, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_background_color", tabTitleStyleTemplate.f49426m, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyleTemplate.f49427n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyleTemplate.f49428o, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_text_color", tabTitleStyleTemplate.f49429p, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", tabTitleStyleTemplate.f49430q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", tabTitleStyleTemplate.f49431r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", tabTitleStyleTemplate.f49432s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", tabTitleStyleTemplate.f49433t, this.f49363a.Z2());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49363a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTabsTemplate.TabTitleStyleTemplate, DivTabs.TabTitleStyle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49364a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleStyle resolve(ParsingContext parsingContext, DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field = tabTitleStyleTemplate.f49414a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivTabsTabTitleStyleJsonParser.f49341b;
            Expression<Integer> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_background_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<JSONObject>> field2 = tabTitleStyleTemplate.f49415b;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_font_variation_settings", typeHelper2);
            Field<Expression<DivFontWeight>> field3 = tabTitleStyleTemplate.f49416c;
            TypeHelper<DivFontWeight> typeHelper3 = DivTabsTabTitleStyleJsonParser.f49352m;
            bk.l<String, DivFontWeight> lVar2 = DivFontWeight.FROM_STRING;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "active_font_weight", typeHelper3, lVar2);
            Field<Expression<Integer>> field4 = tabTitleStyleTemplate.f49417d;
            Expression<Integer> expression3 = DivTabsTabTitleStyleJsonParser.f49342c;
            Expression<Integer> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "active_text_color", typeHelper, lVar, expression3);
            Expression<Integer> expression4 = expressionResolveOptionalExpression4 == null ? expression3 : expressionResolveOptionalExpression4;
            Field<Expression<Long>> field5 = tabTitleStyleTemplate.f49418e;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTabsTabTitleStyleJsonParser.f49357r;
            Expression<Long> expression5 = DivTabsTabTitleStyleJsonParser.f49343d;
            Expression<Long> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "animation_duration", typeHelper4, lVar3, valueValidator, expression5);
            if (expressionResolveOptionalExpression5 != null) {
                expression5 = expressionResolveOptionalExpression5;
            }
            Field<Expression<DivTabs.TabTitleStyle.AnimationType>> field6 = tabTitleStyleTemplate.f49419f;
            TypeHelper<DivTabs.TabTitleStyle.AnimationType> typeHelper5 = DivTabsTabTitleStyleJsonParser.f49353n;
            bk.l<String, DivTabs.TabTitleStyle.AnimationType> lVar4 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression6 = DivTabsTabTitleStyleJsonParser.f49344e;
            Expression<DivTabs.TabTitleStyle.AnimationType> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "animation_type", typeHelper5, lVar4, expression6);
            Expression<DivTabs.TabTitleStyle.AnimationType> expression7 = expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f49420g, jSONObject, "corner_radius", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f49358s);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonFieldResolver.resolveOptional(parsingContext, tabTitleStyleTemplate.f49421h, jSONObject, "corners_radius", this.f49364a.u2(), this.f49364a.s2());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f49422i, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field7 = tabTitleStyleTemplate.f49423j;
            ValueValidator<Long> valueValidator2 = DivTabsTabTitleStyleJsonParser.f49359t;
            Expression<Long> expression8 = DivTabsTabTitleStyleJsonParser.f49345f;
            Expression<Long> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_size", typeHelper4, lVar3, valueValidator2, expression8);
            if (expressionResolveOptionalExpression9 != null) {
                expression8 = expressionResolveOptionalExpression9;
            }
            Field<Expression<DivSizeUnit>> field8 = tabTitleStyleTemplate.f49424k;
            TypeHelper<DivSizeUnit> typeHelper6 = DivTabsTabTitleStyleJsonParser.f49354o;
            bk.l<String, DivSizeUnit> lVar5 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression9 = DivTabsTabTitleStyleJsonParser.f49346g;
            Expression<DivSizeUnit> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size_unit", typeHelper6, lVar5, expression9);
            Expression<DivSizeUnit> expression10 = expressionResolveOptionalExpression10 == null ? expression9 : expressionResolveOptionalExpression10;
            Field<Expression<DivFontWeight>> field9 = tabTitleStyleTemplate.f49425l;
            TypeHelper<DivFontWeight> typeHelper7 = DivTabsTabTitleStyleJsonParser.f49355p;
            Expression<DivFontWeight> expression11 = DivTabsTabTitleStyleJsonParser.f49347h;
            Expression<DivFontWeight> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, FontsContractCompat.Columns.WEIGHT, typeHelper7, lVar2, expression11);
            Expression<DivFontWeight> expression12 = expressionResolveOptionalExpression11 == null ? expression11 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f49426m, jSONObject, "inactive_background_color", typeHelper, lVar);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f49427n, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f49428o, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.f49356q, lVar2);
            Field<Expression<Integer>> field10 = tabTitleStyleTemplate.f49429p;
            Expression<Integer> expression13 = DivTabsTabTitleStyleJsonParser.f49348i;
            Expression<Integer> expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "inactive_text_color", typeHelper, lVar, expression13);
            Expression<Integer> expression14 = expressionResolveOptionalExpression15 == null ? expression13 : expressionResolveOptionalExpression15;
            Field<Expression<Long>> field11 = tabTitleStyleTemplate.f49430q;
            ValueValidator<Long> valueValidator3 = DivTabsTabTitleStyleJsonParser.f49360u;
            Expression<Long> expression15 = DivTabsTabTitleStyleJsonParser.f49349j;
            Expression<Long> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "item_spacing", typeHelper4, lVar3, valueValidator3, expression15);
            Expression<Long> expression16 = expressionResolveOptionalExpression16 == null ? expression15 : expressionResolveOptionalExpression16;
            Field<Expression<Double>> field12 = tabTitleStyleTemplate.f49431r;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar6 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression17 = DivTabsTabTitleStyleJsonParser.f49350k;
            Expression<Double> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "letter_spacing", typeHelper8, lVar6, expression17);
            Expression<Double> expression18 = expressionResolveOptionalExpression17 == null ? expression17 : expressionResolveOptionalExpression17;
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f49432s, jSONObject, "line_height", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f49361v);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, tabTitleStyleTemplate.f49433t, jSONObject, "paddings", this.f49364a.a3(), this.f49364a.Y2());
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabsTabTitleStyleJsonParser.f49351l;
            }
            return new DivTabs.TabTitleStyle(expression2, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression4, expression5, expression7, expressionResolveOptionalExpression7, divCornersRadius, expressionResolveOptionalExpression8, expression8, expression10, expression12, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, expression14, expression16, expression18, expressionResolveOptionalExpression18, divEdgeInsets);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49364a = jsonParserComponent;
        }
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
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

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49341b = Expression.Companion.constant$default(companion, -9120, null, 2, null);
        f49342c = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
        f49343d = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivTabs.TabTitleStyle.AnimationType animationType = DivTabs.TabTitleStyle.AnimationType.SLIDE;
        f49344e = Expression.Companion.constant$default(companion, animationType, null, 2, null);
        f49345f = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f49346g = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        DivFontWeight divFontWeight = DivFontWeight.REGULAR;
        f49347h = Expression.Companion.constant$default(companion, divFontWeight, null, 2, null);
        f49348i = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
        f49349j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f49350k = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f49351l = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49352m = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ACTIVE_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f49353n = companion2.from(animationType, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ANIMATION_TYPE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTabs.TabTitleStyle.AnimationType);
            }
        });
        f49354o = companion2.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f49355p = companion2.from(divFontWeight, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f49356q = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_INACTIVE_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f49357r = new ValueValidator() { // from class: oe.ma
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.f(((Long) obj).longValue());
            }
        };
        f49358s = new ValueValidator() { // from class: oe.na
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.g(((Long) obj).longValue());
            }
        };
        f49359t = new ValueValidator() { // from class: oe.oa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.h(((Long) obj).longValue());
            }
        };
        f49360u = new ValueValidator() { // from class: oe.pa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.i(((Long) obj).longValue());
            }
        };
        f49361v = new ValueValidator() { // from class: oe.qa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.j(((Long) obj).longValue());
            }
        };
    }
}
