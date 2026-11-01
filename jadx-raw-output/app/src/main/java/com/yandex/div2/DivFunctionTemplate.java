package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFunctionTemplate implements JSONSerializable, JsonTemplate<DivFunction> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47249e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFunctionTemplate> f47250f = new bk.p<ParsingEnvironment, JSONObject, DivFunctionTemplate>() { // from class: com.yandex.div2.DivFunctionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunctionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivFunctionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivFunctionArgumentTemplate>> f47251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<String> f47252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<String> f47253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<DivEvaluableType> f47254d;

    /* JADX INFO: compiled from: DivFunctionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFunctionTemplate(Field<List<DivFunctionArgumentTemplate>> field, Field<String> field2, Field<String> field3, Field<DivEvaluableType> field4) {
        this.f47251a = field;
        this.f47252b = field2;
        this.f47253c = field3;
        this.f47254d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFunctionTemplate(ParsingEnvironment parsingEnvironment, DivFunctionTemplate divFunctionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFunctionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFunctionTemplate(ParsingEnvironment parsingEnvironment, DivFunctionTemplate divFunctionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<List<DivFunctionArgumentTemplate>>) companion.nullField(false), (Field<String>) companion.nullField(false), (Field<String>) companion.nullField(false), (Field<DivEvaluableType>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
