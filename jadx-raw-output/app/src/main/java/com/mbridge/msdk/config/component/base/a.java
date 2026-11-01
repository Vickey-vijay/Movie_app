package com.mbridge.msdk.config.component.base;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.events.CrashEvent;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BaseComponent.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<?, ?> f32952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f32953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a f32955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32956e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32958g;

    private Map<String, Object> b(String str) {
        Map<?, ?> map = this.f32952a;
        if (map != null && !map.isEmpty()) {
            Object obj = this.f32952a.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("EventConfig");
                if (obj2 instanceof Map) {
                    Object obj3 = ((Map) obj2).get(str);
                    if (obj3 instanceof Map) {
                        Map<String, Object> map2 = (Map) obj3;
                        if (!map2.isEmpty()) {
                            Map<String, Object> mapA = com.mbridge.msdk.config.component.common.util.c.a(map2, this.f32955d);
                            return !mapA.isEmpty() ? mapA : map2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void d(Map<?, ?> map) {
        Map map2;
        Map map3;
        Map map4;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f32952a == null) {
            this.f32952a = map;
            return;
        }
        try {
            HashMap map5 = new HashMap();
            map5.putAll(map);
            HashMap map6 = new HashMap();
            Map map7 = (Map) map.get("componentConfig");
            if ((map7 instanceof Map) && (map4 = (Map) map7.get("EventConfig")) != null) {
                map6.putAll(map4);
            }
            if ((map.get("EventConfig") instanceof Map) && (map3 = (Map) map.get("EventConfig")) != null) {
                map6.putAll(map3);
            }
            HashMap map8 = new HashMap();
            Map map9 = (Map) this.f32952a.get("componentConfig");
            if ((map9 instanceof Map) && (map2 = (Map) map9.get("EventConfig")) != null) {
                map8.putAll(map2);
            }
            com.mbridge.msdk.config.component.common.util.c.a(map8, map6);
            Object obj = map5.get("componentConfig");
            if (obj instanceof Map) {
                Map map10 = (Map) obj;
                if (!map10.isEmpty()) {
                    map10.put("EventConfig", map8);
                }
            } else {
                HashMap map11 = new HashMap();
                map11.put("EventConfig", map8);
                map5.put("componentConfig", map11);
            }
            this.f32952a = map5;
        } catch (Throwable th2) {
            q0.b("BaseComponent", th2.getMessage(), th2);
        }
    }

    public void a() {
    }

    public void a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (map == null) {
            return;
        }
        this.f32958g = str;
        this.f32955d = aVar;
        d(map);
        b();
        c();
        a();
    }

    public void b(Map<String, Object> map) {
    }

    public void c(Map<String, Object> map) {
    }

    private void c() {
        Map<?, ?> map = this.f32952a;
        if (map == null) {
            q0.b("BaseComponent", "Execute config is null");
            return;
        }
        this.f32954c = String.valueOf(map.get("componentName"));
        Object obj = this.f32952a.get("componentConfig");
        if (!(obj instanceof Map)) {
            q0.b("BaseComponent", "Component config is not instance of Map");
            return;
        }
        Map<String, Object> map2 = (Map) obj;
        b(map2);
        if (map2.containsKey("EventConfig")) {
            Object obj2 = map2.get("EventConfig");
            if (obj2 instanceof Map) {
                c((Map) obj2);
            } else {
                q0.b("BaseComponent", "Component event is not instance of Map");
            }
        }
    }

    public ViewGroup e() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f32955d;
        if (aVar == null) {
            return null;
        }
        Object objB = aVar.b("sdk_context");
        if (!(objB instanceof Map)) {
            return null;
        }
        Object obj = ((Map) objB).get("rootView");
        if (obj instanceof ViewGroup) {
            return (ViewGroup) obj;
        }
        return null;
    }

    public void f() {
        if (this.f32956e) {
            return;
        }
        a(a(this.f32957f, new HashMap()));
        this.f32956e = true;
    }

    public void a(c cVar) {
        this.f32953b = cVar;
    }

    public void a(b bVar) {
        c cVar;
        if (bVar == null) {
            q0.b("BaseComponent", "baseComponentOut cannot be null");
            return;
        }
        bVar.a(this.f32954c);
        bVar.c(this.f32958g);
        String strC = bVar.c();
        if (strC != null && !strC.isEmpty()) {
            HashMap map = new HashMap();
            if (bVar.b() != null) {
                map.putAll(bVar.b());
            }
            Map<String, Object> mapB = b(strC);
            if (mapB != null && !mapB.isEmpty()) {
                map.putAll(mapB);
            }
            bVar.b().clear();
            bVar.b().put("event", map);
            boolean zA = a(mapB, CrashEvent.f44624e);
            boolean zA2 = a(mapB, "report_log");
            Map<?, ?> map2 = this.f32952a;
            if (map2 != null && !map2.isEmpty()) {
                bVar.b().put("component_config", this.f32952a.get("componentConfig"));
            }
            if (this.f32955d != null) {
                bVar.b().put(GAMConfig.KEY_CONTEXT, this.f32955d.b(GAMConfig.KEY_CONTEXT));
                bVar.b().put("sdk_context", this.f32955d.b("sdk_context"));
            }
            if (zA2) {
                b(bVar);
            }
            if (!zA || (cVar = this.f32953b) == null) {
                return;
            }
            cVar.a(bVar);
            return;
        }
        q0.b("BaseComponent", "eventName cannot be null or empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar;
        if (!(this instanceof com.mbridge.msdk.config.component.vc.inter.a) || (aVar = this.f32955d) == null) {
            return;
        }
        Object objB = aVar.b("lifecycleListeners");
        if (objB instanceof List) {
            try {
                List list = (List) objB;
                synchronized (list) {
                    try {
                        list.add((com.mbridge.msdk.config.component.vc.inter.a) this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (ClassCastException unused) {
                q0.b("BaseComponent", "Failed to cast listeners to List<ILifecycleListener>");
            }
        }
    }

    private void b(b bVar) {
        try {
            Map<String, Object> mapA = com.mbridge.msdk.config.component.common.metrics.b.a(bVar, this.f32955d);
            if (mapA.isEmpty()) {
                return;
            }
            com.mbridge.msdk.config.component.common.metrics.a.a().a(mapA);
        } catch (Throwable th2) {
            q0.b("BaseComponent", th2.getMessage());
        }
    }

    public void d() {
        f();
    }

    private boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return false;
        }
        return String.valueOf(obj).equals("1");
    }

    public b a(String str, Map<String, Object> map) {
        b bVar = new b();
        bVar.b(str);
        if (map == null) {
            map = new HashMap<>();
        }
        bVar.a(map);
        return bVar;
    }

    public void a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("code", str2);
        map.put("reason", str3);
        a(a(str, map));
    }
}
