package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFadeTransitionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFadeTransitionTemplate implements JSONSerializable, JsonTemplate<DivFadeTransition> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47125e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Double> f47126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Long> f47127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f47128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f47129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFadeTransitionTemplate> f47130j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Double>> f47131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f47132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f47133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Long>> f47134d;

    /* JADX INFO: compiled from: DivFadeTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFadeTransitionTemplate(Field<Expression<Double>> field, Field<Expression<Long>> field2, Field<Expression<DivAnimationInterpolator>> field3, Field<Expression<Long>> field4) {
        this.f47131a = field;
        this.f47132b = field2;
        this.f47133c = field3;
        this.f47134d = field4;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47126f = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f47127g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f47128h = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f47129i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47130j = new bk.p<ParsingEnvironment, JSONObject, DivFadeTransitionTemplate>() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFadeTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivFadeTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFadeTransitionTemplate(ParsingEnvironment parsingEnvironment, DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFadeTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFadeTransitionTemplate(ParsingEnvironment parsingEnvironment, DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Double>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<DivAnimationInterpolator>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
