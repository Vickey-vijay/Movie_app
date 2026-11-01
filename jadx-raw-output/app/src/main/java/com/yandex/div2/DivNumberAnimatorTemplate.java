package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNumberAnimatorTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivNumberAnimatorTemplate implements JSONSerializable, JsonTemplate<DivNumberAnimator> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f48114l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<DivAnimationDirection> f48115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DivCount.b f48117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression<Long> f48118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivNumberAnimatorTemplate> f48119q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAnimationDirection>> f48121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f48122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Double>> f48124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<String> f48125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f48126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<DivCountTemplate> f48127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<Long>> f48128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<Double>> f48129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<String> f48130k;

    /* JADX INFO: compiled from: DivNumberAnimatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivNumberAnimatorTemplate(Field<List<DivActionTemplate>> field, Field<Expression<DivAnimationDirection>> field2, Field<Expression<Long>> field3, Field<List<DivActionTemplate>> field4, Field<Expression<Double>> field5, Field<String> field6, Field<Expression<DivAnimationInterpolator>> field7, Field<DivCountTemplate> field8, Field<Expression<Long>> field9, Field<Expression<Double>> field10, Field<String> field11) {
        this.f48120a = field;
        this.f48121b = field2;
        this.f48122c = field3;
        this.f48123d = field4;
        this.f48124e = field5;
        this.f48125f = field6;
        this.f48126g = field7;
        this.f48127h = field8;
        this.f48128i = field9;
        this.f48129j = field10;
        this.f48130k = field11;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48115m = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f48116n = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f48117o = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f48118p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48119q = new bk.p<ParsingEnvironment, JSONObject, DivNumberAnimatorTemplate>() { // from class: com.yandex.div2.DivNumberAnimatorTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivNumberAnimatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivNumberAnimatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivNumberAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivNumberAnimatorTemplate divNumberAnimatorTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divNumberAnimatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivNumberAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivNumberAnimatorTemplate divNumberAnimatorTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
