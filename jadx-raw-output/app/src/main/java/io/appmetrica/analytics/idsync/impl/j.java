package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static String a(y yVar) throws JSONException {
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", yVar.f54918a);
        jSONObject.put("url", yVar.f54920c);
        jSONObject.put("responseCode", yVar.f54922e);
        byte[] bArr = yVar.f54923f;
        try {
            strEncodeToString = new String(bArr, lk.c.f63591b);
        } catch (Throwable unused) {
            strEncodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", strEncodeToString);
        Map map = yVar.f54924g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
