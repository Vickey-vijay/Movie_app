package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivActionCopyToClipboardContentTemplate implements JSONSerializable, JsonTemplate<DivActionCopyToClipboardContent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46130a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContentTemplate> f46131b = new bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContentTemplate>() { // from class: com.yandex.div2.DivActionCopyToClipboardContentTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboardContentTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionCopyToClipboardContentTemplate.a.b(DivActionCopyToClipboardContentTemplate.f46130a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivActionCopyToClipboardContentTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivActionCopyToClipboardContentTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().d0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class b extends DivActionCopyToClipboardContentTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ContentTextTemplate f46132c;

        public b(ContentTextTemplate contentTextTemplate) {
            super(null);
            this.f46132c = contentTextTemplate;
        }

        public final ContentTextTemplate b() {
            return this.f46132c;
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class c extends DivActionCopyToClipboardContentTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ContentUrlTemplate f46133c;

        public c(ContentUrlTemplate contentUrlTemplate) {
            super(null);
            this.f46133c = contentUrlTemplate;
        }

        public final ContentUrlTemplate b() {
            return this.f46133c;
        }
    }

    public DivActionCopyToClipboardContentTemplate() {
    }

    public /* synthetic */ DivActionCopyToClipboardContentTemplate(ck.i iVar) {
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
            return "text";
        }
        if (this instanceof c) {
            return "url";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
