package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.impl.A2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ModelCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f33471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f33472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33474l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f33475m;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> mapD;
            String strValueOf = String.valueOf(ModelCpt.this.f33475m);
            if (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) {
                mapD = com.mbridge.msdk.config.component.database.a.a().d(strValueOf);
            } else {
                mapD = (strValueOf.startsWith("DELETE") || strValueOf.startsWith("delete")) ? com.mbridge.msdk.config.component.database.a.a().a(strValueOf) : com.mbridge.msdk.config.component.database.a.a().c(strValueOf);
            }
            Object obj = mapD.get("code");
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.a(true, "", mapD.get("data"));
            } else {
                ModelCpt.this.a(false, String.valueOf(mapD.get("reason")), (Object) null);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f33472j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.config.component.common.util.b.a(c.n().d()).b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.f33475m)) {
            return;
        }
        a aVar = new a();
        if (this.f33474l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    private void h() {
        Map<String, Object> map = this.f33471i;
        if (map == null || this.f32955d == null || this.f33472j == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(C3426d4.j.D);
        if (TextUtils.isEmpty(str)) {
            a(false, "Scope name is empty", (Object) null);
            return;
        }
        Iterator<Map.Entry<String, Object>> it = this.f33472j.entrySet().iterator();
        String str2 = "";
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    a(z10, str2, (Object) null);
                    return;
                }
                Map.Entry<String, Object> next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getKey()) && !C3426d4.j.D.equals(next.getKey())) {
                    try {
                        String key = next.getKey();
                        String str3 = str + "." + key;
                        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = com.mbridge.msdk.config.global.a.a(this.f32955d, str3);
                        if (aVarA != null) {
                            if (aVarA.a(str3, key, next.getValue()).intValue() != 1) {
                                break;
                            } else {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception e10) {
                        str2 = "Failed to modify data in scope: " + e10.getMessage();
                        q0.b("ModelModifierComponent", str2);
                    }
                }
            }
        }
    }

    private void i() {
        Map<String, Object> map;
        if (this.f33471i == null || this.f32955d == null || (map = this.f33472j) == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z10 = this.f32955d.a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z10) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e10) {
                        str = "Failed to modify data without scope: " + e10.getMessage();
                        q0.b("ModelModifierComponent", str);
                    }
                }
            }
            a(z10, str, (Object) null);
            return;
        }
    }

    private void j() {
        b bVar = new b();
        if (this.f33474l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "914001";
        this.f33471i = map;
        if (map.isEmpty()) {
            q0.b("ModelModifierComponent", "Config parameters is null");
            return;
        }
        this.f33470h = map.containsKey(C3426d4.j.D) ? "withScope" : "withoutScope";
        Object obj = map.get("modifier_config");
        if (obj instanceof Map) {
            this.f33472j = (Map) obj;
        }
        Object obj2 = map.get("type");
        if (obj2 != null) {
            this.f33473k = String.valueOf(obj2);
        }
        Object obj3 = map.get(A2.f54950g);
        if (obj3 != null) {
            this.f33474l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get("expression");
        if (obj4 != null) {
            this.f33475m = String.valueOf(obj4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put("result", Integer.valueOf(z10 ? 1 : 2));
        map.put("code", "");
        map.put("reason", str);
        if (obj != null) {
            map.put("data", obj);
        }
        a(a("914002", map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            if ("db".equals(this.f33473k)) {
                g();
            } else if ("user_default".equals(this.f33473k)) {
                j();
            } else if (this.f33470h.equals("withScope")) {
                h();
            } else {
                i();
            }
        } catch (Exception e10) {
            q0.b("ModelModifierComponent", "Error during execution: " + e10.getMessage());
            a(false, "Execution failed: " + e10.getMessage(), (Object) null);
        }
    }
}
