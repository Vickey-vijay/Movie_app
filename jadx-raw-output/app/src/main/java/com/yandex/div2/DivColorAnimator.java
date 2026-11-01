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

/* JADX INFO: compiled from: DivColorAnimator.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivColorAnimator implements JSONSerializable, Hashable, oe.b2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f46645m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<DivAnimationDirection> f46646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f46647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final DivCount.b f46648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Expression<Long> f46649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivColorAnimator> f46650r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivAction> f46651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAnimationDirection> f46652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f46653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f46654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Integer> f46655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f46657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DivCount f46658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Long> f46659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Integer> f46660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f46661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f46662l;

    public final boolean f(DivColorAnimator divColorAnimator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divColorAnimator == null) {
            return false;
        }
        List<DivAction> listA = a();
        if (listA != null) {
            List<DivAction> listA2 = divColorAnimator.a();
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
            z10 = divColorAnimator.a() == null;
        }
        if (!z10 || getDirection().evaluate(expressionResolver) != divColorAnimator.getDirection().evaluate(expressionResolver2) || getDuration().evaluate(expressionResolver).longValue() != divColorAnimator.getDuration().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> listD = d();
        if (listD != null) {
            List<DivAction> listD2 = divColorAnimator.d();
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
            z11 = divColorAnimator.d() == null;
        }
        if (!z11 || this.f46655e.evaluate(expressionResolver).intValue() != divColorAnimator.f46655e.evaluate(expressionResolver2).intValue() || !ck.p.e(getId(), divColorAnimator.getId()) || c().evaluate(expressionResolver) != divColorAnimator.c().evaluate(expressionResolver2) || !b().a(divColorAnimator.b(), expressionResolver, expressionResolver2) || e().evaluate(expressionResolver).longValue() != divColorAnimator.e().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Integer> expression = this.f46660j;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divColorAnimator.f46660j;
        return ck.p.e(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && ck.p.e(g(), divColorAnimator.g());
    }

    /* JADX INFO: compiled from: DivColorAnimator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivColorAnimator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().j2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46646n = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f46647o = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f46648p = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f46649q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46650r = new bk.p<ParsingEnvironment, JSONObject, DivColorAnimator>() { // from class: com.yandex.div2.DivColorAnimator$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivColorAnimator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivColorAnimator.f46645m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.b2
    public List<DivAction> a() {
        return this.f46651a;
    }

    @Override // oe.b2
    public DivCount b() {
        return this.f46658h;
    }

    @Override // oe.b2
    public Expression<DivAnimationInterpolator> c() {
        return this.f46657g;
    }

    @Override // oe.b2
    public List<DivAction> d() {
        return this.f46654d;
    }

    @Override // oe.b2
    public Expression<Long> e() {
        return this.f46659i;
    }

    public String g() {
        return this.f46661k;
    }

    @Override // oe.b2
    public Expression<DivAnimationDirection> getDirection() {
        return this.f46652b;
    }

    @Override // oe.b2
    public Expression<Long> getDuration() {
        return this.f46653c;
    }

    @Override // oe.b2
    public String getId() {
        return this.f46656f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f46662l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivColorAnimator.class).hashCode();
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
        int iHashCode3 = iHashCode2 + iHash2 + this.f46655e.hashCode() + getId().hashCode() + c().hashCode() + b().hash() + e().hashCode();
        Expression<Integer> expression = this.f46660j;
        int iHashCode4 = iHashCode3 + (expression != null ? expression.hashCode() : 0) + g().hashCode();
        this.f46662l = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    public DivColorAnimator(List<DivAction> list, Expression<DivAnimationDirection> expression, Expression<Long> expression2, List<DivAction> list2, Expression<Integer> expression3, String str, Expression<DivAnimationInterpolator> expression4, DivCount divCount, Expression<Long> expression5, Expression<Integer> expression6, String str2) {
        this.f46651a = list;
        this.f46652b = expression;
        this.f46653c = expression2;
        this.f46654d = list2;
        this.f46655e = expression3;
        this.f46656f = str;
        this.f46657g = expression4;
        this.f46658h = divCount;
        this.f46659i = expression5;
        this.f46660j = expression6;
        this.f46661k = str2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
