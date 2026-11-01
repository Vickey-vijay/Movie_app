package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
class C3557ka extends AbstractC3439e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29352i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f29353j = "super.dwh.mediation_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f29354k = G5.Q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f29355l = "data";

    @Override // com.ironsource.AbstractC3439e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC3439e
    public String c() {
        return K5.f26926a;
    }

    public C3557ka(int i10) {
        this.f28716g = i10;
    }

    @Override // com.ironsource.AbstractC3439e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (jSONObject == null) {
            this.f28715f = IronSourceVideoBridge.jsonObjectInit();
        } else {
            this.f28715f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObjectJsonObjectInit.put(G5.Q, "super.dwh.mediation_events");
            jSONObjectJsonObjectInit.put("data", a(jSONArray));
            return jSONObjectJsonObjectInit.toString();
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
