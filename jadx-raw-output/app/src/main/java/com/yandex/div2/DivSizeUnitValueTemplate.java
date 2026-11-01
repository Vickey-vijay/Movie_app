package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeUnitValueTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivSizeUnitValueTemplate implements JSONSerializable, JsonTemplate<DivSizeUnitValue> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48826c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f48827d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSizeUnitValueTemplate> f48828e = new bk.p<ParsingEnvironment, JSONObject, DivSizeUnitValueTemplate>() { // from class: com.yandex.div2.DivSizeUnitValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSizeUnitValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivSizeUnitValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f48829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f48830b;

    /* JADX INFO: compiled from: DivSizeUnitValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSizeUnitValueTemplate(Field<Expression<DivSizeUnit>> field, Field<Expression<Long>> field2) {
        this.f48829a = field;
        this.f48830b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSizeUnitValueTemplate(ParsingEnvironment parsingEnvironment, DivSizeUnitValueTemplate divSizeUnitValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSizeUnitValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSizeUnitValueTemplate(ParsingEnvironment parsingEnvironment, DivSizeUnitValueTemplate divSizeUnitValueTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
