package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivAppearanceTransitionTemplate implements JSONSerializable, JsonTemplate<DivAppearanceTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46498a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> f46499b = new bk.p<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate>() { // from class: com.yandex.div2.DivAppearanceTransitionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAppearanceTransitionTemplate.a.b(DivAppearanceTransitionTemplate.f46498a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivAppearanceTransitionTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivAppearanceTransitionTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().A1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class b extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFadeTransitionTemplate f46500c;

        public b(DivFadeTransitionTemplate divFadeTransitionTemplate) {
            super(null);
            this.f46500c = divFadeTransitionTemplate;
        }

        public final DivFadeTransitionTemplate b() {
            return this.f46500c;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class c extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivScaleTransitionTemplate f46501c;

        public c(DivScaleTransitionTemplate divScaleTransitionTemplate) {
            super(null);
            this.f46501c = divScaleTransitionTemplate;
        }

        public final DivScaleTransitionTemplate b() {
            return this.f46501c;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class d extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivAppearanceSetTransitionTemplate f46502c;

        public d(DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) {
            super(null);
            this.f46502c = divAppearanceSetTransitionTemplate;
        }

        public final DivAppearanceSetTransitionTemplate b() {
            return this.f46502c;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class e extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSlideTransitionTemplate f46503c;

        public e(DivSlideTransitionTemplate divSlideTransitionTemplate) {
            super(null);
            this.f46503c = divSlideTransitionTemplate;
        }

        public final DivSlideTransitionTemplate b() {
            return this.f46503c;
        }
    }

    public DivAppearanceTransitionTemplate() {
    }

    public /* synthetic */ DivAppearanceTransitionTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof d) {
            return "set";
        }
        if (this instanceof b) {
            return "fade";
        }
        if (this instanceof c) {
            return "scale";
        }
        if (this instanceof e) {
            return "slide";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
