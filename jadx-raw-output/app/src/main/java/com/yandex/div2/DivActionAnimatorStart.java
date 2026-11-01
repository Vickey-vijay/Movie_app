package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStart.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionAnimatorStart implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46049j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStart> f46050k = new bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStart>() { // from class: com.yandex.div2.DivActionAnimatorStart$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStart mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionAnimatorStart.f46049j.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<DivAnimationDirection> f46052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Long> f46053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DivTypedValue f46054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAnimationInterpolator> f46055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivCount f46056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Long> f46057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DivTypedValue f46058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f46059i;

    public final boolean a(DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean zA3;
        if (divActionAnimatorStart == null || !ck.p.e(this.f46051a, divActionAnimatorStart.f46051a)) {
            return false;
        }
        Expression<DivAnimationDirection> expression = this.f46052b;
        DivAnimationDirection divAnimationDirectionEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAnimationDirection> expression2 = divActionAnimatorStart.f46052b;
        if (divAnimationDirectionEvaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression3 = this.f46053c;
        Long lEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divActionAnimatorStart.f46053c;
        if (!ck.p.e(lEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivTypedValue divTypedValue = this.f46054d;
        if (divTypedValue != null) {
            zA = divTypedValue.a(divActionAnimatorStart.f46054d, expressionResolver, expressionResolver2);
        } else {
            zA = divActionAnimatorStart.f46054d == null;
        }
        if (!zA) {
            return false;
        }
        Expression<DivAnimationInterpolator> expression5 = this.f46055e;
        DivAnimationInterpolator divAnimationInterpolatorEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<DivAnimationInterpolator> expression6 = divActionAnimatorStart.f46055e;
        if (divAnimationInterpolatorEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivCount divCount = this.f46056f;
        if (divCount != null) {
            zA2 = divCount.a(divActionAnimatorStart.f46056f, expressionResolver, expressionResolver2);
        } else {
            zA2 = divActionAnimatorStart.f46056f == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Long> expression7 = this.f46057g;
        Long lEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divActionAnimatorStart.f46057g;
        if (!ck.p.e(lEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivTypedValue divTypedValue2 = this.f46058h;
        DivTypedValue divTypedValue3 = divActionAnimatorStart.f46058h;
        if (divTypedValue2 != null) {
            zA3 = divTypedValue2.a(divTypedValue3, expressionResolver, expressionResolver2);
        } else {
            zA3 = divTypedValue3 == null;
        }
        return zA3;
    }

    /* JADX INFO: compiled from: DivActionAnimatorStart.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionAnimatorStart a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().K().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46059i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionAnimatorStart.class).hashCode() + this.f46051a.hashCode();
        Expression<DivAnimationDirection> expression = this.f46052b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.f46053c;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        DivTypedValue divTypedValue = this.f46054d;
        int iHash = iHashCode3 + (divTypedValue != null ? divTypedValue.hash() : 0);
        Expression<DivAnimationInterpolator> expression3 = this.f46055e;
        int iHashCode4 = iHash + (expression3 != null ? expression3.hashCode() : 0);
        DivCount divCount = this.f46056f;
        int iHash2 = iHashCode4 + (divCount != null ? divCount.hash() : 0);
        Expression<Long> expression4 = this.f46057g;
        int iHashCode5 = iHash2 + (expression4 != null ? expression4.hashCode() : 0);
        DivTypedValue divTypedValue2 = this.f46058h;
        int iHash3 = iHashCode5 + (divTypedValue2 != null ? divTypedValue2.hash() : 0);
        this.f46059i = Integer.valueOf(iHash3);
        return iHash3;
    }

    public DivActionAnimatorStart(String str, Expression<DivAnimationDirection> expression, Expression<Long> expression2, DivTypedValue divTypedValue, Expression<DivAnimationInterpolator> expression3, DivCount divCount, Expression<Long> expression4, DivTypedValue divTypedValue2) {
        this.f46051a = str;
        this.f46052b = expression;
        this.f46053c = expression2;
        this.f46054d = divTypedValue;
        this.f46055e = expression3;
        this.f46056f = divCount;
        this.f46057g = expression4;
        this.f46058h = divTypedValue2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
