package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivTextRangeMaskTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49703a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskTemplate> f49704b = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeMaskTemplate.a.b(DivTextRangeMaskTemplate.f49703a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivTextRangeMaskTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivTextRangeMaskTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().E8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
    public static final class b extends DivTextRangeMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTextRangeMaskParticlesTemplate f49705c;

        public b(DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate) {
            super(null);
            this.f49705c = divTextRangeMaskParticlesTemplate;
        }

        public final DivTextRangeMaskParticlesTemplate b() {
            return this.f49705c;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
    public static final class c extends DivTextRangeMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTextRangeMaskSolidTemplate f49706c;

        public c(DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate) {
            super(null);
            this.f49706c = divTextRangeMaskSolidTemplate;
        }

        public final DivTextRangeMaskSolidTemplate b() {
            return this.f49706c;
        }
    }

    public DivTextRangeMaskTemplate() {
    }

    public /* synthetic */ DivTextRangeMaskTemplate(ck.i iVar) {
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
            return "particles";
        }
        if (this instanceof c) {
            return "solid";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
