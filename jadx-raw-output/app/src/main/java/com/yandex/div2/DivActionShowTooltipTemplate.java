package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionShowTooltipTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionShowTooltipTemplate implements JSONSerializable, JsonTemplate<DivActionShowTooltip> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46274c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionShowTooltipTemplate> f46275d = new bk.p<ParsingEnvironment, JSONObject, DivActionShowTooltipTemplate>() { // from class: com.yandex.div2.DivActionShowTooltipTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionShowTooltipTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionShowTooltipTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46277b;

    /* JADX INFO: compiled from: DivActionShowTooltipTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionShowTooltipTemplate(Field<Expression<String>> field, Field<Expression<Boolean>> field2) {
        this.f46276a = field;
        this.f46277b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionShowTooltipTemplate(ParsingEnvironment parsingEnvironment, DivActionShowTooltipTemplate divActionShowTooltipTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionShowTooltipTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionShowTooltipTemplate(ParsingEnvironment parsingEnvironment, DivActionShowTooltipTemplate divActionShowTooltipTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
