package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlideTransitionTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSlideTransitionTemplate implements JSONSerializable, JsonTemplate<DivSlideTransition> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48856f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Long> f48857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<DivSlideTransition.Edge> f48858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f48860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSlideTransitionTemplate> f48861k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivDimensionTemplate> f48862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f48863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivSlideTransition.Edge>> f48864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f48865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Long>> f48866e;

    /* JADX INFO: compiled from: DivSlideTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivSlideTransitionTemplate(Field<DivDimensionTemplate> field, Field<Expression<Long>> field2, Field<Expression<DivSlideTransition.Edge>> field3, Field<Expression<DivAnimationInterpolator>> field4, Field<Expression<Long>> field5) {
        this.f48862a = field;
        this.f48863b = field2;
        this.f48864c = field3;
        this.f48865d = field4;
        this.f48866e = field5;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48857g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f48858h = Expression.Companion.constant$default(companion, DivSlideTransition.Edge.BOTTOM, null, 2, null);
        f48859i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f48860j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48861k = new bk.p<ParsingEnvironment, JSONObject, DivSlideTransitionTemplate>() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlideTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivSlideTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSlideTransitionTemplate(ParsingEnvironment parsingEnvironment, DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divSlideTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivSlideTransitionTemplate(ParsingEnvironment parsingEnvironment, DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
