package com.bytedance.sdk.openadsdk.core.cf.lh;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.model.rn;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes9.dex */
public final class vt {
    private final boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private vpp f12632lh;
    public lh ouw;
    private Context vt;
    private com.bytedance.sdk.openadsdk.core.cf.lh.ouw yu;

    public vt(Context context, vpp vppVar) {
        this(context, vppVar, false);
    }

    public final void ouw(ko koVar) {
        lh lhVarOuw = ouw.ouw(this.vt, this.f12632lh, this.fkw);
        this.ouw = lhVarOuw;
        if (lhVarOuw != null) {
            lhVarOuw.ouw();
            this.ouw.ouw(koVar);
        }
    }

    public static class ouw {
        public static lh ouw(Context context, vpp vppVar, boolean z10) {
            if (rn.ouw(vppVar, z10)) {
                return new yu(context, vppVar, z10);
            }
            return null;
        }
    }

    public vt(Context context, vpp vppVar, boolean z10) {
        this.vt = context;
        this.f12632lh = vppVar;
        this.fkw = z10;
    }

    public final void lh() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.lh();
        }
    }

    public final View vt() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            return lhVar.yu();
        }
        return null;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.cf.lh.ouw ouwVar) {
        this.yu = ouwVar;
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.ouw(ouwVar);
        }
    }

    public final void ouw() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.vt();
        }
    }
}
