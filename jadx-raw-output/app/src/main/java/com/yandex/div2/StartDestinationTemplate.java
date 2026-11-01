package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: StartDestinationTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class StartDestinationTemplate implements JSONSerializable, JsonTemplate<StartDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50516a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, StartDestinationTemplate> f50517b = new bk.p<ParsingEnvironment, JSONObject, StartDestinationTemplate>() { // from class: com.yandex.div2.StartDestinationTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StartDestinationTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new StartDestinationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: StartDestinationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public StartDestinationTemplate() {
    }

    public /* synthetic */ StartDestinationTemplate(ParsingEnvironment parsingEnvironment, StartDestinationTemplate startDestinationTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : startDestinationTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public StartDestinationTemplate(ParsingEnvironment parsingEnvironment, StartDestinationTemplate startDestinationTemplate, boolean z10, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ba().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
