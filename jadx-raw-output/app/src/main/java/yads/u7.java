package yads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class u7 {
    public static f8 a(JSONObject jSONObject) {
        Object objM3458constructorimpl;
        Set setF;
        Map mapJ;
        String str = "usagePercent";
        if (jSONObject == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            boolean z10 = jSONObject.getBoolean("isEnabled");
            boolean z11 = jSONObject.getBoolean("isInDebug");
            String string = jSONObject.getString("apiKey");
            long j10 = jSONObject.getLong("validationTimeoutInSec");
            int i10 = jSONObject.getInt("usagePercent");
            boolean z12 = jSONObject.getBoolean("willBlockAdOnInternalError");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("enabledAdUnits");
            if (jSONArrayOptJSONArray != null) {
                Set setB = nj.p0.b();
                int length = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String string2 = jSONArrayOptJSONArray.getString(i11);
                    if (string2.length() > 0) {
                        setB.add(string2);
                    }
                }
                setF = nj.p0.a(setB);
            } else {
                setF = null;
            }
            if (setF == null) {
                setF = nj.q0.f();
            }
            Set set = setF;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adNetworksCustomParameters");
            if (jSONObjectOptJSONObject != null) {
                Map mapD = nj.l0.d();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(next);
                    mapD.put(next, new h8(jSONObject2.getBoolean("isDisabled"), jSONObject2.getInt(str)));
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    str = str;
                }
                mapJ = nj.l0.c(mapD);
            } else {
                mapJ = null;
            }
            if (mapJ == null) {
                mapJ = kotlin.collections.a.j();
            }
            objM3458constructorimpl = Result.m3458constructorimpl(new f8(z10, z11, string, j10, i10, z12, set, mapJ));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            jSONObject.toString();
            boolean z13 = ad1.f75480a;
        }
        return (f8) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public static String a(f8 f8Var) {
        if (f8Var == null) {
            return null;
        }
        cl.s sVar = new cl.s();
        cl.h.b(sVar, "isEnabled", Boolean.valueOf(f8Var.f77325a));
        cl.h.b(sVar, "isInDebug", Boolean.valueOf(f8Var.f77326b));
        cl.h.d(sVar, "apiKey", f8Var.f77327c);
        cl.h.c(sVar, "validationTimeoutInSec", Long.valueOf(f8Var.f77328d));
        cl.h.c(sVar, "usagePercent", Integer.valueOf(f8Var.f77329e));
        cl.h.b(sVar, "willBlockAdOnInternalError", Boolean.valueOf(f8Var.f77330f));
        cl.h.e(sVar, "enabledAdUnits", new r7(f8Var));
        cl.h.f(sVar, "adNetworksCustomParameters", new t7(f8Var));
        return sVar.a().toString();
    }

    public static f8 a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(a(new JSONObject(str)));
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
        return (f8) objM3458constructorimpl;
    }
}
