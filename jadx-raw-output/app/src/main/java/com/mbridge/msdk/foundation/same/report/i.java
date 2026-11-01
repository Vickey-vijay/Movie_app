package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReportControllerDiff.java */
/* JADX INFO: loaded from: classes10.dex */
public class i {
    public static void a(Context context, int i10, int i11, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3426d4.i.W, "2000058");
            jSONObject.put("appid", com.mbridge.msdk.foundation.controller.c.n().b());
            jSONObject.put("dl_type", String.valueOf(i10));
            jSONObject.put("dl_link_type", String.valueOf(i11));
            jSONObject.put(ImpressionLog.f43648x, str);
            jSONObject.put("rid_n", str2);
            jSONObject.put("cid", str3);
            jSONObject.put("tgt_v", m0.w(context));
            jSONObject.put("app_v_n", m0.B(context));
            jSONObject.put("app_v_c", m0.A(context));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("ReportControllerDiff", e10.getMessage());
            }
        }
    }
}
