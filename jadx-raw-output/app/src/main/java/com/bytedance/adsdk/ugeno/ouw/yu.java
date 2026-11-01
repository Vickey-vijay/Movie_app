package com.bytedance.adsdk.ugeno.ouw;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class yu {
    public static List<lh> ouw(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(ouw(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static lh.ouw vt(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOuw;
        if (TextUtils.isEmpty(str) || (jSONArrayOuw = com.bytedance.adsdk.ugeno.ra.vt.ouw(str, (JSONArray) null)) == null || jSONArrayOuw.length() != 2) {
            return null;
        }
        lh.ouw ouwVar = new lh.ouw();
        ouwVar.ouw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONArrayOuw.optString(0), jSONObject);
        ouwVar.vt = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONArrayOuw.optString(1), jSONObject);
        return ouwVar;
    }

    public static lh ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        lh lhVar = new lh();
        lhVar.fkw = com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("delay"), jSONObject2));
        lhVar.pno = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("name"), jSONObject2);
        lhVar.bly = com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("playState"), jSONObject2), 1);
        lhVar.vt = Math.max(com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("duration"), jSONObject2)), 0L);
        lhVar.f10908lh = com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("playCount"), jSONObject2), 1);
        lhVar.yu = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("playDirection"), jSONObject2);
        lhVar.f10907le = vt(jSONObject.optString("transformOrigin"), jSONObject2);
        lhVar.f10909ra = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("timingFunction", "linear"), jSONObject2);
        lhVar.tlj = jSONObject.optJSONObject("effect");
        lhVar.ouw = ouw(jSONObject.optJSONArray("keyframes"), jSONObject2);
        return lhVar;
    }

    private static Map<String, TreeMap<Float, String>> ouw(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(TypedValues.CycleType.S_WAVE_OFFSET);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, TypedValues.CycleType.S_WAVE_OFFSET)) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static float[] ouw(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayOuw = com.bytedance.adsdk.ugeno.ra.vt.ouw(str, (JSONArray) null);
        if (jSONArrayOuw != null && jSONArrayOuw.length() == 2) {
            fArr[0] = (float) jSONArrayOuw.optDouble(0);
            fArr[1] = (float) jSONArrayOuw.optDouble(1);
        }
        return fArr;
    }

    public static int ouw(String str, int i10) {
        int i11 = i10 / 2;
        if (TextUtils.isEmpty(str)) {
            return i11;
        }
        str.hashCode();
        switch (str) {
            case "bottom":
            case "right":
                return i10;
            case "center":
                return i11;
            case "top":
            case "left":
                return 0;
            default:
                if (str.endsWith("%")) {
                    try {
                        return (int) ((i10 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                    } catch (NumberFormatException unused) {
                        return i11;
                    }
                }
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    return i11;
                }
        }
    }
}
