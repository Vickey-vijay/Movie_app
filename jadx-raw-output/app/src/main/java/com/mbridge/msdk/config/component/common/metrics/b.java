package com.mbridge.msdk.config.component.common.metrics;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.q0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MetricsUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static Map<String, Object> a(com.mbridge.msdk.config.component.base.b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        Map<String, Object> mapA3;
        Map<String, Object> mapA4;
        Object obj;
        HashMap map = new HashMap();
        try {
            boolean zA = a(bVar.b(), "log_e_source");
            boolean zA2 = a(bVar.b(), "log_e_output");
            boolean zA3 = a(bVar.b(), "log_c_config");
            boolean zA4 = a(bVar.b(), "log_context");
            map.put(C3426d4.i.W, bVar.c());
            if (zA && (mapA4 = a(aVar.b("event"))) != null && (obj = mapA4.get("event_name")) != null) {
                map.put("e_s_name", String.valueOf(obj));
            }
            Map<String, Object> mapA5 = a(bVar.b().get("event"));
            if (zA2 && mapA5 != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : mapA5.entrySet()) {
                    if (entry.getKey().equals("result")) {
                        map.put("result", entry.getValue());
                    } else if (entry.getKey().equals("code")) {
                        map.put("code", entry.getValue());
                    } else if (entry.getKey().equals("reason")) {
                        map.put("reason", entry.getValue());
                    } else {
                        map2.put(entry.getKey(), entry.getValue());
                    }
                }
                map.put("other", map2);
            }
            if (zA3) {
                Map<String, Object> mapA6 = a(bVar.b().get("component_config"));
                Map<String, Object> mapA7 = mapA6 != null ? a(mapA6.get("EventConfig")) : null;
                map.put("execute_c_config", a(mapA6));
                if (mapA7 != null && !mapA7.isEmpty()) {
                    map.put("execute_e_config", mapA7);
                }
            }
            if (zA4 && (mapA2 = a(bVar.b().get(GAMConfig.KEY_CONTEXT))) != null && (mapA3 = a(mapA2.get("metrics"))) != null && !mapA3.isEmpty()) {
                map.putAll(mapA3);
            }
            if (mapA5 != null && mapA5.containsKey("log_data") && (mapA = a(mapA5.get("log_data"))) != null && !mapA.isEmpty()) {
                map.putAll(mapA);
            }
        } catch (Throwable th2) {
            q0.b("MetricsUtil", th2.getMessage());
        }
        return map;
    }

    private static boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return true;
        }
        return String.valueOf(obj).equals("1");
    }

    private static Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
        }
        return null;
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals("pre_action") && !entry.getKey().equals("EventConfig")) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
