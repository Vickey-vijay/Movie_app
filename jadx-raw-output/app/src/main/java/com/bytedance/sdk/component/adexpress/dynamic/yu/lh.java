package com.bytedance.sdk.component.adexpress.dynamic.yu;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class lh {
    public HashMap<String, Object> ouw = new HashMap<>();
    public JSONObject vt;

    public final Object ouw(String str) {
        if (this.ouw.containsKey(str)) {
            return this.ouw.get(str);
        }
        return null;
    }

    public lh(JSONObject jSONObject) {
        this.vt = jSONObject;
    }

    public final void ouw(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i10 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i10 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.ouw.put(str + "." + str2 + "." + next + "." + i10 + "." + next2, objOpt2);
                        }
                        i10++;
                    }
                }
            } else {
                this.ouw.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
