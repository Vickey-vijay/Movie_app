package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class bly {
    public String ouw;
    public List<String> vt;

    public bly(String str) {
        HashMap<String, Object> mapOuw;
        this.ouw = "";
        this.vt = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            mapOuw = new HashMap<>();
        } else {
            mapOuw = ouw(str);
        }
        try {
            this.ouw = (String) mapOuw.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) mapOuw.get("auto_test_hosts"));
            this.vt = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.vt.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("AutoTestModel", e10.getMessage());
        }
    }

    private static final HashMap<String, Object> ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
