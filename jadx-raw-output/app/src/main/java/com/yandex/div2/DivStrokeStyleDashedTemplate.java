package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleDashedTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivStrokeStyleDashedTemplate implements JSONSerializable, JsonTemplate<DivStrokeStyleDashed> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49153a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleDashedTemplate> f49154b = new bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleDashedTemplate>() { // from class: com.yandex.div2.DivStrokeStyleDashedTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleDashedTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivStrokeStyleDashedTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivStrokeStyleDashedTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivStrokeStyleDashedTemplate() {
    }

    public /* synthetic */ DivStrokeStyleDashedTemplate(ParsingEnvironment parsingEnvironment, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStrokeStyleDashedTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public DivStrokeStyleDashedTemplate(ParsingEnvironment parsingEnvironment, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, boolean z10, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
