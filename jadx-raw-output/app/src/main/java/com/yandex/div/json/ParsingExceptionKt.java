package com.yandex.div.json;

import ck.p;
import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import lk.c0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ParsingException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ParsingExceptionKt {
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    public static final ParsingException dependencyFailed(JSONObject jSONObject, String str, ParsingException parsingException) {
        p.h(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(jSONObject, str, (Exception) parsingException);
    }

    public static final <T> ParsingException invalidValue(JSONObject jSONObject, String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' is not valid", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException missingValue(JSONObject jSONObject, String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' is missing", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException missingVariable(String str, String str2, String str3, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "Undefined variable '" + str3 + "' at \"" + str + "\": \"" + str2 + '\"', th2, null, null, 24, null);
    }

    public static final ParsingException typeMismatch(JSONObject jSONObject, String str, Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value for key '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException dependencyFailed(JSONObject jSONObject, String str, Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value for key '" + str + "' is failed to create", exc, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null));
    }

    public static final ParsingException getSILENT_PARSING_EXCEPTION() {
        return SILENT_PARSING_EXCEPTION;
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return missingVariable(str, th2);
    }

    public static final <T> ParsingException resolveFailed(String str, T t10, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' could not be resolved", th2, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException resolveFailed$default(String str, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return resolveFailed(str, obj, th2);
    }

    public static final ParsingException templateNotFound(JSONObject jSONObject, String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, "Template '" + str + "' is missing!", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static /* synthetic */ ParsingException typeMismatch$default(String str, String str2, Object obj, Throwable th2, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            th2 = null;
        }
        return typeMismatch(str, str2, obj, th2);
    }

    private static final String trimLength(Object obj) {
        String strValueOf = String.valueOf(obj);
        if (strValueOf.length() > 100) {
            return c0.x1(strValueOf, 97) + "...";
        }
        return strValueOf;
    }

    public static final ParsingException missingVariable(String str, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "No variable could be resolved for '" + str, th2, null, null, 24, null);
    }

    public static final ParsingException invalidValue(String str, String str2, Object obj, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Field '" + str + "' with expression '" + str2 + "' received wrong value: '" + obj + '\'', th2, null, null, 24, null);
    }

    public static final ParsingException missingValue(String str, String str2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' at path '" + str2 + "' is missing", null, null, null, 28, null);
    }

    public static final ParsingException typeMismatch(JSONArray jSONArray, String str, int i10, Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at " + i10 + " position of '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    public static final ParsingException dependencyFailed(JSONArray jSONArray, String str, int i10, Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at " + i10 + " position of '" + str + "' is failed to create", exc, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null));
    }

    public static final <T> ParsingException invalidValue(JSONObject jSONObject, String str, T t10, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' is not valid", th2, new JsonObject(jSONObject), null, 16, null);
    }

    public static final ParsingException typeMismatch(String str, String str2, Object obj, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Expression '" + str + "': '" + str2 + "' received value of wrong type: '" + obj + '\'', th2, null, null, 24, null);
    }

    public static final <T> ParsingException invalidValue(JSONArray jSONArray, String str, int i10, T t10, Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at " + i10 + " position of '" + str + "' is not valid", th2, new JsonArray(jSONArray), null, 16, null);
    }

    public static final ParsingException typeMismatch(int i10, Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Item builder data at " + i10 + " position has wrong type: " + obj.getClass().getName(), null, null, null, 28, null);
    }

    public static final <T> ParsingException invalidValue(JSONArray jSONArray, String str, int i10, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at " + i10 + " position of '" + str + "' is not valid", null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    public static final <T> ParsingException invalidValue(String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' at path '" + str + "' is not valid", null, null, null, 28, null);
    }

    public static final <T> ParsingException invalidValue(String str, String str2, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t10) + "' for key '" + str + "' at path '" + str2 + "' is not valid", null, null, null, 28, null);
    }
}
