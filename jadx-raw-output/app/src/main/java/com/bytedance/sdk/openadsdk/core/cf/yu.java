package com.bytedance.sdk.openadsdk.core.cf;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class yu {
    private static String ouw = "";

    public static String ouw() {
        return ouw;
    }

    public static boolean ouw(int i10) {
        return i10 == 10 || i10 == 9;
    }

    public static boolean vt(vpp vppVar) {
        return vppVar != null && vppVar.kfa == 10;
    }

    private static JSONArray lh(vpp vppVar) {
        try {
            vpp.ouw ouwVar = vppVar.f12886xn;
            if (ouwVar == null) {
                return null;
            }
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(ouwVar.f12892ra);
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("original_price", Double.valueOf(jSONObjectJsonObjectInit.optDouble("original_price", 0.0d)));
            jSONObject.putOpt("price_unit", jSONObjectJsonObjectInit.optString("price_unit"));
            jSONObject.putOpt("discount", Double.valueOf(jSONObjectJsonObjectInit.optDouble("discount", 0.0d)));
            jSONObject.putOpt("product_name", jSONObjectJsonObjectInit.optString("dpa_product_name"));
            jSONObject.putOpt(UnifiedMediationParams.KEY_DESCRIPTION, jSONObjectJsonObjectInit.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject.putOpt("brand_name", jSONObjectJsonObjectInit.optString("dpa_brand_name"));
            jSONObject.putOpt("sale_price_i18n", Integer.valueOf(jSONObjectJsonObjectInit.optInt("sale_price_i18n")));
            jSONObject.putOpt("real_price", Double.valueOf(jSONObjectJsonObjectInit.optDouble("real_price", 0.0d)));
            jSONObject.put("button_text", vppVar.vpp());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObjectJsonObjectInit.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject);
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject2.put("button_text", vppVar.vpp());
                        jSONArray.put(jSONObject2);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static JSONObject ouw(vpp vppVar, com.bytedance.sdk.openadsdk.core.cf.ra.lh lhVar) {
        JSONObject jSONObjectJsonObjectInit;
        lhVar.ouw("ad");
        String strOuw = "";
        ouw = "";
        JSONObject jSONObject = null;
        try {
            vpp.ouw ouwVar = vppVar.f12886xn;
            if (ouwVar != null) {
                strOuw = ouwVar.f12889jg;
                if (TextUtils.isEmpty(strOuw) && !TextUtils.isEmpty(ouwVar.mwh) && !TextUtils.isEmpty(ouwVar.ouw)) {
                    strOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw("ad", ouwVar.ouw, ouwVar.mwh);
                }
            }
            if (TextUtils.isEmpty(strOuw)) {
                String str = "local data is null id is " + ouwVar.ouw + " md5 is " + ouwVar.mwh;
                ouw = str;
                lhVar.ouw(3, str, "net");
                return null;
            }
            try {
                jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strOuw);
                try {
                    try {
                        ouw = "getTemplate success";
                        lhVar.vt("local");
                        return jSONObjectJsonObjectInit;
                    } catch (JSONException unused) {
                        String strConcat = "parse json exception data is ".concat(String.valueOf(strOuw));
                        ouw = strConcat;
                        lhVar.ouw(2, strConcat, "local");
                        return null;
                    }
                } catch (Throwable th2) {
                    jSONObject = jSONObjectJsonObjectInit;
                    th = th2;
                    String str2 = "get template error " + th.getMessage();
                    ouw = str2;
                    lhVar.ouw(2, str2, "local");
                    return jSONObject;
                }
            } catch (JSONException unused2) {
                jSONObjectJsonObjectInit = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static JSONObject ouw(vpp vppVar, String str) {
        JSONObject jSONObjectOuw = vppVar.ouw(true);
        try {
            jSONObjectOuw.put("show_dislike", vppVar.ksc());
            jSONObjectOuw.put("language", ryl.vt());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strPno = bly.ouw().pno();
                int iBly = bly.ouw().bly();
                jSONObject.put("app_name", strPno);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iBly)));
                jSONObjectOuw.put("open_app_info", jSONObject);
            }
            jSONObjectOuw.put(Q6.F, C3426d4.f28386d);
            JSONArray jSONArrayLh = lh(vppVar);
            if (jSONArrayLh != null) {
                jSONObjectOuw.put("dpa_data", jSONArrayLh);
            }
        } catch (Throwable th2) {
            qbp.yu("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
        }
        return jSONObjectOuw;
    }

    public static boolean ouw(vpp vppVar) {
        return vppVar != null && vppVar.kfa == 7;
    }
}
