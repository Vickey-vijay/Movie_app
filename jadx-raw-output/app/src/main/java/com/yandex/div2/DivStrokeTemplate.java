package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivStrokeTemplate implements JSONSerializable, JsonTemplate<DivStroke> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49164e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DivStrokeStyle.c f49165f = new DivStrokeStyle.c(new DivStrokeStyleSolid());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f49166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Double> f49167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeTemplate> f49168i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f49169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivStrokeStyleTemplate> f49170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f49171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f49172d;

    /* JADX INFO: compiled from: DivStrokeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivStrokeTemplate(Field<Expression<Integer>> field, Field<DivStrokeStyleTemplate> field2, Field<Expression<DivSizeUnit>> field3, Field<Expression<Double>> field4) {
        this.f49169a = field;
        this.f49170b = field2;
        this.f49171c = field3;
        this.f49172d = field4;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49166g = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f49167h = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f49168i = new bk.p<ParsingEnvironment, JSONObject, DivStrokeTemplate>() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStrokeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivStrokeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivStrokeTemplate(ParsingEnvironment parsingEnvironment, DivStrokeTemplate divStrokeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStrokeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivStrokeTemplate(ParsingEnvironment parsingEnvironment, DivStrokeTemplate divStrokeTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Integer>>) companion.nullField(false), (Field<DivStrokeStyleTemplate>) companion.nullField(false), (Field<Expression<DivSizeUnit>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
