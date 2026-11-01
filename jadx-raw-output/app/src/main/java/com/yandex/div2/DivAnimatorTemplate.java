package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimatorTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivAnimatorTemplate implements JSONSerializable, JsonTemplate<DivAnimator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46479a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAnimatorTemplate> f46480b = new bk.p<ParsingEnvironment, JSONObject, DivAnimatorTemplate>() { // from class: com.yandex.div2.DivAnimatorTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAnimatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAnimatorTemplate.b.b(DivAnimatorTemplate.f46479a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivAnimatorTemplate.kt */
    public static final class a extends DivAnimatorTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivColorAnimatorTemplate f46481c;

        public a(DivColorAnimatorTemplate divColorAnimatorTemplate) {
            super(null);
            this.f46481c = divColorAnimatorTemplate;
        }

        public final DivColorAnimatorTemplate b() {
            return this.f46481c;
        }
    }

    /* JADX INFO: compiled from: DivAnimatorTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivAnimatorTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivAnimatorTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().u1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivAnimatorTemplate.kt */
    public static final class c extends DivAnimatorTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivNumberAnimatorTemplate f46482c;

        public c(DivNumberAnimatorTemplate divNumberAnimatorTemplate) {
            super(null);
            this.f46482c = divNumberAnimatorTemplate;
        }

        public final DivNumberAnimatorTemplate b() {
            return this.f46482c;
        }
    }

    public DivAnimatorTemplate() {
    }

    public /* synthetic */ DivAnimatorTemplate(ck.i iVar) {
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
            return "color_animator";
        }
        if (this instanceof c) {
            return "number_animator";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
