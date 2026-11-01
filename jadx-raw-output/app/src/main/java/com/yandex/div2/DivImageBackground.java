package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageBackground.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivImageBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f47579i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Double> f47580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Boolean> f47583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<DivImageScale> f47584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivImageBackground> f47585o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Double> f47586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f47587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f47588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivFilter> f47589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Uri> f47590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Boolean> f47591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<DivImageScale> f47592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f47593h;

    public final boolean a(DivImageBackground divImageBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divImageBackground == null) {
            return false;
        }
        if (!(this.f47586a.evaluate(expressionResolver).doubleValue() == divImageBackground.f47586a.evaluate(expressionResolver2).doubleValue()) || this.f47587b.evaluate(expressionResolver) != divImageBackground.f47587b.evaluate(expressionResolver2) || this.f47588c.evaluate(expressionResolver) != divImageBackground.f47588c.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivFilter> list = this.f47589d;
        if (list != null) {
            List<DivFilter> list2 = divImageBackground.f47589d;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivFilter) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divImageBackground.f47589d == null;
        }
        return z10 && ck.p.e(this.f47590e.evaluate(expressionResolver), divImageBackground.f47590e.evaluate(expressionResolver2)) && this.f47591f.evaluate(expressionResolver).booleanValue() == divImageBackground.f47591f.evaluate(expressionResolver2).booleanValue() && this.f47592g.evaluate(expressionResolver) == divImageBackground.f47592g.evaluate(expressionResolver2);
    }

    /* JADX INFO: compiled from: DivImageBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivImageBackground a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().U3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47580j = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f47581k = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f47582l = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47583m = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47584n = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f47585o = new bk.p<ParsingEnvironment, JSONObject, DivImageBackground>() { // from class: com.yandex.div2.DivImageBackground$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImageBackground mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivImageBackground.f47579i.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47593h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivImageBackground.class).hashCode() + this.f47586a.hashCode() + this.f47587b.hashCode() + this.f47588c.hashCode();
        List<DivFilter> list = this.f47589d;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivFilter) it.next()).hash();
            }
        }
        int iHashCode2 = iHashCode + iHash + this.f47590e.hashCode() + this.f47591f.hashCode() + this.f47592g.hashCode();
        this.f47593h = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivImageBackground(Expression<Double> expression, Expression<DivAlignmentHorizontal> expression2, Expression<DivAlignmentVertical> expression3, List<? extends DivFilter> list, Expression<Uri> expression4, Expression<Boolean> expression5, Expression<DivImageScale> expression6) {
        this.f47586a = expression;
        this.f47587b = expression2;
        this.f47588c = expression3;
        this.f47589d = list;
        this.f47590e = expression4;
        this.f47591f = expression5;
        this.f47592g = expression6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
