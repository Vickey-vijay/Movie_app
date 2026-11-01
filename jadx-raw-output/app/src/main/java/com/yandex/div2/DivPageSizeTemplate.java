package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSizeTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPageSizeTemplate implements JSONSerializable, JsonTemplate<DivPageSize> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48140b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageSizeTemplate> f48141c = new bk.p<ParsingEnvironment, JSONObject, DivPageSizeTemplate>() { // from class: com.yandex.div2.DivPageSizeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageSizeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivPageSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivPercentageSizeTemplate> f48142a;

    /* JADX INFO: compiled from: DivPageSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPageSizeTemplate(Field<DivPercentageSizeTemplate> field) {
        this.f48142a = field;
    }

    public /* synthetic */ DivPageSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageSizeTemplate divPageSizeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPageSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivPageSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageSizeTemplate divPageSizeTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
