package com.yandex.div2;

import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivInput implements JSONSerializable, Hashable, oe.e2 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final a f47797i0 = new a(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Expression<Double> f47798j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Expression<Autocapitalization> f47799k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Expression<EnterKeyType> f47800l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Expression<Long> f47801m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f47802n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final DivSize.d f47803o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Expression<Integer> f47804p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Expression<Boolean> f47805q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Expression<KeyboardType> f47806r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Expression<Double> f47807s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Expression<Boolean> f47808t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47809u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47810v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Expression<Integer> f47811w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Expression<DivVisibility> f47812x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final DivSize.c f47813y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInput> f47814z0;
    public final String A;
    public final Expression<Boolean> B;
    public final Expression<KeyboardType> C;
    public final DivLayoutProvider D;
    public final Expression<Double> E;
    public final Expression<Long> F;
    public final DivEdgeInsets G;
    public final DivInputMask H;
    public final Expression<Long> I;
    public final Expression<Long> J;
    public final NativeInterface K;
    public final DivEdgeInsets L;
    public final Expression<String> M;
    public final Expression<Long> N;
    public final Expression<Boolean> O;
    public final List<DivAction> P;
    public final Expression<DivAlignmentHorizontal> Q;
    public final Expression<DivAlignmentVertical> R;
    public final Expression<Integer> S;
    public final String T;
    public final List<DivTooltip> U;
    public final DivTransform V;
    public final DivChangeTransition W;
    public final DivAppearanceTransition X;
    public final DivAppearanceTransition Y;
    public final List<DivTransitionTrigger> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f47815a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List<DivInputValidator> f47816a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47817b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List<DivTrigger> f47818b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47819c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final List<DivVariable> f47820c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Double> f47821d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Expression<DivVisibility> f47822d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAnimator> f47823e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final DivVisibilityAction f47824e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Autocapitalization> f47825f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final List<DivVisibilityAction> f47826f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<DivBackground> f47827g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final DivSize f47828g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DivBorder f47829h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Integer f47830h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Long> f47831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivDisappearAction> f47832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DivAction> f47833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<EnterKeyType> f47834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DivExtension> f47835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivInputFilter> f47836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DivFocus f47837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression<String> f47838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Expression<Long> f47839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Expression<DivSizeUnit> f47840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression<JSONObject> f47841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression<DivFontWeight> f47842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<Long> f47843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<DivFunction> f47844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DivSize f47845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression<Integer> f47846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression<Integer> f47847y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression<String> f47848z;

    /* JADX INFO: compiled from: DivInput.kt */
    public enum Autocapitalization {
        AUTO("auto"),
        NONE("none"),
        WORDS("words"),
        SENTENCES("sentences"),
        ALL_CHARACTERS("all_characters");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Autocapitalization, String> TO_STRING = new bk.l<Autocapitalization, String>() { // from class: com.yandex.div2.DivInput$Autocapitalization$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivInput.Autocapitalization autocapitalization) {
                return DivInput.Autocapitalization.Converter.b(autocapitalization);
            }
        };
        public static final bk.l<String, Autocapitalization> FROM_STRING = new bk.l<String, Autocapitalization>() { // from class: com.yandex.div2.DivInput$Autocapitalization$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivInput.Autocapitalization invoke(String str) {
                return DivInput.Autocapitalization.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Autocapitalization a(String str) {
                Autocapitalization autocapitalization = Autocapitalization.AUTO;
                if (ck.p.e(str, autocapitalization.value)) {
                    return autocapitalization;
                }
                Autocapitalization autocapitalization2 = Autocapitalization.NONE;
                if (ck.p.e(str, autocapitalization2.value)) {
                    return autocapitalization2;
                }
                Autocapitalization autocapitalization3 = Autocapitalization.WORDS;
                if (ck.p.e(str, autocapitalization3.value)) {
                    return autocapitalization3;
                }
                Autocapitalization autocapitalization4 = Autocapitalization.SENTENCES;
                if (ck.p.e(str, autocapitalization4.value)) {
                    return autocapitalization4;
                }
                Autocapitalization autocapitalization5 = Autocapitalization.ALL_CHARACTERS;
                if (ck.p.e(str, autocapitalization5.value)) {
                    return autocapitalization5;
                }
                return null;
            }

            public final String b(Autocapitalization autocapitalization) {
                return autocapitalization.value;
            }
        }

        Autocapitalization(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public enum EnterKeyType {
        DEFAULT("default"),
        GO("go"),
        SEARCH(AppLovinEventTypes.USER_EXECUTED_SEARCH),
        SEND("send"),
        DONE("done");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<EnterKeyType, String> TO_STRING = new bk.l<EnterKeyType, String>() { // from class: com.yandex.div2.DivInput$EnterKeyType$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivInput.EnterKeyType enterKeyType) {
                return DivInput.EnterKeyType.Converter.b(enterKeyType);
            }
        };
        public static final bk.l<String, EnterKeyType> FROM_STRING = new bk.l<String, EnterKeyType>() { // from class: com.yandex.div2.DivInput$EnterKeyType$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivInput.EnterKeyType invoke(String str) {
                return DivInput.EnterKeyType.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final EnterKeyType a(String str) {
                EnterKeyType enterKeyType = EnterKeyType.DEFAULT;
                if (ck.p.e(str, enterKeyType.value)) {
                    return enterKeyType;
                }
                EnterKeyType enterKeyType2 = EnterKeyType.GO;
                if (ck.p.e(str, enterKeyType2.value)) {
                    return enterKeyType2;
                }
                EnterKeyType enterKeyType3 = EnterKeyType.SEARCH;
                if (ck.p.e(str, enterKeyType3.value)) {
                    return enterKeyType3;
                }
                EnterKeyType enterKeyType4 = EnterKeyType.SEND;
                if (ck.p.e(str, enterKeyType4.value)) {
                    return enterKeyType4;
                }
                EnterKeyType enterKeyType5 = EnterKeyType.DONE;
                if (ck.p.e(str, enterKeyType5.value)) {
                    return enterKeyType5;
                }
                return null;
            }

            public final String b(EnterKeyType enterKeyType) {
                return enterKeyType.value;
            }
        }

        EnterKeyType(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public enum KeyboardType {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL("email"),
        URI(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI),
        PASSWORD("password");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<KeyboardType, String> TO_STRING = new bk.l<KeyboardType, String>() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivInput.KeyboardType keyboardType) {
                return DivInput.KeyboardType.Converter.b(keyboardType);
            }
        };
        public static final bk.l<String, KeyboardType> FROM_STRING = new bk.l<String, KeyboardType>() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivInput.KeyboardType invoke(String str) {
                return DivInput.KeyboardType.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final KeyboardType a(String str) {
                KeyboardType keyboardType = KeyboardType.SINGLE_LINE_TEXT;
                if (ck.p.e(str, keyboardType.value)) {
                    return keyboardType;
                }
                KeyboardType keyboardType2 = KeyboardType.MULTI_LINE_TEXT;
                if (ck.p.e(str, keyboardType2.value)) {
                    return keyboardType2;
                }
                KeyboardType keyboardType3 = KeyboardType.PHONE;
                if (ck.p.e(str, keyboardType3.value)) {
                    return keyboardType3;
                }
                KeyboardType keyboardType4 = KeyboardType.NUMBER;
                if (ck.p.e(str, keyboardType4.value)) {
                    return keyboardType4;
                }
                KeyboardType keyboardType5 = KeyboardType.EMAIL;
                if (ck.p.e(str, keyboardType5.value)) {
                    return keyboardType5;
                }
                KeyboardType keyboardType6 = KeyboardType.URI;
                if (ck.p.e(str, keyboardType6.value)) {
                    return keyboardType6;
                }
                KeyboardType keyboardType7 = KeyboardType.PASSWORD;
                if (ck.p.e(str, keyboardType7.value)) {
                    return keyboardType7;
                }
                return null;
            }

            public final String b(KeyboardType keyboardType) {
                return keyboardType.value;
            }
        }

        KeyboardType(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public static final class NativeInterface implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f47852c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, NativeInterface> f47853d = new bk.p<ParsingEnvironment, JSONObject, NativeInterface>() { // from class: com.yandex.div2.DivInput$NativeInterface$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInput.NativeInterface mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivInput.NativeInterface.f47852c.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<Integer> f47854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f47855b;

        public final boolean a(NativeInterface nativeInterface, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return nativeInterface != null && this.f47854a.evaluate(expressionResolver).intValue() == nativeInterface.f47854a.evaluate(expressionResolver2).intValue();
        }

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final NativeInterface a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().y4().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f47855b;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(NativeInterface.class).hashCode() + this.f47854a.hashCode();
            this.f47855b = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        public NativeInterface(Expression<Integer> expression) {
            this.f47854a = expression;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().y4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivInput(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, Expression<Autocapitalization> expression4, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression5, List<DivDisappearAction> list3, List<DivAction> list4, Expression<EnterKeyType> expression6, List<DivExtension> list5, List<? extends DivInputFilter> list6, DivFocus divFocus, Expression<String> expression7, Expression<Long> expression8, Expression<DivSizeUnit> expression9, Expression<JSONObject> expression10, Expression<DivFontWeight> expression11, Expression<Long> expression12, List<DivFunction> list7, DivSize divSize, Expression<Integer> expression13, Expression<Integer> expression14, Expression<String> expression15, String str, Expression<Boolean> expression16, Expression<KeyboardType> expression17, DivLayoutProvider divLayoutProvider, Expression<Double> expression18, Expression<Long> expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression<Long> expression20, Expression<Long> expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression<String> expression22, Expression<Long> expression23, Expression<Boolean> expression24, List<DivAction> list8, Expression<DivAlignmentHorizontal> expression25, Expression<DivAlignmentVertical> expression26, Expression<Integer> expression27, String str2, List<DivTooltip> list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list10, List<? extends DivInputValidator> list11, List<DivTrigger> list12, List<? extends DivVariable> list13, Expression<DivVisibility> expression28, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list14, DivSize divSize2) {
        this.f47815a = divAccessibility;
        this.f47817b = expression;
        this.f47819c = expression2;
        this.f47821d = expression3;
        this.f47823e = list;
        this.f47825f = expression4;
        this.f47827g = list2;
        this.f47829h = divBorder;
        this.f47831i = expression5;
        this.f47832j = list3;
        this.f47833k = list4;
        this.f47834l = expression6;
        this.f47835m = list5;
        this.f47836n = list6;
        this.f47837o = divFocus;
        this.f47838p = expression7;
        this.f47839q = expression8;
        this.f47840r = expression9;
        this.f47841s = expression10;
        this.f47842t = expression11;
        this.f47843u = expression12;
        this.f47844v = list7;
        this.f47845w = divSize;
        this.f47846x = expression13;
        this.f47847y = expression14;
        this.f47848z = expression15;
        this.A = str;
        this.B = expression16;
        this.C = expression17;
        this.D = divLayoutProvider;
        this.E = expression18;
        this.F = expression19;
        this.G = divEdgeInsets;
        this.H = divInputMask;
        this.I = expression20;
        this.J = expression21;
        this.K = nativeInterface;
        this.L = divEdgeInsets2;
        this.M = expression22;
        this.N = expression23;
        this.O = expression24;
        this.P = list8;
        this.Q = expression25;
        this.R = expression26;
        this.S = expression27;
        this.T = str2;
        this.U = list9;
        this.V = divTransform;
        this.W = divChangeTransition;
        this.X = divAppearanceTransition;
        this.Y = divAppearanceTransition2;
        this.Z = list10;
        this.f47816a0 = list11;
        this.f47818b0 = list12;
        this.f47820c0 = list13;
        this.f47822d0 = expression28;
        this.f47824e0 = divVisibilityAction;
        this.f47826f0 = list14;
        this.f47828g0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivInput B(DivInput divInput, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, DivBorder divBorder, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, DivSize divSize, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, DivLayoutProvider divLayoutProvider, Expression expression18, Expression expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression expression20, Expression expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, List list13, Expression expression28, DivVisibilityAction divVisibilityAction, List list14, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divInput.q() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divInput.g() : expression;
        Expression expressionN = (i10 & 4) != 0 ? divInput.n() : expression2;
        Expression expressionO = (i10 & 8) != 0 ? divInput.o() : expression3;
        List listY = (i10 & 16) != 0 ? divInput.y() : list;
        Expression expression29 = (i10 & 32) != 0 ? divInput.f47825f : expression4;
        List background = (i10 & 64) != 0 ? divInput.getBackground() : list2;
        DivBorder divBorderZ = (i10 & 128) != 0 ? divInput.z() : divBorder;
        Expression expressionB = (i10 & 256) != 0 ? divInput.b() : expression5;
        List listK = (i10 & 512) != 0 ? divInput.k() : list3;
        List list15 = (i10 & 1024) != 0 ? divInput.f47833k : list4;
        Expression expression30 = (i10 & 2048) != 0 ? divInput.f47834l : expression6;
        List extensions = (i10 & 4096) != 0 ? divInput.getExtensions() : list5;
        List list16 = (i10 & 8192) != 0 ? divInput.f47836n : list6;
        DivFocus divFocusP = (i10 & 16384) != 0 ? divInput.p() : divFocus;
        Expression expression31 = (i10 & 32768) != 0 ? divInput.f47838p : expression7;
        Expression expression32 = (i10 & 65536) != 0 ? divInput.f47839q : expression8;
        Expression expression33 = (i10 & 131072) != 0 ? divInput.f47840r : expression9;
        Expression expression34 = (i10 & 262144) != 0 ? divInput.f47841s : expression10;
        Expression expression35 = (i10 & 524288) != 0 ? divInput.f47842t : expression11;
        Expression expression36 = (i10 & 1048576) != 0 ? divInput.f47843u : expression12;
        List listW = (i10 & 2097152) != 0 ? divInput.w() : list7;
        DivSize height = (i10 & 4194304) != 0 ? divInput.getHeight() : divSize;
        Expression expression37 = expression36;
        Expression expression38 = (i10 & 8388608) != 0 ? divInput.f47846x : expression13;
        Expression expression39 = (i10 & 16777216) != 0 ? divInput.f47847y : expression14;
        Expression expression40 = (i10 & 33554432) != 0 ? divInput.f47848z : expression15;
        String id2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divInput.getId() : str;
        Expression expression41 = expression40;
        Expression expression42 = (i10 & 134217728) != 0 ? divInput.B : expression16;
        Expression expression43 = (i10 & 268435456) != 0 ? divInput.C : expression17;
        DivLayoutProvider divLayoutProviderT = (i10 & 536870912) != 0 ? divInput.t() : divLayoutProvider;
        Expression expression44 = expression43;
        Expression expression45 = (i10 & 1073741824) != 0 ? divInput.E : expression18;
        Expression expression46 = (i10 & Integer.MIN_VALUE) != 0 ? divInput.F : expression19;
        DivEdgeInsets divEdgeInsetsD = (i11 & 1) != 0 ? divInput.d() : divEdgeInsets;
        Expression expression47 = expression46;
        DivInputMask divInputMask2 = (i11 & 2) != 0 ? divInput.H : divInputMask;
        Expression expression48 = (i11 & 4) != 0 ? divInput.I : expression20;
        Expression expression49 = (i11 & 8) != 0 ? divInput.J : expression21;
        NativeInterface nativeInterface2 = (i11 & 16) != 0 ? divInput.K : nativeInterface;
        return divInput.A(divAccessibilityQ, expressionG, expressionN, expressionO, listY, expression29, background, divBorderZ, expressionB, listK, list15, expression30, extensions, list16, divFocusP, expression31, expression32, expression33, expression34, expression35, expression37, listW, height, expression38, expression39, expression41, id2, expression42, expression44, divLayoutProviderT, expression45, expression47, divEdgeInsetsD, divInputMask2, expression48, expression49, nativeInterface2, (i11 & 32) != 0 ? divInput.r() : divEdgeInsets2, (i11 & 64) != 0 ? divInput.f() : expression22, (i11 & 128) != 0 ? divInput.e() : expression23, (i11 & 256) != 0 ? divInput.O : expression24, (i11 & 512) != 0 ? divInput.s() : list8, (i11 & 1024) != 0 ? divInput.Q : expression25, (i11 & 2048) != 0 ? divInput.R : expression26, (i11 & 4096) != 0 ? divInput.S : expression27, (i11 & 8192) != 0 ? divInput.T : str2, (i11 & 16384) != 0 ? divInput.h() : list9, (i11 & 32768) != 0 ? divInput.l() : divTransform, (i11 & 65536) != 0 ? divInput.j() : divChangeTransition, (i11 & 131072) != 0 ? divInput.x() : divAppearanceTransition, (i11 & 262144) != 0 ? divInput.i() : divAppearanceTransition2, (i11 & 524288) != 0 ? divInput.m() : list10, (i11 & 1048576) != 0 ? divInput.f47816a0 : list11, (i11 & 2097152) != 0 ? divInput.u() : list12, (i11 & 4194304) != 0 ? divInput.c() : list13, (i11 & 8388608) != 0 ? divInput.getVisibility() : expression28, (i11 & 16777216) != 0 ? divInput.v() : divVisibilityAction, (i11 & 33554432) != 0 ? divInput.a() : list14, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divInput.getWidth() : divSize2);
    }

    public final DivInput A(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list, Expression<Autocapitalization> expression4, List<? extends DivBackground> list2, DivBorder divBorder, Expression<Long> expression5, List<DivDisappearAction> list3, List<DivAction> list4, Expression<EnterKeyType> expression6, List<DivExtension> list5, List<? extends DivInputFilter> list6, DivFocus divFocus, Expression<String> expression7, Expression<Long> expression8, Expression<DivSizeUnit> expression9, Expression<JSONObject> expression10, Expression<DivFontWeight> expression11, Expression<Long> expression12, List<DivFunction> list7, DivSize divSize, Expression<Integer> expression13, Expression<Integer> expression14, Expression<String> expression15, String str, Expression<Boolean> expression16, Expression<KeyboardType> expression17, DivLayoutProvider divLayoutProvider, Expression<Double> expression18, Expression<Long> expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression<Long> expression20, Expression<Long> expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression<String> expression22, Expression<Long> expression23, Expression<Boolean> expression24, List<DivAction> list8, Expression<DivAlignmentHorizontal> expression25, Expression<DivAlignmentVertical> expression26, Expression<Integer> expression27, String str2, List<DivTooltip> list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list10, List<? extends DivInputValidator> list11, List<DivTrigger> list12, List<? extends DivVariable> list13, Expression<DivVisibility> expression28, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list14, DivSize divSize2) {
        return new DivInput(divAccessibility, expression, expression2, expression3, list, expression4, list2, divBorder, expression5, list3, list4, expression6, list5, list6, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, list7, divSize, expression13, expression14, expression15, str, expression16, expression17, divLayoutProvider, expression18, expression19, divEdgeInsets, divInputMask, expression20, expression21, nativeInterface, divEdgeInsets2, expression22, expression23, expression24, list8, expression25, expression26, expression27, str2, list9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list10, list11, list12, list13, expression28, divVisibilityAction, list14, divSize2);
    }

    public final boolean C(DivInput divInput, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean z10;
        boolean z11;
        boolean zA2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zA3;
        boolean z16;
        boolean zA4;
        boolean zA5;
        boolean zA6;
        boolean zA7;
        boolean zA8;
        boolean z17;
        boolean z18;
        boolean zA9;
        boolean zA10;
        boolean zA11;
        boolean zA12;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean zG;
        boolean z23;
        if (divInput == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divInput.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divInput.q() == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divInput.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divInput.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divInput.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divInput.y();
            if (listY2 == null) {
                return false;
            }
            if (listY.size() == listY2.size()) {
                Iterator<T> it = listY.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAnimator) next).a(listY2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divInput.y() == null;
        }
        if (!z10 || this.f47825f.evaluate(expressionResolver) != divInput.f47825f.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divInput.getBackground();
            if (background2 == null) {
                return false;
            }
            if (background.size() == background2.size()) {
                Iterator<T> it2 = background.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivBackground) next2).a(background2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divInput.getBackground() == null;
        }
        if (!z11) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA2 = divBorderZ.a(divInput.z(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divInput.z() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divInput.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divInput.k();
            if (listK2 == null) {
                return false;
            }
            if (listK.size() == listK2.size()) {
                Iterator<T> it3 = listK.iterator();
                int i14 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            nj.s.u();
                        }
                        if (((DivDisappearAction) next3).g(listK2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                }
            }
        } else {
            z12 = divInput.k() == null;
        }
        if (!z12) {
            return false;
        }
        List<DivAction> list = this.f47833k;
        if (list != null) {
            List<DivAction> list2 = divInput.f47833k;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it4 = list.iterator();
                int i16 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next4).a(list2.get(i16), expressionResolver, expressionResolver2)) {
                            i16 = i17;
                        }
                    }
                }
            }
        } else {
            z13 = divInput.f47833k == null;
        }
        if (!z13 || this.f47834l.evaluate(expressionResolver) != divInput.f47834l.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divInput.getExtensions();
            if (extensions2 == null) {
                return false;
            }
            if (extensions.size() == extensions2.size()) {
                Iterator<T> it5 = extensions.iterator();
                int i18 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        Object next5 = it5.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            nj.s.u();
                        }
                        if (((DivExtension) next5).a(extensions2.get(i18), expressionResolver, expressionResolver2)) {
                            i18 = i19;
                        }
                    }
                }
            }
        } else {
            z14 = divInput.getExtensions() == null;
        }
        if (!z14) {
            return false;
        }
        List<DivInputFilter> list3 = this.f47836n;
        if (list3 != null) {
            List<DivInputFilter> list4 = divInput.f47836n;
            if (list4 == null) {
                return false;
            }
            if (list3.size() == list4.size()) {
                Iterator<T> it6 = list3.iterator();
                int i20 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            nj.s.u();
                        }
                        if (((DivInputFilter) next6).a(list4.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                }
            }
        } else {
            z15 = divInput.f47836n == null;
        }
        if (!z15) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA3 = divFocusP.a(divInput.p(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divInput.p() == null;
        }
        if (!zA3) {
            return false;
        }
        Expression<String> expression = this.f47838p;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divInput.f47838p;
        if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f47839q.evaluate(expressionResolver).longValue() != divInput.f47839q.evaluate(expressionResolver2).longValue() || this.f47840r.evaluate(expressionResolver) != divInput.f47840r.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression3 = this.f47841s;
        JSONObject jSONObjectEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression4 = divInput.f47841s;
        if (!ck.p.e(jSONObjectEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression5 = this.f47842t;
        DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression6 = divInput.f47842t;
        if (divFontWeightEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.f47843u;
        Long lEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divInput.f47843u;
        if (!ck.p.e(lEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divInput.w();
            if (listW2 == null) {
                return false;
            }
            if (listW.size() == listW2.size()) {
                Iterator<T> it7 = listW.iterator();
                int i22 = 0;
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            nj.s.u();
                        }
                        if (((DivFunction) next7).a(listW2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divInput.w() == null;
        }
        if (!z16 || !getHeight().a(divInput.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression<Integer> expression9 = this.f47846x;
        Integer numEvaluate = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<Integer> expression10 = divInput.f47846x;
        if (!ck.p.e(numEvaluate, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || this.f47847y.evaluate(expressionResolver).intValue() != divInput.f47847y.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        Expression<String> expression11 = this.f47848z;
        String strEvaluate2 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<String> expression12 = divInput.f47848z;
        if (!ck.p.e(strEvaluate2, expression12 != null ? expression12.evaluate(expressionResolver2) : null) || !ck.p.e(getId(), divInput.getId()) || this.B.evaluate(expressionResolver).booleanValue() != divInput.B.evaluate(expressionResolver2).booleanValue() || this.C.evaluate(expressionResolver) != divInput.C.evaluate(expressionResolver2)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA4 = divLayoutProviderT.a(divInput.t(), expressionResolver, expressionResolver2);
        } else {
            zA4 = divInput.t() == null;
        }
        if (!zA4) {
            return false;
        }
        if (!(this.E.evaluate(expressionResolver).doubleValue() == divInput.E.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression13 = this.F;
        Long lEvaluate3 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = divInput.F;
        if (!ck.p.e(lEvaluate3, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA5 = divEdgeInsetsD.a(divInput.d(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divInput.d() == null;
        }
        if (!zA5) {
            return false;
        }
        DivInputMask divInputMask = this.H;
        if (divInputMask != null) {
            zA6 = divInputMask.a(divInput.H, expressionResolver, expressionResolver2);
        } else {
            zA6 = divInput.H == null;
        }
        if (!zA6) {
            return false;
        }
        Expression<Long> expression15 = this.I;
        Long lEvaluate4 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
        Expression<Long> expression16 = divInput.I;
        if (!ck.p.e(lEvaluate4, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression17 = this.J;
        Long lEvaluate5 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
        Expression<Long> expression18 = divInput.J;
        if (!ck.p.e(lEvaluate5, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        NativeInterface nativeInterface = this.K;
        if (nativeInterface != null) {
            zA7 = nativeInterface.a(divInput.K, expressionResolver, expressionResolver2);
        } else {
            zA7 = divInput.K == null;
        }
        if (!zA7) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA8 = divEdgeInsetsR.a(divInput.r(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divInput.r() == null;
        }
        if (!zA8) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate3 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divInput.f();
        if (!ck.p.e(strEvaluate3, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate6 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divInput.e();
        if (!ck.p.e(lEvaluate6, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.O.evaluate(expressionResolver).booleanValue() != divInput.O.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divInput.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it8 = listS.iterator();
                int i24 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next8).a(listS2.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                }
            }
        } else {
            z17 = divInput.s() == null;
        }
        if (!z17 || this.Q.evaluate(expressionResolver) != divInput.Q.evaluate(expressionResolver2) || this.R.evaluate(expressionResolver) != divInput.R.evaluate(expressionResolver2) || this.S.evaluate(expressionResolver).intValue() != divInput.S.evaluate(expressionResolver2).intValue() || !ck.p.e(this.T, divInput.T)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divInput.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it9 = listH.iterator();
                int i26 = 0;
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next9).a(listH2.get(i26), expressionResolver, expressionResolver2)) {
                            i26 = i27;
                        }
                    }
                }
            }
        } else {
            z18 = divInput.h() == null;
        }
        if (!z18) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA9 = divTransformL.a(divInput.l(), expressionResolver, expressionResolver2);
        } else {
            zA9 = divInput.l() == null;
        }
        if (!zA9) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA10 = divChangeTransitionJ.a(divInput.j(), expressionResolver, expressionResolver2);
        } else {
            zA10 = divInput.j() == null;
        }
        if (!zA10) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA11 = divAppearanceTransitionX.a(divInput.x(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divInput.x() == null;
        }
        if (!zA11) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA12 = divAppearanceTransitionI.a(divInput.i(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divInput.i() == null;
        }
        if (!zA12) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divInput.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it10 = listM.iterator();
                int i28 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next10) == listM2.get(i28)) {
                            i28 = i29;
                        }
                    }
                }
            }
        } else {
            z19 = divInput.m() == null;
        }
        if (!z19) {
            return false;
        }
        List<DivInputValidator> list5 = this.f47816a0;
        if (list5 != null) {
            List<DivInputValidator> list6 = divInput.f47816a0;
            if (list6 == null) {
                return false;
            }
            if (list5.size() == list6.size()) {
                Iterator<T> it11 = list5.iterator();
                int i30 = 0;
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            nj.s.u();
                        }
                        if (((DivInputValidator) next11).a(list6.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                }
            }
        } else {
            z20 = divInput.f47816a0 == null;
        }
        if (!z20) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divInput.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it12 = listU.iterator();
                int i32 = 0;
                while (true) {
                    if (it12.hasNext()) {
                        Object next12 = it12.next();
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next12).a(listU2.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                }
            }
        } else {
            z21 = divInput.u() == null;
        }
        if (!z21) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divInput.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it13 = listC.iterator();
                int i34 = 0;
                while (true) {
                    if (it13.hasNext()) {
                        Object next13 = it13.next();
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next13).a(listC2.get(i34), expressionResolver, expressionResolver2)) {
                            i34 = i35;
                        }
                    }
                }
            }
        } else {
            z22 = divInput.c() == null;
        }
        if (!z22 || getVisibility().evaluate(expressionResolver) != divInput.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divInput.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divInput.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divInput.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it14 = listA.iterator();
                int i36 = 0;
                while (true) {
                    if (it14.hasNext()) {
                        Object next14 = it14.next();
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next14).g(listA2.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                }
            }
        } else {
            z23 = divInput.a() == null;
        }
        return z23 && getWidth().a(divInput.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInput a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().s4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f47798j0 = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f47799k0 = Expression.Companion.constant$default(companion, Autocapitalization.AUTO, null, 2, null);
        f47800l0 = Expression.Companion.constant$default(companion, EnterKeyType.DEFAULT, null, 2, null);
        f47801m0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f47802n0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f47803o0 = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f47804p0 = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f47805q0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47806r0 = Expression.Companion.constant$default(companion, KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        f47807s0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f47808t0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47809u0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        f47810v0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47811w0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f47812x0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f47813y0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f47814z0 = new bk.p<ParsingEnvironment, JSONObject, DivInput>() { // from class: com.yandex.div2.DivInput$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInput mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivInput.f47797i0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.f47826f0;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f47831i;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.f47820c0;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.G;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.N;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.M;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f47817b;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f47827g;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f47835m;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.f47845w;
    }

    @Override // oe.e2
    public String getId() {
        return this.A;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.f47822d0;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.f47828g0;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.U;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        int iHash10;
        int iHash11;
        int iHash12;
        Integer num = this.f47830h0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivInput.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash13 = 0;
        int iHash14 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash14 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionN = n();
        int iHashCode3 = iHashCode2 + (expressionN != null ? expressionN.hashCode() : 0) + o().hashCode();
        List<DivAnimator> listY = y();
        if (listY != null) {
            Iterator<T> it = listY.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAnimator) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode4 = iHashCode3 + iHash + this.f47825f.hashCode();
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it2 = background.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivBackground) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i10 = iHashCode4 + iHash2;
        DivBorder divBorderZ = z();
        int iHash15 = i10 + (divBorderZ != null ? divBorderZ.hash() : 0);
        Expression<Long> expressionB = b();
        int iHashCode5 = iHash15 + (expressionB != null ? expressionB.hashCode() : 0);
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it3 = listK.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivDisappearAction) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i11 = iHashCode5 + iHash3;
        List<DivAction> list = this.f47833k;
        if (list != null) {
            Iterator<T> it4 = list.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivAction) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int iHashCode6 = i11 + iHash4 + this.f47834l.hashCode();
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it5 = extensions.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivExtension) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i12 = iHashCode6 + iHash5;
        List<DivInputFilter> list2 = this.f47836n;
        if (list2 != null) {
            Iterator<T> it6 = list2.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivInputFilter) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i13 = i12 + iHash6;
        DivFocus divFocusP = p();
        int iHash16 = i13 + (divFocusP != null ? divFocusP.hash() : 0);
        Expression<String> expression = this.f47838p;
        int iHashCode7 = iHash16 + (expression != null ? expression.hashCode() : 0) + this.f47839q.hashCode() + this.f47840r.hashCode();
        Expression<JSONObject> expression2 = this.f47841s;
        int iHashCode8 = iHashCode7 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<DivFontWeight> expression3 = this.f47842t;
        int iHashCode9 = iHashCode8 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.f47843u;
        int iHashCode10 = iHashCode9 + (expression4 != null ? expression4.hashCode() : 0);
        List<DivFunction> listW = w();
        if (listW != null) {
            Iterator<T> it7 = listW.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFunction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHash17 = iHashCode10 + iHash7 + getHeight().hash();
        Expression<Integer> expression5 = this.f47846x;
        int iHashCode11 = iHash17 + (expression5 != null ? expression5.hashCode() : 0) + this.f47847y.hashCode();
        Expression<String> expression6 = this.f47848z;
        int iHashCode12 = iHashCode11 + (expression6 != null ? expression6.hashCode() : 0);
        String id2 = getId();
        int iHashCode13 = iHashCode12 + (id2 != null ? id2.hashCode() : 0) + this.B.hashCode() + this.C.hashCode();
        DivLayoutProvider divLayoutProviderT = t();
        int iHash18 = iHashCode13 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0) + this.E.hashCode();
        Expression<Long> expression7 = this.F;
        int iHashCode14 = iHash18 + (expression7 != null ? expression7.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash19 = iHashCode14 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivInputMask divInputMask = this.H;
        int iHash20 = iHash19 + (divInputMask != null ? divInputMask.hash() : 0);
        Expression<Long> expression8 = this.I;
        int iHashCode15 = iHash20 + (expression8 != null ? expression8.hashCode() : 0);
        Expression<Long> expression9 = this.J;
        int iHashCode16 = iHashCode15 + (expression9 != null ? expression9.hashCode() : 0);
        NativeInterface nativeInterface = this.K;
        int iHash21 = iHashCode16 + (nativeInterface != null ? nativeInterface.hash() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash22 = iHash21 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        Expression<String> expressionF = f();
        int iHashCode17 = iHash22 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode18 = iHashCode17 + (expressionE != null ? expressionE.hashCode() : 0) + this.O.hashCode();
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it8 = listS.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHashCode19 = iHashCode18 + iHash8 + this.Q.hashCode() + this.R.hashCode() + this.S.hashCode() + this.T.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it9 = listH.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivTooltip) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i14 = iHashCode19 + iHash9;
        DivTransform divTransformL = l();
        int iHash23 = i14 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash24 = iHash23 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash25 = iHash24 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash26 = iHash25 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode20 = iHash26 + (listM != null ? listM.hashCode() : 0);
        List<DivInputValidator> list3 = this.f47816a0;
        if (list3 != null) {
            Iterator<T> it10 = list3.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivInputValidator) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i15 = iHashCode20 + iHash10;
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it11 = listU.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivTrigger) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i16 = i15 + iHash11;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it12 = listC.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivVariable) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int iHashCode21 = i16 + iHash12 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash27 = iHashCode21 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it13 = listA.iterator();
            while (it13.hasNext()) {
                iHash13 += ((DivVisibilityAction) it13.next()).hash();
            }
        }
        int iHash28 = iHash27 + iHash13 + getWidth().hash();
        this.f47830h0 = Integer.valueOf(iHash28);
        return iHash28;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.Y;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.W;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f47832j;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.V;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.Z;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f47819c;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f47821d;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f47837o;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f47815a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.L;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.P;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.D;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.f47818b0;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.f47824e0;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.f47844v;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.X;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f47823e;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f47829h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
