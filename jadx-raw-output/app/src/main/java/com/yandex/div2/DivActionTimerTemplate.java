package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTimerTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionTimerTemplate implements JSONSerializable, JsonTemplate<DivActionTimer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46350c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionTimerTemplate> f46351d = new bk.p<ParsingEnvironment, JSONObject, DivActionTimerTemplate>() { // from class: com.yandex.div2.DivActionTimerTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTimerTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionTimerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivActionTimer.Action>> f46352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f46353b;

    /* JADX INFO: compiled from: DivActionTimerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionTimerTemplate(Field<Expression<DivActionTimer.Action>> field, Field<Expression<String>> field2) {
        this.f46352a = field;
        this.f46353b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionTimerTemplate(ParsingEnvironment parsingEnvironment, DivActionTimerTemplate divActionTimerTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionTimerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionTimerTemplate(ParsingEnvironment parsingEnvironment, DivActionTimerTemplate divActionTimerTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
