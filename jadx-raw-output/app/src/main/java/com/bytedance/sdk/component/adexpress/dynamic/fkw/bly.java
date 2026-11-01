package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class bly {
    public static void ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static String vt(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            if (str.indexOf(46) < 0) {
                str = str + ".png";
            }
            return str2 + "static/images/" + str;
        }
        return ouw.ouw(str);
    }

    public static JSONObject ouw(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < 3; i10++) {
            JSONObject jSONObject2 = jSONObjectArr[i10];
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String ouw(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOuw = com.bytedance.sdk.component.adexpress.vt.ouw(str);
        if (jSONObjectOuw == null || (jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String ouw(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOuw = com.bytedance.sdk.component.adexpress.vt.ouw(str);
        if (jSONObjectOuw == null || (jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }
}
