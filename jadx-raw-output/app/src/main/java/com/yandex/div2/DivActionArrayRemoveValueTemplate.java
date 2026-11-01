package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayRemoveValueTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionArrayRemoveValueTemplate implements JSONSerializable, JsonTemplate<DivActionArrayRemoveValue> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46101c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValueTemplate> f46102d = new bk.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValueTemplate>() { // from class: com.yandex.div2.DivActionArrayRemoveValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayRemoveValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionArrayRemoveValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f46104b;

    /* JADX INFO: compiled from: DivActionArrayRemoveValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionArrayRemoveValueTemplate(Field<Expression<Long>> field, Field<Expression<String>> field2) {
        this.f46103a = field;
        this.f46104b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionArrayRemoveValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionArrayRemoveValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionArrayRemoveValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
