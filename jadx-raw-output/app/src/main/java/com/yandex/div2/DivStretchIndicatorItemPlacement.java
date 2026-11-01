package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStretchIndicatorItemPlacement.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivStretchIndicatorItemPlacement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49113d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DivFixedSize f49114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Long> f49115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacement> f49116g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivFixedSize f49117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f49118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f49119c;

    /* JADX WARN: Multi-variable type inference failed */
    public DivStretchIndicatorItemPlacement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivStretchIndicatorItemPlacement(DivFixedSize divFixedSize, Expression<Long> expression) {
        this.f49117a = divFixedSize;
        this.f49118b = expression;
    }

    public final boolean a(DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divStretchIndicatorItemPlacement != null && this.f49117a.a(divStretchIndicatorItemPlacement.f49117a, expressionResolver, expressionResolver2) && this.f49118b.evaluate(expressionResolver).longValue() == divStretchIndicatorItemPlacement.f49118b.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivStretchIndicatorItemPlacement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivStretchIndicatorItemPlacement a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49114e = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f49115f = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f49116g = new bk.p<ParsingEnvironment, JSONObject, DivStretchIndicatorItemPlacement>() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacement$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivStretchIndicatorItemPlacement mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivStretchIndicatorItemPlacement.f49113d.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49119c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivStretchIndicatorItemPlacement.class).hashCode() + this.f49117a.hash() + this.f49118b.hashCode();
        this.f49119c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivStretchIndicatorItemPlacement(DivFixedSize divFixedSize, Expression expression, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f49114e : divFixedSize, (i10 & 2) != 0 ? f49115f : expression);
    }
}
