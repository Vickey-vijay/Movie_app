package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivTemplate implements JSONSerializable, JsonTemplate<Div> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49434a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTemplate> f49435b = new bk.p<ParsingEnvironment, JSONObject, DivTemplate>() { // from class: com.yandex.div2.DivTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTemplate.a.b(DivTemplate.f49434a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().N4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class b extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivContainerTemplate f49436c;

        public b(DivContainerTemplate divContainerTemplate) {
            super(null);
            this.f49436c = divContainerTemplate;
        }

        public final DivContainerTemplate b() {
            return this.f49436c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class c extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivCustomTemplate f49437c;

        public c(DivCustomTemplate divCustomTemplate) {
            super(null);
            this.f49437c = divCustomTemplate;
        }

        public final DivCustomTemplate b() {
            return this.f49437c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class d extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivGalleryTemplate f49438c;

        public d(DivGalleryTemplate divGalleryTemplate) {
            super(null);
            this.f49438c = divGalleryTemplate;
        }

        public final DivGalleryTemplate b() {
            return this.f49438c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class e extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivGifImageTemplate f49439c;

        public e(DivGifImageTemplate divGifImageTemplate) {
            super(null);
            this.f49439c = divGifImageTemplate;
        }

        public final DivGifImageTemplate b() {
            return this.f49439c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class f extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivGridTemplate f49440c;

        public f(DivGridTemplate divGridTemplate) {
            super(null);
            this.f49440c = divGridTemplate;
        }

        public final DivGridTemplate b() {
            return this.f49440c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class g extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivImageTemplate f49441c;

        public g(DivImageTemplate divImageTemplate) {
            super(null);
            this.f49441c = divImageTemplate;
        }

        public final DivImageTemplate b() {
            return this.f49441c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class h extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivIndicatorTemplate f49442c;

        public h(DivIndicatorTemplate divIndicatorTemplate) {
            super(null);
            this.f49442c = divIndicatorTemplate;
        }

        public final DivIndicatorTemplate b() {
            return this.f49442c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class i extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivInputTemplate f49443c;

        public i(DivInputTemplate divInputTemplate) {
            super(null);
            this.f49443c = divInputTemplate;
        }

        public final DivInputTemplate b() {
            return this.f49443c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class j extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivPagerTemplate f49444c;

        public j(DivPagerTemplate divPagerTemplate) {
            super(null);
            this.f49444c = divPagerTemplate;
        }

        public final DivPagerTemplate b() {
            return this.f49444c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class k extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSelectTemplate f49445c;

        public k(DivSelectTemplate divSelectTemplate) {
            super(null);
            this.f49445c = divSelectTemplate;
        }

        public final DivSelectTemplate b() {
            return this.f49445c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class l extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSeparatorTemplate f49446c;

        public l(DivSeparatorTemplate divSeparatorTemplate) {
            super(null);
            this.f49446c = divSeparatorTemplate;
        }

        public final DivSeparatorTemplate b() {
            return this.f49446c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class m extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSliderTemplate f49447c;

        public m(DivSliderTemplate divSliderTemplate) {
            super(null);
            this.f49447c = divSliderTemplate;
        }

        public final DivSliderTemplate b() {
            return this.f49447c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class n extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivStateTemplate f49448c;

        public n(DivStateTemplate divStateTemplate) {
            super(null);
            this.f49448c = divStateTemplate;
        }

        public final DivStateTemplate b() {
            return this.f49448c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class o extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSwitchTemplate f49449c;

        public o(DivSwitchTemplate divSwitchTemplate) {
            super(null);
            this.f49449c = divSwitchTemplate;
        }

        public final DivSwitchTemplate b() {
            return this.f49449c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class p extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTabsTemplate f49450c;

        public p(DivTabsTemplate divTabsTemplate) {
            super(null);
            this.f49450c = divTabsTemplate;
        }

        public final DivTabsTemplate b() {
            return this.f49450c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class q extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTextTemplate f49451c;

        public q(DivTextTemplate divTextTemplate) {
            super(null);
            this.f49451c = divTextTemplate;
        }

        public final DivTextTemplate b() {
            return this.f49451c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class r extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivVideoTemplate f49452c;

        public r(DivVideoTemplate divVideoTemplate) {
            super(null);
            this.f49452c = divVideoTemplate;
        }

        public final DivVideoTemplate b() {
            return this.f49452c;
        }
    }

    public DivTemplate() {
    }

    public /* synthetic */ DivTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof g) {
            return ((g) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof q) {
            return ((q) this).b();
        }
        if (this instanceof l) {
            return ((l) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof j) {
            return ((j) this).b();
        }
        if (this instanceof p) {
            return ((p) this).b();
        }
        if (this instanceof n) {
            return ((n) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof h) {
            return ((h) this).b();
        }
        if (this instanceof m) {
            return ((m) this).b();
        }
        if (this instanceof o) {
            return ((o) this).b();
        }
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof k) {
            return ((k) this).b();
        }
        if (this instanceof r) {
            return ((r) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof g) {
            return "image";
        }
        if (this instanceof e) {
            return "gif";
        }
        if (this instanceof q) {
            return "text";
        }
        if (this instanceof l) {
            return "separator";
        }
        if (this instanceof b) {
            return "container";
        }
        if (this instanceof f) {
            return "grid";
        }
        if (this instanceof d) {
            return "gallery";
        }
        if (this instanceof j) {
            return "pager";
        }
        if (this instanceof p) {
            return "tabs";
        }
        if (this instanceof n) {
            return "state";
        }
        if (this instanceof c) {
            return "custom";
        }
        if (this instanceof h) {
            return "indicator";
        }
        if (this instanceof m) {
            return "slider";
        }
        if (this instanceof o) {
            return "switch";
        }
        if (this instanceof i) {
            return "input";
        }
        if (this instanceof k) {
            return "select";
        }
        if (this instanceof r) {
            return "video";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
