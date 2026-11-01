package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlideTransition.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivSlideTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48831g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f48832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Edge> f48833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f48834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Long> f48835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSlideTransition> f48836l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivDimension f48837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f48838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Edge> f48839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f48840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Long> f48841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f48842f;

    /* JADX INFO: compiled from: DivSlideTransition.kt */
    public enum Edge {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Edge, String> TO_STRING = new bk.l<Edge, String>() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivSlideTransition.Edge edge) {
                return DivSlideTransition.Edge.Converter.b(edge);
            }
        };
        public static final bk.l<String, Edge> FROM_STRING = new bk.l<String, Edge>() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivSlideTransition.Edge invoke(String str) {
                return DivSlideTransition.Edge.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivSlideTransition.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Edge a(String str) {
                Edge edge = Edge.LEFT;
                if (ck.p.e(str, edge.value)) {
                    return edge;
                }
                Edge edge2 = Edge.TOP;
                if (ck.p.e(str, edge2.value)) {
                    return edge2;
                }
                Edge edge3 = Edge.RIGHT;
                if (ck.p.e(str, edge3.value)) {
                    return edge3;
                }
                Edge edge4 = Edge.BOTTOM;
                if (ck.p.e(str, edge4.value)) {
                    return edge4;
                }
                return null;
            }

            public final String b(Edge edge) {
                return edge.value;
            }
        }

        Edge(String str) {
            this.value = str;
        }
    }

    public DivSlideTransition() {
        this(null, null, null, null, null, 31, null);
    }

    public DivSlideTransition(DivDimension divDimension, Expression<Long> expression, Expression<Edge> expression2, Expression<DivAnimationInterpolator> expression3, Expression<Long> expression4) {
        this.f48837a = divDimension;
        this.f48838b = expression;
        this.f48839c = expression2;
        this.f48840d = expression3;
        this.f48841e = expression4;
    }

    public final boolean a(DivSlideTransition divSlideTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divSlideTransition == null) {
            return false;
        }
        DivDimension divDimension = this.f48837a;
        if (divDimension != null) {
            zA = divDimension.a(divSlideTransition.f48837a, expressionResolver, expressionResolver2);
        } else {
            zA = divSlideTransition.f48837a == null;
        }
        return zA && b().evaluate(expressionResolver).longValue() == divSlideTransition.b().evaluate(expressionResolver2).longValue() && this.f48839c.evaluate(expressionResolver) == divSlideTransition.f48839c.evaluate(expressionResolver2) && c().evaluate(expressionResolver) == divSlideTransition.c().evaluate(expressionResolver2) && d().evaluate(expressionResolver).longValue() == divSlideTransition.d().evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivSlideTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSlideTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48832h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f48833i = Expression.Companion.constant$default(companion, Edge.BOTTOM, null, 2, null);
        f48834j = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f48835k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f48836l = new bk.p<ParsingEnvironment, JSONObject, DivSlideTransition>() { // from class: com.yandex.div2.DivSlideTransition$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlideTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivSlideTransition.f48831g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public Expression<Long> b() {
        return this.f48838b;
    }

    public Expression<DivAnimationInterpolator> c() {
        return this.f48840d;
    }

    public Expression<Long> d() {
        return this.f48841e;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48842f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivSlideTransition.class).hashCode();
        DivDimension divDimension = this.f48837a;
        int iHash = iHashCode + (divDimension != null ? divDimension.hash() : 0) + b().hashCode() + this.f48839c.hashCode() + c().hashCode() + d().hashCode();
        this.f48842f = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivSlideTransition(DivDimension divDimension, Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : divDimension, (i10 & 2) != 0 ? f48832h : expression, (i10 & 4) != 0 ? f48833i : expression2, (i10 & 8) != 0 ? f48834j : expression3, (i10 & 16) != 0 ? f48835k : expression4);
    }
}
