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

/* JADX INFO: compiled from: DivFocus.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivFocus implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f47202g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFocus> f47203h = new bk.p<ParsingEnvironment, JSONObject, DivFocus>() { // from class: com.yandex.div2.DivFocus$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFocus mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFocus.f47202g.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivBackground> f47204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivBorder f47205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NextFocusIds f47206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f47207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<DivAction> f47208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f47209f;

    /* JADX INFO: compiled from: DivFocus.kt */
    public static final class NextFocusIds implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f47210g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, NextFocusIds> f47211h = new bk.p<ParsingEnvironment, JSONObject, NextFocusIds>() { // from class: com.yandex.div2.DivFocus$NextFocusIds$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFocus.NextFocusIds mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivFocus.NextFocusIds.f47210g.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression<String> f47212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<String> f47213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<String> f47214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<String> f47215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression<String> f47216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f47217f;

        public NextFocusIds() {
            this(null, null, null, null, null, 31, null);
        }

        public NextFocusIds(Expression<String> expression, Expression<String> expression2, Expression<String> expression3, Expression<String> expression4, Expression<String> expression5) {
            this.f47212a = expression;
            this.f47213b = expression2;
            this.f47214c = expression3;
            this.f47215d = expression4;
            this.f47216e = expression5;
        }

        public final boolean a(NextFocusIds nextFocusIds, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (nextFocusIds == null) {
                return false;
            }
            Expression<String> expression = this.f47212a;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = nextFocusIds.f47212a;
            if (!ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression3 = this.f47213b;
            String strEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<String> expression4 = nextFocusIds.f47213b;
            if (!ck.p.e(strEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression5 = this.f47214c;
            String strEvaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<String> expression6 = nextFocusIds.f47214c;
            if (!ck.p.e(strEvaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression7 = this.f47215d;
            String strEvaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = nextFocusIds.f47215d;
            if (!ck.p.e(strEvaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression9 = this.f47216e;
            String strEvaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<String> expression10 = nextFocusIds.f47216e;
            return ck.p.e(strEvaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null);
        }

        /* JADX INFO: compiled from: DivFocus.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final NextFocusIds a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().C3().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f47217f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(NextFocusIds.class).hashCode();
            Expression<String> expression = this.f47212a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            Expression<String> expression2 = this.f47213b;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<String> expression3 = this.f47214c;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<String> expression4 = this.f47215d;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression<String> expression5 = this.f47216e;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            this.f47217f = Integer.valueOf(iHashCode6);
            return iHashCode6;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().C3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ NextFocusIds(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? null : expression4, (i10 & 16) != 0 ? null : expression5);
        }
    }

    public DivFocus() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivFocus(List<? extends DivBackground> list, DivBorder divBorder, NextFocusIds nextFocusIds, List<DivAction> list2, List<DivAction> list3) {
        this.f47204a = list;
        this.f47205b = divBorder;
        this.f47206c = nextFocusIds;
        this.f47207d = list2;
        this.f47208e = list3;
    }

    public final boolean a(DivFocus divFocus, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean zA;
        boolean zA2;
        boolean z11;
        boolean z12;
        if (divFocus == null) {
            return false;
        }
        List<DivBackground> list = this.f47204a;
        if (list != null) {
            List<DivBackground> list2 = divFocus.f47204a;
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
                        if (((DivBackground) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divFocus.f47204a == null;
        }
        if (!z10) {
            return false;
        }
        DivBorder divBorder = this.f47205b;
        if (divBorder != null) {
            zA = divBorder.a(divFocus.f47205b, expressionResolver, expressionResolver2);
        } else {
            zA = divFocus.f47205b == null;
        }
        if (!zA) {
            return false;
        }
        NextFocusIds nextFocusIds = this.f47206c;
        if (nextFocusIds != null) {
            zA2 = nextFocusIds.a(divFocus.f47206c, expressionResolver, expressionResolver2);
        } else {
            zA2 = divFocus.f47206c == null;
        }
        if (!zA2) {
            return false;
        }
        List<DivAction> list3 = this.f47207d;
        if (list3 != null) {
            List<DivAction> list4 = divFocus.f47207d;
            if (list4 == null) {
                return false;
            }
            if (list3.size() == list4.size()) {
                Iterator<T> it2 = list3.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divFocus.f47207d == null;
        }
        if (!z11) {
            return false;
        }
        List<DivAction> list5 = this.f47208e;
        List<DivAction> list6 = divFocus.f47208e;
        if (list5 == null) {
            z12 = list6 == null;
        } else {
            if (list6 == null) {
                return false;
            }
            if (list5.size() == list6.size()) {
                Iterator<T> it3 = list5.iterator();
                int i14 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next3).a(list6.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                }
            }
        }
        return z12;
    }

    /* JADX INFO: compiled from: DivFocus.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFocus a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f47209f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFocus.class).hashCode();
        List<DivBackground> list = this.f47204a;
        int iHash3 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivBackground) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        DivBorder divBorder = this.f47205b;
        int iHash4 = i10 + (divBorder != null ? divBorder.hash() : 0);
        NextFocusIds nextFocusIds = this.f47206c;
        int iHash5 = iHash4 + (nextFocusIds != null ? nextFocusIds.hash() : 0);
        List<DivAction> list2 = this.f47207d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHash5 + iHash2;
        List<DivAction> list3 = this.f47208e;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                iHash3 += ((DivAction) it3.next()).hash();
            }
        }
        int i12 = i11 + iHash3;
        this.f47209f = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFocus(List list, DivBorder divBorder, NextFocusIds nextFocusIds, List list2, List list3, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : divBorder, (i10 & 4) != 0 ? null : nextFocusIds, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : list3);
    }
}
