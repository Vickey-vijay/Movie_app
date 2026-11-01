package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotFixedTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivPivotFixedTemplate implements JSONSerializable, JsonTemplate<DivPivotFixed> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48400c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f48401d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPivotFixedTemplate> f48402e = new bk.p<ParsingEnvironment, JSONObject, DivPivotFixedTemplate>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotFixedTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivPivotFixedTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f48403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f48404b;

    /* JADX INFO: compiled from: DivPivotFixedTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPivotFixedTemplate(Field<Expression<DivSizeUnit>> field, Field<Expression<Long>> field2) {
        this.f48403a = field;
        this.f48404b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().R5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPivotFixedTemplate(ParsingEnvironment parsingEnvironment, DivPivotFixedTemplate divPivotFixedTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPivotFixedTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPivotFixedTemplate(ParsingEnvironment parsingEnvironment, DivPivotFixedTemplate divPivotFixedTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
