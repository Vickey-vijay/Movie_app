package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArraySetValueTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionArraySetValueTemplate implements JSONSerializable, JsonTemplate<DivActionArraySetValue> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46111d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionArraySetValueTemplate> f46112e = new bk.p<ParsingEnvironment, JSONObject, DivActionArraySetValueTemplate>() { // from class: com.yandex.div2.DivActionArraySetValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArraySetValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionArraySetValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivTypedValueTemplate> f46114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f46115c;

    /* JADX INFO: compiled from: DivActionArraySetValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionArraySetValueTemplate(Field<Expression<Long>> field, Field<DivTypedValueTemplate> field2, Field<Expression<String>> field3) {
        this.f46113a = field;
        this.f46114b = field2;
        this.f46115c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionArraySetValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArraySetValueTemplate divActionArraySetValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionArraySetValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionArraySetValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArraySetValueTemplate divActionArraySetValueTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
