package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCloudBackground.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivCloudBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46608e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCloudBackground> f46609f = new bk.p<ParsingEnvironment, JSONObject, DivCloudBackground>() { // from class: com.yandex.div2.DivCloudBackground$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCloudBackground mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCloudBackground.f46608e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f46610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Long> f46611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivEdgeInsets f46612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46613d;

    public final boolean a(DivCloudBackground divCloudBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divCloudBackground == null || this.f46610a.evaluate(expressionResolver).intValue() != divCloudBackground.f46610a.evaluate(expressionResolver2).intValue() || this.f46611b.evaluate(expressionResolver).longValue() != divCloudBackground.f46611b.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsets = this.f46612c;
        DivEdgeInsets divEdgeInsets2 = divCloudBackground.f46612c;
        if (divEdgeInsets != null) {
            zA = divEdgeInsets.a(divEdgeInsets2, expressionResolver, expressionResolver2);
        } else {
            zA = divEdgeInsets2 == null;
        }
        return zA;
    }

    /* JADX INFO: compiled from: DivCloudBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivCloudBackground a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().a2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46613d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivCloudBackground.class).hashCode() + this.f46610a.hashCode() + this.f46611b.hashCode();
        DivEdgeInsets divEdgeInsets = this.f46612c;
        int iHash = iHashCode + (divEdgeInsets != null ? divEdgeInsets.hash() : 0);
        this.f46613d = Integer.valueOf(iHash);
        return iHash;
    }

    public DivCloudBackground(Expression<Integer> expression, Expression<Long> expression2, DivEdgeInsets divEdgeInsets) {
        this.f46610a = expression;
        this.f46611b = expression2;
        this.f46612c = divEdgeInsets;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
