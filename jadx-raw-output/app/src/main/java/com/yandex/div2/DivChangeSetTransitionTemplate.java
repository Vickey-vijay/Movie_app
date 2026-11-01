package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeSetTransitionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivChangeSetTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeSetTransition> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46583b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivChangeSetTransitionTemplate> f46584c = new bk.p<ParsingEnvironment, JSONObject, DivChangeSetTransitionTemplate>() { // from class: com.yandex.div2.DivChangeSetTransitionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeSetTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivChangeSetTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivChangeTransitionTemplate>> f46585a;

    /* JADX INFO: compiled from: DivChangeSetTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivChangeSetTransitionTemplate(Field<List<DivChangeTransitionTemplate>> field) {
        this.f46585a = field;
    }

    public /* synthetic */ DivChangeSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divChangeSetTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivChangeSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
