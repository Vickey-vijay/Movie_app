package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vm {
    public static void ouw(Context context, boolean z10, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, int i10, WebView webView, com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        Activity activityOuw;
        boolean zOuw;
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString("title", "");
        boolean z11 = false;
        boolean z12 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        Context contextOuw = null;
        if (iOptInt == 0) {
            if (webView != null) {
                PangleNetworkBridge.webviewLoadUrl(webView, strOptString);
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar = new com.bytedance.sdk.openadsdk.rn.ouw.vt();
            vtVar.ouw = com.bytedance.sdk.openadsdk.yu.vt.ouw.vt;
            vtVar.vt = vppVar;
            vtVar.f13318lh = str;
            vtVar.yu = -1;
            vtVar.fkw = false;
            vtVar.f13319ra = vppVar.f12868pd;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVar);
            com.bytedance.sdk.openadsdk.utils.vpp.ouw(context, strOptString, vppVar, com.bytedance.sdk.openadsdk.yu.vt.ouw.vt);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    th thVar = new th(vppVar);
                    thVar.ouw = strOptString3;
                    thVar.vt = z12;
                    uoy.ouw(context, strOptString, vppVar, i10, str, thVar);
                }
                if (fkwVar == null && z11) {
                    fkwVar.ouw();
                    return;
                }
            }
            if (!(context instanceof Activity) ? (activityOuw = ko.ouw.ouw.ouw.ouw()) == null || !com.bytedance.sdk.openadsdk.utils.vpp.ouw(activityOuw) : com.bytedance.sdk.openadsdk.utils.vpp.ouw((Activity) context)) {
                contextOuw = activityOuw;
                contextOuw = context;
            }
            if (contextOuw == null) {
                contextOuw = zih.ouw();
            }
            if (contextOuw != null && (!TextUtils.isEmpty(strOptString))) {
                new Intent("android.intent.action.VIEW").setData(Uri.parse(strOptString));
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.utils.uoy.vt(vppVar);
                zOuw = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.ouw.ouw(contextOuw, strOptString, vppVar, map);
            } else {
                zOuw = false;
            }
            if (!zOuw) {
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar2 = new com.bytedance.sdk.openadsdk.rn.ouw.vt();
                vtVar2.ouw = com.bytedance.sdk.openadsdk.yu.vt.ouw.vt;
                vtVar2.vt = vppVar;
                vtVar2.f13318lh = str;
                vtVar2.yu = -1;
                vtVar2.fkw = false;
                vtVar2.f13319ra = vppVar.f12868pd;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVar2);
                HashMap map2 = new HashMap();
                map2.put("deeplink_url", strOptString);
                map2.put("fallback_url", strOptString2);
                map2.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, "open_fallback_url", map2);
                com.bytedance.sdk.openadsdk.utils.vpp.ouw(context, strOptString2, vppVar, com.bytedance.sdk.openadsdk.yu.vt.ouw.vt);
            }
        }
        z11 = true;
        if (fkwVar == null) {
        }
    }
}
