package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivChangeTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46591a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivChangeTransitionTemplate> f46592b = new bk.p<ParsingEnvironment, JSONObject, DivChangeTransitionTemplate>() { // from class: com.yandex.div2.DivChangeTransitionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivChangeTransitionTemplate.b.b(DivChangeTransitionTemplate.f46591a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
    public static final class a extends DivChangeTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivChangeBoundsTransitionTemplate f46593c;

        public a(DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate) {
            super(null);
            this.f46593c = divChangeBoundsTransitionTemplate;
        }

        public final DivChangeBoundsTransitionTemplate b() {
            return this.f46593c;
        }
    }

    /* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivChangeTransitionTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivChangeTransitionTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().V1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
    public static final class c extends DivChangeTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivChangeSetTransitionTemplate f46594c;

        public c(DivChangeSetTransitionTemplate divChangeSetTransitionTemplate) {
            super(null);
            this.f46594c = divChangeSetTransitionTemplate;
        }

        public final DivChangeSetTransitionTemplate b() {
            return this.f46594c;
        }
    }

    public DivChangeTransitionTemplate() {
    }

    public /* synthetic */ DivChangeTransitionTemplate(ck.i iVar) {
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
            return "set";
        }
        if (this instanceof a) {
            return "change_bounds";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
