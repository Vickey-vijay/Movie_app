package com.safedk.android.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static Map<String, String> a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = a((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            map.put(next, (String) objA);
        }
        return map;
    }

    public static List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 < jSONArray.length()) {
                Object objA = jSONArray.get(i11);
                if (objA instanceof JSONArray) {
                    objA = a((JSONArray) objA);
                } else if (objA instanceof JSONObject) {
                    objA = a((JSONObject) objA);
                }
                arrayList.add(objA);
                i10 = i11 + 1;
            } else {
                return arrayList;
            }
        }
    }
}
