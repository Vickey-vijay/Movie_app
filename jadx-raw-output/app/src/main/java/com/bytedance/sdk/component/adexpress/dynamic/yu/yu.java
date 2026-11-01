package com.bytedance.sdk.component.adexpress.dynamic.yu;

import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f11486lh;
    public List<ouw> ouw;
    public String vt;
    public String yu;

    public static class ouw {
        public int ouw;
        public JSONObject vt;
    }

    public static yu ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        yu yuVar = new yu();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    ouw ouwVar = new ouw();
                    ouwVar.ouw = jSONObjectOptJSONObject.optInt("id");
                    ouwVar.vt = PangleVideoBridge.jsonObjectInit(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(ouwVar);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        yuVar.ouw = arrayList;
        yuVar.vt = jSONObject.optString("diff_data");
        yuVar.f11486lh = jSONObject.optString("style_diff");
        yuVar.yu = jSONObject.optString("tag_diff");
        return yuVar;
    }
}
