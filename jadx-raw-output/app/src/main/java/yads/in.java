package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class in implements ub3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f78725a;

    public in(hn hnVar) {
        this.f78725a = hnVar;
    }

    @Override // yads.ub3
    public final String a(String str, JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString(str);
        if (strOptString != null && strOptString.length() != 0 && !ck.p.e(strOptString, "null")) {
            this.f78725a.getClass();
            String strB = hn.b(strOptString);
            if (strB != null && strB.length() != 0) {
                return strB;
            }
            throw new z02("Native Ad json has attribute with broken base64 encoding");
        }
        throw new z02("Native Ad json has not required attributes");
    }
}
