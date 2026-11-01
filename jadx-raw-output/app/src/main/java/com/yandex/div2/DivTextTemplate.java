package com.yandex.div2;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivTextTemplate implements JSONSerializable, JsonTemplate<DivText> {
    public static final Expression<DivLineStyle> A0;
    public static final Expression<DivAlignmentHorizontal> B0;
    public static final Expression<DivAlignmentVertical> C0;
    public static final Expression<Integer> D0;
    public static final Expression<Boolean> E0;
    public static final Expression<DivText.Truncate> F0;
    public static final Expression<DivLineStyle> G0;
    public static final Expression<DivVisibility> H0;
    public static final DivSize.c I0;
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextTemplate> J0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a f49707r0 = new a(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final DivAnimation f49708s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Expression<Double> f49709t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Expression<Boolean> f49710u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Expression<Long> f49711v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f49712w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final DivSize.d f49713x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Expression<Double> f49714y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final Expression<Boolean> f49715z0;
    public final Field<List<DivFunctionTemplate>> A;
    public final Field<DivSizeTemplate> B;
    public final Field<List<DivActionTemplate>> C;
    public final Field<List<DivActionTemplate>> D;
    public final Field<String> E;
    public final Field<List<ImageTemplate>> F;
    public final Field<DivLayoutProviderTemplate> G;
    public final Field<Expression<Double>> H;
    public final Field<Expression<Long>> I;
    public final Field<List<DivActionTemplate>> J;
    public final Field<DivEdgeInsetsTemplate> K;
    public final Field<Expression<Long>> L;
    public final Field<Expression<Long>> M;
    public final Field<DivEdgeInsetsTemplate> N;
    public final Field<List<DivActionTemplate>> O;
    public final Field<List<DivActionTemplate>> P;
    public final Field<List<RangeTemplate>> Q;
    public final Field<Expression<String>> R;
    public final Field<Expression<Long>> S;
    public final Field<Expression<Boolean>> T;
    public final Field<List<DivActionTemplate>> U;
    public final Field<Expression<DivLineStyle>> V;
    public final Field<Expression<String>> W;
    public final Field<Expression<DivAlignmentHorizontal>> X;
    public final Field<Expression<DivAlignmentVertical>> Y;
    public final Field<Expression<Integer>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAccessibilityTemplate> f49716a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Field<DivTextGradientTemplate> f49717a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionTemplate> f49718b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Field<DivShadowTemplate> f49719b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f49720c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49721c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49722d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Field<List<DivTooltipTemplate>> f49723d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f49724e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Field<DivTransformTemplate> f49725e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f49726f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Field<DivChangeTransitionTemplate> f49727f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Double>> f49728g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Field<DivAppearanceTransitionTemplate> f49729g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<List<DivAnimatorTemplate>> f49730h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Field<DivAppearanceTransitionTemplate> f49731h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49732i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Field<List<DivTransitionTrigger>> f49733i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<List<DivBackgroundTemplate>> f49734j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Field<Expression<DivText.Truncate>> f49735j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<DivBorderTemplate> f49736k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Field<Expression<DivLineStyle>> f49737k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49738l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Field<List<DivTriggerTemplate>> f49739l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field<Expression<Long>> f49740m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Field<List<DivVariableTemplate>> f49741m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field<List<DivDisappearActionTemplate>> f49742n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Field<Expression<DivVisibility>> f49743n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49744o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Field<DivVisibilityActionTemplate> f49745o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field<EllipsisTemplate> f49746p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Field<List<DivVisibilityActionTemplate>> f49747p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field<List<DivExtensionTemplate>> f49748q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Field<DivSizeTemplate> f49749q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field<DivFocusTemplate> f49750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field<Expression<Integer>> f49751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field<Expression<String>> f49752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field<Expression<String>> f49753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field<Expression<Long>> f49754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f49755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field<Expression<JSONObject>> f49756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field<Expression<DivFontWeight>> f49757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field<Expression<Long>> f49758z;

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class ImageTemplate implements JSONSerializable, JsonTemplate<DivText.Image> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f49765k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Expression<DivTextAlignmentVertical> f49766l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final DivFixedSize f49767m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Expression<DivText.Image.IndexingDirection> f49768n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Expression<Boolean> f49769o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Expression<DivBlendMode> f49770p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final DivFixedSize f49771q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ImageTemplate> f49772r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<AccessibilityTemplate> f49773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<DivTextAlignmentVertical>> f49774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<DivFixedSizeTemplate> f49775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<DivText.Image.IndexingDirection>> f49776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<Expression<Boolean>> f49777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Field<Expression<Long>> f49778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Field<Expression<Integer>> f49779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Field<Expression<DivBlendMode>> f49780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Field<Expression<Uri>> f49781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Field<DivFixedSizeTemplate> f49782j;

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public ImageTemplate(Field<AccessibilityTemplate> field, Field<Expression<DivTextAlignmentVertical>> field2, Field<DivFixedSizeTemplate> field3, Field<Expression<DivText.Image.IndexingDirection>> field4, Field<Expression<Boolean>> field5, Field<Expression<Long>> field6, Field<Expression<Integer>> field7, Field<Expression<DivBlendMode>> field8, Field<Expression<Uri>> field9, Field<DivFixedSizeTemplate> field10) {
            this.f49773a = field;
            this.f49774b = field2;
            this.f49775c = field3;
            this.f49776d = field4;
            this.f49777e = field5;
            this.f49778f = field6;
            this.f49779g = field7;
            this.f49780h = field8;
            this.f49781i = field9;
            this.f49782j = field10;
        }

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class AccessibilityTemplate implements JSONSerializable, JsonTemplate<DivText.Image.Accessibility> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f49783c = new a(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final DivText.Image.Accessibility.Type f49784d = DivText.Image.Accessibility.Type.AUTO;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final bk.p<ParsingEnvironment, JSONObject, AccessibilityTemplate> f49785e = new bk.p<ParsingEnvironment, JSONObject, AccessibilityTemplate>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$AccessibilityTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTextTemplate.ImageTemplate.AccessibilityTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivTextTemplate.ImageTemplate.AccessibilityTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Field<Expression<String>> f49786a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Field<DivText.Image.Accessibility.Type> f49787b;

            /* JADX INFO: compiled from: DivTextTemplate.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }
            }

            public AccessibilityTemplate(Field<Expression<String>> field, Field<DivText.Image.Accessibility.Type> field2) {
                this.f49786a = field;
                this.f49787b = field2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().k8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            public /* synthetic */ AccessibilityTemplate(ParsingEnvironment parsingEnvironment, AccessibilityTemplate accessibilityTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
                this(parsingEnvironment, (i10 & 2) != 0 ? null : accessibilityTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AccessibilityTemplate(ParsingEnvironment parsingEnvironment, AccessibilityTemplate accessibilityTemplate, boolean z10, JSONObject jSONObject) {
                Field.Companion companion = Field.Companion;
                this(companion.nullField(false), companion.nullField(false));
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            f49766l = Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            int i10 = 1;
            f49767m = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f49768n = Expression.Companion.constant$default(companion, DivText.Image.IndexingDirection.NORMAL, null, 2, null);
            f49769o = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            f49770p = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            f49771q = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f49772r = new bk.p<ParsingEnvironment, JSONObject, ImageTemplate>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTextTemplate.ImageTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivTextTemplate.ImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().n8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ ImageTemplate(ParsingEnvironment parsingEnvironment, ImageTemplate imageTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : imageTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ImageTemplate(ParsingEnvironment parsingEnvironment, ImageTemplate imageTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class RangeTemplate implements JSONSerializable, JsonTemplate<DivText.Range> {
        public static final bk.p<ParsingEnvironment, JSONObject, RangeTemplate> A;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f49788w = new a(null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Expression<Double> f49789x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Expression<DivSizeUnit> f49790y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Expression<Long> f49791z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<List<DivActionTemplate>> f49792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<DivTextAlignmentVertical>> f49793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<DivTextRangeBackgroundTemplate> f49794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<Double>> f49795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field<DivTextRangeBorderTemplate> f49796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Field<Expression<Long>> f49797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Field<Expression<String>> f49798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Field<Expression<String>> f49799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Field<Expression<Long>> f49800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Field<Expression<DivSizeUnit>> f49801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Field<Expression<JSONObject>> f49802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Field<Expression<DivFontWeight>> f49803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Field<Expression<Long>> f49804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Field<Expression<Double>> f49805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Field<Expression<Long>> f49806o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Field<DivTextRangeMaskTemplate> f49807p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Field<Expression<Long>> f49808q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Field<Expression<DivLineStyle>> f49809r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Field<Expression<Integer>> f49810s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Field<DivShadowTemplate> f49811t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Field<Expression<Long>> f49812u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Field<Expression<DivLineStyle>> f49813v;

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public RangeTemplate(Field<List<DivActionTemplate>> field, Field<Expression<DivTextAlignmentVertical>> field2, Field<DivTextRangeBackgroundTemplate> field3, Field<Expression<Double>> field4, Field<DivTextRangeBorderTemplate> field5, Field<Expression<Long>> field6, Field<Expression<String>> field7, Field<Expression<String>> field8, Field<Expression<Long>> field9, Field<Expression<DivSizeUnit>> field10, Field<Expression<JSONObject>> field11, Field<Expression<DivFontWeight>> field12, Field<Expression<Long>> field13, Field<Expression<Double>> field14, Field<Expression<Long>> field15, Field<DivTextRangeMaskTemplate> field16, Field<Expression<Long>> field17, Field<Expression<DivLineStyle>> field18, Field<Expression<Integer>> field19, Field<DivShadowTemplate> field20, Field<Expression<Long>> field21, Field<Expression<DivLineStyle>> field22) {
            this.f49792a = field;
            this.f49793b = field2;
            this.f49794c = field3;
            this.f49795d = field4;
            this.f49796e = field5;
            this.f49797f = field6;
            this.f49798g = field7;
            this.f49799h = field8;
            this.f49800i = field9;
            this.f49801j = field10;
            this.f49802k = field11;
            this.f49803l = field12;
            this.f49804m = field13;
            this.f49805n = field14;
            this.f49806o = field15;
            this.f49807p = field16;
            this.f49808q = field17;
            this.f49809r = field18;
            this.f49810s = field19;
            this.f49811t = field20;
            this.f49812u = field21;
            this.f49813v = field22;
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f49789x = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f49790y = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            f49791z = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            A = new bk.p<ParsingEnvironment, JSONObject, RangeTemplate>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivTextTemplate.RangeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return new DivTextTemplate.RangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().z8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : rangeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTextTemplate(Field<DivAccessibilityTemplate> field, Field<DivActionTemplate> field2, Field<DivAnimationTemplate> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<DivAnimatorTemplate>> field8, Field<Expression<Boolean>> field9, Field<List<DivBackgroundTemplate>> field10, Field<DivBorderTemplate> field11, Field<Expression<Boolean>> field12, Field<Expression<Long>> field13, Field<List<DivDisappearActionTemplate>> field14, Field<List<DivActionTemplate>> field15, Field<EllipsisTemplate> field16, Field<List<DivExtensionTemplate>> field17, Field<DivFocusTemplate> field18, Field<Expression<Integer>> field19, Field<Expression<String>> field20, Field<Expression<String>> field21, Field<Expression<Long>> field22, Field<Expression<DivSizeUnit>> field23, Field<Expression<JSONObject>> field24, Field<Expression<DivFontWeight>> field25, Field<Expression<Long>> field26, Field<List<DivFunctionTemplate>> field27, Field<DivSizeTemplate> field28, Field<List<DivActionTemplate>> field29, Field<List<DivActionTemplate>> field30, Field<String> field31, Field<List<ImageTemplate>> field32, Field<DivLayoutProviderTemplate> field33, Field<Expression<Double>> field34, Field<Expression<Long>> field35, Field<List<DivActionTemplate>> field36, Field<DivEdgeInsetsTemplate> field37, Field<Expression<Long>> field38, Field<Expression<Long>> field39, Field<DivEdgeInsetsTemplate> field40, Field<List<DivActionTemplate>> field41, Field<List<DivActionTemplate>> field42, Field<List<RangeTemplate>> field43, Field<Expression<String>> field44, Field<Expression<Long>> field45, Field<Expression<Boolean>> field46, Field<List<DivActionTemplate>> field47, Field<Expression<DivLineStyle>> field48, Field<Expression<String>> field49, Field<Expression<DivAlignmentHorizontal>> field50, Field<Expression<DivAlignmentVertical>> field51, Field<Expression<Integer>> field52, Field<DivTextGradientTemplate> field53, Field<DivShadowTemplate> field54, Field<Expression<Boolean>> field55, Field<List<DivTooltipTemplate>> field56, Field<DivTransformTemplate> field57, Field<DivChangeTransitionTemplate> field58, Field<DivAppearanceTransitionTemplate> field59, Field<DivAppearanceTransitionTemplate> field60, Field<List<DivTransitionTrigger>> field61, Field<Expression<DivText.Truncate>> field62, Field<Expression<DivLineStyle>> field63, Field<List<DivTriggerTemplate>> field64, Field<List<DivVariableTemplate>> field65, Field<Expression<DivVisibility>> field66, Field<DivVisibilityActionTemplate> field67, Field<List<DivVisibilityActionTemplate>> field68, Field<DivSizeTemplate> field69) {
        this.f49716a = field;
        this.f49718b = field2;
        this.f49720c = field3;
        this.f49722d = field4;
        this.f49724e = field5;
        this.f49726f = field6;
        this.f49728g = field7;
        this.f49730h = field8;
        this.f49732i = field9;
        this.f49734j = field10;
        this.f49736k = field11;
        this.f49738l = field12;
        this.f49740m = field13;
        this.f49742n = field14;
        this.f49744o = field15;
        this.f49746p = field16;
        this.f49748q = field17;
        this.f49750r = field18;
        this.f49751s = field19;
        this.f49752t = field20;
        this.f49753u = field21;
        this.f49754v = field22;
        this.f49755w = field23;
        this.f49756x = field24;
        this.f49757y = field25;
        this.f49758z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
        this.V = field48;
        this.W = field49;
        this.X = field50;
        this.Y = field51;
        this.Z = field52;
        this.f49717a0 = field53;
        this.f49719b0 = field54;
        this.f49721c0 = field55;
        this.f49723d0 = field56;
        this.f49725e0 = field57;
        this.f49727f0 = field58;
        this.f49729g0 = field59;
        this.f49731h0 = field60;
        this.f49733i0 = field61;
        this.f49735j0 = field62;
        this.f49737k0 = field63;
        this.f49739l0 = field64;
        this.f49741m0 = field65;
        this.f49743n0 = field66;
        this.f49745o0 = field67;
        this.f49747p0 = field68;
        this.f49749q0 = field69;
    }

    /* JADX INFO: compiled from: DivTextTemplate.kt */
    public static final class EllipsisTemplate implements JSONSerializable, JsonTemplate<DivText.Ellipsis> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f49759e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, EllipsisTemplate> f49760f = new bk.p<ParsingEnvironment, JSONObject, EllipsisTemplate>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextTemplate.EllipsisTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTextTemplate.EllipsisTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<List<DivActionTemplate>> f49761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<List<ImageTemplate>> f49762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<List<RangeTemplate>> f49763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field<Expression<String>> f49764d;

        /* JADX INFO: compiled from: DivTextTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public EllipsisTemplate(Field<List<DivActionTemplate>> field, Field<List<ImageTemplate>> field2, Field<List<RangeTemplate>> field3, Field<Expression<String>> field4) {
            this.f49761a = field;
            this.f49762b = field2;
            this.f49763c = field3;
            this.f49764d = field4;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().e8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ EllipsisTemplate(ParsingEnvironment parsingEnvironment, EllipsisTemplate ellipsisTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : ellipsisTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EllipsisTemplate(ParsingEnvironment parsingEnvironment, EllipsisTemplate ellipsisTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this((Field<List<DivActionTemplate>>) companion.nullField(false), (Field<List<ImageTemplate>>) companion.nullField(false), (Field<List<RangeTemplate>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f49708s0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f49709t0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f49710u0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49711v0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f49712w0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f49713x0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f49714y0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f49715z0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        A0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        B0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        C0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        D0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        E0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        F0 = Expression.Companion.constant$default(companion, DivText.Truncate.END, null, 2, null);
        G0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        H0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        I0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        J0 = new bk.p<ParsingEnvironment, JSONObject, DivTextTemplate>() { // from class: com.yandex.div2.DivTextTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTextTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTextTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTextTemplate(ParsingEnvironment parsingEnvironment, DivTextTemplate divTextTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextTemplate(ParsingEnvironment parsingEnvironment, DivTextTemplate divTextTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
