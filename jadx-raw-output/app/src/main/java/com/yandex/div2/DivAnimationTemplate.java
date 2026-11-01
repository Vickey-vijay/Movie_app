package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimationTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivAnimationTemplate implements JSONSerializable, JsonTemplate<DivAnimation> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f46460i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f46461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f46462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DivCount.c f46463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Long> f46464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAnimationTemplate> f46465n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Double>> f46467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f46468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivAnimationTemplate>> f46469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAnimation.Name>> f46470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<DivCountTemplate> f46471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Long>> f46472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<Expression<Double>> f46473h;

    /* JADX INFO: compiled from: DivAnimationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivAnimationTemplate(Field<Expression<Long>> field, Field<Expression<Double>> field2, Field<Expression<DivAnimationInterpolator>> field3, Field<List<DivAnimationTemplate>> field4, Field<Expression<DivAnimation.Name>> field5, Field<DivCountTemplate> field6, Field<Expression<Long>> field7, Field<Expression<Double>> field8) {
        this.f46466a = field;
        this.f46467b = field2;
        this.f46468c = field3;
        this.f46469d = field4;
        this.f46470e = field5;
        this.f46471f = field6;
        this.f46472g = field7;
        this.f46473h = field8;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46461j = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        f46462k = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        f46463l = new DivCount.c(new DivInfinityCount());
        f46464m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46465n = new bk.p<ParsingEnvironment, JSONObject, DivAnimationTemplate>() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAnimationTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivAnimationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAnimationTemplate(ParsingEnvironment parsingEnvironment, DivAnimationTemplate divAnimationTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAnimationTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivAnimationTemplate(ParsingEnvironment parsingEnvironment, DivAnimationTemplate divAnimationTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
