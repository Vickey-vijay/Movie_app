package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivExtensionTemplate implements JSONSerializable, JsonTemplate<DivExtension> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47098c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivExtensionTemplate> f47099d = new bk.p<ParsingEnvironment, JSONObject, DivExtensionTemplate>() { // from class: com.yandex.div2.DivExtensionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivExtensionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivExtensionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f47100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<JSONObject> f47101b;

    /* JADX INFO: compiled from: DivExtensionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivExtensionTemplate(Field<String> field, Field<JSONObject> field2) {
        this.f47100a = field;
        this.f47101b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivExtensionTemplate(ParsingEnvironment parsingEnvironment, DivExtensionTemplate divExtensionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divExtensionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivExtensionTemplate(ParsingEnvironment parsingEnvironment, DivExtensionTemplate divExtensionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
