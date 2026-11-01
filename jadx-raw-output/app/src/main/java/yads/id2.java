package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class id2 implements ub3 {
    @Override // yads.ub3
    public final String a(String str, JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString(str);
        if (strOptString != null && strOptString.length() != 0 && !ck.p.e(strOptString, "null")) {
            return strOptString;
        }
        throw new z02("Native Ad json has not required attributes");
    }
}
