package com.yandex.div.evaluable.function;

import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.c;
import mj.r;
import nj.b0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DictFunctionsKt {
    public static final Object evaluate(String str, List<? extends Object> list, boolean z10) {
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        JSONObject jSONObject = (JSONObject) b0.f0(list);
        int size = list.size() - 1;
        for (int i10 = 1; i10 < size; i10++) {
            Object obj = list.get(i10);
            p.h(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            try {
                Result.a aVar = Result.Companion;
                p.g(jSONObject);
                Object objOpt = jSONObject.opt(str2);
                jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                objM3458constructorimpl2 = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl2 = Result.m3458constructorimpl(c.a(th2));
            }
            if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl2) != null) {
                throwMissingPropertyException(str, list, str2, z10);
                throw new KotlinNothingValueException();
            }
        }
        Object objR0 = b0.r0(list);
        p.h(objR0, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) objR0;
        try {
            Result.a aVar3 = Result.Companion;
            p.g(jSONObject);
            objM3458constructorimpl = Result.m3458constructorimpl(jSONObject.get(str3));
        } catch (Throwable th3) {
            Result.a aVar4 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th3));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) == null) {
            p.i(objM3458constructorimpl, "runCatching { dict!!.get…propName, isMethod)\n    }");
            return objM3458constructorimpl;
        }
        throwMissingPropertyException(str, list, str3, z10);
        throw new KotlinNothingValueException();
    }

    public static final Object evaluateSafe(List<? extends Object> list, Object obj, boolean z10) {
        p.j(list, "args");
        p.j(obj, "fallback");
        int i10 = !z10 ? 1 : 0;
        Object obj2 = list.get(i10);
        JSONObject jSONObjectOptJSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
        if (jSONObjectOptJSONObject == null) {
            return obj;
        }
        int size = list.size() - 1;
        for (int i11 = i10 + 1; i11 < size; i11++) {
            Object obj3 = list.get(i11);
            p.h(obj3, "null cannot be cast to non-null type kotlin.String");
            jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject((String) obj3);
            if (jSONObjectOptJSONObject == null) {
                return obj;
            }
        }
        Object objR0 = b0.r0(list);
        p.h(objR0, "null cannot be cast to non-null type kotlin.String");
        return jSONObjectOptJSONObject.opt((String) objR0);
    }

    public static /* synthetic */ Object evaluateSafe$default(List list, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return evaluateSafe(list, obj, z10);
    }

    public static final Void throwDictException(String str, List<? extends Object> list, String str2) {
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        p.j(str2, "message");
        ArrayFunctionsKt.throwException$default("dict", str, list, str2, false, 16, null);
        throw new KotlinNothingValueException();
    }

    public static final Void throwException(String str, List<? extends Object> list, String str2, boolean z10) {
        p.j(str, C3426d4.g.f28493b);
        p.j(list, "args");
        p.j(str2, "message");
        String str3 = z10 ? "" : "<dict>, ";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(b0.p0(list.subList(1, list.size()), null, str + '(' + str3, ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.DictFunctionsKt$throwException$signature$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final CharSequence invoke(Object obj) {
                p.j(obj, "it");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null), str2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private static final Void throwMissingPropertyException(String str, List<? extends Object> list, String str2, boolean z10) {
        throwException(str, list, "Missing property \"" + str2 + "\" in the dict.", z10);
        throw new KotlinNothingValueException();
    }

    public static final Void throwWrongTypeException(String str, List<? extends Object> list, EvaluableType evaluableType, Object obj, boolean z10) {
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
        throwException(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + simpleName + '.', z10);
        throw new KotlinNothingValueException();
    }
}
