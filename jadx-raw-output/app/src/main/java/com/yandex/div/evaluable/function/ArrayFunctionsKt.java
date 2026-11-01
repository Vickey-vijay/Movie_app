package com.yandex.div.evaluable.function;

import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.c;
import nj.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ArrayFunctionsKt {
    private static final void checkIndexOfBoundException(String str, List<? extends Object> list, boolean z10) {
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type org.json.JSONArray");
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        if (jLongValue < length) {
            return;
        }
        throwArrayException(str, list, "Requested index (" + jLongValue + ") out of bounds array size (" + length + ").", z10);
        throw new KotlinNothingValueException();
    }

    public static final Color safeConvertToColor(String str) {
        Object objM3458constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Color.m3368boximpl(Color.Companion.m3378parseC4zCDoM(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        return (Color) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public static final String safeConvertToUrl(String str) {
        Object objM3458constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Url.m3379boximpl(Url.Companion.m3386fromVcSV9u8(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        Url url = (Url) objM3458constructorimpl;
        if (url != null) {
            return url.m3385unboximpl();
        }
        return null;
    }

    public static /* synthetic */ void checkIndexOfBoundException$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        checkIndexOfBoundException(str, list, z10);
    }

    public static final Object evaluateArray(String str, List<? extends Object> list, boolean z10) throws JSONException {
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        checkIndexOfBoundException(str, list, z10);
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.Long");
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        p.i(obj3, "array.get(index.toInt())");
        return obj3;
    }

    public static /* synthetic */ Object evaluateArray$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return evaluateArray(str, list, z10);
    }

    public static final Object evaluateSafe(String str, List<? extends Object> list) {
        Object objM3458constructorimpl;
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        try {
            Result.a aVar = Result.Companion;
            checkIndexOfBoundException$default(str, list, false, 4, null);
            Object obj = list.get(0);
            p.h(obj, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj2 = list.get(1);
            p.h(obj2, "null cannot be cast to non-null type kotlin.Long");
            objM3458constructorimpl = Result.m3458constructorimpl(((JSONArray) obj).get((int) ((Long) obj2).longValue()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            return null;
        }
        return objM3458constructorimpl;
    }

    public static final Void throwArrayException(String str, List<? extends Object> list, String str2, boolean z10) {
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        p.j(str2, "message");
        throwException("array", str, list, str2, z10);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwArrayException$default(String str, List list, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return throwArrayException(str, list, str2, z10);
    }

    public static final void throwArrayWrongTypeException(String str, List<? extends Object> list, EvaluableType evaluableType, Object obj, boolean z10) {
        String simpleName;
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        p.j(evaluableType, "expected");
        p.j(obj, "actual");
        if (p.e(obj, JSONObject.NULL)) {
            simpleName = "Null";
        } else if (obj instanceof Number) {
            simpleName = "Number";
        } else if (obj instanceof JSONObject) {
            simpleName = "Dict";
        } else {
            simpleName = obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName();
        }
        throwArrayException(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + simpleName + '.', z10);
        throw new KotlinNothingValueException();
    }

    public static final Void throwException(String str, String str2, List<? extends Object> list, String str3, boolean z10) {
        String str4;
        p.j(str, "type");
        p.j(str2, C3426d4.g.f28493b);
        p.j(list, "args");
        p.j(str3, "message");
        if (z10) {
            str4 = "";
        } else {
            str4 = '<' + str + ">, ";
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(b0.p0(list.subList(1, list.size()), null, str2 + '(' + str4, ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.ArrayFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final CharSequence invoke(Object obj) {
                p.j(obj, "it");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null), str3, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void throwException$default(String str, String str2, List list, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return throwException(str, str2, list, str3, z10);
    }
}
