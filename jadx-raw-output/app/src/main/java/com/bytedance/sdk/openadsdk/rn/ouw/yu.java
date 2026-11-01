package com.bytedance.sdk.openadsdk.rn.ouw;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.Q6;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class yu<T extends yu> implements lh {
    public String bly;
    public String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13322lh;
    private String mwh;
    public String ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f13323ra;
    public String tlj;
    public String vt;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final String f13320cf = BuildConfig.VERSION_NAME;
    private long ryl = System.currentTimeMillis() / 1000;
    public int yu = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13321le = 0;

    public static yu<yu> vt() {
        return new yu<>();
    }

    @Override // com.bytedance.sdk.openadsdk.rn.ouw.lh
    public final JSONObject ouw() throws JSONException {
        String str = BuildConfig.VERSION_NAME;
        JSONObject jSONObject = new JSONObject();
        try {
            String strYu = "";
            if (TextUtils.isEmpty(BuildConfig.VERSION_NAME)) {
                str = "";
            }
            jSONObject.put("ad_sdk_version", str);
            jSONObject.put("app_version", uoy.bly());
            jSONObject.put("timestamp", this.ryl);
            int iOuw = ksc.ouw(zih.ouw(), 60000L);
            if (iOuw == 1) {
                iOuw = 0;
            } else if (iOuw == 4) {
                iOuw = 1;
            } else if (iOuw == 5) {
                iOuw = 4;
            } else if (iOuw == 6) {
                iOuw = 6;
            }
            jSONObject.put("conn_type", iOuw);
            if (!TextUtils.isEmpty(bly.ouw().yu())) {
                strYu = bly.ouw().yu();
            }
            jSONObject.put("appid", strYu);
            jSONObject.put("device_info", lh());
            if (!TextUtils.isEmpty(this.ouw)) {
                jSONObject.put("type", this.ouw);
            }
            jSONObject.put("error_code", this.f13321le);
            if (!TextUtils.isEmpty(this.f13323ra)) {
                jSONObject.put("error_msg", this.f13323ra);
            }
            if (!TextUtils.isEmpty(this.vt)) {
                jSONObject.put("rit", this.vt);
            }
            if (!TextUtils.isEmpty(this.f13322lh)) {
                jSONObject.put("creative_id", this.f13322lh);
            }
            int i10 = this.yu;
            if (i10 > 0) {
                jSONObject.put("adtype", i10);
            }
            if (!TextUtils.isEmpty(this.fkw)) {
                jSONObject.put("req_id", this.fkw);
            }
            if (!TextUtils.isEmpty(this.pno)) {
                jSONObject.put("extra", this.pno);
            }
            String str2 = this.bly;
            JSONObject jSONObjectJsonObjectInit = null;
            if (TextUtils.isEmpty(str2)) {
                jSONObjectJsonObjectInit = new JSONObject();
            } else {
                try {
                    jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str2);
                } catch (Throwable unused) {
                }
            }
            if (jSONObjectJsonObjectInit != null) {
                jSONObjectJsonObjectInit.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObjectJsonObjectInit.put("pangle_client_unique_id", "pangle-" + this.mwh + "-" + System.currentTimeMillis());
                jSONObject.put("event_extra", jSONObjectJsonObjectInit.toString());
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("event_extra", str2);
            }
            if (!TextUtils.isEmpty(this.tlj)) {
                jSONObject.put("duration", this.tlj);
            }
        } catch (Throwable th2) {
            qbp.lh("LogStatsBase", th2.getMessage());
        }
        return jSONObject;
    }

    private static JSONObject lh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.F, 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", uoy.ra());
            jSONObject.put(Q6.f27422d0, uoy.fkw());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final T vt(String str) {
        this.bly = str;
        return this;
    }

    public yu() {
        try {
            this.mwh = ex.ouw();
        } catch (Throwable unused) {
            this.mwh = "default";
        }
    }

    public final T ouw(String str) {
        this.ouw = str;
        return this;
    }
}
