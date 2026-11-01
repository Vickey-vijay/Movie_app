package com.bytedance.adsdk.ugeno.yu;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ryl {
    public static le.ouw ouw(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        le.ouw ouwVar = new le.ouw();
        String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, jSONObject);
        if (strOuw.contains("#")) {
            strOuw = strOuw.replace("#", "%23");
        }
        Uri uri = Uri.parse(strOuw);
        if (uri == null) {
            return null;
        }
        ouwVar.ouw = strOuw;
        if (!TextUtils.isEmpty(uri.getScheme())) {
            ouwVar.f11056lh = uri.getScheme();
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        ouwVar.yu = authority;
        ouwVar.vt = ouwVar.f11056lh + "://" + ouwVar.yu;
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.lh.vt.ouw(uri.getQueryParameter(str2), jSONObject));
            }
        }
        ouwVar.fkw = map;
        return ouwVar;
    }
}
