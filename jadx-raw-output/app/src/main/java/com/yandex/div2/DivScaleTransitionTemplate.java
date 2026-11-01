package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivScaleTransitionTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivScaleTransitionTemplate implements JSONSerializable, JsonTemplate<DivScaleTransition> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48562g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f48563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Double> f48565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Double> f48566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Double> f48567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Long> f48568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivScaleTransitionTemplate> f48569n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f48570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f48571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Double>> f48572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f48573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Double>> f48574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<Long>> f48575f;

    /* JADX INFO: compiled from: DivScaleTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivScaleTransitionTemplate(Field<Expression<Long>> field, Field<Expression<DivAnimationInterpolator>> field2, Field<Expression<Double>> field3, Field<Expression<Double>> field4, Field<Expression<Double>> field5, Field<Expression<Long>> field6) {
        this.f48570a = field;
        this.f48571b = field2;
        this.f48572c = field3;
        this.f48573d = field4;
        this.f48574e = field5;
        this.f48575f = field6;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48563h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f48564i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f48565j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48566k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48567l = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f48568m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48569n = new bk.p<ParsingEnvironment, JSONObject, DivScaleTransitionTemplate>() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivScaleTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivScaleTransitionTemplate(parsingEnvironment, (DivScaleTransitionTemplate) null, false, jSONObject, 6, (ck.i) null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivScaleTransitionTemplate(ParsingEnvironment parsingEnvironment, DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divScaleTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivScaleTransitionTemplate(ParsingEnvironment parsingEnvironment, DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<DivAnimationInterpolator>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
