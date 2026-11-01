package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f12792cf;
    public vpp fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ex f12793le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12794lh;
    public String ouw;
    public vpp ryl;
    public zin tlj;
    public int vt;
    public List<vpp> yu = new ArrayList();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public JSONObject f12795ra = new JSONObject();
    public volatile boolean pno = false;

    public final String ouw() {
        vpp vppVarLh = lh();
        return vppVarLh != null ? vppVarLh.ux() : "";
    }

    @Nullable
    public final JSONObject fkw() {
        try {
            JSONObject jSONObject = new JSONObject();
            zin zinVar = this.tlj;
            if (zinVar != null) {
                jSONObject.put("loop_config", zinVar.ouw());
            }
            ex exVar = this.f12793le;
            if (exVar != null) {
                jSONObject.put("multi_ad_config", exVar.vt());
            }
            List<vpp> list = this.yu;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.yu.size(); i10++) {
                    jSONArray.put(this.yu.get(i10).ouw(true));
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.bly);
            jSONObject.put(CommonUrlParts.REQUEST_ID, this.ouw);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw(c.f43762a, "toJsonObj: ", th2);
            return null;
        }
    }

    public final vpp lh() {
        if (this.yu.size() > 0) {
            return this.yu.get(0);
        }
        return null;
    }

    public final boolean vt() {
        List<vpp> list = this.yu;
        return list != null && list.size() > 0;
    }

    public final boolean yu() {
        return this.bly == 1;
    }

    public final void ouw(vpp vppVar) {
        this.yu.add(vppVar);
        if (this.ryl == null) {
            this.ryl = vppVar;
        }
    }

    public static Map<String, vpp> ouw(ouw ouwVar) {
        if (ouwVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (vpp vppVar : ouwVar.yu) {
            if (!TextUtils.isEmpty(vppVar.f12856ki)) {
                map.put(vppVar.f12856ki, vppVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public static ouw ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ouw ouwVar = new ouw();
            ouwVar.tlj = zin.ouw(jSONObject.optJSONObject("loop_config"));
            ouwVar.bly = jSONObject.optInt("multi_ad_style", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    vpp vppVarOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONArrayOptJSONArray.optJSONObject(i10), null, null, ouwVar, i10);
                    if (vppVarOuw != null) {
                        arrayList.add(vppVarOuw);
                    }
                }
                ouwVar.yu = arrayList;
                if (!arrayList.isEmpty()) {
                    ouwVar.ryl = (vpp) arrayList.get(0);
                }
            }
            ouwVar.ouw = jSONObject.optString(CommonUrlParts.REQUEST_ID, "");
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                ouwVar.f12793le = ex.ouw(strOptString);
            }
            return ouwVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw(c.f43762a, "fromJson: ", th2);
            return null;
        }
    }
}
