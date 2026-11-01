package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationSlideTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivPageTransformationSlideTemplate implements JSONSerializable, JsonTemplate<DivPageTransformationSlide> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48219f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Double> f48221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Double> f48222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Double> f48223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Double> f48224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageTransformationSlideTemplate> f48225l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f48226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Double>> f48227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Double>> f48228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Double>> f48229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Double>> f48230e;

    /* JADX INFO: compiled from: DivPageTransformationSlideTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPageTransformationSlideTemplate(Field<Expression<DivAnimationInterpolator>> field, Field<Expression<Double>> field2, Field<Expression<Double>> field3, Field<Expression<Double>> field4, Field<Expression<Double>> field5) {
        this.f48226a = field;
        this.f48227b = field2;
        this.f48228c = field3;
        this.f48229d = field4;
        this.f48230e = field5;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48220g = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f48221h = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48222i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48223j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48224k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f48225l = new bk.p<ParsingEnvironment, JSONObject, DivPageTransformationSlideTemplate>() { // from class: com.yandex.div2.DivPageTransformationSlideTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPageTransformationSlideTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivPageTransformationSlideTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPageTransformationSlideTemplate(ParsingEnvironment parsingEnvironment, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPageTransformationSlideTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPageTransformationSlideTemplate(ParsingEnvironment parsingEnvironment, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
