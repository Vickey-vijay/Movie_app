package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Div.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class Div implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45950c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, Div> f45951d = new bk.p<ParsingEnvironment, JSONObject, Div>() { // from class: com.yandex.div2.Div$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Div mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return Div.f45950c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f45952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f45953b;

    /* JADX INFO: compiled from: Div.kt */
    public static final class b extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivContainer f45954e;

        public b(DivContainer divContainer) {
            super(null);
            this.f45954e = divContainer;
        }

        public final DivContainer c() {
            return this.f45954e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class c extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivCustom f45955e;

        public c(DivCustom divCustom) {
            super(null);
            this.f45955e = divCustom;
        }

        public final DivCustom c() {
            return this.f45955e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class d extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivGallery f45956e;

        public d(DivGallery divGallery) {
            super(null);
            this.f45956e = divGallery;
        }

        public final DivGallery c() {
            return this.f45956e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class e extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivGifImage f45957e;

        public e(DivGifImage divGifImage) {
            super(null);
            this.f45957e = divGifImage;
        }

        public final DivGifImage c() {
            return this.f45957e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class f extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivGrid f45958e;

        public f(DivGrid divGrid) {
            super(null);
            this.f45958e = divGrid;
        }

        public final DivGrid c() {
            return this.f45958e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class g extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivImage f45959e;

        public g(DivImage divImage) {
            super(null);
            this.f45959e = divImage;
        }

        public final DivImage c() {
            return this.f45959e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class h extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivIndicator f45960e;

        public h(DivIndicator divIndicator) {
            super(null);
            this.f45960e = divIndicator;
        }

        public final DivIndicator c() {
            return this.f45960e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class i extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivInput f45961e;

        public i(DivInput divInput) {
            super(null);
            this.f45961e = divInput;
        }

        public final DivInput c() {
            return this.f45961e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class j extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivPager f45962e;

        public j(DivPager divPager) {
            super(null);
            this.f45962e = divPager;
        }

        public final DivPager c() {
            return this.f45962e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class k extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivSelect f45963e;

        public k(DivSelect divSelect) {
            super(null);
            this.f45963e = divSelect;
        }

        public final DivSelect c() {
            return this.f45963e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class l extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivSeparator f45964e;

        public l(DivSeparator divSeparator) {
            super(null);
            this.f45964e = divSeparator;
        }

        public final DivSeparator c() {
            return this.f45964e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class m extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivSlider f45965e;

        public m(DivSlider divSlider) {
            super(null);
            this.f45965e = divSlider;
        }

        public final DivSlider c() {
            return this.f45965e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class n extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivState f45966e;

        public n(DivState divState) {
            super(null);
            this.f45966e = divState;
        }

        public final DivState c() {
            return this.f45966e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class o extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivSwitch f45967e;

        public o(DivSwitch divSwitch) {
            super(null);
            this.f45967e = divSwitch;
        }

        public final DivSwitch c() {
            return this.f45967e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class p extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivTabs f45968e;

        public p(DivTabs divTabs) {
            super(null);
            this.f45968e = divTabs;
        }

        public final DivTabs c() {
            return this.f45968e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class q extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivText f45969e;

        public q(DivText divText) {
            super(null);
            this.f45969e = divText;
        }

        public final DivText c() {
            return this.f45969e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class r extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivVideo f45970e;

        public r(DivVideo divVideo) {
            super(null);
            this.f45970e = divVideo;
        }

        public final DivVideo c() {
            return this.f45970e;
        }
    }

    public Div() {
    }

    public /* synthetic */ Div(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final Div a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().M4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (div == null) {
            return false;
        }
        if (this instanceof g) {
            DivImage divImageC = ((g) this).c();
            oe.e2 e2VarB = div.b();
            return divImageC.C(e2VarB instanceof DivImage ? (DivImage) e2VarB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DivGifImage divGifImageC = ((e) this).c();
            oe.e2 e2VarB2 = div.b();
            return divGifImageC.C(e2VarB2 instanceof DivGifImage ? (DivGifImage) e2VarB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof q) {
            DivText divTextC = ((q) this).c();
            oe.e2 e2VarB3 = div.b();
            return divTextC.C(e2VarB3 instanceof DivText ? (DivText) e2VarB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof l) {
            DivSeparator divSeparatorC = ((l) this).c();
            oe.e2 e2VarB4 = div.b();
            return divSeparatorC.C(e2VarB4 instanceof DivSeparator ? (DivSeparator) e2VarB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivContainer divContainerC = ((b) this).c();
            oe.e2 e2VarB5 = div.b();
            return divContainerC.C(e2VarB5 instanceof DivContainer ? (DivContainer) e2VarB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            DivGrid divGridC = ((f) this).c();
            oe.e2 e2VarB6 = div.b();
            return divGridC.C(e2VarB6 instanceof DivGrid ? (DivGrid) e2VarB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            DivGallery divGalleryC = ((d) this).c();
            oe.e2 e2VarB7 = div.b();
            return divGalleryC.C(e2VarB7 instanceof DivGallery ? (DivGallery) e2VarB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            DivPager divPagerC = ((j) this).c();
            oe.e2 e2VarB8 = div.b();
            return divPagerC.C(e2VarB8 instanceof DivPager ? (DivPager) e2VarB8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof p) {
            DivTabs divTabsC = ((p) this).c();
            oe.e2 e2VarB9 = div.b();
            return divTabsC.C(e2VarB9 instanceof DivTabs ? (DivTabs) e2VarB9 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof n) {
            DivState divStateC = ((n) this).c();
            oe.e2 e2VarB10 = div.b();
            return divStateC.C(e2VarB10 instanceof DivState ? (DivState) e2VarB10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivCustom divCustomC = ((c) this).c();
            oe.e2 e2VarB11 = div.b();
            return divCustomC.C(e2VarB11 instanceof DivCustom ? (DivCustom) e2VarB11 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof h) {
            DivIndicator divIndicatorC = ((h) this).c();
            oe.e2 e2VarB12 = div.b();
            return divIndicatorC.C(e2VarB12 instanceof DivIndicator ? (DivIndicator) e2VarB12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof m) {
            DivSlider divSliderC = ((m) this).c();
            oe.e2 e2VarB13 = div.b();
            return divSliderC.C(e2VarB13 instanceof DivSlider ? (DivSlider) e2VarB13 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof o) {
            DivSwitch divSwitchC = ((o) this).c();
            oe.e2 e2VarB14 = div.b();
            return divSwitchC.C(e2VarB14 instanceof DivSwitch ? (DivSwitch) e2VarB14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            DivInput divInputC = ((i) this).c();
            oe.e2 e2VarB15 = div.b();
            return divInputC.C(e2VarB15 instanceof DivInput ? (DivInput) e2VarB15 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            DivSelect divSelectC = ((k) this).c();
            oe.e2 e2VarB16 = div.b();
            return divSelectC.C(e2VarB16 instanceof DivSelect ? (DivSelect) e2VarB16 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        DivVideo divVideoC = ((r) this).c();
        oe.e2 e2VarB17 = div.b();
        return divVideoC.C(e2VarB17 instanceof DivVideo ? (DivVideo) e2VarB17 : null, expressionResolver, expressionResolver2);
    }

    public final oe.e2 b() {
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f45953b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof q) {
            iHash = ((q) this).c().hash();
        } else if (this instanceof l) {
            iHash = ((l) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof p) {
            iHash = ((p) this).c().hash();
        } else if (this instanceof n) {
            iHash = ((n) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof m) {
            iHash = ((m) this).c().hash();
        } else if (this instanceof o) {
            iHash = ((o) this).c().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).c().hash();
        } else {
            if (!(this instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((r) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f45953b = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int iPropertiesHash;
        Integer num = this.f45952a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof g) {
            iPropertiesHash = ((g) this).c().propertiesHash();
        } else if (this instanceof e) {
            iPropertiesHash = ((e) this).c().propertiesHash();
        } else if (this instanceof q) {
            iPropertiesHash = ((q) this).c().propertiesHash();
        } else if (this instanceof l) {
            iPropertiesHash = ((l) this).c().propertiesHash();
        } else if (this instanceof b) {
            iPropertiesHash = ((b) this).c().propertiesHash();
        } else if (this instanceof f) {
            iPropertiesHash = ((f) this).c().propertiesHash();
        } else if (this instanceof d) {
            iPropertiesHash = ((d) this).c().propertiesHash();
        } else if (this instanceof j) {
            iPropertiesHash = ((j) this).c().propertiesHash();
        } else if (this instanceof p) {
            iPropertiesHash = ((p) this).c().propertiesHash();
        } else if (this instanceof n) {
            iPropertiesHash = ((n) this).c().propertiesHash();
        } else if (this instanceof c) {
            iPropertiesHash = ((c) this).c().propertiesHash();
        } else if (this instanceof h) {
            iPropertiesHash = ((h) this).c().propertiesHash();
        } else if (this instanceof m) {
            iPropertiesHash = ((m) this).c().propertiesHash();
        } else if (this instanceof o) {
            iPropertiesHash = ((o) this).c().propertiesHash();
        } else if (this instanceof i) {
            iPropertiesHash = ((i) this).c().propertiesHash();
        } else if (this instanceof k) {
            iPropertiesHash = ((k) this).c().propertiesHash();
        } else {
            if (!(this instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            iPropertiesHash = ((r) this).c().propertiesHash();
        }
        int i10 = iHashCode + iPropertiesHash;
        this.f45952a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
