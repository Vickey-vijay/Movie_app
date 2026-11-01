package com.ironsource;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class T6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static T6 f27680a = new T6();

    public static T6 a() {
        return f27680a;
    }

    public static HashMap<String, Object> a(ConcurrentHashMap<String, Object> concurrentHashMap) throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                map.put(entry.getKey(), a((JSONObject) entry.getValue()));
            } else if (entry.getValue() instanceof JSONArray) {
                map.put(entry.getKey(), a((JSONArray) entry.getValue()));
            } else if (entry.getValue() instanceof Map) {
                map.put(entry.getKey(), a((Map<String, Object>) entry.getValue()));
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof List) {
                    jSONObject.put(next, TextUtils.join(StringUtils.COMMA, (List) objOpt));
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObjectJsonObjectInit.put(next, jSONObject.opt(next));
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONArray a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONArray2.put(jSONArray.opt(i10));
        }
        return jSONArray2;
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, map.get(str));
        }
        return map2;
    }
}
