package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberVariableTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class NumberVariableTemplate implements JSONSerializable, JsonTemplate<NumberVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50479c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, NumberVariableTemplate> f50480d = new bk.p<ParsingEnvironment, JSONObject, NumberVariableTemplate>() { // from class: com.yandex.div2.NumberVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final NumberVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new NumberVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f50481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Double>> f50482b;

    /* JADX INFO: compiled from: NumberVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public NumberVariableTemplate(Field<String> field, Field<Expression<Double>> field2) {
        this.f50481a = field;
        this.f50482b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ NumberVariableTemplate(ParsingEnvironment parsingEnvironment, NumberVariableTemplate numberVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : numberVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NumberVariableTemplate(ParsingEnvironment parsingEnvironment, NumberVariableTemplate numberVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
