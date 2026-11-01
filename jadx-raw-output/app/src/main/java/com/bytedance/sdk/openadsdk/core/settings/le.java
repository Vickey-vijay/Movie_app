package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class le {
    public static final le ouw = new le(null);
    public static String vt = "";
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f13061le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13062lh;
    public boolean yu;

    public le(String str) {
        this.f13062lh = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.yu = true;
        this.fkw = true;
        this.f13061le = true;
        try {
            JSONObject jSONObjectOptJSONObject = PangleVideoBridge.jsonObjectInit(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.f13062lh = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
            this.yu = arrayList.contains("load_finish");
            this.f13061le = arrayList.contains("load_fail");
            this.fkw = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
