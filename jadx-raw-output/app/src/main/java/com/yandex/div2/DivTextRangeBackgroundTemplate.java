package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DivTextRangeBackgroundTemplate implements JSONSerializable, JsonTemplate<DivTextRangeBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f49624a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeBackgroundTemplate> f49625b = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeBackgroundTemplate>() { // from class: com.yandex.div2.DivTextRangeBackgroundTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBackgroundTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeBackgroundTemplate.b.b(DivTextRangeBackgroundTemplate.f49624a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class a extends DivTextRangeBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivCloudBackgroundTemplate f49626c;

        public a(DivCloudBackgroundTemplate divCloudBackgroundTemplate) {
            super(null);
            this.f49626c = divCloudBackgroundTemplate;
        }

        public final DivCloudBackgroundTemplate b() {
            return this.f49626c;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivTextRangeBackgroundTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivTextRangeBackgroundTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().t8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class c extends DivTextRangeBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivSolidBackgroundTemplate f49627c;

        public c(DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.f49627c = divSolidBackgroundTemplate;
        }

        public final DivSolidBackgroundTemplate b() {
            return this.f49627c;
        }
    }

    public DivTextRangeBackgroundTemplate() {
    }

    public /* synthetic */ DivTextRangeBackgroundTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "solid";
        }
        if (this instanceof a) {
            return "cloud";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
