package com.bytedance.sdk.component.ra.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lh {
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11910le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11911ra;
    public cf yu;
    public final Map<String, String> pno = new HashMap();
    public String bly = null;
    public boolean tlj = false;

    public final void ouw(String str) {
        this.bly = str;
    }

    public final void vt(String str, String str2) {
        this.pno.put(str, str2);
    }

    public final void yu(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.pno.put(entry.getKey(), entry.getValue());
        }
    }

    public final String fkw() {
        return this.bly;
    }

    public void lh() {
        cf cfVar;
        if (this.fkw == null || (cfVar = this.yu) == null) {
            return;
        }
        com.bytedance.sdk.component.vt.ouw.yu yuVarOuw = cfVar.ouw();
        synchronized (yuVarOuw) {
            for (com.bytedance.sdk.component.vt.ouw.vt vtVar : yuVarOuw.yu()) {
                if (this.fkw.equals(vtVar.ouw().ouw())) {
                    vtVar.lh();
                }
            }
            for (com.bytedance.sdk.component.vt.ouw.vt vtVar2 : yuVarOuw.fkw()) {
                if (this.fkw.equals(vtVar2.ouw().ouw())) {
                    vtVar2.lh();
                }
            }
        }
    }

    public final void ouw(ryl.ouw ouwVar) {
        if (this.pno.size() > 0) {
            for (Map.Entry<String, String> entry : this.pno.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    ouwVar.ouw(key, value);
                }
            }
        }
    }

    public final void vt(String str) {
        this.fkw = str;
    }

    public lh(cf cfVar) {
        this.fkw = null;
        this.yu = cfVar;
        try {
            this.fkw = UUID.randomUUID().toString();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.ra.lh.lh.ouw("NetExecutor", th2.getMessage());
        }
    }

    public final String yu() {
        return this.fkw;
    }
}
