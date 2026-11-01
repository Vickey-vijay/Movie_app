package yads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dn0 {
    public static Set a(JSONArray jSONArray) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Set setB = nj.p0.b();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                setB.add(new bn0(cn0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            objM3458constructorimpl = Result.m3458constructorimpl(nj.p0.a(setB));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            Objects.toString(jSONArray);
            boolean z10 = ad1.f75480a;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (Set) objM3458constructorimpl;
    }

    public static String a(Set set) throws JSONException {
        if (set != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bn0 bn0Var = (bn0) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", bn0Var.f75908a.name());
                jSONObject.put("value", bn0Var.f75909b);
                jSONArray = jSONArray.put(jSONObject);
            }
            if (jSONArray != null) {
                return jSONArray.toString();
            }
        }
        return null;
    }

    public static Set a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(a(new JSONArray(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            boolean z10 = ad1.f75480a;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (Set) objM3458constructorimpl;
    }
}
