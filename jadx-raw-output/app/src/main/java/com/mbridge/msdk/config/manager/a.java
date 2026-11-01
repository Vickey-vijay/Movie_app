package com.mbridge.msdk.config.manager;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.h;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ComponentManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f33993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f33994e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.pipeline.a f33996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33997c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f33995a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    public static a b() {
        if (f33993d == null) {
            synchronized (f33994e) {
                if (f33993d == null) {
                    f33993d = new a();
                }
            }
        }
        return f33993d;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a a() {
        return this.f33995a;
    }

    public boolean c() {
        return this.f33997c;
    }

    public void a(boolean z10) {
        this.f33997c = z10;
    }

    private a() {
    }

    public void a(Object obj) {
        if (obj instanceof String) {
            this.f33996b = new com.mbridge.msdk.config.component.pipeline.a(String.valueOf(obj), this.f33995a);
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        try {
            if (this.f33996b == null) {
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("api_name", str2);
            HashMap map3 = new HashMap();
            map3.put("id", str);
            if (map.containsKey("sdk_context")) {
                map2.put("sdk_context", map.get("sdk_context"));
                map.remove("sdk_context");
            }
            map3.put("api_params", map);
            HashMap map4 = new HashMap();
            map4.put("context_id", str);
            map3.put("metrics", map4);
            map2.put(GAMConfig.KEY_CONTEXT, map3);
            b bVar = new b();
            bVar.a("_");
            bVar.b("APICall");
            bVar.a(map2);
            com.mbridge.msdk.config.component.pipeline.a aVar = this.f33996b;
            if (aVar != null) {
                aVar.a(bVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    public void b(final String str, final String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: z8.a
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.manager.a.a(str2, str);
            }
        });
    }

    public Map<String, Object> a(String str) {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM settingDB WHERE appId = " + str);
        if (mapD != null && !mapD.isEmpty()) {
            Object obj = mapD.get("result");
            if (obj instanceof List) {
                String strValueOf = String.valueOf(((List) obj).get(0));
                if (!TextUtils.isEmpty(strValueOf) && (mapA2 = eVar.a(strValueOf)) != null && !mapA2.isEmpty()) {
                    return mapA2;
                }
            }
        }
        String strE = h.b().e(str);
        if (TextUtils.isEmpty(strE) || (mapA = eVar.a(strE)) == null || mapA.isEmpty()) {
            return null;
        }
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM settingDB WHERE appID = " + str2 + " AND type = 1");
            String strReplaceAll = str.replaceAll("'", "''");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (mapD != null && !mapD.isEmpty()) {
                Object obj = mapD.get("data");
                if ((obj instanceof List) && ((List) obj).size() > 0) {
                    com.mbridge.msdk.config.component.database.a.a().c("UPDATE settingDB SET appID =" + str2 + ", unitID = '',  type = 1, timestamp = " + jCurrentTimeMillis + " , jsonString = '" + strReplaceAll + "' WHERE appID = " + str2);
                    return;
                }
            }
            com.mbridge.msdk.config.component.database.a.a().c("INSERT INTO settingDB (appID, unitID, type, timestamp, jsonString) VALUES (" + str2 + ",'',1," + jCurrentTimeMillis + ",'" + strReplaceAll + "')");
        } catch (Throwable th2) {
            q0.b("ComponentManager", "update component appSetting error: " + th2.getMessage(), th2);
        }
    }
}
