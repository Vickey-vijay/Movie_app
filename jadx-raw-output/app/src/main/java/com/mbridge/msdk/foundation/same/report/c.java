package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: EventLibraryCommon.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35083a = "c";

    /* JADX INFO: compiled from: EventLibraryCommon.java */
    public class a implements com.mbridge.msdk.tracker.h {
        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI == null) {
                jSONObjectI = new JSONObject();
            }
            try {
                jSONObjectI.put(C3426d4.i.W, eVar.g());
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                int iS = m0.s(contextD);
                if (!jSONObjectI.has("network_type")) {
                    jSONObjectI.put("network_type", iS);
                    jSONObjectI.put("network_str", m0.a(contextD, iS));
                }
                if (!jSONObjectI.has("st")) {
                    jSONObjectI.put("st", System.currentTimeMillis());
                }
                String strOptString = jSONObjectI.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f34556r.get(strOptString);
                    jSONObjectI.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !jSONObjectI.has("b")) {
                    jSONObjectI.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f34897g) && !jSONObjectI.has("c")) {
                    jSONObjectI.put("c", com.mbridge.msdk.foundation.same.a.f34897g);
                }
            } catch (Exception e10) {
                q0.b(c.f35083a, e10.getMessage());
            }
            return jSONObjectI;
        }
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            return true;
        }
        return b.a(gVarD, str);
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove(Q6.f27422d0);
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove(CommonUrlParts.OS_VERSION);
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.f35059d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.f35060e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(Q6.V0);
        jSONObject.remove("gaid2");
        jSONObject.remove(CommonUrlParts.HUAWEI_OAID);
        jSONObject.remove("az_aid_info");
    }
}
