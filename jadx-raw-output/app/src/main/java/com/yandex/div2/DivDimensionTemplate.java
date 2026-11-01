package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDimensionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivDimensionTemplate implements JSONSerializable, JsonTemplate<DivDimension> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46991c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f46992d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDimensionTemplate> f46993e = new bk.p<ParsingEnvironment, JSONObject, DivDimensionTemplate>() { // from class: com.yandex.div2.DivDimensionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDimensionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivDimensionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f46994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Double>> f46995b;

    /* JADX INFO: compiled from: DivDimensionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivDimensionTemplate(Field<Expression<DivSizeUnit>> field, Field<Expression<Double>> field2) {
        this.f46994a = field;
        this.f46995b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivDimensionTemplate(ParsingEnvironment parsingEnvironment, DivDimensionTemplate divDimensionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDimensionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDimensionTemplate(ParsingEnvironment parsingEnvironment, DivDimensionTemplate divDimensionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
