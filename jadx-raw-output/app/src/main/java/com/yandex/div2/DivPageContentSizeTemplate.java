package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageContentSizeTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPageContentSizeTemplate implements JSONSerializable, JsonTemplate<DivPageContentSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48134a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageContentSizeTemplate> f48135b = new bk.p<ParsingEnvironment, JSONObject, DivPageContentSizeTemplate>() { // from class: com.yandex.div2.DivPageContentSizeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageContentSizeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivPageContentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivPageContentSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPageContentSizeTemplate() {
    }

    public /* synthetic */ DivPageContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageContentSizeTemplate divPageContentSizeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPageContentSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public DivPageContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageContentSizeTemplate divPageContentSizeTemplate, boolean z10, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
