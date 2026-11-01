package com.bytedance.sdk.component.fkw.lh;

import android.content.Context;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ryl;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.fkw.zih;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class le {
    public com.bytedance.sdk.component.fkw.yu fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ryl f11670le;
    private ExecutorService pno;
    public final mwh vt;
    public Map<String, List<lh>> ouw = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Map<String, zih> f11671lh = new HashMap();
    public Map<String, vm> yu = new HashMap();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Map<String, com.bytedance.sdk.component.fkw.lh> f11672ra = new HashMap();

    private com.bytedance.sdk.component.fkw.lh lh(com.bytedance.sdk.component.fkw.vt vtVar) {
        com.bytedance.sdk.component.fkw.lh lhVarRa = this.vt.ra();
        return lhVarRa != null ? lhVarRa : new com.bytedance.sdk.component.fkw.lh.ouw.ouw.vt(vtVar.pno(), vtVar.ouw(), vt());
    }

    public final Collection<com.bytedance.sdk.component.fkw.lh> ouw() {
        return this.f11672ra.values();
    }

    public final com.bytedance.sdk.component.fkw.lh vt(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly();
        }
        String string = vtVar.pno().toString();
        com.bytedance.sdk.component.fkw.lh lhVar = this.f11672ra.get(string);
        if (lhVar != null) {
            return lhVar;
        }
        com.bytedance.sdk.component.fkw.lh lhVarLh = lh(vtVar);
        this.f11672ra.put(string, lhVarLh);
        return lhVarLh;
    }

    public final vm ouw(com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar == null) {
            vtVar = com.bytedance.sdk.component.fkw.lh.ouw.ouw.bly();
        }
        String string = vtVar.pno().toString();
        vm vmVarLe = this.yu.get(string);
        if (vmVarLe == null) {
            vmVarLe = this.vt.le();
            if (vmVarLe == null) {
                vmVarLe = new com.bytedance.sdk.component.fkw.lh.ouw.vt.vt(vtVar.vt());
            }
            this.yu.put(string, vmVarLe);
        }
        return vmVarLe;
    }

    public le(Context context, mwh mwhVar) {
        this.vt = mwhVar;
        com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw(context, mwhVar.pno());
    }

    private ExecutorService lh() {
        ExecutorService executorServiceVt = this.vt.vt();
        return executorServiceVt != null ? executorServiceVt : com.bytedance.sdk.component.fkw.ouw.lh.ouw();
    }

    public final ExecutorService vt() {
        ExecutorService executorServiceOuw;
        qbp qbpVarLh = this.vt.lh();
        if (qbpVarLh != null && (executorServiceOuw = qbpVarLh.ouw()) != null) {
            return executorServiceOuw;
        }
        if (this.pno == null) {
            this.pno = lh();
        }
        return this.pno;
    }
}
