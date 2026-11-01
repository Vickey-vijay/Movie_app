package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class pno {
    public List<String> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12799le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<Integer> f12800lh;
    public int ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12801ra;
    public int vt;
    public int yu;

    public final int ouw() {
        int i10 = this.f12801ra;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public final JSONObject vt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.ouw);
            jSONObject.put("interceptor_y", this.vt);
            if (this.f12800lh != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.f12800lh.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.yu);
            if (this.fkw != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.fkw.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.f12799le);
            jSONObject.put("boc_index", this.f12801ra);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
        }
        return jSONObject;
    }
}
