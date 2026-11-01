package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionArrayInsertValueTemplate implements JSONSerializable, JsonTemplate<DivActionArrayInsertValue> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46091d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionArrayInsertValueTemplate> f46092e = new bk.p<ParsingEnvironment, JSONObject, DivActionArrayInsertValueTemplate>() { // from class: com.yandex.div2.DivActionArrayInsertValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayInsertValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionArrayInsertValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivTypedValueTemplate> f46094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f46095c;

    /* JADX INFO: compiled from: DivActionArrayInsertValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionArrayInsertValueTemplate(Field<Expression<Long>> field, Field<DivTypedValueTemplate> field2, Field<Expression<String>> field3) {
        this.f46093a = field;
        this.f46094b = field2;
        this.f46095c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionArrayInsertValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionArrayInsertValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionArrayInsertValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
