package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAbsoluteEdgeInsets.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivAbsoluteEdgeInsets implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f45971f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Long> f45972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f45973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f45974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f45975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsets> f45976k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f45977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f45978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f45979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Long> f45980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f45981e;

    public DivAbsoluteEdgeInsets() {
        this(null, null, null, null, 15, null);
    }

    public DivAbsoluteEdgeInsets(Expression<Long> expression, Expression<Long> expression2, Expression<Long> expression3, Expression<Long> expression4) {
        this.f45977a = expression;
        this.f45978b = expression2;
        this.f45979c = expression3;
        this.f45980d = expression4;
    }

    public final boolean a(DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divAbsoluteEdgeInsets != null && this.f45977a.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f45977a.evaluate(expressionResolver2).longValue() && this.f45978b.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f45978b.evaluate(expressionResolver2).longValue() && this.f45979c.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f45979c.evaluate(expressionResolver2).longValue() && this.f45980d.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f45980d.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsets.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAbsoluteEdgeInsets a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().E().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f45972g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45973h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45974i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45975j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45976k = new bk.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsets>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsets$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAbsoluteEdgeInsets mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivAbsoluteEdgeInsets.f45971f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f45981e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivAbsoluteEdgeInsets.class).hashCode() + this.f45977a.hashCode() + this.f45978b.hashCode() + this.f45979c.hashCode() + this.f45980d.hashCode();
        this.f45981e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAbsoluteEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f45972g : expression, (i10 & 2) != 0 ? f45973h : expression2, (i10 & 4) != 0 ? f45974i : expression3, (i10 & 8) != 0 ? f45975j : expression4);
    }
}
