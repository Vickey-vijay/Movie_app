package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bk.l;
import com.ironsource.C3426d4;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.MutableExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JsonExpressionParser {
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.emptyList());

    @Nullable
    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t10 = (T) jSONObject.opt(str);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), null);
    }

    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, lVar, listValidator, JsonParsers.alwaysValid());
    }

    public static <V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Expression<V> expression) {
        writeExpression(parsingContext, jSONObject, str, expression, JsonParsers.doNotConvert());
    }

    @NonNull
    private static <V> ExpressionList<V> emptyExpressionList() {
        return (ExpressionList<V>) EMPTY_EXPRESSION_LIST;
    }

    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, lVar, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, lVar, JsonParsers.alwaysValid(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<? extends V> listEmptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(listEmptyList)) {
                    return emptyExpressionList();
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, listEmptyList));
                return emptyExpressionList();
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, listEmptyList));
                return emptyExpressionList();
            }
        }
        ArrayList arrayList = new ArrayList(length);
        ParsingErrorLogger logger = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            Object objOptSafe = optSafe(jSONArrayOptJSONArray, i10);
            if (objOptSafe != null) {
                if (Expression.mayBeExpression(objOptSafe)) {
                    if (logger == null) {
                        logger = parsingContext.getLogger();
                    }
                    arrayList.add(new Expression.MutableExpression(str + C3426d4.j.f28586d + i10 + C3426d4.j.f28588e, objOptSafe.toString(), lVar, valueValidator, logger, typeHelper, null));
                    z10 = true;
                } else {
                    try {
                        V vInvoke = lVar.invoke(objOptSafe);
                        if (vInvoke != null) {
                            if (typeHelper.isTypeValid(vInvoke)) {
                                try {
                                    if (valueValidator.isValid(vInvoke)) {
                                        arrayList.add(vInvoke);
                                    } else {
                                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, vInvoke));
                                    }
                                } catch (ClassCastException unused2) {
                                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, vInvoke));
                                }
                            } else {
                                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                            }
                        }
                    } catch (ClassCastException unused3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                    } catch (Exception e10) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOptSafe, e10));
                    }
                }
            }
        }
        if (!z10) {
            try {
                if (listValidator.isValid(arrayList)) {
                    return new ConstantExpressionList(arrayList);
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused4) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            if (!(obj instanceof Expression)) {
                arrayList.set(i11, Expression.constant(obj, parsingContext.getLogger()));
            }
        }
        return new MutableExpressionList(str, arrayList, listValidator, parsingContext.getLogger());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Expression<V> expression, @NonNull l<V, R> lVar) {
        if (expression == null) {
            return;
        }
        Object rawValue = expression.getRawValue();
        try {
            if (!(expression instanceof Expression.MutableExpression)) {
                jSONObject.put(str, lVar.invoke(rawValue));
            } else {
                jSONObject.put(str, rawValue);
            }
        } catch (JSONException e10) {
            parsingContext.getLogger().logError(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable ExpressionList<V> expressionList, @NonNull l<V, R> lVar) {
        if (expressionList == null) {
            return;
        }
        int i10 = 0;
        if (expressionList instanceof ConstantExpressionList) {
            List<V> listEvaluate = expressionList.evaluate(ExpressionResolver.EMPTY);
            int size = listEvaluate.size();
            JSONArray jSONArray = new JSONArray();
            while (i10 < size) {
                jSONArray.put(lVar.invoke(listEvaluate.get(i10)));
                i10++;
            }
            try {
                jSONObject.put(str, jSONArray);
                return;
            } catch (JSONException e10) {
                parsingContext.getLogger().logError(e10);
                return;
            }
        }
        if (expressionList instanceof MutableExpressionList) {
            List expressionsInternal = ((MutableExpressionList) expressionList).getExpressionsInternal();
            if (expressionsInternal.isEmpty()) {
                return;
            }
            int size2 = expressionsInternal.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i10 < size2) {
                Expression expression = (Expression) expressionsInternal.get(i10);
                if (expression instanceof Expression.ConstantExpression) {
                    jSONArray2.put(lVar.invoke(expression.evaluate(ExpressionResolver.EMPTY)));
                } else {
                    jSONArray2.put(expression.getRawValue());
                }
                i10++;
            }
            try {
                jSONObject.put(str, jSONArray2);
            } catch (JSONException e11) {
                parsingContext.getLogger().logError(e11);
            }
        }
    }

    @Nullable
    private static <T> T optSafe(JSONArray jSONArray, int i10) {
        T t10 = (T) jSONArray.opt(i10);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, lVar, JsonParsers.alwaysValid(), expression);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            if (Expression.mayBeExpression(objOptSafe)) {
                return new Expression.MutableExpression(str, objOptSafe.toString(), lVar, valueValidator, parsingContext.getLogger(), typeHelper, null);
            }
            try {
                V vInvoke = lVar.invoke(objOptSafe);
                if (vInvoke != null) {
                    if (typeHelper.isTypeValid(vInvoke)) {
                        try {
                            if (valueValidator.isValid(vInvoke)) {
                                return Expression.constant(vInvoke, parsingContext.getLogger());
                            }
                            throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
                        } catch (ClassCastException unused) {
                            throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
                        }
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e10) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator, expression);
    }

    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, lVar, valueValidator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(objOptSafe)) {
            return new Expression.MutableExpression(str, objOptSafe.toString(), lVar, valueValidator, parsingContext.getLogger(), typeHelper, expression);
        }
        try {
            V vInvoke = lVar.invoke(objOptSafe);
            if (vInvoke == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(vInvoke)) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(vInvoke)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                    return null;
                }
                return Expression.constant(vInvoke, parsingContext.getLogger());
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }
}
