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
import com.yandex.div2.DivVideoJsonParser;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import oe.yb;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivVideoJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50010a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Double> f50011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DivSize.d f50013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVideoScale> f50017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivVisibility> f50018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final DivSize.c f50019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f50020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f50021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVideoScale> f50022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivVisibility> f50023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Double> f50024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f50026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivTransitionTrigger> f50027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivVideoSource> f50028s;

    /* JADX INFO: compiled from: DivVideoJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivVideoJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50029a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideo deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f50029a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivVideoJsonParser.f50020k, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivVideoJsonParser.f50021l, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivVideoJsonParser.f50024o;
            Expression<Double> expression = DivVideoJsonParser.f50011b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f50029a.t1());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f50029a.C1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivVideoJsonParser.f50012c;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autostart", typeHelper2, lVar2, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f54950g, this.f50029a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.f50029a.L1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "buffering_actions", this.f50029a.u0());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, lVar3, DivVideoJsonParser.f50025p);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f50029a.P2());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "elapsed_time_variable");
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f50029a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f50029a.b3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "fatal_actions", this.f50029a.u0());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f50029a.z3());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f50029a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f50029a.Y6());
            if (divSize == null) {
                divSize = DivVideoJsonParser.f50013d;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f50029a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f50029a.Y2());
            Expression<Boolean> expression3 = DivVideoJsonParser.f50014e;
            Expression<Boolean> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "muted", typeHelper2, lVar2, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f50029a.Y2());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "pause_actions", this.f50029a.u0());
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "player_settings_payload");
            Expression<Boolean> expression4 = DivVideoJsonParser.f50015f;
            Expression<Boolean> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper2, lVar2, expression4);
            if (optionalExpression7 != null) {
                expression4 = optionalExpression7;
            }
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper4);
            Expression<Boolean> expression5 = DivVideoJsonParser.f50016g;
            Expression<Boolean> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "repeatable", typeHelper2, lVar2, expression5);
            if (optionalExpression9 != null) {
                expression5 = optionalExpression9;
            }
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "resume_actions", this.f50029a.u0());
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, lVar3, DivVideoJsonParser.f50026q);
            TypeHelper<DivVideoScale> typeHelper5 = DivVideoJsonParser.f50022m;
            bk.l<String, DivVideoScale> lVar4 = DivVideoScale.FROM_STRING;
            Expression<DivVideoScale> expression6 = DivVideoJsonParser.f50017h;
            Expression<DivVideoScale> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, lVar4, expression6);
            Expression<DivVideoScale> expression7 = optionalExpression12 == null ? expression6 : optionalExpression12;
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f50029a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f50029a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f50029a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f50029a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f50029a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f50029a.z1());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivVideoJsonParser.f50027r);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f50029a.e9());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f50029a.k9());
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "video_sources", this.f50029a.q9(), DivVideoJsonParser.f50028s);
            TypeHelper<DivVisibility> typeHelper6 = DivVideoJsonParser.f50023n;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = DivVideoJsonParser.f50018i;
            Expression<DivVisibility> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, lVar5, expression8);
            Expression<DivVisibility> expression9 = optionalExpression13 == null ? expression8 : optionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f50029a.w9());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f50029a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f50029a.Y6());
            if (divSize3 == null) {
                divSize3 = DivVideoJsonParser.f50019j;
            }
            return new DivVideo(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, divAspect, expression2, optionalList2, divBorder, optionalList3, optionalExpression5, optionalList4, str, optionalList5, optionalList6, optionalList7, divFocus, optionalList8, divSize2, str2, divLayoutProvider, divEdgeInsets, expression3, divEdgeInsets2, optionalList9, jSONObject2, expression4, optionalExpression8, expression5, optionalList10, optionalExpression10, optionalExpression11, expression7, optionalList11, optionalList12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList13, optionalList14, optionalList15, list, expression9, divVisibilityAction, optionalList16, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivVideo divVideo) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divVideo.q(), this.f50029a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divVideo.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divVideo.n(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divVideo.o());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divVideo.y(), this.f50029a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divVideo.f49989f, this.f50029a.C1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autostart", divVideo.f49990g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f54950g, divVideo.getBackground(), this.f50029a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divVideo.z(), this.f50029a.L1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "buffering_actions", divVideo.f49993j, this.f50029a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divVideo.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divVideo.k(), this.f50029a.P2());
            JsonPropertyParser.write(parsingContext, jSONObject, "elapsed_time_variable", divVideo.f49996m);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divVideo.f49997n, this.f50029a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divVideo.getExtensions(), this.f50029a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "fatal_actions", divVideo.f49999p, this.f50029a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divVideo.p(), this.f50029a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divVideo.w(), this.f50029a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divVideo.getHeight(), this.f50029a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divVideo.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divVideo.t(), this.f50029a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divVideo.d(), this.f50029a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "muted", divVideo.f50006w);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divVideo.r(), this.f50029a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pause_actions", divVideo.f50008y, this.f50029a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "player_settings_payload", divVideo.f50009z);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divVideo.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divVideo.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "repeatable", divVideo.C);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "resume_actions", divVideo.D, this.f50029a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divVideo.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divVideo.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divVideo.G, DivVideoScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divVideo.s(), this.f50029a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divVideo.h(), this.f50029a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divVideo.l(), this.f50029a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divVideo.j(), this.f50029a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divVideo.x(), this.f50029a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divVideo.i(), this.f50029a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divVideo.m(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divVideo.u(), this.f50029a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divVideo.c(), this.f50029a.k9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "video_sources", divVideo.Q, this.f50029a.q9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divVideo.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divVideo.v(), this.f50029a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divVideo.a(), this.f50029a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divVideo.getWidth(), this.f50029a.Y6());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50029a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivVideoJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50030a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoTemplate deserialize(ParsingContext parsingContext, DivVideoTemplate divVideoTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50061a : null, this.f50030a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivVideoJsonParser.f50020k, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50062b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivVideoJsonParser.f50021l, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50063c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50064d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivVideoJsonParser.f50024o);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50065e : null, this.f50030a.u1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50066f : null, this.f50030a.D1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divVideoTemplate != null ? divVideoTemplate.f50067g : null;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autostart", typeHelper, allowPropertyOverride, field, lVar);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f54950g, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50068h : null, this.f50030a.G1());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50069i : null, this.f50030a.M1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "buffering_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50070j : null, this.f50030a.v0());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divVideoTemplate != null ? divVideoTemplate.f50071k : null;
            bk.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, lVar2, DivVideoJsonParser.f50025p);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50072l : null, this.f50030a.Q2());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "elapsed_time_variable", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50073m : null);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50074n : null, this.f50030a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50075o : null, this.f50030a.c3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "fatal_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50076p : null, this.f50030a.v0());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50077q : null, this.f50030a.A3());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50078r : null, this.f50030a.J3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50079s : null, this.f50030a.Z6());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50080t : null);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50081u : null, this.f50030a.Q4());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50082v : null, this.f50030a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "muted", typeHelper, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50083w : null, lVar);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50084x : null, this.f50030a.Z2());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "pause_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50085y : null, this.f50030a.v0());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "player_settings_payload", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.f50086z : null);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.A : null, lVar);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper3, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.B : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "repeatable", typeHelper, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.C : null, lVar);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "resume_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.D : null, this.f50030a.v0());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.E : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.F : null, lVar2, DivVideoJsonParser.f50026q);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivVideoJsonParser.f50022m, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.G : null, DivVideoScale.FROM_STRING);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.H : null, this.f50030a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.I : null, this.f50030a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.J : null, this.f50030a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.K : null, this.f50030a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.L : null, this.f50030a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.M : null, this.f50030a.A1());
            Field<List<DivTransitionTrigger>> field3 = divVideoTemplate != null ? divVideoTemplate.N : null;
            bk.l<String, DivTransitionTrigger> lVar3 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivVideoJsonParser.f50027r;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, lVar3, listValidator);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.O : null, this.f50030a.f9());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.P : null, this.f50030a.l9());
            Field<List<DivVideoSourceTemplate>> field4 = divVideoTemplate != null ? divVideoTemplate.Q : null;
            mj.g<yb> gVarR9 = this.f50030a.r9();
            ListValidator<DivVideoSource> listValidator2 = DivVideoJsonParser.f50028s;
            ck.p.h(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivVideoTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalField2, optionalFieldWithExpression4, optionalListField2, optionalField3, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField4, optionalListField5, optionalListField6, optionalListField7, optionalField5, optionalListField8, optionalField6, optionalField7, optionalField8, optionalField9, optionalFieldWithExpression6, optionalField10, optionalListField9, optionalField11, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField10, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField11, optionalListField12, optionalField12, optionalField13, optionalField14, optionalField15, optionalListField13, optionalListField14, optionalListField15, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "video_sources", allowPropertyOverride, field4, gVarR9, listValidator2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivVideoJsonParser.f50023n, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.R : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.S : null, this.f50030a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.T : null, this.f50030a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.U : null, this.f50030a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivVideoTemplate divVideoTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divVideoTemplate.f50061a, this.f50030a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divVideoTemplate.f50062b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divVideoTemplate.f50063c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divVideoTemplate.f50064d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divVideoTemplate.f50065e, this.f50030a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divVideoTemplate.f50066f, this.f50030a.D1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autostart", divVideoTemplate.f50067g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f54950g, divVideoTemplate.f50068h, this.f50030a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divVideoTemplate.f50069i, this.f50030a.M1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "buffering_actions", divVideoTemplate.f50070j, this.f50030a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divVideoTemplate.f50071k);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divVideoTemplate.f50072l, this.f50030a.Q2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "elapsed_time_variable", divVideoTemplate.f50073m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divVideoTemplate.f50074n, this.f50030a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divVideoTemplate.f50075o, this.f50030a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "fatal_actions", divVideoTemplate.f50076p, this.f50030a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divVideoTemplate.f50077q, this.f50030a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divVideoTemplate.f50078r, this.f50030a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divVideoTemplate.f50079s, this.f50030a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divVideoTemplate.f50080t);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divVideoTemplate.f50081u, this.f50030a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divVideoTemplate.f50082v, this.f50030a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "muted", divVideoTemplate.f50083w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divVideoTemplate.f50084x, this.f50030a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pause_actions", divVideoTemplate.f50085y, this.f50030a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "player_settings_payload", divVideoTemplate.f50086z);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divVideoTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divVideoTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "repeatable", divVideoTemplate.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "resume_actions", divVideoTemplate.D, this.f50030a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divVideoTemplate.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divVideoTemplate.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divVideoTemplate.G, DivVideoScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divVideoTemplate.H, this.f50030a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divVideoTemplate.I, this.f50030a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divVideoTemplate.J, this.f50030a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divVideoTemplate.K, this.f50030a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divVideoTemplate.L, this.f50030a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divVideoTemplate.M, this.f50030a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divVideoTemplate.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divVideoTemplate.O, this.f50030a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divVideoTemplate.P, this.f50030a.l9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "video_sources", divVideoTemplate.Q, this.f50030a.r9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divVideoTemplate.R, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divVideoTemplate.S, this.f50030a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divVideoTemplate.T, this.f50030a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divVideoTemplate.U, this.f50030a.Z6());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50030a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivVideoJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivVideoTemplate, DivVideo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50031a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideo resolve(ParsingContext parsingContext, DivVideoTemplate divVideoTemplate, JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50061a, jSONObject, "accessibility", this.f50031a.J(), this.f50031a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.f50062b, jSONObject, "alignment_horizontal", DivVideoJsonParser.f50020k, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.f50063c, jSONObject, "alignment_vertical", DivVideoJsonParser.f50021l, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divVideoTemplate.f50064d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            bk.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivVideoJsonParser.f50024o;
            Expression<Double> expression = DivVideoJsonParser.f50011b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50065e, jSONObject, "animators", this.f50031a.v1(), this.f50031a.t1());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50066f, jSONObject, "aspect", this.f50031a.E1(), this.f50031a.C1());
            Field<Expression<Boolean>> field2 = divVideoTemplate.f50067g;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivVideoJsonParser.f50012c;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "autostart", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression4 != null) {
                expression2 = expressionResolveOptionalExpression4;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50068h, jSONObject, A2.f54950g, this.f50031a.H1(), this.f50031a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50069i, jSONObject, "border", this.f50031a.N1(), this.f50031a.L1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50070j, jSONObject, "buffering_actions", this.f50031a.w0(), this.f50031a.u0());
            Field<Expression<Long>> field3 = divVideoTemplate.f50071k;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            bk.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper3, lVar3, DivVideoJsonParser.f50025p);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50072l, jSONObject, "disappear_actions", this.f50031a.R2(), this.f50031a.P2());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50073m, jSONObject, "elapsed_time_variable");
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50074n, jSONObject, "end_actions", this.f50031a.w0(), this.f50031a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50075o, jSONObject, "extensions", this.f50031a.d3(), this.f50031a.b3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50076p, jSONObject, "fatal_actions", this.f50031a.w0(), this.f50031a.u0());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50077q, jSONObject, "focus", this.f50031a.B3(), this.f50031a.z3());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50078r, jSONObject, "functions", this.f50031a.K3(), this.f50031a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50079s, jSONObject, "height", this.f50031a.a7(), this.f50031a.Y6());
            if (divSize == null) {
                divSize = DivVideoJsonParser.f50013d;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50080t, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50081u, jSONObject, "layout_provider", this.f50031a.R4(), this.f50031a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50082v, jSONObject, "margins", this.f50031a.a3(), this.f50031a.Y2());
            Field<Expression<Boolean>> field4 = divVideoTemplate.f50083w;
            Expression<Boolean> expression3 = DivVideoJsonParser.f50014e;
            Expression<Boolean> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "muted", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression6 != null) {
                expression3 = expressionResolveOptionalExpression6;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50084x, jSONObject, "paddings", this.f50031a.a3(), this.f50031a.Y2());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.f50085y, jSONObject, "pause_actions", this.f50031a.w0(), this.f50031a.u0());
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.f50086z, jSONObject, "player_settings_payload");
            Field<Expression<Boolean>> field5 = divVideoTemplate.A;
            Expression<Boolean> expression4 = DivVideoJsonParser.f50015f;
            Expression<Boolean> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "preload_required", typeHelper2, lVar2, expression4);
            if (expressionResolveOptionalExpression7 != null) {
                expression4 = expressionResolveOptionalExpression7;
            }
            Field<Expression<String>> field6 = divVideoTemplate.B;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "preview", typeHelper4);
            Field<Expression<Boolean>> field7 = divVideoTemplate.C;
            Expression<Boolean> expression5 = DivVideoJsonParser.f50016g;
            Expression<Boolean> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "repeatable", typeHelper2, lVar2, expression5);
            if (expressionResolveOptionalExpression9 != null) {
                expression5 = expressionResolveOptionalExpression9;
            }
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.D, jSONObject, "resume_actions", this.f50031a.w0(), this.f50031a.u0());
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.E, jSONObject, "reuse_id", typeHelper4);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.F, jSONObject, "row_span", typeHelper3, lVar3, DivVideoJsonParser.f50026q);
            Field<Expression<DivVideoScale>> field8 = divVideoTemplate.G;
            TypeHelper<DivVideoScale> typeHelper5 = DivVideoJsonParser.f50022m;
            bk.l<String, DivVideoScale> lVar4 = DivVideoScale.FROM_STRING;
            Expression<DivVideoScale> expression6 = DivVideoJsonParser.f50017h;
            Expression<DivVideoScale> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scale", typeHelper5, lVar4, expression6);
            Expression<DivVideoScale> expression7 = expressionResolveOptionalExpression12 == null ? expression6 : expressionResolveOptionalExpression12;
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.H, jSONObject, "selected_actions", this.f50031a.w0(), this.f50031a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.I, jSONObject, "tooltips", this.f50031a.R8(), this.f50031a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.J, jSONObject, "transform", this.f50031a.d9(), this.f50031a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.K, jSONObject, "transition_change", this.f50031a.W1(), this.f50031a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.L, jSONObject, "transition_in", this.f50031a.B1(), this.f50031a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.M, jSONObject, "transition_out", this.f50031a.B1(), this.f50031a.z1());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.N, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivVideoJsonParser.f50027r);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.O, jSONObject, "variable_triggers", this.f50031a.g9(), this.f50031a.e9());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.P, jSONObject, "variables", this.f50031a.m9(), this.f50031a.k9());
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divVideoTemplate.Q, jSONObject, "video_sources", this.f50031a.s9(), this.f50031a.q9(), DivVideoJsonParser.f50028s);
            Field<Expression<DivVisibility>> field9 = divVideoTemplate.R;
            TypeHelper<DivVisibility> typeHelper6 = DivVideoJsonParser.f50023n;
            bk.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = DivVideoJsonParser.f50018i;
            Expression<DivVisibility> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper6, lVar5, expression8);
            Expression<DivVisibility> expression9 = expressionResolveOptionalExpression13 == null ? expression8 : expressionResolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.S, jSONObject, "visibility_action", this.f50031a.y9(), this.f50031a.w9());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.T, jSONObject, "visibility_actions", this.f50031a.y9(), this.f50031a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.U, jSONObject, "width", this.f50031a.a7(), this.f50031a.Y6());
            if (divSize3 == null) {
                divSize3 = DivVideoJsonParser.f50019j;
            }
            return new DivVideo(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, divAspect, expression2, listResolveOptionalList2, divBorder, listResolveOptionalList3, expressionResolveOptionalExpression5, listResolveOptionalList4, str, listResolveOptionalList5, listResolveOptionalList6, listResolveOptionalList7, divFocus, listResolveOptionalList8, divSize2, str2, divLayoutProvider, divEdgeInsets, expression3, divEdgeInsets2, listResolveOptionalList9, jSONObject2, expression4, expressionResolveOptionalExpression8, expression5, listResolveOptionalList10, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expression7, listResolveOptionalList11, listResolveOptionalList12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList13, listResolveOptionalList14, listResolveOptionalList15, listResolveList, expression9, divVisibilityAction, listResolveOptionalList16, divSize3);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50031a = jsonParserComponent;
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f50011b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f50012c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        int i10 = 7;
        ck.i iVar = null;
        f50013d = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, null, i10, iVar));
        f50014e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50015f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f50016g = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivVideoScale divVideoScale = DivVideoScale.FIT;
        f50017h = Expression.Companion.constant$default(companion, divVideoScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f50018i = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f50019j = new DivSize.c(new DivMatchParentSize(0 == true ? 1 : 0, divSizeUnitValue, 0 == true ? 1 : 0, i10, iVar));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f50020k = companion2.from(nj.n.K(DivAlignmentHorizontal.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f50021l = companion2.from(nj.n.K(DivAlignmentVertical.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f50022m = companion2.from(divVideoScale, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVideoScale);
            }
        });
        f50023n = companion2.from(divVisibility, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f50024o = new ValueValidator() { // from class: oe.tb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivVideoJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f50025p = new ValueValidator() { // from class: oe.ub
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivVideoJsonParser.g(((Long) obj).longValue());
            }
        };
        f50026q = new ValueValidator() { // from class: oe.vb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivVideoJsonParser.h(((Long) obj).longValue());
            }
        };
        f50027r = new ListValidator() { // from class: oe.wb
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivVideoJsonParser.i(list);
            }
        };
        f50028s = new ListValidator() { // from class: oe.xb
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivVideoJsonParser.j(list);
            }
        };
    }

    public static final boolean i(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }

    public static final boolean j(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
