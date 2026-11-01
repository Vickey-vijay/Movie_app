package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionUpdateStructureTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionUpdateStructureTemplate implements JSONSerializable, JsonTemplate<DivActionUpdateStructure> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46407d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionUpdateStructureTemplate> f46408e = new bk.p<ParsingEnvironment, JSONObject, DivActionUpdateStructureTemplate>() { // from class: com.yandex.div2.DivActionUpdateStructureTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionUpdateStructureTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionUpdateStructureTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivTypedValueTemplate> f46410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f46411c;

    /* JADX INFO: compiled from: DivActionUpdateStructureTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionUpdateStructureTemplate(Field<Expression<String>> field, Field<DivTypedValueTemplate> field2, Field<Expression<String>> field3) {
        this.f46409a = field;
        this.f46410b = field2;
        this.f46411c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionUpdateStructureTemplate(ParsingEnvironment parsingEnvironment, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionUpdateStructureTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionUpdateStructureTemplate(ParsingEnvironment parsingEnvironment, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
