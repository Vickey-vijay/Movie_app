package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lh {
    public String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f12099lh;
    public final Activity ouw;
    public final vpp vt;
    public final vt yu;

    public void bly() {
    }

    public pno cf() {
        return null;
    }

    public boolean fkw() {
        return true;
    }

    public fkw jg() {
        return null;
    }

    public abstract List<vpp> ko();

    public void le() {
    }

    public void lh() {
    }

    public pno mwh() {
        return null;
    }

    public void ouw() {
    }

    public void ouw(float f10) {
    }

    public abstract void ouw(int i10);

    public void ouw(int i10, int i11) {
    }

    public void ouw(Activity activity) {
    }

    public void ouw(Bundle bundle) {
    }

    public void ouw(View view) {
    }

    public void ouw(View view, boolean z10) {
    }

    public void ouw(ouw ouwVar, boolean z10) {
    }

    public void ouw(pno pnoVar) {
    }

    public void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
    }

    public void ouw(pno pnoVar, vt.fkw fkwVar) {
    }

    public void ouw(pno pnoVar, boolean z10) {
    }

    public void ouw(pno pnoVar, boolean z10, boolean z11, boolean z12, int i10) {
    }

    public void ouw(Map<String, Object> map, pno pnoVar) {
    }

    public void ouw(boolean z10) {
    }

    public abstract boolean ouw(pno pnoVar, int i10);

    public abstract int pno();

    public void ra() {
    }

    public void rn() {
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.lh ryl();

    public abstract void th();

    public abstract int tlj();

    public abstract void vm();

    public void vt() {
    }

    public void vt(Activity activity) {
    }

    public abstract void vt(pno pnoVar, int i10);

    public boolean yu() {
        return false;
    }

    public void zih() {
    }

    public lh(Activity activity, vpp vppVar, vt vtVar) {
        String str;
        this.ouw = activity;
        this.vt = vppVar;
        if (vppVar != null) {
            od odVarOuw = od.ouw(vppVar);
            if (odVarOuw == null) {
                str = null;
            } else {
                str = odVarOuw.zih;
            }
            this.f12099lh = str;
        }
        if (activity != null) {
            this.fkw = String.valueOf(activity.hashCode());
        }
        this.yu = vtVar;
    }
}
