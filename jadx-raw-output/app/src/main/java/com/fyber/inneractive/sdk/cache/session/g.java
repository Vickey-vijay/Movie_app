package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14957d;

    public final JSONObject a(boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put("time", this.f14957d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f14954a);
        if (z11) {
            jSONObject.put("com", this.f14956c);
        }
        jSONObject.put("cli", this.f14955b);
        return jSONObject;
    }

    public g(int i10, int i11, int i12, long j10) {
        this.f14957d = j10;
        this.f14954a = i10;
        this.f14955b = i11;
        this.f14956c = i12;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong("time");
            int iOptInt = jSONObject.optInt("cli", -1);
            int iOptInt2 = jSONObject.optInt("imp", -1);
            int iOptInt3 = jSONObject.optInt("com", -1);
            if (jOptLong != 0 && iOptInt >= 0 && iOptInt2 >= 0 && iOptInt3 >= 0) {
                return new g(iOptInt2, iOptInt, iOptInt3, jOptLong);
            }
        }
        return null;
    }
}
