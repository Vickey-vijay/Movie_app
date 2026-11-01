package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrVariableTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StrVariableTemplate implements JSONSerializable, JsonTemplate<StrVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50530c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, StrVariableTemplate> f50531d = new bk.p<ParsingEnvironment, JSONObject, StrVariableTemplate>() { // from class: com.yandex.div2.StrVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final StrVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new StrVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f50532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f50533b;

    /* JADX INFO: compiled from: StrVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public StrVariableTemplate(Field<String> field, Field<Expression<String>> field2) {
        this.f50532a = field;
        this.f50533b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ha().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ StrVariableTemplate(ParsingEnvironment parsingEnvironment, StrVariableTemplate strVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : strVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StrVariableTemplate(ParsingEnvironment parsingEnvironment, StrVariableTemplate strVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
