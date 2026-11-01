package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class tc implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f82953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m83 f82954b;

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, z02 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || ck.p.e(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        this.f82953a.getClass();
        String strA = sa3.a("url", jSONObject);
        String strA2 = he1.a("optOutUrl", jSONObject);
        if (strA2 == null) {
            strA2 = "";
        }
        this.f82954b.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return new rc(strOptString, strA, strA2, arrayList);
    }

    public tc(sa3 sa3Var, m83 m83Var) {
        this.f82953a = sa3Var;
        this.f82954b = m83Var;
    }
}
