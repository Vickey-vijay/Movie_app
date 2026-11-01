package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTransformTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivTransformTemplate implements JSONSerializable, JsonTemplate<DivTransform> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49903d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DivPivot.c f49904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DivPivot.c f49905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTransformTemplate> f49906g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivPivotTemplate> f49907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivPivotTemplate> f49908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Double>> f49909c;

    /* JADX INFO: compiled from: DivTransformTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTransformTemplate(Field<DivPivotTemplate> field, Field<DivPivotTemplate> field2, Field<Expression<Double>> field3) {
        this.f49907a = field;
        this.f49908b = field2;
        this.f49909c = field3;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        f49904e = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f49905f = new DivPivot.c(new DivPivotPercentage(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f49906g = new bk.p<ParsingEnvironment, JSONObject, DivTransformTemplate>() { // from class: com.yandex.div2.DivTransformTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTransformTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTransformTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTransformTemplate(ParsingEnvironment parsingEnvironment, DivTransformTemplate divTransformTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTransformTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTransformTemplate(ParsingEnvironment parsingEnvironment, DivTransformTemplate divTransformTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
