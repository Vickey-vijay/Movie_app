package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerVariableTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class IntegerVariableTemplate implements JSONSerializable, JsonTemplate<IntegerVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50158c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, IntegerVariableTemplate> f50159d = new bk.p<ParsingEnvironment, JSONObject, IntegerVariableTemplate>() { // from class: com.yandex.div2.IntegerVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new IntegerVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f50160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f50161b;

    /* JADX INFO: compiled from: IntegerVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public IntegerVariableTemplate(Field<String> field, Field<Expression<Long>> field2) {
        this.f50160a = field;
        this.f50161b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ IntegerVariableTemplate(ParsingEnvironment parsingEnvironment, IntegerVariableTemplate integerVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : integerVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntegerVariableTemplate(ParsingEnvironment parsingEnvironment, IntegerVariableTemplate integerVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
