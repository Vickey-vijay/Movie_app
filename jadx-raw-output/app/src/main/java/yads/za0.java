package yads;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class za0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f85262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vg2 f85263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l83 f85264c;

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, z02 {
        List listA;
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || ck.p.e(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        this.f85262a.getClass();
        String strA = sa3.a("fallbackUrl", jSONObject);
        this.f85264c.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("fallbackTrackingUrls");
        JSONArray jSONArray = null;
        List listA2 = jSONArrayOptJSONArray == null ? null : l83.a(jSONArrayOptJSONArray);
        if (jSONObject.has("preferredPackages")) {
            jSONArray = jSONObject.getJSONArray("preferredPackages");
        } else if (jSONObject.has("preferredLinks")) {
            jSONArray = jSONObject.getJSONArray("preferredLinks");
        }
        vg2 vg2Var = this.f85263b;
        vg2Var.getClass();
        if (jSONArray == null) {
            listA = nj.s.k();
        } else {
            List listC = nj.r.c();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    listC.add(vg2Var.f83910a.a(jSONObjectOptJSONObject));
                }
            }
            listA = nj.r.a(listC);
        }
        return new wa0(strOptString, strA, listA2, listA);
    }

    public za0(sa3 sa3Var, vg2 vg2Var, l83 l83Var) {
        this.f85262a = sa3Var;
        this.f85263b = vg2Var;
        this.f85264c = l83Var;
    }
}
