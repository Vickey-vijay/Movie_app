package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNumberAnimator.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivNumberAnimator implements JSONSerializable, Hashable, oe.b2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f48084m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<DivAnimationDirection> f48085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final DivCount.b f48087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Expression<Long> f48088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivNumberAnimator> f48089r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivAction> f48090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAnimationDirection> f48091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f48092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f48093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Double> f48094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f48096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DivCount f48097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Long> f48098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Double> f48099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f48101l;

    public final boolean f(DivNumberAnimator divNumberAnimator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divNumberAnimator == null) {
            return false;
        }
        List<DivAction> listA = a();
        if (listA != null) {
            List<DivAction> listA2 = divNumberAnimator.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it = listA.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next).a(listA2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divNumberAnimator.a() == null;
        }
        if (!z10 || getDirection().evaluate(expressionResolver) != divNumberAnimator.getDirection().evaluate(expressionResolver2) || getDuration().evaluate(expressionResolver).longValue() != divNumberAnimator.getDuration().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> listD = d();
        if (listD != null) {
            List<DivAction> listD2 = divNumberAnimator.d();
            if (listD2 == null) {
                return false;
            }
            if (listD.size() == listD2.size()) {
                Iterator<T> it2 = listD.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next2).a(listD2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divNumberAnimator.d() == null;
        }
        if (!z11) {
            return false;
        }
        if (!(this.f48094e.evaluate(expressionResolver).doubleValue() == divNumberAnimator.f48094e.evaluate(expressionResolver2).doubleValue()) || !ck.p.e(getId(), divNumberAnimator.getId()) || c().evaluate(expressionResolver) != divNumberAnimator.c().evaluate(expressionResolver2) || !b().a(divNumberAnimator.b(), expressionResolver, expressionResolver2) || e().evaluate(expressionResolver).longValue() != divNumberAnimator.e().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Double> expression = this.f48099j;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divNumberAnimator.f48099j;
        return ck.p.b(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && ck.p.e(g(), divNumberAnimator.g());
    }

    /* JADX INFO: compiled from: DivNumberAnimator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivNumberAnimator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().h5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48085n = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f48086o = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f48087p = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f48088q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48089r = new bk.p<ParsingEnvironment, JSONObject, DivNumberAnimator>() { // from class: com.yandex.div2.DivNumberAnimator$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivNumberAnimator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivNumberAnimator.f48084m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.b2
    public List<DivAction> a() {
        return this.f48090a;
    }

    @Override // oe.b2
    public DivCount b() {
        return this.f48097h;
    }

    @Override // oe.b2
    public Expression<DivAnimationInterpolator> c() {
        return this.f48096g;
    }

    @Override // oe.b2
    public List<DivAction> d() {
        return this.f48093d;
    }

    @Override // oe.b2
    public Expression<Long> e() {
        return this.f48098i;
    }

    public String g() {
        return this.f48100k;
    }

    @Override // oe.b2
    public Expression<DivAnimationDirection> getDirection() {
        return this.f48091b;
    }

    @Override // oe.b2
    public Expression<Long> getDuration() {
        return this.f48092c;
    }

    @Override // oe.b2
    public String getId() {
        return this.f48095f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f48101l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivNumberAnimator.class).hashCode();
        List<DivAction> listA = a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + getDirection().hashCode() + getDuration().hashCode();
        List<DivAction> listD = d();
        if (listD != null) {
            Iterator<T> it2 = listD.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = iHashCode2 + iHash2 + this.f48094e.hashCode() + getId().hashCode() + c().hashCode() + b().hash() + e().hashCode();
        Expression<Double> expression = this.f48099j;
        int iHashCode4 = iHashCode3 + (expression != null ? expression.hashCode() : 0) + g().hashCode();
        this.f48101l = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    public DivNumberAnimator(List<DivAction> list, Expression<DivAnimationDirection> expression, Expression<Long> expression2, List<DivAction> list2, Expression<Double> expression3, String str, Expression<DivAnimationInterpolator> expression4, DivCount divCount, Expression<Long> expression5, Expression<Double> expression6, String str2) {
        this.f48090a = list;
        this.f48091b = expression;
        this.f48092c = expression2;
        this.f48093d = list2;
        this.f48094e = expression3;
        this.f48095f = str;
        this.f48096g = expression4;
        this.f48097h = divCount;
        this.f48098i = expression5;
        this.f48099j = expression6;
        this.f48100k = str2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
