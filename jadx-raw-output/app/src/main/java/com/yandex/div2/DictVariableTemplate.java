package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictVariableTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DictVariableTemplate implements JSONSerializable, JsonTemplate<DictVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45946c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DictVariableTemplate> f45947d = new bk.p<ParsingEnvironment, JSONObject, DictVariableTemplate>() { // from class: com.yandex.div2.DictVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DictVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DictVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f45948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<JSONObject>> f45949b;

    /* JADX INFO: compiled from: DictVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DictVariableTemplate(Field<String> field, Field<Expression<JSONObject>> field2) {
        this.f45948a = field;
        this.f45949b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DictVariableTemplate(ParsingEnvironment parsingEnvironment, DictVariableTemplate dictVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : dictVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DictVariableTemplate(ParsingEnvironment parsingEnvironment, DictVariableTemplate dictVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
