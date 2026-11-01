package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class kv implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f79574a;

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        String str = new String[]{"value"}[0];
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            boolean z10 = ad1.f75480a;
            throw new z02("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        String[] strArr = {"url", "size"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str2 = strArr[i10];
            if (!jSONObject2.has(str2) || jSONObject2.isNull(str2)) {
                boolean z11 = ad1.f75480a;
                throw new z02("Native Ad json has not required attributes");
            }
        }
        this.f79574a.getClass();
        return new jv(jSONObject2.optInt("size"), sa3.a("url", jSONObject2));
    }

    public kv(sa3 sa3Var) {
        this.f79574a = sa3Var;
    }
}
