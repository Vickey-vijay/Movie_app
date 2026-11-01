package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleSolidTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivStrokeStyleSolidTemplate implements JSONSerializable, JsonTemplate<DivStrokeStyleSolid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49158a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleSolidTemplate> f49159b = new bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleSolidTemplate>() { // from class: com.yandex.div2.DivStrokeStyleSolidTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleSolidTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivStrokeStyleSolidTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivStrokeStyleSolidTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivStrokeStyleSolidTemplate() {
    }

    public /* synthetic */ DivStrokeStyleSolidTemplate(ParsingEnvironment parsingEnvironment, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStrokeStyleSolidTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public DivStrokeStyleSolidTemplate(ParsingEnvironment parsingEnvironment, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, boolean z10, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
