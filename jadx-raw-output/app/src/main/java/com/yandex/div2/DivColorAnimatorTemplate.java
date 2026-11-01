package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivColorAnimatorTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivColorAnimatorTemplate implements JSONSerializable, JsonTemplate<DivColorAnimator> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f46675l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<DivAnimationDirection> f46676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f46677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DivCount.b f46678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression<Long> f46679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivColorAnimatorTemplate> f46680q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAnimationDirection>> f46682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f46683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f46684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Integer>> f46685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<String> f46686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f46687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<DivCountTemplate> f46688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<Long>> f46689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<Integer>> f46690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<String> f46691k;

    /* JADX INFO: compiled from: DivColorAnimatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivColorAnimatorTemplate(Field<List<DivActionTemplate>> field, Field<Expression<DivAnimationDirection>> field2, Field<Expression<Long>> field3, Field<List<DivActionTemplate>> field4, Field<Expression<Integer>> field5, Field<String> field6, Field<Expression<DivAnimationInterpolator>> field7, Field<DivCountTemplate> field8, Field<Expression<Long>> field9, Field<Expression<Integer>> field10, Field<String> field11) {
        this.f46681a = field;
        this.f46682b = field2;
        this.f46683c = field3;
        this.f46684d = field4;
        this.f46685e = field5;
        this.f46686f = field6;
        this.f46687g = field7;
        this.f46688h = field8;
        this.f46689i = field9;
        this.f46690j = field10;
        this.f46691k = field11;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46676m = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f46677n = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f46678o = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f46679p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46680q = new bk.p<ParsingEnvironment, JSONObject, DivColorAnimatorTemplate>() { // from class: com.yandex.div2.DivColorAnimatorTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivColorAnimatorTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivColorAnimatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivColorAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivColorAnimatorTemplate divColorAnimatorTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divColorAnimatorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivColorAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivColorAnimatorTemplate divColorAnimatorTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
