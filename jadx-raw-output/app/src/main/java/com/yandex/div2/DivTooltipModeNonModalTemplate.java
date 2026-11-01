package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeNonModalTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTooltipModeNonModalTemplate implements JSONSerializable, JsonTemplate<DivTooltipModeNonModal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49873a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltipModeNonModalTemplate> f49874b = new bk.p<ParsingEnvironment, JSONObject, DivTooltipModeNonModalTemplate>() { // from class: com.yandex.div2.DivTooltipModeNonModalTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipModeNonModalTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivTooltipModeNonModalTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivTooltipModeNonModalTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTooltipModeNonModalTemplate() {
    }

    public /* synthetic */ DivTooltipModeNonModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTooltipModeNonModalTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public DivTooltipModeNonModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, boolean z10, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
