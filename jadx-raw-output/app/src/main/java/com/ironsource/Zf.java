package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f28046a = Yf.f27944a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S6 f28047b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f28047b.a(this.f28046a);
        ck.p.i(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    public final JSONObject a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        JSONObject jSONObjectA = this.f28047b.a(context, this.f28046a);
        ck.p.i(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject(Q6.f27472u));
        if (jSONObjectB != null) {
            jSONObject.put(Q6.f27472u, jSONObjectB);
        }
        return jSONObject;
    }
}
