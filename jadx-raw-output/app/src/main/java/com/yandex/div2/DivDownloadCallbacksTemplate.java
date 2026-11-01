package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivDownloadCallbacksTemplate implements JSONSerializable, JsonTemplate<DivDownloadCallbacks> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47036c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDownloadCallbacksTemplate> f47037d = new bk.p<ParsingEnvironment, JSONObject, DivDownloadCallbacksTemplate>() { // from class: com.yandex.div2.DivDownloadCallbacksTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDownloadCallbacksTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivDownloadCallbacksTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f47039b;

    /* JADX INFO: compiled from: DivDownloadCallbacksTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivDownloadCallbacksTemplate(Field<List<DivActionTemplate>> field, Field<List<DivActionTemplate>> field2) {
        this.f47038a = field;
        this.f47039b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivDownloadCallbacksTemplate(ParsingEnvironment parsingEnvironment, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDownloadCallbacksTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDownloadCallbacksTemplate(ParsingEnvironment parsingEnvironment, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
