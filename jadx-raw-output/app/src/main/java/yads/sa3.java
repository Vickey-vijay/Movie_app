package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class sa3 {
    public static String a(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (strOptString != null && strOptString.length() != 0 && !ck.p.e(strOptString, "null")) {
            if (strOptString.length() != 0) {
                return strOptString;
            }
            throw new z02("Native Ad json has not required attributes");
        }
        throw new z02("Native Ad json has not required attributes");
    }
}
