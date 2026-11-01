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
import com.yandex.div2.DivTextRangeJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTextRangeJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49637a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f49638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSizeUnit> f49639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<Long> f49640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTextAlignmentVertical> f49641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSizeUnit> f49642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivFontWeight> f49643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivLineStyle> f49644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivLineStyle> f49645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49651o;

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
        public final JsonParserComponent f49652a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Range deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f49652a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivTextRangeJsonParser.f49641e, DivTextAlignmentVertical.FROM_STRING);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonPropertyParser.readOptional(parsingContext, jSONObject, A2.f54950g, this.f49652a.s8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression = DivTextRangeJsonParser.f49638b;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "baseline_offset", typeHelper, lVar, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f49652a.v8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper2, lVar2, DivTextRangeJsonParser.f49646j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper3);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, lVar2, DivTextRangeJsonParser.f49647k);
            TypeHelper<DivSizeUnit> typeHelper4 = DivTextRangeJsonParser.f49642f;
            bk.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivTextRangeJsonParser.f49639c;
            Expression<DivSizeUnit> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, lVar3, expression2);
            if (optionalExpression7 != null) {
                expression2 = optionalExpression7;
            }
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextRangeJsonParser.f49643g, DivFontWeight.FROM_STRING);
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, lVar2, DivTextRangeJsonParser.f49648l);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, lVar);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, lVar2, DivTextRangeJsonParser.f49649m);
            DivTextRangeMask divTextRangeMask = (DivTextRangeMask) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.f49652a.D8());
            ValueValidator<Long> valueValidator = DivTextRangeJsonParser.f49650n;
            Expression<Long> expression3 = DivTextRangeJsonParser.f49640d;
            Expression<Long> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = optionalExpression13 == null ? expression3 : optionalExpression13;
            TypeHelper<DivLineStyle> typeHelper5 = DivTextRangeJsonParser.f49644h;
            bk.l<String, DivLineStyle> lVar4 = DivLineStyle.FROM_STRING;
            return new DivText.Range(optionalList, optionalExpression, divTextRangeBackground, expression, divTextRangeBorder, optionalExpression3, optionalExpression4, optionalExpression5, optionalExpression6, expression2, optionalExpression8, optionalExpression9, optionalExpression10, optionalExpression11, optionalExpression12, divTextRangeMask, expression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper5, lVar4), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.f49652a.P6()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top_offset", typeHelper2, lVar2, DivTextRangeJsonParser.f49651o), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", DivTextRangeJsonParser.f49645i, lVar4));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivText.Range range) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", range.f49542a, this.f49652a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", range.f49543b, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, A2.f54950g, range.f49544c, this.f49652a.s8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "baseline_offset", range.f49545d);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", range.f49546e, this.f49652a.v8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", range.f49547f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", range.f49548g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", range.f49549h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", range.f49550i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", range.f49551j, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, range.f49552k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, range.f49553l, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", range.f49554m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", range.f49555n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", range.f49556o);
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", range.f49557p, this.f49652a.D8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", range.f49558q);
            Expression<DivLineStyle> expression = range.f49559r;
            bk.l<DivLineStyle, String> lVar = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", range.f49560s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", range.f49561t, this.f49652a.P6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top_offset", range.f49562u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", range.f49563v, lVar);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49652a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49653a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate.RangeTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49792a : null, this.f49653a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivTextRangeJsonParser.f49641e, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49793b : null, DivTextAlignmentVertical.FROM_STRING);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49794c : null, this.f49653a.t8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = rangeTemplate != null ? rangeTemplate.f49795d : null;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "baseline_offset", typeHelper, allowPropertyOverride, field, lVar);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49796e : null, this.f49653a.w8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = rangeTemplate != null ? rangeTemplate.f49797f : null;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper2, allowPropertyOverride, field2, lVar2, DivTextRangeJsonParser.f49646j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49798g : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper3, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49799h : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49800i : null, lVar2, DivTextRangeJsonParser.f49647k);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivTextRangeJsonParser.f49642f, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49801j : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49802k : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextRangeJsonParser.f49643g, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49803l : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49804m : null, lVar2, DivTextRangeJsonParser.f49648l);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49805n : null, lVar);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49806o : null, lVar2, DivTextRangeJsonParser.f49649m);
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49807p : null, this.f49653a.E8());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49808q : null, lVar2, DivTextRangeJsonParser.f49650n);
            TypeHelper<DivLineStyle> typeHelper4 = DivTextRangeJsonParser.f49644h;
            Field<Expression<DivLineStyle>> field3 = rangeTemplate != null ? rangeTemplate.f49809r : null;
            bk.l<String, DivLineStyle> lVar3 = DivLineStyle.FROM_STRING;
            return new DivTextTemplate.RangeTemplate(optionalListField, optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField3, optionalFieldWithExpression13, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper4, allowPropertyOverride, field3, lVar3), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49810s : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49811t : null, this.f49653a.Q6()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top_offset", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49812u : null, lVar2, DivTextRangeJsonParser.f49651o), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", DivTextRangeJsonParser.f49645i, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f49813v : null, lVar3));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.RangeTemplate rangeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", rangeTemplate.f49792a, this.f49653a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", rangeTemplate.f49793b, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, A2.f54950g, rangeTemplate.f49794c, this.f49653a.t8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "baseline_offset", rangeTemplate.f49795d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", rangeTemplate.f49796e, this.f49653a.w8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", rangeTemplate.f49797f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", rangeTemplate.f49798g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", rangeTemplate.f49799h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", rangeTemplate.f49800i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", rangeTemplate.f49801j, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, rangeTemplate.f49802k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, rangeTemplate.f49803l, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", rangeTemplate.f49804m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", rangeTemplate.f49805n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", rangeTemplate.f49806o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", rangeTemplate.f49807p, this.f49653a.E8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", rangeTemplate.f49808q);
            Field<Expression<DivLineStyle>> field = rangeTemplate.f49809r;
            bk.l<DivLineStyle, String> lVar = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", rangeTemplate.f49810s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", rangeTemplate.f49811t, this.f49653a.Q6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top_offset", rangeTemplate.f49812u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", rangeTemplate.f49813v, lVar);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49653a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate.RangeTemplate, DivText.Range> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49654a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Range resolve(ParsingContext parsingContext, DivTextTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, rangeTemplate.f49792a, jSONObject, "actions", this.f49654a.w0(), this.f49654a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49793b, jSONObject, "alignment_vertical", DivTextRangeJsonParser.f49641e, DivTextAlignmentVertical.FROM_STRING);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f49794c, jSONObject, A2.f54950g, this.f49654a.u8(), this.f49654a.s8());
            Field<Expression<Double>> field = rangeTemplate.f49795d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression = DivTextRangeJsonParser.f49638b;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "baseline_offset", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f49796e, jSONObject, "border", this.f49654a.x8(), this.f49654a.v8());
            Field<Expression<Long>> field2 = rangeTemplate.f49797f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end", typeHelper2, lVar2, DivTextRangeJsonParser.f49646j);
            Field<Expression<String>> field3 = rangeTemplate.f49798g;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49799h, jSONObject, "font_feature_settings", typeHelper3);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49800i, jSONObject, "font_size", typeHelper2, lVar2, DivTextRangeJsonParser.f49647k);
            Field<Expression<DivSizeUnit>> field4 = rangeTemplate.f49801j;
            TypeHelper<DivSizeUnit> typeHelper4 = DivTextRangeJsonParser.f49642f;
            bk.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivTextRangeJsonParser.f49639c;
            Expression<DivSizeUnit> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size_unit", typeHelper4, lVar3, expression2);
            if (expressionResolveOptionalExpression7 != null) {
                expression2 = expressionResolveOptionalExpression7;
            }
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49802k, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49803l, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextRangeJsonParser.f49643g, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49804m, jSONObject, "font_weight_value", typeHelper2, lVar2, DivTextRangeJsonParser.f49648l);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49805n, jSONObject, "letter_spacing", typeHelper, lVar);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49806o, jSONObject, "line_height", typeHelper2, lVar2, DivTextRangeJsonParser.f49649m);
            DivTextRangeMask divTextRangeMask = (DivTextRangeMask) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f49807p, jSONObject, "mask", this.f49654a.F8(), this.f49654a.D8());
            Field<Expression<Long>> field5 = rangeTemplate.f49808q;
            ValueValidator<Long> valueValidator = DivTextRangeJsonParser.f49650n;
            Expression<Long> expression3 = DivTextRangeJsonParser.f49640d;
            Expression<Long> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression13 == null ? expression3 : expressionResolveOptionalExpression13;
            Field<Expression<DivLineStyle>> field6 = rangeTemplate.f49809r;
            TypeHelper<DivLineStyle> typeHelper5 = DivTextRangeJsonParser.f49644h;
            bk.l<String, DivLineStyle> lVar4 = DivLineStyle.FROM_STRING;
            return new DivText.Range(listResolveOptionalList, expressionResolveOptionalExpression, divTextRangeBackground, expression, divTextRangeBorder, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, expression2, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, divTextRangeMask, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "strike", typeHelper5, lVar4), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49810s, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f49811t, jSONObject, "text_shadow", this.f49654a.R6(), this.f49654a.P6()), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49812u, jSONObject, "top_offset", typeHelper2, lVar2, DivTextRangeJsonParser.f49651o), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f49813v, jSONObject, "underline", DivTextRangeJsonParser.f49645i, lVar4));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49654a = jsonParserComponent;
        }
    }

    public static final boolean g(long j10) {
        return j10 > 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(long j10) {
        return j10 > 0;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49638b = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f49639c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f49640d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49641e = companion2.from(nj.n.K(DivTextAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
            }
        });
        f49642f = companion2.from(divSizeUnit, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f49643g = companion2.from(nj.n.K(DivFontWeight.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f49644h = companion2.from(nj.n.K(DivLineStyle.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_STRIKE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        f49645i = companion2.from(nj.n.K(DivLineStyle.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_UNDERLINE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        f49646j = new ValueValidator() { // from class: oe.cb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.g(((Long) obj).longValue());
            }
        };
        f49647k = new ValueValidator() { // from class: oe.db
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.h(((Long) obj).longValue());
            }
        };
        f49648l = new ValueValidator() { // from class: oe.eb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.i(((Long) obj).longValue());
            }
        };
        f49649m = new ValueValidator() { // from class: oe.fb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.j(((Long) obj).longValue());
            }
        };
        f49650n = new ValueValidator() { // from class: oe.gb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.k(((Long) obj).longValue());
            }
        };
        f49651o = new ValueValidator() { // from class: oe.hb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.l(((Long) obj).longValue());
            }
        };
    }
}
