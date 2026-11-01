package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionCopyToClipboardTemplate implements JSONSerializable, JsonTemplate<DivActionCopyToClipboard> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46134b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardTemplate> f46135c = new bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardTemplate>() { // from class: com.yandex.div2.DivActionCopyToClipboardTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboardTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionCopyToClipboardTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivActionCopyToClipboardContentTemplate> f46136a;

    /* JADX INFO: compiled from: DivActionCopyToClipboardTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionCopyToClipboardTemplate(Field<DivActionCopyToClipboardContentTemplate> field) {
        this.f46136a = field;
    }

    public /* synthetic */ DivActionCopyToClipboardTemplate(ParsingEnvironment parsingEnvironment, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionCopyToClipboardTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivActionCopyToClipboardTemplate(ParsingEnvironment parsingEnvironment, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
