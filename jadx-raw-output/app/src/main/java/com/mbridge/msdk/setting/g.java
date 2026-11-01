package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.ironsource.Ne;
import com.ironsource.T1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: Setting.java */
/* JADX INFO: loaded from: classes11.dex */
public class g extends b {
    public String M0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", k());
            jSONObject.put("cfc", m());
            jSONObject.put("cfb", C0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, a0());
            jSONObject.put("awct", i());
            jSONObject.put("rurl", J0());
            jSONObject.put("ujds", K0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, b0());
            jSONObject.put("tcto", p0());
            jSONObject.put("mv_wildcard", P());
            jSONObject.put("is_startup_crashsystem", E());
            jSONObject.put("sfct", m0());
            jSONObject.put("pcrn", W());
            jSONObject.put("adct", e());
            jSONObject.put("atrqt", h());
            jSONObject.put("omsdkjs_url", U());
            jSONObject.put("mcs", N());
            jSONObject.put("GDPR_area", F0());
            jSONObject.put("alrbs", f());
            jSONObject.put(T1.f27640b, t());
            jSONObject.put(Ne.f27137h1, D());
            jSONObject.put("st_net", o0());
            jSONObject.put("vtag", w0());
            return jSONObject.toString();
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("Setting", "toJSON", th2);
            }
            return null;
        }
    }

    public static g C(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.b(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("Setting", "parseSetting", e10);
            }
            return null;
        }
    }
}
