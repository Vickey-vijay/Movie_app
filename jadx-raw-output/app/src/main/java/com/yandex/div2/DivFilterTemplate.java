package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivFilterTemplate implements JSONSerializable, JsonTemplate<DivFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47145a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFilterTemplate> f47146b = new bk.p<ParsingEnvironment, JSONObject, DivFilterTemplate>() { // from class: com.yandex.div2.DivFilterTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilterTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFilterTemplate.b.b(DivFilterTemplate.f47145a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivFilterTemplate.kt */
    public static final class a extends DivFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivBlurTemplate f47147c;

        public a(DivBlurTemplate divBlurTemplate) {
            super(null);
            this.f47147c = divBlurTemplate;
        }

        public final DivBlurTemplate b() {
            return this.f47147c;
        }
    }

    /* JADX INFO: compiled from: DivFilterTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivFilterTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivFilterTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().i3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivFilterTemplate.kt */
    public static final class c extends DivFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFilterRtlMirrorTemplate f47148c;

        public c(DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate) {
            super(null);
            this.f47148c = divFilterRtlMirrorTemplate;
        }

        public final DivFilterRtlMirrorTemplate b() {
            return this.f47148c;
        }
    }

    public DivFilterTemplate() {
    }

    public /* synthetic */ DivFilterTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof a) {
            return "blur";
        }
        if (this instanceof c) {
            return "rtl_mirror";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
