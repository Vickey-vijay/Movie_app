package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivFunctionArgumentTemplate implements JSONSerializable, JsonTemplate<DivFunctionArgument> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47245c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFunctionArgumentTemplate> f47246d = new bk.p<ParsingEnvironment, JSONObject, DivFunctionArgumentTemplate>() { // from class: com.yandex.div2.DivFunctionArgumentTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunctionArgumentTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivFunctionArgumentTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f47247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivEvaluableType> f47248b;

    /* JADX INFO: compiled from: DivFunctionArgumentTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFunctionArgumentTemplate(Field<String> field, Field<DivEvaluableType> field2) {
        this.f47247a = field;
        this.f47248b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFunctionArgumentTemplate(ParsingEnvironment parsingEnvironment, DivFunctionArgumentTemplate divFunctionArgumentTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFunctionArgumentTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFunctionArgumentTemplate(ParsingEnvironment parsingEnvironment, DivFunctionArgumentTemplate divFunctionArgumentTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
