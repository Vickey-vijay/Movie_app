package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayVariableTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ArrayVariableTemplate implements JSONSerializable, JsonTemplate<ArrayVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45884c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ArrayVariableTemplate> f45885d = new bk.p<ParsingEnvironment, JSONObject, ArrayVariableTemplate>() { // from class: com.yandex.div2.ArrayVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ArrayVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f45886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<JSONArray>> f45887b;

    /* JADX INFO: compiled from: ArrayVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public ArrayVariableTemplate(Field<String> field, Field<Expression<JSONArray>> field2) {
        this.f45886a = field;
        this.f45887b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ArrayVariableTemplate(ParsingEnvironment parsingEnvironment, ArrayVariableTemplate arrayVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : arrayVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ArrayVariableTemplate(ParsingEnvironment parsingEnvironment, ArrayVariableTemplate arrayVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
