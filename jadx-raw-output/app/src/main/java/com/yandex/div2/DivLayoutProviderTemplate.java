package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivLayoutProviderTemplate implements JSONSerializable, JsonTemplate<DivLayoutProvider> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48030c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivLayoutProviderTemplate> f48031d = new bk.p<ParsingEnvironment, JSONObject, DivLayoutProviderTemplate>() { // from class: com.yandex.div2.DivLayoutProviderTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLayoutProviderTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivLayoutProviderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f48032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<String> f48033b;

    /* JADX INFO: compiled from: DivLayoutProviderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivLayoutProviderTemplate(Field<String> field, Field<String> field2) {
        this.f48032a = field;
        this.f48033b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivLayoutProviderTemplate(ParsingEnvironment parsingEnvironment, DivLayoutProviderTemplate divLayoutProviderTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divLayoutProviderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivLayoutProviderTemplate(ParsingEnvironment parsingEnvironment, DivLayoutProviderTemplate divLayoutProviderTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
