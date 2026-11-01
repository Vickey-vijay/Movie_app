package com.bytedance.sdk.openadsdk.component.reward.ouw;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes11.dex */
public final class pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f12393lh = 1;
    public static int vt = 0;
    public static int yu = 2;
    private final boolean fkw = true;

    @Nullable
    public bly ouw;

    public static com.bytedance.sdk.openadsdk.zin.pno ouw() {
        return null;
    }

    public static com.bytedance.sdk.openadsdk.mwh.fkw vt() {
        return null;
    }

    public final void lh() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.yu();
        }
    }

    public final void ouw(int i10) {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.ouw(i10);
        }
    }

    public final void fkw() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.ouw(Integer.MAX_VALUE);
        }
    }

    public final void le() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.fkw();
        }
    }

    public final void pno() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.lh();
        }
    }

    public final void ra() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.mwh();
        }
    }

    public final void vt(int i10) {
        bly blyVar;
        if (i10 == yu || (blyVar = this.ouw) == null) {
            return;
        }
        blyVar.le();
    }

    public final void yu() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.pno();
        }
    }

    public pno(ouw ouwVar, vpp vppVar) {
        bly blyVar;
        if (od.le(vppVar)) {
            blyVar = new ra(ouwVar);
        } else {
            blyVar = new bly(ouwVar);
        }
        this.ouw = blyVar;
    }

    public final boolean lh(int i10) {
        bly blyVar;
        if (i10 != f12393lh || (blyVar = this.ouw) == null) {
            return false;
        }
        return blyVar.ryl();
    }

    public final void ouw(boolean z10) {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.lh(z10);
        }
    }
}
