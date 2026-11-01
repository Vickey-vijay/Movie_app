package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.vungle.ads.internal.signals.SignalManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingRequestController.java */
/* JADX INFO: loaded from: classes9.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36908a = "j";

    /* JADX INFO: compiled from: SettingRequestController.java */
    public class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                g0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e10) {
                q0.b(j.f36908a, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: SettingRequestController.java */
    public class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f36911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36912d;

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                j.this.a(1, 0, "");
            } catch (Throwable th2) {
                q0.b(j.f36908a, th2.getMessage());
            }
            try {
                if (v0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strE = h.b().e(this.f36910b);
                        if (!TextUtils.isEmpty(strE)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strE), jSONObject);
                            } catch (Exception e10) {
                                q0.b(j.f36908a, e10.getMessage());
                            }
                        }
                    }
                    k.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f35038i);
                    }
                    h.b().h(this.f36910b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    k.a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.f36911c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e11) {
                        q0.b(j.f36908a, e11.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        com.mbridge.msdk.setting.util.b.c().a(this.f36911c, jSONObject.optString("web_env_url"));
                    }
                    j.this.a(this.f36911c, this.f36910b);
                } else {
                    h.b().h(this.f36910b);
                }
                j.this.c();
            } catch (Exception e12) {
                q0.b(j.f36908a, e12.getMessage());
            }
        }

        public b(String str, Context context, String str2) {
            this.f36910b = str;
            this.f36911c = context;
            this.f36912d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                j.this.a(2, 0, str);
            } catch (Throwable th2) {
                q0.b(j.f36908a, th2.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f35051v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f35052w++;
            }
            j.this.a(this.f36911c, this.f36910b, this.f36912d);
            j.this.c();
            q0.b(j.f36908a, "get app setting error" + str);
        }
    }

    /* JADX INFO: compiled from: SettingRequestController.java */
    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f36914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36916d;

        public c(Context context, String str, String str2) {
            this.f36914b = context;
            this.f36915c = str;
            this.f36916d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r = false;
            q0.a(j.f36908a, "fetch CNDSettingHost failed, errorCode = " + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            q0.a(j.f36908a, "fetch CNDSettingHost success, content = " + str);
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
                for (String str2 : str.split("\n")) {
                    if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f35050u.contains(str2.trim())) {
                        com.mbridge.msdk.foundation.same.net.utils.d.h().f35050u.add(str2.trim());
                        com.mbridge.msdk.foundation.same.net.utils.d.h().f35053x.add(str2.trim());
                    }
                }
                j.this.a(this.f36914b, this.f36915c, this.f36916d);
            }
        }
    }

    /* JADX INFO: compiled from: SettingRequestController.java */
    public class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36919c;

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString(ImpressionLog.f43648x, "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = h.b().f(this.f36918b, this.f36919c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = h.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put(ImpressionLog.f43648x, strOptString2);
                        h.b().a(this.f36918b, this.f36919c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    h.b().j(this.f36918b, this.f36919c);
                }
                j.this.a(1, 1, "");
            } catch (Exception e11) {
                q0.b(j.f36908a, e11.getMessage());
            }
        }

        public d(String str, String str2) {
            this.f36918b = str;
            this.f36919c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            j.this.a(2, 1, "");
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s || !com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r || com.mbridge.msdk.foundation.same.net.utils.d.h().f35052w >= com.mbridge.msdk.foundation.same.net.utils.d.h().f35053x.size()) {
                return str;
            }
            String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().f35053x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f35052w);
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            if (!str2.startsWith("http") && !str2.startsWith("https")) {
                return str;
            }
            return str2 + "/setting";
        } catch (Throwable th2) {
            q0.b(f36908a, th2.getMessage());
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th2) {
            q0.b(f36908a, th2.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f35050u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f35050u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f35053x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().f35028c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", 60000L);
        } catch (Throwable th2) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r = false;
            q0.b(f36908a, th2.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            g gVarB = h.b().b(str);
            String strW0 = gVarB.w0();
            if (TextUtils.isEmpty(strW0)) {
                strW0 = "";
            }
            eVar.a("vtag", strW0);
            eVar.a("current_pipeline_id", String.valueOf(gVarB.Z()));
        } catch (Throwable th2) {
            q0.b(f36908a, th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().f35049t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s && com.mbridge.msdk.foundation.same.net.utils.d.h().f35047r && com.mbridge.msdk.foundation.same.net.utils.d.h().f35052w < com.mbridge.msdk.foundation.same.net.utils.d.h().f35053x.size()) {
                String str5 = com.mbridge.msdk.foundation.same.net.utils.d.h().f35053x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f35052w);
                if (!TextUtils.isEmpty(str5) && (str5.startsWith("http") || str5.startsWith("https"))) {
                    str4 = str5 + "/setting";
                }
            }
        } catch (Throwable th3) {
            q0.b(f36908a, th3.getMessage());
        }
        cVar.get(1, str4, eVar, dVar, "setting", 60000L);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, str, str2, "0", new b(str, context, str2));
        a(3, 0, "");
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (h.b().g(str3, str) && h.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = C3426d4.j.f28586d + str3 + C3426d4.j.f28588e;
            eVar.a("unit_ids", str4);
            eVar.a("app_id", str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String strJ = h.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th2) {
                q0.b(f36908a, th2.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", 60000L);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarD;
        h hVarB = h.b();
        if (hVarB != null && (gVarD = hVarB.d(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
            MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String strB;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C3426d4.i.W, "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().f35049t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            if (i11 == 0) {
                strB = b();
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().f35048s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            q0.b(f36908a, th2.getMessage());
        }
    }
}
