package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValueTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionSetStoredValueTemplate implements JSONSerializable, JsonTemplate<DivActionSetStoredValue> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46255d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionSetStoredValueTemplate> f46256e = new bk.p<ParsingEnvironment, JSONObject, DivActionSetStoredValueTemplate>() { // from class: com.yandex.div2.DivActionSetStoredValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetStoredValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionSetStoredValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f46258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivTypedValueTemplate> f46259c;

    /* JADX INFO: compiled from: DivActionSetStoredValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionSetStoredValueTemplate(Field<Expression<Long>> field, Field<Expression<String>> field2, Field<DivTypedValueTemplate> field3) {
        this.f46257a = field;
        this.f46258b = field2;
        this.f46259c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionSetStoredValueTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionSetStoredValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionSetStoredValueTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
