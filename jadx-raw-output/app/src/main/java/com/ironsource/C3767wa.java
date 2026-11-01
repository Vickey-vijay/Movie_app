package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3767wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f31534a = 100;

    public static final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        ck.p.j(jSONObject, "lhs");
        ck.p.j(jSONObject2, "rhs");
        return a(jSONObject, jSONObject2, 0);
    }

    public static final boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        ck.p.j(jSONArray, "lhs");
        ck.p.j(jSONArray2, "rhs");
        return a(jSONArray, jSONArray2, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i10 > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        ck.p.i(itKeys, "lhs.keys()");
        for (String str : kk.r.g(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i10)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i10 > 100) {
            return false;
        }
        Iterable iterableQ = ik.k.q(0, jSONArray.length());
        if ((iterableQ instanceof Collection) && ((Collection) iterableQ).isEmpty()) {
            return true;
        }
        Iterator it = iterableQ.iterator();
        while (it.hasNext()) {
            int iNextInt = ((nj.g0) it).nextInt();
            if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i10)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(Object obj, Object obj2, int i10) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i10 + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i10 + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return ck.p.e(obj, obj2);
    }
}
