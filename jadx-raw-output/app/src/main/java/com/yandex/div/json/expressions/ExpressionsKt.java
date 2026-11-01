package com.yandex.div.json.expressions;

import ck.p;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Expressions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ExpressionsKt {
    public static final <T> boolean equalsToConstant(Expression<T> expression, Expression<T> expression2) {
        if (expression == null && expression2 == null) {
            return true;
        }
        if (expression == null || !isConstant(expression) || expression2 == null || !isConstant(expression2)) {
            return false;
        }
        return ((expression.getRawValue() instanceof JSONObject) || (expression.getRawValue() instanceof JSONArray)) ? p.e(expression.getRawValue().toString(), expression2.getRawValue().toString()) : p.e(expression.getRawValue(), expression2.getRawValue());
    }

    public static final <T> boolean isConstant(Expression<T> expression) {
        return expression instanceof Expression.ConstantExpression;
    }

    public static final <T> boolean isConstantOrNull(Expression<T> expression) {
        return expression == null || isConstant(expression);
    }

    public static final <T> boolean isConstant(ExpressionList<T> expressionList) {
        return expressionList instanceof ConstantExpressionList;
    }

    public static final <T> boolean isConstantOrNull(ExpressionList<T> expressionList) {
        return expressionList == null || isConstant(expressionList);
    }

    public static final <T> boolean equalsToConstant(ExpressionList<T> expressionList, ExpressionList<T> expressionList2) {
        if (expressionList == null && expressionList2 == null) {
            return true;
        }
        return expressionList != null && (expressionList instanceof ConstantExpressionList) && expressionList2 != null && (expressionList2 instanceof ConstantExpressionList) && p.e(((ConstantExpressionList) expressionList).getValues$div_data_release(), ((ConstantExpressionList) expressionList2).getValues$div_data_release());
    }
}
