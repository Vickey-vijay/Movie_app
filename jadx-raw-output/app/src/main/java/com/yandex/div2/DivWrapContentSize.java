package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSize.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivWrapContentSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50123e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivWrapContentSize> f50124f = new bk.p<ParsingEnvironment, JSONObject, DivWrapContentSize>() { // from class: com.yandex.div2.DivWrapContentSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivWrapContentSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivWrapContentSize.f50123e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f50125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivSizeUnitValue f50126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivSizeUnitValue f50127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f50128d;

    public DivWrapContentSize() {
        this(null, null, null, 7, null);
    }

    public DivWrapContentSize(Expression<Boolean> expression, DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2) {
        this.f50125a = expression;
        this.f50126b = divSizeUnitValue;
        this.f50127c = divSizeUnitValue2;
    }

    public final boolean a(DivWrapContentSize divWrapContentSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        if (divWrapContentSize == null) {
            return false;
        }
        Expression<Boolean> expression = this.f50125a;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Boolean> expression2 = divWrapContentSize.f50125a;
        if (!ck.p.e(boolEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue = this.f50126b;
        if (divSizeUnitValue != null) {
            zA = divSizeUnitValue.a(divWrapContentSize.f50126b, expressionResolver, expressionResolver2);
        } else {
            zA = divWrapContentSize.f50126b == null;
        }
        if (!zA) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue2 = this.f50127c;
        DivSizeUnitValue divSizeUnitValue3 = divWrapContentSize.f50127c;
        if (divSizeUnitValue2 != null) {
            zA2 = divSizeUnitValue2.a(divSizeUnitValue3, expressionResolver, expressionResolver2);
        } else {
            zA2 = divSizeUnitValue3 == null;
        }
        return zA2;
    }

    /* JADX INFO: compiled from: DivWrapContentSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivWrapContentSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50128d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivWrapContentSize.class).hashCode();
        Expression<Boolean> expression = this.f50125a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        DivSizeUnitValue divSizeUnitValue = this.f50126b;
        int iHash = iHashCode2 + (divSizeUnitValue != null ? divSizeUnitValue.hash() : 0);
        DivSizeUnitValue divSizeUnitValue2 = this.f50127c;
        int iHash2 = iHash + (divSizeUnitValue2 != null ? divSizeUnitValue2.hash() : 0);
        this.f50128d = Integer.valueOf(iHash2);
        return iHash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivWrapContentSize(Expression expression, DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : divSizeUnitValue, (i10 & 4) != 0 ? null : divSizeUnitValue2);
    }
}
