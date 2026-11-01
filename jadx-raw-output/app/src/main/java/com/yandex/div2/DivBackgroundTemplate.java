package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivBackgroundTemplate implements JSONSerializable, JsonTemplate<DivBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46519a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivBackgroundTemplate> f46520b = new bk.p<ParsingEnvironment, JSONObject, DivBackgroundTemplate>() { // from class: com.yandex.div2.DivBackgroundTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBackgroundTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivBackgroundTemplate.a.b(DivBackgroundTemplate.f46519a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivBackgroundTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivBackgroundTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().G1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class b extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivImageBackgroundTemplate f46521c;

        public b(DivImageBackgroundTemplate divImageBackgroundTemplate) {
            super(null);
            this.f46521c = divImageBackgroundTemplate;
        }

        public final DivImageBackgroundTemplate b() {
            return this.f46521c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class c extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivLinearGradientTemplate f46522c;

        public c(DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.f46522c = divLinearGradientTemplate;
        }

        public final DivLinearGradientTemplate b() {
            return this.f46522c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class d extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivNinePatchBackgroundTemplate f46523c;

        public d(DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) {
            super(null);
            this.f46523c = divNinePatchBackgroundTemplate;
        }

        public final DivNinePatchBackgroundTemplate b() {
            return this.f46523c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class e extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivRadialGradientTemplate f46524c;

        public e(DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.f46524c = divRadialGradientTemplate;
        }

        public final DivRadialGradientTemplate b() {
            return this.f46524c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class f extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSolidBackgroundTemplate f46525c;

        public f(DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.f46525c = divSolidBackgroundTemplate;
        }

        public final DivSolidBackgroundTemplate b() {
            return this.f46525c;
        }
    }

    public DivBackgroundTemplate() {
    }

    public /* synthetic */ DivBackgroundTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
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
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "gradient";
        }
        if (this instanceof e) {
            return "radial_gradient";
        }
        if (this instanceof b) {
            return "image";
        }
        if (this instanceof f) {
            return "solid";
        }
        if (this instanceof d) {
            return "nine_patch_image";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
