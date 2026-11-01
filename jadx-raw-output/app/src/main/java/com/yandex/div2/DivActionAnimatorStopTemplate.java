package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStopTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionAnimatorStopTemplate implements JSONSerializable, JsonTemplate<DivActionAnimatorStop> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46082b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStopTemplate> f46083c = new bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStopTemplate>() { // from class: com.yandex.div2.DivActionAnimatorStopTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStopTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionAnimatorStopTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f46084a;

    /* JADX INFO: compiled from: DivActionAnimatorStopTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionAnimatorStopTemplate(Field<String> field) {
        this.f46084a = field;
    }

    public /* synthetic */ DivActionAnimatorStopTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionAnimatorStopTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivActionAnimatorStopTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
