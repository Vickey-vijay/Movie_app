package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradientTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivTextGradientTemplate implements JSONSerializable, JsonTemplate<DivTextGradient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49572a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextGradientTemplate> f49573b = new bk.p<ParsingEnvironment, JSONObject, DivTextGradientTemplate>() { // from class: com.yandex.div2.DivTextGradientTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextGradientTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextGradientTemplate.a.b(DivTextGradientTemplate.f49572a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTextGradientTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivTextGradientTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivTextGradientTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextGradientTemplate.kt */
    public static final class b extends DivTextGradientTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivLinearGradientTemplate f49574c;

        public b(DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.f49574c = divLinearGradientTemplate;
        }

        public final DivLinearGradientTemplate b() {
            return this.f49574c;
        }
    }

    /* JADX INFO: compiled from: DivTextGradientTemplate.kt */
    public static final class c extends DivTextGradientTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivRadialGradientTemplate f49575c;

        public c(DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.f49575c = divRadialGradientTemplate;
        }

        public final DivRadialGradientTemplate b() {
            return this.f49575c;
        }
    }

    public DivTextGradientTemplate() {
    }

    public /* synthetic */ DivTextGradientTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof b) {
            return "gradient";
        }
        if (this instanceof c) {
            return "radial_gradient";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
