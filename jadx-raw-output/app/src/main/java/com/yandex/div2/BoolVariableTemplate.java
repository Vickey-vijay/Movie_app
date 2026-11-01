package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolVariableTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoolVariableTemplate implements JSONSerializable, JsonTemplate<BoolVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45900c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, BoolVariableTemplate> f45901d = new bk.p<ParsingEnvironment, JSONObject, BoolVariableTemplate>() { // from class: com.yandex.div2.BoolVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new BoolVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f45902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Boolean>> f45903b;

    /* JADX INFO: compiled from: BoolVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public BoolVariableTemplate(Field<String> field, Field<Expression<Boolean>> field2) {
        this.f45902a = field;
        this.f45903b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ BoolVariableTemplate(ParsingEnvironment parsingEnvironment, BoolVariableTemplate boolVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : boolVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BoolVariableTemplate(ParsingEnvironment parsingEnvironment, BoolVariableTemplate boolVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
