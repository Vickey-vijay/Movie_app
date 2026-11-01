package com.bytedance.sdk.openadsdk.cf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.le;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw implements lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Map<String, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh> f12196lh = new HashMap();
    private final vpp ouw;
    private final vt vt;

    @Override // com.bytedance.sdk.openadsdk.cf.lh
    public final void ouw() {
        this.f12196lh.clear();
    }

    private vpp ouw(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject == null) {
            return null;
        }
        vpp vppVar = new vpp();
        vppVar.f12868pd = 4;
        vppVar.pv = jSONObject.optString("id");
        vppVar.f12883vh = jSONObject.optString("source");
        le leVar = new le();
        vppVar.wp = leVar;
        leVar.f12779lh = jSONObject.optString("pkg_name");
        vppVar.wp.vt = jSONObject.optString("name");
        vppVar.wp.ouw = jSONObject.optString(DownloadModel.DOWNLOAD_URL);
        if (!TextUtils.isEmpty(str)) {
            vppVar.yhj = str;
        }
        if (this.ouw == null) {
            return vppVar;
        }
        le leVar2 = vppVar.wp;
        String str3 = leVar2 != null ? leVar2.ouw : null;
        if (TextUtils.isEmpty(str3)) {
            return this.ouw;
        }
        le leVar3 = this.ouw.wp;
        if (leVar3 != null && str3.equals(leVar3.ouw)) {
            return this.ouw;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (leVar3 != null) {
            try {
                str2 = leVar3.ouw;
            } catch (JSONException unused) {
            }
        } else {
            str2 = "null";
        }
        jSONObject2.put("lu", str2);
        jSONObject2.put("ju", str3);
        vpp vppVar2 = this.ouw;
        com.bytedance.sdk.openadsdk.core.yu.ouw(vppVar2, uoy.ouw(vppVar2), -5, jSONObject2);
        if (leVar3 != null && str3.contains("play.google.com/store") && !str3.contains("referrer")) {
            vppVar.wp.ouw = leVar3.ouw;
        }
        return vppVar;
    }

    public ouw(vt vtVar, vpp vppVar) {
        this.vt = vtVar;
        this.ouw = vppVar;
    }

    @Override // com.bytedance.sdk.openadsdk.cf.lh
    public final void ouw(Context context, JSONObject jSONObject, String str, int i10) {
        JSONObject jSONObjectOptJSONObject;
        vpp vppVarOuw;
        le leVar;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null || (vppVarOuw = ouw(jSONObjectOptJSONObject, str)) == null || (leVar = vppVarOuw.wp) == null || this.vt == null || this.f12196lh.get(leVar.ouw) != null) {
            return;
        }
        String strVt = uoy.vt(i10);
        if (TextUtils.isEmpty(strVt)) {
            return;
        }
        this.f12196lh.put(vppVarOuw.wp.ouw, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(context, strVt));
    }

    @Override // com.bytedance.sdk.openadsdk.cf.lh
    public final void ouw(Context context, String str) {
        if (context == null || this.ouw == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(context, str).ouw(this.ouw);
    }

    @Override // com.bytedance.sdk.openadsdk.cf.lh
    public final void ouw(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        le leVar;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        vpp vppVarOuw = ouw(jSONObjectOptJSONObject, (String) null);
        if (this.vt == null || vppVarOuw == null || (leVar = vppVarOuw.wp) == null) {
            return;
        }
        String str = leVar.ouw;
        if (this.f12196lh.containsKey(str)) {
            this.f12196lh.remove(str);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObjectOptJSONObject);
                this.vt.vt("app_ad_event", jSONObject2);
            } catch (JSONException e10) {
                qbp.lh("JsAppAdDownloadManager", e10.getMessage());
            }
        }
    }
}
