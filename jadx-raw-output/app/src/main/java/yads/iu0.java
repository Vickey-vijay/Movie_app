package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class iu0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f78816a;

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, z02 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || ck.p.e(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String strOptString2 = jSONObject2.optString("title");
            if (strOptString2 == null || strOptString2.length() == 0 || ck.p.e(strOptString2, "null")) {
                throw new z02("Native Ad json has not required attributes");
            }
            this.f78816a.getClass();
            arrayList.add(new fu0(strOptString2, sa3.a("url", jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new z02("Native Ad json has not required attributes");
        }
        return new gu0(strOptString, arrayList);
    }

    public iu0(sa3 sa3Var) {
        this.f78816a = sa3Var;
    }
}
