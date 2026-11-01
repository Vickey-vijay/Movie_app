package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollBy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionScrollBy implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f46179g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Boolean> f46180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f46181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f46182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Overflow> f46183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionScrollBy> f46184l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f46185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f46186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f46187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Long> f46188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Overflow> f46189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f46190f;

    /* JADX INFO: compiled from: DivActionScrollBy.kt */
    public enum Overflow {
        CLAMP("clamp"),
        RING("ring");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Overflow, String> TO_STRING = new bk.l<Overflow, String>() { // from class: com.yandex.div2.DivActionScrollBy$Overflow$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivActionScrollBy.Overflow overflow) {
                return DivActionScrollBy.Overflow.Converter.b(overflow);
            }
        };
        public static final bk.l<String, Overflow> FROM_STRING = new bk.l<String, Overflow>() { // from class: com.yandex.div2.DivActionScrollBy$Overflow$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivActionScrollBy.Overflow invoke(String str) {
                return DivActionScrollBy.Overflow.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivActionScrollBy.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Overflow a(String str) {
                Overflow overflow = Overflow.CLAMP;
                if (ck.p.e(str, overflow.value)) {
                    return overflow;
                }
                Overflow overflow2 = Overflow.RING;
                if (ck.p.e(str, overflow2.value)) {
                    return overflow2;
                }
                return null;
            }

            public final String b(Overflow overflow) {
                return overflow.value;
            }
        }

        Overflow(String str) {
            this.value = str;
        }
    }

    public final boolean a(DivActionScrollBy divActionScrollBy, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionScrollBy != null && this.f46185a.evaluate(expressionResolver).booleanValue() == divActionScrollBy.f46185a.evaluate(expressionResolver2).booleanValue() && ck.p.e(this.f46186b.evaluate(expressionResolver), divActionScrollBy.f46186b.evaluate(expressionResolver2)) && this.f46187c.evaluate(expressionResolver).longValue() == divActionScrollBy.f46187c.evaluate(expressionResolver2).longValue() && this.f46188d.evaluate(expressionResolver).longValue() == divActionScrollBy.f46188d.evaluate(expressionResolver2).longValue() && this.f46189e.evaluate(expressionResolver) == divActionScrollBy.f46189e.evaluate(expressionResolver2);
    }

    /* JADX INFO: compiled from: DivActionScrollBy.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionScrollBy a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().A0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46180h = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f46181i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46182j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46183k = Expression.Companion.constant$default(companion, Overflow.CLAMP, null, 2, null);
        f46184l = new bk.p<ParsingEnvironment, JSONObject, DivActionScrollBy>() { // from class: com.yandex.div2.DivActionScrollBy$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionScrollBy mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivActionScrollBy.f46179g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46190f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionScrollBy.class).hashCode() + this.f46185a.hashCode() + this.f46186b.hashCode() + this.f46187c.hashCode() + this.f46188d.hashCode() + this.f46189e.hashCode();
        this.f46190f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionScrollBy(Expression<Boolean> expression, Expression<String> expression2, Expression<Long> expression3, Expression<Long> expression4, Expression<Overflow> expression5) {
        this.f46185a = expression;
        this.f46186b = expression2;
        this.f46187c = expression3;
        this.f46188d = expression4;
        this.f46189e = expression5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
