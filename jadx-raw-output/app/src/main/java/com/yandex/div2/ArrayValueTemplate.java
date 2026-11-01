package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayValueTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ArrayValueTemplate implements JSONSerializable, JsonTemplate<ArrayValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45876b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, ArrayValueTemplate> f45877c = new bk.p<ParsingEnvironment, JSONObject, ArrayValueTemplate>() { // from class: com.yandex.div2.ArrayValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ArrayValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<JSONArray>> f45878a;

    /* JADX INFO: compiled from: ArrayValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public ArrayValueTemplate(Field<Expression<JSONArray>> field) {
        this.f45878a = field;
    }

    public /* synthetic */ ArrayValueTemplate(ParsingEnvironment parsingEnvironment, ArrayValueTemplate arrayValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : arrayValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public ArrayValueTemplate(ParsingEnvironment parsingEnvironment, ArrayValueTemplate arrayValueTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
