package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class Si {
    public static JSONObject a(String str, String str2, String str3, String str4) throws JSONException {
        ck.p.j(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str3, str4);
        return jSONObject;
    }
}
