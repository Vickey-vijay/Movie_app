package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ge1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cl.a f77787a = cl.m.b(null, fe1.f77370b, 1, null);

    public static final Integer a(String str, JSONObject jSONObject) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (Integer) objM3458constructorimpl;
    }

    public static Map a(JSONObject jSONObject) {
        Map mapD = nj.l0.d();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null && strOptString.length() != 0 && !ck.p.e("null", strOptString)) {
                mapD.put(next, strOptString);
            }
        }
        return nj.l0.c(mapD);
    }

    public static List b(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            List listC = nj.r.c();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (strOptString != null && strOptString.length() != 0 && !ck.p.e("null", strOptString)) {
                    listC.add(strOptString);
                }
            }
            return nj.r.a(listC);
        }
        return null;
    }

    public static cl.a a() {
        return f77787a;
    }

    public static final JSONObject a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(new JSONObject(str));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (JSONObject) objM3458constructorimpl;
    }
}
